package tn2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn2.d f502354d;

    public c(tn2.d dVar) {
        this.f502354d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        byte[] byteArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd m58245x4ee17f0a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/floatball/FinderMegaVideoMiniViewHelper$generateWindowClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_OPEN_FROM_VIDEO_FLOAT_BALL", true);
        tn2.d dVar = this.f502354d;
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", (dVar.k0().isVideoEnd || (m58245x4ee17f0a = dVar.k0().m58245x4ee17f0a()) == null) ? 0L : m58245x4ee17f0a.mo56685x3d7f3f1d());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd m58245x4ee17f0a2 = dVar.k0().m58245x4ee17f0a();
        intent.putExtra("KEY_VIDEO_PLAY_SPEED_RATIO", m58245x4ee17f0a2 != null ? m58245x4ee17f0a2.getPlaySpeedRatio() : 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = dVar.f174665d;
        synchronized (c12886x91aa2b6d) {
            byteArray = c12886x91aa2b6d.i("KEY_VIDEO_FLOAT_BALL_INFO") ? c12886x91aa2b6d.G.getByteArray("KEY_VIDEO_FLOAT_BALL_INFO") : null;
        }
        r45.yj4 yj4Var = new r45.yj4();
        try {
            yj4Var.mo11468x92b714fd(byteArray);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMegaVideoMiniViewHelper", "handleBallInfoClicked", th6);
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = yj4Var.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCacheNewVideoList(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(h90Var.a(c19792x256d2725, 1));
            p17.t1(true);
            arrayList2.add(p17);
        }
        hc2.e0.b(intent, yj4Var.m75939xb282bd08(2), arrayList2, yj4Var.m75934xbce7f2f(4), null);
        intent.putExtra("KEY_ROUTER_UI", yj4Var.m75939xb282bd08(5));
        intent.putExtra("KEY_VIDEO_FLOAT_BALL_INFO", yj4Var.mo14344x5f01b1f6());
        intent.putExtra("KEY_FLOAT_BALL_TASK_ORDER", dVar.f174665d.f("KEY_FLOAT_BALL_TASK_ORDER", 0));
        intent.putExtra("KEY_FLOAT_BALL_MINI_SESSION_ID", dVar.f174665d.g("KEY_FLOAT_BALL_MINI_SESSION_ID", ""));
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(8, 6, 45, intent);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Ak((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, context, intent, true, false, 8, null);
        java.lang.String g17 = dVar.f174665d.g("KEY_FLOAT_BALL_MINI_SESSION_ID", "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206882a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) kz5.n0.Z(arrayList2);
        java.lang.String u17 = pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6734xb7e5046e c6734xb7e5046e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6734xb7e5046e();
        c6734xb7e5046e.f140690d = 1;
        c6734xb7e5046e.f140691e = 1L;
        c6734xb7e5046e.f140692f = c6734xb7e5046e.b("MiniSessionId", g17, true);
        c6734xb7e5046e.f140693g = 0;
        c6734xb7e5046e.f140694h = c6734xb7e5046e.b("LongVideoId", u17, true);
        c6734xb7e5046e.f140695i = c6734xb7e5046e.b("sessionid", "", true);
        c6734xb7e5046e.f140696j = c6734xb7e5046e.b("contextid", Bj, true);
        c6734xb7e5046e.f140697k = c6734xb7e5046e.b("ClickTabContextId", "", true);
        c6734xb7e5046e.f140698l = 1L;
        c6734xb7e5046e.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6734xb7e5046e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/floatball/FinderMegaVideoMiniViewHelper$generateWindowClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
