package n20;

/* loaded from: classes9.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 f415764d;

    public o(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 c10554x8fea218) {
        this.f415764d = c10554x8fea218;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 c10554x8fea218 = this.f415764d;
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(c10554x8fea218.getContext());
        int b18 = c10554x8fea218._naviHeight + b17.x + i65.a.b(c10554x8fea218.getContext(), 24);
        em.e0 e0Var = c10554x8fea218.vb;
        int height = b18 + e0Var.h().getHeight() + i65.a.b(c10554x8fea218.getContext(), 20) + e0Var.g().getHeight() + (i65.a.b(c10554x8fea218.getContext(), 16) * 2) + e0Var.e().getHeight() + i65.a.b(c10554x8fea218.getContext(), 42) + i65.a.b(c10554x8fea218.getContext(), 20);
        if (height < b17.y) {
            android.view.ViewGroup.LayoutParams layoutParams = e0Var.d().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = 0;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = e0Var.d().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = c10554x8fea218._naviHeight;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = e0Var.h().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = i65.a.b(c10554x8fea218.getContext(), 24);
            }
            android.view.ViewGroup.LayoutParams layoutParams4 = e0Var.f().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.topMargin = i65.a.b(c10554x8fea218.getContext(), 20);
            }
            android.view.ViewGroup.LayoutParams layoutParams5 = e0Var.e().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams5 != null) {
                marginLayoutParams5.bottomMargin = i65.a.b(c10554x8fea218.getContext(), 42);
            }
            android.widget.FrameLayout f17 = e0Var.f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getProductInfoContainer(...)");
            int b19 = i65.a.b(c10554x8fea218.getContext(), 16);
            f17.setPadding(b19, b19, b19, b19);
            b30.z zVar = b30.z.f99121a;
            android.view.View b27 = e0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b27, "getBgNavi(...)");
            zVar.c(b27);
            android.view.View c17 = e0Var.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBgNaviCart(...)");
            zVar.c(c17);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams6 = e0Var.d().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams6 : null;
        if (marginLayoutParams6 != null) {
            marginLayoutParams6.topMargin = 0;
        }
        android.view.View b28 = e0Var.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b28, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b28, arrayList2.toArray(), "com/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedProductViewV3", "smallScreenAdapt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b28.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b28, "com/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedProductViewV3", "smallScreenAdapt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b28, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View c18 = e0Var.c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c18, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(c18, arrayList4.toArray(), "com/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedProductViewV3", "smallScreenAdapt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(c18, "com/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedProductViewV3", "smallScreenAdapt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c18, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = height - c10554x8fea218._naviHeight;
        int b29 = i65.a.b(c10554x8fea218.getContext(), 24) + i65.a.b(c10554x8fea218.getContext(), 20) + (i65.a.b(c10554x8fea218.getContext(), 16) * 2) + i65.a.b(c10554x8fea218.getContext(), 42);
        int i18 = ((b17.y - i17) + b29) / b29;
        float f18 = i18 > 1 ? 1.0f : ((double) i18) < 0.5d ? 0.5f : i18;
        android.view.ViewGroup.LayoutParams layoutParams7 = e0Var.d().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams7 : null;
        if (marginLayoutParams7 != null) {
            marginLayoutParams7.height = 0;
        }
        android.view.ViewGroup.LayoutParams layoutParams8 = e0Var.h().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams8 : null;
        if (marginLayoutParams8 != null) {
            marginLayoutParams8.topMargin = (int) (i65.a.b(c10554x8fea218.getContext(), 24) * f18);
        }
        android.view.ViewGroup.LayoutParams layoutParams9 = e0Var.f().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams9 : null;
        if (marginLayoutParams9 != null) {
            marginLayoutParams9.topMargin = (int) (i65.a.b(c10554x8fea218.getContext(), 20) * f18);
        }
        android.view.ViewGroup.LayoutParams layoutParams10 = e0Var.e().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams10 : null;
        if (marginLayoutParams10 != null) {
            marginLayoutParams10.bottomMargin = (int) (i65.a.b(c10554x8fea218.getContext(), 42) * f18);
        }
        android.widget.FrameLayout f19 = e0Var.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f19, "getProductInfoContainer(...)");
        int b37 = (int) (f18 * i65.a.b(c10554x8fea218.getContext(), 16));
        f19.setPadding(b37, b37, b37, b37);
        if (i18 >= 0.5f) {
            return;
        }
        float f27 = b17.x + (b17.y - (i17 - (b29 * 0.5f)));
        android.view.ViewGroup.LayoutParams layoutParams11 = e0Var.d().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
        if (marginLayoutParams11 != null) {
            marginLayoutParams11.height = (int) f27;
        }
        e0Var.d().getClass();
    }
}
