package zl2;

/* loaded from: classes3.dex */
public final class q4 {

    /* renamed from: d */
    public static boolean f555469d;

    /* renamed from: a */
    public static final zl2.q4 f555466a = new zl2.q4();

    /* renamed from: b */
    public static final jz5.g f555467b = jz5.h.b(zl2.i4.f555355d);

    /* renamed from: c */
    public static final jz5.g f555468c = jz5.h.b(zl2.h4.f555339d);

    /* renamed from: e */
    public static final java.lang.String f555470e = "https://dldir1v6.qq.com/weixin/checkresupdate/heart_9dad86cce3344f11ba624759a5a73420.png";

    public static final org.json.JSONObject M(java.util.List list) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator it = list.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            r45.qa4 qa4Var = (r45.qa4) it.next();
            jSONObject.put(qa4Var.m75945x2fec8307(0), qa4Var.m75942xfb822ef2(1) - j17);
            j17 = qa4Var.m75942xfb822ef2(1);
        }
        return jSONObject;
    }

    public static /* synthetic */ void N(zl2.q4 q4Var, java.lang.String str, long j17, java.lang.String str2, long j18, java.util.LinkedList linkedList, mn0.k0 k0Var, java.lang.String str3, int i17, java.lang.Object obj) {
        q4Var.L(str, j17, str2, j18, linkedList, k0Var, (i17 & 64) != 0 ? "" : str3);
    }

    public static /* synthetic */ r45.rn1 d(zl2.q4 q4Var, r45.v52 v52Var, java.util.LinkedList linkedList, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            v52Var = null;
        }
        if ((i17 & 2) != 0) {
            linkedList = null;
        }
        return q4Var.c(v52Var, linkedList);
    }

    public static /* synthetic */ void k(zl2.q4 q4Var, android.view.View view, int i17, int i18, long j17, yz5.l lVar, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            j17 = 300;
        }
        long j18 = j17;
        if ((i19 & 16) != 0) {
            lVar = null;
        }
        q4Var.j(view, i17, i18, j18, lVar);
    }

    public static /* synthetic */ java.lang.String r(zl2.q4 q4Var, long j17, java.lang.Boolean bool, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        java.lang.Boolean bool2 = bool;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        boolean z19 = z17;
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        return q4Var.q(j17, bool2, z19, z18);
    }

    public static final java.lang.String s(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.lang.Boolean bool) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559562ae)[(((java.util.Calendar) h0Var.f391656d).get(7) + 5) % 7];
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) android.text.format.DateFormat.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17));
            sb6.append(h0Var2.f391656d);
            return sb6.toString();
        }
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            sb7.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573049dc4, android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17), str));
            sb7.append(h0Var2.f391656d);
            return sb7.toString();
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        sb8.append(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573050dc5, android.text.format.DateFormat.format(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17)));
        sb8.append(h0Var2.f391656d);
        return sb8.toString();
    }

    public static java.lang.String t(zl2.q4 q4Var, r45.h32 noticeInfo, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        boolean z27 = (i18 & 8) != 0 ? true : z18;
        boolean z28 = (i18 & 16) != 0 ? false : z19;
        q4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeInfo, "noticeInfo");
        if (noticeInfo.m75939xb282bd08(20) == 1) {
            return q4Var.v(noticeInfo.m75939xb282bd08(0) * 1000);
        }
        java.lang.String q17 = q4Var.q(noticeInfo.m75939xb282bd08(0) * 1000, java.lang.Boolean.valueOf(z17), z27, z28);
        if (i17 != 0) {
            q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(i17, q17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
        return q17;
    }

    public static final jz5.l u(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, java.lang.String str, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.lang.Boolean bool) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE) ? z17 ? new jz5.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573049dc4, android.text.format.DateFormat.format(str, j17), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559562ae)[(((java.util.Calendar) h0Var.f391656d).get(7) + 5) % 7]), h0Var2.f391656d) : new jz5.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573050dc5, android.text.format.DateFormat.format(str, j17)), h0Var2.f391656d) : new jz5.l(android.text.format.DateFormat.format(str, j17).toString(), h0Var2.f391656d);
    }

    public final long A() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(calendar, "getInstance(...)");
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final int B(int i17) {
        ae2.in inVar = ae2.in.f85221a;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f85312j0).mo141623x754a37bb()).r();
        if (!(((java.lang.Number) r17).intValue() > 0)) {
            r17 = null;
        }
        java.lang.Integer num = (java.lang.Integer) r17;
        if (num == null) {
            return i17;
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return 71;
        }
        if (intValue == 2) {
            return 81;
        }
        if (intValue == 3) {
            return 91;
        }
        if (intValue != 4) {
            return i17;
        }
        return 101;
    }

    public final boolean C(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return item.getFeedObject().getMediaType() == 9;
    }

    public final boolean D(gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        long t17 = ((mm2.c1) buContext.a(mm2.c1.class)).f410311a5 ? gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L);
        ae2.b2 b2Var = ae2.b2.f84994a;
        jz5.g gVar = ae2.b2.N;
        boolean z17 = true;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == -1) {
            z17 = pm0.v.z((int) t17, 1);
        } else if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != 1) {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "flag = " + t17 + " , localConfig = " + ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() + " , result = " + z17);
        return z17;
    }

    public final boolean E() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z65.c.a();
    }

    public final boolean F(boolean z17) {
        long t17 = z17 ? gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L);
        ae2.b2 b2Var = ae2.b2.f84994a;
        jz5.g gVar = ae2.b2.V;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == -1 ? pm0.v.z((int) t17, 64) : ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "[isVipLiveEnable] flag = " + t17 + " , localConfig = " + ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() + " , result = " + z18);
        return z18;
    }

    public final void G(java.lang.String bizUsername, java.lang.String finderUsername, android.content.Context context, long j17, java.lang.String liveId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "#liveJumpToBizContactProfile bizUsername=" + bizUsername + " sessionId=" + j17 + " liveId=" + liveId + " subScene=" + i17);
        if (bizUsername.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", bizUsername);
        intent.putExtra("Contact_Scene", 208);
        intent.putExtra("Contact_Sub_Scene", i17);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("Contact_Finder_Buffer", p52.h.f433549a.b(finderUsername));
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene_Note", liveId);
        intent.putExtra("biz_profile_tab_type", 1);
        intent.putExtra("biz_profile_enter_from_finder", true);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public final void H() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderUtil2", "loadPagLib account is not ready");
            return;
        }
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T0).mo141623x754a37bb()).r()).intValue() != 0) {
            I();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(zl2.k4.f555396d);
    }

    public final void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1279L, 200L, 1L);
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "loadPagLib result:" + com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.g("pag"));
        g0Var.C(1279L, 201L, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(android.content.Context context, boolean z17, yz5.p onModifyEnd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onModifyEnd, "onModifyEnd");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        int i17 = z17 ? 1 : 2;
        zl2.l4 l4Var = new zl2.l4(z17, onModifyEnd);
        hb2.w wVar = hb2.w.f361641e;
        wVar.getClass();
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar == null) {
            return;
        }
        r45.g33 g33Var = new r45.g33();
        g33Var.set(0, java.lang.Integer.valueOf(i17));
        g33Var.set(1, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hb2.w.f361642f, "[modifyWxUserSetting] op_type:" + g33Var.m75939xb282bd08(0) + ", scene:" + g33Var.m75939xb282bd08(1));
        hb2.w0.h(wVar, yVar, g33Var, l4Var, false, false, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(android.content.Context r31, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r32, android.view.View r33) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.q4.K(android.content.Context, com.tencent.mm.protocal.protobuf.FinderObject, android.view.View):boolean");
    }

    public final void L(java.lang.String commentScene, long j17, java.lang.String sessionId, long j18, java.util.LinkedList linkedList, mn0.k0 playStep, java.lang.String extra) {
        boolean z17;
        org.json.JSONObject M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playStep, "playStep");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        java.util.ArrayList b17 = playStep.b();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, (java.lang.String) lVar.f384366d);
            qa4Var.set(1, java.lang.Long.valueOf(((java.lang.Number) lVar.f384367e).longValue()));
            arrayList.add(qa4Var);
        }
        if (linkedList != null && !linkedList.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            M = M(arrayList);
        } else if (arrayList.isEmpty()) {
            M = M(linkedList);
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(linkedList);
            linkedList2.addAll(arrayList);
            kz5.g0.t(linkedList2, zl2.o4.f555446d);
            M = M(linkedList2);
        }
        zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
        long j19 = playStep.f411300d;
        playStep.f411300d = 0L;
        java.lang.String jSONObject = M.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) qaVar).Bk(2, 0L, j19, 0, 0, 0L, 0L, 0L, j18, 0, 0, jSONObject, 0, 0, "", 0, 0, commentScene, extra, "", j17, 0L, sessionId);
    }

    public final int O(java.lang.String rgbaColor) {
        int l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rgbaColor, "rgbaColor");
        try {
            if (rgbaColor.length() != 9) {
                l17 = hc2.l.l(rgbaColor);
            } else {
                char charAt = rgbaColor.charAt(0);
                java.lang.String substring = rgbaColor.substring(1, 3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                java.lang.String substring2 = rgbaColor.substring(3, 5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                java.lang.String substring3 = rgbaColor.substring(5, 7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                java.lang.String substring4 = rgbaColor.substring(7, 9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
                l17 = hc2.l.l(charAt + substring4 + substring + substring2 + substring3);
            }
            return l17;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public final void P(java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        db5.t7.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, content, zl2.p4.f555456a);
    }

    public final void Q() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        db5.t7.i(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epy), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
    }

    public final void R(java.lang.String prefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        boolean c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", prefix + " tryLoadPagLibrary pag start,gpVersion:" + c17 + ",isPagEnable:true");
        if (c17) {
            H();
        } else {
            H();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", prefix.concat(" tryLoadPagLibrary pag end"));
    }

    public final void a(db5.g4 menu) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.util.LinkedList a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.a();
        int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
        java.util.Iterator it = a17.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.of1) obj).m75939xb282bd08(2) == m75939xb282bd08) {
                    break;
                }
            }
        }
        r45.of1 of1Var = (r45.of1) obj;
        java.lang.String m75945x2fec8307 = of1Var != null ? of1Var.m75945x2fec8307(0) : null;
        if (f555469d) {
            menu.w(403, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.npm, m75945x2fec8307), com.p314xaae8f345.mm.R.raw.f80100xa2e3777b);
        } else {
            menu.g(403, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.npm, m75945x2fec8307), com.p314xaae8f345.mm.R.raw.f80100xa2e3777b);
        }
        f555469d = false;
    }

    public final r45.om1 b() {
        r45.om1 om1Var = new r45.om1();
        r45.nm1 nm1Var = new r45.nm1();
        if (com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class) != null) {
            nm1Var.set(0, java.lang.Integer.valueOf(((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37745x9208c81b(2)));
        }
        om1Var.set(0, nm1Var);
        return om1Var;
    }

    public final r45.rn1 c(r45.v52 v52Var, java.util.LinkedList linkedList) {
        int i17;
        r45.rn1 rn1Var = new r45.rn1();
        rn1Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        rn1Var.set(1, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        if (com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class) != null) {
            rn1Var.set(2, java.lang.Integer.valueOf(((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37745x9208c81b(2)));
        }
        rn1Var.set(3, wo.w0.m());
        rn1Var.set(13, android.os.Build.CPU_ABI);
        rn1Var.set(4, android.os.Build.BRAND);
        rn1Var.set(5, android.os.Build.DISPLAY);
        rn1Var.set(6, android.os.Build.VERSION.RELEASE);
        if (v52Var != null) {
            rn1Var.set(7, v52Var);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            rn1Var.set(8, linkedList);
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
        synchronized (cj6.f152584o) {
            i17 = cj6.f152585p;
        }
        boolean z17 = i17 != 0;
        if (!z17 && ((java.lang.Boolean) ((jz5.n) f555467b).mo141623x754a37bb()).booleanValue()) {
            rn1Var.set(9, 1);
        }
        if (!z17 && ((java.lang.Boolean) ((jz5.n) f555468c).mo141623x754a37bb()).booleanValue()) {
            rn1Var.set(10, 1);
        }
        java.util.LinkedList m75941xfb821914 = rn1Var.m75941xfb821914(14);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = cw2.p4.f305449f;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList, 10));
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            r45.sf0 sf0Var = (r45.sf0) it.next();
            cw2.p4 p4Var = cw2.p4.f305444a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sf0Var);
            p4Var.k(sf0Var);
            arrayList.add(sf0Var);
        }
        m75941xfb821914.addAll(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "buildLiveClientStatus: isCodec1Limit=" + z17 + ", cpu_architecture=" + rn1Var.m75945x2fec8307(13) + ", recent_finder_download_speed=" + rn1Var.m75941xfb821914(14).size());
        return rn1Var;
    }

    public final long e(java.util.LinkedList linkedList, mn0.k0 playStep) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playStep, "playStep");
        if (linkedList == null) {
            return 0L;
        }
        long j17 = playStep.f411299c;
        playStep.f411299c = 0L;
        r45.qa4 qa4Var = (r45.qa4) linkedList.getFirst();
        long m75942xfb822ef2 = qa4Var != null ? qa4Var.m75942xfb822ef2(1) : 0L;
        if (1 <= m75942xfb822ef2 && m75942xfb822ef2 < j17) {
            return j17 - m75942xfb822ef2;
        }
        return 0L;
    }

    public final jz5.l f(int i17, float f17, float f18, float f19, float f27) {
        jz5.l lVar;
        if (f18 == 0.0f) {
            return null;
        }
        if (f17 == 0.0f) {
            return null;
        }
        if (f27 == 0.0f) {
            return null;
        }
        if (f19 == 0.0f) {
            return null;
        }
        if (i17 == android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()) {
            if (f27 / f19 < f18 / f17) {
                return new jz5.l(java.lang.Integer.valueOf((int) f17), java.lang.Integer.valueOf((int) ((f27 * f17) / f19)));
            }
            lVar = new jz5.l(java.lang.Integer.valueOf((int) ((f19 * f18) / f27)), java.lang.Integer.valueOf((int) f18));
        } else {
            if (f27 / f19 > f18 / f17) {
                return new jz5.l(java.lang.Integer.valueOf((int) f17), java.lang.Integer.valueOf((int) ((f27 * f17) / f19)));
            }
            lVar = new jz5.l(java.lang.Integer.valueOf((int) ((f19 * f18) / f27)), java.lang.Integer.valueOf((int) f18));
        }
        return lVar;
    }

    public final boolean g() {
        boolean E = E();
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85224a2).mo141623x754a37bb()).r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "canShowVisitorRoleEntrance isTest:" + E + ",configValue:" + intValue);
        if (intValue == 0) {
            return true;
        }
        if (intValue != 1) {
            return false;
        }
        return E;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo h(r45.ce0 ce0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo.f158919f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convertToCustomSubjectInfo page:");
        sb6.append(ce0Var != null ? ce0Var.m75945x2fec8307(2) : null);
        sb6.append(", ");
        sb6.append(ce0Var != null ? ce0Var.m75945x2fec8307(3) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", sb6.toString());
        if (ce0Var != null) {
            java.lang.String m75945x2fec8307 = ce0Var.m75945x2fec8307(2);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                java.lang.String m75945x2fec83072 = ce0Var.m75945x2fec8307(3);
                if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
                    java.lang.String m75945x2fec83073 = ce0Var.m75945x2fec8307(3);
                    if (m75945x2fec83073 == null) {
                        m75945x2fec83073 = "";
                    }
                    java.lang.String m75945x2fec83074 = ce0Var.m75945x2fec8307(2);
                    customSubjectInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo(m75945x2fec83073, m75945x2fec83074 != null ? m75945x2fec83074 : "");
                }
            }
        }
        return customSubjectInfo;
    }

    public final r45.ce0 i(l81.b1 bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bundle.G.F, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo.f158919f)) {
            return null;
        }
        r45.ce0 ce0Var = new r45.ce0();
        ce0Var.set(2, bundle.G.F.f158921e);
        ce0Var.set(3, bundle.G.F.f158920d);
        return ce0Var;
    }

    public final void j(android.view.View view, int i17, int i18, long j17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view.getVisibility() != 0) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        e0Var2.f391648d = e0Var.f391648d;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.setDuration(j17);
        ofInt.addUpdateListener(new zl2.j4(i18, view, e0Var, e0Var2, lVar, i17, i18 - i17));
        ofInt.start();
    }

    public final java.lang.String l(int i17) {
        long j17 = i17;
        long j18 = j17 / 3600;
        if (j18 == 0) {
            java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j17 / 60), java.lang.Long.valueOf(j17 % 60)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            return format;
        }
        java.lang.String format2 = java.lang.String.format("%d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j18), java.lang.Long.valueOf((j17 % 3600) / 60), java.lang.Long.valueOf(j17 % 60)}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        return format2;
    }

    public final java.lang.String m() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.util.UUID.randomUUID());
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        return a17;
    }

    public final java.lang.String n() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.noj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String o(long j17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(j17));
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dan, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String p(java.lang.String str, java.lang.String str2, boolean z17) {
        return ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ri(str, str2, z17);
    }

    public final java.lang.String q(long j17, java.lang.Boolean bool, boolean z17, boolean z18) {
        java.lang.Object p17;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = java.util.Calendar.getInstance();
        java.util.Date date = new java.util.Date(j17);
        ((java.util.Calendar) h0Var.f391656d).setTime(date);
        int i17 = ((java.util.Calendar) h0Var.f391656d).get(6);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Date date2 = new java.util.Date(c01.id.c());
        calendar.setTime(date2);
        int i18 = i17 - calendar.get(6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "[getFinderLiveNoticeTips] dayDiff:" + i18 + ", bookTime:" + date + ", todayTime:" + date2);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (z18) {
            p17 = " " + ((java.lang.Object) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, j17)) + ' ';
        } else {
            p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, j17);
        }
        h0Var2.f391656d = p17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            int i19 = ((java.util.Calendar) h0Var.f391656d).get(1);
            int i27 = ((java.util.Calendar) h0Var.f391656d).get(2) + 1;
            int i28 = ((java.util.Calendar) h0Var.f391656d).get(5);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i19);
            sb6.append('.');
            sb6.append(i27);
            sb6.append('.');
            sb6.append(i28);
            sb6.append(' ');
            sb6.append(h0Var2.f391656d);
            return sb6.toString();
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
            return s(h0Var, z17, j17, h0Var2, bool);
        }
        if (i18 == -1) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi) + h0Var2.f391656d;
        }
        if (i18 == 0) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_) + h0Var2.f391656d;
        }
        if (i18 == 1) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fda) + h0Var2.f391656d;
        }
        if (i18 != 2) {
            return s(h0Var, z17, j17, h0Var2, bool2);
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573048dc3) + h0Var2.f391656d;
    }

    public final java.lang.String v(long j17) {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mq9, android.text.format.DateFormat.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final java.util.HashMap w(java.lang.String jsonString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonString, "jsonString");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonString);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject.get(next);
                java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                if (str == null) {
                    str = "";
                }
                hashMap.put(next, str);
            }
        } catch (org.json.JSONException unused) {
        }
        return hashMap;
    }

    public final int x() {
        if (!E()) {
            return 0;
        }
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85255d3).mo141623x754a37bb()).r()).intValue();
        int i17 = 1;
        if (intValue != 1) {
            i17 = 2;
            if (intValue != 2) {
                return 0;
            }
        }
        return i17;
    }

    public final java.lang.String y(r45.mb4 mediaObj, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        java.util.LinkedList m75941xfb821914 = mediaObj.m75941xfb821914(53);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getLive_cover_imgs(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.lw1) obj).m75939xb282bd08(5) == i17) {
                break;
            }
        }
        r45.lw1 lw1Var = (r45.lw1) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String m75945x2fec8307 = lw1Var != null ? lw1Var.m75945x2fec8307(0) : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        sb6.append(m75945x2fec8307);
        java.lang.String m75945x2fec83072 = lw1Var != null ? lw1Var.m75945x2fec8307(1) : null;
        sb6.append(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        return sb6.toString();
    }

    public final java.lang.String z(int i17) {
        if (i17 >= 10) {
            return java.lang.String.valueOf(i17);
        }
        return "0" + i17;
    }
}
