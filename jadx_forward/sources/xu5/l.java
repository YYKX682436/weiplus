package xu5;

/* loaded from: classes12.dex */
public class l implements xu5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f538852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538853b;

    public l(xu5.o oVar, java.lang.Object obj) {
        this.f538853b = oVar;
        this.f538852a = obj;
    }

    @Override // xu5.p
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f531387o;
        if (!(obj instanceof xu5.n)) {
            return false;
        }
        xu5.n nVar = (xu5.n) obj;
        return nVar.f538858g == this.f538853b && nVar.f538856e.obj == this.f538852a;
    }
}
