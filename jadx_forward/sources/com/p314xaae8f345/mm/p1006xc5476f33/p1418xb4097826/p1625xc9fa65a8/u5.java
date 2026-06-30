package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class u5 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f207427d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f207428e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v5 f207429f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ListView f207430g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r5 f207431h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f207432i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f207433m;

    /* renamed from: n, reason: collision with root package name */
    public db2.j6 f207434n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q5 f207435o;

    public u5(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 editText, yz5.p onSuggestionClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuggestionClickListener, "onSuggestionClickListener");
        this.f207427d = activity;
        this.f207428e = editText;
        this.f207429f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v5(activity);
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.f568710ns4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f207430g = listView;
        this.f207432i = "";
        this.f207433m = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.n5 n5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.n5(this);
        java.util.ArrayList arrayList = editText.F;
        if (!arrayList.contains(n5Var)) {
            arrayList.add(n5Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r5 r5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r5(this);
        this.f207431h = r5Var;
        listView.setAdapter((android.widget.ListAdapter) r5Var);
        listView.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.o5(this, onSuggestionClickListener));
        listView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p5(this));
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchSuggestion", "dismissSuggestion");
        android.widget.ListView listView = this.f207430g;
        listView.animate().cancel();
        listView.animate().alpha(0.0f).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t5(this)).start();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q5 q5Var = this.f207435o;
        if (q5Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bc0) q5Var).a(8);
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchSuggestion", "ignore searchSuggestionContent");
        this.f207433m = "";
        gm0.j1.d().d(this.f207434n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r5 r5Var = this.f207431h;
        r5Var.f207374d = null;
        r5Var.notifyDataSetChanged();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021f A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p944x882e457a.m1 r22) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u5.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
