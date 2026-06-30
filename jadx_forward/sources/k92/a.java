package k92;

/* loaded from: classes2.dex */
public abstract class a {
    public static final r45.ao2 a(m92.b bVar) {
        r45.wn2 wn2Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj = null;
        if (bVar == null || (wn2Var = (r45.wn2) bVar.u0().m75936x14adae67(28)) == null || (m75941xfb821914 = wn2Var.m75941xfb821914(0)) == null) {
            return null;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            boolean z17 = true;
            if (((r45.ao2) next).m75939xb282bd08(0) != 1) {
                z17 = false;
            }
            if (z17) {
                obj = next;
                break;
            }
        }
        return (r45.ao2) obj;
    }
}
