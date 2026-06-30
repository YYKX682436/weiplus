package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class z3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 f243339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 activityC17397x56ca4f48) {
        super(1);
        this.f243339d = activityC17397x56ca4f48;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        int i19;
        int i27;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48 activityC17397x56ca4f48 = this.f243339d;
        activityC17397x56ca4f48.f241754d = booleanValue;
        java.lang.String str3 = activityC17397x56ca4f48.f241769v;
        boolean z17 = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_sns_switch")) {
            activityC17397x56ca4f48.b7(booleanValue, 32768);
            i17 = 0;
        } else {
            boolean z18 = true;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_scan_switch")) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_search_switch")) {
                    boolean z19 = activityC17397x56ca4f48.f241765r;
                    if (z19 && activityC17397x56ca4f48.f241768u && booleanValue) {
                        v24.o0.i(activityC17397x56ca4f48, 2097152L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g4(activityC17397x56ca4f48, booleanValue), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h4(booleanValue, activityC17397x56ca4f48), 2);
                        i17 = -1;
                    } else {
                        i19 = 3;
                        if (z19 && activityC17397x56ca4f48.f241768u && !booleanValue) {
                            java.lang.String string = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijy);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            java.lang.String string2 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijx);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            activityC17397x56ca4f48.X6(booleanValue, 3, string, string2, null, "");
                            i27 = i19;
                            i17 = i27;
                            z17 = z18;
                        } else {
                            if (booleanValue) {
                                activityC17397x56ca4f48.a7(booleanValue, 2097152L, 50);
                            } else {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) ((su4.g1) i95.n0.c(su4.g1.class))).wi();
                                activityC17397x56ca4f48.a7(booleanValue, 2097152L, 50);
                            }
                            i17 = i19;
                        }
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_shopping_switch")) {
                    activityC17397x56ca4f48.a7(booleanValue, 4194304L, 51);
                    i17 = 6;
                } else {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_game_switch")) {
                        i18 = 7;
                        boolean z27 = activityC17397x56ca4f48.f241765r;
                        if (z27 && activityC17397x56ca4f48.f241768u && booleanValue) {
                            v24.o0.i(activityC17397x56ca4f48, 8388608L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i4(activityC17397x56ca4f48, booleanValue), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.j4(booleanValue, activityC17397x56ca4f48), 2);
                            z18 = z17;
                            i27 = i18;
                        } else if (z27 && activityC17397x56ca4f48.f241768u && !booleanValue) {
                            java.lang.String string3 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lxr);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                            java.lang.String string4 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lxq);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                            java.lang.String string5 = activityC17397x56ca4f48.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571889so);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string5);
                            activityC17397x56ca4f48.X6(booleanValue, 7, string3, string4, null, string5);
                            i27 = i18;
                        } else {
                            activityC17397x56ca4f48.a7(booleanValue, 8388608L, 52);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(848L, booleanValue ? 0L : 1L, 1L, false);
                            i17 = 7;
                        }
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_miniprogram_switch")) {
                        boolean z28 = activityC17397x56ca4f48.f241765r;
                        if (z28 && activityC17397x56ca4f48.f241768u && booleanValue) {
                            v24.o0.i(activityC17397x56ca4f48, 16777216L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k4(activityC17397x56ca4f48, booleanValue), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l4(booleanValue, activityC17397x56ca4f48), 2);
                            i17 = -1;
                        } else if (z28 && activityC17397x56ca4f48.f241768u && !booleanValue) {
                            i19 = 8;
                            java.lang.String string6 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iju);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                            java.lang.String string7 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijt);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
                            activityC17397x56ca4f48.X6(booleanValue, 8, string6, string7, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m4(activityC17397x56ca4f48, booleanValue), "");
                            z17 = true;
                            i17 = i19;
                        } else {
                            activityC17397x56ca4f48.a7(booleanValue, 16777216L, 53);
                            if (!booleanValue) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Ai();
                            }
                            i17 = 8;
                        }
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_wechatout_switch")) {
                        activityC17397x56ca4f48.a7(booleanValue, 33554432L, 54);
                        i17 = 9;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_shake_switch")) {
                        activityC17397x56ca4f48.b7(booleanValue, 256);
                        i17 = 2;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_nearby_switch")) {
                        activityC17397x56ca4f48.b7(booleanValue, 512);
                        i17 = 4;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_nearby_live_friend_switch")) {
                        activityC17397x56ca4f48.a7(booleanValue, 70368744177664L, 61);
                        long j17 = booleanValue ? 1L : 0L;
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581 c6392xb3465581 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581();
                        c6392xb3465581.f137370d = 12L;
                        c6392xb3465581.f137371e = j17;
                        c6392xb3465581.f137372f = 1L;
                        c6392xb3465581.k();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FindMoreSettingReport", "reportSwitch " + c6392xb3465581.n());
                        i17 = 12;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_look_switch")) {
                        boolean z29 = activityC17397x56ca4f48.f241765r;
                        i19 = 10;
                        if (z29 && activityC17397x56ca4f48.f241768u && booleanValue) {
                            v24.o0.i(activityC17397x56ca4f48, 67108864L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n4(activityC17397x56ca4f48, booleanValue), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o4(booleanValue, activityC17397x56ca4f48), 2);
                        } else if (activityC17397x56ca4f48.f241766s || !z29 || !activityC17397x56ca4f48.f241768u || booleanValue) {
                            activityC17397x56ca4f48.Y6(booleanValue);
                        } else {
                            java.lang.String string8 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574517ik0);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
                            java.lang.String string9 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijz);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string9, "getString(...)");
                            activityC17397x56ca4f48.X6(booleanValue, 10, string8, string9, null, "");
                            i27 = i19;
                        }
                        i17 = i19;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_finder_switch")) {
                        boolean z37 = activityC17397x56ca4f48.f241765r;
                        i19 = 11;
                        if (z37 && activityC17397x56ca4f48.f241768u && booleanValue) {
                            v24.o0.i(activityC17397x56ca4f48, 34359738368L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.c4(activityC17397x56ca4f48, booleanValue), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d4(booleanValue, activityC17397x56ca4f48), 2);
                        } else if (z37 && activityC17397x56ca4f48.f241768u && !booleanValue) {
                            java.lang.String string10 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijw);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string10, "getString(...)");
                            java.lang.String string11 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijv);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string11, "getString(...)");
                            activityC17397x56ca4f48.X6(booleanValue, 11, string10, string11, null, "");
                            i27 = i19;
                        } else {
                            activityC17397x56ca4f48.a7(booleanValue, 34359738368L, 57);
                        }
                        i17 = i19;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi())) {
                        i18 = 13;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryFinderLive.k(activityC17397x56ca4f48, null)) {
                            boolean z38 = activityC17397x56ca4f48.f241765r;
                            if (z38 && activityC17397x56ca4f48.f241768u && booleanValue) {
                                str = "reportSwitch ";
                                str2 = "FindMoreSettingReport";
                                v24.o0.i(activityC17397x56ca4f48, 9007199254740992L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e4(activityC17397x56ca4f48, booleanValue), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f4(booleanValue, activityC17397x56ca4f48), 2);
                            } else {
                                str = "reportSwitch ";
                                str2 = "FindMoreSettingReport";
                                if (z38 && activityC17397x56ca4f48.f241768u && !booleanValue) {
                                    java.lang.String string12 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.phh);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string12, "getString(...)");
                                    java.lang.String string13 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.phg);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string13, "getString(...)");
                                    java.lang.String string14 = activityC17397x56ca4f48.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohr);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string14, "getString(...)");
                                    activityC17397x56ca4f48.X6(booleanValue, 13, string12, string13, null, string14);
                                    z17 = true;
                                } else {
                                    activityC17397x56ca4f48.a7(booleanValue, 9007199254740992L, 65);
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch finderlive 65");
                            long j18 = booleanValue ? 1L : 0L;
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581 c6392xb34655812 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581();
                            c6392xb34655812.f137370d = 13L;
                            c6392xb34655812.f137371e = j18;
                            c6392xb34655812.f137372f = 1L;
                            c6392xb34655812.k();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str + c6392xb34655812.n());
                            z18 = z17;
                            i27 = i18;
                        }
                    } else {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "settings_ting_switch")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch ting isShow: %s", java.lang.Boolean.valueOf(booleanValue));
                            activityC17397x56ca4f48.Z6(booleanValue, 32768L);
                            i17 = 14;
                        }
                        i17 = -1;
                    }
                    i17 = i27;
                    z17 = z18;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48.U6(activityC17397x56ca4f48, booleanValue);
                l14.b.f396527a.c(booleanValue, activityC17397x56ca4f48.f241769v, 1L, activityC17397x56ca4f48.f241757g);
                return jz5.f0.f384359a;
            }
            activityC17397x56ca4f48.a7(booleanValue, 1048576L, 49);
            i17 = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingManageFindMoreDetailUI", "needShowCloseSwitchDilaogTips = %s", java.lang.Boolean.valueOf(z17));
        if (!z17 && i17 >= 0) {
            activityC17397x56ca4f48.f241763p.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(booleanValue ? 1 : 0));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48.U6(activityC17397x56ca4f48, booleanValue);
        l14.b.f396527a.c(booleanValue, activityC17397x56ca4f48.f241769v, 1L, activityC17397x56ca4f48.f241757g);
        return jz5.f0.f384359a;
    }
}
