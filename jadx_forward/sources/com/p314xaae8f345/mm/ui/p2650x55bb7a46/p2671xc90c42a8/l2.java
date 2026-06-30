package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class l2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f283854t = {48};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f283855u = {"msgId", "createTime"};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f283856v = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283857s;

    public l2(android.content.Context context) {
        super(context);
        this.f283857s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a2 p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        l2Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            return null;
        }
        o15.b bVar = new o15.b();
        bVar.m126728xdc93280d(j17);
        java.lang.String j18 = l2Var.j(f9Var, z17, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j18) : "";
        long mo78012x3fdd41df = f9Var.mo78012x3fdd41df();
        o15.a j19 = bVar.j();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a2 a2Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a2(l2Var, mo78012x3fdd41df, 42, j19 != null ? j19.s() : null, f9Var.m124847x74d37ac6(), n17.d1(), n17.f2(), n17.w0(), z07);
        a2Var.f283637j = com.p314xaae8f345.mm.R.C30861xcebc809e.f563008bi4;
        o15.a j27 = bVar.j();
        a2Var.f283638k = j27 != null ? j27.l() : null;
        return a2Var;
    }

    public static final void q(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var, boolean z17, long j17) {
        if (l2Var.f283857s.get()) {
            return;
        }
        l2Var.n();
        java.util.ArrayList mDataList = l2Var.f284079i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mDataList, "mDataList");
        if (!mDataList.isEmpty()) {
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0) l2Var.f284079i.get(r0.size() - 1)).a() == 2147483646) {
                l2Var.f284079i.remove(r0.size() - 1);
            }
        }
        l2Var.f284080m = l2Var.f284079i;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Integer.valueOf(l2Var.f284079i.size())};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationHistoryListPresenter", "[loadData][perf][final] total cost:%dms, items:%d", objArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.i2(l2Var, z17));
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f284076f.P(z17);
        this.f283857s.set(false);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.j2(this, z17), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        java.lang.String string = this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p7f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571128d34, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b2(this, inflate);
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b2 b2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b2) baseholder;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 h17 = h(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.presenter.LocationHistoryListPresenter.LocationHistoryListItem");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a2 a2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a2) h17;
        b2Var.f279936f.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.c(this.f284074d, a2Var.f279941a));
        b2Var.f283658i.setImageResource(a2Var.f283637j);
        java.lang.String str = a2Var.f283638k;
        android.widget.TextView textView = b2Var.f283659m;
        textView.setText(str);
        b2Var.i(textView, this.f284077g.f279966e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        java.lang.String string = this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p7f);
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
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h2(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283857s.set(true);
        super.mo79813x3f5eee52();
    }
}
