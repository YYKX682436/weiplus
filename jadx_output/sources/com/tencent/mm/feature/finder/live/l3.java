package com.tencent.mm.feature.finder.live;

/* loaded from: classes2.dex */
public final class l3 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f66817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66818b;

    public l3(android.widget.ImageView imageView, yz5.l lVar) {
        this.f66817a = imageView;
        this.f66818b = lVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        yz5.l lVar = this.f66818b;
        android.widget.ImageView imageView = this.f66817a;
        if (bitmap != null) {
            pm0.v.X(new com.tencent.mm.feature.finder.live.j3(imageView, bitmap, lVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.X(new com.tencent.mm.feature.finder.live.k3(lVar, imageView));
        }
    }
}
