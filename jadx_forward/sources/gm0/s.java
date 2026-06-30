package gm0;

/* loaded from: classes12.dex */
public class s implements z65.a {
    public s(gm0.y yVar) {
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "CallbackForReset errorStack %s ", str);
        gm0.j1.i();
        if (gm0.j1.f() != null) {
            gm0.j1.i();
            c01.kd f17 = gm0.j1.f();
            f17.f118823a = true;
            java.util.Iterator it = ((java.util.HashSet) f17.f118824b).iterator();
            while (it.hasNext()) {
                c01.jd jdVar = (c01.jd) it.next();
                if (jdVar != null) {
                    jdVar.a();
                }
            }
            f17.f118823a = false;
        }
        gm0.j1.i();
        if (gm0.j1.u() != null) {
            gm0.j1.i();
            gm0.b0 u17 = gm0.j1.u();
            l75.k0 k0Var = u17.f354686f;
            if (k0Var != null) {
                k0Var.mo70513x5a5ddf8();
            }
            u17.f354691k = false;
        }
    }
}
