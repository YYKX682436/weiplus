package bj5;

/* loaded from: classes.dex */
public final class z0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f102790d;

    public z0(bj5.d1 d1Var) {
        this.f102790d = d1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        j75.f m67437x4bd5310;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "BackBtnListener: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = this.f102790d.P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return true;
        }
        m67437x4bd5310.B3(new wi5.b());
        return true;
    }
}
