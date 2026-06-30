package cr2;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f303403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f303405f;

    public o(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        this.f303403d = layoutManager;
        this.f303404e = i17;
        this.f303405f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) this.f303403d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f303405f));
        arrayList.add(java.lang.Integer.valueOf(this.f303404e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/fragment/LiveThemeFragmentViewCallback$loadCacheData$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1164x587b7ff1.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/nearby/ui/special/fragment/LiveThemeFragmentViewCallback$loadCacheData$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
