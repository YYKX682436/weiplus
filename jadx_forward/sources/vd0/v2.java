package vd0;

/* loaded from: classes5.dex */
public final class v2 implements r14.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd0.w2 f517057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f517058b;

    public v2(vd0.w2 w2Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f517057a = w2Var;
        this.f517058b = abstractActivityC21394xb3d2c0cf;
    }

    @Override // r14.b
    public void a() {
        this.f517057a.getClass();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f517058b;
        db5.e1.K(abstractActivityC21394xb3d2c0cf, true, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2g), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2h), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2i), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new vd0.q2(abstractActivityC21394xb3d2c0cf), null);
    }

    @Override // r14.b
    public void b() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f517058b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class)).R6();
    }

    @Override // r14.b
    public void c(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String str = lp0.b.h0("qrcode_tmp").o() + "mmqrcode-" + java.lang.System.currentTimeMillis() + ".png";
        vd0.w2 w2Var = this.f517057a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f517058b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.graphics.Bitmap Q6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class)).Q6();
        vd0.u2 u2Var = new vd0.u2(callback, str);
        w2Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new vd0.t2(Q6, str, activity, u2Var));
    }

    @Override // r14.b
    public int d() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f517058b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class)).W6();
    }
}
