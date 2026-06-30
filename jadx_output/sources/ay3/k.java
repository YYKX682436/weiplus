package ay3;

/* loaded from: classes.dex */
public final class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI f15291d;

    public k(com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI ringtoneSelectUI) {
        this.f15291d = ringtoneSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSelectUI", "backBtn");
        com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI ringtoneSelectUI = this.f15291d;
        ringtoneSelectUI.setResult(-2);
        ringtoneSelectUI.finish();
        return false;
    }
}
