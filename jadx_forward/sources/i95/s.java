package i95;

/* loaded from: classes12.dex */
public class s implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.v f371383d;

    public s(i95.v vVar) {
        this.f371383d = vVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        boolean z17;
        synchronized (this.f371383d) {
            z17 = this.f371383d.f371393n != null;
        }
        if (z17) {
            this.f371383d.join();
            return null;
        }
        this.f371383d.invoke();
        return null;
    }
}
