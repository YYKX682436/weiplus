package ay3;

/* loaded from: classes3.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI f15281d;

    public a(com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI) {
        this.f15281d = ringtoneHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneHistoryUI", "backBtn");
        this.f15281d.finish();
        return false;
    }
}
