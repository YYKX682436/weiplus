package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class r0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 f240002d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var) {
        this.f240002d = v0Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        int a17;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter;
        if (i17 < 0 || i17 >= c22848x6ddd90cf.mo1894x7e414b06() - c22848x6ddd90cf.Z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pf5.o.TAG, "invalid position:" + i17);
            return;
        }
        ox3.a aVar = (ox3.a) c22848x6ddd90cf.m82898xfb7e5820().get(i17);
        aVar.getClass();
        boolean z17 = aVar.f431255e;
        if (z17) {
            if (by3.a.f117903b) {
                b21.m.g();
                ((ll3.j1) ((c21.i) i95.n0.c(c21.i.class))).getClass();
                b21.r b17 = b21.m.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicFloatBallService", "resumeMusicFloatBall %s", b17);
                if ((b17 == null || b17.N) ? false : true) {
                    b17.N = true;
                    b21.m.k(b17);
                }
                ll3.q0.d(b17);
            }
            by3.a.f117903b = false;
            a17 = 1;
        } else {
            a17 = by3.a.f117902a.a();
            if (a17 == 0) {
                return;
            }
        }
        for (ox3.a aVar2 : c22848x6ddd90cf.m82898xfb7e5820()) {
            if (aVar2.mo2128x1ed62e84() != aVar.mo2128x1ed62e84()) {
                aVar2.f431255e = false;
                c22848x6ddd90cf.d0(aVar2.mo2128x1ed62e84(), java.lang.Boolean.FALSE);
            }
        }
        boolean z18 = !z17;
        aVar.f431255e = z18;
        vx3.i a18 = qx3.b.a(aVar.mo2128x1ed62e84());
        if (a18 == null || (str = aVar.f431254d.f497121d) == null) {
            return;
        }
        if (aVar.f431255e) {
            boolean z19 = (a18.f522834r == null || a18.i().f339137b == null || !co4.c.b(a18.i())) ? false : true;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f240002d.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3.class)).Q6(a18, str, z19);
        }
        if (a17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var = this.f240002d;
            long mo2128x1ed62e84 = aVar.mo2128x1ed62e84();
            boolean z27 = aVar.f431255e;
            v0Var.getClass();
            if (a18.j()) {
                android.app.Activity context = v0Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a19 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) a19).R6(a18, 39, 23, (r18 & 8) != 0 ? 0L : 0L, (r18 & 16) != 0 ? "" : null, (r18 & 32) != 0 ? 0 : 0);
                android.app.Activity context2 = v0Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3.class)).O6(a18, str);
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = v0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class)).P6(a18, mo2128x1ed62e84, z27, true, true);
            }
        } else {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.q0(this.f240002d);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(q0Var, 200L, false);
        }
        c22848x6ddd90cf.d0(aVar.mo2128x1ed62e84(), java.lang.Boolean.valueOf(z18));
    }
}
