package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class ej implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f210642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f210643e;

    public ej(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        this.f210642d = i17;
        this.f210643e = activityC15076x7a6c76b6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num;
        int i17;
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f210643e;
        int i18 = this.f210642d;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC15076x7a6c76b6.C, "handleFeedActionIfNeeded: unknown feedActionType: " + i18);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = activityC15076x7a6c76b6.G;
                    if (abstractC14490x69736cb5 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15076x7a6c76b6.C, "handleOpenCommentAction");
                        boolean C = zl2.q4.f555466a.C(abstractC14490x69736cb5);
                        bd2.b bVar = bd2.b.f100777a;
                        if (C) {
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15076x7a6c76b6.mo55332x76847179();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                            i95.m c17 = i95.n0.c(zy2.zb.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            zy2.zb zbVar = (zy2.zb) c17;
                            ml2.t1 t1Var = ml2.t1.f409469b2;
                            jz5.l[] lVarArr = new jz5.l[3];
                            r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
                            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null));
                            lVarArr[1] = new jz5.l("feedId", pm0.v.u(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
                            lVarArr[2] = new jz5.l("panel_sence", "1");
                            zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), V6 != null ? V6.m75945x2fec8307(1) : null, java.lang.String.valueOf(V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null), abstractC14490x69736cb5.g0(), null, false, 96, null);
                            r45.nw1 m59258xd05571302 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
                            if (m59258xd05571302 != null) {
                                long m75942xfb822ef2 = m59258xd05571302.m75942xfb822ef2(0);
                                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC15076x7a6c76b6.mo55332x76847179();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = activityC15076x7a6c76b6.mo55332x76847179();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471793, "getContext(...)");
                                bVar.j(mo55332x768471792, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x768471793).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), m75942xfb822ef2, abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : abstractC14490x69736cb5);
                            }
                        } else {
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = activityC15076x7a6c76b6.mo55332x76847179();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471794, "getContext(...)");
                            bd2.b.c(bVar, mo55332x768471794, abstractC14490x69736cb5, 0L, 0, 12, null);
                        }
                    }
                }
                z17 = false;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var = activityC15076x7a6c76b6.E;
                java.lang.String str = activityC15076x7a6c76b6.C;
                if (w8Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleOpenCommentAction: viewCallback is not initialized");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = activityC15076x7a6c76b6.G;
                    if (abstractC14490x69736cb52 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleOpenHalfScreenProfileAction");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var2 = activityC15076x7a6c76b6.E;
                        if (w8Var2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 g17 = w8Var2.g();
                        if (g17 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var3 = activityC15076x7a6c76b6.E;
                            if (w8Var3 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                                throw null;
                            }
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = w8Var3.m56068x4905e9fa().q0(0, false);
                            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                            if (s0Var != null) {
                                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471795 = activityC15076x7a6c76b6.mo55332x76847179();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471795, "getContext(...)");
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) pf5.z.f435481a.a(mo55332x768471795).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class)).P6(null, abstractC14490x69736cb52, s0Var, g17);
                                if (ya2.d.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i).getContact())) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkJumpProfile: contact, notExist");
                                } else {
                                    int intExtra = activityC15076x7a6c76b6.getIntent().getIntExtra("key_card_type", 0);
                                    android.content.Context mo55332x768471796 = activityC15076x7a6c76b6.mo55332x76847179();
                                    if (mo55332x768471796 == null) {
                                        mo55332x768471796 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                    }
                                    int c18 = com.p314xaae8f345.mm.ui.bl.c(mo55332x768471796);
                                    android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                    int i19 = b17.x;
                                    int i27 = b17.y;
                                    java.lang.System.nanoTime();
                                    boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
                                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                    if (z18) {
                                        i17 = i27 - c18;
                                    } else {
                                        if (i27 >= i19) {
                                            i19 = i27;
                                        }
                                        i17 = i19 - c18;
                                    }
                                    int a17 = (int) (i17 * kx2.a.f394811a.a(s0Var.f374654e));
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m3 m3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m3.f183914a;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = activityC15076x7a6c76b6.D;
                                    if (qmVar == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                                        throw null;
                                    }
                                    m3Var.a(s0Var, abstractC14490x69736cb52, qmVar, intExtra, a17, false, 0);
                                }
                            }
                        }
                    }
                }
                num = null;
                z17 = false;
            }
            num = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var4 = activityC15076x7a6c76b6.E;
            java.lang.String str3 = activityC15076x7a6c76b6.C;
            if (w8Var4 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "handleOpenCommentAction: viewCallback is not initialized");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = activityC15076x7a6c76b6.G;
                if (abstractC14490x69736cb53 != null) {
                    long longExtra = activityC15076x7a6c76b6.getIntent().getLongExtra("key_ref_comment_id", 0L);
                    boolean z19 = longExtra != 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "handleOpenCommentAction, refCommentId: " + longExtra + ", blinkRefComment: " + z19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var5 = activityC15076x7a6c76b6.E;
                    if (w8Var5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 g18 = w8Var5.g();
                    if (g18 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var6 = activityC15076x7a6c76b6.E;
                        if (w8Var6 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                            throw null;
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q08 = w8Var6.m56068x4905e9fa().q0(0, false);
                        in5.s0 s0Var2 = q08 instanceof in5.s0 ? (in5.s0) q08 : null;
                        if (s0Var2 != null) {
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471797 = activityC15076x7a6c76b6.mo55332x76847179();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471797, "getContext(...)");
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) pf5.z.f435481a.a(mo55332x768471797).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class)).P6(null, abstractC14490x69736cb53, s0Var2, g18);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5.c(g18, abstractC14490x69736cb53.getFeedObject(), false, longExtra, z19, false, null, false, 0, null, false, 0L, 0, 0, null, 0, 32754, null);
                    }
                    num = null;
                }
            }
            z17 = false;
            num = null;
        }
        if (z17) {
            activityC15076x7a6c76b6.H = num;
        }
        activityC15076x7a6c76b6.I = false;
    }
}
