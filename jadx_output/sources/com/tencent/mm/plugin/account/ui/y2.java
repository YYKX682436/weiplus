package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class y2 implements com.tencent.mm.ui.mmfb.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long[] f74333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.z2 f74334b;

    public y2(com.tencent.mm.plugin.account.ui.z2 z2Var, long[] jArr) {
        this.f74334b = z2Var;
        this.f74333a = jArr;
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void b(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.InviteFacebookFriendsUI", "fbinvite oncomplete");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long[] jArr = this.f74333a;
        arrayList.add(new e21.p(33, java.lang.Integer.toString(jArr.length)));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.q(arrayList));
        for (long j17 : jArr) {
            r61.v0 v0Var = new r61.v0();
            v0Var.f392968a = java.lang.Long.toString(j17);
            v0Var.f392969b = 5;
            v0Var.f392970c = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            m61.k.Ni().n0(v0Var);
        }
        db5.e1.j(this.f74334b.f74354d, com.tencent.mm.R.string.c8l, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490608zu, com.tencent.mm.R.string.f490503wx, new com.tencent.mm.plugin.account.ui.w2(this), new com.tencent.mm.plugin.account.ui.x2(this));
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void c(com.tencent.mm.ui.mmfb.sdk.h hVar) {
        com.tencent.mars.xlog.Log.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite error");
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void d(com.tencent.mm.ui.mmfb.sdk.n nVar) {
        com.tencent.mars.xlog.Log.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite error");
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void onCancel() {
        com.tencent.mars.xlog.Log.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite cancle");
    }
}
