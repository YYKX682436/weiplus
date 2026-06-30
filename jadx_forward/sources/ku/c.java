package ku;

/* loaded from: classes5.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(l15.c cVar) {
        v05.b k17;
        v05.b k18;
        java.lang.String str = null;
        java.lang.String m75945x2fec8307 = (cVar == null || (k18 = cVar.k()) == null) ? null : k18.m75945x2fec8307(k18.f513848e + 12);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        if (cVar != null && (k17 = cVar.k()) != null) {
            str = k17.m75945x2fec8307(k17.f449898d + 2);
        }
        java.lang.String str2 = str != null ? str : "";
        if (m75945x2fec8307.length() > 0) {
            if (str2.length() > 0) {
                return "[" + m75945x2fec8307 + "] " + str2;
            }
        }
        if (str2.length() > 0) {
            return str2;
        }
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572015wb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
        return g17;
    }
}
