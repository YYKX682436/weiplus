package my2;

/* loaded from: classes3.dex */
public final class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public static final my2.e0 E = new my2.e0(null);
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 A;
    public int B;
    public int C;
    public java.lang.String D;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f414276p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b f414277q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b f414278r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b f414279s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306 f414280t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f414281u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b f414282v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f414283w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.LinearLayout f414284x;

    /* renamed from: y, reason: collision with root package name */
    public final ky2.g0 f414285y;

    /* renamed from: z, reason: collision with root package name */
    public android.os.CountDownTimer f414286z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f414276p = statusMonitor;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9 a9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9.f183626f;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.A = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9.a(a9Var, context, root.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L, null, 8, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) root.findViewById(com.p314xaae8f345.mm.R.id.p8m);
        this.f414277q = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b) root.findViewById(com.p314xaae8f345.mm.R.id.p8k);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) root.findViewById(com.p314xaae8f345.mm.R.id.p8j);
        this.f414281u = c22849x81a93d25;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b c15384x34dfb03b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b) root.findViewById(com.p314xaae8f345.mm.R.id.p8q);
        this.f414278r = c15384x34dfb03b;
        this.f414279s = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b) root.findViewById(com.p314xaae8f345.mm.R.id.p8i);
        this.f414280t = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306) root.findViewById(com.p314xaae8f345.mm.R.id.p8p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b c15384x34dfb03b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b) root.findViewById(com.p314xaae8f345.mm.R.id.p8h);
        this.f414282v = c15384x34dfb03b2;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.p8l);
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.p8o);
        this.f414283w = textView;
        if (c22849x81a93d25 != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.t(c22849x81a93d25, false);
        }
        ky2.g0 g0Var = new ky2.g0(root, S0());
        this.f414285y = g0Var;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(g0Var);
        }
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext()));
        }
        this.f414284x = (android.widget.LinearLayout) root.findViewById(com.p314xaae8f345.mm.R.id.p8n);
        g0Var.f395077g = new my2.a0(this, root);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(my2.b0.f414252d);
        }
        root.setOnClickListener(new my2.c0(this));
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new my2.d0(this));
        }
        if (c15384x34dfb03b != null) {
            com.p314xaae8f345.mm.ui.fk.a(c15384x34dfb03b);
        }
        if (c15384x34dfb03b2 != null) {
            com.p314xaae8f345.mm.ui.fk.a(c15384x34dfb03b2);
        }
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        this.D = "";
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f446856d.getVisibility() != 0) {
            return false;
        }
        K0(8);
        v1(8);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        android.os.CountDownTimer countDownTimer;
        int i18 = ((mm2.c1) P0(mm2.c1.class)).f410428u6;
        my2.e0 e0Var = E;
        if (i18 == 0 || i18 == e0Var.hashCode()) {
            if (i17 == 0) {
                ((mm2.c1) P0(mm2.c1.class)).f410428u6 = e0Var.hashCode();
            } else {
                ((mm2.c1) P0(mm2.c1.class)).f410428u6 = 0;
            }
            if (i17 == 8 && (countDownTimer = this.f414286z) != null) {
                countDownTimer.cancel();
            }
            super.K0(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 99) {
            w1();
        } else if (ordinal == 100) {
            android.os.CountDownTimer countDownTimer = this.f414286z;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            K0(8);
            v1(8);
        }
        super.M0(status, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        android.os.CountDownTimer countDownTimer = this.f414286z;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final boolean a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return ((mm2.c1) P0(mm2.c1.class)).f410332e6.contains(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final boolean t1() {
        if (zl2.r4.f555483a.w1() || ((mm2.c1) P0(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) P0(mm2.n0.class)).f410806r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        if ((r1 != null && r1.m75939xb282bd08(4) == 4) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        if ((r1 != null && r1.m75939xb282bd08(4) == 4) != false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c A[LOOP:0: B:74:0x0176->B:76:0x017c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my2.k0.u1():void");
    }

    public final void v1(int i17) {
        qo0.c cVar = this.f414276p;
        if (i17 == 0 && this.f446856d.getVisibility() == 0) {
            mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
            boolean z17 = c1Var.N1;
            if (z17) {
                return;
            }
            c1Var.N1 = !z17;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", c1Var.N1);
            cVar.mo46557x60d69242(qo0.b.Z2, bundle);
            return;
        }
        mm2.c1 c1Var2 = (mm2.c1) P0(mm2.c1.class);
        boolean z18 = c1Var2.N1;
        if (z18) {
            c1Var2.N1 = !z18;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", c1Var2.N1);
            cVar.mo46557x60d69242(qo0.b.Z2, bundle2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        if ((r1 != null && r1.m75939xb282bd08(4) == 4) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x021d, code lost:
    
        if ((r1 != null && r1.m75939xb282bd08(4) == 4) != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0333 A[LOOP:0: B:127:0x032d->B:129:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1() {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my2.k0.w1():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r1 != null && r1.m75939xb282bd08(4) == 4) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my2.k0.x1():void");
    }
}
