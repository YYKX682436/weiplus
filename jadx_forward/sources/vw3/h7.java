package vw3;

/* loaded from: classes.dex */
public final class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerXLogUI f522515d;

    public h7(com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI) {
        this.f522515d = repairerXLogUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(lp0.b.g0(), false);
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.vfs.x1) it.next()).a();
            }
        }
        com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI = this.f522515d;
        repairerXLogUI.runOnUiThread(new vw3.g7(repairerXLogUI));
    }
}
