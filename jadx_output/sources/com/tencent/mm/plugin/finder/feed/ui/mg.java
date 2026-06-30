package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class mg extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLongFeedDetailUI f110309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(com.tencent.mm.plugin.finder.feed.ui.FinderLongFeedDetailUI finderLongFeedDetailUI) {
        super(2);
        this.f110309d = finderLongFeedDetailUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mars.xlog.Log.i("FinderLongFeedDetailUI", "showErrUi: errCode=" + intValue + ", errMsg=" + str);
        com.tencent.mm.plugin.finder.feed.ui.FinderLongFeedDetailUI finderLongFeedDetailUI = this.f110309d;
        com.tencent.mm.plugin.finder.feed.z9 z9Var = finderLongFeedDetailUI.f109243y;
        if (z9Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = z9Var.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        android.view.View findViewById = finderLongFeedDetailUI.findViewById(com.tencent.mm.R.id.q7o);
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.cti);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        android.view.View decorView = finderLongFeedDetailUI.getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        android.view.ViewGroup viewGroup2 = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewWithTag(java.lang.Integer.valueOf(com.tencent.mm.R.id.rl8)) : null;
        android.view.ViewGroup viewGroup3 = viewGroup2 instanceof android.view.ViewGroup ? viewGroup2 : null;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f);
        }
        if (intValue != -5002) {
            boolean z17 = true;
            if (intValue == -4036) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    textView.setText(com.tencent.mm.R.string.f492069f45);
                } else {
                    textView.setText(str);
                }
            } else if (intValue == -4033) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    textView.setText(com.tencent.mm.R.string.cwu);
                } else {
                    textView.setText(str);
                }
            } else if (intValue == -4011) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI$initOnCreate$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    textView.setText(com.tencent.mm.R.string.cv_);
                } else {
                    textView.setText(str);
                }
            }
        } else if (str != null) {
            hc2.i.d(finderLongFeedDetailUI, str);
        }
        return jz5.f0.f302826a;
    }
}
