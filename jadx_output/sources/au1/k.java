package au1;

/* loaded from: classes2.dex */
public final class k extends au1.s {
    public k(java.lang.String marchantId) {
        kotlin.jvm.internal.o.g(marchantId, "marchantId");
        r45.jd0 jd0Var = new r45.jd0();
        r45.js5 kd0Var = new r45.kd0();
        jd0Var.f377718d = marchantId;
        s(jd0Var, kd0Var, 1768, "/cgi-bin/mmpay-bin/mktdeletemchinlist");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiDeleteMchInList", "delete mch: %s", marchantId);
    }
}
