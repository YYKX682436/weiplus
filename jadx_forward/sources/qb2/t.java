package qb2;

/* loaded from: classes10.dex */
public final class t extends dm.a4 {
    public static final l75.e0 H1 = dm.a4.m124785x3593deb(qb2.t.class);
    public qb2.s C1;
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 D1;
    public java.lang.CharSequence E1;
    public java.lang.String F1;
    public java.lang.String G1;

    public t(qb2.s opDelegator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opDelegator, "opDelegator");
        this.C1 = opDelegator;
    }

    /* renamed from: equals */
    public boolean m159726xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof qb2.t) && ((qb2.t) obj).f72763xa3c65b86 == this.f72763xa3c65b86;
    }

    @Override // dm.a4, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = H1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    /* renamed from: hashCode */
    public int m159727x8cdac1b() {
        return (int) this.f72763xa3c65b86;
    }

    public final java.lang.CharSequence t0() {
        if (this.C1 == null) {
            return "";
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = this.f65856x51f5672e;
        if (str == null || r26.n0.N(str)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = this.f65853xf66fcca9;
            ((ke0.e) xVar).getClass();
            return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.enp));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31)), 0, spannableStringBuilder.length(), 33);
        android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str3 = this.f65856x51f5672e;
        ((ke0.e) xVar2).getClass();
        append.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3));
        return spannableStringBuilder;
    }

    public final void u0() {
        java.lang.CharSequence Vi;
        if (this.C1 != null) {
            java.lang.String str = this.f65866xbed8694c;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "findersayhisessionholder")) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eo7);
                this.F1 = string;
                this.E1 = string;
            } else {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finderaliassessionholder")) {
                    java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.enm, ya2.h.f542017a.f().w0());
                    this.F1 = string2;
                    this.E1 = string2;
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(this.f65866xbed8694c);
                this.D1 = m17;
                this.F1 = m17 != null ? m17.g2() : null;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.D1;
                if (z3Var == null || (Vi = z3Var.J2) == null) {
                    Vi = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Vi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.F1);
                }
                this.E1 = Vi;
            }
        }
    }

    public t() {
    }
}
