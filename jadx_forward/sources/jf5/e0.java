package jf5;

/* loaded from: classes9.dex */
public final class e0 implements jf5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f380982a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f380983b;

    public e0(android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f380982a = activity;
        this.f380983b = msg;
    }

    @Override // jf5.m0
    public void a(java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(selectedText);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        android.app.Activity activity = this.f380982a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
        e4Var.f293309c = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.f293312f = false;
        e4Var.c();
    }

    @Override // jf5.m0
    public boolean b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        return !c01.ia.A(this.f380983b);
    }

    @Override // jf5.m0
    public boolean c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f380983b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public boolean d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f380983b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host, java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        android.app.Activity activity = this.f380982a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f380983b;
        te5.x0.b(activity, selectedText, f9Var.Q0(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(f9Var.V1(), f9Var.Q0()), f9Var.I0(), 4, host.p());
    }

    @Override // jf5.m0
    public void g(java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(this.f380983b, this.f380982a, new jf5.d0(this, selectedText));
    }

    @Override // jf5.m0
    public void h(java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, selectedText, 1);
        android.app.Activity activity = this.f380982a;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87856i = activity;
        c4Var.f87860m = 43;
        r45.bq0 bq0Var = c4Var.f87848a;
        r45.jq0 jq0Var = bq0Var != null ? bq0Var.f452495d : null;
        if (jq0Var != null) {
            jq0Var.e(c01.z1.r());
            jq0Var.j(this.f380983b.Q0());
            c5303xc75d2f73.e();
        }
    }
}
