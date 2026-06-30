package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.um f108925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(com.tencent.mm.plugin.finder.feed.um umVar, ym5.s3 s3Var, boolean z17) {
        super(0);
        this.f108925d = umVar;
        this.f108926e = s3Var;
        this.f108927f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2;
        android.view.View f213435x;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3;
        android.view.View f213435x2;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.um umVar = this.f108925d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = umVar.f107157f;
        androidx.recyclerview.widget.f2 adapter = (a1Var == null || (recyclerView = a1Var.getRecyclerView()) == null) ? null : recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        boolean z17 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0;
        ym5.s3 s3Var = this.f108926e;
        if ((s3Var == null || s3Var.f463521f) ? false : true) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var2 = umVar.f107157f;
            refreshLoadMoreLayout = a1Var2 != null ? a1Var2.f106180m : null;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setHasBottomMore(false);
            }
            com.tencent.mm.plugin.finder.feed.a1 a1Var3 = umVar.f107157f;
            if (a1Var3 != null && (refreshLoadMoreLayout3 = a1Var3.f106180m) != null && (f213435x2 = refreshLoadMoreLayout3.getF213435x()) != null) {
                android.view.View findViewById = f213435x2.findViewById(com.tencent.mm.R.id.m6l);
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$checkNoMoreFooter$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$checkNoMoreFooter$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = f213435x2.findViewById(com.tencent.mm.R.id.ile);
                if (findViewById2 != null) {
                    int i17 = z17 ? 8 : 0;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$checkNoMoreFooter$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$checkNoMoreFooter$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else if (this.f108927f) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var4 = umVar.f107157f;
            refreshLoadMoreLayout = a1Var4 != null ? a1Var4.f106180m : null;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setHasBottomMore(true);
            }
            com.tencent.mm.plugin.finder.feed.a1 a1Var5 = umVar.f107157f;
            if (a1Var5 != null && (refreshLoadMoreLayout2 = a1Var5.f106180m) != null && (f213435x = refreshLoadMoreLayout2.getF213435x()) != null) {
                android.view.View findViewById3 = f213435x.findViewById(com.tencent.mm.R.id.m6l);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$checkNoMoreFooter$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$checkNoMoreFooter$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById4 = f213435x.findViewById(com.tencent.mm.R.id.ile);
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$checkNoMoreFooter$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$checkNoMoreFooter$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
