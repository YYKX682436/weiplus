package wu2;

/* loaded from: classes2.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f531220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 f531221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f531222f;

    public l(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 c15118xbecd3ba3, java.lang.String str) {
        this.f531220d = bitmap;
        this.f531221e = c15118xbecd3ba3;
        this.f531222f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f531220d;
        if (bitmap != null) {
            java.lang.String str = this.f531222f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 c15118xbecd3ba3 = this.f531221e;
            c15118xbecd3ba3.y0().mo56583xbf7c1df6(hc2.x0.l(str, c15118xbecd3ba3.y0(), '#', new android.graphics.drawable.BitmapDrawable(bitmap), com.p314xaae8f345.mm.R.C30859x5a72f63.a0c, (int) c15118xbecd3ba3.y0().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0, 0, 0, 224, null));
        }
    }
}
