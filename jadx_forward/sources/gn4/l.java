package gn4;

/* loaded from: classes15.dex */
public class l implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f355170d;

    public l(gn4.z zVar) {
        this.f355170d = zVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        boolean t17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoEnded");
        gn4.z zVar = this.f355170d;
        zVar.m131898x15cb7231().I2().g(str);
        zVar.m131898x15cb7231().o4().f346010d = 1;
        int b17 = zVar.m131898x15cb7231().b1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "clicfg_topstory_v_video_play  %s", java.lang.Integer.valueOf(b17));
        if (b17 == 1 && zVar.m131898x15cb7231().p6() && (zVar.f346061z instanceof gn4.d1)) {
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
            ((gn4.d1) zVar.f346061z).s(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "VVideoAutoPlay replay succ");
            t17 = true;
        } else {
            t17 = zVar.m131898x15cb7231().t1(zVar.f346061z.u() + 1);
        }
        if (!t17 && (zVar.f346061z instanceof fn4.m)) {
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused2) {
            }
            ((fn4.m) zVar.f346061z).s(true);
        }
        zVar.N = false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onGetVideoSize width=%d height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        r45.zn6 zn6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError errorMsg=%s what=%d extra=%d", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gn4.z zVar = this.f355170d;
        fn4.z0 s47 = zVar.A.s4();
        fn4.b bVar = zVar.A;
        r45.xn6 d17 = s47.d(bVar.Y2());
        int i19 = 0;
        if (d17 != null && d17.K != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError, change url, errno:%s, urlListSize:%s, curUrl:%s, curVt:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17.K.size()), d17.f471789e, java.lang.Integer.valueOf(d17.U));
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError, change url succ, nextIndex:%s, nextUrl:%s, nextVt:%s", java.lang.Integer.valueOf(i28), zn6Var.f473777d, java.lang.Integer.valueOf(zn6Var.f473778e));
                        uu4.b.a(17);
                        zVar.postDelayed(new gn4.k(this), 100L);
                        return;
                    }
                } else {
                    i27++;
                }
            }
        }
        bVar.s4().q(bVar.r0(), bVar.Y2());
        zVar.k(zVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574976k73, i17 + ":" + i18), zVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80));
        fn4.l1 I2 = zVar.m131898x15cb7231().I2();
        fn4.c1 c1Var = I2.f346106b;
        if (c1Var != null && c1Var.mo66135x23a7af9b().equals(str)) {
            I2.m();
        }
        pm4.y.b(i17);
        rm4.d dVar = zVar.m131898x15cb7231().o4().f346012f;
        if (dVar != null && dVar.f478985a > 0) {
            i19 = ((int) (java.lang.System.currentTimeMillis() - dVar.f478985a)) / 1000;
        }
        pm4.y.d(d17, i17, str3, i19);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoWaiting");
        this.f355170d.N = true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoWaitingEnd");
        gn4.z zVar = this.f355170d;
        zVar.N = false;
        zVar.i();
        rm4.d dVar = zVar.m131898x15cb7231().o4().f346012f;
        if (dVar == null || dVar.f478996l != 0) {
            return;
        }
        dVar.f478996l = java.lang.System.currentTimeMillis() - dVar.f478985a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "FirstLoadTime %d %d", java.lang.Long.valueOf(dVar.f478993i), java.lang.Long.valueOf(dVar.f478996l));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onPrepared");
        gn4.z zVar = this.f355170d;
        fn4.h0 h0Var = zVar.H;
        h0Var.f346079i = -1;
        h0Var.f346080j = 0;
        h0Var.f346078h = 0.0f;
        if (zVar.N) {
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
