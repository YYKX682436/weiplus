package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes7.dex */
public class e1 extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f225456d = {"libplzma", "libunrar"};

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_6d71aa8c";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: haveSpecifiedResourceAsync */
    public void mo14012xafcc46c6(long j17, java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        super.mo14012xafcc46c6(j17, str, str2, i17, i18, i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "haveSpecifiedResource projectId: %s, name: %s, version: %d", str, str2, java.lang.Integer.valueOf(i17));
        if (i18 == 1002) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(str, str2);
            if (Ui == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.DynamicLibraryCheckService", "haveSpecifiedResource hava no local resource.");
                return;
            }
            long j18 = Ui.f299123e;
            if (j18 != i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.DynamicLibraryCheckService", "haveSpecifiedResource local resource version: %d, specified resource version: %d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
            }
        }
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackCheckSuccessAsync */
    public void mo52027x9bd1065d(long j17, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo52027x9bd1065d(j17, str, str2, i17, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "onCallBackCheckSuccess projectId: %s, name: %s, version: %d, type: %s", str, str2, java.lang.Integer.valueOf(i17), rVar.toString());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackFailAsync */
    public void mo46983xd73276fa(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo46983xd73276fa(j17, i17, i18, str, str2, i19, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "onCallBackFail projectId: %s, name: %s, version: %d, errNo: %d, errCode: %d, type: %s", str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), rVar.toString());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackStartPeriodAsync */
    public void mo65745x66f572fd(long j17, java.lang.String str) {
        super.mo65745x66f572fd(j17, str);
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackSuccessAsync */
    public void mo40418x5e6271bd(long j17, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo40418x5e6271bd(j17, str, str2, i17, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "onCallBackSuccess projectId: %s, name: %s, version: %d, type: %s", str, str2, java.lang.Integer.valueOf(i17), rVar.toString());
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar) {
        super.mo473xaee99e0d(j17, xVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.DynamicLibraryCheckService", "postProcess projectId: %s, name: %s, version: %d，path: %s", xVar.d(), xVar.m117638xfb82e301(), java.lang.Long.valueOf(xVar.f299123e), xVar.m117639xfb83cc9b());
    }
}
