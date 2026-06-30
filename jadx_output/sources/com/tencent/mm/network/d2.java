package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class d2 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.z0 f71979h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71980i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f71981j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.e2 f71982k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.network.e2 e2Var, long j17, java.lang.Object obj, com.tencent.mm.network.z0 z0Var, int i17, int i18) {
        super(j17, obj);
        this.f71982k = e2Var;
        this.f71979h = z0Var;
        this.f71980i = i17;
        this.f71981j = i18;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        try {
            com.tencent.mm.network.g1.g(this.f71982k.f71983d, this.f71979h, this.f71980i, this.f71981j);
            return null;
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
