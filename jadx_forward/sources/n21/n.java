package n21;

/* loaded from: classes8.dex */
public class n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.o f415808d;

    public n(n21.o oVar) {
        this.f415808d = oVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        n21.o oVar = this.f415808d;
        java.lang.String str2 = oVar.f415811b;
        if (str2 != null && ((n21.b) m1Var).f415775h.equals(str2)) {
            gm0.j1.d().q(240, oVar.f415813d);
            if (i18 == 0) {
                if (n21.h.f415800h == null) {
                    n21.h.f415800h = new n21.h();
                }
                n21.h.f415800h.getClass();
                gm0.j1.i();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(16646145, null)));
                if (valueOf.intValue() < 0) {
                    valueOf = 0;
                }
                gm0.j1.i();
                gm0.j1.u().c().w(16646145, java.lang.Integer.valueOf(valueOf.intValue() + 1));
            }
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(oVar.f415811b);
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            try {
                try {
                    com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                    if (m17.a()) {
                        m17.f294799a.d(m17.f294800b);
                    }
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexUploadCore", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            } finally {
                n21.o.b().c();
                oVar.f415811b = null;
            }
        }
    }
}
