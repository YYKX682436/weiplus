package x81;

/* loaded from: classes7.dex */
public class d extends x81.f {
    public d(x81.e eVar, int i17, long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd c12558x591103cd) {
        super(i17, j17, j18, c12558x591103cd);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Recommend.CgiRTReportRecommdClick", "account nor ready");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "CgiRTReportRecommdClick profile click errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "report success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Recommend.CgiRTReportRecommdClick", "report fail");
        }
    }
}
