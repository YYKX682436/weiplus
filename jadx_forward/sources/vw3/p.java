package vw3;

/* loaded from: classes8.dex */
public final class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI f522594d;

    public p(com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI repairerActivityStackDebugUI) {
        this.f522594d = repairerActivityStackDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI repairerActivityStackDebugUI = this.f522594d;
        if (repairerActivityStackDebugUI.U6().m0(2)) {
            return true;
        }
        repairerActivityStackDebugUI.finish();
        return true;
    }
}
