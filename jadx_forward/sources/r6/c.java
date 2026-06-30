package r6;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r6.d f474277a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f474278b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f474279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r6.f f474280d;

    public c(r6.f fVar, r6.d dVar, r6.a aVar) {
        this.f474280d = fVar;
        this.f474277a = dVar;
        this.f474278b = dVar.f474285e ? null : new boolean[fVar.f474296m];
    }

    public void a() {
        r6.f.a(this.f474280d, this, false);
    }

    public java.io.File b(int i17) {
        java.io.File file;
        synchronized (this.f474280d) {
            r6.d dVar = this.f474277a;
            if (dVar.f474286f != this) {
                throw new java.lang.IllegalStateException();
            }
            if (!dVar.f474285e) {
                this.f474278b[i17] = true;
            }
            file = dVar.f474284d[i17];
            if (!this.f474280d.f474290d.exists()) {
                this.f474280d.f474290d.mkdirs();
            }
        }
        return file;
    }
}
