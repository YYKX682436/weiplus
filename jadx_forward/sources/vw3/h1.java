package vw3;

/* loaded from: classes.dex */
public final class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f522508d;

    public h1(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f522508d = repairerFileListUI;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f522508d;
        switch (itemId) {
            case 1:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.b1.f522420d);
                return;
            case 2:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.c1.f522439d);
                return;
            case 3:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.d1.f522455d);
                return;
            case 4:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.e1.f522470d);
                return;
            case 5:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.f1.f522480d);
                return;
            case 6:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.g1.f522492d);
                return;
            default:
                return;
        }
    }
}
