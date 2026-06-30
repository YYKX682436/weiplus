package ks3;

/* loaded from: classes4.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final ks3.o0 f393267a;

    public p0() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(282625, "");
        try {
            ks3.o0 o0Var = new ks3.o0();
            this.f393267a = o0Var;
            o0Var.mo11468x92b714fd(android.util.Base64.decode(str, 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareMailInfoMgr", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareMailInfoMgr", "parse from config fail");
            this.f393267a = new ks3.o0();
        }
    }
}
