package ni5;

/* loaded from: classes.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192 f419319d;

    public b(com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192 activityC22459x1ac69192) {
        this.f419319d = activityC22459x1ac69192;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f419319d.onBackPressed();
        return false;
    }
}
