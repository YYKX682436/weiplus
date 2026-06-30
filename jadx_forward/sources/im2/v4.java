package im2;

/* loaded from: classes2.dex */
public final class v4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.o8 {

    /* renamed from: d, reason: collision with root package name */
    public static int f374115d;

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f374116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public void O6(int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, boolean z17) {
        f374115d = i17;
        f374116e = c19786x6a1e2862;
        if (c19786x6a1e2862 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e = c19786x6a1e2862.m76505xea668b3e();
            java.lang.String m77174x10fbdaef = m76505xea668b3e != null ? m76505xea668b3e.m77174x10fbdaef() : null;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e2 = c19786x6a1e2862.m76505xea668b3e();
            java.lang.String m77188xfb83cc9b = m76505xea668b3e2 != null ? m76505xea668b3e2.m77188xfb83cc9b() : null;
            if (m77174x10fbdaef != null && m77188xfb83cc9b != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).P4("", m77174x10fbdaef, m77188xfb83cc9b, 0);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSelfUIC", "flag:" + i17 + ", isFromCache:" + z17);
        if (!z17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SELF_UI_SHOW_ORDER_INT_SYNC, java.lang.Integer.valueOf(i17));
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.hpr);
        if (mo144222x4ff8c0f0 != null) {
            if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f85011l).mo141623x754a37bb()).r()).intValue() == 1 && f374115d == 1 && f374116e != null)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(ILcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(ILcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo144222x4ff8c0f0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(ILcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(ILcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setOnClickListener(new im2.u4(this, c19786x6a1e2862));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ae2.b2 b2Var = ae2.b2.f84994a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.T).mo141623x754a37bb()).r()).intValue() == 1) {
            f374115d = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SELF_UI_SHOW_ORDER_INT_SYNC, 0);
        }
        O6(f374115d, f374116e, true);
    }
}
