package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.d0 f91132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.h f91133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.appbrand.widget.d0 d0Var, com.tencent.mm.plugin.appbrand.widget.h hVar) {
        super(1);
        this.f91132d = d0Var;
        this.f91133e = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        if (view != null) {
            com.tencent.mm.plugin.appbrand.widget.d0 d0Var = this.f91132d;
            view.setLayoutParams(d0Var.c());
            com.tencent.mm.plugin.appbrand.widget.h hVar = this.f91133e;
            hVar.f91137a.D1.C();
            hVar.f91137a.D1.z(view, d0Var.a());
            hVar.a();
            hVar.e();
        }
        return jz5.f0.f302826a;
    }
}
