package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class zh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment f110805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment) {
        super(0);
        this.f110805d = finderPostPlaySquareContainerFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment = this.f110805d;
        if (finderPostPlaySquareContainerFragment.f109491u == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostPlaySquareContainerFragment", "reloadData: viewCallback not initialized yet");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostPlaySquareContainerFragment", "reloadData: clearing data and reloading... hasLoadedData=" + finderPostPlaySquareContainerFragment.f109495y);
            com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader finderPostPlaySquareContainerLoader = finderPostPlaySquareContainerFragment.f109492v;
            if (finderPostPlaySquareContainerLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            finderPostPlaySquareContainerLoader.getDataList().clear();
            finderPostPlaySquareContainerLoader.setLastBuffer(null);
            com.tencent.mars.xlog.Log.i(finderPostPlaySquareContainerLoader.getF123427d(), "clearData: data cleared, isRequesting reset to false");
            finderPostPlaySquareContainerFragment.f109495y = false;
            com.tencent.mm.plugin.finder.feed.to toVar = finderPostPlaySquareContainerFragment.f109491u;
            if (toVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = toVar.f109097n;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
            com.tencent.mm.plugin.finder.feed.to toVar2 = finderPostPlaySquareContainerFragment.f109491u;
            if (toVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View a17 = toVar2.a();
            if (a17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.finder.feed.to toVar3 = finderPostPlaySquareContainerFragment.f109491u;
                if (toVar3 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                toVar3.g().setVisibility(8);
                android.view.View findViewById = a17.findViewById(com.tencent.mm.R.id.lbi);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = a17.findViewById(com.tencent.mm.R.id.dft);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById3 = a17.findViewById(com.tencent.mm.R.id.m2g);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.tencent.mm.plugin.finder.feed.to toVar4 = finderPostPlaySquareContainerFragment.f109491u;
            if (toVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View view = toVar4.f109098o;
            if (view != null) {
                android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.ilg);
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.ilh);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.tencent.mm.plugin.finder.feed.no noVar = finderPostPlaySquareContainerFragment.f109490t;
            if (noVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(noVar.f108587d, false, 1, null);
            com.tencent.mm.plugin.finder.feed.to toVar5 = finderPostPlaySquareContainerFragment.f109491u;
            if (toVar5 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout.T(toVar5.g(), 0, false, null, 7, null);
            finderPostPlaySquareContainerFragment.f109495y = true;
        }
        return jz5.f0.f302826a;
    }
}
