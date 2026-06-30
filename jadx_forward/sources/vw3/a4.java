package vw3;

/* loaded from: classes.dex */
public final class a4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI f522413d;

    public a4(com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI repairerPayDebugUI) {
        this.f522413d = repairerPayDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f522413d.finish();
        return true;
    }
}
