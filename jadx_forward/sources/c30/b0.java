package c30;

/* loaded from: classes11.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f119626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f119627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f119628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f119629g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f119630h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119631i;

    public b0(c30.f0 f0Var, long j17, boolean z17, int i17, boolean z18, int i18) {
        this.f119626d = f0Var;
        this.f119627e = j17;
        this.f119628f = z17;
        this.f119629g = i17;
        this.f119630h = z18;
        this.f119631i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c30.f0 f0Var = this.f119626d;
        f0Var.f119647e = false;
        c30.i iVar = f0Var.f119649g;
        if (iVar != null) {
            long j17 = this.f119627e * 1000;
            if (j17 > 0) {
                f06.v[] vVarArr = c30.i.f119662e;
                if (j17 != ((java.lang.Number) iVar.f119665c.b(iVar, vVarArr[1])).longValue()) {
                    iVar.f119665c.c(iVar, vVarArr[1], java.lang.Long.valueOf(j17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopFetchDataTrigger", "update timeIntervalMillis: " + j17);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopFetchDataTrigger", "There's no update to timeIntervalMillis: " + j17);
        }
        if (this.f119628f) {
            if (this.f119629g > 0) {
                this.f119626d.getClass();
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5317x7edac81().b(android.os.Looper.getMainLooper());
            }
            if (this.f119630h) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                c30.a0 a0Var = new c30.a0(this.f119626d, this.f119631i);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(a0Var, 250L, false);
            }
        }
        c30.h0 h0Var = this.f119626d.f119651i;
        if (h0Var != null) {
            int i17 = this.f119631i;
            boolean z17 = this.f119630h;
            int i18 = this.f119629g;
            int i19 = h0Var.f119659b;
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o1 o1Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o1.SampleRate_OnePercent;
            if (i17 == i19) {
                h0Var.f119660c += i18;
                if (!z17) {
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - h0Var.f119658a;
                    if (elapsedRealtime <= 2147483647L) {
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b.e(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n1.EcsWeShopFirstDataSync, (int) elapsedRealtime, "{\"firstLoadItemsCount\":" + h0Var.f119660c + '}', o1Var);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsWeShopMonitor", "firstLoadDataCost is illegal");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopMonitor", "firstLoadData cost: " + elapsedRealtime + ", firstLoadItemsCount: " + h0Var.f119660c);
                }
            }
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - h0Var.f119661d;
            if (elapsedRealtime2 <= 2147483647L) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b.e(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n1.EcsWeShopDataSync, (int) elapsedRealtime2, "{\"itemsCount\":" + i18 + '}', o1Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsWeShopMonitor", "loadCost is illegal");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopMonitor", "onEndSuccessLoad, identifier: " + i17 + ", cost: " + elapsedRealtime2 + ", itemsCount: " + i18);
        }
    }
}
