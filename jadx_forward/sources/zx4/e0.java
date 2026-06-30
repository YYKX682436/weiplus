package zx4;

/* loaded from: classes8.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f558653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f558654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f558655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f558656g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f558657h;

    public e0(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, yz5.a aVar, yz5.a aVar2) {
        this.f558653d = bitmap;
        this.f558654e = str;
        this.f558655f = str2;
        this.f558656g = aVar;
        this.f558657h = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f558653d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f558654e);
        try {
            zx4.b0 b0Var = new zx4.b0(this.f558655f, this.f558653d);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.o0(r6Var.o(), b0Var);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f558655f)) {
                android.media.ExifInterface exifInterface = new android.media.ExifInterface(r6Var.o());
                exifInterface.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3310x158f2670, this.f558655f);
                exifInterface.saveAttributes();
            }
            ((ku5.t0) ku5.t0.f394148d).B(new zx4.c0(this.f558656g));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", e17.toString());
            ((ku5.t0) ku5.t0.f394148d).B(new zx4.d0(this.f558657h));
        }
    }
}
