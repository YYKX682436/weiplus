package xu5;

/* loaded from: classes12.dex */
public class h implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f538843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538844b;

    public h(xu5.o oVar, int i17) {
        this.f538844b = oVar;
        this.f538843a = i17;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f531387o;
        boolean z17 = false;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            if (nVar.f538858g == this.f538844b && nVar.f538856e.what == this.f538843a) {
                z17 = true;
            }
            if (z17) {
                nVar.b();
            }
        }
        return z17;
    }
}
