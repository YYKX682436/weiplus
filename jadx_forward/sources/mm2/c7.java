package mm2;

/* loaded from: classes3.dex */
public final class c7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.f7 f410474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(mm2.f7 f7Var) {
        super(2);
        this.f410474d = f7Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        java.lang.Object obj3;
        r45.i82 i82Var = (r45.i82) obj;
        r45.i82 i82Var2 = (r45.i82) obj2;
        this.f410474d.getClass();
        if (i82Var != null && i82Var2 != null) {
            z17 = false;
            if (i82Var.m75933x41a8a7f2(0) == i82Var2.m75933x41a8a7f2(0) && i82Var.m75942xfb822ef2(1) == i82Var2.m75942xfb822ef2(1) && i82Var.m75942xfb822ef2(2) == i82Var2.m75942xfb822ef2(2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i82Var.m75945x2fec8307(6), i82Var2.m75945x2fec8307(6))) {
                java.util.LinkedList m75941xfb821914 = i82Var.m75941xfb821914(5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getWish_list(...)");
                java.util.LinkedList<r45.aa4> m75941xfb8219142 = i82Var2.m75941xfb821914(5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getWish_list(...)");
                if (m75941xfb821914.size() == m75941xfb8219142.size()) {
                    for (r45.aa4 aa4Var : m75941xfb8219142) {
                        java.util.Iterator it = m75941xfb821914.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            r45.aa4 aa4Var2 = (r45.aa4) next;
                            r45.kv1 kv1Var = (r45.kv1) aa4Var.m75936x14adae67(0);
                            java.lang.String m75945x2fec8307 = kv1Var != null ? kv1Var.m75945x2fec8307(0) : null;
                            r45.kv1 kv1Var2 = (r45.kv1) aa4Var2.m75936x14adae67(0);
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, kv1Var2 != null ? kv1Var2.m75945x2fec8307(0) : null) && aa4Var.m75942xfb822ef2(1) == aa4Var2.m75942xfb822ef2(1) && aa4Var.m75942xfb822ef2(2) == aa4Var2.m75942xfb822ef2(2)) {
                                obj3 = next;
                                break;
                            }
                        }
                        if (!(obj3 != null)) {
                        }
                    }
                    return java.lang.Boolean.valueOf(!z17);
                }
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(!z17);
    }
}
