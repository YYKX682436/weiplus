package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class zd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f192779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f192781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f192782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(android.graphics.Bitmap bitmap, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar, android.widget.ImageView imageView) {
        super(0);
        this.f192779d = bitmap;
        this.f192780e = i17;
        this.f192781f = afVar;
        this.f192782g = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f192779d;
        int height = bitmap.getHeight();
        android.widget.ImageView imageView = this.f192782g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f192781f;
        if (height != 0 && bitmap.getWidth() != 0) {
            float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af.B1;
            afVar.getClass();
            if (this.f192780e == 0) {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.height = i65.a.b(afVar.m80379x76847179(), 20);
                layoutParams.width = (int) (bitmap.getWidth() * (i65.a.b(afVar.m80379x76847179(), 20) / bitmap.getHeight()));
                imageView.setLayoutParams(layoutParams);
            }
        }
        afVar.f187812y0.add(new jz5.l(imageView, bitmap));
        afVar.c7();
        return jz5.f0.f384359a;
    }
}
