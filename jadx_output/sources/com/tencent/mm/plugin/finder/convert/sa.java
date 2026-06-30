package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sa extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(in5.s0 s0Var) {
        super(4);
        this.f104532d = s0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        android.view.MotionEvent e27 = (android.view.MotionEvent) obj2;
        float floatValue = ((java.lang.Number) obj3).floatValue();
        float floatValue2 = ((java.lang.Number) obj4).floatValue();
        kotlin.jvm.internal.o.g(e17, "e1");
        kotlin.jvm.internal.o.g(e27, "e2");
        android.content.Context context = this.f104532d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class);
        return java.lang.Boolean.valueOf(finderHorizontalVideoDrawerUIC != null ? finderHorizontalVideoDrawerUIC.Q6().onFling(e17, e27, floatValue, floatValue2) : false);
    }
}
