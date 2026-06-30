package com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8 f226533e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8 activityC16321x7ce778f8, java.lang.String str) {
        this.f226533e = activityC16321x7ce778f8;
        this.f226532d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            android.graphics.Bitmap O = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(com.p314xaae8f345.mm.p971x6de15a2e.n.b(this.f226532d, 10000, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059));
            if (O != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.i(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(O, true, com.p314xaae8f345.mm.ui.zk.e(this.f226533e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn))));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginAsExDeviceUI", "download avatar failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LoginAsExDeviceUI", e17, "", new java.lang.Object[0]);
        }
    }
}
