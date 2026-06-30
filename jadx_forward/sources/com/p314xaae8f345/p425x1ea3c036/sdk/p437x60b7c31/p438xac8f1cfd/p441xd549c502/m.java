package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* loaded from: classes7.dex */
public class m implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f129118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd f129119e;

    public m(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var) {
        this.f129119e = c3932x19b83abd;
        this.f129118d = f0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (this.f129119e.f15700xee6151ec == null) {
            return;
        }
        u81.b bVar2 = u81.b.SUSPEND;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = this.f129118d;
        if (bVar2 == bVar) {
            f0Var.k(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.k(this), true);
        } else if (u81.b.FOREGROUND == bVar) {
            f0Var.k(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.l(this), true);
        }
    }
}
