package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class r1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f72130h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72131i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Object obj, int i17) {
        super(j17, obj);
        this.f72131i = g1Var;
        this.f72130h = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        try {
            com.tencent.mm.network.g1.j(this.f72131i, this.f72130h);
            return null;
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
