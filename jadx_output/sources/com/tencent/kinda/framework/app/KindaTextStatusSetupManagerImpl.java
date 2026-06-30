package com.tencent.kinda.framework.app;

/* loaded from: classes11.dex */
public class KindaTextStatusSetupManagerImpl implements com.tencent.kinda.gen.KindaTextStatusSetupManager {
    private final java.lang.String TAG = "MicorMsg.KindaTextStatusSetupManagerImpl";

    @Override // com.tencent.kinda.gen.KindaTextStatusSetupManager
    public void setupTextStatusImpl(java.lang.String str, final java.lang.String str2, java.lang.String str3, int i17, final com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback) {
        com.tencent.mars.xlog.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "leadViewInfo click jump status");
        pj4.q qVar = new pj4.q();
        qVar.f355255d = str2;
        qVar.f355256e = str3;
        bi4.n1 n1Var = new bi4.n1(null);
        n1Var.f354962d = str;
        n1Var.f354963e = qVar;
        n1Var.f354970o = java.lang.String.valueOf(i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24498, 1, str2);
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ui(com.tencent.kinda.framework.widget.tools.KindaContext.get(), n1Var, new bi4.l1() { // from class: com.tencent.kinda.framework.app.KindaTextStatusSetupManagerImpl.1
            @Override // bi4.l1
            public void onFinishAction(int i18, java.lang.String str4, pj4.r0 r0Var) {
                com.tencent.mars.xlog.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction result :%s", java.lang.Integer.valueOf(i18));
                if (i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click ok");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24498, 3, str2);
                    if (voidBoolStringCallback == null || r0Var == null || r0Var.f355272d != 2) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "desc :%s", r0Var.f355273e.f355311d);
                    voidBoolStringCallback.call(true, com.tencent.kinda.framework.widget.tools.KindaContext.get().getString(com.tencent.mm.R.string.ksi, r0Var.f355273e.f355311d));
                    return;
                }
                if (i18 == 1) {
                    com.tencent.mars.xlog.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click error");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24498, 4, str2);
                    db5.e1.y(com.tencent.kinda.framework.widget.tools.KindaContext.get(), com.tencent.kinda.framework.widget.tools.KindaContext.get().getString(com.tencent.mm.R.string.ksj), "", com.tencent.kinda.framework.widget.tools.KindaContext.get().getString(com.tencent.mm.R.string.ke6), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.app.KindaTextStatusSetupManagerImpl.1.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                            com.tencent.mars.xlog.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "click AlertDialog");
                        }
                    });
                } else {
                    if (i18 != 2) {
                        com.tencent.mars.xlog.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction default");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click cancel");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24498, 2, str2);
                    com.tencent.kinda.gen.VoidBoolStringCallback voidBoolStringCallback2 = voidBoolStringCallback;
                    if (voidBoolStringCallback2 != null) {
                        voidBoolStringCallback2.call(false, "");
                    }
                }
            }
        });
    }
}
