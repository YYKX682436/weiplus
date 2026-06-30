package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lcom/tencent/mm/plugin/sns/ui/improve/component/f2;", "j2", "Ljz5/g;", "getUic", "()Lcom/tencent/mm/plugin/sns/ui/improve/component/f2;", "uic", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView */
/* loaded from: classes4.dex */
public class C18275x32e752fc extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g uic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18275x32e752fc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.uic = jz5.h.b(new bd4.a1(this));
    }

    /* renamed from: getUic */
    private final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 m71027xb5887519() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUic", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2) this.uic.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUic", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        return f2Var;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void a1(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        super.a1(i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Improve.RecyclerView", "scrollToPosition:" + i17, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
    }

    public final void g1(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.RecyclerView", "safeForceScrollToPosition position:" + i17 + " offset:" + i18 + " retry:" + i19);
        if (i19 >= 20) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView", "safeForceScrollToPosition", "(III)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView", "safeForceScrollToPosition", "(III)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        addOnLayoutChangeListener(new bd4.x0(c1162x665295de, i17, i18));
        getViewTreeObserver().addOnGlobalLayoutListener(new bd4.z0(this, i17, i18, i19));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        xc4.p n17;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewAdded", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        super.onViewAdded(view);
        if (view == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewAdded", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 m71027xb5887519 = m71027xb5887519();
        m71027xb5887519.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        if (view instanceof kc4.a) {
            kc4.a aVar = (kc4.a) view;
            xc4.p mo70843xc3665610 = aVar.mo70843xc3665610();
            if (mo70843xc3665610 != null && mo70843xc3665610.mo133058x3172ed()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                xc4.p mo70843xc36656102 = aVar.mo70843xc3665610();
                if (mo70843xc36656102 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                } else if (mo70843xc36656102.mo133058x3172ed()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OldVersionUIC", "adExposeReport");
                    int j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.j(mo70843xc36656102.c1());
                    i64.b1 b1Var = m71027xb5887519.f250327d;
                    int mo70842xa86cd69f = aVar.mo70842xa86cd69f();
                    java.lang.String W0 = mo70843xc36656102.W0();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExposures", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    boolean z17 = (mo70843xc36656102.m125476xb79116c1() & 128) > 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExposures", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    b1Var.n(mo70842xa86cd69f, W0, z17, (android.view.View) aVar, mo70843xc36656102.y0(), mo70843xc36656102.d1(), j17, 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OldVersionUIC", "ad expose error,view hash:" + view.hashCode() + " info:" + aVar.mo70843xc3665610());
                i64.u1.a(209, 1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            }
        } else {
            if (view instanceof tc4.s0) {
                try {
                    zc4.b mo70841xad4bb233 = ((tc4.s0) view).mo70841xad4bb233();
                    if (mo70841xad4bb233 != null && (n17 = mo70841xad4bb233.n()) != null) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = n17.h1();
                        if ((h17 == null || (a90Var = h17.f39014x86965dde) == null || a90Var.f451370e != 3) ? false : true) {
                            java.util.HashMap hashMap = m71027xb5887519.f250333m;
                            if (!hashMap.containsKey(java.lang.Long.valueOf(n17.y0()))) {
                                hashMap.put(java.lang.Long.valueOf(n17.y0()), n17);
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("MicroMsg.OldVersionUIC", th6);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewAdded", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        xc4.p n17;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRemoved", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        super.onViewRemoved(view);
        if (view == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRemoved", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 m71027xb5887519 = m71027xb5887519();
        m71027xb5887519.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        if (view instanceof kc4.a) {
            kc4.a aVar = (kc4.a) view;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            xc4.p mo70843xc3665610 = aVar.mo70843xc3665610();
            if (mo70843xc3665610 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            } else if (mo70843xc3665610.mo133058x3172ed()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OldVersionUIC", "adHideReport");
                m71027xb5887519.f250327d.o(aVar.mo70842xa86cd69f(), mo70843xc3665610.W0(), mo70843xc3665610.y0(), 1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            }
        } else if (view instanceof tc4.s0) {
            try {
                zc4.b mo70841xad4bb233 = ((tc4.s0) view).mo70841xad4bb233();
                if (mo70841xad4bb233 != null && (n17 = mo70841xad4bb233.n()) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = n17.c1();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = n17.h1();
                    if ((h17 == null || (a90Var = h17.f39014x86965dde) == null || a90Var.f451370e != 3) ? false : true) {
                        java.util.HashMap hashMap = m71027xb5887519.f250333m;
                        if (hashMap.containsKey(java.lang.Long.valueOf(n17.y0()))) {
                            hashMap.remove(java.lang.Long.valueOf(n17.y0()));
                            com.p314xaae8f345.mm.p959x883644fd.k0.k(com.p314xaae8f345.mm.p959x883644fd.j0.Sns, n17.h1().f39040xbd345fc4, c17.m70350x13c652ad(), ca4.z0.t0(n17.y0()), c17);
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            } catch (java.lang.Throwable th6) {
                ca4.q.c("MicroMsg.OldVersionUIC", th6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRemoved", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRemoved", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18275x32e752fc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.uic = jz5.h.b(new bd4.a1(this));
    }
}
