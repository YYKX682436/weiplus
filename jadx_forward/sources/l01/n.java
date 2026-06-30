package l01;

/* loaded from: classes7.dex */
public final class n implements l01.v {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f396314a = new l01.m(this, 31457280);

    public android.graphics.Bitmap a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        synchronized (this.f396314a) {
            java.lang.ref.Reference reference = (java.lang.ref.Reference) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f396314a).get(str);
            if (reference == null) {
                return null;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) reference.get();
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f396314a).m77803xc84af884(str);
            return null;
        }
    }

    public void b(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || bitmap == null) {
            return;
        }
        try {
            synchronized (this.f396314a) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f396314a).put(str, new java.lang.ref.SoftReference(bitmap));
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }
}
