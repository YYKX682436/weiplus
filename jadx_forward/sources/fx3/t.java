package fx3;

/* loaded from: classes.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI f348683d;

    public t(com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI repairerMonitorUI) {
        this.f348683d = repairerMonitorUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f348683d.finish();
        return true;
    }
}
