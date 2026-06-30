package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class z8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.h9 f87314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.tencent.mm.plugin.appbrand.page.h9 h9Var) {
        super(0);
        this.f87314d = h9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.page.h9 h9Var = this.f87314d;
        android.view.ViewGroup.LayoutParams layoutParams = h9Var.f86680e.f352887m.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        p91.b bVar = h9Var.f86680e;
        bVar.f352887m.setVisibility(8);
        bVar.f352880f.setVisibility(0);
        return jz5.f0.f302826a;
    }
}
