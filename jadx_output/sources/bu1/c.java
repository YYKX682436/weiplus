package bu1;

/* loaded from: classes2.dex */
public final class c extends au1.s {
    public c(int i17, int i18) {
        r45.si3 si3Var = new r45.si3();
        r45.js5 ti3Var = new r45.ti3();
        si3Var.f385758d = i17;
        si3Var.f385759e = i18;
        s(si3Var, ti3Var, 1701, "/cgi-bin/mmpay-bin/mktgetmktcardhomepagev2");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetMktCardHomePageV3", "offset: " + i17 + ", reqnum: " + i18);
    }
}
