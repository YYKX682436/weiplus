package n36;

/* loaded from: classes16.dex */
public final class j implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f416364d;

    /* renamed from: e, reason: collision with root package name */
    public final long f416365e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.h0[] f416366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n36.k f416367g;

    public j(n36.k kVar, java.lang.String str, long j17, x36.h0[] h0VarArr, long[] jArr) {
        this.f416367g = kVar;
        this.f416364d = str;
        this.f416365e = j17;
        this.f416366f = h0VarArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (x36.h0 h0Var : this.f416366f) {
            m36.e.c(h0Var);
        }
    }
}
