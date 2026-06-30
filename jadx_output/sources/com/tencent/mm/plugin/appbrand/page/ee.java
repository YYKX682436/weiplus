package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ee implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f86593b;

    public ee(java.lang.String str, long j17, yz5.l lVar, android.graphics.Bitmap bitmap) {
        this.f86592a = lVar;
        this.f86593b = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        yz5.l lVar = this.f86592a;
        android.graphics.Bitmap bitmap = this.f86593b;
        if (i17 == 0) {
            lVar.invoke(bitmap);
        } else {
            gf.l0.f271115a.c(bitmap);
            lVar.invoke(null);
        }
    }
}
