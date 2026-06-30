package qw3;

/* loaded from: classes9.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce f448714d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce abstractActivityC17102xb060a8ce) {
        this.f448714d = abstractActivityC17102xb060a8ce;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce.f238030d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce abstractActivityC17102xb060a8ce = this.f448714d;
        if (!abstractActivityC17102xb060a8ce.mo73847x7d641a7d()) {
            abstractActivityC17102xb060a8ce.finish();
            return true;
        }
        abstractActivityC17102xb060a8ce.mo48674x36654fab();
        abstractActivityC17102xb060a8ce.showDialog(1000);
        return true;
    }
}
