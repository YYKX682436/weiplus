package n36;

/* loaded from: classes16.dex */
public class a implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f416342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x36.m f416343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n36.c f416344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x36.l f416345g;

    public a(n36.b bVar, x36.m mVar, n36.c cVar, x36.l lVar) {
        this.f416343e = mVar;
        this.f416344f = cVar;
        this.f416345g = lVar;
    }

    @Override // x36.h0
    public long B(x36.k kVar, long j17) {
        try {
            long B = this.f416343e.B(kVar, j17);
            x36.l lVar = this.f416345g;
            if (B != -1) {
                kVar.b(lVar.m(), kVar.f533227e - B, B);
                lVar.z0();
                return B;
            }
            if (!this.f416342d) {
                this.f416342d = true;
                lVar.close();
            }
            return -1L;
        } catch (java.io.IOException e17) {
            if (!this.f416342d) {
                this.f416342d = true;
                ((l36.f) this.f416344f).a();
            }
            throw e17;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z17;
        if (!this.f416342d) {
            try {
                z17 = m36.e.q(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.io.IOException unused) {
                z17 = false;
            }
            if (!z17) {
                this.f416342d = true;
                ((l36.f) this.f416344f).a();
            }
        }
        this.f416343e.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f416343e.h();
    }
}
