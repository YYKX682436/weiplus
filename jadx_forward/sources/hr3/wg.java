package hr3;

/* loaded from: classes11.dex */
public class wg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 f365694d;

    public wg(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9) {
        this.f365694d = activityC16871x34c232c9;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = this.f365694d;
        if (activityC16871x34c232c9.f235366x) {
            activityC16871x34c232c9.f235369y[1] = 1;
        }
        activityC16871x34c232c9.finish();
        activityC16871x34c232c9.h7(false);
        activityC16871x34c232c9.a7(2L);
        return true;
    }
}
