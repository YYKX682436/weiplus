package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI f110294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.wb f110295e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, com.tencent.mm.plugin.finder.feed.wb wbVar) {
        super(2);
        this.f110294d = finderHorizontalVideoHalfFeedUI;
        this.f110295e = wbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI.B;
        com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI = this.f110294d;
        finderHorizontalVideoHalfFeedUI.l7(false);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f110295e.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var != null ? i0Var.getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        android.view.View findViewById = finderHorizontalVideoHalfFeedUI.findViewById(com.tencent.mm.R.id.gwh);
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.cti);
        if (intValue != -5002) {
            if (intValue == -4036) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.f492069f45);
            } else if (intValue == -4033) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.cwu);
            } else if (intValue != -4011) {
                com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI.k7(finderHorizontalVideoHalfFeedUI, true);
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$4$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.cv_);
            }
        } else if (str != null) {
            hc2.i.d(finderHorizontalVideoHalfFeedUI, str);
        }
        return jz5.f0.f302826a;
    }
}
