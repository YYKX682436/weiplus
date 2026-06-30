package qn2;

/* loaded from: classes3.dex */
public abstract class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: z, reason: collision with root package name */
    public static final qn2.s f446752z = new qn2.s(null);

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f446753p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f446754q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f446755r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f446756s;

    /* renamed from: t, reason: collision with root package name */
    public qn2.r f446757t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f446758u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f446759v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f446760w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f446761x;

    /* renamed from: y, reason: collision with root package name */
    public r45.cz1 f446762y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f446753p = statusMonitor;
        this.f446762y = new r45.cz1();
        zl2.q4.f555466a.R("FinderLiveLotteryCardPlugin");
        v1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0071  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K0(int r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.z.K0(int):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 145) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS") : true;
            km2.z zVar = ((on2.z2) P0(on2.z2.class)).f428625m;
            if ((zVar != null ? zVar.f390765d : null) != null) {
                w1(z17, zVar);
                return;
            }
            K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCardPlugin", "openCard statusChange:" + z17 + " but lotteryInfo is empty!");
            return;
        }
        if (ordinal == 146) {
            K0(4);
            return;
        }
        if (ordinal == 148 && w0() == 0) {
            km2.z zVar2 = ((on2.z2) P0(on2.z2.class)).f428625m;
            if ((zVar2 != null ? zVar2.f390765d : null) != null) {
                w1(false, zVar2);
            } else {
                K0(8);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCardPlugin", "updateCard lotteryInfo is empty!");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r0.f() == true) goto L12;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O0() {
        /*
            r2 = this;
            super.O0()
            android.view.View r0 = r2.f446759v
            if (r0 != 0) goto L8
            goto Lc
        L8:
            r1 = 0
            r0.setBackground(r1)
        Lc:
            com.tencent.mm.view.MMPAGView r0 = r2.f446755r
            if (r0 == 0) goto L18
            boolean r0 = r0.f()
            r1 = 1
            if (r0 != r1) goto L18
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L22
            com.tencent.mm.view.MMPAGView r0 = r2.f446755r
            if (r0 == 0) goto L22
            r0.n()
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.z.O0():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public void t1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCardPlugin", "changeToUnvisible");
    }

    public final void u1(yz5.a callback) {
        java.lang.String str;
        r45.cz1 cz1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        dk2.xf W0 = W0();
        if (W0 != null) {
            km2.z zVar = ((on2.z2) P0(on2.z2.class)).f428625m;
            if (zVar == null || (cz1Var = zVar.f390765d) == null || (str = cz1Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            ((dk2.r4) W0).N(str, null, new qn2.t(this, callback));
        }
    }

    public void v1() {
        qn2.u uVar = new qn2.u(this);
        android.view.ViewGroup viewGroup = this.f446856d;
        viewGroup.setOnClickListener(uVar);
        this.f446758u = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.b98);
        this.f446759v = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.b6y);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f446759v, "finder_live_lucky_result_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f446759v, 32, 25561);
        this.f446754q = (android.widget.FrameLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566242f83);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.bys);
        this.f446760w = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new qn2.v(this));
        }
        if (!x0()) {
            android.view.View view = this.f446759v;
            if (view != null) {
                view.setScaleX(1.0f);
            }
            android.view.View view2 = this.f446759v;
            if (view2 != null) {
                view2.setScaleY(1.0f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f446760w;
            if (c22699x3dcdb3522 == null) {
                return;
            }
            c22699x3dcdb3522.setTranslationY(0.0f);
            return;
        }
        float f17 = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y * 0.81f;
        int a17 = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 424.0f);
        float f18 = a17;
        float f19 = f17 / f18;
        if (f19 <= 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCardPlugin", "adjustLayout invalid scale:" + f19 + ",targetHeight:" + f17 + ",sourceHeight:" + a17);
            return;
        }
        int a18 = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 320.0f);
        float f27 = a18;
        float f28 = f27 * f19;
        float f29 = f18 - f17;
        float f37 = f27 - f28;
        float f38 = 2;
        float f39 = f29 / f38;
        float f47 = -(f37 / f38);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCardPlugin", "adjustLayout targetHeight:" + f17 + ",targetWidth:" + f28 + ",sourceHeight:" + a17 + ",sourceWidth:" + a18 + ",scale:" + f19 + ",diffHeight:" + f29 + ",translationY:" + f39 + ",diffWidth:" + f37 + ',' + f47);
        android.view.View view3 = this.f446759v;
        if (view3 != null) {
            view3.setScaleX(f19);
        }
        android.view.View view4 = this.f446759v;
        if (view4 != null) {
            view4.setScaleY(f19);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f446760w;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setTranslationY(f39);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f446760w;
        if (c22699x3dcdb3524 == null) {
            return;
        }
        c22699x3dcdb3524.setTranslationX(f47);
    }

    public void w1(boolean z17, km2.z lotteryInfoWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        int i17 = lotteryInfoWrapper.f390762a;
        qo0.c cVar = this.f446753p;
        if (i17 == 2) {
            qo0.b bVar = qo0.b.f446921n3;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LOTTERY_VISIBILITY_CACHE", true);
            cVar.mo46557x60d69242(bVar, bundle);
            return;
        }
        if (i17 != 3) {
            return;
        }
        qo0.b bVar2 = qo0.b.f446921n3;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("PARAM_FINDER_LIVE_LOTTERY_VISIBILITY_CACHE", true);
        cVar.mo46557x60d69242(bVar2, bundle2);
        on2.z2 z2Var = (on2.z2) P0(on2.z2.class);
        r45.cz1 cz1Var = lotteryInfoWrapper.f390765d;
        z2Var.c7(cz1Var != null ? cz1Var.m75945x2fec8307(0) : null);
    }

    public final void x1(km2.z lotteryInfoWrapper, r45.cz1 lotteryInfo, int i17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfo, "lotteryInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f446761x = callback;
        this.f446762y = lotteryInfo;
        boolean z17 = lotteryInfoWrapper.f390764c;
        boolean z18 = w0() == 0;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playLotteringAnim id:");
        sb6.append(lotteryInfo.m75945x2fec8307(0));
        sb6.append(" status:");
        sb6.append(i17);
        sb6.append(", haveLottering:");
        sb6.append(z17);
        sb6.append(", isCardShowing:");
        sb6.append(z18);
        sb6.append(", lottering:");
        sb6.append(this.f446756s);
        sb6.append(",callback:");
        yz5.l lVar = this.f446761x;
        sb6.append(lVar != null ? java.lang.Integer.valueOf(lVar.hashCode()) : null);
        sb6.append(",isPagEnable:true");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCardPlugin", sb6.toString());
        if (this.f446756s) {
            return;
        }
        if (z17) {
            yz5.l lVar2 = this.f446761x;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(this.f446762y);
                return;
            }
            return;
        }
        lotteryInfoWrapper.f390764c = true;
        if (!z18) {
            this.f446756s = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new qn2.y(this, new qn2.w(this, lotteryInfo, i17), null), 3, null);
        } else {
            yz5.l lVar3 = this.f446761x;
            if (lVar3 != null) {
                lVar3.mo146xb9724478(this.f446762y);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        android.content.Context context;
        android.content.res.Resources resources;
        super.z0();
        android.view.View view = this.f446759v;
        if (view == null) {
            return;
        }
        view.setBackground((view == null || (context = view.getContext()) == null || (resources = context.getResources()) == null) ? null : resources.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f78086x3925c391));
    }
}
