package el2;

/* loaded from: classes3.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.n1 f335374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(el2.n1 n1Var) {
        super(2);
        this.f335374d = n1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.y42 y42Var = (r45.y42) obj;
        r45.y42 y42Var2 = (r45.y42) obj2;
        this.f335374d.getClass();
        boolean z17 = true;
        if (y42Var == null || y42Var2 == null ? y42Var != null || y42Var2 != null : y42Var.m75942xfb822ef2(0) != y42Var2.m75942xfb822ef2(0) || y42Var.m75939xb282bd08(1) != y42Var2.m75939xb282bd08(1)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
