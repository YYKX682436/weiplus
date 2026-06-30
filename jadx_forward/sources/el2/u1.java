package el2;

/* loaded from: classes3.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f335452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f335453e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(r45.y42 y42Var, el2.c2 c2Var) {
        super(1);
        this.f335452d = y42Var;
        this.f335453e = c2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.zs1 zs1Var = (r45.zs1) obj;
        r45.y42 y42Var = this.f335452d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = zs1Var != null ? zs1Var.m75934xbce7f2f(1) : y42Var.m75934xbce7f2f(2);
        el2.c2 c2Var = this.f335453e;
        el2.c2.k(c2Var, new el2.t1(c2Var, m75934xbce7f2f, y42Var));
        return jz5.f0.f384359a;
    }
}
