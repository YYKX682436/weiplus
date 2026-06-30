package fn2;

/* loaded from: classes10.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f345988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(fn2.h1 h1Var) {
        super(0);
        this.f345988d = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bm2.k7 k7Var = this.f345988d.f345805i;
        if (k7Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
            throw null;
        }
        java.util.List list = k7Var.f103578q;
        bm2.v6 v6Var = (bm2.v6) kz5.n0.Z(list);
        if ((v6Var != null ? v6Var.f103920a : null) == bm2.w6.f103944d) {
            ((java.util.ArrayList) list).remove(0);
            k7Var.m8155x27702c4(0);
        }
        return jz5.f0.f384359a;
    }
}
