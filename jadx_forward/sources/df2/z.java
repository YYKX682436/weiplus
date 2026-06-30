package df2;

/* loaded from: classes3.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a0 f313444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(df2.a0 a0Var) {
        super(2);
        this.f313444d = a0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.pm1 pm1Var = (r45.pm1) obj;
        r45.pm1 pm1Var2 = (r45.pm1) obj2;
        this.f313444d.getClass();
        boolean z17 = true;
        boolean z18 = false;
        if (pm1Var != null && pm1Var2 != null) {
            java.util.LinkedList m75941xfb821914 = pm1Var.m75941xfb821914(0);
            java.util.LinkedList m75941xfb8219142 = pm1Var2.m75941xfb821914(0);
            if (m75941xfb821914.size() == m75941xfb8219142.size()) {
                int i17 = 0;
                for (java.lang.Object obj3 : m75941xfb8219142) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.gh6 gh6Var = (r45.gh6) obj3;
                    r45.gh6 gh6Var2 = (r45.gh6) m75941xfb821914.get(i17);
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gh6Var.m75945x2fec8307(0), gh6Var2.m75945x2fec8307(0)) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gh6Var.m75945x2fec8307(1), gh6Var2.m75945x2fec8307(1))) {
                        break;
                    }
                    i17 = i18;
                }
            }
            return java.lang.Boolean.valueOf(z18);
        }
        if (pm1Var != null || pm1Var2 != null) {
            z17 = false;
        }
        z18 = z17;
        return java.lang.Boolean.valueOf(z18);
    }
}
