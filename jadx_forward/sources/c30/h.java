package c30;

/* loaded from: classes11.dex */
public final class h extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.i f119657d;

    public h(c30.i iVar) {
        this.f119657d = iVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopFetchDataTrigger", "onAppBackground: " + str);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c30.i iVar = this.f119657d;
        iVar.getClass();
        f06.v[] vVarArr = c30.i.f119662e;
        long longValue = ((java.lang.Number) iVar.f119664b.b(iVar, vVarArr[0])).longValue();
        c30.i iVar2 = this.f119657d;
        iVar2.getClass();
        long longValue2 = ((java.lang.Number) iVar2.f119665c.b(iVar2, vVarArr[1])).longValue();
        long j17 = currentTimeMillis - longValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopFetchDataTrigger", "onAppForeground: " + str + ", lastTime: " + longValue + " ms, currentTime: " + currentTimeMillis + " ms, interval: " + longValue2 + " ms");
        if (longValue <= 0) {
            c30.i iVar3 = this.f119657d;
            iVar3.getClass();
            iVar3.f119664b.c(iVar3, vVarArr[0], java.lang.Long.valueOf(currentTimeMillis));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopFetchDataTrigger", "Initialized lastTime to currentTime");
            return;
        }
        if (j17 <= longValue2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopFetchDataTrigger", "No task invoked, elapsed: " + j17 + " ms, interval: " + longValue2 + " ms");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new c30.g(this.f119657d));
        c30.i iVar4 = this.f119657d;
        iVar4.getClass();
        iVar4.f119664b.c(iVar4, vVarArr[0], java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopFetchDataTrigger", "Task invoked, elapsed: " + j17 + " ms, interval: " + longValue2 + " ms");
    }
}
