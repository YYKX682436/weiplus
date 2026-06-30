package y91;

/* loaded from: classes16.dex */
public class k implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa1.c f541826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z91.a f541827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y91.o f541828c;

    public k(y91.o oVar, aa1.c cVar, z91.a aVar) {
        this.f541828c = oVar;
        this.f541826a = cVar;
        this.f541827b = aVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        z91.a aVar = this.f541827b;
        if (aVar != null) {
            aVar.a(eVar);
        }
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        ((java.util.HashMap) this.f541828c.f541839d).remove(this.f541826a.f84017a);
        z91.a aVar = this.f541827b;
        if (aVar != null) {
            aVar.b(eVar);
        }
    }
}
