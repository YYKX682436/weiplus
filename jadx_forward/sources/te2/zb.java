package te2;

/* loaded from: classes.dex */
public final class zb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f500103d;

    public zb(te2.hc hcVar) {
        this.f500103d = hcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String m75945x2fec8307;
        te2.hc hcVar = this.f500103d;
        hcVar.getClass();
        pm0.v.X(new te2.gc(true, hcVar, new te2.sa(hcVar)));
        ya2.b2 b2Var = hcVar.I;
        java.lang.String str = "";
        java.lang.String D0 = b2Var != null ? b2Var.D0() : "";
        r45.h32 h32Var = hcVar.f499601J;
        if (h32Var != null && (m75945x2fec8307 = h32Var.m75945x2fec8307(4)) != null) {
            str = m75945x2fec8307;
        }
        gm0.j1.d().g(new db2.g6(D0, str));
    }
}
