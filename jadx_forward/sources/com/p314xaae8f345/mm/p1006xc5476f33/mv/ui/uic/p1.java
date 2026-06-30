package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes8.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 f232885d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var) {
        this.f232885d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.drawable.Drawable drawable;
        android.view.View view = this.f232885d.f232947e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cl7);
        android.graphics.Bitmap bitmap = (imageView == null || (drawable = imageView.getDrawable()) == null) ? null : ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            return;
        }
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        dVar.f510674b = width;
        dVar.f510675c = height;
        um5.p pVar = dVar.f510677e;
        uq5.b bVar = (uq5.b) pVar.f510726b.g(uq5.k.BlurEffect);
        if (bVar != null) {
            bVar.d(20.0f);
        }
        pVar.f510726b.c(bVar);
        dVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.o1(imageView));
    }
}
