package ju5;

/* loaded from: classes15.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.j0 f383630d;

    public h0(ju5.j0 j0Var) {
        this.f383630d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        du5.d dVar = this.f383630d.f383636c.f383645i;
        if (dVar != null) {
            dVar.f();
        }
    }
}
