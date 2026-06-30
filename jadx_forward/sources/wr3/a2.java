package wr3;

/* loaded from: classes11.dex */
public final class a2 implements as3.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac f530291a;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac c16903x22327ac) {
        this.f530291a = c16903x22327ac;
    }

    @Override // as3.s
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac c16903x22327ac = this.f530291a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = c16903x22327ac.f235948h;
        if (m0Var != null) {
            m0Var.l(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda q07 = c16903x22327ac.q0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(q07, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        q07.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(q07, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
