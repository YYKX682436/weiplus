package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f221420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 f221421e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var, int i17) {
        this.f221421e = x0Var;
        this.f221420d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String format = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__currentFontSize__= %d; })()", java.lang.Integer.valueOf(this.f221420d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "initFontSize, fontSize:%s", format);
        this.f221421e.o(format, null);
    }
}
