package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class zd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f111246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f111247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f111248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f111249g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(android.graphics.Bitmap bitmap, int i17, com.tencent.mm.plugin.finder.feed.af afVar, android.widget.ImageView imageView) {
        super(0);
        this.f111246d = bitmap;
        this.f111247e = i17;
        this.f111248f = afVar;
        this.f111249g = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f111246d;
        int height = bitmap.getHeight();
        android.widget.ImageView imageView = this.f111249g;
        com.tencent.mm.plugin.finder.feed.af afVar = this.f111248f;
        if (height != 0 && bitmap.getWidth() != 0) {
            float f17 = com.tencent.mm.plugin.finder.feed.af.B1;
            afVar.getClass();
            if (this.f111247e == 0) {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.height = i65.a.b(afVar.getContext(), 20);
                layoutParams.width = (int) (bitmap.getWidth() * (i65.a.b(afVar.getContext(), 20) / bitmap.getHeight()));
                imageView.setLayoutParams(layoutParams);
            }
        }
        afVar.f106279y0.add(new jz5.l(imageView, bitmap));
        afVar.c7();
        return jz5.f0.f302826a;
    }
}
