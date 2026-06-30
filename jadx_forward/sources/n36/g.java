package n36;

/* loaded from: classes16.dex */
public class g extends n36.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n36.h f416351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n36.h hVar, x36.f0 f0Var) {
        super(f0Var);
        this.f416351f = hVar;
    }

    @Override // n36.l
    public void a(java.io.IOException iOException) {
        synchronized (this.f416351f.f416355d) {
            this.f416351f.c();
        }
    }
}
