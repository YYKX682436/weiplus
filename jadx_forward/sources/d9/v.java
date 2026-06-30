package d9;

/* loaded from: classes15.dex */
public final class v implements d9.a0, d9.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f308951a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.j f308952b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.h f308953c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f308954d;

    /* renamed from: e, reason: collision with root package name */
    public final d9.u f308955e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f308956f;

    /* renamed from: g, reason: collision with root package name */
    public d9.y f308957g;

    /* renamed from: h, reason: collision with root package name */
    public long f308958h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f308959i;

    public v(android.net.Uri uri, r9.j jVar, q8.h hVar, android.os.Handler handler, d9.u uVar) {
        this(uri, jVar, hVar, handler, uVar, null);
    }

    @Override // d9.a0
    public void a(m8.i iVar, boolean z17, d9.y yVar) {
        this.f308957g = yVar;
        f(-9223372036854775807L, false);
    }

    @Override // d9.a0
    public void b(d9.x xVar) {
        d9.t tVar = (d9.t) xVar;
        boolean c17 = tVar.f308940p.c(tVar);
        if (tVar.A && !c17) {
            for (d9.f0 f0Var : tVar.f308948x) {
                f0Var.h();
            }
        }
        tVar.f308945u.removeCallbacksAndMessages(null);
        tVar.P = true;
    }

    @Override // d9.a0
    public void c() {
    }

    @Override // d9.a0
    public d9.x d(d9.z zVar, r9.b bVar) {
        t9.a.a(zVar.f308960a == 0);
        return new d9.t(this.f308951a, this.f308952b.mo10288xb8a7ce81(), this.f308953c.a(), -1, this.f308954d, this.f308955e, this, bVar, this.f308956f, 1048576);
    }

    @Override // d9.a0
    public void e() {
        this.f308957g = null;
    }

    public final void f(long j17, boolean z17) {
        this.f308958h = j17;
        this.f308959i = z17;
        d9.y yVar = this.f308957g;
        long j18 = this.f308958h;
        ((m8.p) yVar).f406182i.obtainMessage(7, android.util.Pair.create(new d9.j0(-9223372036854775807L, -9223372036854775807L, j18, j18, 0L, 0L, this.f308959i, false), null)).sendToTarget();
    }

    public void g(long j17, boolean z17) {
        if (j17 == -9223372036854775807L) {
            j17 = this.f308958h;
        }
        long j18 = this.f308958h;
        if (j18 == j17 && this.f308959i == z17) {
            return;
        }
        if (j18 == -9223372036854775807L || j17 != -9223372036854775807L) {
            f(j17, z17);
        }
    }

    public v(android.net.Uri uri, r9.j jVar, q8.h hVar, android.os.Handler handler, d9.u uVar, java.lang.String str) {
        this.f308951a = uri;
        this.f308952b = jVar;
        this.f308953c = hVar;
        this.f308954d = handler;
        this.f308955e = uVar;
        this.f308956f = str;
    }
}
