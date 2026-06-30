package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class z1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72187h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj) {
        super(j17, obj);
        this.f72187h = g1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        this.f72187h.f71988f = 0L;
        com.tencent.mars.WeChatMars.onNetworkChange();
        if (!com.tencent.paymars.WeChatMars.isEnable()) {
            return null;
        }
        com.tencent.paymars.WeChatMars.onNetworkChange();
        return null;
    }
}
