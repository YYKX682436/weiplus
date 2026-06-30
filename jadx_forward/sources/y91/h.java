package y91;

/* loaded from: classes16.dex */
public class h implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x91.h f541807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z91.c f541808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y91.o f541809c;

    public h(y91.o oVar, x91.h hVar, z91.c cVar) {
        this.f541809c = oVar;
        this.f541807a = hVar;
        this.f541808b = cVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        z91.c cVar = this.f541808b;
        if (cVar != null) {
            cVar.a(eVar);
        }
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        java.lang.String a17 = eVar.f84021a.a("SID");
        aa1.c cVar = new aa1.c();
        aa1.b bVar = eVar.f84021a;
        cVar.f84017a = bVar.a("SID");
        bVar.a(com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.f6097xbb18f1ea);
        cVar.f84018b = this.f541807a;
        ((java.util.HashMap) this.f541809c.f541838c).put(a17, cVar);
        z91.c cVar2 = this.f541808b;
        if (cVar2 != null) {
            cVar2.b(cVar);
        }
    }
}
