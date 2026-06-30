package ab2;

/* loaded from: classes.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f84329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f84331f;

    public x(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        this.f84329d = c1163xf1deaba4;
        this.f84330e = i17;
        this.f84331f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f84329d.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f84331f));
        arrayList.add(java.lang.Integer.valueOf(this.f84330e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1161x57298f5d, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1161x57298f5d.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1161x57298f5d, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
