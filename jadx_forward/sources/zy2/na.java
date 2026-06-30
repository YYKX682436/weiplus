package zy2;

/* loaded from: classes8.dex */
public final class na {

    /* renamed from: a, reason: collision with root package name */
    public final r45.za0 f559018a;

    /* renamed from: b, reason: collision with root package name */
    public final int f559019b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f559020c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f559021d;

    /* renamed from: e, reason: collision with root package name */
    public final int f559022e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f559023f;

    /* renamed from: g, reason: collision with root package name */
    public r45.f03 f559024g;

    /* renamed from: h, reason: collision with root package name */
    public int f559025h;

    /* renamed from: i, reason: collision with root package name */
    public int f559026i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f559027j;

    public na() {
        this(null, 0, false, null, 0, null, null, 127, null);
    }

    /* renamed from: equals */
    public boolean m180005xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.na)) {
            return false;
        }
        zy2.na naVar = (zy2.na) obj;
        return this.f559018a == naVar.f559018a && this.f559019b == naVar.f559019b && this.f559020c == naVar.f559020c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559021d, naVar.f559021d) && this.f559022e == naVar.f559022e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559023f, naVar.f559023f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559024g, naVar.f559024g);
    }

    /* renamed from: hashCode */
    public int m180006x8cdac1b() {
        int hashCode = ((((((((this.f559018a.hashCode() * 31) + java.lang.Integer.hashCode(this.f559019b)) * 31) + java.lang.Boolean.hashCode(this.f559020c)) * 31) + this.f559021d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f559022e)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f559023f;
        int hashCode2 = (hashCode + (jbVar == null ? 0 : jbVar.hashCode())) * 31;
        r45.f03 f03Var = this.f559024g;
        return hashCode2 + (f03Var != null ? f03Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m180007x9616526c() {
        return "DslRenderInfo(dslRenderState=" + this.f559018a + ", friendRemarkFlag=" + this.f559019b + ", hasInit=" + this.f559020c + ", showTitle=" + ((java.lang.Object) this.f559021d) + ", showLines=" + this.f559022e + ", renderCtrlInfo=" + this.f559023f + ", renderShowInfo=" + this.f559024g + ')';
    }

    public na(r45.za0 dslRenderState, int i17, boolean z17, java.lang.CharSequence showTitle, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dslRenderState, "dslRenderState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showTitle, "showTitle");
        this.f559018a = dslRenderState;
        this.f559019b = i17;
        this.f559020c = z17;
        this.f559021d = showTitle;
        this.f559022e = i18;
        this.f559023f = jbVar;
        this.f559024g = f03Var;
    }

    public /* synthetic */ na(r45.za0 za0Var, int i17, boolean z17, java.lang.String str, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? r45.za0.ORIGINAL_CONTENT : za0Var, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) != 0 ? false : z17, (i19 & 8) != 0 ? "" : str, (i19 & 16) == 0 ? i18 : 0, (i19 & 32) != 0 ? null : jbVar, (i19 & 64) != 0 ? null : f03Var);
    }
}
