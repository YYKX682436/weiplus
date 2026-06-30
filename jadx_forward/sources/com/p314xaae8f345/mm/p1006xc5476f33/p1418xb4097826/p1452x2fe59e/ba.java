package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ba extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa f187903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f187904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f187905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122, int i17) {
        super(0);
        this.f187903d = oaVar;
        this.f187904e = abstractC13919x46aff122;
        this.f187905f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f187903d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = oaVar.f188690f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (a1Var == null || (m56022x4905e9fa3 = a1Var.m56022x4905e9fa()) == null) ? null : m56022x4905e9fa3.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
        ey2.o0 o0Var = oaVar.f190162o;
        if (o0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = oaVar.f188690f;
            if (a1Var2 != null && (m56022x4905e9fa2 = a1Var2.m56022x4905e9fa()) != null) {
                f2Var = m56022x4905e9fa2.mo7946xf939df19();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f2Var, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            int a07 = ((in5.n0) f2Var).a0() + o0Var.f338978e;
            int i17 = o0Var.f338979f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187904e.getF204960d(), "TimelineInit initdone canTimelineRefresh tabType=" + this.f187905f + ' ' + oaVar.f190161n + " lastPos:" + a07 + " fromTopPixel:" + i17);
            if (a07 > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(a07));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$2$1$call$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                c1164x587b7ff1.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$2$1$call$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = oaVar.f188690f;
                if (a1Var3 != null && (m56022x4905e9fa = a1Var3.m56022x4905e9fa()) != null) {
                    m56022x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.aa(c1164x587b7ff1, a07, i17));
                }
            }
            ym5.s3 s3Var = (ym5.s3) oaVar.f190165r.get(oaVar.B());
            if (s3Var != null && !s3Var.f545054f) {
                oaVar.z(s3Var, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
