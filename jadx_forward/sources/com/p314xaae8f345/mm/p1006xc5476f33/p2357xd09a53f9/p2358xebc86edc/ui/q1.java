package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class q1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 f260030b;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734, java.util.List list) {
        this.f260030b = activityC19003x7959c734;
        this.f260029a = list;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734 = this.f260030b;
        hs4.d dVar = activityC19003x7959c734.f259377t;
        if (dVar != null) {
            dVar.c();
            int i17 = activityC19003x7959c734.f259377t.f366161m;
            if (i17 < 0 || i17 >= this.f260029a.size()) {
                activityC19003x7959c734.f259366f = null;
                activityC19003x7959c734.Z6();
            } else {
                activityC19003x7959c734.f259366f = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) activityC19003x7959c734.f259365e.get(activityC19003x7959c734.f259377t.f366161m);
                activityC19003x7959c734.Z6();
            }
        }
    }
}
