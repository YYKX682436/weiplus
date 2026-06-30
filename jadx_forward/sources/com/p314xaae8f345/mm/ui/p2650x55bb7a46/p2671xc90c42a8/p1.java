package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class p1 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f283949t = {-2130706383, -2113929167};

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f283950u = {"msgId", "createTime"};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f283951v = {"msgId", "type", "createTime", "talker", "content", "isSend", "imgPath", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283952s;

    public p1(android.content.Context context) {
        super(context);
        this.f283952s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static void p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var, boolean z17, long j17) {
        if (p1Var.f283952s.get()) {
            return;
        }
        p1Var.n();
        if (!p1Var.f284079i.isEmpty()) {
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0) p1Var.f284079i.get(r0.size() - 1)).a() == 2147483646) {
                p1Var.f284079i.remove(r0.size() - 1);
            }
        }
        p1Var.f284080m = p1Var.f284079i;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Integer.valueOf(p1Var.f284079i.size())};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GiftHistoryListPresenter", "[loadData][perf][final] total cost:%dms, items:%d", objArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.r1(p1Var, z17));
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y1 q(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        ot0.q v17;
        p1Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f430199i;
        if (!(i17 == 115 || i17 == 124)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(p1Var.j(f9Var, z17, false), true);
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GiftHistoryListPresenter", "decode msg content failed, ecsGiftAppMsg is null", null);
            return null;
        }
        w05.d dVar = (w05.d) k17.m75936x14adae67(k17.f513848e + 66);
        if (dVar == null) {
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GiftHistoryListPresenter", "decode msg content failed, ecsGiftAppMsgInfo is null", null);
            return null;
        }
        w05.e eVar = (w05.e) dVar.s().getFirst();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y1 y1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y1(p1Var, f9Var.mo78012x3fdd41df(), v17.f430199i, v17.f430187f, f9Var.m124847x74d37ac6(), n17.d1(), n17.f2(), "", "");
        y1Var.f284090l = dVar.B();
        y1Var.f284088j = dVar.C();
        int i27 = y1Var.f284090l;
        int i28 = h20.h.f359801a;
        if (i27 == 0) {
            y1Var.f279946f += com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573697o41);
        } else if (i27 == 1) {
            y1Var.f279946f += com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573699o43);
        } else {
            y1Var.f279946f += com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573698o42);
        }
        if (y1Var.f284090l == 2 || v17.f430199i == 115) {
            y1Var.f279943c = ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).cj(dVar.w(), dVar.n(), n17.d1(), dVar.z(), null);
        } else {
            y1Var.f279943c = y1Var.f284088j;
            y1Var.f284088j = "";
        }
        if (eVar.l() == 0) {
            y1Var.f284091m = com.p314xaae8f345.mm.R.raw.f78664x59152d74;
        } else {
            y1Var.f284091m = com.p314xaae8f345.mm.R.raw.f78665x4037e31b;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.x())) {
            int i29 = v17.f430199i;
            if (i29 == 124) {
                int i37 = y1Var.f284090l;
                if (i37 == 0) {
                    y1Var.f284089k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573700o44);
                } else if (i37 == 1) {
                    y1Var.f284089k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573702o46);
                } else {
                    y1Var.f284089k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573701o45);
                }
            } else if (i29 == 115) {
                y1Var.f284089k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573701o45);
            } else {
                y1Var.f284089k = "";
            }
        } else {
            y1Var.f284089k = eVar.x();
        }
        return y1Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f284076f.P(z17);
        this.f283952s.set(false);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.q1(this, z17), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mer);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z1(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571128d34, viewGroup, false));
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z1 z1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z1) e0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y1 y1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y1) h(i17);
        z1Var.f279936f.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.c(this.f284074d, y1Var.f279941a));
        z1Var.f284108i.setImageResource(y1Var.f284091m);
        java.lang.String str = y1Var.f284088j;
        android.widget.TextView textView = z1Var.f284109m;
        if (str != "") {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            z1Var.i(textView, this.f284077g.f279966e);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        z1Var.f284110n.setText(y1Var.f284089k);
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mer);
    }

    @Override // zb5.h
    /* renamed from: getType */
    public int mo79812xfb85f7b0() {
        return 0;
    }

    @Override // zb5.h
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 i() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x1(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 13;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283952s.set(true);
        super.mo79813x3f5eee52();
    }
}
