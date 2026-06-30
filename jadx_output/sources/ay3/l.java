package ay3;

/* loaded from: classes.dex */
public final class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI f15292d;

    public l(com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI ringtoneSelectUI) {
        this.f15292d = ringtoneSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI context = this.f15292d;
        kotlin.jvm.internal.o.g(context, "context");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0.wk((com.tencent.mm.plugin.finder.assist.i0) c17, context, null, 2, null);
        return true;
    }
}
