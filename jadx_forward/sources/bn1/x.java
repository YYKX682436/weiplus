package bn1;

/* loaded from: classes14.dex */
public final class x extends cn1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bn1.c0 f104370a;

    public x(bn1.c0 c0Var) {
        this.f104370a = c0Var;
    }

    @Override // cn1.g
    public void b(bn1.v layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        bn1.c0 c0Var = this.f104370a;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = c0Var.f104322d;
        java.util.Iterator it = c0Var.f104330o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(false, false, 0);
        }
    }

    @Override // cn1.g
    public void c(bn1.v layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        bn1.c0 c0Var = this.f104370a;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = c0Var.f104322d;
        java.util.Iterator it = c0Var.f104330o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(true, false, 0);
        }
    }

    @Override // cn1.g
    public void e(bn1.v layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.e(layout, f17, source);
        bn1.c0 c0Var = this.f104370a;
        for (com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar : c0Var.f104330o) {
            float f18 = 1.0f;
            float m53896x9c78005c = ((f17 - layout.m53896x9c78005c()) * 1.0f) / (layout.m53895x4ea7bf6() - layout.m53896x9c78005c());
            if (m53896x9c78005c < 0.0f) {
                m53896x9c78005c = 0.0f;
            }
            if (m53896x9c78005c <= 1.0f) {
                f18 = m53896x9c78005c;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f104329n, "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
