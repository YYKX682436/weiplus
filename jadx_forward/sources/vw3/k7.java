package vw3;

/* loaded from: classes.dex */
public final class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerXLogUI f522551d;

    public k7(com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI) {
        this.f522551d = repairerXLogUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40540x580354d9();
        com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI = this.f522551d;
        repairerXLogUI.runOnUiThread(new vw3.j7(repairerXLogUI));
    }
}
