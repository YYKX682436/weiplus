package ay3;

/* loaded from: classes10.dex */
public final class o implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI f15295d;

    public o(com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI ringtoneSettingsUI) {
        this.f15295d = ringtoneSettingsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNewRingtoneUI", "backBtn");
        this.f15295d.U6();
        return false;
    }
}
