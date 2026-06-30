package s16;

/* loaded from: classes16.dex */
public final class c implements s16.b {

    /* renamed from: a, reason: collision with root package name */
    public final f26.l2 f483723a;

    /* renamed from: b, reason: collision with root package name */
    public g26.s f483724b;

    public c(f26.l2 projection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projection, "projection");
        this.f483723a = projection;
        projection.c();
        f26.d3 d3Var = f26.d3.f340676f;
    }

    @Override // f26.c2
    public java.util.Collection a() {
        f26.l2 l2Var = this.f483723a;
        f26.o0 mo128949xfb85f7b0 = l2Var.c() == f26.d3.f340678h ? l2Var.mo128949xfb85f7b0() : h().p();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo128949xfb85f7b0);
        return kz5.b0.c(mo128949xfb85f7b0);
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        return kz5.p0.f395529d;
    }

    @Override // s16.b
    /* renamed from: getProjection */
    public f26.l2 mo130745x78d58245() {
        return this.f483723a;
    }

    @Override // f26.c2
    public l06.o h() {
        l06.o h17 = this.f483723a.mo128949xfb85f7b0().w0().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getBuiltIns(...)");
        return h17;
    }

    @Override // f26.c2
    public /* bridge */ /* synthetic */ o06.j i() {
        return null;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m163627x9616526c() {
        return "CapturedTypeConstructor(" + this.f483723a + ')';
    }
}
