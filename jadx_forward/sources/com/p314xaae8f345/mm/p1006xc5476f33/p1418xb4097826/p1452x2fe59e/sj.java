package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class sj implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f190524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj f190525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f190526c;

    public sj(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar, android.widget.ImageView imageView2) {
        this.f190524a = imageView;
        this.f190525b = xjVar;
        this.f190526c = imageView2;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f190524a;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(this.f190525b.f192605a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560034l)));
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        android.widget.ImageView imageView2 = this.f190526c;
        int width = imageView2.getWidth();
        int height = imageView2.getHeight();
        dVar.f510674b = width;
        dVar.f510675c = height;
        uq5.b b17 = dVar.f510677e.f510726b.b();
        b17.d(20.0f);
        b17.e(5.0f);
        dVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rj(imageView2));
    }
}
