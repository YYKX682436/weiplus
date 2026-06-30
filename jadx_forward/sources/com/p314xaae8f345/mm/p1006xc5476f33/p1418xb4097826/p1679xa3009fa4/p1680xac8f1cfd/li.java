package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class li implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi f216599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f216600e;

    public li(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f216599d = giVar;
        this.f216600e = blVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$buildTab$1$1$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = 1;
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar = this.f216599d;
            int i18 = giVar.f216058b;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f216600e.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 W6 = nyVar != null ? nyVar.W6(giVar.f216058b) : null;
            int i19 = giVar.f216068l.f216168a == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fi.f215939e ? 1 : 0;
            if (W6 != null) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                int i27 = 2;
                jz5.l lVar = new jz5.l("finder_tab_context_id", W6.m75945x2fec8307(2));
                jz5.l lVar2 = new jz5.l("finder_context_id", W6.m75945x2fec8307(1));
                jz5.l lVar3 = new jz5.l("comment_scene", java.lang.Integer.valueOf(W6.m75939xb282bd08(5)));
                if (i18 != 1) {
                    i27 = 3;
                    if (i18 != 3) {
                        if (i18 != 4) {
                            i17 = 0;
                        }
                        ((cy1.a) rVar).Bj("finder_timeline_tab", "view_clk", kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("finder_tab_type", java.lang.Integer.valueOf(i17)), new jz5.l("finder_tab_clk_state", java.lang.Integer.valueOf(i19))), 1, false);
                    }
                }
                i17 = i27;
                ((cy1.a) rVar).Bj("finder_timeline_tab", "view_clk", kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("finder_tab_type", java.lang.Integer.valueOf(i17)), new jz5.l("finder_tab_clk_state", java.lang.Integer.valueOf(i19))), 1, false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$buildTab$1$1$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
