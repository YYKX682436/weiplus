package sr2;

/* loaded from: classes10.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gd1 f493327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(sr2.y2 y2Var, r45.gd1 gd1Var) {
        super(2);
        this.f493326d = y2Var;
        this.f493327e = gd1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.cd1 cd1Var = (r45.cd1) obj;
        r45.cd1 cd1Var2 = (r45.cd1) obj2;
        sr2.y2 y2Var = this.f493326d;
        y2Var.f493350x = cd1Var;
        y2Var.f493351y = cd1Var2;
        db2.i1.f309548t.c(y2Var.m158354x19263085(), cd1Var, cd1Var2, new sr2.w1(y2Var, this.f493327e));
        return jz5.f0.f384359a;
    }
}
