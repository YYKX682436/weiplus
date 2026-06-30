package sd;

/* loaded from: classes8.dex */
public class i0 implements td.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.c f488139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od.g f488140b;

    public i0(sd.l0 l0Var, sd.c cVar, od.g gVar) {
        this.f488139a = cVar;
        this.f488140b = gVar;
    }

    @Override // td.e
    public void a(td.d dVar) {
        td.d dVar2 = td.d.PASS;
        od.g gVar = this.f488140b;
        if (dVar != dVar2) {
            gVar.a("system:access_denied", null);
            return;
        }
        sd.c cVar = this.f488139a;
        sd.b bVar = new sd.b(cVar);
        bVar.f488129a = cVar.f488131d;
        bVar.f488130b = gVar;
        cVar.a(bVar);
    }
}
