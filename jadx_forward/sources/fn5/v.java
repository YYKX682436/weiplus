package fn5;

/* loaded from: classes14.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f346300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fn5.n0 n0Var) {
        super(0);
        this.f346300d = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq on completion to ui thread update: " + java.lang.Thread.currentThread().getName());
        aq.b bVar = aq.b.f94369e;
        fn5.n0 n0Var = this.f346300d;
        n0Var.A = bVar;
        n0Var.f346256f.mo523x53d8522f(fn5.o0.f346278f);
        int size = n0Var.f346264q.size();
        fn5.p0 p0Var = (fn5.p0) n0Var.f346262o.mo3195x754a37bb();
        int size2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p0Var != null ? p0Var.name() : null, "PERSON") ? n0Var.f346265r.size() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> " + size + ", " + aq.o.f94453a + ", " + size2);
        if (!aq.o.f94453a) {
            f65.o.f341452h = size;
            f65.o oVar = f65.o.f341445a;
            oVar.d(size2);
            oVar.c(size > 0 ? 56 : 57);
        }
        return jz5.f0.f384359a;
    }
}
