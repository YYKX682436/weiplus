package au1;

/* loaded from: classes4.dex */
public final class o extends au1.s {
    public o(java.lang.String marchantId, long j17, double d17, double d18, int i17, int i18) {
        kotlin.jvm.internal.o.g(marchantId, "marchantId");
        r45.hc3 hc3Var = new r45.hc3();
        r45.js5 ic3Var = new r45.ic3();
        hc3Var.f376042d = marchantId;
        hc3Var.f376045g = j17;
        hc3Var.f376043e = d17;
        hc3Var.f376044f = d18;
        hc3Var.f376046h = i17;
        hc3Var.f376047i = i18;
        s(hc3Var, ic3Var, 2769, "/cgi-bin/mmpay-bin/mktgetcardpkgmchinfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetCardPkgMchInfo", "marchantid: %s, lastReceiveTime: %s, lat: %s, long: %s", marchantId, java.lang.Long.valueOf(j17), java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18));
    }
}
