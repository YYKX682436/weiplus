package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class q1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f72125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f72126i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.lang.String[] strArr, int[] iArr) {
        super(j17, obj);
        this.f72127j = g1Var;
        this.f72125h = strArr;
        this.f72126i = iArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mars.mm.MMStnManager mMStnManager = (com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class);
        java.lang.String[] strArr = this.f72125h;
        int[] iArr = this.f72126i;
        mMStnManager.setMMTlsHostInfo(strArr, iArr);
        if (!com.tencent.paymars.WeChatMars.isEnable()) {
            return null;
        }
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setMMTlsHostInfo(strArr, iArr);
        return null;
    }
}
