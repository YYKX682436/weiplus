package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ra extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(in5.s0 s0Var) {
        super(4);
        this.f104457d = s0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        android.view.MotionEvent motionEvent2 = (android.view.MotionEvent) obj2;
        float floatValue = ((java.lang.Number) obj3).floatValue();
        float floatValue2 = ((java.lang.Number) obj4).floatValue();
        android.content.Context context = this.f104457d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class);
        return java.lang.Boolean.valueOf(finderHorizontalVideoDrawerUIC != null ? finderHorizontalVideoDrawerUIC.T6(motionEvent, motionEvent2, floatValue, floatValue2) : false);
    }
}
