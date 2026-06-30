package as;

/* loaded from: classes8.dex */
public final class e implements xr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xr.f f13419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xr.e f13420b;

    public e(xr.f fVar, xr.e eVar) {
        this.f13419a = fVar;
        this.f13420b = eVar;
    }

    @Override // xr.b
    public void a(qk.h6 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("FunctionMsg.OpNoShowExecutor", "[onSuccessFetch] item:" + item);
        long j17 = item.field_actionTime;
        long a17 = c01.id.a() / 1000;
        xr.e eVar = this.f13420b;
        xr.f fVar = this.f13419a;
        if (j17 > a17) {
            fVar.a(2, item, eVar.f456144c);
        }
        fVar.d(eVar);
    }

    @Override // xr.b
    public void b(qk.h6 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.w("FunctionMsg.OpNoShowExecutor", "[onFailFetch] item:" + item);
        int i17 = item.field_status;
        xr.e eVar = this.f13420b;
        xr.f fVar = this.f13419a;
        if (i17 == -1) {
            fVar.a(-1, item, eVar.f456144c);
        }
        fVar.d(eVar);
    }
}
