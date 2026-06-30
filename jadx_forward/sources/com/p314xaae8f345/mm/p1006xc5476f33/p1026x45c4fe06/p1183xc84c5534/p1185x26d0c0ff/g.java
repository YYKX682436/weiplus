package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i f169723e;

    public g(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar) {
        this.f169722d = str;
        this.f169723e = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f169722d, true);
        if (b17 == null || (iVar = this.f169723e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandQualitySystem", "hy: not need do sample");
            return;
        }
        r45.ud7 ud7Var = iVar.f169396c;
        if (ud7Var == null || (i17 = ud7Var.f468806d) == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandQualitySystem", "hy: need do sample, type: %d, sampleInterval: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f169723e.f169396c.f468807e));
        int i18 = this.f169723e.f169396c.f468806d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p pVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.NewFull;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p pVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.NewLight;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p pVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.Full;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p pVar5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.Light;
        if (i18 == 1) {
            pVar = pVar5;
        } else if (i18 == 2) {
            pVar = pVar4;
        } else if (i18 == 3) {
            pVar = pVar3;
        } else if (i18 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandQualitySystem", "hy: invalid type!!");
            pVar = null;
        } else {
            pVar = pVar2;
        }
        if (pVar == pVar5 || pVar == pVar4) {
            b17.f169687z.c(b17, this.f169723e.f169396c.f468807e, pVar, true);
            return;
        }
        if (pVar == pVar3 || pVar == pVar2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar = b17.f169687z;
            int i19 = this.f169723e.f169396c.f468807e;
            if (tVar.f169841h == null) {
                tVar.f169841h = b17;
            }
            tVar.f169843j = true;
            tVar.f169836c.f169803d = i19 * 1000;
            tVar.f169838e = new java.util.HashMap();
            ((ku5.t0) ku5.t0.f394148d).g(tVar.f169837d);
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.r rVar = tVar.f169836c;
            ((ku5.t0) u0Var).k(rVar, rVar.f169803d);
        }
    }
}
