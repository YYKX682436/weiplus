package vh4;

@j95.b
/* loaded from: classes.dex */
public class t1 extends i95.w implements uh4.c0 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f518671h;

    /* renamed from: d, reason: collision with root package name */
    public int f518667d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f518668e = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public boolean f518669f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f518670g = false;

    /* renamed from: i, reason: collision with root package name */
    public int f518672i = 1;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f518673m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f518674n = new java.util.HashMap();

    public static void Ai(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Intent intent, boolean z17) {
        intent.putExtra("intent_extra_type", i17);
        intent.putExtra("intent_extra_key", str);
        intent.putExtra("intent_extra_title", str2);
        intent.putExtra("intent_extra_digest", str3);
        intent.putExtra("intent_extra_content", str4);
        intent.putExtra("intent_extra_can_auth", z17);
    }

    public static void wi(android.app.Activity activity, int i17, int i18, java.lang.String bizKey, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, uh4.a0 a0Var) {
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18570xe27ff90a.class);
        Ai(i18, bizKey, str, str2, str3, intent, z17);
        jz5.g gVar = vh4.c.f518591a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizKey, "bizKey");
        if (a0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthorizationReqCallbackMgr", "addCallback bizType:" + i18 + " bizKey:" + bizKey);
            ((java.util.Map) ((jz5.n) vh4.c.f518591a).mo141623x754a37bb()).put(i18 + '#' + bizKey, a0Var);
        }
        if (i17 > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean Bi() {
        boolean z17 = false;
        try {
            if (android.provider.Settings.Secure.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "minors_mode", 0) == 1) {
                if (android.provider.Settings.Secure.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "minors_mode_enabled", 0) == 1) {
                    z17 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeService", "getSysTeenMode end");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeService", "Setting not found: " + e17.getMessage());
        }
        return z17;
    }

    @Override // uh4.c0
    public void C5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "disableTeenMode");
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 59;
        p53Var.f464295e = 2;
        if (this.f518671h != null) {
            r45.cu5 cu5Var = new r45.cu5();
            p53Var.f464296f = cu5Var;
            cu5Var.d(this.f518671h.getBytes());
        }
        p53Var.f464297g = this.f518672i;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new xg3.p0(23, p53Var));
        e21.j jVar = new e21.j(linkedList);
        gm0.j1.i();
        jVar.mo807x6c193ac1(gm0.j1.n().f354821b.f152297d, new vh4.f2(this));
        int i17 = uh4.b0.TeenagerModeOperationType_CLOSE.f509511d;
        ((ku5.t0) ku5.t0.f394148d).B(new vh4.RunnableC30653x6797884(this, i17, null));
    }

    public final void Di(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567.class);
        intent.putExtra("intent_extra_bind_guardian_username", str);
        intent.putExtra("intent_extra_bind_ward_username", str2);
        intent.putExtra("intent_extra_bind_ticket", str3);
        intent.putExtra("intent_extra_request_time", j17);
        intent.putExtra("intent_extra_msg_type", i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToBindGuardianUIByOrigin", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToBindGuardianUIByOrigin", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uh4.c0
    public void G5(uh4.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "enableTeenMode");
        int i17 = uh4.b0.TeenagerModeOperationType_OPEN.f509511d;
        ((ku5.t0) ku5.t0.f394148d).B(new vh4.RunnableC30653x6797884(this, i17, eVar));
    }

    @Override // uh4.c0
    public int G8() {
        return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, 2);
    }

    @Override // uh4.c0
    public boolean Ib() {
        return !java.lang.Boolean.valueOf(c01.e2.a0()).booleanValue();
    }

    @Override // uh4.c0
    public void If() {
        if (!mo168058x74219ae7() || !T2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "checkShowOnlyAgeChange skip! not in teenmode");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "checkShowOnlyAgeChange");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_AGE_NEED_NOTICE_STATE_BOOLEAN_SYNC, false)))) {
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "age change checkSysAge");
        xh4.x xVar = xh4.x.f536176a;
        if (xVar.g(context) && T2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "age notice IS_ONLY_SYS_AGE_CHANGE");
            xVar.i(context);
            android.content.Intent addFlags = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165.class).addFlags(268435456);
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6 a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6();
            a6Var.p(true);
            addFlags.putExtra("IntentKey_TeenModeIntroData", a6Var.m126747x696739c());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(addFlags);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "checkSysAge", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "checkSysAge", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // uh4.c0
    public void K4() {
        G5(null);
    }

    @Override // uh4.c0
    public void Kb(uh4.i0 i0Var) {
        if (i0Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) this.f518668e).add(i0Var);
        }
    }

    @Override // uh4.c0
    public void Kf(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18570xe27ff90a.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        Ai(i17, str, str2, str3, str4, intent, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToSendAuthorizationReqUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToSendAuthorizationReqUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean Ni(android.app.Activity activity, int i17, int i18, java.lang.String str, android.content.DialogInterface.OnDismissListener onDismissListener) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            return false;
        }
        new vh4.c1().l().h(new vh4.j2(this, db5.e1.Q(activity, "", "", true, false, null), onDismissListener, activity, i18, str, i17));
        return true;
    }

    @Override // uh4.c0
    public void O8(android.content.Context context) {
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        db5.t7.i(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574874jt2), com.p314xaae8f345.mm.R.raw.f80339xd9eb969c);
    }

    @Override // uh4.c0
    public void Od(android.app.Activity activity, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, uh4.a0 a0Var) {
        wi(activity, i17, i18, str, str2, str3, str4, z17, a0Var);
    }

    @Override // uh4.c0
    public int P3(android.content.Context context) {
        try {
            boolean z17 = true;
            if (android.provider.Settings.Secure.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "minors_mode", 0) != 1) {
                z17 = false;
            }
            if (z17) {
                return android.provider.Settings.Secure.getInt(context.getContentResolver(), "minors_mode_age_range", 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeService", "Setting not found: " + e17.getMessage());
            return 0;
        }
    }

    @Override // uh4.c0
    public void Pc(int i17, uh4.c cVar) {
        ((java.util.HashMap) this.f518673m).put(java.lang.Integer.valueOf(i17), cVar);
    }

    @Override // uh4.c0
    public boolean R1(android.app.Activity activity, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k kVar, android.content.DialogInterface.OnDismissListener onDismissListener) {
        if (i17 == 1) {
            return Ni(activity, 0, i18, str, onDismissListener);
        }
        if (i17 == 2) {
            return u6(activity, i18, str, str2, str3, str4, bArr, kVar);
        }
        return false;
    }

    @Override // uh4.c0
    public boolean Se(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        android.database.Cursor J2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().J(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, false);
        while (true) {
            if (!J2.moveToNext()) {
                z3Var = null;
                break;
            }
            z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(J2);
            if (z3Var.d1().equalsIgnoreCase(str)) {
                break;
            }
        }
        J2.close();
        return z3Var != null;
    }

    @Override // uh4.c0
    public void T(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "report: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20917, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f518667d));
    }

    @Override // uh4.c0
    public boolean T2() {
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_SYSTEM_STATE_BOOLEAN_SYNC, false)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "isSysTeenMode:" + n17);
        return n17;
    }

    @Override // uh4.c0
    public void Uc(android.app.Activity activity, int i17) {
        Ni(activity, i17, 0, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uh4.c0
    public boolean Xd() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_show_wechat_teenmode_entrance, z65.c.a() ? 1 : 0) == 0) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
            if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.toUpperCase().equals("CN")) == false) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, not in china, hide entrance.");
                return true;
            }
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowTeenagerMode");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, ShowTeenagerMode is null");
            return false;
        }
        int parseInt = java.lang.Integer.parseInt(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, val is %s", java.lang.Integer.valueOf(parseInt));
        return d17 != null && 1 == parseInt;
    }

    @Override // uh4.c0
    public boolean Yd() {
        if (mo168058x74219ae7()) {
            return gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_ENABLE_BY_SYS_BOOLEAN_SYNC, false);
        }
        return false;
    }

    @Override // uh4.c0
    public int ag() {
        if (!mo168058x74219ae7()) {
            return 1;
        }
        if (Ib()) {
            return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_EMOTICON_RANGE_INT_SYNC, 0);
        }
        return 2;
    }

    @Override // uh4.c0
    public void b8() {
        java.util.Set set = this.f518668e;
        ((java.util.concurrent.CopyOnWriteArraySet) set).size();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
        while (it.hasNext()) {
            ((uh4.i0) it.next()).mo13777xf050804b();
        }
        fs.g.b(uh4.f0.class, new vh4.i2(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x02cd A[Catch: Exception -> 0x0389, TryCatch #0 {Exception -> 0x0389, blocks: (B:19:0x021b, B:21:0x021f, B:23:0x0227, B:25:0x022d, B:27:0x0235, B:29:0x0262, B:31:0x0284, B:32:0x029e, B:37:0x02cd, B:39:0x0334, B:41:0x02bd, B:43:0x02c3), top: B:18:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0334 A[Catch: Exception -> 0x0389, TRY_LEAVE, TryCatch #0 {Exception -> 0x0389, blocks: (B:19:0x021b, B:21:0x021f, B:23:0x0227, B:25:0x022d, B:27:0x0235, B:29:0x0262, B:31:0x0284, B:32:0x029e, B:37:0x02cd, B:39:0x0334, B:41:0x02bd, B:43:0x02c3), top: B:18:0x021b }] */
    @Override // uh4.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bg(boolean r27) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh4.t1.bg(boolean):void");
    }

    @Override // uh4.c0
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 df() {
        android.database.Cursor J2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().J(1073741824, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = null;
        while (J2.moveToNext()) {
            z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(J2);
        }
        J2.close();
        return z3Var;
    }

    @Override // uh4.c0
    public void ed(android.app.Activity activity, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        wi(activity, 0, i17, str, str2, str3, str4, true, null);
    }

    /* renamed from: getContext */
    public final android.content.Context m172177x76847179() {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        return (k17 == null || k17.get() == null) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : (android.content.Context) k17.get();
    }

    @Override // uh4.c0
    public int h4() {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "getBizAcctOption, option:%s", java.lang.Integer.valueOf(r17));
        return r17;
    }

    @Override // uh4.c0
    public uh4.d ha(int i17) {
        uh4.d dVar = (uh4.d) this.f518674n.get(java.lang.Integer.valueOf(i17));
        if (dVar != null) {
            return dVar;
        }
        uh4.e0[] e0VarArr = {null};
        fs.g.a(uh4.e0.class, java.lang.Integer.valueOf(i17), new vh4.b2(this, e0VarArr));
        uh4.e0 e0Var = e0VarArr[0];
        return e0Var != null ? e0Var : vh4.i.f518615d;
    }

    @Override // uh4.c0
    public void hc(java.lang.String str) {
        java.lang.String str2;
        if (!gm0.j1.a() || c01.e2.a0() || !xh4.x.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "onSysContentChange skip account:" + gm0.j1.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "onSysContentChange skip enableSysTeenModeXLab:" + xh4.x.d());
            return;
        }
        if (str.equals(android.provider.Settings.Secure.getUriFor("minors_mode_enabled").getPath())) {
            boolean Bi = Bi();
            boolean T2 = T2();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "startWatchingMinorsModeState sys teen mode onchange, newState: %s oldState:%s", java.lang.Boolean.valueOf(Bi), java.lang.Boolean.valueOf(T2));
            if (Bi != T2 && Bi != ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                if (Bi && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_NEED_NOTICE_STATE_BOOLEAN_SYNC, false)))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "USERINFO_SETTING_TEEN_MODE_NEED_NOTICE_STATE_BOOLEAN_SYNC set startWatchingMinorsModeState");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0) {
                        this.f518670g = true;
                        ((ku5.t0) ku5.t0.f394148d).B(new vh4.c2(this));
                    }
                } else if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                    bg(false);
                }
            }
            this.f518669f = true;
            if (gm0.j1.a()) {
                str2 = gm0.j1.b().j();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getUinString(...)");
            } else {
                str2 = "default";
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.TeenModeStatusManager_".concat(str2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
            M.putBoolean("MMKVKey_ManuallyClose", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeStatusManager", "resetManuallyClose:false");
        }
    }

    @Override // uh4.c0
    public int hd() {
        return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, 0);
    }

    @Override // uh4.c0
    public void i3(android.content.Context context) {
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).qc(1);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).T(1);
        this.f518671h = null;
        this.f518672i = 1;
        if (mo168058x74219ae7) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).v5(context);
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18579x5b99114c.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "enterTeenModeMainUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "enterTeenModeMainUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uh4.c0
    public java.util.HashMap i8() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jts));
        if (df() != null) {
            hashMap.put(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jqs));
        }
        return hashMap;
    }

    @Override // uh4.c0
    /* renamed from: isTeenMode */
    public boolean mo168058x74219ae7() {
        return gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, false);
    }

    @Override // uh4.c0
    public boolean kf(int i17, java.lang.String str) {
        uh4.g0 y07 = wh4.j.f527545a.a().y0(i17, str, 0L);
        return !ha(i17).b(y07.f77359x2261f6f2, c01.id.a()) && c01.z1.r().equals(y07.f77360xb1cc66b7);
    }

    @Override // uh4.c0
    public void na(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(str);
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        u1Var.l(new vh4.g2(this));
        u1Var.q(false);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: vh4.t1$$b
            @Override // java.lang.Runnable
            public final void run() {
                vh4.t1.this.bg(false);
            }
        }, 1000L);
    }

    @Override // uh4.c0
    public void q3(int i17, uh4.d dVar) {
        this.f518674n.put(java.lang.Integer.valueOf(i17), dVar);
    }

    @Override // uh4.c0
    public void q8(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, boolean z17) {
        if (!z17 || !c01.e2.a0()) {
            Di(context, str, str2, str3, j17, i17);
            return;
        }
        vh4.u1 u1Var = new vh4.u1(this, context, str, str2, str3, j17, i17);
        vh4.v1 v1Var = new vh4.v1(this, context, str, str2, str3, j17, i17);
        r45.x04 x04Var = new r45.x04();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 19502;
        lVar.f152199c = "/cgi-bin/micromsg-bin/isadultage";
        lVar.f152197a = x04Var;
        lVar.f152198b = new r45.y04();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.l().h(new vh4.w1(this, u1Var, v1Var));
    }

    @Override // uh4.c0
    public void qc(int i17) {
        this.f518667d = i17;
    }

    @Override // uh4.c0
    public void rh(android.content.Context context, java.lang.String str, java.lang.String str2, long j17, long j18, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e.class);
        intent.putExtra("intent_extra_msg_content", str3);
        intent.putExtra("intent_extra_cdn_img_path", str4);
        intent.putExtra("intent_extra_guardian_username", str);
        intent.putExtra("intent_extra_ward_username", str2);
        intent.putExtra("intent_extra_request_time", j17);
        intent.putExtra("intent_extra_msg_svrid", j18);
        intent.putExtra("intent_extra_need_anim", bool);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToAuthorizationMsgUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToAuthorizationMsgUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uh4.c0
    public void tc(uh4.i0 i0Var) {
        if (i0Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) this.f518668e).remove(i0Var);
        }
    }

    @Override // uh4.c0
    public boolean u6(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k kVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 df6 = df();
        if (df6 == null) {
            return false;
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        ((c61.l7) b6Var).dl(context, df6.d1(), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqi) + str2, true, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new vh4.y1(this, str2, str3, i17, str, str4, df6, bArr, context, kVar), null);
        return true;
    }

    @Override // uh4.c0
    public void v5(android.content.Context context) {
        if (!(context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
            new vh4.c1().l().h(new vh4.h2(this, db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, false, null), context));
        } else {
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f context2 = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(context2), null, null, new xh4.u(context2, null, null), 3, null);
        }
    }

    @Override // uh4.c0
    public uh4.c xf(int i17) {
        java.util.Map map = this.f518673m;
        uh4.c cVar = (uh4.c) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (cVar != null) {
            return cVar;
        }
        uh4.d0[] d0VarArr = {null};
        fs.g.a(uh4.d0.class, java.lang.Integer.valueOf(i17), new vh4.z1(this, d0VarArr));
        uh4.d0 d0Var = d0VarArr[0];
        if (d0Var != null) {
            return d0Var;
        }
        uh4.c cVar2 = (uh4.c) ((java.util.HashMap) map).get(Integer.MAX_VALUE);
        if (cVar2 != null) {
            return cVar2;
        }
        uh4.d0[] d0VarArr2 = {null};
        fs.g.a(uh4.d0.class, Integer.MAX_VALUE, new vh4.a2(this, d0VarArr2));
        return d0VarArr2[0];
    }
}
