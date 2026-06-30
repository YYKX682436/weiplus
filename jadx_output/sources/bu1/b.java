package bu1;

/* loaded from: classes4.dex */
public final class b extends au1.s {
    public b(int i17, int i18, double d17, double d18, int i19) {
        r45.mi3 mi3Var = new r45.mi3();
        r45.js5 ni3Var = new r45.ni3();
        mi3Var.f380539d = i17;
        mi3Var.f380540e = i18;
        mi3Var.f380541f = d17;
        mi3Var.f380542g = d18;
        mi3Var.f380543h = i19;
        s(mi3Var, ni3Var, 2833, "/cgi-bin/mmpay-bin/mktgetmembercardhomepage");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetMemberCardHomePage", "offset: " + i17 + ", reqnum: " + i18);
    }
}
