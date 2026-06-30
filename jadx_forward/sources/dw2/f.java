package dw2;

/* loaded from: classes2.dex */
public final class f implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dw2.o f325652a;

    public f(dw2.o oVar) {
        this.f325652a = oVar;
    }

    @Override // gc2.c
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        dw2.o oVar = this.f325652a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f325669a, "handleOnPageSelected position:" + i17);
        kz2.c cVar = oVar.f325678j;
        cVar.a("handleOnPageSelected begin");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        java.util.List m82898xfb7e5820 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19).m82898xfb7e5820();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 j17 = oVar.j(i17, null);
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(oVar.f325669a, "handleOnPageSelected return for valid feed.");
            return;
        }
        if (j17.f183976f == 9) {
            mn0.i0.H.b("FinderFeedSelector", android.os.SystemClock.elapsedRealtime());
        }
        ae2.b2 b2Var = ae2.b2.f84994a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.W).mo141623x754a37bb()).r()).intValue() == 0 && j17.f183976f == 9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(oVar.f325669a, "handleOnPageSelected return for valid feed type:" + j17.f183976f + '.');
            return;
        }
        if (oVar.m(j17, "handleOnPageSelected")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = j17.f183975e;
            if (!(c14989xf862ae88 != null && c14989xf862ae88.getMediaType() == 15)) {
                oVar.n(recyclerView, j17.f183972b);
            }
            android.content.Context context = recyclerView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Z6(oVar.f325672d);
            if (Z6 != null) {
                fc2.v vVar = new fc2.v(1);
                vVar.f342531e = i17;
                vVar.f342532f = j17.f183972b;
                recyclerView.post(new dw2.m(Z6, vVar));
            }
        }
        oVar.g(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 p0Var = oVar.f325675g;
        long j18 = p0Var.f183972b;
        if (j18 > 0 && j18 == j17.f183972b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(oVar.f325669a, "handleOnPageSelected return for selected same feed:" + oVar.f325675g);
            return;
        }
        oVar.i(m82898xfb7e5820, p0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = j17.f183975e;
        if (c14989xf862ae882 != null && c14989xf862ae882.getMediaType() == 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206788a, false, oVar.f325679k, 1, null);
        }
        oVar.f325679k = false;
        oVar.h(m82898xfb7e5820, j17);
        cVar.b("handleOnPageSelected end");
    }

    @Override // gc2.c
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        dw2.o oVar = this.f325652a;
        oVar.f325683o = i17;
        if (oVar.f325686r == 0 && i17 == 1) {
            oVar.f325684p = true;
        }
        oVar.f325686r = i17;
        dw2.a0 a0Var = oVar.f325673e;
        if (a0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 c15205x28f20815 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815) a0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "onPageScrollStateChanged state:" + i17);
            if (i17 == 0) {
                c15205x28f20815.f212313p.b("onViewIdle");
            }
        }
    }

    @Override // gc2.c
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, float f17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        dw2.o oVar = this.f325652a;
        if (oVar.f325684p) {
            ae2.b2 b2Var = ae2.b2.f84994a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.W).mo141623x754a37bb()).r()).intValue() != 0) {
                oVar.f325684p = false;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
                int w17 = c1162x665295de != null ? c1162x665295de.w() : 0;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2 : null;
                int y17 = c1162x665295de2 != null ? c1162x665295de2.y() : 0;
                int i19 = oVar.f325675g.f183977g;
                oVar.f325685q = -1;
                if (w17 != y17) {
                    if (w17 != i19) {
                        oVar.f325685q = w17;
                    } else if (y17 != i19) {
                        oVar.f325685q = y17;
                    }
                    int i27 = oVar.f325685q;
                    if (i27 >= 0) {
                        oVar.a(i27, true);
                    }
                }
            }
        }
    }
}
