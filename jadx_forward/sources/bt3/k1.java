package bt3;

/* loaded from: classes9.dex */
public abstract class k1 implements zs3.r {

    /* renamed from: b, reason: collision with root package name */
    public final int f105838b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105839c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f105837a = false;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f105840d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f105841e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f105842f = 0;

    public k1(int i17, int i18) {
        this.f105838b = i17 <= 0 ? 3 : i17;
        this.f105839c = i18 <= 0 ? 300000 : i18;
    }

    public void a() {
        this.f105837a = false;
        b();
    }

    public void b() {
        gm0.j1.e().j(new bt3.i1(this));
    }
}
