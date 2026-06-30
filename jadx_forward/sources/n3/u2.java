package n3;

/* loaded from: classes14.dex */
public class u2 extends n3.x2 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f415950e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f415951f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Constructor f415952g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f415953h;

    /* renamed from: c, reason: collision with root package name */
    public android.view.WindowInsets f415954c;

    /* renamed from: d, reason: collision with root package name */
    public e3.d f415955d;

    public u2() {
        this.f415954c = i();
    }

    private static android.view.WindowInsets i() {
        if (!f415951f) {
            try {
                f415950e = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException unused) {
            }
            f415951f = true;
        }
        java.lang.reflect.Field field = f415950e;
        if (field != null) {
            try {
                android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new android.view.WindowInsets(windowInsets);
                }
            } catch (java.lang.ReflectiveOperationException unused2) {
            }
        }
        if (!f415953h) {
            try {
                f415952g = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException unused3) {
            }
            f415953h = true;
        }
        java.lang.reflect.Constructor constructor = f415952g;
        if (constructor != null) {
            try {
                return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // n3.x2
    public n3.g3 b() {
        a();
        n3.g3 i17 = n3.g3.i(this.f415954c, null);
        e3.d[] dVarArr = this.f415972b;
        n3.d3 d3Var = i17.f415871a;
        d3Var.q(dVarArr);
        d3Var.t(this.f415955d);
        return i17;
    }

    @Override // n3.x2
    public void e(e3.d dVar) {
        this.f415955d = dVar;
    }

    @Override // n3.x2
    public void g(e3.d dVar) {
        android.view.WindowInsets windowInsets = this.f415954c;
        if (windowInsets != null) {
            this.f415954c = windowInsets.replaceSystemWindowInsets(dVar.f328577a, dVar.f328578b, dVar.f328579c, dVar.f328580d);
        }
    }

    public u2(n3.g3 g3Var) {
        super(g3Var);
        this.f415954c = g3Var.h();
    }
}
