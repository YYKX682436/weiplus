package l26;

/* loaded from: classes16.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l26.d0 f396753d = new l26.d0();

    public d0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o06.n0 $receiver = (o06.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g($receiver, "$this$$receiver");
        java.util.List W = $receiver.W();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getValueParameters(...)");
        o06.l2 l2Var = (o06.l2) kz5.n0.k0(W);
        boolean z17 = false;
        if (l2Var != null) {
            if (!v16.f.a(l2Var) && ((r06.s1) l2Var).f450059p == null) {
                z17 = true;
            }
        }
        java.util.List list = l26.g0.f396761a;
        if (z17) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }
}
