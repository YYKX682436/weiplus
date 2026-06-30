package j8;

/* loaded from: classes15.dex */
public class d implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j8.g f379627d;

    public d(j8.g gVar) {
        this.f379627d = gVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -2079769446:
                if (str.equals("getOrientation")) {
                    c17 = 0;
                    break;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    c17 = 1;
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        j8.g gVar = this.f379627d;
        switch (c17) {
            case 0:
                java.lang.Boolean bool = (java.lang.Boolean) c28687x4bb242ff.m138433xa13f5ebd("useSensor");
                if (bool == null || !bool.booleanValue()) {
                    result.mo65720x90b54003(gVar.f379632f.a().name());
                    return;
                }
                j8.o oVar = gVar.f379633g;
                ((java.util.LinkedList) oVar.f379663b).add(new j8.c(this, result));
                if (oVar.f379664c != null) {
                    return;
                }
                j8.n nVar = new j8.n(oVar.f379662a, oVar, j8.m.fastest);
                oVar.f379664c = nVar;
                nVar.a();
                return;
            case 1:
                j8.b bVar = gVar.f379636m;
                if (bVar != null) {
                    bVar.a();
                }
                result.mo65720x90b54003(null);
                return;
            case 2:
                j8.b bVar2 = gVar.f379636m;
                if (bVar2 != null) {
                    bVar2.b();
                }
                result.mo65720x90b54003(null);
                return;
            default:
                result.mo65719xbc9fa82f();
                return;
        }
    }
}
