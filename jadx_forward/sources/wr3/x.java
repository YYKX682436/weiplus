package wr3;

/* loaded from: classes11.dex */
public final class x implements as3.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16898x9edd2407 f530445a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16898x9edd2407 c16898x9edd2407) {
        this.f530445a = c16898x9edd2407;
    }

    @Override // as3.s
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16898x9edd2407 c16898x9edd2407 = this.f530445a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = c16898x9edd2407.f235948h;
        if (m0Var != null) {
            m0Var.l(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda J0 = c16898x9edd2407.J0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
