package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickClearTextBtn", "onClickCancelBtn", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OccupyFinderUI40 extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements tj5.w, tj5.n {
    public static final /* synthetic */ int G = 0;
    public com.tencent.mm.ui.search.FTSSearchView C;
    public final bm2.w7 D;
    public com.tencent.mm.ui.tools.f5 E;
    public boolean F;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109620v = "Finder_Sensitive_Word_Search_UI";

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109621w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.zp(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109622x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.xp(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f109623y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.up(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109624z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.tp(this));
    public java.util.LinkedList A = new java.util.LinkedList();
    public java.lang.String B = "";

    public OccupyFinderUI40() {
        bm2.w7 w7Var = new bm2.w7(this);
        w7Var.f22419g = new com.tencent.mm.plugin.finder.feed.ui.pp(this);
        this.D = w7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public static final void d7(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40, java.util.LinkedList linkedList) {
        ?? linkedList2;
        if (!r26.n0.N(occupyFinderUI40.B)) {
            linkedList2 = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                if (r26.n0.D((java.lang.String) obj, occupyFinderUI40.B, false, 2, null)) {
                    linkedList2.add(obj);
                }
            }
        } else {
            linkedList2 = new java.util.LinkedList();
        }
        if (linkedList2.isEmpty()) {
            android.view.View f76 = occupyFinderUI40.f7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f76, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "updateList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f76, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "updateList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View f77 = occupyFinderUI40.f7();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(f77, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "updateList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f77.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(f77, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "updateList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bm2.w7 w7Var = occupyFinderUI40.D;
        w7Var.getClass();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) w7Var.f22417e;
        arrayList3.clear();
        arrayList3.addAll(linkedList2);
        w7Var.notifyDataSetChanged();
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
    }

    @Override // tj5.n
    public boolean G0() {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.C;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.String obj = fTSSearchView.getFtsEditText().getEditText().getText().toString();
        hideVKB();
        g7(obj);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_sensitive_word_search", "view_clk", kz5.b1.e(new jz5.l("sensitive_word", obj)));
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final java.lang.Object e7(int i17, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        new db2.a2(i17, xy2.c.e(this), linkedList).l().K(new com.tencent.mm.plugin.finder.feed.ui.rp(this, nVar, i17));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final android.view.View f7() {
        java.lang.Object value = ((jz5.n) this.f109623y).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void g7(java.lang.String str) {
        this.B = str;
        java.lang.Object value = ((jz5.n) this.f109622x).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View f76 = f7();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(f76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(f76, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value2 = ((jz5.n) this.f109624z).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        android.view.View view2 = (android.view.View) value2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kotlinx.coroutines.l.d(v65.m.b(this), null, null, new com.tencent.mm.plugin.finder.feed.ui.yp(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488976az0;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.C;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().e();
        } else {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Object value = ((jz5.n) this.f109622x).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.View) value).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.sp(this));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.C = fTSSearchView;
        zl2.r4.f473950a.Z2(fTSSearchView.getFtsEditText().getEditText(), null, 20, 10, (r17 & 16) != 0 ? true : true, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, null);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.C;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.C;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.C;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.C;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.C;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView6.getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.C;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView7);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.C;
        if (fTSSearchView8 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView8.getFtsEditText().m();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = this.C;
        if (fTSSearchView9 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView9.getFtsEditText().t();
        jz5.g gVar = this.f109621w;
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value2).setAdapter(this.D);
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value3).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().getDecorView().post(new com.tencent.mm.plugin.finder.feed.ui.wp(this));
    }
}
