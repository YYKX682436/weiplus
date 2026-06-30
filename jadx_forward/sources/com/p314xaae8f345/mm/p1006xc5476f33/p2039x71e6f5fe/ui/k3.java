package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public final class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f241110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f241111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 f241112f;

    public k3(int i17, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65) {
        this.f241110d = i17;
        this.f241111e = bitmap;
        this.f241112f = activityC17308x95e1b65;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("drawTranslationResult() called with: session = ");
        int i17 = this.f241110d;
        sb6.append(i17);
        sb6.append(", newBitmap = ");
        android.graphics.Bitmap bitmap = this.f241111e;
        sb6.append(bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationResultUI", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65 = this.f241112f;
        if (i17 == activityC17308x95e1b65.f240924x) {
            if (bitmap == null) {
                activityC17308x95e1b65.X6(null);
                return;
            }
            activityC17308x95e1b65.C.f141283i = (int) (java.lang.System.currentTimeMillis() - activityC17308x95e1b65.D[1]);
            activityC17308x95e1b65.f240918r = bitmap;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65.U6(activityC17308x95e1b65);
            activityC17308x95e1b65.Z6(activityC17308x95e1b65.f240918r);
        }
    }
}
