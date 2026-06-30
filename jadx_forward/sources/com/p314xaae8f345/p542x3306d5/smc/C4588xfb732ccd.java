package com.p314xaae8f345.p542x3306d5.smc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mars/smc/UDRKVCommReportFeatureService;", "Lea5/l;", "", "getProjectId", "", "addToPeriod", "", "taskId", "projectId", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "", "version", "Lcom/tencent/wechat/aff/udr/r;", "type", "Ljz5/f0;", "onCallBackSuccessAsync", "<init>", "()V", "Companion", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mars.smc.UDRKVCommReportFeatureService */
/* loaded from: classes8.dex */
public final class C4588xfb732ccd extends ea5.l {
    private static final java.lang.String TAG = "UDRKVCommReportFeatureService";

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: addToPeriod */
    public boolean mo40417x561213dd() {
        return true;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_6eea8388";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: onCallBackSuccessAsync */
    public void mo40418x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        super.mo40418x5e6271bd(j17, projectId, name, i17, type);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(projectId, "ilinkres_6eea8388")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "smc-config version: " + i17 + " type: " + type);
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mars.smc.UDRKVCommReportFeatureService$onCallBackSuccessAsync$1
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String m117639xfb83cc9b;
                    com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_6eea8388", "kv_idkey_config");
                    boolean z17 = false;
                    if (Ui != null && (m117639xfb83cc9b = Ui.m117639xfb83cc9b()) != null) {
                        if (m117639xfb83cc9b.length() > 0) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRKVCommReportFeatureService", "smc-config config: " + Ui.m117639xfb83cc9b());
                        ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40388xaf68cd3c(Ui.m117639xfb83cc9b());
                    }
                }
            });
        }
    }
}
