package ml4;

/* loaded from: classes11.dex */
public abstract class a {
    public static final java.lang.String a(bw5.lp0 lp0Var) {
        java.lang.String m12014xb5887639;
        int i17;
        java.lang.String m12014xb58876392;
        java.lang.String i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        java.lang.String str = null;
        if (lp0Var.d() == null) {
            return null;
        }
        if (il4.l.i(lp0Var.d().f115722e)) {
            java.lang.String m12386x5000ed37 = lp0Var.d().i().m12386x5000ed37();
            java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(m12386x5000ed37, false);
            return i19 == null ? m12386x5000ed37 : i19;
        }
        boolean z17 = true;
        if (rk4.j5.h(lp0Var)) {
            java.lang.String m12014xb58876393 = lp0Var.e().m12014xb5887639();
            if (m12014xb58876393 != null && m12014xb58876393.length() != 0) {
                z17 = false;
            }
            if (z17) {
                bw5.nc0 l17 = lp0Var.d().l();
                m12014xb58876392 = l17.f112154o[5] ? l17.f112150h : "";
            } else {
                m12014xb58876392 = lp0Var.e().m12014xb5887639();
            }
            return (!lp0Var.d().l().f112149g || (i18 = com.p314xaae8f345.mm.vfs.w6.i(m12014xb58876392, false)) == null) ? m12014xb58876392 : i18;
        }
        java.lang.String m12014xb58876394 = lp0Var.e().m12014xb5887639();
        if (m12014xb58876394 == null || m12014xb58876394.length() == 0) {
            bw5.z90 j17 = lp0Var.d().j();
            m12014xb5887639 = j17 != null ? j17.i() : null;
        } else {
            m12014xb5887639 = lp0Var.e().m12014xb5887639();
        }
        if (m12014xb5887639 != null && !r26.n0.N(m12014xb5887639)) {
            return m12014xb5887639;
        }
        bw5.v70 d17 = lp0Var.d();
        if (d17 != null && ((i17 = d17.f115722e) == 2 || i17 == 3)) {
            str = d17.b().d();
        }
        return str;
    }
}
