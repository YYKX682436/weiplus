package bj5;

/* loaded from: classes.dex */
public final class b1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 f102702d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0) {
        this.f102702d = abstractActivityC16711x120e7ae0;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "BackBtnListener: ");
        this.f102702d.finish();
        return true;
    }
}
