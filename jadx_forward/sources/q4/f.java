package q4;

/* loaded from: classes13.dex */
public class f implements p4.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f441546d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f441547e;

    /* renamed from: f, reason: collision with root package name */
    public final p4.c f441548f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f441549g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f441550h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public q4.e f441551i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f441552m;

    public f(android.content.Context context, java.lang.String str, p4.c cVar, boolean z17) {
        this.f441546d = context;
        this.f441547e = str;
        this.f441548f = cVar;
        this.f441549g = z17;
    }

    public final q4.e a() {
        q4.e eVar;
        synchronized (this.f441550h) {
            if (this.f441551i == null) {
                q4.c[] cVarArr = new q4.c[1];
                if (this.f441547e == null || !this.f441549g) {
                    this.f441551i = new q4.e(this.f441546d, this.f441547e, cVarArr, this.f441548f);
                } else {
                    this.f441551i = new q4.e(this.f441546d, new java.io.File(this.f441546d.getNoBackupFilesDir(), this.f441547e).getAbsolutePath(), cVarArr, this.f441548f);
                }
                this.f441551i.setWriteAheadLoggingEnabled(this.f441552m);
            }
            eVar = this.f441551i;
        }
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // p4.f
    public p4.b d0() {
        return a().b();
    }

    @Override // p4.f
    /* renamed from: setWriteAheadLoggingEnabled */
    public void mo157823xfbbea326(boolean z17) {
        synchronized (this.f441550h) {
            q4.e eVar = this.f441551i;
            if (eVar != null) {
                eVar.setWriteAheadLoggingEnabled(z17);
            }
            this.f441552m = z17;
        }
    }
}
