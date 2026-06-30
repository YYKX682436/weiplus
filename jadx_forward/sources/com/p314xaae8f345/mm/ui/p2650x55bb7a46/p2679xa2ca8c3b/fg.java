package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class fg implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f285499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.of f285500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285501c;

    public fg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf zfVar, ot0.q0 q0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.of ofVar, java.lang.String str) {
        this.f285499a = q0Var;
        this.f285500b = ofVar;
        this.f285501c = str;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizFrom", "query fail, liveId = 0");
        }
        ot0.q0 q0Var = this.f285499a;
        java.lang.String str = q0Var.f430274g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.of ofVar = this.f285500b;
        if (!str.equals(ofVar.f286724d.getTag(com.p314xaae8f345.mm.R.id.bph))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizFrom", "recycled");
            return;
        }
        if (obj instanceof r45.l71) {
            r45.l71 l71Var = (r45.l71) obj;
            if (((r45.nw1) l71Var.m75936x14adae67(1)) != null) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(q0Var.f430274g, (r45.nw1) l71Var.m75936x14adae67(1));
                eq1.h.f337345a.k((r45.nw1) l71Var.m75936x14adae67(1), ofVar.f286724d, this.f285501c);
            }
        }
    }
}
