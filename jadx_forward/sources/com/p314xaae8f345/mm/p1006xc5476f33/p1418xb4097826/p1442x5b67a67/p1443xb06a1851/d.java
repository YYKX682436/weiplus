package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851;

/* loaded from: classes2.dex */
public final class d implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f186672a;

    /* renamed from: b, reason: collision with root package name */
    public final int f186673b;

    /* renamed from: c, reason: collision with root package name */
    public float f186674c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final int f186675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i f186676e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i iVar) {
        this.f186676e = iVar;
        this.f186672a = iVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f186673b = iVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
        this.f186675d = i65.a.b(iVar.m80379x76847179(), 72);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        float abs = (java.lang.Math.abs(i17) * 1.0f) / this.f186675d;
        float f17 = 1.0f > abs ? abs : 1.0f;
        if (f17 == this.f186674c) {
            return;
        }
        this.f186674c = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i iVar = this.f186676e;
        if (f17 < 0.5f) {
            float f18 = (0.5f - f17) / 0.5f;
            android.view.View view2 = iVar.f186692r;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
                throw null;
            }
            view2.setBackgroundColor(this.f186672a);
            android.view.View view3 = iVar.f186688n;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            b(f17, f18);
            return;
        }
        float f19 = (f17 - 0.5f) / 0.5f;
        int i18 = (int) (255 * f19);
        android.view.View view4 = iVar.f186692r;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
            throw null;
        }
        view4.setBackgroundColor(com.p314xaae8f345.mm.ui.uk.a(this.f186673b, i18));
        android.view.View view5 = iVar.f186688n;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        b(f17, f19);
    }

    public final void b(float f17, float f18) {
        double d17 = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.i iVar = this.f186676e;
        if (d17 < 0.5d) {
            android.widget.TextView textView = iVar.f186689o;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("barTitle");
                throw null;
            }
            c(textView, 4);
        } else {
            android.widget.TextView textView2 = iVar.f186689o;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("barTitle");
                throw null;
            }
            c(textView2, 0);
        }
        android.view.View view = iVar.f186694t;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = iVar.f186693s;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void c(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
