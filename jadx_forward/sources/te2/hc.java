package te2;

/* loaded from: classes3.dex */
public final class hc extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public r45.l32 E;
    public java.lang.String F;
    public int G;
    public java.lang.String H;
    public ya2.b2 I;

    /* renamed from: J, reason: collision with root package name */
    public r45.h32 f499601J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 K;
    public boolean L;
    public java.lang.String M;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f499602d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f499603e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f499604f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f499605g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f499606h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f499607i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f499608m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f499609n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f499610o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f499611p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f499612q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f499613r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f499614s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f499615t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f499616u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f499617v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f499618w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f499619x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f499620y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f499621z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f499602d = jz5.h.b(new te2.vb(activity));
        this.f499603e = jz5.h.b(new te2.fb(activity));
        this.f499604f = jz5.h.b(new te2.pb(activity));
        this.f499605g = jz5.h.b(new te2.kb(activity));
        this.f499606h = jz5.h.b(new te2.rb(activity));
        this.f499607i = jz5.h.b(new te2.sb(activity));
        this.f499608m = jz5.h.b(new te2.ac(activity));
        this.f499609n = jz5.h.b(new te2.eb(activity));
        this.f499610o = jz5.h.b(new te2.ob(activity));
        this.f499611p = jz5.h.b(new te2.nb(activity));
        this.f499612q = jz5.h.b(new te2.wb(activity));
        this.f499613r = jz5.h.b(new te2.ub(activity));
        this.f499614s = jz5.h.b(new te2.tb(activity));
        this.f499615t = jz5.h.b(new te2.mb(activity));
        this.f499616u = jz5.h.b(new te2.gb(activity));
        this.f499617v = jz5.h.b(new te2.xb(activity));
        this.f499618w = jz5.h.b(new te2.yb(activity));
        this.f499619x = jz5.h.b(new te2.lb(activity));
        this.f499620y = jz5.h.b(new te2.ib(activity, this));
        this.f499621z = jz5.h.b(new te2.dc(activity));
        this.A = jz5.h.b(new te2.ga(activity));
        this.B = jz5.h.b(new te2.cc(activity));
        this.C = jz5.h.b(new te2.qb(activity));
        this.D = jz5.h.b(new te2.jb(this));
        this.F = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (p3325xe03a0797.p3326xc267989b.k1.b(100, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(te2.hc r4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof te2.ua
            if (r0 == 0) goto L16
            r0 = r5
            te2.ua r0 = (te2.ua) r0
            int r1 = r0.f500018g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f500018g = r1
            goto L1b
        L16:
            te2.ua r0 = new te2.ua
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f500016e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f500018g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f500015d
            te2.hc r4 = (te2.hc) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L50
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r5 = r4.R6()
            if (r5 == 0) goto L43
            r2 = 0
            r5.m81436x205ac394(r2)
        L43:
            r0.f500015d = r4
            r0.f500018g = r3
            r2 = 100
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.k1.b(r2, r0)
            if (r5 != r1) goto L50
            goto L6f
        L50:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r5 = r4.R6()
            android.graphics.Bitmap r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(r5)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r5 = r4.R6()
            if (r5 == 0) goto L6c
            android.app.Activity r4 = r4.m80379x76847179()
            r0 = 20
            int r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(r4, r0)
            float r4 = (float) r4
            r5.m81436x205ac394(r4)
        L6c:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.hc.O6(te2.hc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final android.widget.TextView P6() {
        return (android.widget.TextView) ((jz5.n) this.f499620y).mo141623x754a37bb();
    }

    public final android.widget.TextView Q6() {
        return (android.widget.TextView) ((jz5.n) this.f499610o).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 R6() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) ((jz5.n) this.f499614s).mo141623x754a37bb();
    }

    public final void S6() {
        r45.l94 b17;
        java.lang.String m75945x2fec8307;
        r45.ov2 a17;
        java.lang.String str;
        P6().setVisibility(8);
        r45.h32 h32Var = this.f499601J;
        java.lang.String str2 = "";
        if (h32Var != null && (a17 = zl2.t.a(h32Var)) != null && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o7.a(a17)) {
            r45.l1 l1Var = (r45.l1) a17.m75936x14adae67(19);
            if (l1Var != null && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a.a(l1Var)) {
                P6().setVisibility(0);
                P6().setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
                P6().setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljk, a17.m75945x2fec8307(20)));
            } else {
                r45.h32 h32Var2 = this.f499601J;
                if (h32Var2 != null && zl2.t.e(h32Var2)) {
                    P6().setVisibility(0);
                    P6().setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                    P6().setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljj, a17.m75945x2fec8307(20)));
                }
            }
            if (P6().getVisibility() == 0) {
                java.lang.String m75945x2fec83072 = a17.m75945x2fec8307(1);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                r45.h32 h32Var3 = this.f499601J;
                if (h32Var3 == null || (str = h32Var3.m75945x2fec8307(4)) == null) {
                    str = "";
                }
                cl0.g gVar = new cl0.g();
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                gVar.h("finderuin", xy2.c.e(context));
                gVar.h("coupon_id", m75945x2fec83072);
                gVar.h("noticeid", str);
                gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6668x8d965adc c6668x8d965adc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6668x8d965adc();
                c6668x8d965adc.f140103l = c6668x8d965adc.b("Event", "expose_get_coupon_btn_after_reserve", true);
                c6668x8d965adc.f140104m = c6668x8d965adc.b("Params", r26.i0.t(gVar2, ",", ";", false), true);
                c6668x8d965adc.k();
            }
        }
        r45.h32 h32Var4 = this.f499601J;
        if (h32Var4 == null || (b17 = zl2.t.b(h32Var4)) == null) {
            return;
        }
        if (b17.m75939xb282bd08(1) > 0) {
            P6().setVisibility(0);
            P6().setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
            P6().setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxr, java.lang.Integer.valueOf(b17.m75939xb282bd08(1))));
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.u1 u1Var = ml2.u1.f409617s3;
        jz5.l[] lVarArr = new jz5.l[1];
        r45.h32 h32Var5 = this.f499601J;
        if (h32Var5 != null && (m75945x2fec8307 = h32Var5.m75945x2fec8307(4)) != null) {
            str2 = m75945x2fec8307;
        }
        lVarArr[0] = new jz5.l("noticeid", str2);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        java.lang.String str3 = this.M;
        if (str3 != null) {
            zy2.zb.I8(zbVar, u1Var, l17, null, "200", null, str3, false, 84, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(dm.i4.f66875xa013b0d5);
            throw null;
        }
    }

    public final void T6() {
        android.widget.TextView textView;
        r45.ov2 a17;
        r45.h32 h32Var = this.f499601J;
        jz5.g gVar = this.f499619x;
        jz5.f0 f0Var = null;
        if (h32Var != null && (a17 = zl2.t.a(h32Var)) != null) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o7.a(a17)) {
                a17 = null;
            }
            if (a17 != null) {
                android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
                if (textView2 != null) {
                    textView2.setText(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljm, a17.m75945x2fec8307(20)));
                }
                android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var != null || (textView = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void U6() {
        r45.h32 h32Var = this.f499601J;
        if (h32Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15418xa028bed2 c15418xa028bed2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15418xa028bed2) ((jz5.n) this.A).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c15418xa028bed2, "<get-bookBtn>(...)");
            ya2.b2 b2Var = this.I;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf.g(c15418xa028bed2, b2Var != null ? b2Var.D0() : null, false, new te2.bc(h32Var), 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b19;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030f  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r50) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.hc.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gm0.j1.d().q(6276, this);
        gm0.j1.d().q(4214, this);
        gm0.j1.d().q(6653, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        r45.h32 h32Var;
        java.lang.String str3;
        java.lang.String m75945x2fec8307;
        java.lang.String str4;
        int i19;
        java.lang.String m75945x2fec83072;
        int i27;
        mn2.g1 g1Var;
        android.graphics.Bitmap bitmap;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2;
        java.util.LinkedList<r45.zf5> m75941xfb821914;
        java.lang.String m75945x2fec83073;
        pm0.v.X(new te2.gc(false, this, null));
        str2 = "";
        if (!(m1Var instanceof db2.g6)) {
            if (!(m1Var instanceof db2.f5)) {
                if ((m1Var instanceof db2.e5) && i17 == 0 && i18 == 0 && (h32Var = this.f499601J) != null) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String str5 = this.M;
                    if (str5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(dm.i4.f66875xa013b0d5);
                        throw null;
                    }
                    java.lang.String m75945x2fec83074 = h32Var.m75945x2fec8307(4);
                    r45.h32 bj6 = ((b92.d1) zbVar).bj(str5, m75945x2fec83074 != null ? m75945x2fec83074 : "");
                    if (bj6 != null) {
                        h32Var.set(1, java.lang.Integer.valueOf(bj6.m75939xb282bd08(1)));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", "onSceneEnd: update noticeInfo status from cache, status=" + bj6.m75939xb282bd08(1));
                    }
                    S6();
                    U6();
                    return;
                }
                return;
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 != -200211) {
                    db5.t7.g(m80379x76847179(), m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573247e05));
                    return;
                }
                java.lang.String string = str == null || str.length() == 0 ? m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573246e04) : str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                db5.t7.g(m80379x76847179(), string);
                return;
            }
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            r45.h32 h32Var2 = this.f499601J;
            if (h32Var2 == null || (str3 = h32Var2.m75945x2fec8307(4)) == null) {
                str3 = "";
            }
            ((b92.d1) zbVar2).pj(str3);
            android.content.Intent intent = new android.content.Intent();
            r45.h32 h32Var3 = this.f499601J;
            if (h32Var3 != null && (m75945x2fec8307 = h32Var3.m75945x2fec8307(4)) != null) {
                str2 = m75945x2fec8307;
            }
            intent.putExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY", str2);
            m158354x19263085().setResult(1000, intent);
            m158354x19263085().finish();
            db5.t7.h(m80379x76847179(), m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573248e06));
            return;
        }
        if (i17 == 0 && i18 == 0) {
            r45.l32 K = ((db2.g6) m1Var).K();
            this.E = K;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.H, K.m75945x2fec8307(4));
            mn2.g1 g1Var2 = mn2.g1.f411508a;
            if (b17) {
                i27 = 8;
                g1Var = g1Var2;
                str4 = "getService(...)";
                i19 = 3;
            } else {
                r45.l32 l32Var = this.E;
                java.lang.String m75945x2fec83075 = l32Var != null ? l32Var.m75945x2fec8307(4) : null;
                this.H = m75945x2fec83075;
                boolean z17 = m75945x2fec83075 == null || m75945x2fec83075.length() == 0;
                jz5.g gVar = this.f499606h;
                jz5.g gVar2 = this.f499615t;
                if (z17) {
                    android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb();
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setPadding(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 32), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 80), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 32), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 40));
                    android.view.ViewGroup.LayoutParams layoutParams = Q6().getLayoutParams();
                    if (layoutParams != null && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
                        ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 48);
                        Q6().setLayoutParams(layoutParams);
                    }
                } else {
                    vo0.d e17 = g1Var2.e();
                    mn2.q3 q3Var = new mn2.q3(this.H, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView2, "<get-mCoverImageView>(...)");
                    e17.c(q3Var, imageView2, g1Var2.h(mn2.f1.f411498s));
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb();
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setPadding(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 32), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 40), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 32), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 40));
                    android.view.ViewGroup.LayoutParams layoutParams2 = Q6().getLayoutParams();
                    if (layoutParams2 != null && (layoutParams2 instanceof android.widget.LinearLayout.LayoutParams)) {
                        ((android.widget.LinearLayout.LayoutParams) layoutParams2).topMargin = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(m80379x76847179(), 40);
                        Q6().setLayoutParams(layoutParams2);
                    }
                }
                Q6().setVisibility(4);
                i27 = 8;
                g1Var = g1Var2;
                str4 = "getService(...)";
                i19 = 3;
                pf5.e.m158344xbe96bc24(this, null, null, new te2.ta(this, null), 3, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("qrcode url ");
            r45.l32 l32Var2 = this.E;
            sb6.append(l32Var2 != null ? l32Var2.m75945x2fec8307(i19) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", sb6.toString());
            r45.l32 l32Var3 = this.E;
            java.lang.String m75945x2fec83076 = l32Var3 != null ? l32Var3.m75945x2fec8307(i19) : null;
            if (m75945x2fec83076 == null) {
                m75945x2fec83076 = "";
            }
            this.F = m75945x2fec83076;
            te2.sc scVar = te2.sc.f499945a;
            r45.l32 l32Var4 = this.E;
            r45.s52 b18 = scVar.b(l32Var4 != null ? l32Var4.m75939xb282bd08(i27) : 0);
            if (b18 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", "#setStyleToUI bg_type=" + b18.m75939xb282bd08(1) + " bg_sub_type=" + b18.m75945x2fec8307(2) + " fg_color=" + b18.m75945x2fec8307(i19) + " finder_logo_color=" + b18.m75945x2fec8307(4) + " auth_icon_url=" + b18.m75945x2fec8307(5));
                this.G = b18.m75939xb282bd08(0);
                int m75939xb282bd08 = b18.m75939xb282bd08(1);
                jz5.g gVar3 = this.f499605g;
                if (m75939xb282bd08 == 0) {
                    java.lang.String m75945x2fec83077 = b18.m75945x2fec8307(2);
                    if (m75945x2fec83077 != null) {
                        if (!(m75945x2fec83077.length() > 0)) {
                            m75945x2fec83077 = null;
                        }
                        if (m75945x2fec83077 != null) {
                            try {
                                ((android.widget.ImageView) ((jz5.n) gVar3).mo141623x754a37bb()).setImageBitmap(null);
                                ((android.widget.ImageView) ((jz5.n) gVar3).mo141623x754a37bb()).setBackgroundColor(android.graphics.Color.parseColor(m75945x2fec83077));
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeQRCodeUIC", e18.toString());
                            }
                        }
                    }
                } else if (m75939xb282bd08 == 1) {
                    ya2.b2 b2Var = this.I;
                    if (b2Var != null) {
                        if (!(b2Var.D0().length() > 0)) {
                            b2Var = null;
                        }
                        if (b2Var != null) {
                            i95.m c17 = i95.n0.c(vd2.i5.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, str4);
                            vd2.i5.l7((vd2.i5) c17, b2Var.m176700xe5e0d2a0(), (android.widget.ImageView) ((jz5.n) gVar3).mo141623x754a37bb(), null, 4, null);
                        }
                    }
                } else if (m75939xb282bd08 == 2 && (m75945x2fec83073 = b18.m75945x2fec8307(2)) != null) {
                    if (!(m75945x2fec83073.length() > 0)) {
                        m75945x2fec83073 = null;
                    }
                    if (m75945x2fec83073 != null) {
                        vo0.d e19 = g1Var.e();
                        mn2.q3 q3Var2 = new mn2.q3(m75945x2fec83073, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
                        android.widget.ImageView imageView4 = (android.widget.ImageView) ((jz5.n) gVar3).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView4, "<get-mContentStyleBg>(...)");
                        e19.c(q3Var2, imageView4, g1Var.h(mn2.f1.f411498s));
                    }
                }
                java.lang.String m75945x2fec83078 = b18.m75945x2fec8307(i19);
                if (m75945x2fec83078 != null) {
                    if (!(m75945x2fec83078.length() > 0)) {
                        m75945x2fec83078 = null;
                    }
                    if (m75945x2fec83078 != null) {
                        try {
                            int parseColor = android.graphics.Color.parseColor(m75945x2fec83078);
                            ((android.widget.TextView) ((jz5.n) this.f499607i).mo141623x754a37bb()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f499608m).mo141623x754a37bb()).setTextColor(parseColor);
                            Q6().setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f499611p).mo141623x754a37bb()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f499612q).mo141623x754a37bb()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f499617v).mo141623x754a37bb()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f499618w).mo141623x754a37bb()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f499619x).mo141623x754a37bb()).setTextColor(parseColor);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15421xc2f2f28f) ((jz5.n) this.D).mo141623x754a37bb()).m62841x1c5c5ff4(android.graphics.Color.argb(android.graphics.Color.alpha(parseColor) / 2, android.graphics.Color.red(parseColor), android.graphics.Color.green(parseColor), android.graphics.Color.blue(parseColor)));
                        } catch (java.lang.Exception e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeQRCodeUIC", e27.toString());
                        }
                    }
                }
                java.lang.String m75945x2fec83079 = b18.m75945x2fec8307(4);
                if (m75945x2fec83079 != null) {
                    if (!(m75945x2fec83079.length() > 0)) {
                        m75945x2fec83079 = null;
                    }
                    if (m75945x2fec83079 != null) {
                        try {
                            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f499604f).mo141623x754a37bb()).m82040x7541828(android.graphics.Color.parseColor(m75945x2fec83079));
                        } catch (java.lang.Exception e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeQRCodeUIC", e28.toString());
                        }
                    }
                }
                java.lang.String m75945x2fec830710 = b18.m75945x2fec8307(5);
                if (m75945x2fec830710 != null) {
                    if (!(m75945x2fec830710.length() > 0)) {
                        m75945x2fec830710 = null;
                    }
                    if (m75945x2fec830710 != null) {
                        vo0.d e29 = g1Var.e();
                        mn2.q3 q3Var3 = new mn2.q3(m75945x2fec830710, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
                        android.widget.ImageView imageView5 = (android.widget.ImageView) ((jz5.n) this.f499609n).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView5, "<get-mAuthView>(...)");
                        e29.c(q3Var3, imageView5, g1Var.h(mn2.f1.f411498s));
                    }
                }
            }
            r45.l32 l32Var5 = this.E;
            if (l32Var5 == null || (m75941xfb821914 = l32Var5.m75941xfb821914(6)) == null) {
                bitmap = null;
            } else {
                bitmap = null;
                for (r45.zf5 zf5Var : m75941xfb821914) {
                    if (zf5Var.m75941xfb821914(1).contains(java.lang.Integer.valueOf(this.G))) {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = zf5Var.m75934xbce7f2f(0);
                        bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(m75934xbce7f2f3 != null ? m75934xbce7f2f3.f273689a : null);
                    }
                }
            }
            if (bitmap == null) {
                r45.l32 l32Var6 = this.E;
                if (!((l32Var6 == null || (m75934xbce7f2f2 = l32Var6.m75934xbce7f2f(2)) == null || m75934xbce7f2f2.f273689a.length != 0) ? false : true)) {
                    r45.l32 l32Var7 = this.E;
                    bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G((l32Var7 == null || (m75934xbce7f2f = l32Var7.m75934xbce7f2f(2)) == null) ? null : m75934xbce7f2f.g());
                }
            }
            if (bitmap == null) {
                r45.l32 l32Var8 = this.E;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l32Var8 != null ? l32Var8.m75945x2fec8307(i19) : null)) {
                    r45.l32 l32Var9 = this.E;
                    java.lang.String m75945x2fec830711 = l32Var9 != null ? l32Var9.m75945x2fec8307(i19) : null;
                    bitmap = m75945x2fec830711 == null ? null : ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(m158354x19263085(), m75945x2fec830711, 12, 0);
                }
            }
            if (bitmap != null) {
                ((android.widget.ImageView) ((jz5.n) this.f499613r).mo141623x754a37bb()).setImageBitmap(bitmap);
                android.view.View view = (android.view.View) ((jz5.n) this.B).mo141623x754a37bb();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC", "setQrCodeStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC", "setQrCodeStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                db5.t7.i(m158354x19263085(), m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e1g), com.p314xaae8f345.mm.R.raw.f79678x41464de0);
            }
        } else {
            str4 = "getService(...)";
            i19 = 3;
            db5.t7.i(m158354x19263085(), m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e1g), com.p314xaae8f345.mm.R.raw.f79678x41464de0);
        }
        i95.m c18 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, str4);
        zy2.zb zbVar3 = (zy2.zb) c18;
        ml2.y2 y2Var = ml2.y2.f409795r;
        r45.h32 h32Var4 = this.f499601J;
        zy2.zb.qg(zbVar3, y2Var, "", (h32Var4 == null || (m75945x2fec83072 = h32Var4.m75945x2fec8307(i19)) == null) ? "" : m75945x2fec83072, null, 8, null);
    }
}
