package ou5;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430575a;

    /* renamed from: b, reason: collision with root package name */
    public float f430576b;

    /* renamed from: c, reason: collision with root package name */
    public float f430577c;

    /* renamed from: d, reason: collision with root package name */
    public long f430578d;

    /* renamed from: e, reason: collision with root package name */
    public long f430579e;

    /* renamed from: f, reason: collision with root package name */
    public float f430580f;

    /* renamed from: g, reason: collision with root package name */
    public float f430581g;

    /* renamed from: h, reason: collision with root package name */
    public float f430582h;

    /* renamed from: i, reason: collision with root package name */
    public float f430583i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f430584j;

    public b(java.lang.String str) {
        this.f430576b = 0.0f;
        this.f430577c = 0.0f;
        this.f430578d = 0L;
        this.f430579e = 0L;
        this.f430580f = 0.0f;
        this.f430581g = 0.0f;
        this.f430582h = 1.0f;
        this.f430583i = 0.0f;
        this.f430584j = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f430575a = str;
    }

    public boolean a() {
        return this.f430578d >= 5000 || this.f430577c >= 0.5f;
    }

    /* renamed from: toString */
    public java.lang.String m157135x9616526c() {
        return this.f430575a + " " + this.f430577c + " " + a() + " " + this.f430584j.size();
    }

    public b(java.lang.String str, float f17, long j17) {
        this.f430576b = 0.0f;
        this.f430577c = 0.0f;
        this.f430578d = 0L;
        this.f430579e = 0L;
        this.f430580f = 0.0f;
        this.f430581g = 0.0f;
        this.f430582h = 1.0f;
        this.f430583i = 0.0f;
        this.f430584j = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f430575a = str;
        this.f430577c = f17;
        this.f430578d = j17;
    }
}
