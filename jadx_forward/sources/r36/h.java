package r36;

/* loaded from: classes16.dex */
public class h extends x36.q {

    /* renamed from: e, reason: collision with root package name */
    public boolean f450939e;

    /* renamed from: f, reason: collision with root package name */
    public long f450940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r36.i f450941g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r36.i iVar, x36.h0 h0Var) {
        super(h0Var);
        this.f450941g = iVar;
        this.f450939e = false;
        this.f450940f = 0L;
    }

    @Override // x36.q, x36.h0
    public long B(x36.k kVar, long j17) {
        try {
            long B = this.f533234d.B(kVar, j17);
            if (B > 0) {
                this.f450940f += B;
            }
            return B;
        } catch (java.io.IOException e17) {
            if (!this.f450939e) {
                this.f450939e = true;
                r36.i iVar = this.f450941g;
                iVar.f450952b.i(false, iVar, this.f450940f, e17);
            }
            throw e17;
        }
    }

    @Override // x36.q, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.f450939e) {
            return;
        }
        this.f450939e = true;
        r36.i iVar = this.f450941g;
        iVar.f450952b.i(false, iVar, this.f450940f, null);
    }
}
