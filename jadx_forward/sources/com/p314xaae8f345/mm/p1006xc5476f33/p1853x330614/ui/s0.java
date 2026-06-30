package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes8.dex */
public class s0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472 f230014d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472 activityC16478x250c8472) {
        this.f230014d = activityC16478x250c8472;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String[] strArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472 activityC16478x250c8472 = this.f230014d;
        at4.s1 s1Var = activityC16478x250c8472.f229813z;
        r45.z67 z67Var = s1Var.f95488r;
        boolean z17 = s1Var.f95489s;
        if (z17) {
            strArr = new java.lang.String[z67Var.f473288d.size() + 1];
            strArr[z67Var.f473288d.size()] = activityC16478x250c8472.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmz);
        } else {
            strArr = new java.lang.String[z67Var.f473288d.size()];
        }
        java.lang.String[] strArr2 = strArr;
        for (int i17 = 0; i17 < z67Var.f473288d.size(); i17++) {
            strArr2[i17] = x51.j1.b(((r45.a77) z67Var.f473288d.get(i17)).f451342d);
        }
        db5.e1.h(activityC16478x250c8472.mo55332x76847179(), null, strArr2, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.r0(this, z67Var, z17));
        return true;
    }
}
