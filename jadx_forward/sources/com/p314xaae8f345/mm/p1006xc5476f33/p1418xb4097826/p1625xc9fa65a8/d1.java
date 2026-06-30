package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class d1 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f207185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f207186c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f207187d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, in5.s0 s0Var) {
        this.f207184a = activityC14945x8c20f160;
        this.f207185b = abstractC14490x69736cb5;
        this.f207186c = k0Var;
        this.f207187d = s0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        if (h4Var != null) {
            o25.y1 y1Var = this.f207184a.f207085x0;
            if (y1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("quickMenuHelper");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f207187d.f374654e, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f207185b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet = this.f207186c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).bj(sheet, h4Var);
            obj = h4Var;
        } else {
            obj = java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "getMoreMenuItemLongSelectedListener :" + obj);
    }
}
