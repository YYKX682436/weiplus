package as;

/* loaded from: classes8.dex */
public final class h implements xr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xr.f f94954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xr.e f94955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.h6 f94956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.n7 f94957d;

    public h(xr.f fVar, xr.e eVar, qk.h6 h6Var, qk.n7 n7Var) {
        this.f94954a = fVar;
        this.f94955b = eVar;
        this.f94956c = h6Var;
        this.f94957d = n7Var;
    }

    @Override // xr.b
    public void a(qk.h6 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpUpdateExecutor", "[onSuccessFetch] item:" + item);
        long j17 = item.f66758x27886e88;
        long a17 = c01.id.a() / 1000;
        xr.e eVar = this.f94955b;
        xr.f fVar = this.f94954a;
        if (j17 > a17) {
            fVar.a(0, item, eVar.f537677c);
            fVar.d(eVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpUpdateExecutor", "[onTaskExpired] to show! id:" + this.f94956c.f66769xf47740ff);
        ((jq.e) this.f94957d).a(item.f66769xf47740ff, item, item.f66759xf1091605, item.t0());
        fVar.d(eVar);
    }

    @Override // xr.b
    public void b(qk.h6 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FunctionMsg.OpUpdateExecutor", "[onFailFetch] item:" + item);
        int i17 = item.f66777x10a0fed7;
        xr.e eVar = this.f94955b;
        xr.f fVar = this.f94954a;
        if (i17 == -1) {
            fVar.a(-1, item, eVar.f537677c);
        }
        fVar.d(eVar);
    }
}
