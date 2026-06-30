package s9;

/* loaded from: classes7.dex */
public final class e implements r9.i {

    /* renamed from: a, reason: collision with root package name */
    public final s9.c f486449a;

    /* renamed from: b, reason: collision with root package name */
    public final long f486450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f486451c;

    /* renamed from: d, reason: collision with root package name */
    public r9.n f486452d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.File f486453e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.OutputStream f486454f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.FileOutputStream f486455g;

    /* renamed from: h, reason: collision with root package name */
    public long f486456h;

    /* renamed from: i, reason: collision with root package name */
    public long f486457i;

    /* renamed from: j, reason: collision with root package name */
    public t9.t f486458j;

    public e(s9.c cVar, long j17, int i17) {
        cVar.getClass();
        this.f486449a = cVar;
        this.f486450b = j17;
        this.f486451c = i17;
    }

    public final void a() {
        java.io.OutputStream outputStream = this.f486454f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f486455g.getFD().sync();
            t9.d0.d(this.f486454f);
            this.f486454f = null;
            java.io.File file = this.f486453e;
            this.f486453e = null;
            this.f486449a.j(file);
        } catch (java.lang.Throwable th6) {
            t9.d0.d(this.f486454f);
            this.f486454f = null;
            java.io.File file2 = this.f486453e;
            this.f486453e = null;
            file2.delete();
            throw th6;
        }
    }

    public final void b() {
        long j17 = this.f486452d.f474920e;
        long j18 = this.f486450b;
        if (j17 != -1) {
            j18 = java.lang.Math.min(j17 - this.f486457i, j18);
        }
        s9.c cVar = this.f486449a;
        r9.n nVar = this.f486452d;
        this.f486453e = cVar.e(nVar.f474921f, nVar.f474918c + this.f486457i, j18);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.f486453e);
        this.f486455g = fileOutputStream;
        int i17 = this.f486451c;
        if (i17 > 0) {
            t9.t tVar = this.f486458j;
            if (tVar == null) {
                this.f486458j = new t9.t(this.f486455g, i17);
            } else {
                tVar.a(fileOutputStream);
            }
            this.f486454f = this.f486458j;
        } else {
            this.f486454f = fileOutputStream;
        }
        this.f486456h = 0L;
    }
}
