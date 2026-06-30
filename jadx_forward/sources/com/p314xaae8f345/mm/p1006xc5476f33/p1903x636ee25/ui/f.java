package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes4.dex */
public final class f implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 f232270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232271e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 c16629x1032f0d1, java.lang.String str) {
        this.f232270d = c16629x1032f0d1;
        this.f232271e = str;
    }

    @Override // l01.u
    public void b() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1.f232207i;
        this.f232270d.a();
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return this.f232271e;
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 c16629x1032f0d1 = this.f232270d;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1.f232207i;
            c16629x1032f0d1.a();
            return;
        }
        android.widget.ImageView imageView = c16629x1032f0d1.f232208d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = c16629x1032f0d1.f232208d;
        if (imageView2 != null) {
            imageView2.setPadding(0, 0, 0, 0);
        }
        android.widget.ImageView imageView3 = c16629x1032f0d1.f232208d;
        if (imageView3 != null) {
            imageView3.setImageBitmap(bitmap);
        }
    }
}
