package xx0;

/* loaded from: classes5.dex */
public final class k extends vu3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xx0.n f539446b;

    public k(xx0.n nVar) {
        this.f539446b = nVar;
    }

    @Override // vu3.c
    public void b(uu3.u layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        this.f539446b.f539457j = false;
        yz5.a aVar = this.f539446b.f539454g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // vu3.c
    public void c(uu3.u layout) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m47319x71e92c1d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        xx0.l lVar = this.f539446b.f539455h;
        if (lVar != null) {
            m47319x71e92c1d = ((mx0.a8) lVar).f413366a.m47319x71e92c1d();
            m47319x71e92c1d.setEnabled(true);
        }
    }

    @Override // vu3.c
    public void d(uu3.u layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        yz5.a aVar = this.f539446b.f539453f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // vu3.c
    public void e(uu3.u layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        xx0.l lVar = this.f539446b.f539455h;
    }

    @Override // vu3.c
    public void f(uu3.u layout, float f17, java.lang.String source) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p912xd1075a44.C10993x47669d87 m47324x4bbcb7a7;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p912xd1075a44.C10993x47669d87 m47324x4bbcb7a72;
        mx0.l m47302x7ff74ce5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.f(layout, f17, source);
        xx0.n nVar = this.f539446b;
        xx0.l lVar = nVar.f539455h;
        if (lVar != null) {
            float f18 = nVar.f539451d;
            mx0.a8 a8Var = (mx0.a8) lVar;
            float f19 = 1;
            float f27 = a8Var.f413367b - f19;
            float f28 = a8Var.f413368c;
            float f29 = ((f27 / (0 - f28)) * ((f28 > f17 ? f17 : f28) - f28)) + f19;
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = a8Var.f413366a;
            m47324x4bbcb7a7 = c10977x8e40eced.m47324x4bbcb7a7();
            m47324x4bbcb7a7.setScaleX(f29);
            m47324x4bbcb7a72 = c10977x8e40eced.m47324x4bbcb7a7();
            m47324x4bbcb7a72.setScaleY(f29);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p910x4941b224.C10990x39b653c9 c10990x39b653c9 = a8Var.f413369d;
            float m47396x23cb2087 = c10990x39b653c9.m47396x23cb2087();
            float f37 = f17 < m47396x23cb2087 ? (m47396x23cb2087 - f17) / m47396x23cb2087 : 0.0f;
            c10990x39b653c9.setAlpha(f37);
            m47302x7ff74ce5 = c10977x8e40eced.m47302x7ff74ce5();
            m47302x7ff74ce5.d(f37);
        }
    }
}
