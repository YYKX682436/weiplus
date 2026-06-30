package ay3;

/* loaded from: classes5.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI f15285d;

    public e(com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI) {
        this.f15285d = ringtoneHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI = this.f15285d;
        android.view.LayoutInflater.from(ringtoneHistoryUI);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) ringtoneHistoryUI, 1, false);
        db5.g4 g4Var = new db5.g4(ringtoneHistoryUI);
        new db5.g4(ringtoneHistoryUI);
        ay3.c cVar = ay3.c.f15283d;
        ay3.d dVar = new ay3.d(ringtoneHistoryUI);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(ringtoneHistoryUI);
        cVar.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = cVar;
            k0Var.f211881s = dVar;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return false;
    }
}
