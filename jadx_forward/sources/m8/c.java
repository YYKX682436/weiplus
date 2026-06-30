package m8;

/* loaded from: classes15.dex */
public final class c implements m8.u {

    /* renamed from: a, reason: collision with root package name */
    public final r9.o f406078a;

    /* renamed from: b, reason: collision with root package name */
    public final long f406079b;

    /* renamed from: c, reason: collision with root package name */
    public final long f406080c;

    /* renamed from: d, reason: collision with root package name */
    public final long f406081d;

    /* renamed from: e, reason: collision with root package name */
    public final long f406082e;

    /* renamed from: f, reason: collision with root package name */
    public int f406083f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f406084g;

    public c(r9.o oVar, int i17, int i18, long j17, long j18) {
        this.f406078a = oVar;
        this.f406079b = i17 * 1000;
        this.f406080c = i18 * 1000;
        this.f406081d = j17 * 1000;
        this.f406082e = j18 * 1000;
    }

    public final void a(boolean z17) {
        this.f406083f = 0;
        this.f406084g = false;
        if (z17) {
            r9.o oVar = this.f406078a;
            synchronized (oVar) {
                if (oVar.f474923a) {
                    synchronized (oVar) {
                        boolean z18 = oVar.f474926d > 0;
                        oVar.f474926d = 0;
                        if (z18) {
                            oVar.b();
                        }
                    }
                }
            }
        }
    }
}
