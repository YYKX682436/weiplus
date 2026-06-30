package as;

/* loaded from: classes8.dex */
public final class b implements xr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xr.f f94948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xr.e f94949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.h6 f94950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.n7 f94951d;

    public b(xr.f fVar, xr.e eVar, qk.h6 h6Var, qk.n7 n7Var) {
        this.f94948a = fVar;
        this.f94949b = eVar;
        this.f94950c = h6Var;
        this.f94951d = n7Var;
    }

    @Override // xr.b
    public void a(qk.h6 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDelayExecutor", "[onSuccessFetch] item:" + item);
        long j17 = item.f66758x27886e88;
        long a17 = c01.id.a() / 1000;
        xr.e eVar = this.f94949b;
        xr.f fVar = this.f94948a;
        if (j17 > a17) {
            fVar.a(101, item, eVar.f537677c);
            fVar.d(eVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] to show! id" + this.f94950c.f66769xf47740ff);
        ((jq.e) this.f94951d).a(item.f66769xf47740ff, item, item.f66759xf1091605, item.t0());
        fVar.d(eVar);
    }

    @Override // xr.b
    public void b(qk.h6 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FunctionMsg.OpDelayExecutor", "[onFailFetch] item:" + item);
        int i17 = item.f66777x10a0fed7;
        xr.e eVar = this.f94949b;
        xr.f fVar = this.f94948a;
        if (i17 == -1) {
            fVar.a(-1, item, eVar.f537677c);
        }
        fVar.d(eVar);
    }
}
