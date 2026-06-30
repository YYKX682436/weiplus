package bj5;

/* loaded from: classes.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.n f21167d;

    public b(bj5.n nVar) {
        this.f21167d = nVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        j75.f stateCenter;
        kotlin.jvm.internal.o.g(it, "it");
        bj5.n nVar = this.f21167d;
        nVar.T6(4);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = nVar.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return false;
        }
        stateCenter.B3(new wi5.e());
        return false;
    }
}
