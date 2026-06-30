package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f69003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask f69004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f69005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask wVAModulePkgPathHelper$GetWVAModulePkgPathTask, int i17) {
        super(1);
        this.f69003d = j17;
        this.f69004e = wVAModulePkgPathHelper$GetWVAModulePkgPathTask;
        this.f69005f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.nc downloadInfo = (com.tencent.mm.plugin.appbrand.launching.nc) obj;
        kotlin.jvm.internal.o.g(downloadInfo, "downloadInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchPatchSizeAsync: got patchSize=");
        long j17 = downloadInfo.f84823d;
        sb6.append(j17);
        sb6.append(", oldPkgPath=");
        sb6.append(downloadInfo.f84825f);
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", sb6.toString());
        if (j17 <= 0) {
            j17 = this.f69003d;
        }
        com.tencent.mm.minigame.e1 e1Var = new com.tencent.mm.minigame.e1(false, null, this.f69005f, j17, true, 2, null);
        com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask wVAModulePkgPathHelper$GetWVAModulePkgPathTask = this.f69004e;
        wVAModulePkgPathHelper$GetWVAModulePkgPathTask.f68995q = e1Var;
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "fetchPatchSizeAsync: result set, pkgSize=" + j17 + ", hasOldVersion=true");
        wVAModulePkgPathHelper$GetWVAModulePkgPathTask.c();
        return jz5.f0.f302826a;
    }
}
