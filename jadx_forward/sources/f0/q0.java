package f0;

/* loaded from: classes14.dex */
public final class q0 implements f0.k {

    /* renamed from: a, reason: collision with root package name */
    public final long f339719a;

    /* renamed from: b, reason: collision with root package name */
    public final long f339720b;

    /* renamed from: c, reason: collision with root package name */
    public final int f339721c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f339722d;

    /* renamed from: e, reason: collision with root package name */
    public final int f339723e;

    /* renamed from: f, reason: collision with root package name */
    public final int f339724f;

    /* renamed from: g, reason: collision with root package name */
    public final long f339725g;

    /* renamed from: h, reason: collision with root package name */
    public final int f339726h;

    /* renamed from: i, reason: collision with root package name */
    public final int f339727i;

    /* renamed from: j, reason: collision with root package name */
    public final int f339728j;

    /* renamed from: k, reason: collision with root package name */
    public final int f339729k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f339730l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f339731m;

    /* renamed from: n, reason: collision with root package name */
    public final f0.o f339732n;

    /* renamed from: o, reason: collision with root package name */
    public final long f339733o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f339734p;

    public q0(long j17, long j18, int i17, java.lang.Object obj, int i18, int i19, long j19, int i27, int i28, int i29, int i37, boolean z17, java.util.List list, f0.o oVar, long j27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f339719a = j17;
        this.f339720b = j18;
        this.f339721c = i17;
        this.f339722d = obj;
        this.f339723e = i18;
        this.f339724f = i19;
        this.f339725g = j19;
        this.f339726h = i27;
        this.f339727i = i28;
        this.f339728j = i29;
        this.f339729k = i37;
        this.f339730l = z17;
        this.f339731m = list;
        this.f339732n = oVar;
        this.f339733o = j27;
        int size = list.size();
        boolean z18 = false;
        int i38 = 0;
        while (true) {
            if (i38 >= size) {
                break;
            }
            if (a(i38) != null) {
                z18 = true;
                break;
            }
            i38++;
        }
        this.f339734p = z18;
    }

    public final z.k0 a(int i17) {
        java.lang.Object obj = ((f0.p0) this.f339731m.get(i17)).f339715b;
        if (obj instanceof z.k0) {
            return (z.k0) obj;
        }
        return null;
    }

    public final int b() {
        boolean z17 = this.f339730l;
        long j17 = this.f339725g;
        return this.f339727i + (z17 ? p2.q.b(j17) : (int) (j17 >> 32));
    }
}
