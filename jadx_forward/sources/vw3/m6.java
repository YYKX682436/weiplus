package vw3;

/* loaded from: classes9.dex */
public final class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522567d;

    public m6(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f522567d = repairerUploadTestUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522567d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = repairerUploadTestUI.g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        repairerUploadTestUI.g = null;
    }
}
