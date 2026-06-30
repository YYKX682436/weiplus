package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes2.dex */
public final class l3 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f148350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f148351b;

    public l3(android.widget.ImageView imageView, yz5.l lVar) {
        this.f148350a = imageView;
        this.f148351b = lVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        yz5.l lVar = this.f148351b;
        android.widget.ImageView imageView = this.f148350a;
        if (bitmap != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.j3(imageView, bitmap, lVar));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.k3(lVar, imageView));
        }
    }
}
