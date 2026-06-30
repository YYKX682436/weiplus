package bd4;

/* loaded from: classes2.dex */
public final class x0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f100941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100943f;

    public x0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, int i17, int i18) {
        this.f100941d = c1162x665295de;
        this.f100942e = i17;
        this.f100943f = i18;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChange", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$$inlined$doOnNextLayout$1");
        view.removeOnLayoutChangeListener(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f100941d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f100943f));
        arrayList.add(java.lang.Integer.valueOf(this.f100942e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView$safeForceScrollToPosition$$inlined$doOnNextLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView$safeForceScrollToPosition$$inlined$doOnNextLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$$inlined$doOnNextLayout$1");
    }
}
