package ju5;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.k0 f383612d;

    public c0(ju5.k0 k0Var) {
        this.f383612d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        du5.d dVar = this.f383612d.f383645i;
        if (dVar != null) {
            dVar.b();
        }
    }
}
