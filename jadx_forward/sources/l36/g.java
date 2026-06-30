package l36;

/* loaded from: classes16.dex */
public class g extends x36.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n36.j f397026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l36.h hVar, x36.h0 h0Var, n36.j jVar) {
        super(h0Var);
        this.f397026e = jVar;
    }

    @Override // x36.q, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f397026e.close();
        super.close();
    }
}
