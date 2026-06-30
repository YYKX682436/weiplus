package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class n7 {

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 f183939a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7();

    /* renamed from: b */
    public static int f183940b;

    public static /* synthetic */ void C(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, android.os.Bundle bundle, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        android.os.Bundle bundle2 = (i18 & 4) != 0 ? null : bundle;
        if ((i18 & 8) != 0) {
            i17 = 1;
        }
        n7Var.B(activityC0065xcd7aa112, c14994x9b99c079, bundle2, i17, (i18 & 16) != 0 ? null : lVar);
    }

    public static /* synthetic */ void F(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.os.Bundle bundle, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        if ((i19 & 8) != 0) {
            i17 = 2;
        }
        int i27 = i17;
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        n7Var.E(activityC0065xcd7aa112, abstractC14490x69736cb5, bundle2, i27, i18);
    }

    public static /* synthetic */ void H(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.os.Bundle bundle, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            bundle = null;
        }
        if ((i18 & 8) != 0) {
            i17 = 2;
        }
        n7Var.G(activityC0065xcd7aa112, abstractC14490x69736cb5, bundle, i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3, r45.ze2 ze2Var, int i18, java.lang.String str4, r45.ht0 ht0Var, java.lang.Boolean bool, r45.ub4 ub4Var, int i19, java.lang.Object obj) {
        int i27;
        zy2.e eVar;
        long longExtra;
        java.lang.String str5 = (i19 & 256) != 0 ? null : str4;
        r45.ht0 ht0Var2 = (i19 & 512) != 0 ? null : ht0Var;
        java.lang.Boolean bool2 = (i19 & 1024) != 0 ? java.lang.Boolean.FALSE : bool;
        r45.ub4 ub4Var2 = (i19 & 2048) != 0 ? null : ub4Var;
        n7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        ot0.q qVar = new ot0.q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var2 = f183939a;
        if (i17 != 7) {
            if (i17 == 15) {
                i27 = 7;
                android.content.Intent intent = context.getIntent();
                longExtra = intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, java.lang.Boolean.TRUE)) {
                    qVar.D2 = 5;
                } else {
                    qVar.D2 = 4;
                }
                zy2.e eVar2 = new zy2.e();
                eVar2.f558905b = l(n7Var2, str, i17, str2, str3, ze2Var, str5, ht0Var2, java.lang.Long.valueOf(longExtra), null, 256, null);
                eVar = eVar2;
            } else if (i17 != 18) {
                zy2.m mVar = new zy2.m();
                i27 = 7;
                mVar.f558990b = l(n7Var2, str, i17, str2, str3, ze2Var, str5, null, null, null, 384, null);
                eVar = mVar;
            } else {
                i27 = 7;
                qVar.D2 = 6;
                android.content.Intent intent2 = context.getIntent();
                longExtra = intent2 != null ? intent2.getLongExtra("key_feed_id", 0L) : 0L;
                zy2.e eVar3 = new zy2.e();
                eVar3.f558905b = n7Var2.k(str, i17, str2, str3, ze2Var, str5, null, java.lang.Long.valueOf(longExtra), ub4Var2);
                eVar = eVar3;
            }
        } else {
            i27 = 7;
            qVar.D2 = 3;
            zy2.e eVar4 = new zy2.e();
            eVar4.f558905b = l(n7Var2, str, i17, str2, str3, ze2Var, str5, ht0Var2, null, null, 384, null);
            eVar = eVar4;
        }
        qVar.f(eVar);
        qVar.f430199i = i17 != 4 ? (i17 == i27 || i17 == 15 || i17 == 18) ? 75 : 59 : 72;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtra("Retr_Msg_Type", i17 != 4 ? i17 != i27 ? i17 != 15 ? i17 != 18 ? 21 : 39 : 32 : 27 : 25);
        intent3.putExtra("Multi_Retr", true);
        intent3.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent3.putExtra("Retr_go_to_chattingUI", false);
        intent3.putExtra("Retr_show_success_tips", true);
        j45.l.w(context, ".ui.transmit.MsgRetransmitUI", intent3, 1001, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d7(str, i17, j17, ht0Var2, context, i18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3, r45.ze2 ze2Var, int i18, java.lang.String str4, r45.ht0 ht0Var, java.lang.Boolean bool, r45.ub4 ub4Var, int i19, java.lang.Object obj) {
        m21.e eVar;
        java.lang.String str5 = (i19 & 256) != 0 ? null : str4;
        r45.ht0 ht0Var2 = (i19 & 512) != 0 ? null : ht0Var;
        java.lang.Boolean bool2 = (i19 & 1024) != 0 ? java.lang.Boolean.FALSE : bool;
        r45.ub4 ub4Var2 = (i19 & 2048) != 0 ? null : ub4Var;
        n7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share topic " + str + " to sns");
        android.content.Intent intent = new android.content.Intent();
        r45.mv2 l17 = l(n7Var, str, i17, str2, str3, ze2Var, str5, ht0Var2, null, ub4Var2, 128, null);
        android.content.Intent intent2 = context.getIntent();
        l17.set(7, pm0.v.u(intent2 != null ? intent2.getLongExtra("key_feed_id", 0L) : 0L));
        int i27 = 18;
        if (i17 == 7) {
            ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareActivity", "com.tencent.mm.feature.sns.SnsShareObjectService");
            m21.e eVar2 = new m21.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareActivity", "com.tencent.mm.feature.sns.SnsShareObjectService");
            eVar2.f404518a = l17;
            eVar = eVar2;
        } else if (i17 == 15) {
            fe0.n4 n4Var = (fe0.n4) i95.n0.c(fe0.n4.class);
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, java.lang.Boolean.TRUE);
            ((ee0.t4) n4Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareMusicTopic", "com.tencent.mm.feature.sns.SnsShareObjectService");
            m21.j jVar = new m21.j();
            jVar.f404523a = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareMusicTopic", "com.tencent.mm.feature.sns.SnsShareObjectService");
            jVar.f404524b = l17;
            eVar = jVar;
        } else if (i17 != 18) {
            ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareTopic", "com.tencent.mm.feature.sns.SnsShareObjectService");
            m21.n nVar = new m21.n();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareTopic", "com.tencent.mm.feature.sns.SnsShareObjectService");
            nVar.f404528a = l17;
            eVar = nVar;
        } else {
            ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareTemplate", "com.tencent.mm.feature.sns.SnsShareObjectService");
            m21.m mVar = new m21.m();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareTemplate", "com.tencent.mm.feature.sns.SnsShareObjectService");
            mVar.f404527a = l17;
            eVar = mVar;
        }
        intent.putExtra(i17 != 7 ? i17 != 15 ? i17 != 18 ? "ksnsupload_finder_topic_xml" : "ksnsupload_finder_template_xml" : "ksnsupload_finder_music_topic_xml" : "ksnsupload_finder_activity_xml", eVar.a());
        if (i17 == 4) {
            i27 = 22;
        } else if (i17 == 7) {
            i27 = 24;
        } else if (i17 == 15) {
            i27 = 32;
        } else if (i17 == 18) {
            i27 = 41;
        }
        intent.putExtra("Ksnsupload_type", i27);
        intent.putExtra("need_result", true);
        intent.putExtra("K_music_topic_is_audio", bool2);
        j45.l.w(context, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e7(context, i17, j17, ht0Var2, str, i18));
    }

    public static void L(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, android.content.Context context, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = 500;
        }
        n7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.B4;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 1;
        ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).l();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_HAS_SHOW_SHARE_EDUCATION_BOTTOMSHEET_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
        if (!z17 || booleanValue) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
        e3Var.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.dod);
        e3Var.a();
        ((android.widget.TextView) e3Var.f213508y.findViewById(com.p314xaae8f345.mm.R.id.c_x)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k7(e3Var));
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) e3Var.f213508y.findViewById(com.p314xaae8f345.mm.R.id.obc)).getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) e3Var.f213508y.findViewById(com.p314xaae8f345.mm.R.id.c_x)).getPaint(), 0.8f);
        pm0.v.V(j17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j7(context, e3Var));
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, zy2.i iVar, int i17, yz5.l lVar) {
        n7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        ot0.q qVar = new ot0.q();
        boolean m59315x31740422 = c14994x9b99c079.m59315x31740422();
        int i18 = c14994x9b99c079.m59318xcdeb3c4() ? 129 : m59315x31740422 ? 106 : 51;
        if (((r45.gv2) iVar.f558944b.m75936x14adae67(30)) == null) {
            iVar.f558944b.set(30, new r45.gv2());
        }
        r45.gv2 gv2Var = (r45.gv2) iVar.f558944b.m75936x14adae67(30);
        if (gv2Var != null) {
            gv2Var.set(0, java.lang.Boolean.valueOf(str.length() > 0));
        }
        qVar.f(iVar);
        qVar.f430199i = i18;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", c14994x9b99c079.m59318xcdeb3c4() ? 42 : m59315x31740422 ? 36 : 18);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("Retr_NeedReport", false);
        n7Var.e(activity, c14994x9b99c079, intent);
        intent.putExtra("custom_send_text", str);
        intent.putExtra("Retr_MsgQuickShare", true);
        intent.putExtra("Select_Conv_User", str2);
        intent.putExtra("Retr_finder_in_stream", true);
        intent.setClassName(activity, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity : null;
        com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = activityC21401x6ce6f73f != null ? activityC21401x6ce6f73f.m78751x5dc77fb5(intent) : null;
        if (m78751x5dc77fb5 != null) {
            ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c6(c14994x9b99c079, activity, i17, V6, lVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0443, code lost:
    
        if (r0 == null) goto L434;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[LOOP:1: B:184:0x05f1->B:203:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.kv2 j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 r21, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r22, boolean r23, r45.qt2 r24, int r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.j(com.tencent.mm.plugin.finder.assist.n7, com.tencent.mm.plugin.finder.storage.FinderItem, boolean, r45.qt2, int, java.lang.Object):r45.kv2");
    }

    public static /* synthetic */ r45.mv2 l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, r45.ze2 ze2Var, java.lang.String str4, r45.ht0 ht0Var, java.lang.Long l17, r45.ub4 ub4Var, int i18, java.lang.Object obj) {
        return n7Var.k(str, i17, str2, str3, ze2Var, str4, ht0Var, (i18 & 128) != 0 ? null : l17, (i18 & 256) != 0 ? null : ub4Var);
    }

    public static void t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, android.os.Bundle bundle, int i17, boolean z17, r45.mv4 mv4Var, yz5.l lVar, yz5.l lVar2, int i18, java.lang.Object obj) {
        int i19 = (i18 & 8) != 0 ? 1 : i17;
        boolean z18 = (i18 & 16) != 0 ? false : z17;
        r45.mv4 mv4Var2 = (i18 & 32) != 0 ? null : mv4Var;
        yz5.l lVar3 = (i18 & 64) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 128) != 0 ? null : lVar2;
        n7Var.getClass();
        if (!hc2.o0.d(c14994x9b99c079.getFeedObject())) {
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            hc2.f1.B(activity, string);
            if (lVar3 != null) {
                lVar3.mo146xb9724478(null);
                return;
            }
            return;
        }
        boolean m59318xcdeb3c4 = c14994x9b99c079.m59318xcdeb3c4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "shareToConversation, id:" + c14994x9b99c079.m59251x5db1b11() + ", pflag:" + c14994x9b99c079.getFeedObject().m76810x98d986d1() + " isNativeDramaFeed:" + m59318xcdeb3c4);
        if (c14994x9b99c079.getFeedObject().m76815x4f546659() == 1) {
            db5.t7.f(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exy), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i6.f183798a);
            if (lVar3 != null) {
                lVar3.mo146xb9724478(null);
            }
            if (lVar4 != null) {
                lVar4.mo146xb9724478(null);
                return;
            }
            return;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, 11L, 1L, false);
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            if (lVar3 != null) {
                lVar3.mo146xb9724478(null);
            }
            if (lVar4 != null) {
                lVar4.mo146xb9724478(null);
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        r45.kv2 j17 = j(n7Var, c14994x9b99c079, false, V6, 2, null);
        j17.set(28, mv4Var2);
        boolean m59315x31740422 = c14994x9b99c079.m59315x31740422();
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k6(c14994x9b99c079, j17, activity, z18, lVar3, lVar4, m59318xcdeb3c4, m59315x31740422, i19, V6, null), 2, null);
    }

    public static void u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, ya2.b2 contact, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        n7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, 13L, 1L, false);
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        if ((contact.f69308x26b1b2e8 & 1048576) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "shareFinderContactToConversation: forbid share contact, nickname=".concat(contact.w0()));
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m6(contact, context, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(android.content.Context r21, r45.br2 r22, yz5.l r23, java.lang.String r24, boolean r25, boolean r26, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r27) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.A(android.content.Context, r45.br2, yz5.l, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void B(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, android.os.Bundle bundle, int i17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        if (feedObject.getMediaType() != 9) {
            t(this, context, feedObject, bundle, i17, false, null, null, lVar, 16, null);
            return;
        }
        if (!((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(feedObject.m59258xd0557130())) {
            if (!((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(feedObject.m59258xd0557130())) {
                x(context, feedObject, bundle, i17, 63, 23, lVar);
                return;
            }
        }
        x(context, feedObject, bundle, i17, 88, 31, lVar);
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(0, java.lang.Long.valueOf(feedObject.m59251x5db1b11()));
        vd6Var.set(28, feedObject.m59229xb5af1dd5());
        vd6Var.set(4, feedObject.m59276x6c285d75());
        r45.q25 q25Var = new r45.q25();
        q25Var.set(4, 1);
        q25Var.set(7, 1);
        vd6Var.set(3, q25Var);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2 = feedObject.getFeedObject();
        if (feedObject2 == null || (str = feedObject2.m76829x97edf6c0()) == null) {
            str = "";
        }
        vd6Var.set(8, str);
        vd6Var.set(5, feedObject.m59299x6bf53a6c());
        vd6Var.set(10, 65);
        r45.nw1 m59258xd0557130 = feedObject.m59258xd0557130();
        vd6Var.set(19, java.lang.Long.valueOf(m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L));
        linkedList.add(vd6Var);
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, 65);
        new db2.y2(linkedList, qt2Var).l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d6(linkedList));
    }

    public final void E(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, android.os.Bundle bundle, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (feed.getFeedObject().getMediaType() == 9) {
            if (!((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(feed.getFeedObject().m59258xd0557130())) {
                if (!((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(feed.getFeedObject().m59258xd0557130())) {
                    y(context, feed, bundle, i17, 21);
                    return;
                }
            }
            y(context, feed, bundle, i17, 30);
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = feed.getFeedObject();
        if (!hc2.o0.f(feedObject.getFeedObject())) {
            java.lang.String string = activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            hc2.f1.B(activityC21401x6ce6f73f, string);
            return;
        }
        if (feedObject.m59335xcab26cf9()) {
            db5.t7.f(activityC21401x6ce6f73f, activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exy), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z6.f184291a);
            return;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, 12L, 1L, false);
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject ");
        sb6.append(feedObject.m59251x5db1b11());
        sb6.append(' ');
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2 = feedObject.getFeedObject();
        sb6.append(feedObject2 != null ? java.lang.Integer.valueOf(feedObject2.m76777xba60e801()) : null);
        sb6.append(" to sns, pflag:");
        sb6.append(feedObject.getFeedObject().m76810x98d986d1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
        pf5.z zVar = pf5.z.f435481a;
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC21401x6ce6f73f).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        android.content.Intent intent = new android.content.Intent();
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareObject", "com.tencent.mm.feature.sns.SnsShareObjectService");
        new r45.kv2();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareObject", "com.tencent.mm.feature.sns.SnsShareObjectService");
        r45.kv2 j17 = j(this, feedObject, true, null, 4, null);
        j17.set(28, null);
        j17.set(29, java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(activityC21401x6ce6f73f).c(zy2.v9.class))).Q6(j17);
        intent.putExtra("ksnsupload_finder_object_xml", zy2.d5.f(j17));
        intent.putExtra("Ksnsupload_link", j17.m75945x2fec8307(0));
        if ((j17.m75939xb282bd08(25) & 4) > 0) {
            intent.putExtra("Ksnsupload_type", 38);
        } else if (j17.m75939xb282bd08(31) == 2) {
            intent.putExtra("Ksnsupload_type", 45);
            intent.putExtra("Ksnsupload_title", activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz));
        } else {
            intent.putExtra("Ksnsupload_type", 17);
        }
        intent.putExtra("need_result", true);
        intent.putExtra("finder_post_from_sns_type", i18);
        if (i17 == 5) {
            intent.putExtra("finder_feed_id", feedObject.m59251x5db1b11());
            intent.putExtra("ksnsupload_finder_need_report", true);
            V6.set(0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o4.f206754b);
        }
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("key_finder_sns_post_within_30s", false);
            boolean z18 = bundle.getBoolean("need_ban_back_tips", false);
            intent.putExtra("KSnsFrom", z17 ? 22 : 23);
            intent.putExtra("need_ban_back_tips", z18);
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(feedObject.m59299x6bf53a6c(), xy2.c.e(activityC21401x6ce6f73f));
        intent.putExtra("sns_upload_is_show_dialog", !b17);
        j45.l.x(activityC21401x6ce6f73f, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a7(b17, activityC21401x6ce6f73f, feedObject, null, i17, V6));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[LOOP:1: B:53:0x01fe->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022b A[EDGE_INSN: B:66:0x022b->B:67:0x022b BREAK  A[LOOP:1: B:53:0x01fe->B:113:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r24, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r25, android.os.Bundle r26, int r27) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.G(androidx.appcompat.app.AppCompatActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed, android.os.Bundle, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c2, code lost:
    
        if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(r13.m59258xd0557130()) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r12, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.I(androidx.appcompat.app.AppCompatActivity, com.tencent.mm.plugin.finder.storage.FinderItem):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r18, r45.br2 r19, yz5.l r20, java.lang.String r21, boolean r22, boolean r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.b(android.content.Context, r45.br2, yz5.l, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c(r45.kv2 shareObj) {
        r45.ik2 ik2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObj, "shareObj");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        c19792x256d2725.m76877x684351d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(shareObj.m75945x2fec8307(0), 0L));
        c19792x256d2725.m76896xfefec3e9(shareObj.m75945x2fec8307(8));
        c19792x256d2725.m76929x66bc2758(shareObj.m75945x2fec8307(1));
        c19792x256d2725.m76894x7ac946f0(shareObj.m75945x2fec8307(2));
        c19792x256d2725.m76884x50740976(-1);
        c19792x256d2725.m76861xb2c72d36(-1);
        c19792x256d2725.m76869x85124ecc(-1);
        c19792x256d2725.m76851xc51b2372(-1);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
        c19793xceab7f56.m76982x9713e3a(shareObj.m75945x2fec8307(4));
        c19793xceab7f56.m77002xdb5612fc(shareObj.m75939xb282bd08(5));
        java.util.LinkedList<r45.iv2> m75941xfb821914 = shareObj.m75941xfb821914(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMediaList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.iv2 iv2Var : m75941xfb821914) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
            c19788xd7cfd73e.m76666xdb5612fc(iv2Var.m75939xb282bd08(0));
            c19788xd7cfd73e.m76678xca029dad(iv2Var.m75945x2fec8307(1));
            c19788xd7cfd73e.m76638x619ae8ba(iv2Var.m75945x2fec8307(8));
            c19788xd7cfd73e.m76676xd3f7e23b(iv2Var.m75945x2fec8307(2));
            c19788xd7cfd73e.m76651xbcc476d8(iv2Var.m75945x2fec8307(6));
            c19788xd7cfd73e.m76685x53e9ee84(iv2Var.m75938x746dc8a6(3));
            c19788xd7cfd73e.m76658xf84e829(iv2Var.m75938x746dc8a6(4));
            c19788xd7cfd73e.m76682xc9923ded(iv2Var.m75939xb282bd08(5));
            arrayList.add(c19788xd7cfd73e);
        }
        c19793xceab7f56.m77000x535b30a2(new java.util.LinkedList<>(arrayList));
        r45.mv4 mv4Var = (r45.mv4) shareObj.m75936x14adae67(28);
        if (mv4Var != null) {
            ik2Var = (r45.ik2) mv4Var.m75936x14adae67(2);
            if (ik2Var == null) {
                ik2Var = new r45.ik2();
            }
        } else {
            ik2Var = null;
        }
        c19793xceab7f56.m76988x1185ac0b(ik2Var);
        c19792x256d2725.m76895x5bf46472(c19793xceab7f56);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(shareObj.m75945x2fec8307(23))) {
            r45.dm2 dm2Var = new r45.dm2();
            r45.cl2 cl2Var = new r45.cl2();
            cl2Var.set(6, hc2.g0.g(shareObj.m75945x2fec8307(23)));
            dm2Var.set(4, cl2Var);
            c19792x256d2725.m76899x71cce6d8(dm2Var);
        }
        r45.mv4 mv4Var2 = (r45.mv4) shareObj.m75936x14adae67(28);
        c19792x256d2725.m76855x6e101bcb(mv4Var2 != null ? mv4Var2.m75939xb282bd08(0) : 0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
        c19782x23db1cfa.m76218xe0a5bcad(shareObj.m75945x2fec8307(3));
        c19782x23db1cfa.m76227x7ac946f0(shareObj.m75945x2fec8307(2));
        c19782x23db1cfa.m76240x66bc2758(shareObj.m75945x2fec8307(1));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc();
        c19780xceb4c4dc.m76038x5304029d(shareObj.m75939xb282bd08(13));
        c19780xceb4c4dc.m76039xa7d6d9ac(shareObj.m75945x2fec8307(14));
        c19782x23db1cfa.m76203xcbec40f8(c19780xceb4c4dc);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(shareObj.m75945x2fec8307(16)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(shareObj.m75945x2fec8307(15))) {
            c19782x23db1cfa.m76204x244d492e(new java.util.LinkedList<>());
            java.util.LinkedList<r45.zv0> m76161xc7f988ba = c19782x23db1cfa.m76161xc7f988ba();
            r45.zv0 zv0Var = new r45.zv0();
            zv0Var.set(0, 1);
            r45.fw0 fw0Var = new r45.fw0();
            fw0Var.set(0, new java.util.LinkedList());
            java.util.LinkedList m75941xfb8219142 = fw0Var.m75941xfb821914(0);
            r45.xk xkVar = new r45.xk();
            xkVar.set(1, shareObj.m75945x2fec8307(15));
            xkVar.set(0, shareObj.m75945x2fec8307(12));
            xkVar.set(2, shareObj.m75945x2fec8307(16));
            r45.kj kjVar = new r45.kj();
            kjVar.set(0, java.lang.Integer.valueOf(shareObj.m75939xb282bd08(18)));
            kjVar.set(1, shareObj.m75945x2fec8307(19));
            xkVar.set(5, kjVar);
            m75941xfb8219142.add(xkVar);
            zv0Var.set(1, fw0Var);
            m76161xc7f988ba.add(zv0Var);
        }
        c19792x256d2725.m76853xe9f5ad5e(c19782x23db1cfa);
        return c19792x256d2725;
    }

    public final void d(android.content.Context context, o25.y1 quickMenuHelper, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quickMenuHelper, "quickMenuHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) quickMenuHelper;
        mVar.wi(context, menu, sheet);
        f183940b = mVar.f270255e;
        java.util.ArrayList Ui = mVar.Ui();
        if (!Ui.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = Ui.iterator();
            while (it.hasNext()) {
                sb6.append(((o25.m2) it.next()).f424093a + '|');
            }
            org.json.JSONObject jSONObject = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206967c;
            if (jSONObject != null) {
                jSONObject.put("icon_recent_forward", sb6.toString());
            }
        }
    }

    public final void e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (context.getIntent().getLongExtra("feed_object_id", 0L) == feedObject.getFeedObject().m76784x5db1b11()) {
            intent.putExtra("msg_forward_sns_obj_id", context.getIntent().getStringExtra("KEY_FINDER_SNS_ID"));
            long longExtra = context.getIntent().getLongExtra("KEY_FINDER_MSG_ID", 0L);
            if (longExtra != 0) {
                intent.putExtra("Retr_Msg_Id", longExtra);
            }
            intent.putExtra("Retr_MsgTalker", context.getIntent().getStringExtra("KEY_FINDER_MSG_TALKER"));
        }
    }

    public final pj4.j0 f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        java.lang.String m76944x730bcac6;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f436672d = "5";
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = finderObject.m76802x2dd01666();
        if (m76802x2dd016662 != null && (m76944x730bcac6 = m76802x2dd016662.m76944x730bcac6()) != null && (m76802x2dd01666 = finderObject.m76802x2dd01666()) != null) {
            m76802x2dd01666.m76982x9713e3a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a.d(m76944x730bcac6));
        }
        byte[] mo14344x5f01b1f6 = finderObject.mo14344x5f01b1f6();
        j0Var.f436674f = android.util.Base64.encodeToString(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length, 0);
        pj4.s1 s1Var = new pj4.s1();
        s1Var.f436819d = finderObject.m76784x5db1b11();
        s1Var.f436820e = finderObject.m76803x6c285d75();
        byte[] mo14344x5f01b1f62 = s1Var.mo14344x5f01b1f6();
        j0Var.f436675g = android.util.Base64.encodeToString(mo14344x5f01b1f62, 0, mo14344x5f01b1f62.length, 2);
        return j0Var;
    }

    public final r45.dv2 g(r45.ww2 card) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(card, "card");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList m75941xfb821914 = card.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = null;
            if (!it.hasNext()) {
                java.lang.String u17 = pm0.v.u(card.m75942xfb822ef2(14));
                java.lang.String m75945x2fec8307 = card.m75945x2fec8307(1);
                java.lang.String m75945x2fec83072 = card.m75945x2fec8307(13);
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = card.m75934xbce7f2f(6);
                r45.dv2 dv2Var = new r45.dv2();
                dv2Var.set(0, u17);
                dv2Var.set(1, m75945x2fec8307);
                dv2Var.set(2, m75945x2fec83072);
                int size = linkedList.size();
                if (4 <= size) {
                    size = 4;
                }
                for (java.lang.Object obj : linkedList.subList(0, size)) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    dv2Var.m75941xfb821914(3).add((java.lang.String) obj);
                    dv2Var.m75941xfb821914(4).add(linkedList2.get(i17));
                    i17 = i19;
                }
                dv2Var.set(5, m75934xbce7f2f);
                return dv2Var;
            }
            java.lang.Object next = it.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) next;
            if (i18 < 4) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null) {
                    c19788xd7cfd73e = m76962x74cd162e.getFirst();
                }
                if (c19788xd7cfd73e != null) {
                    java.lang.String m76623xd93f812f = c19788xd7cfd73e.m76623xd93f812f();
                    if (m76623xd93f812f != null) {
                        linkedList.add(m76623xd93f812f);
                    }
                    java.lang.String m76624x4c9b7dca = c19788xd7cfd73e.m76624x4c9b7dca();
                    if (m76624x4c9b7dca != null) {
                        linkedList2.add(m76624x4c9b7dca);
                    }
                }
            }
            i18 = i27;
        }
    }

    public final ot0.q h(r45.kv2 finderShareObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderShareObject, "finderShareObject");
        ot0.q qVar = new ot0.q();
        zy2.i iVar = new zy2.i();
        iVar.f558944b = finderShareObject;
        qVar.f(iVar);
        if (finderShareObject.m75939xb282bd08(31) == 2) {
            qVar.f430199i = 129;
        } else if ((finderShareObject.m75939xb282bd08(25) & 4) > 0) {
            qVar.f430199i = 106;
        } else {
            qVar.f430199i = 51;
        }
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        return qVar;
    }

    public final bi4.d1 i(java.lang.String str, java.lang.String str2, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, r45.qc1 qc1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(f(finderObject));
        int i17 = bi4.e.f102572a;
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f436672d = "3";
        j0Var.f436674f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList.add(j0Var);
        bi4.c1 c1Var = new bi4.c1();
        java.lang.String m75945x2fec8307 = qc1Var != null ? qc1Var.m75945x2fec8307(0) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            java.lang.String m76842x17443bc = finderObject.m76842x17443bc();
            if (m76842x17443bc == null || m76842x17443bc.length() == 0) {
                c1Var.b("1024");
            } else {
                c1Var.b(finderObject.m76842x17443bc());
            }
        } else {
            c1Var.b(qc1Var != null ? qc1Var.m75945x2fec8307(0) : null);
        }
        c1Var.g(str);
        c1Var.e(str2);
        java.lang.String m75945x2fec83072 = qc1Var != null ? qc1Var.m75945x2fec8307(2) : null;
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            c1Var.f("finder@inner");
        } else {
            c1Var.f(qc1Var != null ? qc1Var.m75945x2fec8307(2) : null);
        }
        java.lang.String m75945x2fec83073 = qc1Var != null ? qc1Var.m75945x2fec8307(1) : null;
        if (!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0)) {
            c1Var.a(qc1Var != null ? qc1Var.m75945x2fec8307(1) : null);
        }
        c1Var.d(pm0.v.u(j17));
        c1Var.h(finderObject.m76837xa415fe32());
        c1Var.e("http://wxapp.tc.qq.com/258/20304/stodownload?m=9823aa7c1879309ff7588e09c22144dd&filekey=30340201010420301e020201020402534804109823aa7c1879309ff7588e09c22144dd020207b8040d00000004627466730000000131&hy=SH&storeid=32303231303331383139353930393030306236313937303030303030303037636638353130393030303030313032&bizid=1023");
        c1Var.c(arrayList);
        bi4.d1 d1Var = c1Var.f102567a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d1Var, "build(...)");
        return d1Var;
    }

    public final r45.mv2 k(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, r45.ze2 ze2Var, java.lang.String str4, r45.ht0 ht0Var, java.lang.Long l17, r45.ub4 ub4Var) {
        r45.mv2 mv2Var = new r45.mv2();
        if (l17 != null) {
            mv2Var.set(7, pm0.v.u(l17.longValue()));
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        mv2Var.set(0, str);
        mv2Var.set(1, java.lang.Integer.valueOf(i17));
        if (str2 == null) {
            str2 = "";
        }
        mv2Var.set(2, str2);
        if (str3 == null) {
            str3 = "";
        }
        mv2Var.set(3, str3);
        if (str4 == null) {
            str4 = "";
        }
        mv2Var.set(5, str4);
        r45.hv2 hv2Var = new r45.hv2();
        hv2Var.set(0, ze2Var != null ? ze2Var.m75945x2fec8307(5) : null);
        hv2Var.set(1, java.lang.Float.valueOf(ze2Var != null ? ze2Var.m75938x746dc8a6(0) : 0.0f));
        hv2Var.set(2, java.lang.Float.valueOf(ze2Var != null ? ze2Var.m75938x746dc8a6(1) : 0.0f));
        mv2Var.set(4, hv2Var);
        if (ht0Var != null) {
            mv2Var.set(6, ht0Var);
        }
        if (ub4Var != null) {
            mv2Var.set(8, ub4Var);
        }
        return mv2Var;
    }

    public final java.lang.Object m(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ni(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b6(rVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final void n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.qc1 wxStatusPatams) {
        java.lang.String m59273x80025a04;
        java.lang.String m176700xe5e0d2a0;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxStatusPatams, "wxStatusPatams");
        if (abstractC14490x69736cb5 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "[shareAdFeedToStatusInternal] feedid=" + pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()) + " desc=" + abstractC14490x69736cb5.getFeedObject().m59226x730bcac6());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76760x76845fea();
        r45.xk a17 = m76760x76845fea != null ? ya2.d.a(m76760x76845fea, true) : null;
        if (a17 == null || (m59273x80025a04 = a17.m75945x2fec8307(1)) == null) {
            m59273x80025a04 = abstractC14490x69736cb5.getFeedObject().m59273x80025a04();
        }
        java.lang.String str = m59273x80025a04;
        if (a17 == null || (m75945x2fec8307 = a17.m75945x2fec8307(2)) == null) {
            ya2.b2 contact = abstractC14490x69736cb5.getContact();
            m176700xe5e0d2a0 = contact != null ? contact.m176700xe5e0d2a0() : null;
        } else {
            m176700xe5e0d2a0 = m75945x2fec8307;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Di(context, i(str, m176700xe5e0d2a0, abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.getFeedObject().getFeedObject(), wxStatusPatams));
    }

    public final void o(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, zy2.f objectContent, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectContent, "objectContent");
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        ot0.q qVar = new ot0.q();
        qVar.f(objectContent);
        qVar.f430199i = 73;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 22);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        j45.l.w(context, ".ui.transmit.MsgRetransmitUI", intent, 1001, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e6(objectContent, qt2Var));
    }

    public final void p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, m21.a snsShare, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsShare, "snsShare");
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[shareAlbumToSnsTimeLine] share album to sns. ");
        m21.f fVar = (m21.f) snsShare;
        sb6.append(fVar.f404519a.m75945x2fec8307(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ksnsupload_finder_album_xml", fVar.a());
        intent.putExtra("Ksnsupload_type", 20);
        intent.putExtra("need_result", true);
        j45.l.w(context, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f6(context, snsShare, qt2Var));
    }

    public final void q(android.content.Context context, r45.ev2 collection, boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "collection");
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderShareManager", "context must be MMActivity, context = " + context);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return;
        }
        ot0.q qVar = new ot0.q();
        zy2.g gVar = new zy2.g();
        gVar.f558916b = collection;
        qVar.f(gVar);
        qVar.f430199i = z17 ? 119 : 120;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 40);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        if (z18) {
            intent.putExtra("Retr_MsgQuickShare", z18);
            intent.putExtra("Select_Conv_User", str);
            intent.putExtra("custom_send_text", str2);
        }
        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, ".ui.transmit.MsgRetransmitUI", intent, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46405xe4de6fbf, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g6(gVar, context, collection));
    }

    public final void s(android.content.Context context, r45.ev2 collection, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "collection");
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderShareManager", "context must be MMActivity");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return;
        }
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareCollection", "com.tencent.mm.feature.sns.SnsShareObjectService");
        new r45.ev2();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareCollection", "com.tencent.mm.feature.sns.SnsShareObjectService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        android.content.Intent intent = new android.content.Intent();
        int i17 = z17 ? 42 : 43;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        java.lang.String e17 = zy2.d5.e(collection);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "makeContent(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        intent.putExtra("ksnsupload_finder_collection_xml", e17);
        intent.putExtra("Ksnsupload_type", i17);
        intent.putExtra("need_result", true);
        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, ".plugin.sns.ui.SnsUploadUI", intent, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h6(context, collection));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(android.content.Context r13, java.lang.String r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.v(android.content.Context, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(android.content.Context r20, r45.zc4 r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.w(android.content.Context, r45.zc4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, android.os.Bundle bundle, int i17, int i18, int i19, yz5.l lVar) {
        if (!hc2.o0.d(c14994x9b99c079.getFeedObject())) {
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            hc2.f1.B(activity, string);
            if (lVar != null) {
                lVar.mo146xb9724478(null);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share live（msgType:");
        sb6.append(i18);
        sb6.append(",msgRetrType:");
        sb6.append(i19);
        sb6.append((char) 65289);
        sb6.append(c14994x9b99c079.m59251x5db1b11());
        sb6.append(' ');
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = c14994x9b99c079.getFeedObject();
        sb6.append(feedObject != null ? java.lang.Integer.valueOf(feedObject.m76777xba60e801()) : null);
        sb6.append(" to conversation,liveId:");
        r45.nw1 m59258xd0557130 = c14994x9b99c079.m59258xd0557130();
        sb6.append(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null);
        sb6.append(",desc:");
        sb6.append(c14994x9b99c079.m59226x730bcac6());
        sb6.append(",liveStatus ");
        r45.nw1 m59258xd05571302 = c14994x9b99c079.m59258xd0557130();
        sb6.append(m59258xd05571302 != null ? java.lang.Integer.valueOf(m59258xd05571302.m75939xb282bd08(2)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
        ot0.q qVar = new ot0.q();
        zy2.c cVar = new zy2.c();
        r45.g92 m59239x1309d228 = c14994x9b99c079.m59239x1309d228();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m59239x1309d228, "<set-?>");
        cVar.f558892b = m59239x1309d228;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "shareLiveToConversationImpl coverUrl:" + cVar.f558892b.m75945x2fec8307(5));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).Q6(cVar.f558892b);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).P6(cVar.f558892b);
        java.lang.String string2 = bundle != null ? bundle.getString("instantDiscountActivityKey", "") : null;
        java.lang.String string3 = bundle != null ? bundle.getString("instantDiscountMaskUrl", "") : null;
        r45.g92 g92Var = cVar.f558892b;
        r45.xz3 xz3Var = new r45.xz3();
        xz3Var.set(0, string2);
        xz3Var.set(1, string3);
        g92Var.set(43, xz3Var);
        qVar.f(cVar);
        qVar.f430199i = i18;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        xy2.b bVar = xy2.b.f539688b;
        java.lang.String m75945x2fec8307 = cVar.f558892b.m75945x2fec8307(1);
        pm0.z.b(bVar, "shareLiveToConversationImpl_username_check", !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0), null, null, true, false, null, 108, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", i19);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", bundle != null ? bundle.getBoolean("Retr_show_success_tips", true) : true);
        intent.putExtra("Select_Conv_Type", bundle != null ? java.lang.Integer.valueOf(bundle.getInt("Select_Conv_Type")) : null);
        intent.putExtra("search_range", bundle != null ? bundle.getIntArray("search_range") : null);
        intent.putExtra("Retr_finder_in_stream", true);
        intent.putExtra("content_type_forward_to_wework", 12);
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(activity, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk5Var.f464670i = 8;
            pk5Var.f464665d = 2;
            pk5Var.f464673o = (int) (android.os.SystemClock.elapsedRealtime() - pk5Var.f464676r);
            pk5Var.f464671m = "0";
            pk5Var.f464672n = "0";
            pk5Var.f464675q = "";
            pk5Var.f464669h = bundle != null ? bundle.getInt("quick_share_item_count", 0) : 0;
        }
        l35.a.f396976a.a(activity);
        j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity, ".ui.transmit.MsgRetransmitUI", intent, 1005, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v6(c14994x9b99c079, lVar));
    }

    public final void y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.os.Bundle bundle, int i17, int i18) {
        if (!hc2.o0.f(abstractC14490x69736cb5.getFeedObject().getFeedObject())) {
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            hc2.f1.B(activity, string);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject snsType:");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11());
        sb6.append(' ');
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = abstractC14490x69736cb5.getFeedObject().getFeedObject();
        sb6.append(feedObject != null ? java.lang.Integer.valueOf(feedObject.m76777xba60e801()) : null);
        sb6.append(" to sns,liveId:");
        r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        sb6.append(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null);
        sb6.append(",desc:");
        sb6.append(abstractC14490x69736cb5.getFeedObject().m59226x730bcac6());
        sb6.append(",liveStatus:");
        r45.nw1 m59258xd05571302 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        sb6.append(m59258xd05571302 != null ? java.lang.Integer.valueOf(m59258xd05571302.m75939xb282bd08(2)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareLive", "com.tencent.mm.feature.sns.SnsShareObjectService");
        m21.h hVar = new m21.h();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareLive", "com.tencent.mm.feature.sns.SnsShareObjectService");
        hVar.e(abstractC14490x69736cb5.getFeedObject().m59239x1309d228());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "shareLiveToSnsTimeLineInternal coverUrl:" + hVar.b().m75945x2fec8307(5));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).P6(hVar.b());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).Q6(hVar.b());
        intent.putExtra("ksnsupload_finder_live_xml", hVar.a());
        intent.putExtra("Ksnsupload_type", i18);
        intent.putExtra("need_result", true);
        if ((bundle != null ? bundle.getInt("FinderLiveShareExtraScene") : 0) == 1) {
            intent.putExtra("KSnsPostManu", true);
            intent.putExtra("KTouchCameraTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
            intent.putExtra("sns_comment_type", 1);
            intent.putExtra("Ksnsupload_type", 0);
            intent.putExtra("is_spring", true);
            intent.putExtra("is_from_spring_live", true);
        }
        if (bundle != null) {
            intent.putExtra("need_ban_back_tips", bundle.getBoolean("need_ban_back_tips", false));
        }
        j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity, ".plugin.sns.ui.SnsUploadUI", intent, 1006, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w6(bundle, activity, abstractC14490x69736cb5));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(android.content.Context r23, r45.br2 r24, yz5.l r25, java.lang.String r26, boolean r27, boolean r28, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r29) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.z(android.content.Context, r45.br2, yz5.l, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
