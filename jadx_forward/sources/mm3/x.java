package mm3;

/* loaded from: classes10.dex */
public final class x implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532 f411216d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532 activityC16658x38bdd532) {
        this.f411216d = activityC16658x38bdd532;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f411216d.onBackPressed();
        return true;
    }
}
