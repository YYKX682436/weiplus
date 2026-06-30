package s61;

/* loaded from: classes8.dex */
public class p0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e f484916d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e activityC11378xa7f41e6e) {
        this.f484916d = activityC11378xa7f41e6e;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e.f154694p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e activityC11378xa7f41e6e = this.f484916d;
        if (activityC11378xa7f41e6e.f154701m != 0) {
            activityC11378xa7f41e6e.finish();
            return true;
        }
        if (activityC11378xa7f41e6e.f154702n || activityC11378xa7f41e6e.f154703o) {
            activityC11378xa7f41e6e.finish();
            return true;
        }
        activityC11378xa7f41e6e.T6();
        return true;
    }
}
