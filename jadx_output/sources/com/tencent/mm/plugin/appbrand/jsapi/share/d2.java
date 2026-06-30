package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.e2 f83127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.appbrand.jsapi.share.e2 e2Var) {
        super(1);
        this.f83127d = e2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.share.t2 shareResult = (com.tencent.mm.plugin.appbrand.jsapi.share.t2) obj;
        kotlin.jvm.internal.o.g(shareResult, "shareResult");
        this.f83127d.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult(shareResult.f83253d));
        return jz5.f0.f302826a;
    }
}
