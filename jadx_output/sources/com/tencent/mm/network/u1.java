package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class u1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f72147h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72148i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, boolean z17) {
        super(j17, obj);
        this.f72148i = g1Var;
        this.f72147h = z17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        boolean z17 = this.f72147h;
        com.tencent.mars.WeChatMars.onForeground(z17);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            com.tencent.paymars.WeChatMars.onForeground(z17);
        }
        e11.b.e(z17);
        z65.c.f470455a = z17;
        return null;
    }
}
