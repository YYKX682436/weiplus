package sz3;

/* loaded from: classes15.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f495507a;

    /* renamed from: b, reason: collision with root package name */
    public long f495508b;

    /* renamed from: c, reason: collision with root package name */
    public int f495509c;

    /* renamed from: d, reason: collision with root package name */
    public int f495510d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f495511e;

    /* renamed from: f, reason: collision with root package name */
    public int f495512f;

    /* renamed from: g, reason: collision with root package name */
    public int f495513g;

    /* renamed from: i, reason: collision with root package name */
    public sz3.a1 f495515i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f495516j;

    /* renamed from: l, reason: collision with root package name */
    public int f495518l;

    /* renamed from: m, reason: collision with root package name */
    public sz3.x0 f495519m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f495520n;

    /* renamed from: o, reason: collision with root package name */
    public sz3.b1 f495521o;

    /* renamed from: p, reason: collision with root package name */
    public sz3.b1 f495522p;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f495514h = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public sz3.d1 f495517k = sz3.d1.f495539d;

    public final sz3.a1 a() {
        java.util.ArrayList arrayList = this.f495514h;
        if (!arrayList.isEmpty()) {
            return (sz3.a1) kz5.n0.a0(arrayList, 0);
        }
        return null;
    }

    public final void b(int i17, int i18, int i19) {
        if (i19 == 90 || i19 == 270) {
            this.f495512f = i18;
            this.f495513g = i17;
        } else {
            this.f495512f = i17;
            this.f495513g = i18;
        }
    }
}
