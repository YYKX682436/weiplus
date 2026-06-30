package vw3;

/* loaded from: classes3.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f522733d;

    public z(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        this.f522733d = repairerBlockDetectUI;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            pm0.v.O("SharedBlockDetectList", new vw3.y(this.f522733d));
        }
    }
}
