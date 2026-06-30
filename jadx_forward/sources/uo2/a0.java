package uo2;

/* loaded from: classes2.dex */
public abstract class a0 {
    public static final java.lang.String a(r45.zi2 zi2Var) {
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zi2Var, "<this>");
        boolean z17 = true;
        if (zi2Var.m75939xb282bd08(11) == 1) {
            java.lang.String m75945x2fec83072 = zi2Var.m75945x2fec8307(0);
            if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
                z17 = false;
            }
            if (z17) {
                m75945x2fec8307 = null;
            } else {
                m75945x2fec8307 = "Listen_" + zi2Var.m75945x2fec8307(0);
            }
        } else if (zi2Var.m75939xb282bd08(11) >= 2) {
            m75945x2fec8307 = zi2Var.m75939xb282bd08(11) + '_' + zi2Var.m75945x2fec8307(0);
        } else {
            m75945x2fec8307 = zi2Var.m75945x2fec8307(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicExt", "doc_type:" + zi2Var.m75939xb282bd08(11) + " docId:" + zi2Var.m75945x2fec8307(0) + " groupId:" + m75945x2fec8307);
        return m75945x2fec8307;
    }
}
