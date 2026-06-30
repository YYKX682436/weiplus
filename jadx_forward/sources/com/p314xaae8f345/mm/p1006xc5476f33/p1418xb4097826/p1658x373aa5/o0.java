package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f214286d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f214287e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.y0 f214288f;

    /* renamed from: g, reason: collision with root package name */
    public final int f214289g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p0 f214290h;

    public o0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, so2.y0 commentItem, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p0 p0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        this.f214286d = context;
        this.f214287e = feedObject;
        this.f214288f = commentItem;
        this.f214289g = i18;
        this.f214290h = p0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p0 p0Var = this.f214290h;
            so2.y0 y0Var = this.f214288f;
            if (itemId == 17) {
                if (p0Var != null) {
                    p0Var.f(y0Var);
                    return;
                }
                return;
            }
            if (itemId == 13) {
                if (p0Var != null) {
                    p0Var.d(y0Var, false);
                    return;
                }
                return;
            }
            if (itemId == 14) {
                if (p0Var != null) {
                    p0Var.d(y0Var, true);
                    return;
                }
                return;
            }
            if (itemId == 6) {
                if (p0Var != null) {
                    p0Var.a(y0Var, false);
                    return;
                }
                return;
            }
            if (itemId == 7) {
                if (p0Var != null) {
                    p0Var.a(y0Var, true);
                    return;
                }
                return;
            }
            if (itemId == 0) {
                java.lang.String i18 = y0Var.i();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18)) {
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(i18);
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                long t07 = y0Var.f492236d.t0();
                o3Var.getClass();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd c5460x2aa780cd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd();
                am.wa waVar = c5460x2aa780cd.f135799g;
                waVar.f89806a = 5;
                waVar.f89807b = t07;
                c5460x2aa780cd.e();
                return;
            }
            int i19 = this.f214289g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = this.f214287e;
            android.content.Context context = this.f214286d;
            if (itemId == 5) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 comment = y0Var.f492236d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.k0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
                nv2.n1.f422084h.e(feedObject.m59251x5db1b11(), feedObject.m59229xb5af1dd5(), feedObject.m59276x6c285d75(), comment, nv2.x1.f422161f, (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j().r()).intValue() == 1 || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M != 1) ? i19 : 1, k0Var, V6, hc2.o0.H(feedObject.getFeedObject()), null, 0, null);
                return;
            }
            if (itemId == 1) {
                if (p0Var != null) {
                    p0Var.c(y0Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                long t08 = y0Var.f492236d.t0();
                o3Var2.getClass();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd c5460x2aa780cd2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd();
                am.wa waVar2 = c5460x2aa780cd2.f135799g;
                waVar2.f89806a = 4;
                waVar2.f89807b = t08;
                c5460x2aa780cd2.e();
                return;
            }
            if (itemId == 2) {
                if (p0Var != null) {
                    p0Var.e(y0Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                long t09 = y0Var.f492236d.t0();
                o3Var3.getClass();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd c5460x2aa780cd3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5460x2aa780cd();
                am.wa waVar3 = c5460x2aa780cd3.f135799g;
                waVar3.f89806a = 6;
                waVar3.f89807b = t09;
                c5460x2aa780cd3.e();
                return;
            }
            if (itemId == 3) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj(o3Var4, context2, 11L, 4L, false, 0, 0, null, 120, null);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
                k0Var2.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ckh), 17, i65.a.b(context, 14), null);
                k0Var2.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m0(context, this);
                k0Var2.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.n0(this);
                k0Var2.f293425z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h0(y0Var, feedObject, context, i19);
                k0Var2.v();
                return;
            }
            if (itemId != 4) {
                if (itemId == 999) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = y0Var.f492236d;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(yj0Var != null ? yj0Var.m60789x9616526c() : null);
                    return;
                }
                return;
            }
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj(o3Var5, context3, 11L, 111L, false, 0, 0, null, 120, null);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y yVar = hb2.y.f361647e;
            long mo2128x1ed62e84 = y0Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = y0Var.f492236d;
            long j17 = yj0Var2.f68959xf9a02e3e;
            java.lang.String str = yj0Var2.f68962x2812d6a6;
            if (str == null) {
                str = "";
            }
            yVar.o(mo2128x1ed62e84, j17, str, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.l0(this));
        }
    }
}
