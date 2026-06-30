package un;

/* loaded from: classes9.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f510779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f510780e;

    public d1(un.g1 g1Var, java.lang.String str) {
        this.f510779d = g1Var;
        this.f510780e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        un.g1 g1Var = this.f510779d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g1Var.m158354x19263085();
        java.lang.String str = this.f510780e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = g1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.htw);
        }
        db5.e1.y(m158354x19263085, str, "", g1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), un.c1.f510776d);
    }
}
