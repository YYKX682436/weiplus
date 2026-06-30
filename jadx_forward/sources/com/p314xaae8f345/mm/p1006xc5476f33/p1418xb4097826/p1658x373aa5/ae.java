package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class ae implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f213167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 f213168e;

    public ae(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165) {
        this.f213167d = bitmap;
        this.f213168e = c15317x5870b165;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView m62169x4cca5d71;
        android.widget.ImageView m62169x4cca5d712;
        android.widget.ImageView m62169x4cca5d713;
        android.widget.ImageView m62169x4cca5d714;
        android.graphics.Bitmap bitmap = this.f213167d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165 = this.f213168e;
        m62169x4cca5d71 = c15317x5870b165.m62169x4cca5d71();
        m62169x4cca5d71.setVisibility(0);
        m62169x4cca5d712 = c15317x5870b165.m62169x4cca5d71();
        android.view.ViewGroup.LayoutParams layoutParams = m62169x4cca5d712.getLayoutParams();
        m62169x4cca5d713 = c15317x5870b165.m62169x4cca5d71();
        layoutParams.width = (int) (m62169x4cca5d713.getHeight() * (bitmap.getWidth() / bitmap.getHeight()));
        m62169x4cca5d714 = c15317x5870b165.m62169x4cca5d71();
        m62169x4cca5d714.setImageBitmap(bitmap);
    }
}
