package rk1;

/* loaded from: classes7.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk1.m f477953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477954e;

    public j(rk1.m mVar, java.lang.String str) {
        this.f477953d = mVar;
        this.f477954e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rk1.c cVar = rk1.m.f477963e;
        this.f477953d.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = rk1.m.f477966h;
        java.lang.String str = this.f477954e;
        rk1.d dVar = (rk1.d) concurrentHashMap.get(str);
        if (dVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.WasmCacheService", "timeout stop task for appId: %s", str);
            rk1.c.a(rk1.m.f477963e).m43200x360802(dVar.f477934b);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7115x3f2395b7 c7115x3f2395b7 = dVar.f477936d;
            if (c7115x3f2395b7 == null) {
                return;
            }
            rk1.f[] fVarArr = rk1.f.f477944d;
            c7115x3f2395b7.f144358j = 3;
        }
    }
}
