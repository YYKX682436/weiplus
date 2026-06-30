package z;

/* loaded from: classes14.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.f2 f550359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(z.l2 l2Var, z.f2 f2Var) {
        super(1);
        this.f550358d = l2Var;
        this.f550359e = f2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        z.l2 l2Var = this.f550358d;
        l2Var.getClass();
        z.f2 animation = this.f550359e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        l2Var.f550261h.add(animation);
        return new z.q2(l2Var, animation);
    }
}
