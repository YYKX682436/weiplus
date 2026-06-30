package ce;

/* loaded from: classes7.dex */
public class l implements xi1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xi1.n f40678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce.n f40679b;

    public l(ce.n nVar, xi1.n nVar2) {
        this.f40679b = nVar;
        this.f40678a = nVar2;
    }

    @Override // xi1.n
    public void e(xi1.o oVar, boolean z17) {
        this.f40679b.e(oVar, z17);
        xi1.n nVar = this.f40678a;
        if (nVar != null) {
            nVar.e(oVar, z17);
        }
    }
}
