package sb2;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb2.i f486946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sb2.i iVar) {
        super(1);
        this.f486946d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Boolean bool;
        android.content.Context context;
        android.view.Window window;
        x4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31 c15310x1d9feb31;
        jz5.f0 it = (jz5.f0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        sb2.i iVar = this.f486946d;
        tc2.g gVar = iVar.f498674d;
        in5.r rVar = gVar.f498683m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = rVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf) rVar : null;
        in5.s0 s0Var = gVar.f498682i;
        if (s0Var == null || (c15310x1d9feb31 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31) s0Var.p(com.p314xaae8f345.mm.R.id.f566143ti1)) == null) {
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(c15310x1d9feb31.M || c15310x1d9feb31.N);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToStartGuideTimer showAnimGuide tabType=");
        sb6.append(zfVar != null ? java.lang.Integer.valueOf(zfVar.f185893h) : null);
        sb6.append(" isSliding=");
        sb6.append(bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", sb6.toString());
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "in sliding");
        } else {
            if (zfVar != null && zfVar.f185893h == 4) {
                tc2.g gVar2 = iVar.f498674d;
                in5.s0 s0Var2 = gVar2.f498682i;
                if (s0Var2 != null && (context = s0Var2.f374654e) != null) {
                    iVar.Y6();
                    android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
                    in5.s0 s0Var3 = gVar2.f498682i;
                    android.view.View h17 = (s0Var3 == null || (aVar = s0Var3.f374656g) == null) ? null : aVar.h();
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_j, h17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) h17 : null, false);
                    iVar.f486949g = viewGroup;
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = viewGroup != null ? (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v6p) : null;
                    if (c22789xd23e9a9b != null) {
                        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544837d2));
                    }
                    if (c22789xd23e9a9b != null) {
                        c22789xd23e9a9b.m82582x3ae760af(0.0d);
                    }
                    if (c22789xd23e9a9b != null) {
                        c22789xd23e9a9b.m82583xcde73672(-1);
                    }
                    if (c22789xd23e9a9b != null && c22789xd23e9a9b.getUseRfx()) {
                        if (c22789xd23e9a9b != null) {
                            c22789xd23e9a9b.mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(context.getAssets(), "finder_live_slide_to_enter_anim_tip.pag"));
                        }
                    } else if (c22789xd23e9a9b != null) {
                        c22789xd23e9a9b.mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154715x243906(context.getAssets(), "finder_live_slide_to_enter_anim_tip.pag"));
                    }
                    if (c22789xd23e9a9b != null) {
                        c22789xd23e9a9b.g();
                    }
                    android.view.ViewGroup viewGroup2 = iVar.f486949g;
                    if (viewGroup2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(viewGroup2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(java.lang.Integer.valueOf(intValue));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(viewGroup2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController", "showAnimGuide", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        viewGroup2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(viewGroup2, "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController", "showAnimGuide", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(viewGroup2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.ViewGroup viewGroup3 = iVar.f486949g;
                    if (viewGroup3 != null) {
                        viewGroup3.setOnTouchListener(new sb2.d(c22789xd23e9a9b, iVar));
                    }
                    android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                    android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                    android.view.ViewGroup viewGroup4 = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                    if (viewGroup4 != null) {
                        iVar.Z6(false);
                        viewGroup4.addView(iVar.f486949g);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "showGuide guideTipView=" + iVar.f486949g);
                }
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_SHOW_SLIDE_TO_ENTER_BOOLEAN_SYNC, bool2);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = iVar.f486948f;
                if (b4Var != null) {
                    b4Var.d();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "startHideTimer");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("HideSlideToCloseTip::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new sb2.e(iVar), false);
                iVar.f486948f = b4Var2;
                b4Var2.c(5000L, 5000L);
            }
        }
        return jz5.f0.f384359a;
    }
}
