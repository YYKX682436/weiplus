package uv2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f512900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uv2.n f512901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f512902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f512903g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.mb4 mb4Var, uv2.n nVar, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f512900d = mb4Var;
        this.f512901e = nVar;
        this.f512902f = obj;
        this.f512903g = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[processComposition] success:" + result.f257326a + " isCancel:" + result.f257328c);
        uv2.e.f512913e.remove(uv2.e.f512909a.i(this.f512900d));
        uv2.n nVar = this.f512901e;
        nVar.getClass();
        nVar.f512935b = result;
        this.f512901e.f512937d = result.f257326a ? 0 : -1;
        java.lang.Object obj2 = this.f512902f;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f512903g;
        synchronized (obj2) {
            c0Var.f391645d = true;
            obj2.notifyAll();
        }
        return jz5.f0.f384359a;
    }
}
