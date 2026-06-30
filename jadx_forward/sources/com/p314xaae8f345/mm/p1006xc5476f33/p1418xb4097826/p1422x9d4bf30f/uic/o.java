package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class o extends x92.r {
    public android.widget.TextView A;
    public android.widget.TextView B;
    public android.widget.RelativeLayout C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.ProgressBar F;
    public android.widget.RelativeLayout G;
    public android.widget.TextView H;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f183447J;
    public android.widget.LinearLayout K;
    public android.view.View L;
    public y9.i M;
    public java.lang.String N;
    public java.lang.String P;
    public java.lang.String Q;
    public int R;
    public java.lang.String S;
    public long T;
    public boolean U;
    public boolean V;
    public final java.text.DecimalFormat W;
    public org.json.JSONObject X;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f183448g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f183449h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f183450i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f183451m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f183452n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f183453o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f183454p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f183455q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f183456r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f183457s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f183458t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.RelativeLayout f183459u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f183460v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f183461w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f183462x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f183463y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f183464z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.N = "";
        this.P = "";
        this.Q = "";
        this.S = "";
        this.V = true;
        this.W = new java.text.DecimalFormat("0.##");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o r43) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o.V6(com.tencent.mm.plugin.finder.activity.uic.o):void");
    }

    @Override // x92.r
    public void O6(int i17, java.lang.String str) {
        android.widget.FrameLayout frameLayout = this.f534253e;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // x92.r
    public void Q6() {
        super.Q6();
        android.content.Intent intent = m80379x76847179().getIntent();
        this.N = intent.getStringExtra("key_nick_name");
        this.P = intent.getStringExtra("key_activity_name");
        this.Q = intent.getStringExtra("key_activity_desc");
        this.S = intent.getStringExtra("key_avatar_url");
        this.R = intent.getIntExtra("key_activity_participate_count", 0);
        this.T = intent.getLongExtra("key_activity_id", 0L);
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        android.widget.FrameLayout frameLayout = this.f534253e;
        if (frameLayout != null) {
            this.f183448g = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f564143j9);
            this.K = (android.widget.LinearLayout) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.cg8);
            this.f183449h = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f564126iq);
            this.f183450i = (android.widget.ImageView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f564125ip);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f564130iw);
            if (textView != null) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView = null;
            }
            this.f183447J = textView;
            android.widget.TextView textView2 = this.f183449h;
            if (textView2 != null) {
                textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(textView2.getContext()));
            }
            this.f183455q = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f564123in);
            this.f183456r = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f564121il);
            this.f183460v = (android.widget.LinearLayout) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564110i9);
            this.f183461w = (android.widget.TextView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564147jd);
            this.f183462x = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564145jb);
            this.f183463y = (android.widget.ImageView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564144ja);
            this.f183464z = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.fz7);
            this.f183459u = (android.widget.RelativeLayout) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f81551if);
            this.A = (android.widget.TextView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564111ia);
            this.B = (android.widget.TextView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.i_);
            this.f183457s = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.fcr);
            this.f183458t = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.ema);
            this.C = (android.widget.RelativeLayout) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564113ic);
            this.D = (android.widget.TextView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564115ie);
            this.E = (android.widget.TextView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564114id);
            this.F = (android.widget.ProgressBar) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564112ib);
            this.G = (android.widget.RelativeLayout) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f565954e82);
            this.H = (android.widget.TextView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f565955e83);
            this.I = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.fwz);
            android.widget.RelativeLayout relativeLayout = this.G;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.d(this));
            }
            android.widget.LinearLayout linearLayout = this.f183460v;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.e(this));
                s92.g.d(s92.g.f486539a, m158354x19263085(), linearLayout, "activity_link", 0, 8, null);
            }
            android.widget.ImageView imageView = this.f183450i;
            if (imageView != null) {
                imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.f(this));
            }
            this.L = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.it);
            this.f183451m = (android.widget.LinearLayout) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564131ix);
            this.f183452n = (android.widget.ImageView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564132iy);
            this.f183454p = (android.widget.TextView) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564134j0);
            this.f183453o = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564133iz);
            e7();
        }
    }

    @Override // x92.r
    public void T6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) fVar;
        super.T6(r03Var);
        if (!this.U) {
            a7();
            this.U = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        long m75942xfb822ef2 = (r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null) ? 0L : e21Var.m75942xfb822ef2(0);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        o3Var.Dk(1L, 1L, m75942xfb822ef2, nyVar != null ? nyVar.V6() : null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(m158354x19263085(), s92.g.f486539a.b(m158354x19263085()));
    }

    @Override // x92.r
    public void U6() {
        r45.e21 e21Var;
        java.lang.String str;
        z5();
        r45.r03 r03Var = (r45.r03) this.f534252d;
        if (r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null) {
            return;
        }
        this.P = e21Var.m75945x2fec8307(2);
        this.Q = e21Var.m75945x2fec8307(3);
        r45.r03 r03Var2 = (r45.r03) this.f534252d;
        this.R = r03Var2 != null ? r03Var2.m75939xb282bd08(2) : 0;
        this.T = e21Var.m75942xfb822ef2(0);
        e21Var.m75942xfb822ef2(6);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
        this.N = c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
        this.S = c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76175x6d346f39() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityEventUIC", "avatarUrl: " + this.S + " activityParticipateCount:" + this.R + " coverUrl:" + e21Var.m75945x2fec8307(5) + " nickName:" + this.N + " activityParticipateCount:" + this.R + " displayMask:" + e21Var.m75942xfb822ef2(17));
        if (hc2.a0.c(e21Var.m75942xfb822ef2(17))) {
            android.widget.LinearLayout linearLayout = this.K;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            android.widget.LinearLayout linearLayout2 = this.K;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        e7();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) e21Var.m75936x14adae67(15);
        s92.g gVar = s92.g.f486539a;
        if (c19786x6a1e2862 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityEventUIC", "showJumpView by jumpInfo");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19786x6a1e2862.m76523x98b23862())) {
                android.widget.LinearLayout linearLayout3 = this.f183460v;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
            } else {
                android.widget.LinearLayout linearLayout4 = this.f183460v;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                android.widget.TextView textView = this.f183461w;
                if (textView != null) {
                    textView.setText(c19786x6a1e2862.m76523x98b23862());
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f183462x;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(8);
                }
                android.widget.ImageView imageView = this.f183463y;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                android.widget.ImageView imageView2 = this.f183463y;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.e().b(new mn2.q3(c19786x6a1e2862.m76497x4fe38a1f(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411497r)).c(imageView2);
                }
                s92.g.c(gVar, m80379x76847179(), "feed_jumpicon", 0, 0, 0, null, null, 120, null);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e21Var.m75945x2fec8307(9))) {
            android.widget.LinearLayout linearLayout5 = this.f183460v;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
        } else {
            android.widget.LinearLayout linearLayout6 = this.f183460v;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
            android.widget.TextView textView2 = this.f183461w;
            if (textView2 != null) {
                textView2.setText(e21Var.m75945x2fec8307(11));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f183462x;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(0);
            }
            android.widget.ImageView imageView3 = this.f183463y;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            s92.g.c(gVar, m80379x76847179(), "link_miniprogram", 0, 0, 0, null, null, 120, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityEventUIC", "showQuestInfo");
        if (((r45.g21) e21Var.m75936x14adae67(29)) == null) {
            android.widget.RelativeLayout relativeLayout = this.f183459u;
            if (relativeLayout == null) {
                return;
            }
            relativeLayout.setVisibility(8);
            return;
        }
        r45.g21 g21Var = (r45.g21) e21Var.m75936x14adae67(29);
        boolean z17 = g21Var != null && g21Var.m75942xfb822ef2(0) == 0;
        java.text.DecimalFormat decimalFormat = this.W;
        if (z17) {
            android.widget.TextView textView3 = this.B;
            if (textView3 != null) {
                textView3.setText(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lst));
            }
        } else {
            r45.g21 g21Var2 = (r45.g21) e21Var.m75936x14adae67(29);
            java.math.BigDecimal divide = new java.math.BigDecimal(g21Var2 != null ? g21Var2.m75942xfb822ef2(0) : 0L).divide(new java.math.BigDecimal(100));
            decimalFormat.setRoundingMode(java.math.RoundingMode.DOWN);
            java.lang.String string = m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lpx, decimalFormat.format(divide.doubleValue()));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            r45.g21 g21Var3 = (r45.g21) e21Var.m75936x14adae67(29);
            java.lang.String m75945x2fec8307 = g21Var3 != null ? g21Var3.m75945x2fec8307(3) : null;
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string);
                r45.g21 g21Var4 = (r45.g21) e21Var.m75936x14adae67(29);
                sb6.append(g21Var4 != null ? g21Var4.m75945x2fec8307(3) : null);
                string = sb6.toString();
            }
            android.widget.TextView textView4 = this.B;
            if (textView4 != null) {
                textView4.setText(string);
            }
        }
        r45.g21 g21Var5 = (r45.g21) e21Var.m75936x14adae67(29);
        if (g21Var5 == null || (str = g21Var5.m75945x2fec8307(2)) == null) {
            str = "";
        }
        if (str.length() == 0) {
            android.widget.TextView textView5 = this.D;
            if (textView5 != null) {
                textView5.setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cjj));
            }
            android.widget.ProgressBar progressBar = this.F;
            if (progressBar != null) {
                r45.g21 g21Var6 = (r45.g21) e21Var.m75936x14adae67(29);
                progressBar.setProgress((g21Var6 != null ? g21Var6.m75939xb282bd08(1) : 0) / 100);
            }
            android.widget.TextView textView6 = this.E;
            if (textView6 != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(decimalFormat.format(java.lang.Float.valueOf((((r45.g21) e21Var.m75936x14adae67(29)) != null ? r1.m75939xb282bd08(1) : 0) / 100.0f)));
                sb7.append('%');
                textView6.setText(sb7.toString());
            }
            android.widget.TextView textView7 = this.E;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            android.widget.ProgressBar progressBar2 = this.F;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else {
            android.widget.TextView textView8 = this.D;
            if (textView8 != null) {
                textView8.setText(str);
            }
            android.widget.TextView textView9 = this.E;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
            android.widget.ProgressBar progressBar3 = this.F;
            if (progressBar3 != null) {
                progressBar3.setVisibility(8);
            }
        }
        android.widget.TextView textView10 = this.B;
        if (textView10 != null) {
            textView10.setVisibility(0);
        }
        android.widget.TextView textView11 = this.A;
        if (textView11 != null) {
            textView11.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout2 = this.C;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout3 = this.f183459u;
        if (relativeLayout3 == null) {
            return;
        }
        relativeLayout3.setVisibility(0);
    }

    public final void W6(android.content.Context context, long j17, r45.e21 e21Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, java.lang.String str) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        if (c19786x6a1e2862.m76503x92bc3c07() == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = "";
            if (e21Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1)) == null || (str2 = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(':');
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            if (e21Var != null && (m75945x2fec8307 = e21Var.m75945x2fec8307(9)) != null) {
                str3 = m75945x2fec8307;
            }
            o3Var.Ek(str3, 2, V6, pm0.v.u(j17));
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534783l = sb7;
            xc2.y2.P(xc2.y2.f534876a, context, p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, false, null, 0.0f, 56, null);
        } else {
            xc2.y2.i(xc2.y2.f534876a, context, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
        }
        s92.g.c(s92.g.f486539a, context, str, 1, 0, 0, e21Var, null, 88, null);
    }

    public final void X6(android.content.Context context, long j17, r45.e21 e21Var) {
        java.lang.String str;
        if (e21Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(':');
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            java.lang.String m75945x2fec8307 = e21Var.m75945x2fec8307(9);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            o3Var.Ek(m75945x2fec8307, 2, nyVar != null ? nyVar.V6() : null, pm0.v.u(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            java.lang.String m75945x2fec83072 = e21Var.m75945x2fec8307(9);
            java.lang.String str2 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
            java.lang.String m75945x2fec83073 = e21Var.m75945x2fec8307(10);
            i0Var.ll(context, str2, m75945x2fec83073 == null ? "" : m75945x2fec83073, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, sb7);
            s92.g.c(s92.g.f486539a, context, "link_miniprogram", 1, 0, 0, e21Var, null, 88, null);
        }
    }

    public final void Y6(android.content.Context context, r45.e21 e21Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_udf_kv", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 1, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
        s92.g.c(s92.g.f486539a, context, str3, i17, i18, i19, e21Var, null, 64, null);
    }

    public final void a7() {
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) this.f534252d;
        java.lang.String m75945x2fec8307 = (r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null) ? null : e21Var.m75945x2fec8307(9);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        o3Var.Ek(m75945x2fec8307, 1, nyVar != null ? nyVar.V6() : null, pm0.v.u(this.T));
    }

    @Override // x92.r, x92.q
    public void b2() {
        android.widget.TextView textView = this.f183448g;
        if (textView != null) {
            textView.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        d7(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d), m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        android.view.View view = this.f183453o;
        if (view != null) {
            view.setBackgroundColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        }
        android.widget.RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.abm);
        }
        android.widget.ProgressBar progressBar = this.F;
        if (progressBar != null) {
            progressBar.setProgressDrawable(m80379x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563052vf));
        }
        android.widget.LinearLayout linearLayout = this.f183460v;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackground(m80379x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.abm));
    }

    public final void b7(android.widget.TextView textView, java.lang.String str, int i17, int i18, yz5.l lVar) {
        int i19;
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        android.view.View view = this.L;
        if (view == null) {
            i19 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            i19 = 0;
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564128is)).m82040x7541828(i17);
        int dimension = (int) m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.widget.TextView textView2 = this.f183449h;
        if (textView2 != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt = textView2.getPaint().getFontMetricsInt();
            int i27 = ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - (dimension / 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityEventUIC", "gap :" + i27);
            android.view.View view2 = this.L;
            android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = i27;
                layoutParams2.leftMargin = i18;
                android.view.View view3 = this.L;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams2);
                }
            }
        }
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(str, i17, m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.g(lVar)), i19, str.length(), 17);
        textView.setText(spannableString);
    }

    public final void c7(android.widget.TextView textView, android.widget.TextView textView2) {
        r45.e21 e21Var;
        r45.e21 e21Var2;
        r45.r03 r03Var = (r45.r03) this.f534252d;
        long j17 = 0;
        long m75942xfb822ef2 = (r03Var == null || (e21Var2 = (r45.e21) r03Var.m75936x14adae67(16)) == null) ? 0L : e21Var2.m75942xfb822ef2(13);
        if (m75942xfb822ef2 != 0) {
            r45.r03 r03Var2 = (r45.r03) this.f534252d;
            if (r03Var2 != null && (e21Var = (r45.e21) r03Var2.m75936x14adae67(16)) != null) {
                j17 = e21Var.m75942xfb822ef2(17);
            }
            if ((j17 & 2) != 2) {
                if (textView != null) {
                    textView.setVisibility(0);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (textView2 == null) {
                    return;
                }
                textView2.setText(hc2.i.b(m80379x76847179(), m75942xfb822ef2 * 1000, com.p314xaae8f345.mm.R.C30867xcad56011.cmv));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityEventUIC", "no endTime");
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void d7(int i17, int i18) {
        android.widget.TextView textView = this.f183447J;
        if (textView != null) {
            textView.setTextColor(i18);
        }
        android.widget.TextView textView2 = this.f183449h;
        if (textView2 != null) {
            textView2.setTextColor(i18);
        }
        android.widget.TextView textView3 = this.f183456r;
        if (textView3 != null) {
            textView3.setTextColor(i18);
        }
        android.widget.TextView textView4 = this.f183454p;
        if (textView4 != null) {
            textView4.setTextColor(i18);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.I;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(i18);
        }
        android.widget.TextView textView5 = this.f183455q;
        if (textView5 != null) {
            textView5.setTextColor(i17);
        }
        android.widget.TextView textView6 = this.f183456r;
        if (textView6 != null) {
            textView6.setTextColor(i18);
        }
        android.widget.TextView textView7 = this.A;
        if (textView7 != null) {
            textView7.setTextColor(i17);
        }
        android.widget.TextView textView8 = this.B;
        if (textView8 != null) {
            textView8.setTextColor(i18);
        }
        android.widget.TextView textView9 = this.D;
        if (textView9 != null) {
            textView9.setTextColor(i17);
        }
        android.widget.TextView textView10 = this.E;
        if (textView10 != null) {
            textView10.setTextColor(i18);
        }
        android.widget.TextView textView11 = this.H;
        if (textView11 != null) {
            textView11.setTextColor(i17);
        }
        android.widget.TextView textView12 = this.f183461w;
        if (textView12 != null) {
            textView12.setTextColor(i18);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f183462x;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(i18);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f183464z;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.m82040x7541828(i18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7() {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o.e7():void");
    }

    @Override // x92.r, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityParamStore", "reset");
        s92.b.f486524b = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityParamStore", "reset");
        s92.b.f486524b = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.X = null;
        if (this.V) {
            this.V = false;
        } else {
            a7();
        }
    }

    @Override // x92.r, x92.q
    /* renamed from: setNormalStyle */
    public void mo55425x60022348() {
        d7(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        android.view.View view = this.f183453o;
        if (view != null) {
            view.setBackgroundColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
        android.widget.RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.abl);
        }
        android.widget.ProgressBar progressBar = this.F;
        if (progressBar != null) {
            progressBar.setProgressDrawable(m80379x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563051ve));
        }
        android.widget.LinearLayout linearLayout = this.f183460v;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackground(m80379x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.abp));
    }
}
