package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f267345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f267346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double[] f267347g;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c, double d17, double d18, double[] dArr) {
        this.f267344d = viewOnClickListenerC19428xb021cc2c;
        this.f267345e = d17;
        this.f267346f = d18;
        this.f267347g = dArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a67750;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267344d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a677502 = viewOnClickListenerC19428xb021cc2c.f267261z;
        if (c19737x80a677502 != null) {
            c19737x80a677502.mo61298xa7077af8((int) this.f267345e);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a677503 = viewOnClickListenerC19428xb021cc2c.f267261z;
        if (c19737x80a677503 != null) {
            c19737x80a677503.a((int) this.f267346f);
        }
        double[] dArr = this.f267347g;
        if (dArr != null) {
            if (!(!(dArr.length == 0)) || (c19737x80a67750 = viewOnClickListenerC19428xb021cc2c.f267261z) == null) {
                return;
            }
            c19737x80a67750.v((int) dArr[dArr.length - 1]);
        }
    }
}
