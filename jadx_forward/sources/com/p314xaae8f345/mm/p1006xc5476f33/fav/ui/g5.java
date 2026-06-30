package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 f182396d;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257) {
        this.f182396d = activityC13570xd6b9f257;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f182396d;
        android.view.MenuItem menuItem = activityC13570xd6b9f257.C;
        if (menuItem != null) {
            menuItem.expandActionView();
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) activityC13570xd6b9f257.f181935p.getLayoutParams();
            if (layoutParams != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = -1;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = -1;
            }
            activityC13570xd6b9f257.f181935p.setLayoutParams(layoutParams);
        }
    }
}
