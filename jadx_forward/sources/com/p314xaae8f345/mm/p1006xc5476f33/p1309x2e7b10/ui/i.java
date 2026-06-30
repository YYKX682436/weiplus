package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.j jVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcitivityLifecycleListener", "CardAcitivityLifecycleListener on activity from background to foreground！doUpdateOfflineDynamicCard!");
        wt1.n Ni = xt1.t0.Ni();
        if (Ni != null) {
            Ni.h(lu1.h0.EN_DYNAMIC_CODE_SCENE_ENTER_FOREGROUND);
        }
    }
}
