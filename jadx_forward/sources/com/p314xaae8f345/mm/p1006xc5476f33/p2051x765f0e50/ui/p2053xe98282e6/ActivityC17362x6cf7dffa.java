package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI */
/* loaded from: classes11.dex */
public class ActivityC17362x6cf7dffa extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f241597e;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241598d;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576424ar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165  */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        boolean z17;
        java.lang.Class<vg3.x3> cls;
        boolean z18;
        android.database.Cursor B;
        if (c21560x1fce98fb.f279313q.equals("fix_tools_uplog")) {
            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).getClass();
            if (k14.n.a().f384894a) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17363xb7882d32.class));
            } else {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17364x9169f957.class);
                intent.putExtra("entry_fix_tools_uplog", 9);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent);
            }
            return true;
        }
        int i17 = 2;
        int i18 = 0;
        if (c21560x1fce98fb.f279313q.equals("fix_tools_db_recover")) {
            android.content.Intent className = new android.content.Intent().setClassName(mo55332x76847179(), "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
            className.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(className);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToRecovery", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToRecovery", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("fix_tools_contact_recover")) {
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), "修复中", true, false, null);
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.d0) ((vg3.r3) i95.n0.c(vg3.r3.class))).wi(this, new yz5.l() { // from class: o14.m$$b
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        java.lang.Boolean bool = (java.lang.Boolean) obj;
                        boolean z19 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa.f241597e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa activityC17362x6cf7dffa = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa.this;
                        activityC17362x6cf7dffa.getClass();
                        Q.dismiss();
                        dp.a.m125854x26a183b(activityC17362x6cf7dffa, bool.booleanValue() ? "修复完成" : "修复失败", 1).show();
                        if (!bool.booleanValue()) {
                            return null;
                        }
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17362x6cf7dffa.f241598d).m("fix_tools_contact_recover", true);
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17362x6cf7dffa.f241598d).notifyDataSetChanged();
                        return null;
                    }
                });
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FixToolsUI", th6, "fixContactRecover err", new java.lang.Object[0]);
                Q.dismiss();
                dp.a.m125854x26a183b(this, "修复失败", 1).show();
            }
            return true;
        }
        java.lang.Throwable th7 = null;
        java.lang.Class<vg3.x3> cls2 = vg3.x3.class;
        if (c21560x1fce98fb.f279313q.equals("fix_tools_add_friend_verify_record")) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q2 = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), "修复中", true, false, null);
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.jb jbVar = (com.p314xaae8f345.mm.p2621x8fb0427b.jb) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls2))).oj();
                l75.k0 k0Var = jbVar.f276595d;
                if (k0Var != null) {
                    k0Var.mo70514xb06685ab("VerifyRecordMsgInfo", null, null);
                }
                jbVar.mo142179xf35bbb4("VerifyRecordMsgInfo", 5, null);
                o14.n nVar = new o14.n(this, Q2);
                ft1.j jVar = (ft1.j) ((xg3.u) i95.n0.c(xg3.u.class));
                jVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "getAllVerifyRecordHistory start");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "resetAllFetchedFlag");
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) jVar.f348028e).mo141623x754a37bb()).putBoolean("all_history_fetched", false);
                v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) jVar.f348027d).mo141623x754a37bb(), null, new ft1.f(jVar, nVar, null), 1, null);
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FixToolsUI", th8, "fixAddFriendVerifyRecordRecover err", new java.lang.Object[0]);
                try {
                    Q2.dismiss();
                } catch (java.lang.Exception unused) {
                }
                dp.a.m125854x26a183b(this, "修复失败", 1).show();
            }
            return true;
        }
        if (c21560x1fce98fb.f279313q.endsWith("fix_tools_matrix")) {
            if (!ih.d.c()) {
                dp.a.m125854x26a183b(this, "Matrix is never installed", 0).show();
            }
            return true;
        }
        if (c21560x1fce98fb.f279313q.endsWith("fix_tools_search")) {
            android.content.Intent intent2 = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17360xa18e5951.class);
            intent2.addFlags(67108864);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToSearchUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToSearchUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("fix_force_update")) {
            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).qj(1, mo55332x76847179());
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("fix_tools_chat_msg_time")) {
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, 0, null);
            yz5.p pVar = new yz5.p() { // from class: o14.m$$c
                @Override // yz5.p
                /* renamed from: invoke */
                public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer num2 = (java.lang.Integer) obj2;
                    boolean z19 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa.f241597e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa activityC17362x6cf7dffa = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa.this;
                    activityC17362x6cf7dffa.getClass();
                    boolean equals = num.equals(num2);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c17;
                    if (!equals) {
                        u3Var.setMessage(java.lang.String.format("%d/%d", java.lang.Integer.valueOf(num.intValue()), java.lang.Integer.valueOf(num2.intValue())));
                        u3Var.show();
                        return null;
                    }
                    u3Var.dismiss();
                    if (v24.c.f514436a.a()) {
                        return null;
                    }
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17362x6cf7dffa.f241598d).m("fix_tools_chat_msg_time", true);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17362x6cf7dffa.f241598d).notifyDataSetChanged();
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC17362x6cf7dffa);
                    e4Var.f293309c = activityC17362x6cf7dffa.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
                    e4Var.c();
                    return null;
                }
            };
            if (c01.id.f118794a) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                android.database.Cursor B2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls2))).Di().B(1, new java.util.ArrayList(), "*", true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B2, "getNecessaryCursorWithConversation(...)");
                while (B2.moveToNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                    l4Var.mo9015xbf5d97fd(B2);
                    if (l4Var.w0() > c01.id.c()) {
                        arrayList3.add(l4Var);
                        ot5.g.c("MicroMsg.ChatMsgTimeFixer", "[getWrongConversation] collect wrong conversation: " + l4Var.h1() + ' ' + l4Var.w0());
                    }
                }
                B2.close();
                if (arrayList3.isEmpty()) {
                    ot5.g.c("MicroMsg.ChatMsgTimeFixer", "fix all time but it's empty");
                } else {
                    ot5.g.c("MicroMsg.ChatMsgTimeFixer", "collect wrong conversation size:" + arrayList3.size());
                    pVar.mo149xb9724478(0, java.lang.Integer.valueOf(arrayList3.size()));
                    ((ku5.t0) ku5.t0.f394148d).g(new v24.b(arrayList3, pVar));
                    v24.c.f514437b = null;
                    i18 = 1;
                }
            } else {
                ot5.g.c("MicroMsg.ChatMsgTimeFixer", "fix all time but not sync time");
            }
            if (i18 != 0) {
                c17.show();
            }
            return true;
        }
        if (!c21560x1fce98fb.f279313q.equals("fix_tools_conversation_flag")) {
            if (c21560x1fce98fb.f279313q.equals("fix_tools_aggressive_clean")) {
                j45.l.j(this, "clean", ".ui.CleanUI", new android.content.Intent(), null);
                return true;
            }
            if (c21560x1fce98fb.f279313q.equals("fix_tools_file_analyse")) {
                android.content.Intent intent3 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17361x5f3fcbd4.class);
                intent3.addFlags(67108864);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent3);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            if (!c21560x1fce98fb.f279313q.equals("fix_tools_filehelper")) {
                return false;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls2))).Bi().n("filehelper", true);
            if (n17 != null) {
                if (n17.r2()) {
                    z17 = false;
                } else {
                    n17.N2();
                    z17 = true;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
                    n17.n1("");
                    z17 = true;
                }
                if (n17.o2()) {
                    n17.r3();
                    z17 = true;
                }
                if (z17) {
                    c01.e2.g0(n17, true);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241598d).m("fix_tools_filehelper", true);
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this);
                    e4Var.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.o39);
                    e4Var.c();
                }
            }
            return true;
        }
        p75.n0 n0Var = dm.i2.K;
        p75.d dVar = dm.i2.T;
        p75.i0 g17 = n0Var.g(kz5.c0.i(dm.i2.L, dVar, dm.i2.Q));
        p75.m0 x17 = dVar.x(0);
        p75.d dVar2 = dm.i2.W;
        g17.f434190d = x17.c(dVar2.m().d(dVar2.j("message_fold")));
        p75.l0 a17 = g17.a();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        l75.k0 k0Var2 = gm0.j1.u().f354686f;
        if (k0Var2 == null || (B = k0Var2.B(a17.f434169a, a17.f434170b)) == null) {
            cls = cls2;
        } else {
            while (B.moveToNext()) {
                try {
                    java.lang.String string = B.getString(i18);
                    long j17 = B.getLong(1);
                    java.lang.Class<vg3.x3> cls3 = cls2;
                    long j18 = B.getLong(i17);
                    arrayList5.add(new jz5.o(string, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationFlagFixer", "[fixAllFlag] found wrong conversation: " + string + ", flag=" + j17 + ", conversationTime=" + j18);
                    cls2 = cls3;
                    i17 = 2;
                    i18 = 0;
                    th7 = null;
                } finally {
                }
            }
            cls = cls2;
            vz5.b.a(B, th7);
        }
        if (arrayList5.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationFlagFixer", "[fixAllFlag] no wrong conversation found");
            z18 = false;
        } else {
            java.util.Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                jz5.o oVar = (jz5.o) it.next();
                java.lang.String str = (java.lang.String) oVar.f384374d;
                long longValue = ((java.lang.Number) oVar.f384375e).longValue();
                long longValue2 = ((java.lang.Number) oVar.f384376f).longValue();
                p75.n0 n0Var2 = dm.i2.K;
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put(dm.i2.T.f434158a, java.lang.Long.valueOf(longValue2));
                p75.h1 j19 = n0Var2.j(contentValues);
                j19.f434184c = dm.i2.L.j(str);
                int f17 = j19.a().f(gm0.j1.u().f354686f);
                com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Di();
                if ((Di instanceof l75.a1) && f17 > 0) {
                    Di.b(3, Di, str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationFlagFixer", "[fixAllFlag] fixed " + str + ": " + longValue + " -> " + longValue2 + ", ret=" + f17);
            }
            v24.h.f514457b = null;
            z18 = true;
        }
        if (z18 && !v24.h.f514456a.a()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241598d).m("fix_tools_conversation_flag", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241598d).notifyDataSetChanged();
            int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this);
            e4Var2.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.o39);
            e4Var2.c();
        }
        return true;
    }
}
