package hn4;

/* loaded from: classes15.dex */
public class x implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f364138d;

    public x(hn4.z zVar) {
        this.f364138d = zVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        hn4.z zVar = this.f364138d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoEnded, pos:%s, listpos:%s", java.lang.Integer.valueOf(zVar.f346061z.u()), java.lang.Integer.valueOf(zVar.f346061z.u()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.g(str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).H.f346010d = 1;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.p2309x32b09e.ActivityC18759x34abfcf1) zVar.m133835x24b16ea2()).t1(zVar.f346061z.u() + 1) && (zVar.f346061z instanceof fn4.m)) {
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
            ((fn4.m) zVar.f346061z).s(true);
        }
        zVar.G.w();
        zVar.f364141J = false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onGetVideoSize width=%d height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        r45.xn6 d17;
        r45.zn6 zn6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryListVideoContainer", "onError errorMsg=%s what=%d extra=%d", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = 0;
        hn4.z zVar = this.f364138d;
        if (i17 != 0 && (d17 = zVar.A.s4().d(zVar.A.Y2())) != null && d17.K != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onError, change url, errno:%s, urlListSize:%s, curUrl:%s, curVt:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17.K.size()), d17.f471789e, java.lang.Integer.valueOf(d17.U));
            int i27 = 0;
            while (true) {
                if (i27 >= d17.K.size()) {
                    break;
                }
                if (d17.f471789e.equals(((r45.zn6) d17.K.get(i27)).f473777d)) {
                    int i28 = i27 + 1;
                    if (i28 < d17.K.size() && (zn6Var = (r45.zn6) d17.K.get(i28)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zn6Var.f473777d)) {
                        d17.U = zn6Var.f473778e;
                        d17.f471789e = zn6Var.f473777d;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onError, change url succ, nextIndex:%s, nextUrl:%s, nextVt:%s", java.lang.Integer.valueOf(i28), zn6Var.f473777d, java.lang.Integer.valueOf(zn6Var.f473778e));
                        uu4.b.a(17);
                        zVar.postDelayed(new hn4.w(this), 100L);
                        return;
                    }
                } else {
                    i27++;
                }
            }
        }
        fn4.z0 s47 = zVar.A.s4();
        fn4.b bVar = zVar.A;
        s47.q(bVar.r0(), bVar.Y2());
        zVar.k(zVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574976k73, i17 + ":" + i18), zVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80));
        fn4.l1 l1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J;
        fn4.c1 c1Var = l1Var.f346106b;
        if (c1Var != null && c1Var.mo66135x23a7af9b().equals(str)) {
            l1Var.m();
        }
        pm4.y.b(i17);
        rm4.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).H.f346012f;
        if (dVar != null && dVar.f478985a > 0) {
            i19 = ((int) (java.lang.System.currentTimeMillis() - dVar.f478985a)) / 1000;
        }
        pm4.y.d(zVar.E, i17, str3, i19);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoWaiting");
        this.f364138d.f364141J = true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoWaitingEnd");
        hn4.z zVar = this.f364138d;
        zVar.f364141J = false;
        zVar.G.w();
        if (zVar.E.V != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "longVideoInfo onVideoWaitingEnd");
            android.view.View view = zVar.K;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$9", "onVideoWaitingEnd", "(Ljava/lang/String;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$9", "onVideoWaitingEnd", "(Ljava/lang/String;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        zVar.i();
        rm4.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).H.f346012f;
        if (dVar == null || dVar.f478996l != 0) {
            return;
        }
        dVar.f478996l = java.lang.System.currentTimeMillis() - dVar.f478985a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "FirstLoadTime %d %d", java.lang.Long.valueOf(dVar.f478993i), java.lang.Long.valueOf(dVar.f478996l));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onPrepared");
        hn4.z zVar = this.f364138d;
        fn4.h0 h0Var = zVar.H;
        h0Var.f346079i = -1;
        h0Var.f346080j = 0;
        h0Var.f346078h = 0.0f;
        if (zVar.f364141J) {
            return;
        }
        zVar.i();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
