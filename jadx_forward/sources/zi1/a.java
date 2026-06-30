package zi1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xi1.o f554624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi1.b f554625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xi1.n f554626f;

    public a(xi1.o oVar, zi1.b bVar, xi1.n nVar) {
        this.f554624d = oVar;
        this.f554625e = bVar;
        this.f554626f = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xi1.o oVar = xi1.o.PORTRAIT;
        xi1.n nVar = this.f554626f;
        zi1.b bVar = this.f554625e;
        xi1.o oVar2 = this.f554624d;
        if (oVar2 == oVar) {
            bVar.f554628a.mo51619xfa43b684("portrait");
            if (nVar != null) {
                nVar.e(bVar.a(), bVar.a() == oVar2);
                return;
            }
            return;
        }
        int i17 = zi1.b.f554627b;
        xi1.o[] oVarArr = xi1.o.f536243n;
        if (kz5.z.G(oVarArr, oVar2)) {
            bVar.f554628a.mo51619xfa43b684("landscape");
            if (nVar != null) {
                nVar.e(bVar.a(), kz5.z.G(oVarArr, bVar.a()));
                return;
            }
            return;
        }
        if (oVar2 == xi1.o.UNSPECIFIED) {
            bVar.f554628a.mo51619xfa43b684("auto");
            if (nVar != null) {
                nVar.e(bVar.a(), true);
                return;
            }
            return;
        }
        bVar.f554628a.mo51619xfa43b684("portrait");
        if (nVar != null) {
            nVar.e(bVar.a(), bVar.a() == oVar2);
        }
    }
}
