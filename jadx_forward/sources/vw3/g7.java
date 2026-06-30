package vw3;

/* loaded from: classes.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerXLogUI f522502d;

    public g7(com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI) {
        this.f522502d = repairerXLogUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI = this.f522502d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = repairerXLogUI.d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        repairerXLogUI.d = null;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(repairerXLogUI);
        e4Var.f293309c = "清理日志文件成功";
        e4Var.c();
    }
}
