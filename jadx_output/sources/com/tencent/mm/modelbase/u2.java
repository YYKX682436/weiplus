package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.k0 f70818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f70819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f70820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.v2 f70821g;

    public u2(com.tencent.mm.modelbase.v2 v2Var, com.tencent.mm.network.k0 k0Var, int i17, int i18) {
        this.f70821g = v2Var;
        this.f70818d = k0Var;
        this.f70819e = i17;
        this.f70820f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f70818d.ri(new com.tencent.mm.modelbase.v2(new com.tencent.mm.modelbase.l1(), this.f70821g.f70831h, null), this.f70819e, this.f70820f, "");
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteReqResp", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}
