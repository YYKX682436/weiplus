package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.o f77687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.appbrand.debugger.console.o oVar) {
        super(0);
        this.f77687d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.appbrand.debugger.console.p pVar = new com.tencent.mm.plugin.appbrand.debugger.console.p(context);
        com.tencent.mm.plugin.appbrand.debugger.console.o oVar = this.f77687d;
        pVar.setOnClickListener(new com.tencent.mm.plugin.appbrand.debugger.console.k(oVar));
        pVar.setOnTouchListener(new com.tencent.mm.plugin.appbrand.debugger.console.l(pVar, oVar));
        return pVar;
    }
}
