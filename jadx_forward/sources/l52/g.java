package l52;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public r45.p86 f398140a;

    /* renamed from: b, reason: collision with root package name */
    public int f398141b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f398142c;

    /* renamed from: d, reason: collision with root package name */
    public int f398143d;

    /* renamed from: e, reason: collision with root package name */
    public int f398144e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f398145f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f398146g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f398147h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f398148i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f398149j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f398150k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f398151l = "";

    public boolean a(int i17) {
        r45.p86 p86Var = this.f398140a;
        int i18 = p86Var.f464376i + p86Var.f464377m;
        if (i17 != 0 && p86Var.f464372e == 0 && this.f398141b == 0) {
            i18 = 0;
        }
        int i19 = p86Var.f464374g - p86Var.f464375h;
        java.lang.Math.max(p86Var.f464372e, i18);
        r45.p86 p86Var2 = this.f398140a;
        int i27 = p86Var2.f464372e + p86Var2.f464373f;
        java.lang.Math.min(i27, i19);
        return this.f398140a.f464372e < i19 && i27 > i18;
    }

    /* renamed from: toString */
    public java.lang.String m145163x9616526c() {
        java.lang.String str;
        r45.p86 p86Var = this.f398140a;
        return (p86Var == null || (str = p86Var.f464371d) == null) ? "NULL" : str;
    }
}
