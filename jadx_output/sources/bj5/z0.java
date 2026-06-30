package bj5;

/* loaded from: classes.dex */
public final class z0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f21257d;

    public z0(bj5.d1 d1Var) {
        this.f21257d = d1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        j75.f stateCenter;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "BackBtnListener: ");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f21257d.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return true;
        }
        stateCenter.B3(new wi5.b());
        return true;
    }
}
