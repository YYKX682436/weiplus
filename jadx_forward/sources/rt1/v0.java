package rt1;

/* loaded from: classes3.dex */
public final class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b f481025d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b activityC13030x3e5b0a3b) {
        this.f481025d = activityC13030x3e5b0a3b;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f481025d.onBackPressed();
        return true;
    }
}
