package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class p1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f72099h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f72100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72101j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.util.Map map, boolean z17) {
        super(j17, obj);
        this.f72101j = g1Var;
        this.f72099h = map;
        this.f72100i = z17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mars.mm.MMStnManager mMStnManager = (com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class);
        java.util.Map<java.lang.String, java.lang.String> map = this.f72099h;
        boolean z17 = this.f72100i;
        mMStnManager.setPayNewDnsDebugHosts(map, z17);
        if (!com.tencent.paymars.WeChatMars.isEnable()) {
            return null;
        }
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setPayNewDnsDebugHosts(map, z17);
        return null;
    }
}
