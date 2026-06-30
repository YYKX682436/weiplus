package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class o1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f72091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f72092i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f72093j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72094k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.util.Map map, boolean z17, boolean z18) {
        super(j17, obj);
        this.f72094k = g1Var;
        this.f72091h = map;
        this.f72092i = z17;
        this.f72093j = z18;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        java.util.Map<java.lang.String, java.lang.Integer> map = this.f72091h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(map.size());
        boolean z17 = this.f72092i;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        boolean z18 = this.f72093j;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "paymmtls: dispatchPayMmtlsCtrlInfo in synctask, payMMTlsHostMap size: %s, payMMTlsValid: %s, usePayMMTls: %s", valueOf, valueOf2, java.lang.Boolean.valueOf(z18));
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).dispatchPayMmtlsCtrlInfo(map, z18, z17);
        return null;
    }
}
