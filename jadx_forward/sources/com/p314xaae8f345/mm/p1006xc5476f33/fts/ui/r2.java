package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class r2 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 f219700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var, android.os.Looper looper) {
        super(looper);
        this.f219700a = q2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var = this.f219700a;
        if (q2Var.E || q2Var.getCount() <= 0) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f219302c = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).m0();
        q2Var.notifyDataSetChanged();
    }
}
