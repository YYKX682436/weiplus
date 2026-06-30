package a;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static volatile a.b f81576h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f81577a;

    /* renamed from: b, reason: collision with root package name */
    public final zy5.a f81578b = new zy5.a();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f81579c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f81580d = false;

    /* renamed from: e, reason: collision with root package name */
    public mk.b f81581e;

    /* renamed from: f, reason: collision with root package name */
    public mk.d f81582f;

    /* renamed from: g, reason: collision with root package name */
    public mk.f f81583g;

    public static a.b c() {
        if (f81576h == null) {
            synchronized (a.b.class) {
                if (f81576h == null) {
                    f81576h = new a.b();
                }
            }
        }
        return f81576h;
    }

    public final android.app.Activity a() {
        java.lang.Object obj;
        java.lang.ref.WeakReference weakReference;
        zy5.a aVar = this.f81578b;
        aVar.d();
        try {
            weakReference = (java.lang.ref.WeakReference) aVar.f559220d.get(r0.size() - 1);
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
        return this.f81581e != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").getString("amoeba_distinct_id", "") : "";
    }
}
