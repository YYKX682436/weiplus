package e51;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static int f331101b;

    /* renamed from: a, reason: collision with root package name */
    public e51.j f331102a;

    public a(android.view.ViewGroup viewGroup) {
        if (f331101b == 0) {
            android.content.res.Resources resources = viewGroup.getResources();
            f331101b = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561792ss);
            resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561797sx);
            resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561796sw);
            resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561795sv);
            resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561798sy);
            resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561793st);
        }
    }

    public static e51.a a(android.view.ViewGroup viewGroup, e51.f fVar) {
        e51.a aVar = new e51.a(viewGroup);
        e51.j jVar = new e51.j(viewGroup.getContext(), fVar, new e51.k(viewGroup.getWidth() / 2, viewGroup.getHeight() + 400), new g51.b(viewGroup));
        jVar.f331128p = 0.0f;
        jVar.f331129q = 0.8f;
        jVar.f(-2000.0f, 1250.0f);
        jVar.f331134v = 0.002f;
        jVar.f331135w = 0.0f;
        jVar.E = 3000.0f;
        jVar.F = 500.0f;
        jVar.f331136x = 180;
        jVar.f331137y = 180;
        if (e51.o.f331143a == null) {
            e51.o.f331143a = new e51.n();
        }
        jVar.f331126n = e51.o.f331143a;
        jVar.f331138z = 3.6E-4f;
        jVar.A = 1.8E-4f;
        jVar.e(360.0f);
        aVar.f331102a = jVar;
        return aVar;
    }

    public static e51.a b(android.view.ViewGroup viewGroup, e51.f fVar) {
        e51.a aVar = new e51.a(viewGroup);
        e51.j jVar = new e51.j(viewGroup.getContext(), fVar, new e51.k(-100, viewGroup.getHeight() / 2), new g51.b(viewGroup));
        jVar.f331128p = 0.6f;
        jVar.f331129q = 0.15f;
        jVar.f(-1000.0f, 250.0f);
        jVar.f331132t = -2.0E-4f;
        jVar.f331133u = 0.0f;
        jVar.f331134v = 0.0015f;
        jVar.f331135w = 0.0f;
        jVar.E = 600.0f;
        jVar.F = 300.0f;
        jVar.f331136x = 180;
        jVar.f331137y = 180;
        if (e51.o.f331143a == null) {
            e51.o.f331143a = new e51.n();
        }
        jVar.f331126n = e51.o.f331143a;
        jVar.f331138z = 3.6E-4f;
        jVar.A = 1.8E-4f;
        jVar.e(360.0f);
        aVar.f331102a = jVar;
        return aVar;
    }

    public static e51.a c(android.view.ViewGroup viewGroup, e51.f fVar) {
        e51.a aVar = new e51.a(viewGroup);
        e51.j jVar = new e51.j(viewGroup.getContext(), fVar, new e51.k(viewGroup.getWidth() + 100, viewGroup.getHeight() / 2), new g51.b(viewGroup));
        jVar.f331128p = -0.6f;
        jVar.f331129q = 0.15f;
        jVar.f(-1000.0f, 250.0f);
        jVar.f331132t = 2.0E-4f;
        jVar.f331133u = 0.0f;
        jVar.f331134v = 0.0015f;
        jVar.f331135w = 0.0f;
        jVar.E = 600.0f;
        jVar.F = 300.0f;
        jVar.f331136x = 180;
        jVar.f331137y = 180;
        if (e51.o.f331143a == null) {
            e51.o.f331143a = new e51.n();
        }
        jVar.f331126n = e51.o.f331143a;
        jVar.f331138z = 3.6E-4f;
        jVar.A = 1.8E-4f;
        jVar.e(360.0f);
        aVar.f331102a = jVar;
        return aVar;
    }

    public e51.j d(int i17, long j17) {
        e51.j jVar = this.f331102a;
        jVar.f331122j = 0;
        jVar.f331123k = j17;
        float f17 = i17 / 1000.0f;
        jVar.f331124l = f17;
        jVar.f331125m = 1.0f / f17;
        jVar.d();
        jVar.g();
        return jVar;
    }
}
