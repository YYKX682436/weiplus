package ut2;

/* loaded from: classes3.dex */
public final class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f512522d;

    public l4(st2.h1 h1Var) {
        this.f512522d = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        st2.s1 s1Var = this.f512522d.L;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchProductPage");
            throw null;
        }
        android.view.View view2 = s1Var.f493974a;
        if (view2.getVisibility() != 0) {
            s1Var.f493986m = c01.id.c();
        }
        s1Var.e();
        android.view.View view3 = s1Var.f493974a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        st2.h1 h1Var = s1Var.f493975b;
        view2.setTranslationX(h1Var.q().getWidth());
        view2.getLayoutParams().height = h1Var.h().getLayoutParams().height;
        view2.animate().setDuration(300L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationX(0.0f).setListener(new st2.q1(s1Var)).start();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.f408974p0, null, null, null, null, null, 0, 0L, null, null, null, null, false, null, 16376, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
