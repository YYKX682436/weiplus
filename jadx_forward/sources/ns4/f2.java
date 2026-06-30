package ns4;

/* loaded from: classes2.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f421053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f421054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f421055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f421056g;

    public f2(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, android.view.View view, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        this.f421053d = c19786x6a1e2862;
        this.f421054e = view;
        this.f421055f = z17;
        this.f421056g = activityC19067xb53aa1de;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$refreshAnnouncement$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click announcement, ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = this.f421053d;
        sb6.append(info.m76501xf2fd2296());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_INCOME_ANNOUNCEMENT_CLICK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.view.View view2 = this.f421054e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$refreshAnnouncement$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$refreshAnnouncement$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f421055f) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de context = this.f421056g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(info);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$refreshAnnouncement$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
