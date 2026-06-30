package mm2;

/* loaded from: classes3.dex */
public final class d7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.f7 f410495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(mm2.f7 f7Var) {
        super(2);
        this.f410495d = f7Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        r45.pm1 pm1Var = (r45.pm1) obj;
        r45.pm1 pm1Var2 = (r45.pm1) obj2;
        this.f410495d.getClass();
        if (pm1Var != null && pm1Var2 != null) {
            z17 = false;
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
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gh6Var.m75945x2fec8307(0), gh6Var2.m75945x2fec8307(0)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gh6Var.m75945x2fec8307(1), gh6Var2.m75945x2fec8307(1))) {
                        i17 = i18;
                    }
                }
                return java.lang.Boolean.valueOf(!z17);
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(!z17);
    }
}
