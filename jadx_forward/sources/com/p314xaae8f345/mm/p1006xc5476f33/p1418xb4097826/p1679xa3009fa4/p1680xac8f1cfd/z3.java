package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class z3 extends l93.k0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 f218168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f218169h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 f218170i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f218171m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f218172n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f218173o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f218174p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f218175q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f218176r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f218177s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f218178t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808, float f17, float f18, float f19, float f27, int i17, float f28, float f29, float f37, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(activityC0065xcd7aa112, abstractC14490x69736cb5);
        this.f218168g = a4Var;
        this.f218169h = lVar;
        this.f218170i = c15324x3354d808;
        this.f218171m = f17;
        this.f218172n = f18;
        this.f218173o = f19;
        this.f218174p = f27;
        this.f218175q = i17;
        this.f218176r = f28;
        this.f218177s = f29;
        this.f218178t = f37;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        float f18 = f17;
        if (java.lang.Float.isNaN(f17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerTranslation isNaN percent:" + f18);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerTranslation percent:" + f18);
        if (java.lang.Float.isNaN(f17) || f18 > 1.0f) {
            f18 = 1.0f;
        } else if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 mediaLayout = this.f218170i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaLayout, "$mediaLayout");
        float f19 = 1;
        float f27 = f19 - f18;
        float f28 = this.f218175q;
        float f29 = this.f218173o;
        float f37 = f29 > 1.0f ? ((f29 - 1.0f) * f27) + 1.0f : f29 < 1.0f ? 1.0f - ((1.0f - f29) * f27) : 1.0f;
        float f38 = this.f218174p;
        float f39 = f38 > 1.0f ? ((f38 - 1.0f) * f27) + 1.0f : f38 < 1.0f ? 1.0f - ((1.0f - f38) * f27) : 1.0f;
        float f47 = this.f218177s + (f28 * f27);
        float f48 = this.f218178t + (this.f218176r * f27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = this.f218168g;
        a4Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTargetViewProperty setPivot:");
        float f49 = this.f218171m;
        sb6.append(f49);
        sb6.append(' ');
        float f57 = this.f218172n;
        sb6.append(f57);
        sb6.append(" viewPivot: ");
        sb6.append(mediaLayout.getPivotX());
        sb6.append(' ');
        sb6.append(mediaLayout.getPivotY());
        sb6.append("scaleX:");
        sb6.append(f37);
        sb6.append(" scaleY:");
        sb6.append(f39);
        sb6.append(" translationX:");
        sb6.append(f47);
        sb6.append(" translationY:");
        sb6.append(f48);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAnimateVideoviewUIC", sb6.toString());
        if (!((java.lang.Boolean) ((jz5.n) a4Var.f215244d).mo141623x754a37bb()).booleanValue()) {
            mediaLayout.setPivotX(f49);
            mediaLayout.setPivotY(f57);
        }
        mediaLayout.setScaleX(f37);
        mediaLayout.setScaleY(f39);
        mediaLayout.setTranslationX(f47);
        mediaLayout.setTranslationY(f48);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oc0 oc0Var = a4Var.f215250m;
        if (oc0Var != null) {
            oc0Var.f216998f = f27;
            oc0Var.invalidate();
        }
        float f58 = f19 - f27;
        android.view.View view = a4Var.f215249i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = a4Var.f215253p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view3 = a4Var.f215254q;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view4 = a4Var.f215255r;
        if (view4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view5 = a4Var.f215256s;
        if (view5 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view6 = a4Var.f215257t;
        if (view6 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view7 = a4Var.f215258u;
        if (view7 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList7.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view8 = a4Var.f215259v;
        if (view8 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList8.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view9 = a4Var.f215260w;
        if (view9 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
            arrayList9.add(java.lang.Float.valueOf(f58));
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view9.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = a4Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class)).h7(f58);
        if (f18 == 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerTranslation end");
            return;
        }
        if (f18 == 1.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerTranslation start");
        }
    }

    @Override // l93.k0, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerDetach");
        this.f218169h.mo146xb9724478(this);
        this.f218168g.f215262y = false;
        super.b();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        boolean z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "startAnimateToTopAreaWithView workListener onDrawerOpen isOpen:" + z17 + " isBegin:" + z18);
        if (z17 || z18) {
            z19 = true;
        } else {
            this.f218169h.mo146xb9724478(this);
            z19 = false;
        }
        this.f218168g.f215262y = z19;
    }
}
