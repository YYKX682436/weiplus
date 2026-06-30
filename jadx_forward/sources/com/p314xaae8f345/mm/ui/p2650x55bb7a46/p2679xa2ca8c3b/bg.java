package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class bg implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f285009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf f285010b;

    public bg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf zfVar, ot0.q0 q0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar) {
        this.f285009a = q0Var;
        this.f285010b = qfVar;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizFrom", "query fail, liveId = 0");
        }
        ot0.q0 q0Var = this.f285009a;
        java.lang.String str = q0Var.f430274g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar = this.f285010b;
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
                hVar.j(nw1Var, rfVar.f286964j, rfVar.f286965k);
            }
        }
        java.lang.String str2 = "";
        if (z17) {
            r45.l71 l71Var2 = (r45.l71) obj;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l71Var2.m75945x2fec8307(4))) {
                str2 = l71Var2.m75945x2fec8307(4);
            }
        }
        qfVar.f286894l.f286963i.setText(str2);
    }
}
