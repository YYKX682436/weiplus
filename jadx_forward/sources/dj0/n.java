package dj0;

/* loaded from: classes14.dex */
public class n extends dj0.q {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f314396b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f314397c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Constructor f314398d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f314399e;

    /* renamed from: a, reason: collision with root package name */
    public android.view.WindowInsets f314400a;

    public n() {
        android.view.WindowInsets windowInsets;
        if (!f314397c) {
            try {
                f314396b = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException unused) {
            }
            f314397c = true;
        }
        java.lang.reflect.Field field = f314396b;
        android.view.WindowInsets windowInsets2 = null;
        if (field != null) {
            try {
                windowInsets = (android.view.WindowInsets) field.get(null);
            } catch (java.lang.ReflectiveOperationException unused2) {
            }
            if (windowInsets != null) {
                windowInsets2 = new android.view.WindowInsets(windowInsets);
                this.f314400a = windowInsets2;
            }
        }
        if (!f314399e) {
            try {
                f314398d = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException unused3) {
            }
            f314399e = true;
        }
        java.lang.reflect.Constructor constructor = f314398d;
        if (constructor != null) {
            try {
                windowInsets2 = (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException unused4) {
            }
        }
        this.f314400a = windowInsets2;
    }

    @Override // dj0.q
    public dj0.x a() {
        dj0.x xVar = new dj0.x(this.f314400a);
        dj0.w wVar = xVar.f314420a;
        wVar.n(null);
        wVar.q(null);
        return xVar;
    }
}
