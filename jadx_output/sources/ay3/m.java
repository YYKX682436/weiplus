package ay3;

/* loaded from: classes10.dex */
public final class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI f15293d;

    public m(com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI ringtoneSelectUI) {
        this.f15293d = ringtoneSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI.f158334d;
        this.f15293d.startActivity(com.tencent.mm.plugin.ringtone.ui.RingtonePrivacyUI.class);
        return true;
    }
}
