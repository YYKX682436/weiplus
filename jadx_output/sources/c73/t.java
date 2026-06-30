package c73;

/* loaded from: classes11.dex */
public final class t implements c01.y8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c73.u f39624d;

    public t(c73.u uVar) {
        this.f39624d = uVar;
    }

    @Override // c01.y8
    public final void a0() {
        l90.k kVar = (l90.k) i95.n0.c(l90.k.class);
        c73.u uVar = this.f39624d;
        l90.j jVar = uVar.f39626e;
        ((k90.l) kVar).getClass();
        ug3.i.f427546t = jVar;
        java.lang.String str = "webwx online status: " + gm0.j1.b().t();
        java.lang.String str2 = uVar.f39625d;
        com.tencent.mars.xlog.Log.i(str2, str);
        com.tencent.mm.plugin.appbrand.service.b6 b6Var = (com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class);
        if (b6Var != null) {
            com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult getOnLineInfoInfoResult = new com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult();
            com.tencent.mm.modelsimple.t tVar = (com.tencent.mm.modelsimple.t) b6Var;
            getOnLineInfoInfoResult.f77353f = c01.d9.b().F();
            java.util.ArrayList arrayList = (java.util.ArrayList) tVar.wi();
            if (arrayList.contains(1)) {
                getOnLineInfoInfoResult.f77351d = 1;
            } else if (arrayList.contains(2)) {
                getOnLineInfoInfoResult.f77351d = 2;
            } else {
                getOnLineInfoInfoResult.f77351d = -1;
            }
            getOnLineInfoInfoResult.f77352e = ug3.i.f427543q;
            getOnLineInfoInfoResult.f77354g = tVar.Bi();
            getOnLineInfoInfoResult.f77355h = tVar.Di();
            if (getOnLineInfoInfoResult.f77351d == -1 || getOnLineInfoInfoResult.f77352e == 0) {
                com.tencent.mars.xlog.Log.i(str2, "invalid login: " + getOnLineInfoInfoResult);
            } else {
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).K7("Common_IPC_appid", getOnLineInfoInfoResult);
                ((d73.i) i95.n0.c(d73.i.class)).Ti(getOnLineInfoInfoResult);
            }
        }
        if (gm0.j1.b().t()) {
            com.tencent.mars.xlog.Log.i(str2, "webwx is online, send alllist");
            g73.o0.f269311d.k8();
        }
    }
}
