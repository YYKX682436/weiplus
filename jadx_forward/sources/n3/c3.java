package n3;

/* loaded from: classes14.dex */
public class c3 extends n3.b3 {

    /* renamed from: q, reason: collision with root package name */
    public static final n3.g3 f415860q = n3.g3.i(android.view.WindowInsets.CONSUMED, null);

    public c3(n3.g3 g3Var, android.view.WindowInsets windowInsets) {
        super(g3Var, windowInsets);
    }

    @Override // n3.y2, n3.d3
    public final void d(android.view.View view) {
    }

    @Override // n3.y2, n3.d3
    public e3.d g(int i17) {
        return e3.d.d(this.f415979c.getInsets(n3.f3.a(i17)));
    }

    @Override // n3.y2, n3.d3
    public e3.d h(int i17) {
        return e3.d.d(this.f415979c.getInsetsIgnoringVisibility(n3.f3.a(i17)));
    }

    @Override // n3.y2, n3.d3
    public boolean p(int i17) {
        return this.f415979c.isVisible(n3.f3.a(i17));
    }

    public c3(n3.g3 g3Var, n3.c3 c3Var) {
        super(g3Var, c3Var);
    }
}
