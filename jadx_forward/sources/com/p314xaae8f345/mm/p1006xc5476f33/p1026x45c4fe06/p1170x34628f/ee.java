package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class ee implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f168125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f168126b;

    public ee(java.lang.String str, long j17, yz5.l lVar, android.graphics.Bitmap bitmap) {
        this.f168125a = lVar;
        this.f168126b = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        yz5.l lVar = this.f168125a;
        android.graphics.Bitmap bitmap = this.f168126b;
        if (i17 == 0) {
            lVar.mo146xb9724478(bitmap);
        } else {
            gf.l0.f352648a.c(bitmap);
            lVar.mo146xb9724478(null);
        }
    }
}
