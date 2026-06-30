package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f92168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlinx.coroutines.q qVar) {
        super(1);
        this.f92168d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.service.CdpCommandResponse response = (com.tencent.mm.plugin.appbrand.service.CdpCommandResponse) obj;
        kotlin.jvm.internal.o.g(response, "response");
        ((kotlinx.coroutines.r) this.f92168d).s(response, null);
        return jz5.f0.f302826a;
    }
}
