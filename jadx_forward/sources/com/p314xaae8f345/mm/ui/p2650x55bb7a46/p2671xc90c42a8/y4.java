package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class y4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f284097t = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f284098s;

    public y4(android.content.Context context) {
        super(context);
        this.f284098s = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f284076f.P(z17);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p4(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icj);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x4(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.acy, viewGroup, false));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18) {
        if (i17 == 0 && q() && !c01.e2.E(this.f284075e)) {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s() && (k3Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v4)) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v4) k3Var).f284041e.setVisibility(0);
                return;
            }
        }
        if (k3Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v4) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v4) k3Var).f284041e.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v4(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfd, viewGroup, false));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e0 e0Var, int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x4 x4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x4) e0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w4 w4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w4) h(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w4Var.f284053k)) {
            x4Var.f284072m.setVisibility(8);
        } else {
            x4Var.f284072m.setVisibility(0);
            java.lang.String str = w4Var.f284053k;
            if (str == null) {
                str = "";
            }
            x4Var.f284072m.setText(str);
        }
        int b17 = i65.a.b(this.f284074d, 6);
        x4Var.f284071i.setPadding(b17, b17, b17, b17);
        int i19 = w4Var.f284052j;
        android.widget.ImageView imageView = x4Var.f284071i;
        imageView.setImageResource(i19);
        imageView.setBackgroundColor(w4Var.f284054l);
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icj);
    }

    @Override // zb5.h
    /* renamed from: getType */
    public int mo79812xfb85f7b0() {
        return 5;
    }

    @Override // zb5.h
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 i() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t4(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f284098s.set(true);
        super.mo79813x3f5eee52();
    }

    public boolean p(int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1("1001", 0) == i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1("1002", 0) == i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1("1005", 0) == i17 || 419430449 == i17;
    }

    public final boolean q() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f284075e) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f284075e);
    }
}
