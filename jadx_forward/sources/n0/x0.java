package n0;

/* loaded from: classes14.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f415276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f415277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.Object obj, int i17) {
        super(3);
        this.f415276d = obj;
        this.f415277e = i17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.l3 l3Var;
        n0.j1 j1Var;
        n0.o4 slots = (n0.o4) obj2;
        n0.d4 rememberManager = (n0.d4) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.e) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rememberManager, "rememberManager");
        java.lang.Object obj4 = this.f415276d;
        if (obj4 instanceof n0.e4) {
            ((n0.i1) rememberManager).d((n0.e4) obj4);
        }
        java.lang.Object C = slots.C(this.f415277e, obj4);
        if (C instanceof n0.e4) {
            ((n0.i1) rememberManager).c((n0.e4) C);
        } else if ((C instanceof n0.l3) && (j1Var = (l3Var = (n0.l3) C).f415138a) != null) {
            l3Var.f415138a = null;
            j1Var.f415092t = true;
        }
        return jz5.f0.f384359a;
    }
}
