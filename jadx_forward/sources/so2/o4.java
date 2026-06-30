package so2;

/* loaded from: classes2.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.a2 f492057a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f492058b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f492059c;

    /* renamed from: d, reason: collision with root package name */
    public so2.u0 f492060d;

    /* renamed from: e, reason: collision with root package name */
    public int f492061e;

    /* renamed from: f, reason: collision with root package name */
    public long f492062f;

    public o4(so2.a2 a2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var, so2.u0 u0Var, int i17, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        a2Var = (i18 & 1) != 0 ? null : a2Var;
        c1163xf1deaba4 = (i18 & 2) != 0 ? null : c1163xf1deaba4;
        w2Var = (i18 & 4) != 0 ? null : w2Var;
        u0Var = (i18 & 8) != 0 ? null : u0Var;
        i17 = (i18 & 16) != 0 ? 0 : i17;
        j17 = (i18 & 32) != 0 ? 0L : j17;
        this.f492057a = a2Var;
        this.f492058b = c1163xf1deaba4;
        this.f492059c = w2Var;
        this.f492060d = u0Var;
        this.f492061e = i17;
        this.f492062f = j17;
    }

    public final void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu uic, r45.hp2 hp2Var) {
        long intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uic, "uic");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f492059c;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f492058b;
        if (w2Var == null) {
            so2.p4 p4Var = new so2.p4(i17, new java.lang.ref.WeakReference(uic));
            this.f492059c = p4Var;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.i(p4Var);
            }
        }
        if (this.f492060d == null && c1163xf1deaba4 != null && hp2Var != null) {
            if (hp2Var.f457910g != null) {
                intValue = r4.f456038f * 1000;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.N8).mo141623x754a37bb()).r()).intValue();
            }
            long j17 = intValue;
            r45.fp2 fp2Var = hp2Var.f457910g;
            so2.u0 u0Var = new so2.u0("Finder.FinderPopupLogic", new so2.r0(j17, 0, fp2Var != null ? fp2Var.f456037e : -1, 0, false, true, 26, null));
            this.f492060d = u0Var;
            u0Var.a(c1163xf1deaba4, true, so2.u0.f492151m);
            so2.u0 u0Var2 = this.f492060d;
            if (u0Var2 != null) {
                u0Var2.f492160i = new so2.n4(uic, i17);
            }
        }
        this.f492062f = android.os.SystemClock.elapsedRealtime();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        this.f492061e = c1162x665295de != null ? c1162x665295de.x() : 0;
    }

    /* renamed from: equals */
    public boolean m164926xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.o4)) {
            return false;
        }
        so2.o4 o4Var = (so2.o4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492057a, o4Var.f492057a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492058b, o4Var.f492058b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492059c, o4Var.f492059c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492060d, o4Var.f492060d) && this.f492061e == o4Var.f492061e && this.f492062f == o4Var.f492062f;
    }

    /* renamed from: hashCode */
    public int m164927x8cdac1b() {
        so2.a2 a2Var = this.f492057a;
        int hashCode = (a2Var == null ? 0 : a2Var.hashCode()) * 31;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f492058b;
        int hashCode2 = (hashCode + (c1163xf1deaba4 == null ? 0 : c1163xf1deaba4.hashCode())) * 31;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f492059c;
        int hashCode3 = (hashCode2 + (w2Var == null ? 0 : w2Var.hashCode())) * 31;
        so2.u0 u0Var = this.f492060d;
        return ((((hashCode3 + (u0Var != null ? u0Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f492061e)) * 31) + java.lang.Long.hashCode(this.f492062f);
    }

    /* renamed from: toString */
    public java.lang.String m164928x9616526c() {
        so2.s4 s4Var;
        r45.gp2 gp2Var;
        r45.gz2 gz2Var;
        so2.s4 s4Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popup state:");
        r45.vs2 vs2Var = null;
        so2.a2 a2Var = this.f492057a;
        sb6.append((a2Var == null || (s4Var2 = a2Var.f491784h) == null) ? null : s4Var2.f492125a);
        sb6.append(",info:");
        if (a2Var != null && (s4Var = a2Var.f491784h) != null && (gp2Var = s4Var.f492126b) != null && (gz2Var = (r45.gz2) gp2Var.m75936x14adae67(0)) != null) {
            vs2Var = (r45.vs2) gz2Var.m75936x14adae67(0);
        }
        sb6.append(hc2.u0.e(vs2Var));
        sb6.append(";\tcurRvPos=");
        sb6.append(this.f492061e);
        sb6.append(",lastScrollTime:");
        sb6.append(this.f492062f);
        sb6.append(";\trecyclerView:");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f492058b;
        sb6.append(c1163xf1deaba4 != null ? c1163xf1deaba4.hashCode() : 0);
        sb6.append(",listener:");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f492059c;
        sb6.append(w2Var != null ? w2Var.hashCode() : 0);
        return sb6.toString();
    }
}
