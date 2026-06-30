package xu5;

/* loaded from: classes12.dex */
public class j implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f538848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538849b;

    public j(xu5.o oVar, java.lang.Object obj) {
        this.f538849b = oVar;
        this.f538848a = obj;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj;
        java.lang.Object obj2 = vVar.f531387o;
        boolean z17 = false;
        if (obj2 instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj2;
            if (nVar.f538858g == this.f538849b && ((obj = this.f538848a) == null || nVar.f538856e.obj == obj)) {
                z17 = true;
            }
            if (z17) {
                nVar.b();
            }
        }
        return z17;
    }
}
