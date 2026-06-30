package x81;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {
    public c(x81.e eVar) {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "CgiRTReportRecommdClick page click errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "report success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Recommend.CgiRTReportRecommdClick", "report fail");
        }
    }
}
