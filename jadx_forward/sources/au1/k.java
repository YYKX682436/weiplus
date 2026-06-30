package au1;

/* loaded from: classes2.dex */
public final class k extends au1.s {
    public k(java.lang.String marchantId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(marchantId, "marchantId");
        r45.jd0 jd0Var = new r45.jd0();
        r45.js5 kd0Var = new r45.kd0();
        jd0Var.f459251d = marchantId;
        s(jd0Var, kd0Var, 1768, "/cgi-bin/mmpay-bin/mktdeletemchinlist");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiDeleteMchInList", "delete mch: %s", marchantId);
    }
}
