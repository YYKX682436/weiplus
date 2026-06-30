package z;

/* loaded from: classes14.dex */
public final class b2 implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public final z.f2 f550128d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f550129e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f550130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.c2 f550131g;

    public b2(z.c2 c2Var, z.f2 animation, yz5.l transitionSpec, yz5.l targetValueByState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionSpec, "transitionSpec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValueByState, "targetValueByState");
        this.f550131g = c2Var;
        this.f550128d = animation;
        this.f550129e = transitionSpec;
        this.f550130f = targetValueByState;
    }

    public final void b(z.d2 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        z.e2 e2Var = (z.e2) segment;
        java.lang.Object mo146xb9724478 = this.f550130f.mo146xb9724478(e2Var.f550178b);
        boolean e17 = this.f550131g.f550152d.e();
        z.f2 f2Var = this.f550128d;
        if (e17) {
            f2Var.d(this.f550130f.mo146xb9724478(e2Var.f550177a), mo146xb9724478, (z.k0) this.f550129e.mo146xb9724478(segment));
        } else {
            f2Var.e(mo146xb9724478, (z.k0) this.f550129e.mo146xb9724478(segment));
        }
    }

    @Override // n0.e5
    /* renamed from: getValue */
    public java.lang.Object mo128745x754a37bb() {
        b(this.f550131g.f550152d.c());
        return this.f550128d.mo128745x754a37bb();
    }
}
