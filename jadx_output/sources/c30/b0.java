package c30;

/* loaded from: classes11.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f38093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f38094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f38095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f38097h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f38098i;

    public b0(c30.f0 f0Var, long j17, boolean z17, int i17, boolean z18, int i18) {
        this.f38093d = f0Var;
        this.f38094e = j17;
        this.f38095f = z17;
        this.f38096g = i17;
        this.f38097h = z18;
        this.f38098i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c30.f0 f0Var = this.f38093d;
        f0Var.f38114e = false;
        c30.i iVar = f0Var.f38116g;
        if (iVar != null) {
            long j17 = this.f38094e * 1000;
            if (j17 > 0) {
                f06.v[] vVarArr = c30.i.f38129e;
                if (j17 != ((java.lang.Number) iVar.f38132c.b(iVar, vVarArr[1])).longValue()) {
                    iVar.f38132c.c(iVar, vVarArr[1], java.lang.Long.valueOf(j17));
                    com.tencent.mars.xlog.Log.i("EcsWeShopFetchDataTrigger", "update timeIntervalMillis: " + j17);
                }
            }
            com.tencent.mars.xlog.Log.i("EcsWeShopFetchDataTrigger", "There's no update to timeIntervalMillis: " + j17);
        }
        if (this.f38095f) {
            if (this.f38096g > 0) {
                this.f38093d.getClass();
                new com.tencent.mm.autogen.events.EcsWeShopIndexEvent().b(android.os.Looper.getMainLooper());
            }
            if (this.f38097h) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                c30.a0 a0Var = new c30.a0(this.f38093d, this.f38098i);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(a0Var, 250L, false);
            }
        }
        c30.h0 h0Var = this.f38093d.f38118i;
        if (h0Var != null) {
            int i17 = this.f38098i;
            boolean z17 = this.f38097h;
            int i18 = this.f38096g;
            int i19 = h0Var.f38126b;
            com.tencent.wechat.mm.brand_service.o1 o1Var = com.tencent.wechat.mm.brand_service.o1.SampleRate_OnePercent;
            if (i17 == i19) {
                h0Var.f38127c += i18;
                if (!z17) {
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - h0Var.f38125a;
                    if (elapsedRealtime <= 2147483647L) {
                        com.tencent.wechat.aff.brand_service.a.f216045b.e(com.tencent.wechat.mm.brand_service.n1.EcsWeShopFirstDataSync, (int) elapsedRealtime, "{\"firstLoadItemsCount\":" + h0Var.f38127c + '}', o1Var);
                    } else {
                        com.tencent.mars.xlog.Log.e("EcsWeShopMonitor", "firstLoadDataCost is illegal");
                    }
                    com.tencent.mars.xlog.Log.i("EcsWeShopMonitor", "firstLoadData cost: " + elapsedRealtime + ", firstLoadItemsCount: " + h0Var.f38127c);
                }
            }
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - h0Var.f38128d;
            if (elapsedRealtime2 <= 2147483647L) {
                com.tencent.wechat.aff.brand_service.a.f216045b.e(com.tencent.wechat.mm.brand_service.n1.EcsWeShopDataSync, (int) elapsedRealtime2, "{\"itemsCount\":" + i18 + '}', o1Var);
            } else {
                com.tencent.mars.xlog.Log.e("EcsWeShopMonitor", "loadCost is illegal");
            }
            com.tencent.mars.xlog.Log.i("EcsWeShopMonitor", "onEndSuccessLoad, identifier: " + i17 + ", cost: " + elapsedRealtime2 + ", itemsCount: " + i18);
        }
    }
}
