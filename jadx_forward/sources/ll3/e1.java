package ll3;

/* loaded from: classes10.dex */
public final class e1 extends ll3.j0 implements ka0.g0 {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f400684o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 f400685p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.Bundle f400686q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f400687r;

    /* renamed from: s, reason: collision with root package name */
    public r45.xs4 f400688s;

    /* renamed from: t, reason: collision with root package name */
    public final ll3.u1 f400689t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f400690u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f400691v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f400692w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f400693x;

    static {
        new ll3.a1(null);
    }

    public e1() {
        super("MicroMsg.GlobalMusicPlayerFloatBallHelper");
        this.f400684o = new java.util.concurrent.CopyOnWriteArraySet();
        this.f400689t = new ll3.u1();
        this.f400692w = true;
        this.f400693x = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void d() {
        super.d();
        this.f400685p = null;
    }

    @Override // ll3.j0
    public void e0(b21.r rVar) {
        super.e0(rVar);
    }

    @Override // ll3.j0
    public void f0(b21.r rVar) {
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "addMusicFloatBall isFromNewMusicPlayer: %s, state: %s", java.lang.Boolean.valueOf(rVar.T), java.lang.Integer.valueOf(this.f174665d.H));
            if (rVar.T) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 c16629x1032f0d1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1(context, null);
                this.f400685p = c16629x1032f0d1;
                c16629x1032f0d1.m67228xa37ba3c9(new ll3.d1(this));
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 c16629x1032f0d12 = this.f400685p;
                if (c16629x1032f0d12 != null) {
                    c16629x1032f0d12.m67227xd1bfaa3a(this.f400687r);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
                c12886x91aa2b6d.f174583h = this.f400685p;
                if (c12886x91aa2b6d.f174584i == null) {
                    c12886x91aa2b6d.f174584i = new android.graphics.Point();
                }
                this.f174665d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0f);
                this.f174665d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0c);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
                c12886x91aa2b6d2.f174578J = false;
                c12886x91aa2b6d2.I = true;
                c12886x91aa2b6d2.F = true;
                c12886x91aa2b6d2.L = false;
                pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
                int i17 = this.f174665d.H;
                ((ov.p0) j0Var).getClass();
                java.lang.Boolean bool = qp1.w.f447288a;
                c12886x91aa2b6d2.H = i17 | 2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d3 = this.f174665d;
                c12886x91aa2b6d3.K = false;
                c12886x91aa2b6d3.f174586n = 2;
                boolean c17 = b21.m.c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d3.f174587o;
                ballButtonInfo.f174602d = c17;
                ballButtonInfo.f174603e = true;
                ballButtonInfo.f174606h = true;
                this.f174665d.f174588p.f174599d = this.f400687r;
                j();
            }
        }
    }

    @Override // ll3.j0
    public boolean g0(b21.r rVar) {
        return rVar != null && rVar.T;
    }

    @Override // ll3.j0
    public int h0() {
        return 23;
    }

    @Override // ll3.j0
    public java.lang.String i0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, boolean z17) {
        ql3.a z18 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        jz5.f0 f0Var = null;
        if (z18 != null) {
            java.lang.String format = java.lang.String.format("%s_%s_%s", java.util.Arrays.copyOf(new java.lang.Object[]{z18.f67001x79435ae5, z18.f67002x3ed1b556, z18.f66989xae75a955}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(format.getBytes());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
            ll3.u1 u1Var = this.f400689t;
            u1Var.y(6, b17);
            r45.xs4 xs4Var = this.f400688s;
            android.os.Bundle bundle = this.f400686q;
            u1Var.getClass();
            if (xs4Var == null && bundle == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicPlayerMultiTaskHelper", "fillMultiTaskData failed");
                u1Var.f381610a = null;
            } else {
                java.lang.String str = "";
                if (xs4Var == null) {
                    xs4Var = new r45.xs4();
                    xs4Var.set(2, bundle != null ? bundle.getString("key_mv_cover_url", null) : null);
                    xs4Var.set(3, bundle != null ? bundle.getString("key_mv_poster", null) : null);
                    xs4Var.set(1, bundle != null ? bundle.getString("key_mv_nonce_id", null) : null);
                    xs4Var.set(0, bundle != null ? bundle.getString("key_mv_feed_id", null) : null);
                    xs4Var.set(14, bundle != null ? bundle.getString("key_mv_song_name", null) : null);
                    xs4Var.set(15, bundle != null ? bundle.getString("key_mv_song_lyric", "") : null);
                    xs4Var.set(4, bundle != null ? bundle.getString("key_mv_singer_name", null) : null);
                    xs4Var.set(5, bundle != null ? bundle.getString("key_mv_album_name", null) : null);
                    xs4Var.set(7, bundle != null ? bundle.getString("key_mv_music_genre", null) : null);
                    xs4Var.set(8, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(bundle != null ? bundle.getString("key_mv_issue_date", "") : null)));
                    xs4Var.set(16, bundle != null ? bundle.getString("key_mv_album_cover_url", null) : null);
                    xs4Var.set(9, bundle != null ? bundle.getString("key_mv_identification", null) : null);
                    xs4Var.set(6, bundle != null ? bundle.getString("key_mv_extra_info", null) : null);
                    xs4Var.set(10, java.lang.Integer.valueOf(bundle != null ? bundle.getInt("key_mv_music_duration", 0) : 0));
                    xs4Var.set(13, bundle != null ? bundle.getString("key_mv_thumb_path", null) : null);
                    xs4Var.set(12, bundle != null ? bundle.getString("key_mv_music_operation_url", null) : null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = u1Var.f381610a;
                if (c16601x7ed0e40c != null) {
                    java.lang.String str2 = z18.f67002x3ed1b556;
                    if (!(str2 == null || str2.length() == 0)) {
                        str = " · " + z18.f67002x3ed1b556;
                    }
                    c16601x7ed0e40c.v0().set(1, z18.f67001x79435ae5 + str);
                    c16601x7ed0e40c.v0().set(0, xs4Var.m75945x2fec8307(3));
                    r45.rs4 rs4Var = new r45.rs4();
                    rs4Var.set(0, xs4Var);
                    rs4Var.set(1, java.lang.Integer.valueOf(z18.f66984xb1df81fa));
                    rs4Var.set(2, z18.f66992xe65a7da);
                    rs4Var.set(3, z18.f67001x79435ae5);
                    rs4Var.set(4, z18.f67002x3ed1b556);
                    rs4Var.set(5, z18.f67006x45670355);
                    rs4Var.set(6, z18.f67005xdaf47629);
                    rs4Var.set(7, z18.f67008x6e8dd380);
                    rs4Var.set(8, z18.f66983xc8c6afdb);
                    rs4Var.set(10, z18.f66990x8cd5305b);
                    rs4Var.set(11, z18.f66989xae75a955);
                    rs4Var.set(12, z18.f66974x28d45f97);
                    rs4Var.set(13, z18.f66995x4a6948ee);
                    c16601x7ed0e40c.f66790x225a93cf = rs4Var.mo14344x5f01b1f6();
                }
            }
            u1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a17 = kl3.t.g().a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayerMultiTaskHelper", "onClose " + (a17 != null ? a17.a() : 0));
            if (u1Var.f381610a != null) {
                u1Var.f381610a = null;
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "onFloatBallRemoved currentMusic is null");
        }
        return super.i0(c12886x91aa2b6d, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "addMusicBall %s, needEnterTranslation: %s", java.lang.Boolean.valueOf(this.f400691v), java.lang.Boolean.valueOf(this.f400692w));
        if (this.f400691v) {
            return;
        }
        this.f174665d.f174591s = this.f400692w;
        super.j();
    }

    @Override // ll3.j0
    public void j0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
        u0(false);
    }

    @Override // ll3.j0
    public void k0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4, b21.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = this.f174665d.f174587o;
        ballButtonInfo.f174602d = false;
        ballButtonInfo.f174603e = true;
        ballButtonInfo.f174606h = true;
        S(ballButtonInfo);
    }

    @Override // ll3.j0
    public void m0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4, b21.r rVar) {
        u0(true);
    }

    @Override // ll3.j0
    public void n0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
        u0(false);
    }

    @Override // ll3.j0
    public void o0() {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int i17 = this.f174665d.H;
        ((ov.p0) j0Var).getClass();
        java.lang.Boolean bool = qp1.w.f447288a;
        b0(i17 & (-3));
    }

    @Override // ll3.j0
    public void q0(b21.r wrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wrapper, "wrapper");
        if (wrapper.T) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
            pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
            int i17 = this.f174665d.H;
            ((ov.p0) j0Var).getClass();
            java.lang.Boolean bool = qp1.w.f447288a;
            c12886x91aa2b6d.H = i17 | 2;
            b0(this.f174665d.H);
        }
    }

    public final android.content.Intent s0() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String m75945x2fec8307;
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = this.f400686q;
        if (bundle != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = bundle != null ? java.lang.Integer.valueOf(bundle.hashCode()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "getMusicMvUIIntent jump by extra %s", objArr);
            android.os.Bundle bundle2 = this.f400686q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle2);
            intent.putExtras(bundle2);
        } else {
            r45.xs4 xs4Var = this.f400688s;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = xs4Var != null ? java.lang.Integer.valueOf(xs4Var.hashCode()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "getMusicMvUIIntent jump by musicShareObject: %s", objArr2);
            intent.putExtra("key_scene", 6);
            java.lang.String str16 = "";
            if (xs4Var == null || (str = xs4Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            intent.putExtra("key_mv_feed_id", str);
            if (xs4Var == null || (str2 = xs4Var.m75945x2fec8307(1)) == null) {
                str2 = "";
            }
            intent.putExtra("key_mv_nonce_id", str2);
            if (xs4Var == null || (str3 = xs4Var.m75945x2fec8307(2)) == null) {
                str3 = "";
            }
            intent.putExtra("key_mv_cover_url", str3);
            if (xs4Var == null || (str4 = xs4Var.m75945x2fec8307(3)) == null) {
                str4 = "";
            }
            intent.putExtra("key_mv_poster", str4);
            if (xs4Var == null || (str5 = xs4Var.m75945x2fec8307(14)) == null) {
                str5 = "";
            }
            intent.putExtra("key_mv_song_name", str5);
            if (xs4Var == null || (str6 = xs4Var.m75945x2fec8307(15)) == null) {
                str6 = "";
            }
            intent.putExtra("key_mv_song_lyric", str6);
            if (xs4Var == null || (str7 = xs4Var.m75945x2fec8307(4)) == null) {
                str7 = "";
            }
            intent.putExtra("key_mv_singer_name", str7);
            if (xs4Var == null || (str8 = xs4Var.m75945x2fec8307(5)) == null) {
                str8 = "";
            }
            intent.putExtra("key_mv_album_name", str8);
            if (xs4Var == null || (str9 = xs4Var.m75945x2fec8307(7)) == null) {
                str9 = "";
            }
            intent.putExtra("key_mv_music_genre", str9);
            if (xs4Var == null || (str10 = java.lang.Long.valueOf(xs4Var.m75942xfb822ef2(8)).toString()) == null) {
                str10 = "";
            }
            intent.putExtra("key_mv_issue_date", str10);
            if (xs4Var == null || (str11 = xs4Var.m75945x2fec8307(16)) == null) {
                str11 = "";
            }
            intent.putExtra("key_mv_album_cover_url", str11);
            if (xs4Var == null || (str12 = xs4Var.m75945x2fec8307(9)) == null) {
                str12 = "";
            }
            intent.putExtra("key_mv_identification", str12);
            if (xs4Var == null || (str13 = xs4Var.m75945x2fec8307(6)) == null) {
                str13 = "";
            }
            intent.putExtra("key_mv_extra_info", str13);
            intent.putExtra("key_mv_music_duration", xs4Var != null ? xs4Var.m75939xb282bd08(10) : 0);
            if (xs4Var == null || (str14 = xs4Var.m75945x2fec8307(13)) == null) {
                str14 = "";
            }
            intent.putExtra("key_mv_thumb_path", str14);
            if (xs4Var == null || (str15 = xs4Var.m75945x2fec8307(12)) == null) {
                str15 = "";
            }
            intent.putExtra("key_mv_music_operation_url", str15);
            if (xs4Var != null && (m75945x2fec8307 = xs4Var.m75945x2fec8307(11)) != null) {
                str16 = m75945x2fec8307;
            }
            intent.putExtra("key_mv_song_mid", str16);
            intent.setFlags(268435456);
        }
        return intent;
    }

    public void t0() {
        this.f400692w = true;
        boolean u17 = u();
        boolean c17 = b21.m.c();
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "onStop canAddMusicBall: %s, inMusicPlayerPage: %s, hasCurrentBall: %s, playingMusic: %s, hasPermission: %s", java.lang.Boolean.valueOf(this.f400693x), java.lang.Boolean.valueOf(this.f400691v), java.lang.Boolean.valueOf(u17), java.lang.Boolean.valueOf(c17), java.lang.Boolean.valueOf(Ui));
        if (!Ui || !this.f400693x || this.f400691v || u17) {
            return;
        }
        super.e0(b21.m.b());
    }

    public final void u0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = this.f174665d.f174587o;
        if (ballButtonInfo.f174602d != z17) {
            ballButtonInfo.f174602d = z17;
            ballButtonInfo.f174603e = true;
            ballButtonInfo.f174606h = true;
            S(ballButtonInfo);
        }
    }

    public final void v0(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "updateMusicCoverPath %s, notify: %s", str, java.lang.Boolean.valueOf(z17));
        this.f400687r = str;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 c16629x1032f0d1 = this.f400685p;
            if (c16629x1032f0d1 != null) {
                c16629x1032f0d1.m67227xd1bfaa3a(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = this.f174665d.f174588p;
            ballBlurInfo.f174599d = str;
            R(ballBlurInfo);
        }
    }

    public final void w0(android.os.Bundle bundle) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400686q, bundle)) {
            return;
        }
        this.f400686q = bundle;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = bundle != null ? java.lang.Integer.valueOf(bundle.hashCode()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "updateMusicMvUIExtra hashCode: %s", objArr);
        for (ll3.c1 c1Var : this.f400684o) {
            if (c1Var != null) {
                android.os.Bundle bundle2 = this.f400686q;
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.c) c1Var).f232169a;
                eVar.f232174b = bundle2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a17 = kl3.t.g().a();
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "musicPlayer is null, return");
                } else {
                    ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
                    if (z17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "music is null, return");
                    } else if (eVar.f232175c != null && a17.g()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotification", "update notification");
                        eVar.f232176d.notify(291, eVar.a(eVar.f232175c, z17, a17.i()));
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        super.x();
        this.f400691v = true;
        this.f400692w = false;
        if (u()) {
            W(true);
        }
    }

    public final void x0(r45.xs4 xs4Var) {
        this.f400688s = xs4Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = xs4Var != null ? java.lang.Integer.valueOf(xs4Var.hashCode()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "updateMusicShareObject hashCode: %s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        super.z();
        this.f400691v = false;
        if (u() && this.f174665d.f174578J) {
            W(false);
        }
    }
}
