package rz1;

/* loaded from: classes.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.CgiReportDebugUI f483321d;

    public a(com.tencent.mm.plugin.datareport.sample.CgiReportDebugUI cgiReportDebugUI) {
        this.f483321d = cgiReportDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f483321d.finish();
        return true;
    }
}
