package df2;

/* loaded from: classes3.dex */
public final class k4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.l4 f312087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(df2.l4 l4Var) {
        super(1);
        this.f312087d = l4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        android.view.View view;
        jz5.f0 it = (jz5.f0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer showAnimGuide");
        df2.l4 l4Var = this.f312087d;
        android.view.View T6 = l4Var.T6(com.p314xaae8f345.mm.R.id.tow, com.p314xaae8f345.mm.R.id.tou);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = T6 != null ? (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) T6.findViewById(com.p314xaae8f345.mm.R.id.v6q) : null;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.o(true);
        }
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.m82582x3ae760af(0.0d);
        }
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.m82583xcde73672(-1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(l4Var, null, null, new df2.f4(c22789xd23e9a9b2, l4Var, null), 3, null);
        if (T6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            i17 = 1;
            c22789xd23e9a9b = c22789xd23e9a9b2;
            view = T6;
            yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController", "showAnimGuide", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController", "showAnimGuide", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            i17 = 1;
            c22789xd23e9a9b = c22789xd23e9a9b2;
            view = T6;
        }
        if (view != null) {
            view.setOnTouchListener(new df2.g4(c22789xd23e9a9b, l4Var, view));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "showGuide guideTipView=" + view);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_LAST_SHOWN_MS_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_SHOWN_TIMES_INT_SYNC;
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + i17));
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportSwipeToCloseGuideExposed json:" + jSONObject);
        ml2.r0.hj(r0Var, ml2.b4.K2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = l4Var.f312166q;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "startHideTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("HideSlideToCloseTip::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new df2.h4(l4Var), false);
        l4Var.f312166q = b4Var2;
        b4Var2.c(5000L, 5000L);
        return jz5.f0.f384359a;
    }
}
