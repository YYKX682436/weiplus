package cw2;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305111a;

    /* renamed from: b, reason: collision with root package name */
    public final ey2.v2 f305112b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f305113c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f305114d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f305115e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f305116f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f305117g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f305118h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f305119i;

    /* renamed from: j, reason: collision with root package name */
    public long f305120j;

    /* renamed from: k, reason: collision with root package name */
    public int f305121k;

    /* renamed from: l, reason: collision with root package name */
    public float f305122l;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f finderVideoLayout, ey2.v2 videoStateVM) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderVideoLayout, "finderVideoLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoStateVM, "videoStateVM");
        this.f305111a = finderVideoLayout;
        this.f305112b = videoStateVM;
        this.f305113c = "FinderAutoSeekManager";
        this.f305114d = jz5.h.b(cw2.x.f305633d);
        this.f305115e = jz5.h.b(cw2.s.f305518d);
        this.f305116f = jz5.h.b(cw2.w.f305606d);
        this.f305117g = jz5.h.b(cw2.v.f305587d);
        this.f305118h = jz5.h.b(cw2.t.f305545d);
        this.f305119i = jz5.h.b(cw2.u.f305567d);
        this.f305121k = 1;
        this.f305122l = 1.0f;
    }

    public static final void i(cw2.b0 b0Var, int i17, cw2.h8 h8Var, ey2.q2 q2Var) {
        cw2.da videoView;
        cw2.h8 h8Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        if (q2Var == null || (videoView = b0Var.f305111a.getVideoView()) == null) {
            return;
        }
        cw2.da daVar = (videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de) ^ true ? videoView : null;
        if (daVar != null) {
            long mo56685x3d7f3f1d = daVar.mo56685x3d7f3f1d();
            cw2.bb e17 = b0Var.e(q2Var);
            cw2.bb c17 = q2Var.f339019i ? e17 : b0Var.c(i17, q2Var, new cw2.bb(e17.f305139a, e17.f305140b, "onVideoPlay"), q2Var.f339017g);
            long j17 = c17.f305139a;
            if (j17 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = b0Var.f305111a;
                b0Var.a(daVar, j17, !c15196x85976f5f.G(), c17.f305140b);
                cw2.ca seekBarLayout = c15196x85976f5f.getSeekBarLayout();
                if (seekBarLayout != null) {
                    long j18 = 1000;
                    seekBarLayout.p((int) (j17 / j18), (int) (h8Var.f305280c.f411535e.m75942xfb822ef2(24) / j18));
                }
                cw2.ca seekBarLayout2 = c15196x85976f5f.getSeekBarLayout();
                if (seekBarLayout2 != null) {
                    seekBarLayout2.mo61220x3ae760af(q2Var.f339013c);
                }
                bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
                if (bulletLifecycle != null) {
                    h8Var2 = null;
                    bb2.y2.r(bulletLifecycle, (int) (j17 / 1000), false, 2, null);
                } else {
                    h8Var2 = null;
                }
                if (h8Var.f305284g) {
                    h8Var2 = h8Var;
                }
                if (h8Var2 != null) {
                    ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = h8Var2.f305278a;
                    if (m61491xe16f3d0b != null) {
                        long m59124x87980ca = c14989xf862ae882.m59124x87980ca();
                        java.lang.String dupFlag = c14989xf862ae882.getDupFlag();
                        mn2.g4 g4Var = h8Var2.f305280c;
                        long j19 = 1000;
                        c14989xf862ae88 = c14989xf862ae882;
                        ((ec2.h) m61491xe16f3d0b).d(m59124x87980ca, dupFlag, g4Var.f411535e, (int) (mo56685x3d7f3f1d / j19), (int) (j17 / j19), g4Var);
                    } else {
                        c14989xf862ae88 = c14989xf862ae882;
                    }
                    long j27 = 1000;
                    b0Var.f305111a.R(c14989xf862ae88.m59124x87980ca(), daVar.mo56696x9040359a(), (int) (mo56685x3d7f3f1d / j27), (int) (j17 / j27));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f305113c, "onPlayVideoSeekTo: auto seek silently, feedId = " + pm0.v.u(q2Var.f339011a) + ", curPlayMs:" + mo56685x3d7f3f1d + ", seekTimeMs:" + j17 + " cacheSeekTimeMs:" + e17);
            }
        }
    }

    public final java.lang.Boolean a(cw2.da daVar, long j17, boolean z17, int i17) {
        boolean z18 = daVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd;
        java.lang.Boolean bool = null;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar : null;
            if (c15188xd8bd4bd != null) {
                bool = java.lang.Boolean.valueOf(c15188xd8bd4bd.f0(j17, z17, i17));
            }
        } else if (daVar != null) {
            bool = java.lang.Boolean.valueOf(daVar.r(j17 / 1000.0d, true, this.f305121k));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305113c, "doSeekToMs ret:" + bool + " time:" + j17 + " afterSeekPlay:" + z17 + " mode:" + i17);
        return bool;
    }

    public final void b(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305113c, "doSetPlaySpeed " + f17);
        cw2.da videoView = this.f305111a.getVideoView();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        if (c15188xd8bd4bd != null) {
            c15188xd8bd4bd.m61420xeb2d9731(f17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cw2.bb c(int r19, ey2.q2 r20, cw2.bb r21, long r22) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.b0.c(int, ey2.q2, cw2.bb, long):cw2.bb");
    }

    public final float d(cw2.h8 h8Var, ey2.q2 q2Var) {
        r45.qj2 qj2Var;
        r45.bn2 dramaInfo = h8Var.f305278a.getDramaInfo();
        java.lang.Long valueOf = (dramaInfo == null || (qj2Var = (r45.qj2) dramaInfo.m75936x14adae67(0)) == null) ? null : java.lang.Long.valueOf(qj2Var.m75942xfb822ef2(0));
        cw2.da videoView = this.f305111a.getVideoView();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        float a17 = this.f305112b.a(valueOf, c15188xd8bd4bd != null ? java.lang.Integer.valueOf(c15188xd8bd4bd.getCommentScene()) : null);
        if (a17 > 0.0f) {
            return a17;
        }
        if (q2Var != null) {
            return q2Var.f339016f;
        }
        return 1.0f;
    }

    public final cw2.bb e(ey2.q2 q2Var) {
        mn2.g4 g4Var;
        r45.mb4 mb4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305111a;
        long m61488x7723e6ff = c15196x85976f5f.m61488x7723e6ff();
        long j17 = 0;
        if (m61488x7723e6ff == 0) {
            cw2.h8 g17 = g();
            m61488x7723e6ff = (g17 == null || (g4Var = g17.f305280c) == null || (mb4Var = g4Var.f411535e) == null) ? 0L : mb4Var.m75942xfb822ef2(24);
        }
        cw2.da videoView = c15196x85976f5f.getVideoView();
        if (videoView != null) {
            if (!(!(videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de))) {
                videoView = null;
            }
            if (videoView != null) {
                long j18 = q2Var.f339014d;
                long j19 = m61488x7723e6ff - 1000;
                if (j18 >= 0) {
                    j17 = j18 > j19 ? j19 : j18;
                }
                return new cw2.bb(j17, q2Var.f339018h, "getCacheSeekTimeMs");
            }
        }
        j17 = -1;
        return new cw2.bb(j17, q2Var.f339018h, "getCacheSeekTimeMs");
    }

    public final boolean f() {
        return ((java.lang.Boolean) ((jz5.n) this.f305114d).mo141623x754a37bb()).booleanValue();
    }

    public final cw2.h8 g() {
        return this.f305111a.getPlayInfo();
    }

    public final void h(java.lang.String mediaId) {
        if (this.f305120j > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305113c, "onPlaySeekTo startPlayTime:" + this.f305120j + " playSpeedRatio:" + this.f305122l);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206882a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206883b.get(mediaId));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305111a;
            a(c15196x85976f5f.getVideoView(), this.f305120j, true, this.f305121k);
            bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
            if (bulletLifecycle != null) {
                bb2.y2.r(bulletLifecycle, (int) (this.f305120j / 1000), false, 2, null);
            }
            b(this.f305122l);
            this.f305120j = 0L;
            this.f305121k = 1;
            this.f305122l = 1.0f;
        }
    }
}
