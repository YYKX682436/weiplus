package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class y1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72181h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72182i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72183j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        super(j17, obj);
        this.f72183j = g1Var;
        this.f72181h = str;
        this.f72182i = str2;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mars.stn.StnManager stnManager = (com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class);
        java.lang.String str = this.f72181h;
        java.lang.String str2 = this.f72182i;
        stnManager.setDebugIP(str, str2);
        if (!com.tencent.paymars.WeChatMars.isEnable()) {
            return null;
        }
        ((com.tencent.paymars.stn.StnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.stn.StnManager.class)).setDebugIP(str, str2);
        return null;
    }
}
