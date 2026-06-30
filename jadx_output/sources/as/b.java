package as;

/* loaded from: classes8.dex */
public final class b implements xr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xr.f f13415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xr.e f13416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.h6 f13417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.n7 f13418d;

    public b(xr.f fVar, xr.e eVar, qk.h6 h6Var, qk.n7 n7Var) {
        this.f13415a = fVar;
        this.f13416b = eVar;
        this.f13417c = h6Var;
        this.f13418d = n7Var;
    }

    @Override // xr.b
    public void a(qk.h6 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("FunctionMsg.OpDelayExecutor", "[onSuccessFetch] item:" + item);
        long j17 = item.field_actionTime;
        long a17 = c01.id.a() / 1000;
        xr.e eVar = this.f13416b;
        xr.f fVar = this.f13415a;
        if (j17 > a17) {
            fVar.a(101, item, eVar.f456144c);
            fVar.d(eVar);
            return;
        }
        com.tencent.mars.xlog.Log.i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] to show! id" + this.f13417c.field_functionmsgid);
        ((jq.e) this.f13418d).a(item.field_functionmsgid, item, item.field_addMsg, item.t0());
        fVar.d(eVar);
    }

    @Override // xr.b
    public void b(qk.h6 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.w("FunctionMsg.OpDelayExecutor", "[onFailFetch] item:" + item);
        int i17 = item.field_status;
        xr.e eVar = this.f13416b;
        xr.f fVar = this.f13415a;
        if (i17 == -1) {
            fVar.a(-1, item, eVar.f456144c);
        }
        fVar.d(eVar);
    }
}
