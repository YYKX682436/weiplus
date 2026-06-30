package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class r extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f129056l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f129057m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f129058n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n nVar, java.lang.String str, android.content.res.AssetFileDescriptor assetFileDescriptor, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n nVar2, boolean z17, java.lang.Runnable runnable) {
        super(str, assetFileDescriptor, yVar, nVar2, z17, (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.o) null);
        this.f129058n = runnable;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3
    public void a(cl.k1 k1Var) {
        super.a(k1Var);
        if (this.f129057m && "Abort for empty source".equals(this.f129056l)) {
            this.f129058n.run();
        } else {
            super.b(this.f129056l);
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "execInternalInitScript with fd, onFailure:%s", str);
        this.f129056l = str;
        this.f129057m = true;
    }
}
