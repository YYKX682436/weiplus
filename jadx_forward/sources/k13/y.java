package k13;

/* loaded from: classes8.dex */
public final class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 f384818d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6) {
        this.f384818d = activityC15562xa7b84ac6;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f384818d.onBackPressed();
        return true;
    }
}
