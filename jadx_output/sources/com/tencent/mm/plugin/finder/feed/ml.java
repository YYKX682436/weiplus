package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ml extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f107389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(2);
        this.f107389d = tlVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f107389d;
        tlVar.j(false);
        android.view.View d17 = tlVar.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.MMActivity activity = tlVar.f109069d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17).W6(false, false);
        android.widget.TextView textView = (android.widget.TextView) activity.findViewById(com.tencent.mm.R.id.cti);
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.mss);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) activity.findViewById(com.tencent.mm.R.id.f483315aa4);
        if (weImageView != null) {
            weImageView.setIconColor(activity.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        }
        if (intValue != -5002) {
            if (intValue == -4036) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.f492069f45);
            } else if (intValue == -4033) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.cwu);
            } else if (intValue != -4011) {
                com.tencent.mm.plugin.finder.feed.tl.a(tlVar, true);
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$requestRefresh$2", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.cv_);
            }
        } else if (str != null) {
            hc2.i.d(activity, str);
        }
        return jz5.f0.f302826a;
    }
}
