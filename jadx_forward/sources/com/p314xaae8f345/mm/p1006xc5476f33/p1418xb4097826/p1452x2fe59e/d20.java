package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class d20 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f188070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20 f188071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20 j20Var) {
        super(1);
        this.f188070d = abstractActivityC21394xb3d2c0cf;
        this.f188071e = j20Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent ev6 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f188070d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) ((nr2.l) pf5.z.f435481a.a(activity).a(nr2.l.class)).P6().findViewById(com.p314xaae8f345.mm.R.id.l3n);
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) (c2678xa407981c != null ? c2678xa407981c.getLayoutParams() : null);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior behavior = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior) (cVar != null ? cVar.f92539a : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20 j20Var = this.f188071e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = j20Var.f187957g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = i0Var != null ? i0Var.m56068x4905e9fa() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m56068x4905e9fa, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56068x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c13728x20aad6ea.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = j20Var.f188103t;
        boolean z17 = abstractC13919x46aff122 != null && (abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13815x90ca5827) && c1162x665295de.t() != -1 && (abstractC13919x46aff122.m56388xcaeb60d0().get(c1162x665295de.t()) instanceof nr2.a);
        if ((ev6.getAction() == 0 && z17) || j20Var.f188605J) {
            float y17 = ev6.getY() - j20Var.K;
            j20Var.K = ev6.getY();
            int action = ev6.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            c13728x20aad6ea.requestDisallowInterceptTouchEvent(false);
                        }
                    } else if (y17 < 0.0f) {
                        c13728x20aad6ea.requestDisallowInterceptTouchEvent(true);
                    } else {
                        if ((behavior != null ? behavior.y() : 0) < 0) {
                            c13728x20aad6ea.requestDisallowInterceptTouchEvent(true);
                        } else {
                            c13728x20aad6ea.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
                c13728x20aad6ea.requestDisallowInterceptTouchEvent(false);
                c13728x20aad6ea.f1();
                c13728x20aad6ea.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c20(c13728x20aad6ea, c1162x665295de));
                j20Var.f188605J = false;
            } else {
                j20Var.f188605J = true;
                c13728x20aad6ea.requestDisallowInterceptTouchEvent(true);
            }
        } else {
            c13728x20aad6ea.requestDisallowInterceptTouchEvent(false);
        }
        return java.lang.Boolean.FALSE;
    }
}
