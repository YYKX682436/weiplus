package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 f192168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88) {
        super(1);
        this.f192168d = activityC13958x14958e88;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String suggestion = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suggestion, "suggestion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGallerySearchUI", "onSuggestion Click :".concat(suggestion));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88 = this.f192168d;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = activityC13958x14958e88.f190797v;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().n(suggestion, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = activityC13958x14958e88.I;
        if (k4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("historyLogic");
            throw null;
        }
        k4Var.c(suggestion);
        activityC13958x14958e88.C = 4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88.e7(activityC13958x14958e88, suggestion, null, 2, null);
        return jz5.f0.f384359a;
    }
}
