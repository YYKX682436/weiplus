package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class z0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: v, reason: collision with root package name */
    public static final te5.i f284102v = new te5.i(0, 1, null);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f284103w = {1090519089};

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f284104x = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f284105s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f284106t;

    /* renamed from: u, reason: collision with root package name */
    public final int f284107u;

    public z0(android.content.Context context) {
        super(context);
        this.f284105s = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f284106t = new java.util.concurrent.ConcurrentHashMap();
        this.f284107u = -1;
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        ot0.q v17;
        z0Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f430199i;
        if (!(te5.h.f500182a.c() ? ez.v0.f339310a.i(java.lang.Integer.valueOf(i17)) : 6 == i17)) {
            return null;
        }
        java.lang.String j18 = z0Var.j(f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z0Var.f284075e), false);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j18) : "";
        java.lang.String str = v17.f430223o;
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        int a17 = o25.y.a(str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 w0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0(z0Var, f9Var.mo78012x3fdd41df(), v17.f430199i, v17.n(), f9Var.m124847x74d37ac6(), n17.d1(), n17.f2(), n17.w0(), z07);
        w0Var.f284044j = a17;
        w0Var.f284045k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(v17.f430215m);
        w0Var.f284046l = v17.f430223o;
        return w0Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHistoryListPresenter", "[loadData] isFirst:%s", java.lang.Boolean.valueOf(z17));
        this.f284076f.P(z17);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.k0(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571520hn);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return te5.h.f500182a.c() ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x0(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e5i, viewGroup, false)) : new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y0(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.acy, viewGroup, false));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e0 e0Var, int i17, int i18) {
        if (!te5.h.f500182a.c()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y0 y0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y0) e0Var;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 w0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0) h(i17);
            if (w0Var == null) {
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w0Var.f284045k)) {
                y0Var.f284087m.setVisibility(8);
            } else {
                y0Var.f284087m.setVisibility(0);
                android.widget.TextView textView = y0Var.f284087m;
                java.lang.String str = w0Var.f284045k;
                textView.setText(str != null ? str : "");
            }
            y0Var.f284086i.setImageResource(w0Var.f284044j);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x0 x0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x0) e0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 w0Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0) h(i17);
        if (w0Var2 == null) {
            return;
        }
        long j17 = w0Var2.f279944d;
        x0Var.f284066q = j17;
        android.widget.TextView textView2 = x0Var.f284062m;
        java.lang.String str2 = w0Var2.f284045k;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        textView2.setText(str2 != null ? str2 : "");
        te5.i iVar = (te5.i) this.f284106t.get(java.lang.Long.valueOf(j17));
        if (iVar != null) {
            q(x0Var, iVar, w0Var2);
        } else {
            q(x0Var, f284102v, w0Var2);
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v0(this, j17, w0Var2.f284046l, x0Var, w0Var2));
        }
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571520hn);
    }

    @Override // zb5.h
    /* renamed from: getType */
    public int mo79812xfb85f7b0() {
        return 6;
    }

    @Override // zb5.h
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 i() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t0(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f284105s.set(true);
        super.mo79813x3f5eee52();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x0 r8, te5.i r9, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 r10) {
        /*
            r7 = this;
            android.widget.ImageView r0 = r8.f284061i
            int r1 = r9.f500205d
            r0.setImageResource(r1)
            boolean r0 = r9.f500203b
            r1 = 0
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r2 = r8.f284064o
            if (r0 == 0) goto L16
            r2.setVisibility(r1)
            int r0 = r9.f500204c
            r2.m82113x3ae760af(r0)
        L16:
            r0 = 1
            r3 = 8
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r8.f284065p
            int r5 = r9.f500202a
            if (r5 == r0) goto L50
            r6 = 2
            if (r5 == r6) goto L43
            r6 = 3
            if (r5 == r6) goto L50
            r0 = 4
            if (r5 == r0) goto L36
            r0 = 9
            if (r5 == r0) goto L43
            r4.setVisibility(r3)
            r2.setVisibility(r3)
            r2.m82112x7e1bd1fe(r1)
            goto L56
        L36:
            r2.m82112x7e1bd1fe(r1)
            r4.setVisibility(r1)
            r0 = 2131689552(0x7f0f0050, float:1.9008123E38)
            r4.setImageResource(r0)
            goto L56
        L43:
            r2.m82112x7e1bd1fe(r1)
            r4.setVisibility(r1)
            r0 = 2131689553(0x7f0f0051, float:1.9008125E38)
            r4.setImageResource(r0)
            goto L56
        L50:
            r4.setVisibility(r3)
            r2.m82112x7e1bd1fe(r0)
        L56:
            java.lang.String r10 = r10.f284045k
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r10 != 0) goto L5e
            java.lang.String r10 = ""
        L5e:
            android.widget.TextView r0 = r8.f284062m
            r0.setText(r10)
            java.lang.String r10 = r9.f500206e
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r10)
            android.content.Context r5 = r7.f284074d
            android.widget.TextView r8 = r8.f284063n
            if (r0 == 0) goto L73
            r8.setVisibility(r3)
            goto L82
        L73:
            r8.setVisibility(r1)
            r8.setText(r10)
            int r10 = r9.f500208g
            int r10 = r5.getColor(r10)
            r8.setTextColor(r10)
        L82:
            te5.j r8 = te5.j.f500219a
            java.lang.String r9 = r9.f500207f
            int r8 = r8.b(r9)
            android.content.res.Resources r9 = r5.getResources()
            r10 = 0
            int r8 = r9.getColor(r8, r10)
            r4.m82040x7541828(r8)
            r2.m82114x7d38f3f4(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0.q(com.tencent.mm.ui.chatting.presenter.x0, te5.i, com.tencent.mm.ui.chatting.presenter.w0):void");
    }
}
