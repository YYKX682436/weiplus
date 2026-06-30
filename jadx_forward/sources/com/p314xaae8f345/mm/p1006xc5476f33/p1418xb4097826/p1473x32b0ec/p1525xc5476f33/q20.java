package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 f195486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f195487e;

    public q20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 t20Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f195486d = t20Var;
        this.f195487e = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$setClickJump3DDirect$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 t20Var = this.f195486d;
        t20Var.v1();
        t20Var.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f195487e;
        if (c19786x6a1e2862 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.view.ViewGroup viewGroup = t20Var.f446856d;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.l34 l34Var = new r45.l34();
            bf3.x0 x0Var = bf3.x0.f101207a;
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            int i18 = x0Var.a(context2).y;
            android.content.Context context3 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
            int i19 = i18 - com.p314xaae8f345.mm.ui.bk.m((android.app.Activity) context3).bottom;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e = c19786x6a1e2862.m76505xea668b3e();
            int m77179xa2e3235b = m76505xea668b3e != null ? m76505xea668b3e.m77179xa2e3235b() : 0;
            boolean k17 = com.p314xaae8f345.mm.ui.bk.k(viewGroup.getContext());
            if (m77179xa2e3235b > 0) {
                i17 = i65.a.b(viewGroup.getContext(), m77179xa2e3235b) + (k17 ? i19 : 0);
            } else {
                i17 = 544;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t20Var.f195865q, "half_page_custom_height=" + m77179xa2e3235b + " navHeight=" + i19 + " isNavigationBarVisibility=" + k17);
            r45.m34 m34Var = new r45.m34();
            m34Var.set(3, java.lang.Integer.valueOf(i17));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            m34Var.set(0, bool);
            m34Var.set(1, bool);
            m34Var.set(2, java.lang.Boolean.TRUE);
            l34Var.set(2, m34Var);
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534771c = l34Var;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$setClickJump3DDirect$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
