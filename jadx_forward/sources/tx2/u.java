package tx2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.k94 f504193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l94 f504194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f504195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r45.k94 k94Var, r45.l94 l94Var, tx2.i0 i0Var) {
        super(0);
        this.f504193d = k94Var;
        this.f504194e = l94Var;
        this.f504195f = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        r45.k94 k94Var = this.f504193d;
        r45.bd5 bd5Var = (r45.bd5) k94Var.m75936x14adae67(6);
        if (bd5Var != null) {
            r45.bd5 bd5Var2 = (r45.bd5) k94Var.m75936x14adae67(6);
            bd5Var.set(13, java.lang.Integer.valueOf(bd5Var2 != null && bd5Var2.m75939xb282bd08(13) == 1 ? 2 : 1));
        }
        r45.l94 l94Var = this.f504194e;
        java.util.LinkedList m75941xfb8219142 = l94Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getProducts(...)");
        kz5.h0.C(m75941xfb8219142);
        l94Var.m75941xfb821914(0).add(k94Var);
        tx2.i0 i0Var = this.f504195f;
        r45.h32 h32Var = i0Var.C;
        if (h32Var != null && (m75941xfb821914 = h32Var.m75941xfb821914(11)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.k34) obj).m75939xb282bd08(0) == 22) {
                    break;
                }
            }
            r45.k34 k34Var = (r45.k34) obj;
            if (k34Var != null) {
                k34Var.set(1, hc2.b.a(l94Var));
            }
        }
        i0Var.y();
        return jz5.f0.f384359a;
    }
}
