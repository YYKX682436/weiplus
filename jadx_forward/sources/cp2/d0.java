package cp2;

/* loaded from: classes.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f302315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f302317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f302318g;

    public d0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18, cp2.v0 v0Var) {
        this.f302315d = layoutManager;
        this.f302316e = i17;
        this.f302317f = i18;
        this.f302318g = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) this.f302315d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f302317f));
        arrayList.add(java.lang.Integer.valueOf(this.f302316e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1164x587b7ff1.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        this.f302318g.f(false, "IInitDone");
    }
}
