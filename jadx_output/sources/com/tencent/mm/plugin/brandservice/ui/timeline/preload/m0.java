package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f94358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.lang.String str, yz5.l lVar) {
        super(1);
        this.f94357d = str;
        this.f94358e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsruntime.r jsContext = (com.tencent.mm.plugin.appbrand.jsruntime.r) obj;
        kotlin.jvm.internal.o.g(jsContext, "jsContext");
        ((com.tencent.mm.plugin.appbrand.jsruntime.n) jsContext).evaluateJavascript(this.f94357d, new com.tencent.mm.plugin.brandservice.ui.timeline.preload.l0(this.f94358e));
        return jz5.f0.f302826a;
    }
}
