package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class k1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f72056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f72057i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f72058j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72059k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        super(j17, obj);
        this.f72059k = g1Var;
        this.f72056h = strArr;
        this.f72057i = strArr2;
        this.f72058j = iArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        java.lang.String[] strArr = this.f72056h;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "add host size [%d]", java.lang.Integer.valueOf(strArr.length));
        com.tencent.mars.mm.MMStnManager mMStnManager = (com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class);
        java.lang.String[] strArr2 = this.f72057i;
        int[] iArr = this.f72058j;
        mMStnManager.addHostInfo(strArr, strArr2, iArr);
        if (!com.tencent.paymars.WeChatMars.isEnable()) {
            return null;
        }
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).addHostInfo(strArr, strArr2, iArr);
        return null;
    }
}
