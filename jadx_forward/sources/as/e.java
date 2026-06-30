package as;

/* loaded from: classes8.dex */
public final class e implements xr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xr.f f94952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xr.e f94953b;

    public e(xr.f fVar, xr.e eVar) {
        this.f94952a = fVar;
        this.f94953b = eVar;
    }

    @Override // xr.b
    public void a(qk.h6 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpNoShowExecutor", "[onSuccessFetch] item:" + item);
        long j17 = item.f66758x27886e88;
        long a17 = c01.id.a() / 1000;
        xr.e eVar = this.f94953b;
        xr.f fVar = this.f94952a;
        if (j17 > a17) {
            fVar.a(2, item, eVar.f537677c);
        }
        fVar.d(eVar);
    }

    @Override // xr.b
    public void b(qk.h6 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FunctionMsg.OpNoShowExecutor", "[onFailFetch] item:" + item);
        int i17 = item.f66777x10a0fed7;
        xr.e eVar = this.f94953b;
        xr.f fVar = this.f94952a;
        if (i17 == -1) {
            fVar.a(-1, item, eVar.f537677c);
        }
        fVar.d(eVar);
    }
}
