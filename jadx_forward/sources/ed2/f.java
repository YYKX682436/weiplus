package ed2;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2.i f332795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed2.a f332796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ed2.d f332797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ed2.i iVar, ed2.a aVar, ed2.d dVar) {
        super(0);
        this.f332795d = iVar;
        this.f332796e = aVar;
        this.f332797f = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ed2.i iVar = this.f332795d;
        java.util.HashMap hashMap = iVar.f332801d;
        ed2.a aVar = this.f332796e;
        ed2.d dVar = (ed2.d) hashMap.remove(aVar);
        if (dVar != null) {
            ((ed2.c) dVar).f332791b.dismiss();
        }
        java.util.HashMap hashMap2 = iVar.f332801d;
        ed2.d dVar2 = this.f332797f;
        hashMap2.put(aVar, dVar2);
        dVar2.getClass();
        return jz5.f0.f384359a;
    }
}
