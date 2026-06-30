package z;

/* loaded from: classes14.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(z.l2 l2Var, z.l2 l2Var2) {
        super(1);
        this.f550286d = l2Var;
        this.f550287e = l2Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        z.l2 l2Var = this.f550286d;
        l2Var.getClass();
        z.l2 transition = this.f550287e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
        l2Var.f550262i.add(transition);
        return new z.m2(l2Var, transition);
    }
}
