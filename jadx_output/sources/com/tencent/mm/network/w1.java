package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class w1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72160i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72161j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72162k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72163l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(j17, obj);
        this.f72163l = g1Var;
        this.f72159h = str;
        this.f72160i = str2;
        this.f72161j = str3;
        this.f72162k = str4;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mars.mm.MMStnManager mMStnManager = (com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class);
        java.lang.String str = this.f72159h;
        java.lang.String str2 = this.f72160i;
        java.lang.String str3 = this.f72161j;
        java.lang.String str4 = this.f72162k;
        mMStnManager.setDebugIP(str, str2, str3, str4);
        com.tencent.mars.WeChatMars.onNetworkChange();
        if (!com.tencent.paymars.WeChatMars.isEnable()) {
            return null;
        }
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setDebugIP(str, str2, str3, str4);
        com.tencent.paymars.WeChatMars.onNetworkChange();
        return null;
    }
}
