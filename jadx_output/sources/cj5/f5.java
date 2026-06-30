package cj5;

/* loaded from: classes.dex */
public final class f5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f42121d;

    public f5(cj5.k5 k5Var) {
        this.f42121d = k5Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem item) {
        j75.f stateCenter;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f42121d.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return false;
        }
        stateCenter.B3(new wi5.b());
        return false;
    }
}
