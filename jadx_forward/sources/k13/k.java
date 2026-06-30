package k13;

/* loaded from: classes5.dex */
public final class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 f384762d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15561x6c397057 activityC15561x6c397057) {
        this.f384762d = activityC15561x6c397057;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f384762d.onBackPressed();
        return true;
    }
}
