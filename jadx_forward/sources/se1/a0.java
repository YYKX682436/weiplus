package se1;

/* loaded from: classes13.dex */
public class a0 extends se1.n {
    public static int A = 3;
    public static boolean B;

    /* renamed from: x, reason: collision with root package name */
    public final te1.s f488270x;

    /* renamed from: y, reason: collision with root package name */
    public int f488271y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f488272z;

    public a0(java.lang.String str, ve1.h hVar, se1.j0 j0Var, te1.c cVar, ve1.d dVar, te1.s sVar) {
        super(str, hVar, j0Var, 30000, 12000, true, dVar);
        this.f488271y = 0;
        this.f488270x = sVar;
        if (B) {
            return;
        }
        A = qe1.a.a().f443560l;
        B = true;
    }

    @Override // se1.n, se1.g
    public int a(byte[] bArr, int i17, int i18) {
        try {
            return super.a(bArr, i17, i18);
        } catch (se1.q e17) {
            ve1.g.p(4, i(), "read source error occurred " + e17.toString(), null);
            int i19 = this.f488271y + 1;
            this.f488271y = i19;
            long j17 = this.f488341j.f488307c + this.f488348q;
            int i27 = i19 * 2000;
            ve1.g.p(4, i(), "retrying after " + i27 + " ms, read start at offset " + j17 + " retry " + this.f488271y + "/" + A, null);
            try {
                java.lang.Thread.sleep(i27);
                java.net.HttpURLConnection httpURLConnection = this.f488342k;
                se1.i iVar = new se1.i(android.net.Uri.parse(httpURLConnection == null ? null : httpURLConnection.getURL().toString()), 0L, j17, -1L, null, 0, this.f488272z, this.f488341j.f488312h);
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    throw e17;
                }
                if (this.f488271y >= A) {
                    throw e17;
                }
                te1.s sVar = this.f488270x;
                if (!sVar.a(1)) {
                    c(iVar);
                    return a(bArr, i17, i18);
                }
                ve1.g.p(4, i(), "abort retry videoRequest is cancelling " + sVar, null);
                throw new se1.s("readRetry interrupted " + sVar, this.f488341j);
            } catch (java.lang.InterruptedException unused) {
                ve1.g.p(5, i(), "readRetry interrupted", null);
                throw e17;
            }
        }
    }

    @Override // se1.n, se1.g
    public long c(se1.i iVar) {
        this.f488272z = iVar.f488311g;
        try {
            return k(iVar, null);
        } catch (se1.q e17) {
            int i17 = e17 instanceof se1.v ? ((se1.v) e17).f488361d : 0;
            java.lang.String uri = iVar.f488305a.toString();
            ve1.g.p(4, i(), "retryOpen url=" + uri + " with responseCode=" + i17, null);
            if (!java.lang.Thread.currentThread().isInterrupted() && A > 0) {
                ve1.g.p(4, i(), "httpRetryLogic is null", null);
            }
            throw e17;
        }
    }
}
