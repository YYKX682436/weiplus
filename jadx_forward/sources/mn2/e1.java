package mn2;

/* loaded from: classes10.dex */
public final class e1 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f411474e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f411475f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f411476g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f411477h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.yq4 f411478i;

    public e1(java.lang.String url, java.lang.String id6, java.lang.String name, boolean z17, boolean z18, r45.yq4 yq4Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? false : z18;
        yq4Var = (i17 & 32) != 0 ? null : yq4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f411474e = url;
        this.f411475f = id6;
        this.f411476g = z17;
        this.f411477h = z18;
        this.f411478i = yq4Var;
    }

    @Override // mn2.h3
    /* renamed from: getMediaType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mo148082x7f025288() {
        return this.f411476g ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.T : this.f411477h ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.U : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.S;
    }

    @Override // mn2.h3
    /* renamed from: getPath */
    public java.lang.String mo148083xfb83cc9b() {
        return "";
    }

    @Override // mn2.h3
    /* renamed from: getUrl */
    public java.lang.String mo148084xb5887639() {
        return this.f411474e;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String i() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String l() {
        return this.f411474e;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String str = this.f411475f;
        r45.yq4 yq4Var = this.f411478i;
        if (yq4Var == null || this.f411476g) {
            return str + '_' + mo148082x7f025288();
        }
        java.lang.String str2 = "";
        if (this.f411477h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append('_');
            sb6.append(mo148082x7f025288());
            sb6.append('_');
            java.lang.String m75945x2fec83073 = yq4Var.m75945x2fec8307(0);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            sb6.append(m75945x2fec83073);
            sb6.append('_');
            r45.gs5 gs5Var = (r45.gs5) yq4Var.m75936x14adae67(2);
            if (gs5Var != null && (m75945x2fec83072 = gs5Var.m75945x2fec8307(1)) != null) {
                str2 = m75945x2fec83072;
            }
            sb6.append(str2);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        sb7.append('_');
        sb7.append(mo148082x7f025288());
        sb7.append('_');
        java.lang.String m75945x2fec83074 = yq4Var.m75945x2fec8307(0);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        sb7.append(m75945x2fec83074);
        sb7.append('_');
        r45.gs5 gs5Var2 = (r45.gs5) yq4Var.m75936x14adae67(1);
        if (gs5Var2 != null && (m75945x2fec8307 = gs5Var2.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        sb7.append(str2);
        return sb7.toString();
    }
}
