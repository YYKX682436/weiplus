package ay3;

/* loaded from: classes3.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI f15282d;

    public b(com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI) {
        this.f15282d = ringtoneHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI.f158332d;
        com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI = this.f15282d;
        ringtoneHistoryUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) ringtoneHistoryUI.getContext(), 1, true);
        k0Var.f211872n = new ay3.f(ringtoneHistoryUI);
        k0Var.f211881s = new ay3.g(ringtoneHistoryUI);
        k0Var.t(false);
        k0Var.e(false);
        k0Var.v();
        return true;
    }
}
