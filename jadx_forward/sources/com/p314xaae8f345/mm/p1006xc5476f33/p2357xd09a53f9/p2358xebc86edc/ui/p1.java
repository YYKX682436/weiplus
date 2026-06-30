package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class p1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 f260026e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734, java.util.List list) {
        this.f260026e = activityC19003x7959c734;
        this.f260025d = list;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734 = this.f260026e;
        hs4.d dVar = activityC19003x7959c734.f259377t;
        if (dVar != null) {
            dVar.c();
            if (i17 < this.f260025d.size()) {
                activityC19003x7959c734.f259366f = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) activityC19003x7959c734.f259365e.get(i17);
                activityC19003x7959c734.Z6();
            } else {
                activityC19003x7959c734.f259366f = null;
                activityC19003x7959c734.Z6();
            }
        }
    }
}
