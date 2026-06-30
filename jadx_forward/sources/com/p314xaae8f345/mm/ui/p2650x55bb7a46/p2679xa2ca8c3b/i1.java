package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class i1 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {
    public static final java.lang.String D = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/wacomplain?action=show&appid=%s&msgid=%s&from=%d#wechat_redirect";
    public boolean A;
    public final int[] B = new int[2];
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 C;

    /* renamed from: s, reason: collision with root package name */
    public final int f285682s;

    /* renamed from: t, reason: collision with root package name */
    public yb5.d f285683t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f285684u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f285685v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f285686w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnTouchListener f285687x;

    /* renamed from: y, reason: collision with root package name */
    public final o11.g f285688y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5 f285689z;

    public i1() {
        o11.f fVar = new o11.f();
        fVar.f423629t = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
        this.f285688y = fVar.a();
        this.f285682s = gm0.j1.b().h();
        this.f285689z = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5.class);
        this.f285685v = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h1(this, null);
        this.f285686w = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w0(this);
        this.f285687x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x0(this);
    }

    public static int d0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var, int i17) {
        return java.lang.Math.max(0, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) i1Var.f285683t.f542241c.a(sb5.z.class))).mo8143x7444f759() - i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569982tm, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bs bsVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bs();
        bsVar.a(inflate);
        inflate.setTag(bsVar);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (menuItem.getItemId() != 100) {
            return false;
        }
        tt0.a a17 = tt0.a.a(f9Var.j());
        pt0.f0.P7(f9Var.Q0(), f9Var.m124847x74d37ac6());
        java.lang.String str = a17.f503312e;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = a17.f503316i;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = a17.f503310c;
        e0(9, str2, str5 == null ? "" : str5, str4, null, 0);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar == null) {
            return false;
        }
        g4Var.c(erVar.d(), 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    public final void e0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5 i5Var = this.f285689z;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19724, 1, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18), 0, null, 0, 0, 0, str, str3, str4, str2, 0, null, null, 0, null, null, i5Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0) i5Var).f156580d : null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285683t = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bs bsVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bs) g0Var;
        tt0.a a17 = tt0.a.a(f9Var.j());
        if (dVar2.f475787d.f526833b.A0() == 2) {
            bsVar.f285045b.setVisibility(0);
            bsVar.f39500xcbecde0f.setVisibility(8);
        } else {
            bsVar.f285045b.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f285683t.f542241c.a(sb5.z.class))).mo75871xfb80e389(0);
        if (mo75871xfb80e389 != null && mo75871xfb80e389.A0() == 2) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f285683t.f542241c.a(sb5.z.class))).I0(1);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = dVar2.f475787d.f526833b;
        int A0 = f9Var2.A0();
        android.view.View.OnClickListener onClickListener = this.f285686w;
        if (A0 == 2) {
            bsVar.f285046c.setVisibility(8);
        } else {
            bsVar.f285046c.setVisibility(0);
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(a17.f503311d);
            if (Bi == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bi.f68910xea1bd3d4) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bi.f68913x21f9b213)) {
                java.lang.String str4 = a17.f503315h;
                str2 = str4 == null ? "" : str4;
                str3 = a17.f503309b;
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str2 = Bi.f68910xea1bd3d4;
                str3 = Bi.f68913x21f9b213;
            }
            java.lang.String str5 = a17.f503311d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str5 == null) {
                str5 = "";
            }
            bsVar.f285047d.setTag(null);
            android.widget.TextView textView = bsVar.f285048e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = this.f285683t.g();
            float textSize = bsVar.f285048e.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g17, str3, textSize));
            bsVar.f285048e.setTag(a17);
            n11.a.b().h(str2, bsVar.f285047d, this.f285688y);
            bsVar.f285047d.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, (java.lang.String) null));
            bsVar.f285047d.setTag(com.p314xaae8f345.mm.R.id.bhl, bsVar);
            bsVar.f285047d.setOnClickListener(onClickListener);
            bsVar.f285047d.setOnLongClickListener(null);
            android.widget.ImageView imageView = bsVar.f285047d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            sb6.append(c01.a2.e(str5));
            sb6.append(this.f285683t.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6x));
            imageView.setContentDescription(sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5 i5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i5.class);
            java.lang.String str6 = a17.f503312e + "#NotifyMessageStatus";
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d0) i5Var).getClass();
            if (java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().z0(str6, "true")).booleanValue()) {
                bsVar.f285049f.setVisibility(8);
                this.A = false;
            } else {
                bsVar.f285049f.setVisibility(0);
                this.A = true;
            }
            bsVar.f285050g.setTag(f9Var2);
            bsVar.f285050g.setTag(com.p314xaae8f345.mm.R.id.bhl, bsVar);
            bsVar.f285050g.setOnClickListener(this.f285685v);
        }
        if (dVar2.f475787d.f526833b.A0() != 2) {
            android.widget.TextView textView2 = bsVar.f285051h;
            java.lang.String str7 = a17.f503308a;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            textView2.setText(str7 != null ? str7 : "");
            bsVar.f285046c.setOnClickListener(onClickListener);
            bsVar.f285046c.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, (java.lang.String) null));
            bsVar.f285046c.setLongClickable(true);
            bsVar.f285046c.setTag(com.p314xaae8f345.mm.R.id.ohu, this.B);
            bsVar.f285046c.setTag(com.p314xaae8f345.mm.R.id.bhl, bsVar);
            bsVar.f285046c.setOnLongClickListener(u(this.f285683t));
            bsVar.f285046c.setOnTouchListener(this.f285687x);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void n(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (str == null || g0Var.f39502xce2b2f8d == null) {
            return;
        }
        java.lang.CharSequence s07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) dVar.f542241c.a(sb5.n.class))).s0(str);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = dVar.g();
        float textSize = g0Var.f39502xce2b2f8d.getTextSize();
        ((ke0.e) xVar).getClass();
        X(g0Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g17, s07, textSize));
    }
}
