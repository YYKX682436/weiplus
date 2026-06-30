package com.tencent.mm.plugin.finder.activity.uic;

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
    public com.tencent.mm.ui.widget.imageview.WeImageView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f101914J;
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
    public android.widget.TextView f101915g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f101916h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f101917i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f101918m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f101919n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f101920o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f101921p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f101922q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f101923r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f101924s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f101925t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.RelativeLayout f101926u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f101927v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f101928w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f101929x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f101930y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f101931z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
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
    public static final void V6(com.tencent.mm.plugin.finder.activity.uic.o r43) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.uic.o.V6(com.tencent.mm.plugin.finder.activity.uic.o):void");
    }

    @Override // x92.r
    public void O6(int i17, java.lang.String str) {
        android.widget.FrameLayout frameLayout = this.f452720e;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // x92.r
    public void Q6() {
        super.Q6();
        android.content.Intent intent = getContext().getIntent();
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
        android.widget.FrameLayout frameLayout = this.f452720e;
        if (frameLayout != null) {
            this.f101915g = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.f482610j9);
            this.K = (android.widget.LinearLayout) frameLayout.findViewById(com.tencent.mm.R.id.cg8);
            this.f101916h = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.f482593iq);
            this.f101917i = (android.widget.ImageView) frameLayout.findViewById(com.tencent.mm.R.id.f482592ip);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.f482597iw);
            if (textView != null) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView = null;
            }
            this.f101914J = textView;
            android.widget.TextView textView2 = this.f101916h;
            if (textView2 != null) {
                textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(textView2.getContext()));
            }
            this.f101922q = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.f482590in);
            this.f101923r = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.f482588il);
            this.f101927v = (android.widget.LinearLayout) getContext().findViewById(com.tencent.mm.R.id.f482577i9);
            this.f101928w = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.f482614jd);
            this.f101929x = (com.tencent.mm.ui.widget.imageview.WeImageView) getContext().findViewById(com.tencent.mm.R.id.f482612jb);
            this.f101930y = (android.widget.ImageView) getContext().findViewById(com.tencent.mm.R.id.f482611ja);
            this.f101931z = (com.tencent.mm.ui.widget.imageview.WeImageView) getContext().findViewById(com.tencent.mm.R.id.fz7);
            this.f101926u = (android.widget.RelativeLayout) getContext().findViewById(com.tencent.mm.R.id.f18if);
            this.A = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.f482578ia);
            this.B = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.i_);
            this.f101924s = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.fcr);
            this.f101925t = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.ema);
            this.C = (android.widget.RelativeLayout) getContext().findViewById(com.tencent.mm.R.id.f482580ic);
            this.D = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.f482582ie);
            this.E = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.f482581id);
            this.F = (android.widget.ProgressBar) getContext().findViewById(com.tencent.mm.R.id.f482579ib);
            this.G = (android.widget.RelativeLayout) getContext().findViewById(com.tencent.mm.R.id.f484421e82);
            this.H = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.f484422e83);
            this.I = (com.tencent.mm.ui.widget.imageview.WeImageView) getContext().findViewById(com.tencent.mm.R.id.fwz);
            android.widget.RelativeLayout relativeLayout = this.G;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.d(this));
            }
            android.widget.LinearLayout linearLayout = this.f101927v;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.e(this));
                s92.g.d(s92.g.f405006a, getActivity(), linearLayout, "activity_link", 0, 8, null);
            }
            android.widget.ImageView imageView = this.f101917i;
            if (imageView != null) {
                imageView.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.f(this));
            }
            this.L = getContext().findViewById(com.tencent.mm.R.id.it);
            this.f101918m = (android.widget.LinearLayout) getContext().findViewById(com.tencent.mm.R.id.f482598ix);
            this.f101919n = (android.widget.ImageView) getContext().findViewById(com.tencent.mm.R.id.f482599iy);
            this.f101921p = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.f482601j0);
            this.f101920o = getContext().findViewById(com.tencent.mm.R.id.f482600iz);
            e7();
        }
    }

    @Override // x92.r
    public void T6(com.tencent.mm.protobuf.f fVar) {
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) fVar;
        super.T6(r03Var);
        if (!this.U) {
            a7();
            this.U = true;
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long j17 = (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null) ? 0L : e21Var.getLong(0);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        o3Var.Dk(1L, 1L, j17, nyVar != null ? nyVar.V6() : null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(getActivity(), s92.g.f405006a.b(getActivity()));
    }

    @Override // x92.r
    public void U6() {
        r45.e21 e21Var;
        java.lang.String str;
        z5();
        r45.r03 r03Var = (r45.r03) this.f452719d;
        if (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null) {
            return;
        }
        this.P = e21Var.getString(2);
        this.Q = e21Var.getString(3);
        r45.r03 r03Var2 = (r45.r03) this.f452719d;
        this.R = r03Var2 != null ? r03Var2.getInteger(2) : 0;
        this.T = e21Var.getLong(0);
        e21Var.getLong(6);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
        this.N = finderContact != null ? finderContact.getNickname() : null;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
        this.S = finderContact2 != null ? finderContact2.getHeadUrl() : null;
        com.tencent.mars.xlog.Log.i("FinderActivityEventUIC", "avatarUrl: " + this.S + " activityParticipateCount:" + this.R + " coverUrl:" + e21Var.getString(5) + " nickName:" + this.N + " activityParticipateCount:" + this.R + " displayMask:" + e21Var.getLong(17));
        if (hc2.a0.c(e21Var.getLong(17))) {
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
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e21Var.getCustom(15);
        s92.g gVar = s92.g.f405006a;
        if (finderJumpInfo != null) {
            com.tencent.mars.xlog.Log.i("FinderActivityEventUIC", "showJumpView by jumpInfo");
            if (com.tencent.mm.sdk.platformtools.t8.K0(finderJumpInfo.getWording())) {
                android.widget.LinearLayout linearLayout3 = this.f101927v;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
            } else {
                android.widget.LinearLayout linearLayout4 = this.f101927v;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                android.widget.TextView textView = this.f101928w;
                if (textView != null) {
                    textView.setText(finderJumpInfo.getWording());
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f101929x;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                android.widget.ImageView imageView = this.f101930y;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                android.widget.ImageView imageView2 = this.f101930y;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.e().b(new mn2.q3(finderJumpInfo.getIcon_url(), com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329964r)).c(imageView2);
                }
                s92.g.c(gVar, getContext(), "feed_jumpicon", 0, 0, 0, null, null, 120, null);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(e21Var.getString(9))) {
            android.widget.LinearLayout linearLayout5 = this.f101927v;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
        } else {
            android.widget.LinearLayout linearLayout6 = this.f101927v;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
            android.widget.TextView textView2 = this.f101928w;
            if (textView2 != null) {
                textView2.setText(e21Var.getString(11));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f101929x;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            android.widget.ImageView imageView3 = this.f101930y;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            s92.g.c(gVar, getContext(), "link_miniprogram", 0, 0, 0, null, null, 120, null);
        }
        com.tencent.mars.xlog.Log.i("FinderActivityEventUIC", "showQuestInfo");
        if (((r45.g21) e21Var.getCustom(29)) == null) {
            android.widget.RelativeLayout relativeLayout = this.f101926u;
            if (relativeLayout == null) {
                return;
            }
            relativeLayout.setVisibility(8);
            return;
        }
        r45.g21 g21Var = (r45.g21) e21Var.getCustom(29);
        boolean z17 = g21Var != null && g21Var.getLong(0) == 0;
        java.text.DecimalFormat decimalFormat = this.W;
        if (z17) {
            android.widget.TextView textView3 = this.B;
            if (textView3 != null) {
                textView3.setText(getActivity().getResources().getString(com.tencent.mm.R.string.lst));
            }
        } else {
            r45.g21 g21Var2 = (r45.g21) e21Var.getCustom(29);
            java.math.BigDecimal divide = new java.math.BigDecimal(g21Var2 != null ? g21Var2.getLong(0) : 0L).divide(new java.math.BigDecimal(100));
            decimalFormat.setRoundingMode(java.math.RoundingMode.DOWN);
            java.lang.String string = getActivity().getResources().getString(com.tencent.mm.R.string.lpx, decimalFormat.format(divide.doubleValue()));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            r45.g21 g21Var3 = (r45.g21) e21Var.getCustom(29);
            java.lang.String string2 = g21Var3 != null ? g21Var3.getString(3) : null;
            if (!(string2 == null || string2.length() == 0)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string);
                r45.g21 g21Var4 = (r45.g21) e21Var.getCustom(29);
                sb6.append(g21Var4 != null ? g21Var4.getString(3) : null);
                string = sb6.toString();
            }
            android.widget.TextView textView4 = this.B;
            if (textView4 != null) {
                textView4.setText(string);
            }
        }
        r45.g21 g21Var5 = (r45.g21) e21Var.getCustom(29);
        if (g21Var5 == null || (str = g21Var5.getString(2)) == null) {
            str = "";
        }
        if (str.length() == 0) {
            android.widget.TextView textView5 = this.D;
            if (textView5 != null) {
                textView5.setText(getString(com.tencent.mm.R.string.cjj));
            }
            android.widget.ProgressBar progressBar = this.F;
            if (progressBar != null) {
                r45.g21 g21Var6 = (r45.g21) e21Var.getCustom(29);
                progressBar.setProgress((g21Var6 != null ? g21Var6.getInteger(1) : 0) / 100);
            }
            android.widget.TextView textView6 = this.E;
            if (textView6 != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(decimalFormat.format(java.lang.Float.valueOf((((r45.g21) e21Var.getCustom(29)) != null ? r1.getInteger(1) : 0) / 100.0f)));
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
        android.widget.RelativeLayout relativeLayout3 = this.f101926u;
        if (relativeLayout3 == null) {
            return;
        }
        relativeLayout3.setVisibility(0);
    }

    public final void W6(android.content.Context context, long j17, r45.e21 e21Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str) {
        java.lang.String str2;
        java.lang.String string;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        if (finderJumpInfo.getJumpinfo_type() == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = "";
            if (e21Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null || (str2 = finderContact.getUsername()) == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(':');
            sb6.append(com.tencent.mm.sdk.platformtools.t8.s0());
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            if (e21Var != null && (string = e21Var.getString(9)) != null) {
                str3 = string;
            }
            o3Var.Ek(str3, 2, V6, pm0.v.u(j17));
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453250l = sb7;
            xc2.y2.P(xc2.y2.f453343a, context, p0Var, com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, false, null, 0.0f, 56, null);
        } else {
            xc2.y2.i(xc2.y2.f453343a, context, new xc2.p0(finderJumpInfo), 0, null, 12, null);
        }
        s92.g.c(s92.g.f405006a, context, str, 1, 0, 0, e21Var, null, 88, null);
    }

    public final void X6(android.content.Context context, long j17, r45.e21 e21Var) {
        java.lang.String str;
        if (e21Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(':');
            sb6.append(com.tencent.mm.sdk.platformtools.t8.s0());
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            java.lang.String string = e21Var.getString(9);
            if (string == null) {
                string = "";
            }
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            o3Var.Ek(string, 2, nyVar != null ? nyVar.V6() : null, pm0.v.u(j17));
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            java.lang.String string2 = e21Var.getString(9);
            java.lang.String str2 = string2 == null ? "" : string2;
            java.lang.String string3 = e21Var.getString(10);
            i0Var.ll(context, str2, string3 == null ? "" : string3, com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, sb7);
            s92.g.c(s92.g.f405006a, context, "link_miniprogram", 1, 0, 0, e21Var, null, 88, null);
        }
    }

    public final void Y6(android.content.Context context, r45.e21 e21Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_udf_kv", str2);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, 0L, null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
        s92.g.c(s92.g.f405006a, context, str3, i17, i18, i19, e21Var, null, 64, null);
    }

    public final void a7() {
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        java.lang.String string = (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null) ? null : e21Var.getString(9);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return;
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        if (string == null) {
            string = "";
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        o3Var.Ek(string, 1, nyVar != null ? nyVar.V6() : null, pm0.v.u(this.T));
    }

    @Override // x92.r, x92.q
    public void b2() {
        android.widget.TextView textView = this.f101915g;
        if (textView != null) {
            textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        d7(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5), getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        android.view.View view = this.f101920o;
        if (view != null) {
            view.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        android.widget.RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.abm);
        }
        android.widget.ProgressBar progressBar = this.F;
        if (progressBar != null) {
            progressBar.setProgressDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481519vf));
        }
        android.widget.LinearLayout linearLayout = this.f101927v;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.abm));
    }

    public final void b7(android.widget.TextView textView, java.lang.String str, int i17, int i18, yz5.l lVar) {
        int i19;
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        android.view.View view = this.L;
        if (view == null) {
            i19 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            i19 = 0;
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((com.tencent.mm.ui.widget.imageview.WeImageView) getContext().findViewById(com.tencent.mm.R.id.f482595is)).setIconColor(i17);
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        android.widget.TextView textView2 = this.f101916h;
        if (textView2 != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt = textView2.getPaint().getFontMetricsInt();
            int i27 = ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - (dimension / 2);
            com.tencent.mars.xlog.Log.i("FinderActivityEventUIC", "gap :" + i27);
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
        spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(str, i17, getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new com.tencent.mm.plugin.finder.activity.uic.g(lVar)), i19, str.length(), 17);
        textView.setText(spannableString);
    }

    public final void c7(android.widget.TextView textView, android.widget.TextView textView2) {
        r45.e21 e21Var;
        r45.e21 e21Var2;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        long j17 = 0;
        long j18 = (r03Var == null || (e21Var2 = (r45.e21) r03Var.getCustom(16)) == null) ? 0L : e21Var2.getLong(13);
        if (j18 != 0) {
            r45.r03 r03Var2 = (r45.r03) this.f452719d;
            if (r03Var2 != null && (e21Var = (r45.e21) r03Var2.getCustom(16)) != null) {
                j17 = e21Var.getLong(17);
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
                textView2.setText(hc2.i.b(getContext(), j18 * 1000, com.tencent.mm.R.string.cmv));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderActivityEventUIC", "no endTime");
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void d7(int i17, int i18) {
        android.widget.TextView textView = this.f101914J;
        if (textView != null) {
            textView.setTextColor(i18);
        }
        android.widget.TextView textView2 = this.f101916h;
        if (textView2 != null) {
            textView2.setTextColor(i18);
        }
        android.widget.TextView textView3 = this.f101923r;
        if (textView3 != null) {
            textView3.setTextColor(i18);
        }
        android.widget.TextView textView4 = this.f101921p;
        if (textView4 != null) {
            textView4.setTextColor(i18);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.I;
        if (weImageView != null) {
            weImageView.setIconColor(i18);
        }
        android.widget.TextView textView5 = this.f101922q;
        if (textView5 != null) {
            textView5.setTextColor(i17);
        }
        android.widget.TextView textView6 = this.f101923r;
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
        android.widget.TextView textView12 = this.f101928w;
        if (textView12 != null) {
            textView12.setTextColor(i18);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f101929x;
        if (weImageView2 != null) {
            weImageView2.setIconColor(i18);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f101931z;
        if (weImageView3 != null) {
            weImageView3.setIconColor(i18);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.uic.o.e7():void");
    }

    @Override // x92.r, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("Finder.ActivityParamStore", "reset");
        s92.b.f404991b = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("Finder.ActivityParamStore", "reset");
        s92.b.f404991b = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.X = null;
        if (this.V) {
            this.V = false;
        } else {
            a7();
        }
    }

    @Override // x92.r, x92.q
    public void setNormalStyle() {
        d7(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1), getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        android.view.View view = this.f101920o;
        if (view != null) {
            view.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
        android.widget.RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.abl);
        }
        android.widget.ProgressBar progressBar = this.F;
        if (progressBar != null) {
            progressBar.setProgressDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481518ve));
        }
        android.widget.LinearLayout linearLayout = this.f101927v;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.abp));
    }
}
