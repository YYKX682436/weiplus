package xu5;

/* loaded from: classes12.dex */
public class k implements xu5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f538850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538851b;

    public k(xu5.o oVar, int i17) {
        this.f538851b = oVar;
        this.f538850a = i17;
    }

    @Override // xu5.p
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f531387o;
        if (!(obj instanceof xu5.n)) {
            return false;
        }
        xu5.n nVar = (xu5.n) obj;
        return nVar.f538858g == this.f538851b && nVar.f538856e.what == this.f538850a;
    }
}
