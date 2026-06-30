package d9;

/* loaded from: classes15.dex */
public final class j implements d9.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final d9.x f308884a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.g0 f308885b;

    /* renamed from: c, reason: collision with root package name */
    public final long f308886c;

    /* renamed from: d, reason: collision with root package name */
    public final long f308887d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f308888e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f308889f;

    public j(d9.x xVar, d9.g0 g0Var, long j17, long j18, boolean z17) {
        this.f308884a = xVar;
        this.f308885b = g0Var;
        this.f308886c = j17;
        this.f308887d = j18;
        this.f308888e = z17;
    }

    @Override // d9.g0
    public int a(m8.s sVar, o8.g gVar, boolean z17) {
        if (this.f308888e) {
            return -3;
        }
        if (this.f308889f) {
            gVar.f425127d = 4;
            return -4;
        }
        int a17 = this.f308885b.a(sVar, gVar, z17);
        long j17 = this.f308887d;
        if (j17 == Long.MIN_VALUE || ((a17 != -4 || gVar.f425144g < j17) && !(a17 == -3 && this.f308884a.m() == Long.MIN_VALUE))) {
            if (a17 == -4 && !gVar.b(4)) {
                gVar.f425144g -= this.f308886c;
            }
            return a17;
        }
        gVar.l();
        gVar.f425127d = 4;
        this.f308889f = true;
        return -4;
    }

    @Override // d9.g0
    public void b() {
        this.f308885b.b();
    }

    @Override // d9.g0
    public void c(long j17) {
        this.f308885b.c(this.f308886c + j17);
    }

    @Override // d9.g0
    /* renamed from: isReady */
    public boolean mo123736x7b5e8699() {
        return this.f308885b.mo123736x7b5e8699();
    }
}
