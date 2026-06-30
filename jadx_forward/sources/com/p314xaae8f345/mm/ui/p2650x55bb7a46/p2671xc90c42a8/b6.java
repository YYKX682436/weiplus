package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class b6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f283670t = {978321457, 974127153};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f283671u = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283672s;

    public b6(android.content.Context context) {
        super(context);
        this.f283672s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5 p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        ot0.q v17;
        b6Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f430199i;
        if (!(i17 == 111 || i17 == 82)) {
            return null;
        }
        java.lang.String j18 = b6Var.j(f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(b6Var.f284075e), false);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5 z5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5(b6Var, f9Var.mo78012x3fdd41df(), v17.f430199i, v17.f430187f, f9Var.m124847x74d37ac6(), n17.d1(), n17.f2(), n17.w0(), a3Var != null ? a3Var.z0(j18) : "");
        int i18 = v17.f430199i;
        if (i18 == 82) {
            r45.br2 br2Var = ((zy2.l) v17.y(zy2.l.class)).f558982b;
            z5Var.f284123k = br2Var.m75945x2fec8307(8);
            z5Var.f279943c = br2Var.m75945x2fec8307(9);
            z5Var.f284124l = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o47, new java.text.DecimalFormat("#.##").format(br2Var.m75939xb282bd08(11) / 100.0f), br2Var.m75945x2fec8307(13));
            z5Var.f284122j = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y5.PRODUCT;
            return z5Var;
        }
        if (i18 != 111) {
            return z5Var;
        }
        bw5.g9 g9Var = ((hs.a) v17.y(hs.a.class)).f366040b;
        z5Var.f284123k = g9Var.b();
        z5Var.f279943c = g9Var.m11974x8010e5e4();
        z5Var.f284124l = b6Var.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mes);
        z5Var.f284122j = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y5.SHOP;
        return z5Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "[loadData] isFirst:%s", objArr);
        this.f284076f.P(z17);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o5(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.met);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a6(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571128d34, viewGroup, false));
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a6 a6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a6) e0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5 z5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5) h(i17);
        a6Var.f279936f.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.c(this.f284074d, z5Var.f279941a));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y5 y5Var = z5Var.f284122j;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y5 y5Var2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y5.SHOP;
        mn2.g1 g1Var = mn2.g1.f411508a;
        android.widget.ImageView imageView = a6Var.f283650i;
        if (y5Var == y5Var2) {
            vo0.d g17 = g1Var.g();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            g17.c(ya2.l.f542035a.e(z5Var.f284123k, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411495p));
        } else {
            vo0.d f17 = g1Var.f();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            f17.c(ya2.l.f542035a.e(z5Var.f284123k, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411495p));
        }
        java.lang.String str = z5Var.f284124l;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = a6Var.f283651m;
        textView.setText(str);
        a6Var.i(textView, this.f284077g.f279966e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.met);
    }

    @Override // zb5.h
    /* renamed from: getType */
    public int mo79812xfb85f7b0() {
        return 0;
    }

    @Override // zb5.h
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 i() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x5(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 12;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283672s.set(true);
        super.mo79813x3f5eee52();
    }
}
