package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class h2 extends xm3.t0 {
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.g2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe mvvmList, in5.s itemConvertFactory, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.g2 g2Var) {
        super(mvvmList, itemConvertFactory, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        this.K = g2Var;
    }

    @Override // xm3.t0, xm3.m0
    public void k(xm3.o0 pendingData) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pendingData, "pendingData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.g2 g2Var = this.K;
        if (g2Var != null) {
            g2Var.a3(pendingData);
        }
        super.k(pendingData);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.g2 g2Var2 = this.K;
        if (g2Var2 != null) {
            g2Var2.B2(pendingData);
        }
        java.util.Iterator it = pendingData.f536899c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xm3.b bVar = (xm3.b) obj;
            if (bVar.f536820a == xm3.c.f536829d && bVar.f536821b == 0 && bVar.f536822c > 0) {
                break;
            }
        }
        if (((xm3.b) obj) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((zc4.b) pendingData.f536897a.get(0)).n().m125483x6bf53a6c(), c01.z1.r())) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = b0().getLayoutManager();
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            } else if (layoutManager != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(layoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(layoutManager, "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
    }
}
