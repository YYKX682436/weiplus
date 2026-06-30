package wa1;

/* loaded from: classes7.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 embedWxa) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(embedWxa, "embedWxa");
        if (b(embedWxa) && (hcVar = embedWxa.f156329e) != null && hcVar.n(embedWxa)) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) hcVar.i(embedWxa);
        }
        return null;
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 embedWxa) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(embedWxa, "embedWxa");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = embedWxa.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        if (halfScreenConfig.c()) {
            if (halfScreenConfig.D == k91.x2.f387350e) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 host) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = host.f156329e;
        if (hcVar != null && (o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) hcVar.mo48805xd384d23c()) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(host, o6Var) && b(o6Var)) {
            try {
                c11510xdd90c2f2 = hcVar.i(o6Var);
            } catch (java.lang.Throwable unused) {
                c11510xdd90c2f2 = null;
            }
            if (c11510xdd90c2f2 == host) {
                return true;
            }
        }
        return false;
    }
}
