package n0;

/* loaded from: classes14.dex */
public final class z1 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f415334d;

    /* renamed from: e, reason: collision with root package name */
    public n0.a2 f415335e;

    public z1(yz5.l effect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
        this.f415334d = effect;
    }

    @Override // n0.e4
    public void b() {
        this.f415335e = (n0.a2) this.f415334d.mo146xb9724478(n0.d2.f415015a);
    }

    @Override // n0.e4
    public void c() {
    }

    @Override // n0.e4
    public void d() {
        n0.a2 a2Var = this.f415335e;
        if (a2Var != null) {
            a2Var.mo158x63a5261f();
        }
        this.f415335e = null;
    }
}
