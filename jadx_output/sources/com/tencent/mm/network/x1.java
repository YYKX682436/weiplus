package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class x1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72166h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72167i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72168j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        super(j17, obj);
        this.f72168j = g1Var;
        this.f72166h = str;
        this.f72167i = str2;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mars.mm.MMStnManager mMStnManager = (com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class);
        java.lang.String str = this.f72166h;
        java.lang.String str2 = this.f72167i;
        mMStnManager.setNewDnsDebugHost(str, str2);
        if (!com.tencent.paymars.WeChatMars.isEnable()) {
            return null;
        }
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setNewDnsDebugHost(str, str2);
        return null;
    }
}
