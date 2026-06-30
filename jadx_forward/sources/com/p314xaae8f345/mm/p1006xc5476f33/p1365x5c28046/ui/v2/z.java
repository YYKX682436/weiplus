package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes15.dex */
public class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 f179942d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 activityC13350x2639a724) {
        this.f179942d = activityC13350x2639a724;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 activityC13350x2639a724 = this.f179942d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52 c22311xa7822c52 = activityC13350x2639a724.I;
        if (c22311xa7822c52 == null || c22311xa7822c52.getVisibility() != 0) {
            activityC13350x2639a724.finish();
            return false;
        }
        activityC13350x2639a724.I.setVisibility(8);
        activityC13350x2639a724.mo74407xb0dfae51(1001, activityC13350x2639a724.B);
        activityC13350x2639a724.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572646bz4);
        return false;
    }
}
