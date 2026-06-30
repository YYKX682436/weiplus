package on2;

/* loaded from: classes3.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {
    public k2(zg2.d dVar) {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.dt1 dt1Var = (r45.dt1) obj;
        r45.dt1 dt1Var2 = (r45.dt1) obj2;
        boolean z17 = false;
        if (dt1Var != null && dt1Var2 != null) {
            java.util.LinkedList m75941xfb821914 = dt1Var.m75941xfb821914(1);
            java.util.LinkedList m75941xfb8219142 = dt1Var2.m75941xfb821914(1);
            if (dt1Var.m75939xb282bd08(2) == dt1Var2.m75939xb282bd08(2) && m75941xfb821914.size() == m75941xfb8219142.size()) {
                java.util.Iterator it = m75941xfb821914.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z17 = true;
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.dz1 dz1Var = (r45.dz1) next;
                    java.lang.Object obj3 = m75941xfb8219142.get(i17);
                    if (obj3 != null) {
                        if (!(((r45.dz1) obj3).m75939xb282bd08(0) == dz1Var.m75939xb282bd08(0))) {
                            break;
                        }
                        i17 = i18;
                    } else {
                        break;
                    }
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
