package o36;

/* loaded from: classes16.dex */
public class c extends w36.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o36.j f424291g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o36.d dVar, boolean z17, x36.m mVar, x36.l lVar, o36.j jVar) {
        super(z17, mVar, lVar);
        this.f424291g = jVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p36.d dVar;
        o36.j jVar = this.f424291g;
        synchronized (jVar.f424322d) {
            dVar = jVar.f424332n;
        }
        jVar.i(true, dVar, -1L, null);
    }
}
