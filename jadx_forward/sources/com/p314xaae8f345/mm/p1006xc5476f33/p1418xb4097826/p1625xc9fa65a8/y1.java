package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160) {
        super(1);
        this.f207515d = activityC14945x8c20f160;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String suggestion = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suggestion, "suggestion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "onSuggestion Click :".concat(suggestion));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207515d;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = activityC14945x8c20f160.f207080t;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().q(suggestion, null, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = activityC14945x8c20f160.V;
        if (k4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("historyLogic");
            throw null;
        }
        k4Var.c(suggestion);
        activityC14945x8c20f160.H = 4;
        activityC14945x8c20f160.K = 0;
        activityC14945x8c20f160.r7();
        activityC14945x8c20f160.Y = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160.v7(activityC14945x8c20f160, suggestion, null, false, false, 14, null);
        return jz5.f0.f384359a;
    }
}
