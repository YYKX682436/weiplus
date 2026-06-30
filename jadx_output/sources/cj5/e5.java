package cj5;

/* loaded from: classes.dex */
public final class e5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f42113d;

    public e5(cj5.k5 k5Var) {
        this.f42113d = k5Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        j75.f stateCenter;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f42113d.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return false;
        }
        stateCenter.B3(new wi5.c0(kz5.p0.f313996d, -1));
        return false;
    }
}
