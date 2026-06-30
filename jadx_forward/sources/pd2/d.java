package pd2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final pd2.d f435078a = new pd2.d();

    public final void a(android.view.View itemView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, boolean z17, boolean z18) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.l0c);
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.l1j);
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.orn);
        android.view.ViewParent parent = findViewById != null ? findViewById.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (findViewById == null) {
            i17 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i17 = 0;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 == null) {
            i18 = i17;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            i18 = i17;
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(i18)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(i18)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(i18);
        }
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(itemView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560575o7));
        }
        if (item.getFeedObject().m59328xcaae1dc7()) {
            if (findViewById != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(i18)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.dpi) : null;
            if (textView != null) {
                textView.setTextSize(i18, i65.a.b(itemView.getContext(), 14));
            }
            if (item.getFeedObject().m59329x3a06df9f()) {
                if (textView != null) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.exi);
                    return;
                }
                return;
            } else {
                if (textView != null) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572952d13);
                    return;
                }
                return;
            }
        }
        if (!item.getFeedObject().m59331xcb21161d()) {
            if (findViewById2 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(i18)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null || (c22803x544dcce2 = (com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f568010lc4)) == null) {
                return;
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(c22803x544dcce2.getProgress(), item.getFeedObject().m59277xa8f45ee4().m75939xb282bd08(4));
            ofInt.addUpdateListener(new pd2.c(c22803x544dcce2));
            android.animation.ValueAnimator duration = ofInt.setDuration(400L);
            if (duration != null) {
                duration.start();
                return;
            }
            return;
        }
        if (z17) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        if (findViewById3 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(i18)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.p314xaae8f345.mm.ui.bk.C() || z18) {
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(itemView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77665x8b2be3de));
            }
        } else if (viewGroup != null) {
            viewGroup.setBackgroundColor(itemView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        }
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new pd2.b(itemView));
        }
    }
}
