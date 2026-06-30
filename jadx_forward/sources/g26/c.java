package g26;

/* loaded from: classes16.dex */
public final class c extends f26.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g26.d f349517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f26.v2 f349518b;

    public c(g26.d dVar, f26.v2 v2Var) {
        this.f349517a = dVar;
        this.f349518b = v2Var;
    }

    @Override // f26.a2
    public i26.j a(f26.b2 state, i26.i type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        g26.d dVar = this.f349517a;
        i26.i g07 = dVar.g0(type);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g07, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        f26.d3 d3Var = f26.d3.f340676f;
        f26.o0 i17 = this.f349518b.i((f26.o0) g07, d3Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "safeSubstitute(...)");
        i26.j m07 = dVar.m0(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m07);
        return m07;
    }
}
