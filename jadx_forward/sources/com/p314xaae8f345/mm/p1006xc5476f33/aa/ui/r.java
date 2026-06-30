package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f154313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 f154314e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a) {
        this.f154314e = activityC11339x6e0beaf2;
        this.f154313d = c21524xecd57b9a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11339x6e0beaf2 activityC11339x6e0beaf2 = this.f154314e;
        java.lang.String str = activityC11339x6e0beaf2.f153966g;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f154313d;
        android.graphics.Bitmap L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(str, c21524xecd57b9a.getWidth(), c21524xecd57b9a.getHeight());
        int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(activityC11339x6e0beaf2.f153966g).m43592x7a249f0b();
        android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(L, m43592x7a249f0b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewHdHeadImg", "exifPath : %s degree : %d", activityC11339x6e0beaf2.f153966g, java.lang.Integer.valueOf(m43592x7a249f0b));
        activityC11339x6e0beaf2.U6(c21524xecd57b9a, w07);
    }
}
