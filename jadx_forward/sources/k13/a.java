package k13;

/* loaded from: classes10.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.AbstractActivityC15559xa873fe94 f384723d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.AbstractActivityC15559xa873fe94 abstractActivityC15559xa873fe94) {
        this.f384723d = abstractActivityC15559xa873fe94;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f384723d.onBackPressed();
        return true;
    }
}
