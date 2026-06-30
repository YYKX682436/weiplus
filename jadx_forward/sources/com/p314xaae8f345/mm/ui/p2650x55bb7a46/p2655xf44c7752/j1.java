package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public abstract class j1 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e implements fk4.t {

    /* renamed from: i, reason: collision with root package name */
    public static ot0.m1 f282574i;

    /* renamed from: e, reason: collision with root package name */
    public yd5.p f282575e;

    /* renamed from: f, reason: collision with root package name */
    public yd5.p f282576f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f282577g;

    /* renamed from: h, reason: collision with root package name */
    public int f282578h;

    public j1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var) {
        super(k1Var);
        this.f282575e = null;
        this.f282576f = null;
        this.f282577g = new java.util.HashMap();
        this.f282578h = 0;
        f282574i = null;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.f9 q(java.lang.String str, android.app.Activity activity) {
        ot0.m1 m1Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.m124850x7650bebc(486539313);
        f9Var.u1(str);
        f9Var.f275464k2 = true;
        if (f282574i == null) {
            byte[] byteArrayExtra = activity.getIntent().getByteArrayExtra("img_gallery_mp_share_video_info");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(byteArrayExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Imagegallery.handler.video", "initMPShareVideoInfo data is null");
                activity.finish();
                m1Var = null;
                f9Var.f275463j2 = m1Var;
                f9Var.i1(activity.getIntent().getStringExtra("img_gallery_path"));
                return f9Var;
            }
            try {
                ot0.m1 m1Var2 = new ot0.m1();
                m1Var2.mo11468x92b714fd(byteArrayExtra);
                f282574i = m1Var2;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Imagegallery.handler.video", "initMPShareVideoInfo ex %s", e17.getMessage());
                activity.finish();
            }
        }
        m1Var = f282574i;
        f9Var.f275463j2 = m1Var;
        f9Var.i1(activity.getIntent().getStringExtra("img_gallery_path"));
        return f9Var;
    }

    public static ot0.m1 r(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.m1 m1Var;
        if (f9Var.D2()) {
            return new ot0.m1().b(f9Var.f275463j2);
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Imagegallery.handler.video", "getVideoInfo content is null");
            return null;
        }
        ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
        if (fVar == null || (m1Var = fVar.f429998l) == null) {
            return null;
        }
        return m1Var;
    }

    public static t21.v2 s(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(f9Var)) {
            return null;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        return t21.d3.h(z07);
    }

    public static t21.v2 t(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        t21.v2 s17 = s(f9Var);
        if (s17 != null) {
            return s17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "insert video info:" + f9Var.toString());
        t21.v2 v2Var = new t21.v2();
        v2Var.f496552q = f9Var.Q0();
        v2Var.f496533a = f9Var.z0();
        v2Var.f496545j = f9Var.mo78012x3fdd41df() <= 0 ? java.lang.System.currentTimeMillis() : f9Var.mo78012x3fdd41df();
        v2Var.f496537c = f9Var.I0();
        v2Var.f496558w = f9Var.j();
        v2Var.f496549n = f9Var.m124847x74d37ac6();
        v2Var.n(f9Var.Q0());
        ot0.m1 r17 = r(f9Var);
        if (r17 != null) {
            if (android.text.TextUtils.isEmpty(f9Var.z0())) {
                java.lang.String Q0 = f9Var.Q0();
                kk.l lVar = t21.w2.f496589c;
                java.lang.String a17 = t21.c3.a(Q0);
                if (!pt0.f0.f439742b1.i()) {
                    f9Var.i1(a17);
                }
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
            }
            v2Var.f496533a = f9Var.z0();
            java.lang.String a18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.eb.f282435a.a(r17.c(f9Var.z0()));
            java.lang.String str = r17.f454873e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            v2Var.p(a18 == null ? str : a18, r17.f454877i, r17.f454875g, r17.f454872d, "", "", "");
            v2Var.f496544i = 111;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().x(v2Var, true);
        return v2Var;
    }

    public abstract void A(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17);

    public abstract void B(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, boolean z17);

    @Override // fk4.t
    public void a(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (l17 == null || !z17) {
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.a(l17.longValue()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, downloader is null, ignore it");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f282419d;
        if (k1Var == null || k1Var.f282625g == null || this.f282578h != 0) {
            return;
        }
        if (l17.longValue() == k1Var.w().m124847x74d37ac6() && j18 > 0) {
            int round = java.lang.Math.round((((float) j17) * 100.0f) / ((float) j18));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282419d.f282625g;
            viewOnClickListenerC21748xb3d38e6b.getClass();
            t23.p0.n().c(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b8(viewOnClickListenerC21748xb3d38e6b, round));
        }
    }

    @Override // fk4.t
    public void b(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "onDataAvailable, it's not origin video task, return");
    }

    @Override // fk4.t
    public void c(java.lang.Long l17, int i17, boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17;
        if (l17 == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, it's not origin video task, return");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l lVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a;
        boolean b17 = lVar.b(l17.longValue());
        fk4.k d17 = lVar.d(l17.longValue());
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, downloader is null, ignore it");
            return;
        }
        d17.f345157l = null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f282419d;
        if (k1Var == null || k1Var.f282625g == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 w17 = k1Var.w();
        if (l17.longValue() != w17.m124847x74d37ac6() || (v17 = this.f282419d.v()) == null || v17.f282971p == null) {
            return;
        }
        yd5.p pVar = this.f282576f;
        if (pVar != null) {
            pVar.f542668g.f143135l = a06.d.c(((float) (java.lang.System.currentTimeMillis() - pVar.f542667f)) / 1000.0f);
            this.f282576f.a();
            this.f282576f = null;
        }
        v17.f282956a.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h1(this, i17, b17, v17, w17));
    }

    @Override // fk4.t
    public void d(java.lang.Long l17, boolean z17) {
        if (l17 == null || z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "onStopDownload, it's not origin video task, return");
    }

    @Override // fk4.t
    public void e(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "onMoovReady, it's not origin video task, return");
    }

    @Override // fk4.t
    public void g(java.lang.Long l17, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video", "onStartDownload, it's not origin video task, return");
    }

    public abstract void n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var);

    public abstract void p();

    public void u(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar) {
        if (taVar != null) {
            taVar.d();
            taVar.d();
            taVar.f282974s.setVisibility(8);
        }
    }

    public abstract void v(int i17, int i18);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void w(int i17);

    public void x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, java.lang.String str) {
        if (taVar != null) {
            taVar.d();
            if (this.f282419d == null) {
                return;
            }
            taVar.d();
            taVar.f282974s.setVisibility(0);
            taVar.d();
            android.widget.TextView textView = taVar.f282975t;
            java.lang.String string = this.f282419d.f282625g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7w);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = string;
            }
            textView.setText(str);
            taVar.d();
            taVar.f282969n.setVisibility(0);
            taVar.d();
            taVar.f282970o.setVisibility(8);
            y(taVar);
        }
    }

    public abstract void y(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void z();
}
