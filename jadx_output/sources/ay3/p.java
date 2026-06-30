package ay3;

/* loaded from: classes10.dex */
public final class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI f15296d;

    public p(com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI ringtoneSettingsUI) {
        this.f15296d = ringtoneSettingsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI activity = this.f15296d;
        androidx.appcompat.app.AppCompatActivity context = activity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class)).f158499e;
        ((hy2.f) ((iz2.b) pf5.z.f353948a.a(context).c(iz2.b.class))).O6(7, new mx3.k(i17, context));
        return true;
    }
}
