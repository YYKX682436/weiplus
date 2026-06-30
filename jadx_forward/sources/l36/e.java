package l36;

/* loaded from: classes16.dex */
public class e extends x36.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n36.h f397011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l36.f f397012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l36.f fVar, x36.f0 f0Var, l36.j jVar, n36.h hVar) {
        super(f0Var);
        this.f397012f = fVar;
        this.f397011e = hVar;
    }

    @Override // x36.p, x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f397012f.f397024e) {
            l36.f fVar = this.f397012f;
            if (fVar.f397023d) {
                return;
            }
            fVar.f397023d = true;
            fVar.f397024e.getClass();
            super.close();
            this.f397011e.b();
        }
    }
}
