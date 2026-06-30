package ib2;

/* loaded from: classes2.dex */
public final class a implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f371625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f371626b;

    /* renamed from: c, reason: collision with root package name */
    public float f371627c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final int f371628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ib2.w f371629e;

    public a(ib2.w wVar) {
        this.f371629e = wVar;
        this.f371625a = wVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f371626b = wVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
        this.f371628d = i65.a.b(wVar.m80379x76847179(), 72);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(i17) * 1.0f) / this.f371628d);
        if (min == this.f371627c) {
            return;
        }
        this.f371627c = min;
        ib2.w wVar = this.f371629e;
        if (min < 0.5f) {
            float f17 = (0.5f - min) / 0.5f;
            android.view.View view2 = wVar.f371697o;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
                throw null;
            }
            view2.setBackgroundColor(this.f371625a);
            android.view.View view3 = wVar.f371693h;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("collectionTitleLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            b(min, f17);
            return;
        }
        float f18 = (min - 0.5f) / 0.5f;
        int i18 = (int) (255 * f18);
        android.view.View view4 = wVar.f371697o;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
            throw null;
        }
        view4.setBackgroundColor(com.p314xaae8f345.mm.ui.uk.a(this.f371626b, i18));
        android.view.View view5 = wVar.f371693h;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("collectionTitleLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        b(min, f18);
    }

    public final void b(float f17, float f18) {
        double d17 = f17;
        ib2.w wVar = this.f371629e;
        if (d17 < 0.5d) {
            android.view.View view = wVar.f371693h;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("collectionTitleLayout");
                throw null;
            }
            c(view, 4);
        } else {
            android.view.View view2 = wVar.f371693h;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("collectionTitleLayout");
                throw null;
            }
            c(view2, 0);
        }
        android.view.View view3 = wVar.f371699q;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = wVar.f371698p;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void c(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
