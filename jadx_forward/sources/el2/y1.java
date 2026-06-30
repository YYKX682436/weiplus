package el2;

/* loaded from: classes3.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f335483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f335484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f335485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(r45.y42 y42Var, el2.c2 c2Var, cm2.b0 b0Var) {
        super(1);
        this.f335483d = y42Var;
        this.f335484e = c2Var;
        this.f335485f = b0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.zs1 zs1Var = (r45.zs1) obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = zs1Var != null ? zs1Var.m75934xbce7f2f(1) : this.f335483d.m75934xbce7f2f(2);
        cm2.b0 b0Var = this.f335485f;
        el2.c2 c2Var = this.f335484e;
        el2.c2.k(c2Var, new el2.x1(b0Var, c2Var, m75934xbce7f2f));
        return jz5.f0.f384359a;
    }
}
