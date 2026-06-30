package h5;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f360519f = a5.a0.e("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final m5.a f360520a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f360521b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f360522c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f360523d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f360524e;

    public f(android.content.Context context, m5.a aVar) {
        this.f360521b = context.getApplicationContext();
        this.f360520a = aVar;
    }

    public abstract java.lang.Object a();

    public void b(java.lang.Object obj) {
        synchronized (this.f360522c) {
            java.lang.Object obj2 = this.f360524e;
            if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                this.f360524e = obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f360523d);
                ((m5.b) ((m5.c) this.f360520a).f405005c).execute(new h5.e(this, arrayList));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
