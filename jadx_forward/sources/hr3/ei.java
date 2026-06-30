package hr3;

/* loaded from: classes11.dex */
public class ei implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f365066d;

    public ei(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a) {
        this.f365066d = activityC16872x6384268a;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f365066d;
        if (activityC16872x6384268a.C) {
            activityC16872x6384268a.D[1] = 1;
        }
        activityC16872x6384268a.finish();
        ((ku5.t0) ku5.t0.f394148d).q(new hr3.ph(activityC16872x6384268a, false));
        activityC16872x6384268a.Z6(2L);
        return true;
    }
}
