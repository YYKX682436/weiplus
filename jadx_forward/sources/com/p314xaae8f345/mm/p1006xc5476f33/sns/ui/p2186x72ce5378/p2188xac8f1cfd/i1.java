package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class i1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e f250447d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e) {
        this.f250447d = c18232x7592f55e;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleToolBarDoubleClick$1$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.MainUIC", "changeToNormalData onGlobalLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e = this.f250447d;
        c18232x7592f55e.m70934x2b98e6a2().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc m70934x2b98e6a2 = c18232x7592f55e.m70934x2b98e6a2();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m70934x2b98e6a2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$handleToolBarDoubleClick$1$1", "onGlobalLayout", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        m70934x2b98e6a2.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m70934x2b98e6a2, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$handleToolBarDoubleClick$1$1", "onGlobalLayout", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleToolBarDoubleClick$1$1");
    }
}
