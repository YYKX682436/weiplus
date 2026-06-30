package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class nn extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f216871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f216871d = new p012xc85e97e9.p093xedfae76a.j0(null);
    }

    public final bs2.a0 O6() {
        bs2.n1 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).R6(35);
        if (R6 instanceof bs2.a0) {
            return (bs2.a0) R6;
        }
        return null;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        i95.m c17 = i95.n0.c(u60.g.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.m(this);
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((ey2.k0) a17).f338946g.mo630x9b865cc(z17, f17, f18, i17, d17, d18, d19);
        i95.m c18 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209579yg).mo141623x754a37bb()).r()).booleanValue();
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f216871d;
        if (booleanValue) {
            j0Var.mo523x53d8522f(new java.lang.Object());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLbsSameCityTabUIC", "force refresh!");
            return false;
        }
        ey2.d0 d0Var = new ey2.d0(f17, f18, 0L, 4, null);
        bs2.a0 O6 = O6();
        ey2.d0 d0Var2 = O6 != null ? O6.D : null;
        if (d0Var2 == null || j0Var.mo3195x754a37bb() != null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var2, d0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLbsSameCityTabUIC", "oldLocation: " + d0Var2 + ", oldLocation equals to newLocation = " + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var2, d0Var) + ", needRefreshTab: " + j0Var.mo3195x754a37bb());
            return false;
        }
        i95.m c19 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        if (((cq.k) c19).f302761i != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(r1.intValue());
            java.lang.Long l17 = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1)) > 0 ? valueOf : null;
            if (l17 != null) {
                long longValue = l17.longValue();
                double d27 = d0Var2.f338872b;
                double d28 = d0Var2.f338871a;
                double d29 = d0Var.f338872b;
                double d37 = d0Var.f338871a;
                double radians = java.lang.Math.toRadians(d29 - d27);
                double radians2 = java.lang.Math.toRadians(d37 - d28);
                double d38 = 2;
                double d39 = radians / d38;
                double d47 = radians2 / d38;
                double sin = (java.lang.Math.sin(d39) * java.lang.Math.sin(d39)) + (java.lang.Math.cos(java.lang.Math.toRadians(d27)) * java.lang.Math.cos(java.lang.Math.toRadians(d29)) * java.lang.Math.sin(d47) * java.lang.Math.sin(d47));
                if (6371000 * d38 * java.lang.Math.atan2(java.lang.Math.sqrt(sin), java.lang.Math.sqrt(1 - sin)) > longValue) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLbsSameCityTabUIC", "location has changed, need Refresh Tab!");
                    j0Var.mo7808x76db6cb1(new java.lang.Object());
                }
            }
        }
        return false;
    }
}
