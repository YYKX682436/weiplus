package cj5;

/* loaded from: classes.dex */
public final class n4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.q4 f42204d;

    public n4(cj5.q4 q4Var) {
        this.f42204d = q4Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        j75.f stateCenter;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f42204d.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return false;
        }
        stateCenter.B3(new wi5.c());
        return false;
    }
}
