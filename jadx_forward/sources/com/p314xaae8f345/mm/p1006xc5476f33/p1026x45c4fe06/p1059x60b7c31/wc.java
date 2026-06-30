package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class wc implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc f165261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f165262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165263c;

    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc ycVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f165261a = ycVar;
        this.f165262b = d0Var;
        this.f165263c = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc ycVar = this.f165261a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ycVar.f165477g, "sendRedCoverAppMsg errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int i19 = this.f165263c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f165262b;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(ycVar.f165477g, "send error");
            d0Var.a(i19, ycVar.o("fail:send error"));
            return;
        }
        if ((oVar != null ? oVar.f152244b.f152233a : null) instanceof r45.pz5) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SendShareCoverMsgResp");
            r45.pz5 pz5Var = (r45.pz5) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ycVar.f165477g, "send result: " + pz5Var.f465035d);
            if (pz5Var.f465035d == 0) {
                d0Var.a(i19, ycVar.o("ok"));
            } else {
                d0Var.a(i19, ycVar.o("fail:send fail"));
            }
        }
    }
}
