package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class z0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f207521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f207523f;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f207521d = abstractC14490x69736cb5;
        this.f207522e = activityC14945x8c20f160;
        this.f207523f = k0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f207521d;
        if (!abstractC14490x69736cb5.getFeedObject().m59203x7541886a(102) || hc2.o0.A(abstractC14490x69736cb5.getFeedObject().getFeedObject())) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207522e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14945x8c20f160.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        o25.y1 y1Var = activityC14945x8c20f160.f207085x0;
        if (y1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("quickMenuHelper");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f207521d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
        n7Var.d(mo55332x76847179, y1Var, abstractC14490x69736cb52, g4Var, this.f207523f);
    }
}
