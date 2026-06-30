package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class xe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.he f294085d;

    public xe(com.p314xaae8f345.mm.ui.he heVar) {
        this.f294085d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.he heVar = this.f294085d;
        if (heVar.f290401i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "remove setTagRunnable");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(heVar.f290402m);
        }
    }
}
