package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a f188428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188430f;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f188428d = c15268x6a41bd8a;
        this.f188429e = i17;
        this.f188430f = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a = this.f188428d;
        if (c15268x6a41bd8a.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() == 4 || c15268x6a41bd8a.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() == 10001 || c15268x6a41bd8a.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() == 5 || (i17 = this.f188429e) <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188430f;
        if (i17 < a7Var.f187743g.h()) {
            yw2.a0 a0Var = a7Var.f187749o;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (a0Var == null || (m82555x4905e9fa = a0Var.s().m82555x4905e9fa()) == null) ? null : m82555x4905e9fa.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$8", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$8", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
