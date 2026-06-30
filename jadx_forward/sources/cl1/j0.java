package cl1;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f124416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 f124417e;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f124417e = abstractGestureDetectorOnGestureListenerC12768x381d68c7;
        this.f124416d = k3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f124416d;
        if (k3Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7 = this.f124417e;
        int i17 = abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172642m;
        int m8183xf806b362 = k3Var.m8183xf806b362();
        if (m8183xf806b362 >= 0 || i17 >= 0) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            boolean z17 = false;
            objArr[0] = java.lang.Boolean.valueOf(abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172641i != k3Var);
            objArr[1] = java.lang.Boolean.valueOf(((dl1.f) abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172638f).c(abstractGestureDetectorOnGestureListenerC12768x381d68c7.m53368x4905e9fa(), abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172641i, this.f124416d, i17, m8183xf806b362));
            objArr[2] = java.lang.Integer.valueOf(i17);
            objArr[3] = java.lang.Integer.valueOf(m8183xf806b362);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "move run %b, onMove: %b, from: %d, to: %d", objArr);
            if (abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172641i != k3Var) {
                if (((dl1.f) abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172638f).c(abstractGestureDetectorOnGestureListenerC12768x381d68c7.m53368x4905e9fa(), abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172641i, this.f124416d, i17, m8183xf806b362)) {
                    dl1.c cVar = abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172638f;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m53368x4905e9fa = abstractGestureDetectorOnGestureListenerC12768x381d68c7.m53368x4905e9fa();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172641i;
                    dl1.f fVar = (dl1.f) cVar;
                    fVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ItemMoveHelper", "[onMoved] position:" + k3Var2.m8183xf806b362() + " target:" + k3Var.m8183xf806b362());
                    java.util.List list = fVar.f316712c;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ItemMoveHelper", "onMoved mList: %d", java.lang.Integer.valueOf(list.hashCode()));
                    if (i17 >= 0 && i17 < list.size() && m8183xf806b362 >= 0 && m8183xf806b362 < list.size()) {
                        if (i17 < m8183xf806b362) {
                            int i18 = i17;
                            while (i18 < m8183xf806b362) {
                                int i19 = i18 + 1;
                                java.util.Collections.swap(list, i18, i19);
                                i18 = i19;
                            }
                        } else {
                            int i27 = i17;
                            while (i27 > m8183xf806b362) {
                                int i28 = i27 - 1;
                                java.util.Collections.swap(list, i27, i28);
                                i27 = i28;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ItemMoveHelper", "onMoved end mList: %d", java.lang.Integer.valueOf(list.hashCode()));
                        m53368x4905e9fa.mo7946xf939df19().m8150x87567217(i17, m8183xf806b362);
                        if (fVar.f316715f != null) {
                            fVar.f316717h = m8183xf806b362;
                        }
                        m53368x4905e9fa.mo7946xf939df19().m8152xc67946d3(0, m53368x4905e9fa.mo7946xf939df19().mo1894x7e414b06(), java.lang.Boolean.TRUE);
                        z17 = true;
                    }
                    if (z17) {
                        abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172642m = m8183xf806b362;
                    }
                }
            }
        }
    }
}
