package ay3;

/* loaded from: classes8.dex */
public final class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtonePrivacyUI f15288d;

    public h(com.tencent.mm.plugin.ringtone.ui.RingtonePrivacyUI ringtonePrivacyUI) {
        this.f15288d = ringtonePrivacyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f15288d.finish();
        return true;
    }
}
