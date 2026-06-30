package au1;

/* loaded from: classes4.dex */
public final class q extends au1.s {
    public q(int i17, int i18, double d17, double d18) {
        r45.ui3 ui3Var = new r45.ui3();
        r45.js5 vi3Var = new r45.vi3();
        ui3Var.f387400d = i17;
        ui3Var.f387401e = i18;
        ui3Var.f387402f = d17;
        ui3Var.f387403g = d18;
        s(ui3Var, vi3Var, 2979, "/cgi-bin/mmpay-bin/mktgetmktinvalidtickethomepage");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetMktInvalidTicketHomePage", "offset: %s, reqnum: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
