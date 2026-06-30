package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class wb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22334x657dae5 f288773d;

    public wb(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22334x657dae5 activityC22334x657dae5) {
        this.f288773d = activityC22334x657dae5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22334x657dae5 activityC22334x657dae5 = this.f288773d;
        if (activityC22334x657dae5.w7(activityC22334x657dae5.F.size())) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(activityC22334x657dae5.F)) {
            intent.putExtra("Select_Conv_User", "");
        } else {
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC22334x657dae5.F, ","));
        }
        activityC22334x657dae5.getClass();
        activityC22334x657dae5.setResult(-1, intent);
        activityC22334x657dae5.finish();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2690x38b72420.vb(this), 100L);
        activityC22334x657dae5.mo48674x36654fab();
        return true;
    }
}
