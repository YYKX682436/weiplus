package bt2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt2.c f105711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f105712e;

    public b(bt2.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        this.f105711d = cVar;
        this.f105712e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        dt2.d0 uiClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/shopping/FinderLiveShoppingReplayDecorateUIC$initPlugins$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bt2.c cVar = this.f105711d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) cVar.c(mm2.c1.class)).f410379n;
        if (c19792x256d2725 != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c19792x256d2725.m76836x6c03c64c(), xy2.c.e(cVar.f530625b))) {
                i95.m c17 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.ub ubVar = (c61.ub) c17;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = cVar.f530625b;
                long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
                java.lang.String str = m76803x6c285d75 == null ? "" : m76803x6c285d75;
                r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                if (m76794xd0557130 == null) {
                    m76794xd0557130 = new r45.nw1();
                }
                c61.ub.Rf(ubVar, activityC0065xcd7aa112, m76784x5db1b11, str, m76794xd0557130, null, null, null, null, c19792x256d2725.m76829x97edf6c0(), null, null, 1776, null);
            } else {
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, "");
                wk0Var.set(1, "");
                wk0Var.set(2, java.lang.Boolean.FALSE);
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, -1);
                wk0Var.set(6, null);
                ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(cVar.f530625b, null, kz5.b0.c(c19792x256d2725), 0, wk0Var, null);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(cVar.f105713d, "gotoFinderLive error finderObject is null!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar.f530626c;
        if (k0Var != null) {
            k0Var.m57646xb4098c93();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = this.f105712e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e c14937x9aaf713e = k0Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1620xeb77f168.C14937x9aaf713e) k0Var2 : null;
        if (c14937x9aaf713e != null && (uiClickListener = c14937x9aaf713e.getUiClickListener()) != null) {
            uiClickListener.c(qs5.o.f447989i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/shopping/FinderLiveShoppingReplayDecorateUIC$initPlugins$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
