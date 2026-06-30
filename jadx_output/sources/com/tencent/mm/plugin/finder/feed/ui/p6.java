package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class p6 implements fs2.c, tj5.w, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragmentActivity f110398d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.a6 f110399e;

    /* renamed from: f, reason: collision with root package name */
    public final vb2.p f110400f;

    /* renamed from: g, reason: collision with root package name */
    public final int f110401g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f110402h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f110403i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f110404m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f110405n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f110406o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f110407p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f110408q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f110409r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.c6 f110410s;

    /* renamed from: t, reason: collision with root package name */
    public final int f110411t;

    public p6(com.tencent.mm.ui.MMFragmentActivity context, com.tencent.mm.plugin.finder.feed.ui.a6 presenter, vb2.p uiBinding, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(uiBinding, "uiBinding");
        this.f110398d = context;
        this.f110399e = presenter;
        this.f110400f = uiBinding;
        this.f110401g = i17;
        this.f110402h = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.o6(this));
        this.f110403i = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.m6(this));
        this.f110404m = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.k6(this));
        this.f110405n = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.j6(this));
        this.f110406o = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.i6(this));
        this.f110407p = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.n6(this));
        this.f110410s = new com.tencent.mm.plugin.finder.feed.ui.c6(this);
        this.f110411t = -1;
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(list);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f110398d;
        if (L0) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f110408q;
            if (fTSSearchView == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView.getFtsEditText().setHint(mMFragmentActivity.getString(com.tencent.mm.R.string.f491416d10));
        } else {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f110408q;
            if (fTSSearchView2 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView2.getFtsEditText().setHint(mMFragmentActivity.getString(com.tencent.mm.R.string.f491417d11));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            if (j()) {
                g().setVisibility(0);
            }
            ((android.widget.LinearLayout) ((jz5.n) this.f110406o).getValue()).setVisibility(8);
            ((android.widget.TextView) ((jz5.n) this.f110405n).getValue()).setVisibility(8);
            a().setVisibility(8);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        this.f110398d.hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f110408q;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.String inEditTextQuery = fTSSearchView.getFtsEditText().getInEditTextQuery();
        if (inEditTextQuery == null) {
            inEditTextQuery = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(inEditTextQuery)) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f110408q;
            if (fTSSearchView2 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(fTSSearchView2.getFtsEditText().getTagList())) {
                return true;
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f110408q;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.util.List<tj5.x> tagList = fTSSearchView3.getFtsEditText().getTagList();
        kotlin.jvm.internal.o.f(tagList, "getTagList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tagList, 10));
        for (tj5.x xVar : tagList) {
            kotlin.jvm.internal.o.e(xVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract.TagModel");
            arrayList.add((com.tencent.mm.plugin.finder.feed.ui.b6) xVar);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String string = ((com.tencent.mm.plugin.finder.feed.ui.b6) it.next()).f109697d.f410330d.getString(0);
            if (string == null) {
                string = "";
            }
            linkedList.add(string);
        }
        this.f110399e.h(inEditTextQuery, linkedList);
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout a() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f110403i).getValue();
    }

    public final android.widget.LinearLayout g() {
        return (android.widget.LinearLayout) ((jz5.n) this.f110407p).getValue();
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f110398d;
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f110404m).getValue();
    }

    public final boolean j() {
        return !com.tencent.mm.sdk.platformtools.t8.L0(this.f110399e.f109651e) && this.f110401g == 2;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f110398d;
        mMFragmentActivity.hideVKB();
        mMFragmentActivity.finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f110408q;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        this.f110398d.showVKB();
    }
}
