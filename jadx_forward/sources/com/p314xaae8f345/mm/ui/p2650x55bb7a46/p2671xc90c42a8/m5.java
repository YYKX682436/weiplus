package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class m5 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f283880t = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283881s;

    public m5(android.content.Context context) {
        super(context);
        this.f283881s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z4 p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        java.lang.String d17;
        m5Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            return null;
        }
        m15.a aVar = new m15.a();
        aVar.m126728xdc93280d(j17);
        java.lang.String j18 = m5Var.j(f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(m5Var.f284075e), false);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j18) : "";
        java.lang.String str = (n17 == null || (d17 = n17.d1()) == null) ? j18 : d17;
        java.lang.String f27 = n17 != null ? n17.f2() : null;
        java.lang.String str2 = f27 == null ? "" : f27;
        java.lang.String w07 = n17 != null ? n17.w0() : null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z4 z4Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z4(m5Var, f9Var.mo78012x3fdd41df(), 42, aVar.m146660x8010e5e4(), f9Var.m124847x74d37ac6(), str, str2, w07 == null ? "" : w07, z07);
        int o17 = aVar.o();
        java.util.Set set = c01.e2.f118650a;
        boolean D3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(o17);
        android.content.Context context = m5Var.f284074d;
        if (D3) {
            if (aVar.n() == 1) {
                z4Var.f284121l = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7g);
            } else {
                z4Var.f284121l = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572384b14);
            }
            z4Var.f284120k = true;
        } else {
            z4Var.f284121l = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4y);
            z4Var.f284120k = false;
        }
        z4Var.f284119j = aVar.m146661x6c03c64c();
        z4Var.f279943c = aVar.m146660x8010e5e4();
        return z4Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f284076f.P(z17);
        this.f283881s.set(false);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.k5(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        java.lang.String string = this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571128d34, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a5(this, inflate);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e0 baseholder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseholder, "baseholder");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a5 a5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a5) baseholder;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 h17 = h(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.presenter.ShareCardHistoryListPresenter.ShareCardHistoryListItem");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z4 z4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z4) h17;
        a5Var.f279936f.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.c(this.f284074d, z4Var.f279941a));
        boolean z17 = z4Var.f284120k;
        android.widget.ImageView imageView = a5Var.f283648i;
        if (z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z4Var.f284119j)) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgo);
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, z4Var.f284119j);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z4Var.f284119j)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, z4Var.f284119j, null);
        }
        java.lang.String str = z4Var.f284121l;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = a5Var.f283649m;
        textView.setText(str);
        a5Var.i(textView, this.f284077g.f279966e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        java.lang.String string = this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // zb5.h
    /* renamed from: getType */
    public int mo79812xfb85f7b0() {
        return 0;
    }

    @Override // zb5.h
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 i() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.g5(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 9;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283881s.set(true);
        super.mo79813x3f5eee52();
    }
}
