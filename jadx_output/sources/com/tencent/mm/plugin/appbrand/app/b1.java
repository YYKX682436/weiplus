package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes12.dex */
public class b1 implements com.tencent.mars.cdn.CdnManager.AppCallback {
    public b1(com.tencent.mm.plugin.appbrand.app.e1 e1Var) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] combineResolveHost(java.lang.String str, int i17, int i18, int[] iArr) {
        return new java.lang.String[0];
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public boolean isUsingWangKaService(int i17) {
        return false;
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onBadNetworkProbed() {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onTaskTearDown(java.lang.String str, com.tencent.mars.cdn.CdnManager.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlow(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlowWithTag(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(iArr[i18], iArr2[i18], iArr3[i18]));
        }
        jx3.f.INSTANCE.b(arrayList, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportIDKey(long j17, long j18, long j19, boolean z17) {
        jx3.f.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportKV(long j17, java.lang.String str, boolean z17, boolean z18, long j18) {
        jx3.f.INSTANCE.n((int) j17, (int) j18, str, z18, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportKVNoFreqLimit(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.w("MicroMsg.PluginAppBrand", "!no impl!");
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestGetCDN(int i17) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestSnsGetCdnDistance(int i17, int i18, int i19) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] resolveHost(java.lang.String str, boolean z17, int[] iArr) {
        return new java.lang.String[0];
    }
}
