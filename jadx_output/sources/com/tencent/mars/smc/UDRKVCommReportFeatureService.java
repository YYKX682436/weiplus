package com.tencent.mars.smc;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mars/smc/UDRKVCommReportFeatureService;", "Lea5/l;", "", "getProjectId", "", "addToPeriod", "", "taskId", "projectId", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "version", "Lcom/tencent/wechat/aff/udr/r;", "type", "Ljz5/f0;", "onCallBackSuccessAsync", "<init>", "()V", "Companion", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class UDRKVCommReportFeatureService extends ea5.l {
    private static final java.lang.String TAG = "UDRKVCommReportFeatureService";

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public boolean addToPeriod() {
        return true;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_6eea8388";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        if (kotlin.jvm.internal.o.b(projectId, "ilinkres_6eea8388")) {
            com.tencent.mars.xlog.Log.i(TAG, "smc-config version: " + i17 + " type: " + type);
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mars.smc.UDRKVCommReportFeatureService$onCallBackSuccessAsync$1
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String path;
                    com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_6eea8388", "kv_idkey_config");
                    boolean z17 = false;
                    if (Ui != null && (path = Ui.getPath()) != null) {
                        if (path.length() > 0) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("UDRKVCommReportFeatureService", "smc-config config: " + Ui.getPath());
                        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.smc.SmcManager.class)).updateFreqLimitConfig(Ui.getPath());
                    }
                }
            });
        }
    }
}
