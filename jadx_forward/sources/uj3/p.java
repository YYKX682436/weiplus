package uj3;

/* loaded from: classes14.dex */
public final class p extends uj3.v0 {
    public android.widget.FrameLayout G;
    public android.widget.RelativeLayout H;
    public uj3.b1 I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.p1 f509868J;
    public int K;
    public boolean L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.K = -1;
        this.Q = -1;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(new int[]{1}[0]));
        java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        hashSet2.add(new uj3.j[]{new uj3.j(string, 8)}[0]);
        int[] iArr = {9, 10};
        for (int i17 = 0; i17 < 2; i17++) {
            hashSet3.add(java.lang.Integer.valueOf(iArr[i17]));
        }
        m168176x31d07134(new uj3.k(hashSet, hashSet2, hashSet3, 2));
        android.view.LayoutInflater.from(getContext()).inflate(mo168121x2ee31f5b(), this);
        this.H = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.mbm);
        m168170x3a0f5982((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.mbi));
        m168169xb310d85f((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.mbl));
        m168162xb81a87af((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.mbe));
        m168179x6d4c8d15((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.mbj));
        m168160x45c67dd((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.mbk));
        this.G = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.mbn);
        android.widget.RelativeLayout relativeLayout = this.H;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        android.widget.FrameLayout m168147x1cab64eb = m168147x1cab64eb();
        if (m168147x1cab64eb != null) {
            m168147x1cab64eb.setVisibility(8);
        }
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        m168173x98bd1d4(new uj3.c(context2, this, m168154x8dd3dc28()));
        uj3.c m168151xd74835c8 = m168151xd74835c8();
        if (m168151xd74835c8 != null) {
            m168151xd74835c8.f509784j = new uj3.l(this);
        }
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        m168180x69177191(new uj3.f1(context3, this));
        android.content.Context context4 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        m168158x53e40f65(new uj3.b0(context4, this));
        android.content.Context context5 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        m168163x50d28f2b(new uj3.l0(context5, this, m168154x8dd3dc28()));
        android.content.Context context6 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
        this.I = new uj3.b1(context6, this);
        android.content.Context context7 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context7, "getContext(...)");
        m168175xf1a490b5(new uj3.j1(context7, this, m168154x8dd3dc28()));
        m168171x4fc62d5(new uj3.k1());
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMCurrentIndex */
    public final void m168125x3e203aa4(int i17) {
        this.Q = i17;
        uj3.c m168151xd74835c8 = m168151xd74835c8();
        if (m168151xd74835c8 != null) {
            m168151xd74835c8.f509781g = i17;
            yz5.l lVar = m168151xd74835c8.f509784j;
            if (lVar != null) {
            }
        }
        uj3.b1 b1Var = this.I;
        if (b1Var == null) {
            return;
        }
        uj3.y0 y0Var = b1Var.f509765j;
        if (y0Var != null) {
            y0Var.f509924h = i17;
        }
        b1Var.f509768m = i17;
    }

    /* renamed from: setMFilePath */
    private final void m168126x54e5890c(java.lang.String str) {
        uj3.c m168151xd74835c8 = m168151xd74835c8();
        if (m168151xd74835c8 != null) {
            m168151xd74835c8.f509780f = str;
        }
        this.N = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMMaxCount */
    public final void m168127x97855356(int i17) {
        this.K = i17;
        uj3.c m168151xd74835c8 = m168151xd74835c8();
        if (m168151xd74835c8 != null) {
            m168151xd74835c8.f509782h = i17;
        }
        uj3.b1 b1Var = this.I;
        if (b1Var == null) {
            return;
        }
        uj3.y0 y0Var = b1Var.f509765j;
        if (y0Var != null) {
            y0Var.f509925i = i17;
        }
        b1Var.f509774s = (i17 / 10) + 1;
        b1Var.f509769n = i17;
    }

    /* renamed from: setMToken */
    private final void m168128x17205c8e(java.lang.String str) {
        uj3.c m168151xd74835c8 = m168151xd74835c8();
        if (m168151xd74835c8 != null) {
            m168151xd74835c8.f509779e = str;
        }
        this.M = str;
    }

    @Override // uj3.v0, uj3.b
    public void f(uj3.a status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.f(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 2) {
            uj3.b1 b1Var = this.I;
            if (b1Var != null) {
                b1Var.a();
                return;
            }
            return;
        }
        if (ordinal == 3) {
            uj3.b1 b1Var2 = this.I;
            if (b1Var2 != null) {
                b1Var2.c();
                return;
            }
            return;
        }
        if (ordinal == 9) {
            if (bundle != null) {
                int i17 = bundle.getInt("thumb_flip_target_position");
                j();
                com.p314xaae8f345.p3210x3857dc.r1.f(this.M, this.N, i17, 1.0f, 0, 0);
                return;
            }
            return;
        }
        boolean z17 = false;
        switch (ordinal) {
            case 11:
                if (this.f509909y) {
                    return;
                }
                int i18 = this.Q + 1;
                if (i18 >= 0 && i18 < this.K) {
                    z17 = true;
                }
                if (!z17) {
                    db5.t7.m(getContext(), "没有更多内容");
                    return;
                }
                j();
                uj3.b1 b1Var3 = this.I;
                if (b1Var3 != null) {
                    b1Var3.d(i18);
                    return;
                }
                return;
            case 12:
                if (this.f509909y) {
                    return;
                }
                int i19 = this.Q - 1;
                if (i19 >= 0 && i19 < this.K) {
                    z17 = true;
                }
                if (!z17) {
                    db5.t7.m(getContext(), "没有更多内容");
                    return;
                }
                j();
                uj3.b1 b1Var4 = this.I;
                if (b1Var4 != null) {
                    b1Var4.d(i19);
                    return;
                }
                return;
            case 13:
                if (bundle == null) {
                    return;
                }
                int i27 = bundle.getInt("thumb_current_page");
                int i28 = i27 * 10;
                int i29 = (i27 + 1) * 10;
                int i37 = this.K;
                if (i29 >= i37) {
                    i29 = i37;
                }
                if (i28 > i29) {
                    return;
                }
                while (true) {
                    com.p314xaae8f345.p3210x3857dc.r1.e(this.M, this.N, i28);
                    if (i28 == i29) {
                        return;
                    } else {
                        i28++;
                    }
                }
            default:
                return;
        }
    }

    @Override // uj3.v0
    /* renamed from: getBackgroundView */
    public android.view.View mo168119x43ae89e9() {
        return this.H;
    }

    @Override // uj3.v0
    /* renamed from: getCurrentFileMd5 */
    public java.lang.String mo168120x5cddb39f() {
        return com.p314xaae8f345.mm.vfs.w6.p(this.N);
    }

    @Override // uj3.v0
    /* renamed from: getLayoutId */
    public int mo168121x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c3o;
    }

    /* renamed from: getMCurrentViewStatus */
    public final com.p314xaae8f345.p3210x3857dc.p1 m168129x79866659() {
        return this.f509868J;
    }

    /* renamed from: getMReaderLayout */
    public final android.widget.RelativeLayout m168130xc773724() {
        return this.H;
    }

    /* renamed from: getThumbUiLayout */
    public final uj3.b1 m168131x7a59531e() {
        return this.I;
    }

    /* renamed from: getThumbnailRoot */
    public final android.widget.FrameLayout m168132x2a2aac38() {
        return this.G;
    }

    @Override // uj3.v0
    public void h() {
        android.widget.RelativeLayout relativeLayout = this.H;
        if (relativeLayout != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            sj3.n3 n3Var = sj3.o3.f490199e;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (n3Var.a(context) != 90) {
                android.content.Context context2 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                if (n3Var.a(context2) != 270) {
                    layoutParams.removeRule(16);
                    layoutParams.removeRule(3);
                    layoutParams.removeRule(17);
                    layoutParams.removeRule(2);
                    android.widget.FrameLayout m168156xf9db3fa1 = m168156xf9db3fa1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168156xf9db3fa1);
                    layoutParams.addRule(3, m168156xf9db3fa1.getId());
                    android.widget.FrameLayout m168142x89f639a3 = m168142x89f639a3();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168142x89f639a3);
                    layoutParams.addRule(2, m168142x89f639a3.getId());
                    relativeLayout.setLayoutParams(layoutParams);
                }
            }
            layoutParams.removeRule(16);
            layoutParams.removeRule(3);
            layoutParams.removeRule(17);
            layoutParams.removeRule(2);
            android.widget.FrameLayout m168156xf9db3fa12 = m168156xf9db3fa1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168156xf9db3fa12);
            layoutParams.addRule(17, m168156xf9db3fa12.getId());
            android.widget.FrameLayout m168142x89f639a32 = m168142x89f639a3();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m168142x89f639a32);
            layoutParams.addRule(16, m168142x89f639a32.getId());
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // uj3.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uj3.p.i():void");
    }

    @Override // uj3.v0
    public void k() {
        super.k();
        com.p314xaae8f345.p3210x3857dc.r1.a(this.M, this.N);
        m168128x17205c8e(null);
        m168126x54e5890c(null);
    }

    @Override // uj3.v0
    public void l() {
        m168128x17205c8e(null);
        super.l();
    }

    @Override // uj3.v0
    public void p() {
        this.L = false;
        super.p();
        uj3.b1 b1Var = this.I;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // uj3.v0
    public int q() {
        int q17 = super.q();
        android.widget.FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            frameLayout.setVisibility(q17);
        }
        return q17;
    }

    @Override // uj3.v0
    public void r(boolean z17) {
        super.r(z17);
        android.widget.RelativeLayout relativeLayout = this.H;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(z17 ? 0 : 8);
    }

    /* renamed from: setMCurrentViewStatus */
    public final void m168133x10b1e865(com.p314xaae8f345.p3210x3857dc.p1 p1Var) {
        uj3.c m168151xd74835c8 = m168151xd74835c8();
        if (m168151xd74835c8 != null) {
            m168151xd74835c8.f509778d = p1Var;
        }
        this.f509868J = p1Var;
    }

    /* renamed from: setMReaderLayout */
    public final void m168134x9f4d9d98(android.widget.RelativeLayout relativeLayout) {
        this.H = relativeLayout;
    }

    /* renamed from: setThumbUiLayout */
    public final void m168135xd2fb992(uj3.b1 b1Var) {
        this.I = b1Var;
    }

    /* renamed from: setThumbnailRoot */
    public final void m168136xbd0112ac(android.widget.FrameLayout frameLayout) {
        this.G = frameLayout;
    }

    public void x(android.os.Bundle bundle, int i17) {
        if (bundle != null) {
            setVisibility(0);
            setVisibility(0);
            if (this.M == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(hashCode());
                sb6.append(java.lang.System.currentTimeMillis());
                m168128x17205c8e(sb6.toString());
            }
            m168126x54e5890c(bundle.getString("file_path"));
            java.lang.String string = bundle.getString("file_ext");
            this.P = string;
            java.lang.String str = this.N;
            if (str != null && string != null) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
                if (r6Var.m() && r6Var.A()) {
                    uj3.k1 m168149x29665661 = m168149x29665661();
                    if (m168149x29665661 != null) {
                        m168149x29665661.f509844g = this.P;
                    }
                    uj3.k1 m168149x296656612 = m168149x29665661();
                    if (m168149x296656612 != null) {
                        m168149x296656612.f509846i = this.N;
                    }
                    uj3.k1 m168149x296656613 = m168149x29665661();
                    if (m168149x296656613 != null) {
                        m168149x296656613.f509845h = com.p314xaae8f345.mm.vfs.w6.k(this.N);
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("extra_param_disable_scale", "false");
                    hashMap.put("extra_param_enable_receive_view_status_change", "true");
                    hashMap.put("extra_param_bg_color", java.lang.String.valueOf(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w)));
                    hashMap.put("extra_param_disable_finish_activity", "true");
                    hashMap.put("extra_param_disable_password", "true");
                    hashMap.put("extra_param_set_max_scale", "3");
                    hashMap.put("extra_param_can_download_when_plugin_error", "true");
                    hashMap.put("extra_param_open_file_scene", "11");
                    java.lang.String str2 = this.N;
                    java.lang.String str3 = this.P;
                    java.lang.String str4 = this.M;
                    com.p314xaae8f345.p3210x3857dc.q1 q1Var = com.p314xaae8f345.p3210x3857dc.q1.ReaderView;
                    android.content.Context context = getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    com.p314xaae8f345.p3210x3857dc.r1.d(str2, str3, str4, true, hashMap, q1Var, (android.app.Activity) context, this.H, new uj3.n(this), new uj3.o(this));
                }
            }
            r(true);
        }
    }
}
