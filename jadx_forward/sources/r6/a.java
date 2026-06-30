package r6;

/* loaded from: classes13.dex */
public class a implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r6.f f474276d;

    public a(r6.f fVar) {
        this.f474276d = fVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        synchronized (this.f474276d) {
            r6.f fVar = this.f474276d;
            if (fVar.f474298o == null) {
                return null;
            }
            fVar.z();
            if (this.f474276d.k()) {
                this.f474276d.w();
                this.f474276d.f474300q = 0;
            }
            return null;
        }
    }
}
