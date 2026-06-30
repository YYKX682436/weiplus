package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class b2 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.z0 f71967h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71968i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f71969j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71970k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.c2 f71971l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.network.c2 c2Var, long j17, java.lang.Object obj, com.tencent.mm.network.z0 z0Var, int i17, int i18, java.lang.String str) {
        super(j17, obj);
        this.f71971l = c2Var;
        this.f71967h = z0Var;
        this.f71968i = i17;
        this.f71969j = i18;
        this.f71970k = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        try {
            com.tencent.mm.network.g1.d(this.f71971l.f71973d, this.f71967h, this.f71968i, this.f71969j, this.f71970k);
            return null;
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
