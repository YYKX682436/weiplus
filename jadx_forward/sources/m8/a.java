package m8;

/* loaded from: classes15.dex */
public abstract class a implements m8.b0, m8.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f406068d;

    /* renamed from: e, reason: collision with root package name */
    public m8.d0 f406069e;

    /* renamed from: f, reason: collision with root package name */
    public int f406070f;

    /* renamed from: g, reason: collision with root package name */
    public int f406071g;

    /* renamed from: h, reason: collision with root package name */
    public d9.g0 f406072h;

    /* renamed from: i, reason: collision with root package name */
    public long f406073i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f406074m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f406075n;

    public a(int i17) {
        this.f406068d = i17;
    }

    @Override // m8.g
    public void b(int i17, java.lang.Object obj) {
    }

    @Override // m8.c0
    public int g() {
        return 0;
    }

    @Override // m8.b0
    public t9.j j() {
        return null;
    }

    public final void k() {
        t9.a.d(this.f406071g == 1);
        this.f406071g = 0;
        this.f406072h = null;
        this.f406075n = false;
        l();
    }

    public abstract void l();

    public void m(boolean z17) {
    }

    public abstract void n(long j17, boolean z17);

    public void o() {
    }

    public void p() {
    }

    public void q(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr, long j17) {
    }

    public final int r(m8.s sVar, o8.g gVar, boolean z17) {
        int a17 = this.f406072h.a(sVar, gVar, z17);
        if (a17 == -4) {
            if (gVar.b(4)) {
                this.f406074m = true;
                return this.f406075n ? -4 : -3;
            }
            gVar.f425144g += this.f406073i;
        } else if (a17 == -5) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = sVar.f406199a;
            long j17 = c1601x7dc4e417.C;
            if (j17 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                sVar.f406199a = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417(c1601x7dc4e417.f125608d, c1601x7dc4e417.f125612h, c1601x7dc4e417.f125613i, c1601x7dc4e417.f125610f, c1601x7dc4e417.f125609e, c1601x7dc4e417.f125614m, c1601x7dc4e417.f125617p, c1601x7dc4e417.f125618q, c1601x7dc4e417.f125619r, c1601x7dc4e417.f125620s, c1601x7dc4e417.f125621t, c1601x7dc4e417.f125623v, c1601x7dc4e417.f125622u, c1601x7dc4e417.f125624w, c1601x7dc4e417.f125625x, c1601x7dc4e417.f125626y, c1601x7dc4e417.f125627z, c1601x7dc4e417.A, c1601x7dc4e417.B, c1601x7dc4e417.D, c1601x7dc4e417.E, c1601x7dc4e417.F, j17 + this.f406073i, c1601x7dc4e417.f125615n, c1601x7dc4e417.f125616o, c1601x7dc4e417.f125611g);
            }
        }
        return a17;
    }
}
