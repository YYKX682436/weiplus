package yi2;

/* loaded from: classes.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f544043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dm1 f544044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yi2.i0 i0Var, r45.dm1 dm1Var) {
        super(0);
        this.f544043d = i0Var;
        this.f544044e = dm1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yi2.i0 i0Var = this.f544043d;
        ((java.util.LinkedHashMap) i0Var.D).clear();
        java.util.Iterator it = this.f544044e.m75941xfb821914(2).iterator();
        while (it.hasNext()) {
            r45.em1 em1Var = (r45.em1) it.next();
            java.lang.String m75945x2fec8307 = em1Var.m75945x2fec8307(1);
            r45.xn1 xn1Var = (r45.xn1) em1Var.m75936x14adae67(3);
            r45.bh1 bh1Var = xn1Var != null ? (r45.bh1) xn1Var.m75936x14adae67(17) : null;
            if (!(m75945x2fec8307 == null)) {
                if (!(bh1Var == null)) {
                    i0Var.D.put(m75945x2fec8307, bh1Var);
                }
            }
        }
        i0Var.l();
        return jz5.f0.f384359a;
    }
}
