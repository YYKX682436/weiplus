package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class y0 implements r14.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f f243303a;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f activityC17370xd188836f) {
        this.f243303a = activityC17370xd188836f;
    }

    @Override // r14.b
    public void a() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f.f241657u;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f activityC17370xd188836f = this.f243303a;
        db5.e1.K(activityC17370xd188836f, true, activityC17370xd188836f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2g), activityC17370xd188836f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2h), activityC17370xd188836f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2i), activityC17370xd188836f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m0(activityC17370xd188836f), null);
    }

    @Override // r14.b
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f.U6(this.f243303a);
    }

    @Override // r14.b
    public void c(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String str = lp0.b.h0("qrcode_tmp").o() + "mmqrcode-" + java.lang.System.currentTimeMillis() + ".png";
        android.graphics.Bitmap V6 = this.f243303a.V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x0(callback, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f activityC17370xd188836f = this.f243303a;
        activityC17370xd188836f.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g1(V6, str, activityC17370xd188836f, x0Var));
    }

    @Override // r14.b
    public int d() {
        return 99;
    }
}
