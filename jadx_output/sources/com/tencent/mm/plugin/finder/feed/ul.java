package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ul extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.vl f110821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f110822e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(com.tencent.mm.plugin.finder.feed.vl vlVar, com.tencent.mm.ui.MMActivity mMActivity) {
        super(1);
        this.f110821d = vlVar;
        this.f110822e = mMActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View t17;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.vl vlVar = this.f110821d;
        if (vlVar.f107156e.getSize() == 0) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var = vlVar.f107157f;
            if (a1Var != null && (t17 = a1Var.t()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderMemberFeedUIContract$MemberFeedPresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderMemberFeedUIContract$MemberFeedPresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setBackground(this.f110822e.getDrawable(com.tencent.mm.R.color.a9e));
                android.widget.TextView textView = (android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.dft);
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.view.View findViewById = t17.findViewById(com.tencent.mm.R.id.lbi);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderMemberFeedUIContract$MemberFeedPresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderMemberFeedUIContract$MemberFeedPresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = t17.findViewById(com.tencent.mm.R.id.m2g);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderMemberFeedUIContract$MemberFeedPresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderMemberFeedUIContract$MemberFeedPresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.tencent.mm.plugin.finder.feed.a1 a1Var2 = vlVar.f107157f;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = a1Var2 != null ? a1Var2.f106180m : null;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setEnableLoadMore(false);
            }
        } else {
            com.tencent.mm.plugin.finder.feed.a1 a1Var3 = vlVar.f107157f;
            android.view.View t18 = a1Var3 != null ? a1Var3.t() : null;
            if (t18 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                android.view.View view = t18;
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderMemberFeedUIContract$MemberFeedPresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderMemberFeedUIContract$MemberFeedPresenter$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
