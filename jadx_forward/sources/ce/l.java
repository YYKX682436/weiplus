package ce;

/* loaded from: classes7.dex */
public class l implements xi1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xi1.n f122211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce.n f122212b;

    public l(ce.n nVar, xi1.n nVar2) {
        this.f122212b = nVar;
        this.f122211a = nVar2;
    }

    @Override // xi1.n
    public void e(xi1.o oVar, boolean z17) {
        this.f122212b.e(oVar, z17);
        xi1.n nVar = this.f122211a;
        if (nVar != null) {
            nVar.e(oVar, z17);
        }
    }
}
