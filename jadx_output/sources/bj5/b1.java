package bj5;

/* loaded from: classes.dex */
public final class b1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity f21169d;

    public b1(com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity) {
        this.f21169d = baseMvvmActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "BackBtnListener: ");
        this.f21169d.finish();
        return true;
    }
}
