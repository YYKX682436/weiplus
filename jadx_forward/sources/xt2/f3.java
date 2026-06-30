package xt2;

/* loaded from: classes2.dex */
public final class f3 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f538274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f538275e;

    public f3(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, xt2.r3 r3Var) {
        this.f538274d = c22789xd23e9a9b;
        this.f538275e = r3Var;
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f538274d.setVisibility(0);
        android.view.View view = this.f538275e.f538519i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCartAnimWidget$cartAnimPag$1$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCartAnimWidget$cartAnimPag$1$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f538274d.setVisibility(4);
        android.view.View view = this.f538275e.f538519i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCartAnimWidget$cartAnimPag$1$1", "onAnimationEnd", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCartAnimWidget$cartAnimPag$1$1", "onAnimationEnd", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
