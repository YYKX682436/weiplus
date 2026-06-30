package bz2;

/* loaded from: classes2.dex */
public abstract class c extends com.tencent.mm.modelbase.i implements ay1.m {

    /* renamed from: m, reason: collision with root package name */
    public im5.b f36766m;

    public c(im5.b bVar) {
        this.f36766m = bVar;
    }

    @Override // ay1.m
    public java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        pq5.g l17 = l();
        im5.b bVar = this.f36766m;
        if (bVar != null) {
            l17.f(bVar);
        }
        this.f36766m = null;
        l17.K(new bz2.b(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // ay1.m
    public void b() {
        j();
        this.f36766m = null;
    }

    @Override // ay1.m
    public void c(java.lang.Object obj) {
        com.tencent.mm.modelbase.f value = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(value, "value");
    }
}
