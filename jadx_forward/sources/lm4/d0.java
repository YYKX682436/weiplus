package lm4;

/* loaded from: classes14.dex */
public final class d0 extends mm4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm4.i0 f401089a;

    public d0(lm4.i0 i0Var) {
        this.f401089a = i0Var;
    }

    @Override // mm4.g
    public void b(lm4.b0 layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        lm4.i0 i0Var = this.f401089a;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = i0Var.f401101d;
        java.util.Iterator it = i0Var.f401109o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(false, false, 0);
        }
    }

    @Override // mm4.g
    public void c(lm4.b0 layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        lm4.i0 i0Var = this.f401089a;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = i0Var.f401101d;
        java.util.Iterator it = i0Var.f401109o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(true, false, 0);
        }
    }

    @Override // mm4.g
    public void e(lm4.b0 layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.e(layout, f17, source);
        lm4.i0 i0Var = this.f401089a;
        for (com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar : i0Var.f401109o) {
            float f18 = 1.0f;
            float m72231x9c78005c = ((f17 - layout.m72231x9c78005c()) * 1.0f) / (layout.m72230x4ea7bf6() - layout.m72231x9c78005c());
            if (m72231x9c78005c < 0.0f) {
                m72231x9c78005c = 0.0f;
            }
            if (m72231x9c78005c <= 1.0f) {
                f18 = m72231x9c78005c;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f401108n, "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
