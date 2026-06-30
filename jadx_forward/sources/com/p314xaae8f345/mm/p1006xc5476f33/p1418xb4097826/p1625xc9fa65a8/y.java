package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 f207512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56) {
        super(1);
        this.f207512d = activityC14942x98a58d56;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String suggestion = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suggestion, "suggestion");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56 = this.f207512d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC14942x98a58d56.f207061t, "onSuggestion Click :".concat(suggestion));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = activityC14942x98a58d56.f207062u;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().n(suggestion, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = activityC14942x98a58d56.M;
        if (k4Var != null) {
            k4Var.c(suggestion);
        }
        activityC14942x98a58d56.L = 4;
        activityC14942x98a58d56.e7(suggestion);
        return jz5.f0.f384359a;
    }
}
