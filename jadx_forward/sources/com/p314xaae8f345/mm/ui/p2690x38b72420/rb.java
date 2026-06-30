package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class rb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22333xa8c37c31 f288694d;

    public rb(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22333xa8c37c31 activityC22333xa8c37c31) {
        this.f288694d = activityC22333xa8c37c31;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22333xa8c37c31 activityC22333xa8c37c31 = this.f288694d;
        if (activityC22333xa8c37c31.w7(activityC22333xa8c37c31.C.size())) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) activityC22333xa8c37c31.C.toArray(new java.lang.String[0]));
        if (P1 == null || P1.size() == 0) {
            intent.putExtra("Select_Conv_User", "");
        } else {
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ","));
        }
        activityC22333xa8c37c31.setResult(-1, intent);
        activityC22333xa8c37c31.finish();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2690x38b72420.qb(this), 100L);
        activityC22333xa8c37c31.mo48674x36654fab();
        return true;
    }
}
