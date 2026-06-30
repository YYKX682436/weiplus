package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255960e;

    public x8(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255959d = str;
        this.f255960e = activityC18639xf6f98078;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f255959d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "handleFileLocal decodeImg bitmap:" + b17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255960e;
        activityC18639xf6f98078.getClass();
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "setForegroundPic vpic post start " + b17 + " true");
            activityC18639xf6f98078.q7().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ua(b17, activityC18639xf6f98078));
        }
    }
}
