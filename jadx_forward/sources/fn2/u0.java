package fn2;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f345941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f345942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(fn2.h1 h1Var, int i17) {
        super(0);
        this.f345941d = h1Var;
        this.f345942e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bm2.k7 k7Var = this.f345941d.f345805i;
        if (k7Var != null) {
            k7Var.I(2, bm2.y8.f103998h, this.f345942e, 1, null);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
        throw null;
    }
}
