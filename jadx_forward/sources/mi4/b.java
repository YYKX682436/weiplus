package mi4;

/* loaded from: classes11.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.ActivityC18596x74a43c27 f408311d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.ActivityC18596x74a43c27 activityC18596x74a43c27) {
        this.f408311d = activityC18596x74a43c27;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f408311d.onBackPressed();
        return true;
    }
}
