package ab2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c f84322d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c c13680xb1b3046c) {
        this.f84322d = c13680xb1b3046c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c.M;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c c13680xb1b3046c = this.f84322d;
        c13680xb1b3046c.N0("channel_profile_recentviewed", 1, 2);
        android.view.View K0 = c13680xb1b3046c.K0();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(K0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i18 = 0;
        K0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(K0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View L0 = c13680xb1b3046c.L0();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(L0, arrayList3.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        L0.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(L0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c13680xb1b3046c.L = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f H0 = c13680xb1b3046c.H0();
        ab2.s sVar = new ab2.s(c13680xb1b3046c);
        if (H0.f184304g != 0) {
            H0.f184312r = sVar;
            java.util.Iterator it = H0.m56387xe6796cde().iterator();
            while (true) {
                if (!it.hasNext()) {
                    H0.e();
                    break;
                }
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) next;
                if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11() == H0.f184304g) {
                    sVar.mo146xb9724478(java.lang.Integer.valueOf(i18));
                    break;
                }
                i18 = i19;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
