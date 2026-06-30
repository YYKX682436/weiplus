package wr3;

/* loaded from: classes11.dex */
public final class n implements as3.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16896x9c3648e7 f530373a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16896x9c3648e7 c16896x9c3648e7) {
        this.f530373a = c16896x9c3648e7;
    }

    @Override // as3.s
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16896x9c3648e7 c16896x9c3648e7 = this.f530373a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = c16896x9c3648e7.f235948h;
        if (m0Var != null) {
            m0Var.l(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16920x131f5742 J0 = c16896x9c3648e7.J0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabArticleFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabArticleFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
