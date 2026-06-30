package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class d implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f105210a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105211b;

    /* renamed from: c, reason: collision with root package name */
    public float f105212c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final int f105213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.j f105214e;

    public d(com.tencent.mm.plugin.finder.drama.drawer.j jVar) {
        this.f105214e = jVar;
        this.f105210a = jVar.getActivity().getResources().getColor(com.tencent.mm.R.color.a9e);
        this.f105211b = jVar.getActivity().getResources().getColor(com.tencent.mm.R.color.f478489a);
        this.f105213d = i65.a.b(jVar.getContext(), 72);
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        float abs = (java.lang.Math.abs(i17) * 1.0f) / this.f105213d;
        float f17 = 1.0f > abs ? abs : 1.0f;
        if (f17 == this.f105212c) {
            return;
        }
        this.f105212c = f17;
        com.tencent.mm.plugin.finder.drama.drawer.j jVar = this.f105214e;
        if (f17 < 0.5f) {
            float f18 = (0.5f - f17) / 0.5f;
            android.view.View view2 = jVar.f105252s;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("titleContainer");
                throw null;
            }
            view2.setBackgroundColor(this.f105210a);
            android.view.View view3 = jVar.f105248o;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("titleLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            b(f17, f18);
            return;
        }
        float f19 = (f17 - 0.5f) / 0.5f;
        int i18 = (int) (255 * f19);
        android.view.View view4 = jVar.f105252s;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("titleContainer");
            throw null;
        }
        view4.setBackgroundColor(com.tencent.mm.ui.uk.a(this.f105211b, i18));
        android.view.View view5 = jVar.f105248o;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("titleLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        b(f17, f19);
    }

    public final void b(float f17, float f18) {
        double d17 = f17;
        com.tencent.mm.plugin.finder.drama.drawer.j jVar = this.f105214e;
        if (d17 < 0.5d) {
            android.widget.TextView textView = jVar.f105249p;
            if (textView == null) {
                kotlin.jvm.internal.o.o("barTitle");
                throw null;
            }
            c(textView, 4);
        } else {
            android.widget.TextView textView2 = jVar.f105249p;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("barTitle");
                throw null;
            }
            c(textView2, 0);
        }
        android.view.View view = jVar.f105254u;
        if (view == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = jVar.f105253t;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("moreBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void c(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
