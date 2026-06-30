package vw3;

/* loaded from: classes9.dex */
public final class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522643d;

    public s6(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f522643d = repairerUploadTestUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522643d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = repairerUploadTestUI.g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        repairerUploadTestUI.g = null;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(repairerUploadTestUI);
        e4Var.f293309c = "上传失败";
        e4Var.c();
    }
}
