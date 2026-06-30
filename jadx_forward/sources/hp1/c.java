package hp1;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 f364452e;

    public c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 surfaceHolderCallbackC12878x44b43bc9) {
        this.f364451d = str;
        this.f364452e = surfaceHolderCallbackC12878x44b43bc9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 surfaceHolderCallbackC12878x44b43bc9 = this.f364452e;
        android.graphics.Bitmap j07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(this.f364451d, surfaceHolderCallbackC12878x44b43bc9.f174517m, surfaceHolderCallbackC12878x44b43bc9.f174516i, 0.0f);
        if (j07 != null) {
            pm0.v.X(new hp1.b(surfaceHolderCallbackC12878x44b43bc9, j07));
        }
    }
}
