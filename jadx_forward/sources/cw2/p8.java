package cw2;

/* loaded from: classes2.dex */
public final class p8 implements cw2.i9 {

    /* renamed from: d, reason: collision with root package name */
    public final float f305473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305474e;

    public p8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305474e = c15196x85976f5f;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f305473d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209346lg).mo141623x754a37bb()).r()).floatValue();
    }

    @Override // cw2.i9
    public void B(nk4.c data) {
        ec2.g m61491xe16f3d0b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        if (c15196x85976f5f.getPlayInfo() == null || (m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b()) == null) {
            return;
        }
        ec2.f fVar = new ec2.f(33);
        fVar.f332498j = data.f419597a;
        fVar.f332499k = data.f419599c;
        fVar.f342469c = data;
        ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
    }

    @Override // cw2.i9
    public void C(nk4.q data) {
        ec2.g m61491xe16f3d0b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        if (c15196x85976f5f.getPlayInfo() == null || (m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b()) == null) {
            return;
        }
        ec2.f fVar = new ec2.f(29);
        fVar.f332498j = data.f419597a;
        fVar.f342469c = data;
        ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        lw2.m videoScaleCleanHelper;
        android.util.Size size;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo != null) {
            cw2.b0 b0Var = c15196x85976f5f.E;
            mn2.g4 g4Var = playInfo.f305280c;
            java.lang.String m75945x2fec8307 = g4Var.f411535e.m75945x2fec8307(9);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            b0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f305113c, "onFirstFrameRender " + b0Var.f());
            boolean f17 = b0Var.f();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = b0Var.f305111a;
            if (f17) {
                if (b0Var.f305120j <= 0) {
                    c15196x85976f5f2.y("onVideoFirstFrameDraw");
                } else {
                    cw2.da videoView = c15196x85976f5f2.getVideoView();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
                    if ((c15188xd8bd4bd != null ? c15188xd8bd4bd.getOnSeekCompleteListener() : null) == null) {
                        cw2.da videoView2 = c15196x85976f5f2.getVideoView();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = videoView2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView2 : null;
                        if (c15188xd8bd4bd2 != null) {
                            c15188xd8bd4bd2.m61418xe1a2e326(new cw2.y(b0Var));
                        }
                    }
                }
                if (b0Var.g() != null) {
                    b0Var.h(m75945x2fec8307);
                }
            } else {
                c15196x85976f5f2.y("onVideoFirstFrameDraw");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206882a;
            java.lang.String m75945x2fec83072 = g4Var.f411535e.m75945x2fec8307(9);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            s5Var.a(m75945x2fec83072, true);
            c15196x85976f5f.p2("", playInfo.f305279b);
            ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
            if (m61491xe16f3d0b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
                long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.g4 g4Var2 = playInfo.f305280c;
                ((ec2.h) m61491xe16f3d0b).a(m59124x87980ca, dupFlag, g4Var2.f411535e, g4Var2, j17);
            }
            java.lang.Object videoView3 = c15196x85976f5f.getVideoView();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = videoView3 instanceof android.view.View ? (android.view.View) videoView3 : null;
            if (c15188xd8bd4bd3 == null || (videoScaleCleanHelper = c15196x85976f5f.getVideoScaleCleanHelper()) == null || !((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209560xf).mo141623x754a37bb()).r()).booleanValue() || videoScaleCleanHelper.e() == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleCleanUIC", "onFirstFrameRender");
            videoScaleCleanHelper.f403119k = true;
            android.content.Context context = videoScaleCleanHelper.f403109a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            videoScaleCleanHelper.f403110b = new lw2.o(context);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e17 = videoScaleCleanHelper.e();
            if (e17 != null) {
                e17.m62497xc21b09c1(new lw2.e(videoScaleCleanHelper));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f18 = videoScaleCleanHelper.f();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15180x393a0b2f m61264xe34baebb = f18 != null ? f18.m61264xe34baebb() : null;
                if (m61264xe34baebb != null) {
                    m61264xe34baebb.m61303xc21b09c1(new lw2.f(videoScaleCleanHelper));
                }
                e17.m62499xa7ceeacf(new lw2.g(videoScaleCleanHelper, e17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd4 = c15188xd8bd4bd3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? c15188xd8bd4bd3 : null;
            if (c15188xd8bd4bd4 == null || (size = c15188xd8bd4bd4.getVideoResolutionSize()) == null) {
                size = new android.util.Size(c15188xd8bd4bd3.getWidth(), c15188xd8bd4bd3.getHeight());
            }
            lw2.o oVar = videoScaleCleanHelper.f403110b;
            if (oVar != null) {
                oVar.a("bindAnimateView view: " + c15188xd8bd4bd3);
                oVar.f403138o = c15188xd8bd4bd3;
                oVar.K = size;
                c15188xd8bd4bd3.post(new lw2.n(oVar, c15188xd8bd4bd3, size));
            }
            lw2.o oVar2 = videoScaleCleanHelper.f403110b;
            if (oVar2 != null) {
                oVar2.f();
            }
            lw2.o oVar3 = videoScaleCleanHelper.f403110b;
            if (oVar3 != null) {
                oVar3.f403130g = new lw2.h(videoScaleCleanHelper);
            }
            if (oVar3 != null) {
                oVar3.f403129f = videoScaleCleanHelper.f403119k && videoScaleCleanHelper.f403118j;
            }
        }
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
        cw2.e4 e4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo != null) {
            ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
            if (m61491xe16f3d0b != null) {
                long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.g4 g4Var = playInfo.f305280c;
                r45.mb4 mb4Var2 = g4Var.f411535e;
                ec2.f fVar = new ec2.f(2);
                fVar.f332498j = m59124x87980ca;
                fVar.f332499k = dupFlag;
                fVar.f332495g = g4Var;
                fVar.f332494f = mb4Var2;
                ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a c5441x35e2cf6a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a();
            long m59124x87980ca2 = c14989xf862ae88.m59124x87980ca();
            am.fa faVar = c5441x35e2cf6a.f135782g;
            faVar.f88191a = m59124x87980ca2;
            faVar.f88194d = true;
            c5441x35e2cf6a.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 longVideoSeekBar = c15196x85976f5f.getLongVideoSeekBar();
            if (longVideoSeekBar != null && (e4Var = longVideoSeekBar.playStatusListener) != null) {
                e4Var.d();
            }
            c15196x85976f5f.f212242g.T6(c14989xf862ae88.m59124x87980ca());
        }
        bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.F(mb4Var);
        }
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        du2.j jVar = (du2.j) c17;
        cw2.da videoView = c15196x85976f5f.getVideoView();
        cw2.wa f212140n = videoView != null ? videoView.getF212140n() : null;
        cw2.da videoView2 = c15196x85976f5f.getVideoView();
        java.lang.Long valueOf = videoView2 != null ? java.lang.Long.valueOf(videoView2.mo56685x3d7f3f1d()) : null;
        if (jVar.wi(f212140n, "onReplay")) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            eu2.b0 b0Var = (eu2.b0) c18;
            if (b0Var.Vi(f212140n, "onReplay")) {
                return;
            }
            b0Var.rj(f212140n, true, null, valueOf);
            b0Var.pj();
        }
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        c15196x85976f5f.m61503xac889bd4(true);
        c15196x85976f5f.y("onBgPrepared");
        java.lang.String m61471xe56ce956 = c15196x85976f5f.m61471xe56ce956();
        if (mb4Var == null || (str = mb4Var.m75945x2fec8307(9)) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61471xe56ce956, "onBgPrepared ".concat(str));
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        ec2.g m61491xe16f3d0b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo == null || (m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
        long m59127x5db1b11 = c14989xf862ae88.m59127x5db1b11();
        java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
        mn2.g4 video = playInfo.f305280c;
        r45.mb4 mb4Var2 = video.f411535e;
        int playAdapterPosition = c15196x85976f5f.getPlayAdapterPosition();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        ec2.f fVar = new ec2.f(23);
        fVar.f332493e = waVar;
        fVar.f332498j = m59127x5db1b11;
        fVar.f332499k = dupFlag;
        fVar.f332494f = mb4Var2;
        fVar.f332502n = playAdapterPosition;
        fVar.f332495g = video;
        fVar.f332508t = i17;
        ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
    }

    @Override // cw2.fb
    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.b(f17);
        }
        cw2.ca seekBarLayout = c15196x85976f5f.getSeekBarLayout();
        if (seekBarLayout != null) {
            seekBarLayout.b(f17);
        }
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        ec2.g m61491xe16f3d0b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo == null || (m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
        long m59127x5db1b11 = c14989xf862ae88.m59127x5db1b11();
        java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
        mn2.g4 video = playInfo.f305280c;
        r45.mb4 mb4Var2 = video.f411535e;
        int playAdapterPosition = c15196x85976f5f.getPlayAdapterPosition();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        ec2.f fVar = new ec2.f(22);
        fVar.f332493e = waVar;
        fVar.f332498j = m59127x5db1b11;
        fVar.f332499k = dupFlag;
        fVar.f332494f = mb4Var2;
        fVar.f332502n = playAdapterPosition;
        fVar.f332495g = video;
        fVar.f332508t = i17;
        ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo != null) {
            cw2.da videoView = c15196x85976f5f.getVideoView();
            int mo56686xe906e26b = videoView != null ? videoView.mo56686xe906e26b() : 0;
            ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
            if (m61491xe16f3d0b != null) {
                long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.g4 g4Var = playInfo.f305280c;
                r45.mb4 mb4Var2 = g4Var.f411535e;
                ec2.f fVar = new ec2.f(3);
                fVar.f332496h = i17;
                fVar.f332497i = i18;
                fVar.f332495g = g4Var;
                fVar.f332498j = m59124x87980ca;
                fVar.f332499k = dupFlag;
                fVar.f332494f = mb4Var2;
                fVar.f342469c = rVar;
                ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
            }
            r45.dd4 dd4Var = playInfo.f305287j;
            if (dd4Var != null) {
                if (!(dd4Var.m75939xb282bd08(3) > 0 && dd4Var.m75939xb282bd08(2) >= 0 && dd4Var.m75939xb282bd08(3) > dd4Var.m75939xb282bd08(2))) {
                    dd4Var = null;
                }
                if (dd4Var != null && mo56686xe906e26b >= dd4Var.m75939xb282bd08(3) / 1000) {
                    cw2.da videoView2 = c15196x85976f5f.getVideoView();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15174xba50c26a c15174xba50c26a = videoView2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15174xba50c26a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15174xba50c26a) videoView2 : null;
                    if (c15174xba50c26a != null && (f4Var = c15174xba50c26a.f271281q) != null) {
                        f4Var.a(0.0d, true);
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a c5441x35e2cf6a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a();
                    am.fa faVar = c5441x35e2cf6a.f135782g;
                    faVar.f88192b = true;
                    faVar.f88191a = c14989xf862ae88.getLocalId();
                    faVar.f88194d = true;
                    c5441x35e2cf6a.e();
                }
            }
            if (!(mb4Var != null && mb4Var.m75939xb282bd08(10) == 3) && mo56686xe906e26b == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.q2() - ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209122J).mo141623x754a37bb()).intValue()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a c5441x35e2cf6a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a();
                boolean z17 = c14989xf862ae88.getLocalId() != 0;
                am.fa faVar2 = c5441x35e2cf6a2.f135782g;
                faVar2.f88192b = z17;
                faVar2.f88191a = z17 ? c14989xf862ae88.getLocalId() : c14989xf862ae88.getFeedId();
                c5441x35e2cf6a2.e();
            }
            c15196x85976f5f.c0(-1L, -1L);
        }
        bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
        if (bulletLifecycle != null) {
            cw2.fb.w(bulletLifecycle, mb4Var, i17, i18, null, 8, null);
        }
    }

    @Override // cw2.i9
    public void f(nk4.d data) {
        ec2.g m61491xe16f3d0b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        if (c15196x85976f5f.getPlayInfo() == null || (m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b()) == null) {
            return;
        }
        ec2.f fVar = new ec2.f(31);
        fVar.f332498j = data.f419597a;
        fVar.f332499k = data.f419599c;
        fVar.f342469c = data;
        ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
        ec2.g m61491xe16f3d0b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo == null || (m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
        long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
        java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
        mn2.g4 video = playInfo.f305280c;
        r45.mb4 mb4Var2 = video.f411535e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        ec2.f fVar = new ec2.f(20);
        fVar.f332494f = mb4Var2;
        fVar.f332495g = video;
        fVar.f332498j = m59124x87980ca;
        fVar.f332499k = dupFlag;
        fVar.f332501m = playInfo.f305282e;
        fVar.f332510v = tVar;
        ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        java.util.LinkedList m61464x339d0e08;
        cw2.h8 playInfo = this.f305474e.getPlayInfo();
        if (playInfo != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
            cq.k1.a();
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209382ng).mo141623x754a37bb()).r()).booleanValue()) {
                cw2.da videoView = c15196x85976f5f.getVideoView();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
                if (c15188xd8bd4bd != null && c15188xd8bd4bd.f212198r) {
                    c15196x85976f5f.y("onPlay");
                }
            }
            ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
            if (m61491xe16f3d0b != null) {
                long m59124x87980ca = playInfo.f305278a.m59124x87980ca();
                java.lang.String dupFlag = playInfo.f305278a.getDupFlag();
                mn2.g4 g4Var = playInfo.f305280c;
                ((ec2.h) m61491xe16f3d0b).c(m59124x87980ca, dupFlag, g4Var.f411535e, playInfo.f305282e, g4Var, playInfo.f305278a);
            }
            cw2.b0 b0Var = c15196x85976f5f.E;
            java.lang.String m75945x2fec8307 = playInfo.f305280c.f411535e.m75945x2fec8307(9);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            b0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f305113c, "onPlaySeekTo " + b0Var.f());
            if (!b0Var.f()) {
                b0Var.h(m75945x2fec8307);
            }
            m61464x339d0e08 = c15196x85976f5f.m61464x339d0e08();
            java.util.Iterator it = m61464x339d0e08.iterator();
            while (it.hasNext()) {
                ((cw2.ea) it.next()).mo1058x4d9b9b30();
            }
        }
        bb2.y2 bulletLifecycle = this.f305474e.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.h(mb4Var);
        }
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        du2.j jVar = (du2.j) c17;
        cw2.da videoView2 = this.f305474e.getVideoView();
        cw2.wa f212140n = videoView2 != null ? videoView2.getF212140n() : null;
        cw2.da videoView3 = this.f305474e.getVideoView();
        java.lang.Long valueOf = videoView3 != null ? java.lang.Long.valueOf(videoView3.mo56685x3d7f3f1d()) : null;
        if (jVar.wi(f212140n, "onPlay")) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            eu2.b0 b0Var2 = (eu2.b0) c18;
            if (b0Var2.Vi(f212140n, "onPlay")) {
                return;
            }
            b0Var2.rj(f212140n, true, null, valueOf);
        }
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        java.util.LinkedList m61464x339d0e08;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo != null) {
            ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
            if (m61491xe16f3d0b != null) {
                long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.g4 g4Var = playInfo.f305280c;
                ((ec2.h) m61491xe16f3d0b).b(m59124x87980ca, dupFlag, g4Var.f411535e, playInfo.f305282e, g4Var, aVar);
            }
            m61464x339d0e08 = c15196x85976f5f.m61464x339d0e08();
            java.util.Iterator it = m61464x339d0e08.iterator();
            while (it.hasNext()) {
                ((cw2.ea) it.next()).mo1057x65d3157a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.X(c15196x85976f5f, c14989xf862ae88.getFeedId(), false, false, 0, 14, null);
        }
        bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.n(mb4Var, aVar);
        }
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        du2.j jVar = (du2.j) c17;
        cw2.da videoView = c15196x85976f5f.getVideoView();
        cw2.wa f212140n = videoView != null ? videoView.getF212140n() : null;
        cw2.da videoView2 = c15196x85976f5f.getVideoView();
        java.lang.Long valueOf = videoView2 != null ? java.lang.Long.valueOf(videoView2.mo56685x3d7f3f1d()) : null;
        if (jVar.wi(f212140n, "onPause")) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            eu2.b0 b0Var = (eu2.b0) c18;
            if (b0Var.Vi(f212140n, "onPause")) {
                return;
            }
            b0Var.rj(f212140n, false, null, valueOf);
            b0Var.oj();
        }
    }

    @Override // cw2.i9
    public void p(nk4.j data) {
        ec2.g m61491xe16f3d0b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        if (c15196x85976f5f.getPlayInfo() == null || (m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b()) == null) {
            return;
        }
        ec2.f fVar = new ec2.f(30);
        fVar.f332498j = data.f419597a;
        fVar.f332499k = data.f419599c;
        fVar.f342469c = data;
        ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
        if (waVar != null) {
            cu2.x xVar = cu2.x.f303982a;
            so2.i3 c17 = cu2.x.c(xVar, waVar.f305629c, false, false, false, 14, null);
            if (!c17.f68979x84cd6908) {
                c17.f68979x84cd6908 = true;
                java.lang.String field_mediaId = c17.f68981xaca5bdda;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                so2.i3 c18 = cu2.x.c(xVar, field_mediaId, false, false, false, 14, null);
                c18.f68979x84cd6908 = true;
                xVar.i(field_mediaId, c18, false);
            }
            ec2.g m61491xe16f3d0b = this.f305474e.m61491xe16f3d0b();
            if (m61491xe16f3d0b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = waVar.f305632f;
                long m59127x5db1b11 = c14989xf862ae88.m59127x5db1b11();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.j4 video = waVar.f305631e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
                ec2.f fVar = new ec2.f(6);
                fVar.f332498j = m59127x5db1b11;
                fVar.f332499k = dupFlag;
                fVar.f332494f = waVar.f305630d;
                fVar.f332495g = video;
                fVar.f332511w = aVar;
                ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
            }
        }
    }

    @Override // cw2.fb
    public void t(long j17, long j18, long j19, java.lang.String str, int i17, bu2.h0 mediaHWInfo, java.lang.String specFormat) {
        int i18;
        boolean z17;
        long j27;
        ec2.g m61491xe16f3d0b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaHWInfo, "mediaHWInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specFormat, "specFormat");
        int i19 = mediaHWInfo.f106051c;
        int i27 = mediaHWInfo.f106050b;
        float f17 = mediaHWInfo.f106049a;
        if (j18 <= 0 || j17 <= 0) {
            i18 = i19;
            z17 = false;
        } else {
            r45.mb4 mb4Var = mediaHWInfo.f106052d;
            if (mb4Var == null || java.lang.Float.isNaN(f17) || i27 <= 0 || i19 <= 0) {
                i18 = i19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoLayout", "checkNeedResizeVideoView: needResize: true, mediaHWRatio: " + f17 + ", mediaHeight: " + i27 + ", mediaWidth: " + i18 + ", maxRadioMedia: " + mb4Var);
                z17 = true;
            } else {
                double d17 = j18 / j17;
                boolean z18 = d17 - ((double) f17) > ((double) this.f305473d);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkNeedResizeVideoView: needResize: ");
                sb6.append(z18);
                sb6.append(", videoRatio: ");
                sb6.append(d17);
                sb6.append(", mediaHWRatio: ");
                sb6.append(f17);
                sb6.append(", mediaHeight: ");
                sb6.append(i27);
                sb6.append(", mediaWidth: ");
                i18 = i19;
                sb6.append(i18);
                sb6.append(", maxRadioMedia: ");
                sb6.append(mb4Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoLayout", sb6.toString());
                z17 = z18;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoLayout", "needResizeAndNotify: width: %s, height: %s, feedId: %s, feedPosition: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), pm0.v.u(j19), java.lang.Integer.valueOf(i17));
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209364mg).mo141623x754a37bb()).r()).booleanValue() || (m61491xe16f3d0b = this.f305474e.m61491xe16f3d0b()) == null) {
                j27 = j18;
            } else {
                ec2.f fVar = new ec2.f(32);
                fVar.f332498j = j19;
                j27 = j18;
                fVar.D = new android.util.Size((int) j17, (int) j27);
                ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
            }
            i95.m c18 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209328kg).mo141623x754a37bb()).r()).booleanValue()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6607x505fe2d8 c6607x505fe2d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6607x505fe2d8();
                c6607x505fe2d8.f139607d = c6607x505fe2d8.b("feed_id", pm0.v.u(j19), true);
                c6607x505fe2d8.f139608e = c6607x505fe2d8.b("feed_bitrate_level", specFormat, true);
                c6607x505fe2d8.f139609f = i18;
                c6607x505fe2d8.f139610g = i27;
                c6607x505fe2d8.f139611h = (int) j17;
                c6607x505fe2d8.f139612i = (int) j27;
                c6607x505fe2d8.f139613j = j17 != 0 ? (int) ((f17 - (j27 / j17)) * 100) : Integer.MIN_VALUE;
                c6607x505fe2d8.k();
            }
        }
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206882a;
            mn2.g4 video = playInfo.f305280c;
            java.lang.String m75945x2fec8307 = video.f411535e.m75945x2fec8307(9);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            boolean z17 = false;
            s5Var.a(m75945x2fec8307, false);
            java.lang.String m61471xe56ce956 = c15196x85976f5f.m61471xe56ce956();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFirstVideoFrameRendered] videoView=");
            cw2.da videoView = c15196x85976f5f.getVideoView();
            sb6.append(videoView != null ? java.lang.Integer.valueOf(videoView.hashCode()) : null);
            sb6.append(" mediaId=");
            sb6.append(playInfo.f305279b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61471xe56ce956, sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1 e1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1.f206537a;
            cw2.h8 playInfo2 = c15196x85976f5f.getPlayInfo();
            java.lang.Long valueOf = (playInfo2 == null || (c14989xf862ae88 = playInfo2.f305278a) == null) ? null : java.lang.Long.valueOf(c14989xf862ae88.m59127x5db1b11());
            if (valueOf != null) {
                valueOf.longValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1 a17 = e1Var.a(valueOf.longValue());
                if ((a17.f206523c > 0 || a17.f206521a > 0) && a17.f206526f == 0) {
                    z17 = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d1 d1Var = z17 ? a17 : null;
                if (d1Var != null) {
                    d1Var.f206526f = c01.id.c();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1.f206539c.add(d1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1.f206538b.clear();
                }
            }
            ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
            if (m61491xe16f3d0b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = playInfo.f305278a;
                long m59124x87980ca = c14989xf862ae882.m59124x87980ca();
                java.lang.String dupFlag = c14989xf862ae882.getDupFlag();
                r45.mb4 mb4Var2 = video.f411535e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
                ec2.f fVar = new ec2.f(19);
                fVar.f332494f = mb4Var2;
                fVar.f332498j = m59124x87980ca;
                fVar.f332499k = dupFlag;
                fVar.f332495g = video;
                fVar.f332509u = j17;
                fVar.f332512x = aVar;
                ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
            }
        }
        bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.u(mb4Var, j17, aVar);
        }
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305474e;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo != null) {
            c15196x85976f5f.W = j17;
            long j19 = c15196x85976f5f.f212249p0;
            if (j17 >= j19) {
                j19 = j17;
            }
            c15196x85976f5f.f212249p0 = j19;
            c15196x85976f5f.c0(j17, j18);
            ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
            if (m61491xe16f3d0b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
                long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.g4 video = playInfo.f305280c;
                r45.mb4 mb4Var2 = video.f411535e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
                ec2.f fVar = new ec2.f(24);
                fVar.f332496h = (int) j17;
                fVar.f332497i = (int) j18;
                fVar.f332495g = video;
                fVar.f332498j = m59124x87980ca;
                fVar.f332499k = dupFlag;
                fVar.f332494f = mb4Var2;
                ((ec2.h) m61491xe16f3d0b).f332515a.a(fVar);
            }
        }
        bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.v(mb4Var, j17, j18);
        }
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        du2.j jVar = (du2.j) c17;
        cw2.da videoView = c15196x85976f5f.getVideoView();
        cw2.wa f212140n = videoView != null ? videoView.getF212140n() : null;
        cw2.da videoView2 = c15196x85976f5f.getVideoView();
        java.lang.Long valueOf = videoView2 != null ? java.lang.Long.valueOf(videoView2.mo56685x3d7f3f1d()) : null;
        if (jVar.wi(f212140n, "onPlayProgressMs")) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            du2.l lVar = eu2.b0.I;
            ((eu2.b0) c18).fj(f212140n, valueOf, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r7 != 3) goto L43;
     */
    @Override // cw2.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(r45.mb4 r17, cw2.wa r18, int r19, nk4.e r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.p8.x(r45.mb4, cw2.wa, int, nk4.e):void");
    }
}
