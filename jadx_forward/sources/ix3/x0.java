package ix3;

/* loaded from: classes.dex */
public final class x0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        r45.dp5 dp5Var = (r45.dp5) obj;
        r45.dp5 dp5Var2 = (r45.dp5) obj2;
        if (dp5Var == null || dp5Var2 == null) {
            return 0;
        }
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(dp5Var.m75939xb282bd08(11), dp5Var2.m75939xb282bd08(11));
        if (i17 != 0) {
            return i17;
        }
        java.lang.String m75945x2fec8307 = dp5Var.m75945x2fec8307(1);
        java.lang.String m75945x2fec83072 = dp5Var2.m75945x2fec8307(1);
        if (m75945x2fec8307 == null || m75945x2fec83072 == null) {
            return 0;
        }
        return m75945x2fec8307.compareTo(m75945x2fec83072);
    }
}
