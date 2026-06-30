package z;

/* loaded from: classes14.dex */
public final class o2 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.c2 f550309b;

    public o2(z.l2 l2Var, z.c2 c2Var) {
        this.f550308a = l2Var;
        this.f550309b = c2Var;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        z.f2 f2Var;
        z.l2 l2Var = this.f550308a;
        l2Var.getClass();
        z.c2 deferredAnimation = this.f550309b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deferredAnimation, "deferredAnimation");
        z.b2 b2Var = deferredAnimation.f550151c;
        if (b2Var == null || (f2Var = b2Var.f550128d) == null) {
            return;
        }
        l2Var.f550261h.remove(f2Var);
    }
}
