package f26;

/* loaded from: classes16.dex */
public abstract class e3 extends f26.o0 {
    public e3() {
        super(null);
    }

    public abstract f26.o0 A0();

    @Override // f26.o0
    public y16.s V() {
        return A0().V();
    }

    /* renamed from: toString */
    public java.lang.String m128950x9616526c() {
        e26.m mVar = (e26.m) ((f26.u0) this).f340755g;
        return mVar.f328558f != e26.s.NOT_COMPUTED && mVar.f328558f != e26.s.COMPUTING ? A0().toString() : "<Not computed yet>";
    }

    @Override // f26.o0
    public java.util.List u0() {
        return A0().u0();
    }

    @Override // f26.o0
    public f26.r1 v0() {
        return A0().v0();
    }

    @Override // f26.o0
    public f26.c2 w0() {
        return A0().w0();
    }

    @Override // f26.o0
    public boolean x0() {
        return A0().x0();
    }

    @Override // f26.o0
    public final f26.c3 z0() {
        f26.o0 A0 = A0();
        while (A0 instanceof f26.e3) {
            A0 = ((f26.e3) A0).A0();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(A0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (f26.c3) A0;
    }
}
