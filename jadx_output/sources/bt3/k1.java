package bt3;

/* loaded from: classes9.dex */
public abstract class k1 implements zs3.r {

    /* renamed from: b, reason: collision with root package name */
    public final int f24305b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24306c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24304a = false;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f24307d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f24308e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f24309f = 0;

    public k1(int i17, int i18) {
        this.f24305b = i17 <= 0 ? 3 : i17;
        this.f24306c = i18 <= 0 ? 300000 : i18;
    }

    public void a() {
        this.f24304a = false;
        b();
    }

    public void b() {
        gm0.j1.e().j(new bt3.i1(this));
    }
}
