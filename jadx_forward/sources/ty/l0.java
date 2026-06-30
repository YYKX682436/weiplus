package ty;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f504260a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f504261b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f504262c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f504263d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f504264e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f504265f;

    public l0(boolean z17, java.lang.String upBtnText, java.lang.String downBtnText, java.lang.String defaultAppName, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upBtnText, "upBtnText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downBtnText, "downBtnText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultAppName, "defaultAppName");
        this.f504260a = z17;
        this.f504261b = upBtnText;
        this.f504262c = downBtnText;
        this.f504263d = defaultAppName;
        this.f504264e = z18;
        this.f504265f = z19;
    }

    public final int a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.brt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = this.f504263d;
        objArr[0] = str.length() == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lc9) : str;
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lc9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ho6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ho7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        boolean z17 = this.f504260a;
        if (z17 || z17) {
            return 1;
        }
        java.lang.String str2 = this.f504261b;
        boolean z18 = this.f504265f;
        boolean z19 = this.f504264e;
        if (z19 && z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, format)) {
            if (str.length() == 0) {
                return 2;
            }
        }
        java.lang.String str3 = this.f504262c;
        if (!z19 && z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, string3)) {
            return 3;
        }
        if (z19 && z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, format) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, string2)) {
            return 4;
        }
        if (z19 && z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, format) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, string2)) {
            return 5;
        }
        return (!z19 && z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, string4)) ? 6 : 0;
    }

    /* renamed from: equals */
    public boolean m167161xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty.l0)) {
            return false;
        }
        ty.l0 l0Var = (ty.l0) obj;
        return this.f504260a == l0Var.f504260a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504261b, l0Var.f504261b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504262c, l0Var.f504262c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504263d, l0Var.f504263d) && this.f504264e == l0Var.f504264e && this.f504265f == l0Var.f504265f;
    }

    /* renamed from: hashCode */
    public int m167162x8cdac1b() {
        return (((((((((java.lang.Boolean.hashCode(this.f504260a) * 31) + this.f504261b.hashCode()) * 31) + this.f504262c.hashCode()) * 31) + this.f504263d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f504264e)) * 31) + java.lang.Boolean.hashCode(this.f504265f);
    }

    /* renamed from: toString */
    public java.lang.String m167163x9616526c() {
        return "PageType(isMiniQbPage=" + this.f504260a + ", upBtnText=" + this.f504261b + ", downBtnText=" + this.f504262c + ", defaultAppName=" + this.f504263d + ", upBtnVisitable=" + this.f504264e + ", downBtnVisitable=" + this.f504265f + ')';
    }
}
