package y91;

/* loaded from: classes16.dex */
public class j implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa1.c f541822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z91.a f541823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y91.o f541824c;

    public j(y91.o oVar, aa1.c cVar, z91.a aVar) {
        this.f541824c = oVar;
        this.f541822a = cVar;
        this.f541823b = aVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        z91.a aVar = this.f541823b;
        if (aVar != null) {
            aVar.a(eVar);
        }
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        ((java.util.HashMap) this.f541824c.f541838c).remove(this.f541822a.f84017a);
        z91.a aVar = this.f541823b;
        if (aVar != null) {
            aVar.b(eVar);
        }
    }
}
