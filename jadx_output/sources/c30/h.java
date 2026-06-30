package c30;

/* loaded from: classes11.dex */
public final class h extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.i f38124d;

    public h(c30.i iVar) {
        this.f38124d = iVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("EcsWeShopFetchDataTrigger", "onAppBackground: " + str);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c30.i iVar = this.f38124d;
        iVar.getClass();
        f06.v[] vVarArr = c30.i.f38129e;
        long longValue = ((java.lang.Number) iVar.f38131b.b(iVar, vVarArr[0])).longValue();
        c30.i iVar2 = this.f38124d;
        iVar2.getClass();
        long longValue2 = ((java.lang.Number) iVar2.f38132c.b(iVar2, vVarArr[1])).longValue();
        long j17 = currentTimeMillis - longValue;
        com.tencent.mars.xlog.Log.i("EcsWeShopFetchDataTrigger", "onAppForeground: " + str + ", lastTime: " + longValue + " ms, currentTime: " + currentTimeMillis + " ms, interval: " + longValue2 + " ms");
        if (longValue <= 0) {
            c30.i iVar3 = this.f38124d;
            iVar3.getClass();
            iVar3.f38131b.c(iVar3, vVarArr[0], java.lang.Long.valueOf(currentTimeMillis));
            com.tencent.mars.xlog.Log.i("EcsWeShopFetchDataTrigger", "Initialized lastTime to currentTime");
            return;
        }
        if (j17 <= longValue2) {
            com.tencent.mars.xlog.Log.i("EcsWeShopFetchDataTrigger", "No task invoked, elapsed: " + j17 + " ms, interval: " + longValue2 + " ms");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new c30.g(this.f38124d));
        c30.i iVar4 = this.f38124d;
        iVar4.getClass();
        iVar4.f38131b.c(iVar4, vVarArr[0], java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mars.xlog.Log.i("EcsWeShopFetchDataTrigger", "Task invoked, elapsed: " + j17 + " ms, interval: " + longValue2 + " ms");
    }
}
