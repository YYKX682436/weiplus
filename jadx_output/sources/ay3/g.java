package ay3;

/* loaded from: classes3.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI f15287d;

    public g(com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI) {
        this.f15287d = ringtoneHistoryUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI.U6(this.f15287d);
        }
    }
}
