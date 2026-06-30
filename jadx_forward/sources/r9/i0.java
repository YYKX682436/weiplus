package r9;

/* loaded from: classes7.dex */
public final class i0 implements r9.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final r9.n f474901a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k f474902b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.h0 f474903c;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f474904d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f474905e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f474906f;

    public i0(r9.k kVar, android.net.Uri uri, int i17, r9.h0 h0Var) {
        this.f474902b = kVar;
        this.f474901a = new r9.n(uri, 1);
        this.f474903c = h0Var;
    }

    @Override // r9.c0
    public final void a() {
        r9.m mVar = new r9.m(this.f474902b, this.f474901a);
        try {
            if (!mVar.f474913g) {
                mVar.f474910d.b(mVar.f474911e);
                mVar.f474913g = true;
            }
            this.f474904d = ((h9.g) this.f474903c).b(this.f474902b.mo10287xb5887636(), mVar);
        } finally {
            this.f474906f = mVar.f474915i;
            t9.d0.d(mVar);
        }
    }

    @Override // r9.c0
    public final boolean b() {
        return this.f474905e;
    }

    @Override // r9.c0
    public final void c() {
        this.f474905e = true;
    }
}
