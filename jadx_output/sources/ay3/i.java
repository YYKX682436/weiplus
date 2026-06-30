package ay3;

/* loaded from: classes3.dex */
public final class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneSearchUI f15289d;

    public i(com.tencent.mm.plugin.ringtone.ui.RingtoneSearchUI ringtoneSearchUI) {
        this.f15289d = ringtoneSearchUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSearchUI", "backBtn");
        com.tencent.mm.plugin.ringtone.ui.RingtoneSearchUI ringtoneSearchUI = this.f15289d;
        ringtoneSearchUI.setResult(-2);
        ringtoneSearchUI.finish();
        return false;
    }
}
