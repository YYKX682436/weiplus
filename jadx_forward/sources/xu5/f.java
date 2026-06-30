package xu5;

/* loaded from: classes12.dex */
public class f implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f538838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538839b;

    public f(xu5.o oVar, java.lang.Runnable runnable) {
        this.f538839b = oVar;
        this.f538838a = runnable;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f531387o;
        boolean z17 = false;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            if (nVar.f538858g == this.f538839b && nVar.f538856e.getCallback() == this.f538838a) {
                z17 = true;
            }
            if (z17) {
                nVar.b();
            }
        }
        return z17;
    }
}
