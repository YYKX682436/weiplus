package qp1;

/* loaded from: classes14.dex */
public final class k implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp1.l f447265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447266e;

    public k(qp1.l lVar, java.lang.String str) {
        this.f447265d = lVar;
        this.f447266e = str;
    }

    @Override // l01.u
    public void b() {
        int o17;
        qp1.l lVar = this.f447265d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = lVar.f447268e;
        if (c12886x91aa2b6d == null || (o17 = qp1.w.o(c12886x91aa2b6d)) == -1) {
            return;
        }
        android.widget.ImageView imageView = lVar.f447267d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = lVar.f447267d;
        if (imageView2 != null) {
            imageView2.setImageResource(o17);
        }
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return this.f447266e;
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            b();
            return;
        }
        qp1.l lVar = this.f447265d;
        android.widget.ImageView imageView = lVar.f447267d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = lVar.f447267d;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        }
    }
}
