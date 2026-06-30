package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class d extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f224881d;

    /* renamed from: e, reason: collision with root package name */
    public p13.y f224882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f224884g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f224885h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f224886i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f224887m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f224888n;

    /* renamed from: o, reason: collision with root package name */
    public p13.r f224889o;

    public d(int i17) {
        this.f224881d = i17;
        java.util.regex.Pattern.compile(",");
        int h17 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        int h18 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        textPaint.setTextSize(h17);
        textPaint2.setTextSize(h18);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d other = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f224887m;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = other.f224887m;
        return r26.i0.q(d17, z3Var2 != null ? z3Var2.d1() : null, false, 2, null);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d other = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 2;
    }

    public final android.text.SpannableString n(android.content.Context context, java.lang.String str, int i17) {
        return ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, i17);
    }

    @Override // xm3.d
    public java.lang.String v() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f224887m;
        return java.lang.String.valueOf(z3Var != null ? z3Var.d1() : null);
    }
}
