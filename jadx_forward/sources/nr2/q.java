package nr2;

/* loaded from: classes2.dex */
public final class q implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f420821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f420822b;

    /* renamed from: c, reason: collision with root package name */
    public float f420823c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final int f420824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f420825e;

    public q(nr2.j0 j0Var) {
        this.f420825e = j0Var;
        this.f420821a = j0Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f420822b = j0Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
        this.f420824d = i65.a.b(j0Var.m80379x76847179(), 72);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(i17) * 1.0f) / this.f420824d);
        if (min == this.f420823c) {
            return;
        }
        this.f420823c = min;
        nr2.j0 j0Var = this.f420825e;
        if (min < 0.5f) {
            float f17 = (0.5f - min) / 0.5f;
            android.view.View view2 = j0Var.f420767u;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
                throw null;
            }
            view2.setBackgroundColor(this.f420821a);
            android.view.View view3 = j0Var.f420763q;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("courseTitleLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            b(min, f17);
            return;
        }
        float f18 = (min - 0.5f) / 0.5f;
        int i18 = (int) (255 * f18);
        android.view.View view4 = j0Var.f420767u;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
            throw null;
        }
        view4.setBackgroundColor(com.p314xaae8f345.mm.ui.uk.a(this.f420822b, i18));
        android.view.View view5 = j0Var.f420763q;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("courseTitleLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        b(min, f18);
    }

    public final void b(float f17, float f18) {
        double d17 = f17;
        nr2.j0 j0Var = this.f420825e;
        if (d17 < 0.5d) {
            android.widget.TextView textView = j0Var.f420764r;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("courseBarTitle");
                throw null;
            }
            c(textView, 4);
        } else {
            android.widget.TextView textView2 = j0Var.f420764r;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("courseBarTitle");
                throw null;
            }
            c(textView2, 0);
        }
        android.view.View view = j0Var.f420769w;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = j0Var.f420768v;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void c(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
