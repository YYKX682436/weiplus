package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class bb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(in5.s0 s0Var) {
        super(0);
        this.f102956d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f102956d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class);
        if (finderHorizontalVideoDrawerUIC != null && finderHorizontalVideoDrawerUIC.f133590g) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.o(finderHorizontalVideoDrawerUIC.Q6(), 0, false, null, false, null, 31, null);
            finderHorizontalVideoDrawerUIC.f133590g = false;
        }
        return jz5.f0.f302826a;
    }
}
