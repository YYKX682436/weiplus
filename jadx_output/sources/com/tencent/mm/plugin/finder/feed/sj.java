package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class sj implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f108991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f108992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f108993c;

    public sj(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.feed.xj xjVar, android.widget.ImageView imageView2) {
        this.f108991a = imageView;
        this.f108992b = xjVar;
        this.f108993c = imageView2;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f108991a;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(this.f108992b.f111072a.getResources().getColor(com.tencent.mm.R.color.f478501l)));
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        android.widget.ImageView imageView2 = this.f108993c;
        int width = imageView2.getWidth();
        int height = imageView2.getHeight();
        dVar.f429141b = width;
        dVar.f429142c = height;
        uq5.b b17 = dVar.f429144e.f429193b.b();
        b17.d(20.0f);
        b17.e(5.0f);
        dVar.a(new com.tencent.mm.plugin.finder.feed.rj(imageView2));
    }
}
