package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ng implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f286458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf f286459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f286460c;

    public ng(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf zfVar, ot0.q0 q0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar, int i17) {
        this.f286458a = q0Var;
        this.f286459b = qfVar;
        this.f286460c = i17;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizFrom", "query fail, liveId = 0");
        }
        ot0.q0 q0Var = this.f286458a;
        java.lang.String str = q0Var.f430274g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar = this.f286459b;
        if (!str.equals(qfVar.f286894l.f286796a.getTag(com.p314xaae8f345.mm.R.id.bph))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizFrom", "recycled");
            return;
        }
        boolean z17 = obj instanceof r45.l71;
        if (z17) {
            r45.l71 l71Var = (r45.l71) obj;
            if (((r45.nw1) l71Var.m75936x14adae67(1)) != null) {
                r45.nw1 nw1Var = (r45.nw1) l71Var.m75936x14adae67(1);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(q0Var.f430274g, nw1Var);
                eq1.h hVar = eq1.h.f337345a;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rf rfVar = qfVar.f286894l;
                hVar.j(nw1Var, rfVar.f286975u, rfVar.f286976v);
            }
        }
        java.lang.String str2 = "";
        if (z17) {
            r45.l71 l71Var2 = (r45.l71) obj;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l71Var2.m75945x2fec8307(4))) {
                str2 = l71Var2.m75945x2fec8307(4);
            }
        }
        if (this.f286460c == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                qfVar.f286894l.f286974t.setVisibility(8);
                return;
            } else {
                qfVar.f286894l.f286974t.setVisibility(0);
                qfVar.f286894l.f286974t.setText(str2);
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            qfVar.f286894l.f286971q.setVisibility(8);
        } else {
            qfVar.f286894l.f286971q.setVisibility(0);
            qfVar.f286894l.f286971q.setText(str2);
        }
    }
}
