package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes12.dex */
public class b1 implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback {
    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e1 e1Var) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: combineResolveHost */
    public java.lang.String[] mo37799x705052f5(java.lang.String str, int i17, int i18, int[] iArr) {
        return new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: isUsingWangKaService */
    public boolean mo37800xc9848262(int i17) {
        return false;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: onBadNetworkProbed */
    public void mo37801x4491727c() {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: onTaskTearDown */
    public void mo37802xb2a6aa48(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportFlow */
    public void mo37803x73181082(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportFlowWithTag */
    public void mo37804xe90cea12(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportGroupIDKey */
    public void mo37805xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(iArr[i18], iArr2[i18], iArr3[i18]));
        }
        jx3.f.INSTANCE.b(arrayList, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportIDKey */
    public void mo37806xf0018e90(long j17, long j18, long j19, boolean z17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportKV */
    public void mo37807xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18) {
        jx3.f.INSTANCE.n((int) j17, (int) j18, str, z18, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportKVNoFreqLimit */
    public void mo37808xc8cf6843(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PluginAppBrand", "!no impl!");
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: requestGetCDN */
    public void mo37809x3e59a466(int i17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: requestSnsGetCdnDistance */
    public void mo37810x54b3aed5(int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: resolveHost */
    public java.lang.String[] mo37811x746015b4(java.lang.String str, boolean z17, int[] iArr) {
        return new java.lang.String[0];
    }
}
