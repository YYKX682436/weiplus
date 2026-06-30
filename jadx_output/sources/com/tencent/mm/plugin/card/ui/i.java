package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {
    public i(com.tencent.mm.plugin.card.ui.j jVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAcitivityLifecycleListener", "CardAcitivityLifecycleListener on activity from background to foreground！doUpdateOfflineDynamicCard!");
        wt1.n Ni = xt1.t0.Ni();
        if (Ni != null) {
            Ni.h(lu1.h0.EN_DYNAMIC_CODE_SCENE_ENTER_FOREGROUND);
        }
    }
}
