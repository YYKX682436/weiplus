package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class j1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f72031h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f72032i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f72033j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72034k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        super(j17, obj);
        this.f72034k = g1Var;
        this.f72031h = strArr;
        this.f72032i = strArr2;
        this.f72033j = iArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mars.mm.MMStnManager mMStnManager = (com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class);
        java.lang.String[] strArr = this.f72031h;
        java.lang.String[] strArr2 = this.f72032i;
        int[] iArr = this.f72033j;
        mMStnManager.setHostInfo(strArr, strArr2, iArr);
        if (!com.tencent.paymars.WeChatMars.isEnable()) {
            return null;
        }
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setHostInfo(strArr, strArr2, iArr);
        return null;
    }
}
