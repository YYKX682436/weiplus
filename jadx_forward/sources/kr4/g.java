package kr4;

/* loaded from: classes11.dex */
public final class g extends dm.wb {

    /* renamed from: l1, reason: collision with root package name */
    public static final l75.e0 f393038l1 = dm.wb.m125669x3593deb(kr4.g.class);
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 Z;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.CharSequence f393039p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f393040x0;

    /* renamed from: y0, reason: collision with root package name */
    public kr4.f f393041y0;

    public g() {
    }

    @Override // dm.wb, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = f393038l1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    public final boolean t0() {
        java.lang.CharSequence i17;
        if (this.f393041y0 == null) {
            return false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f69048xbed8694c, "w1wsayhisessionholder@w1wmsg")) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pgt);
            this.f393040x0 = string;
            this.f393039p0 = string;
            return true;
        }
        java.lang.String str = this.f393040x0;
        kr4.k Ai = ((fr4.g0) i95.n0.c(fr4.g0.class)).Ai();
        java.lang.String field_talkerUserName = this.f69050x3e123854;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talkerUserName, "field_talkerUserName");
        kr4.e y07 = Ai.y0(field_talkerUserName);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 t07 = y07 != null ? y07.t0() : null;
        this.Z = t07;
        this.f393040x0 = t07 != null ? t07.g2() : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.Z;
        if (z3Var == null || (i17 = z3Var.J2) == null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str2 = this.f393040x0;
            ((ke0.e) xVar).getClass();
            i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2);
        }
        this.f393039p0 = i17;
        return true ^ p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f393040x0, str);
    }

    /* renamed from: toString */
    public java.lang.String m144235x9616526c() {
        java.lang.String str = this.f393040x0;
        return str == null ? "" : str;
    }

    public g(kr4.f opDelegator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opDelegator, "opDelegator");
        this.f393041y0 = opDelegator;
    }
}
