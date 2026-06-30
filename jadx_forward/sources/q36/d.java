package q36;

/* loaded from: classes16.dex */
public class d extends q36.b {

    /* renamed from: h, reason: collision with root package name */
    public final l36.k0 f441521h;

    /* renamed from: i, reason: collision with root package name */
    public long f441522i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f441523m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q36.h f441524n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q36.h hVar, l36.k0 k0Var) {
        super(hVar, null);
        this.f441524n = hVar;
        this.f441522i = -1L;
        this.f441523m = true;
        this.f441521h = k0Var;
    }

    @Override // q36.b, x36.h0
    public long B(x36.k kVar, long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: " + j17);
        }
        if (this.f441515e) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (!this.f441523m) {
            return -1L;
        }
        long j18 = this.f441522i;
        if (j18 == 0 || j18 == -1) {
            q36.h hVar = this.f441524n;
            if (j18 != -1) {
                hVar.f441533c.L0();
            }
            try {
                this.f441522i = hVar.f441533c.t0();
                java.lang.String trim = hVar.f441533c.L0().trim();
                if (this.f441522i < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + this.f441522i + trim + "\"");
                }
                if (this.f441522i == 0) {
                    this.f441523m = false;
                    p36.g.d(hVar.f441531a.f397128o, this.f441521h, hVar.h());
                    a(true, null);
                }
                if (!this.f441523m) {
                    return -1L;
                }
            } catch (java.lang.NumberFormatException e17) {
                throw new java.net.ProtocolException(e17.getMessage());
            }
        }
        long B = super.B(kVar, java.lang.Math.min(j17, this.f441522i));
        if (B != -1) {
            this.f441522i -= B;
            return B;
        }
        java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
        a(false, protocolException);
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z17;
        if (this.f441515e) {
            return;
        }
        if (this.f441523m) {
            try {
                z17 = m36.e.q(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.io.IOException unused) {
                z17 = false;
            }
            if (!z17) {
                a(false, null);
            }
        }
        this.f441515e = true;
    }
}
