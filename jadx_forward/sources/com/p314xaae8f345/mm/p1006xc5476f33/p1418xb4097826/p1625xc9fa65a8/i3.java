package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14953xa4cd9092 f207255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14953xa4cd9092 activityC14953xa4cd9092) {
        super(1);
        this.f207255d = activityC14953xa4cd9092;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca c14951x18cbc2ca;
        java.lang.String suggestion = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suggestion, "suggestion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMixSearchUI", "onSuggestion Click :".concat(suggestion));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14953xa4cd9092 activityC14953xa4cd9092 = this.f207255d;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = activityC14953xa4cd9092.f207116t;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().n(suggestion, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = activityC14953xa4cd9092.f207118v;
        if (k4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("historyLogic");
            throw null;
        }
        k4Var.c(suggestion);
        c14951x18cbc2ca = activityC14953xa4cd9092.presenter;
        if (c14951x18cbc2ca != null) {
            c14951x18cbc2ca.s(suggestion, 4, false, null, activityC14953xa4cd9092.f207121y);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }
}
