package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class e30 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements jf2.o, jf2.l, jf2.n {
    public int A;
    public final android.widget.TextView B;
    public final java.lang.Object C;
    public final boolean D;
    public boolean E;
    public int F;
    public final int G;
    public final long H;
    public final java.lang.Runnable I;

    /* renamed from: J, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f199743J;
    public p3325xe03a0797.p3326xc267989b.r2 K;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f199744p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f199745q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f199746r;

    /* renamed from: s, reason: collision with root package name */
    public final int f199747s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.FrameLayout f199748t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.RelativeLayout f199749u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f199750v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f199751w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f199752x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1479x5a3e54d.C14181x8c64b469 f199753y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f199754z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f199744p = statusMonitor;
        this.f199745q = basePlugin;
        this.f199746r = "Finder.FinderLiveVisitorLikeWidget";
        ae2.in inVar = ae2.in.f85221a;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f85444w5).mo141623x754a37bb()).r();
        java.lang.Integer num = (java.lang.Integer) (((java.lang.Number) r17).intValue() > 0 ? r17 : null);
        this.f199747s = num != null ? num.intValue() : 9;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) root.findViewById(com.p314xaae8f345.mm.R.id.f6f);
        this.f199748t = frameLayout;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.f6e);
        relativeLayout.setContentDescription(root.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573122dm0));
        this.f199749u = relativeLayout;
        this.f199750v = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.f6g);
        this.f199751w = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) root.findViewById(com.p314xaae8f345.mm.R.id.f6h);
        android.view.ViewParent parent = root.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f199752x = (android.widget.TextView) ((android.view.ViewGroup) parent).findViewById(com.p314xaae8f345.mm.R.id.f6i);
        this.f199753y = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1479x5a3e54d.C14181x8c64b469) root.findViewById(com.p314xaae8f345.mm.R.id.euv);
        this.f199754z = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.eus);
        this.B = (android.widget.TextView) basePlugin.f194857f.findViewById(com.p314xaae8f345.mm.R.id.too);
        this.C = root.getContext().getSystemService("vibrator");
        this.D = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Q1).mo141623x754a37bb()).r()).intValue() == 0;
        this.G = root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
        this.H = 200L;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(frameLayout, "finder_live_room_like");
        K0(8);
        frameLayout.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j20(this, root));
        android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        zl2.r4.o3(zl2.r4.f555483a, root, "Finder.FinderLiveVisitorLikeWidget", false, false, 12, null);
        this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v20(this);
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var, android.view.View view, float f17) {
        e30Var.getClass();
        view.animate().setDuration(100L).scaleX(f17).scaleY(f17).start();
    }

    @Override // jf2.l
    public void F(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        x1(false);
    }

    @Override // jf2.o
    public void b() {
        K0(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79655x5636c5e6), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.daw));
    }

    @Override // jf2.o
    public void g() {
        K0(8);
    }

    @Override // jf2.o
    public boolean i() {
        if (((mm2.c1) this.f199745q.P0(mm2.c1.class)).T) {
            return false;
        }
        return !(((mm2.n0) this.f199745q.P0(mm2.n0.class)).f410806r) && ((mm2.c1) this.f199745q.P0(mm2.c1.class)).F;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 14;
    }

    public final void u1() {
        r45.i62 i62Var;
        r45.i62 i62Var2;
        ((mm2.c1) P0(mm2.c1.class)).L1++;
        df2.cn cnVar = (df2.cn) U0(df2.cn.class);
        if (cnVar != null) {
            long j17 = ((mm2.c1) P0(mm2.c1.class)).L1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkShowBubble] enable = ");
            r45.k62 k62Var = cnVar.E;
            boolean z17 = false;
            sb6.append(k62Var != null ? java.lang.Boolean.valueOf(k62Var.m75933x41a8a7f2(0)) : null);
            sb6.append(", limit = ");
            r45.k62 k62Var2 = cnVar.E;
            sb6.append(k62Var2 != null ? java.lang.Integer.valueOf(k62Var2.m75939xb282bd08(2)) : null);
            sb6.append(", bubble = ");
            r45.k62 k62Var3 = cnVar.E;
            sb6.append((k62Var3 == null || (i62Var2 = (r45.i62) k62Var3.m75936x14adae67(1)) == null) ? null : pm0.b0.g(i62Var2));
            sb6.append(", cnt = ");
            sb6.append(j17);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = cnVar.f311425p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            r45.k62 k62Var4 = cnVar.E;
            if (k62Var4 != null) {
                if (k62Var4.m75933x41a8a7f2(0) && ((r45.i62) k62Var4.m75936x14adae67(1)) != null && j17 >= k62Var4.m75939xb282bd08(2)) {
                    z17 = true;
                }
                r45.k62 k62Var5 = z17 ? k62Var4 : null;
                if (k62Var5 == null || (i62Var = (r45.i62) k62Var5.m75936x14adae67(1)) == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkShowBubble] show bubble by like, cnt = " + j17);
                cnVar.f311432w.mo523x53d8522f(i62Var);
            }
        }
    }

    public final void v1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199746r, "[ken_startPostLike] likeCount+1 = " + (this.A + 1) + ", MAX_LIKE_ONE_TIME = " + this.f199747s);
        this.f199743J = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w20(this, z17, null), 1, null);
    }

    public final void w1(boolean z17) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.K;
        boolean z18 = false;
        if (r2Var != null && r2Var.a()) {
            z18 = true;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199746r, "[startUpLoadLike] upload like job is running");
        } else {
            this.K = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x20(z17, this, null), 3, null);
        }
    }

    public final void x1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1479x5a3e54d.C14181x8c64b469 c14181x8c64b469 = this.f199753y;
        if (c14181x8c64b469.getVisibility() == 0) {
            android.widget.ImageView imageView = this.f199754z;
            if (z17) {
                c14181x8c64b469.animate().alpha(0.0f).setDuration(1000L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y20(this)).start();
                imageView.animate().alpha(0.0f).setDuration(1000L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z20(this)).start();
                return;
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = c14181x8c64b469.f193057h;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            c14181x8c64b469.f193059m = 360.0f;
            imageView.setVisibility(8);
            c14181x8c64b469.setVisibility(8);
        }
    }

    public final void y1(java.lang.String str, yz5.l lVar) {
        java.lang.String str2 = this.f199746r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateCheerIcon:" + str);
        if (this.E) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "applaud mode ,return");
            return;
        }
        if (str == null || str.length() == 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d30(this, lVar));
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c30 c30Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c30(this, lVar);
        a17.getClass();
        a17.f529406d = c30Var;
        a17.f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
    }

    public final void z1() {
        java.lang.Object obj = this.C;
        if (obj instanceof android.os.Vibrator) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                ((android.os.Vibrator) obj).vibrate(android.os.VibrationEffect.createOneShot(10L, 255));
            } else {
                ((android.os.Vibrator) obj).vibrate(10L);
            }
        }
    }
}
