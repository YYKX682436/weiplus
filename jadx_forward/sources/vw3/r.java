package vw3;

/* loaded from: classes3.dex */
public final class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f522625d;

    public r(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        this.f522625d = repairerBlockDetectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f522625d.finish();
        return false;
    }
}
