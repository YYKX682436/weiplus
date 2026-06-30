package st2;

/* loaded from: classes3.dex */
public final class z0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f494044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f494045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f494046f;

    public z0(st2.h1 h1Var, int i17, cm2.m0 m0Var) {
        this.f494044d = h1Var;
        this.f494045e = i17;
        this.f494046f = m0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        st2.h1 h1Var = this.f494044d;
        h1Var.q().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = h1Var.q().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int i17 = this.f494045e;
        if (c1162x665295de != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showProductList$2", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showProductList$2", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        h1Var.f493866d.postDelayed(new st2.y0(this.f494046f, i17, h1Var), 300L);
    }
}
