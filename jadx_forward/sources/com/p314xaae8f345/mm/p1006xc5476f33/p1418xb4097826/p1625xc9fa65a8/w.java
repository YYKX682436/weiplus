package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 f207485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56) {
        super(1);
        this.f207485d = activityC14942x98a58d56;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String query = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56 = this.f207485d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var = activityC14942x98a58d56.N;
        if (u4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.f207424l = query;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = activityC14942x98a58d56.f207062u;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().n(query, null);
        activityC14942x98a58d56.L = 2;
        activityC14942x98a58d56.e7(query);
        return jz5.f0.f384359a;
    }
}
