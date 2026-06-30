package a;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static volatile a.b f43h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f44a;

    /* renamed from: b, reason: collision with root package name */
    public final zy5.a f45b = new zy5.a();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f46c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f47d = false;

    /* renamed from: e, reason: collision with root package name */
    public mk.b f48e;

    /* renamed from: f, reason: collision with root package name */
    public mk.d f49f;

    /* renamed from: g, reason: collision with root package name */
    public mk.f f50g;

    public static a.b c() {
        if (f43h == null) {
            synchronized (a.b.class) {
                if (f43h == null) {
                    f43h = new a.b();
                }
            }
        }
        return f43h;
    }

    public final android.app.Activity a() {
        java.lang.Object obj;
        java.lang.ref.WeakReference weakReference;
        zy5.a aVar = this.f45b;
        aVar.d();
        try {
            weakReference = (java.lang.ref.WeakReference) aVar.f477687d.get(r0.size() - 1);
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
        if (weakReference != null) {
            obj = weakReference.get();
            return (android.app.Activity) obj;
        }
        obj = null;
        return (android.app.Activity) obj;
    }

    public final java.lang.String b() {
        return this.f48e != null ? com.tencent.mm.sdk.platformtools.o4.M("mmkv_id_amoeba_default").getString("amoeba_distinct_id", "") : "";
    }
}
