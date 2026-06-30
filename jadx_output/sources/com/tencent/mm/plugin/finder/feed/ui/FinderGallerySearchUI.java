package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGallerySearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements tj5.w, tj5.n {
    public boolean D;
    public com.tencent.mm.view.RefreshLoadMoreLayout E;
    public androidx.recyclerview.widget.RecyclerView F;
    public android.widget.TextView G;
    public android.view.View H;
    public com.tencent.mm.plugin.finder.search.k4 I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.u4 f109262J;
    public bq.o1 N;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.gallery.d f109263u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f109264v;

    /* renamed from: x, reason: collision with root package name */
    public int f109266x;

    /* renamed from: y, reason: collision with root package name */
    public int f109267y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f109268z;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f109265w = "";
    public final java.util.ArrayList A = new java.util.ArrayList();
    public java.lang.String B = "";
    public int C = 1;
    public final jz5.g K = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.o3(this));
    public final jz5.g L = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.n3(this));
    public final int M = 10000;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e7(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI r23, java.lang.String r24, com.tencent.mm.protobuf.g r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI.e7(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI, java.lang.String, com.tencent.mm.protobuf.g, int, java.lang.Object):void");
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            android.view.View view = this.H;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.G;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.E;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.I;
        if (k4Var != null) {
            k4Var.b(str3);
        } else {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f109264v;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = r26.n0.u0(totalQuery).toString()) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        this.C = 1;
        e7(this, str, null, 2, null);
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.I;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.c(str);
        com.tencent.mm.plugin.finder.search.u4 u4Var = this.f109262J;
        if (u4Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.b();
        jx3.f.INSTANCE.idkeyStat(1265L, 6L, 1L, false);
        return false;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ",1";
            com.tencent.mars.xlog.Log.i("Finder.FinderSearchReportLogic", "report19184 " + str);
            jx3.f.INSTANCE.kvStat(19184, str);
        }
    }

    public final void a(java.lang.String str, int i17, int i18) {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        java.lang.String str2 = this.B;
        java.lang.String str3 = this.f109265w;
        java.lang.String str4 = o3Var.f125208d;
        int i19 = this.C;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        com.tencent.mm.plugin.finder.report.o3.Ij(o3Var, str2, str3, 2, 2, str, i17, 3, 1, str4, i18, i19, nyVar != null ? nyVar.V6() : null, null, 0, 12288, null);
    }

    public final com.tencent.mm.plugin.finder.gallery.d c7() {
        com.tencent.mm.plugin.finder.gallery.d dVar = this.f109263u;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.o.o("galleryConfig");
        throw null;
    }

    public final void d7(int i17, int i18, r45.tu2 tu2Var) {
        java.util.ArrayList arrayList = this.A;
        int size = arrayList.size();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = arrayList.size();
        boolean z17 = this.f109267y != 0;
        if (i17 == 0 && i18 == 0 && tu2Var != null) {
            jx3.f.INSTANCE.idkeyStat(1265L, 7L, 1L, false);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = tu2Var.getList(4);
            kotlin.jvm.internal.o.f(list, "getObjectList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                kotlin.jvm.internal.o.d(finderObject);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16);
                com.tencent.mm.plugin.finder.search.l4.f125764d.put(java.lang.Long.valueOf(a17.getId()), a17);
                arrayList.add(cu2.u.f222441a.p(a17));
                arrayList2.add(jz5.f0.f302826a);
            }
            this.f109266x = tu2Var.getInteger(2);
            this.f109267y = tu2Var.getInteger(3);
            this.f109268z = tu2Var.getByteString(5);
            f0Var.f310116d = arrayList.size();
            com.tencent.mars.xlog.Log.i("Finder.FinderGallerySearchUI", "onSceneEnd " + tu2Var.getInteger(2) + ' ' + tu2Var.getInteger(3) + ' ' + arrayList.size());
        } else {
            jx3.f.INSTANCE.idkeyStat(1265L, 8L, 1L, false);
        }
        if (f0Var.f310116d == 0) {
            android.view.View view = this.H;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.G;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.E;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setVisibility(8);
        } else {
            android.view.View view2 = this.H;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.G;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.E;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setVisibility(0);
        }
        if (size == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.F;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        } else if (size < f0Var.f310116d) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.F;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(size, f0Var.f310116d - size);
            }
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.E;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout3.post(new com.tencent.mm.plugin.finder.feed.ui.x3(size, this, f0Var, z17));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ajl;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        c7().h(this, i17, i18, intent, com.tencent.mm.plugin.finder.gallery.c.f111356e);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
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
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f109264v;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f109263u = com.tencent.mm.plugin.finder.gallery.d.f111359b.a(getIntent());
        this.D = c7().d();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f109264v = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f109264v;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f109264v;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f109264v;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f109264v;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        if (this.D) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f109264v;
            if (fTSSearchView6 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            android.view.View findViewById = fTSSearchView6.findViewById(com.tencent.mm.R.id.b5i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f109264v;
            if (fTSSearchView7 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView7.getSearchContainer().setBackground(null);
            int color = getResources().getColor(com.tencent.mm.R.color.f479253u5);
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f109264v;
            if (fTSSearchView8 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView8.getFtsEditText().getEditText().setTextColor(color);
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = this.f109264v;
            if (fTSSearchView9 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView9.getSearchIcon().setIconColor(color);
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView10 = this.f109264v;
            if (fTSSearchView10 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView10.getFtsEditText().getClearBtn().getDrawable().setColorFilter(color, android.graphics.PorterDuff.Mode.SRC_ATOP);
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView11 = this.f109264v;
            if (fTSSearchView11 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            fTSSearchView11.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479160rk));
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479160rk));
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView12 = this.f109264v;
            if (fTSSearchView12 == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            supportActionBar.y(fTSSearchView12);
        }
        ((vb2.m) ((jz5.n) this.L).getValue()).f434671g.setVisibility(8);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView13 = this.f109264v;
        if (fTSSearchView13 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) fTSSearchView13.findViewById(com.tencent.mm.R.id.aa8);
        if (weImageView != null) {
            weImageView.setVisibility(0);
            if (this.D) {
                weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f479253u5));
            }
            weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.u3(this));
        }
        com.tencent.mm.plugin.finder.search.l4.f125764d.clear();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.B = uuid;
        this.f109265w = "";
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView14 = this.f109264v;
        if (fTSSearchView14 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView14.getFtsEditText().m();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView15 = this.f109264v;
        if (fTSSearchView15 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView15.getFtsEditText().t();
        this.I = new com.tencent.mm.plugin.finder.search.k4(this, this.D, false, new com.tencent.mm.plugin.finder.feed.ui.t3(this), null);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView16 = this.f109264v;
        if (fTSSearchView16 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText = fTSSearchView16.getFtsEditText();
        kotlin.jvm.internal.o.f(ftsEditText, "getFtsEditText(...)");
        com.tencent.mm.plugin.finder.search.u4 u4Var = new com.tencent.mm.plugin.finder.search.u4(this, ftsEditText, 0, 3, this.D, false, new com.tencent.mm.plugin.finder.feed.ui.v3(this));
        this.f109262J = u4Var;
        u4Var.f125893n = new com.tencent.mm.plugin.finder.feed.ui.w3(this);
        android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
        this.E = refreshLoadMoreLayout;
        this.F = refreshLoadMoreLayout.getRecyclerView();
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.kcj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.G = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = getContext().findViewById(com.tencent.mm.R.id.im7);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.H = findViewById4;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.F;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.gallery.d c76 = c7();
        int i17 = this.M;
        recyclerView.setLayoutManager(c76.f(this, i17));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.F;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.N(c7().e(i17));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(c7().a(i17), this.A, true);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.feed.ui.p3(this);
        wxRecyclerAdapter.F = new com.tencent.mm.plugin.finder.feed.ui.q3(this);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.F;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setAdapter(wxRecyclerAdapter);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.E;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        kotlin.jvm.internal.o.d(inflate);
        refreshLoadMoreLayout2.setLoadMoreFooter(inflate);
        if (this.D) {
            android.widget.TextView textView = this.G;
            if (textView == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479241tt));
            ((vb2.n) ((jz5.n) this.K).getValue()).f434688b.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479160rk));
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ili);
            if (textView2 != null) {
                textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
        } else {
            android.widget.TextView textView3 = this.G;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            textView3.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.F;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setOnTouchListener(new com.tencent.mm.plugin.finder.feed.ui.r3(this));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.E;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout3.setEnablePullDownHeader(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.E;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout4.setActionCallback(new com.tencent.mm.plugin.finder.feed.ui.s3(this));
        java.lang.String str = this.f109265w;
        if (str != null) {
            com.tencent.mm.plugin.finder.search.u4 u4Var2 = this.f109262J;
            if (u4Var2 == null) {
                kotlin.jvm.internal.o.o("searchSuggestionManager");
                throw null;
            }
            u4Var2.f125891l = str;
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView17 = this.f109264v;
            if (fTSSearchView17 != null) {
                fTSSearchView17.getFtsEditText().n(str, null);
            } else {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
        com.tencent.mm.plugin.finder.search.l4.f125764d.clear();
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.I;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.a();
        bu2.n.f24550a.c();
        hideVKB();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f109262J != null) {
            return;
        }
        kotlin.jvm.internal.o.o("searchSuggestionManager");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f109262J != null) {
            return;
        }
        kotlin.jvm.internal.o.o("searchSuggestionManager");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }
}
