package ru2;

/* loaded from: classes2.dex */
public final class i implements ru2.a {
    @Override // ru2.a
    public void C1(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLifecycleCallback", "onFinderForeground: ".concat(name));
        if (ru2.j.f481276f != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26811xa9bfd794.f57449x6baced52, 1);
        }
        java.util.concurrent.Future future = ru2.j.f481277g;
        if (future != null) {
            future.cancel(false);
        }
        java.util.concurrent.Future future2 = ru2.j.f481278h;
        if (future2 != null) {
            future2.cancel(false);
        }
    }

    @Override // ru2.a
    public void V4(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLifecycleCallback", "onFinderBackground: ".concat(name));
        i95.m c17 = i95.n0.c(zy2.ob.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (du2.j.f325009d.c()) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            eu2.b0 b0Var = (eu2.b0) c18;
            if (b0Var.Zi()) {
                pm0.v.X(new eu2.o(b0Var));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onFinderBackGround] keyGuard is not locked, return!");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[onFinderBackGround] not hit exp, return!");
        }
        ru2.j jVar = ru2.j.f481274d;
        java.util.concurrent.Future future = ru2.j.f481277g;
        if (future != null) {
            future.cancel(false);
        }
        ru2.j.f481277g = jVar.a(ru2.g.f481272d, ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209171c9).mo141623x754a37bb()).r()).intValue(), "releaseUnFocusView");
        java.util.concurrent.Future future2 = ru2.j.f481278h;
        if (future2 != null) {
            future2.cancel(false);
        }
        ru2.j.f481278h = jVar.a(ru2.e.f481270d, ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209190d9).mo141623x754a37bb()).r()).intValue(), "releaseAllView");
    }
}
