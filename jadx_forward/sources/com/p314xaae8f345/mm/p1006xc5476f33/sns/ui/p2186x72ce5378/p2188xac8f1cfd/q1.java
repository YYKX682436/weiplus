package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class q1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e f250507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f250508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f250509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f250510g;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f250507d = c18232x7592f55e;
        this.f250508e = i17;
        this.f250509f = i18;
        this.f250510g = f0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e = this.f250507d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18272x4f831cab m70930xfd37656d = c18232x7592f55e.m70930xfd37656d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        int i17 = this.f250509f;
        arrayList.add(java.lang.Integer.valueOf(i17));
        int i18 = this.f250508e;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m70930xfd37656d, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$restoreRecyclerViewPosition$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int i19 = 0;
        m70930xfd37656d.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(m70930xfd37656d, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$restoreRecyclerViewPosition$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int w17 = c18232x7592f55e.m70930xfd37656d().w();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c18232x7592f55e.m70934x2b98e6a2().p0(i18);
        if (p07 != null && (view = p07.f3639x46306858) != null) {
            i19 = view.getTop();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resume recyclerView position:");
        sb6.append(i18);
        sb6.append(" offset:");
        sb6.append(i17);
        sb6.append(" nowPos:");
        sb6.append(w17);
        sb6.append(" nowOffset:");
        sb6.append(i19);
        sb6.append(" index:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f250510g;
        int i27 = f0Var.f391649d;
        f0Var.f391649d = i27 + 1;
        sb6.append(i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.MainUIC", sb6.toString());
        if ((w17 == i18 && i19 == i17) || f0Var.f391649d >= 10) {
            c18232x7592f55e.m70934x2b98e6a2().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(c18232x7592f55e.m80379x76847179())) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1");
                return;
            }
            pm0.v.V(200L, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p1(c18232x7592f55e));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1");
    }
}
