package wd0;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f526311a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f526312b;

    /* renamed from: c, reason: collision with root package name */
    public final int f526313c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f526314d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f526315e;

    /* renamed from: f, reason: collision with root package name */
    public final wd0.w1 f526316f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f526317g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f526318h;

    public x1(java.lang.String name, java.lang.String str, int i17, java.lang.String itemKey, java.lang.String parentItemKey, wd0.w1 matchType, java.lang.String path, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemKey, "itemKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentItemKey, "parentItemKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matchType, "matchType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f526311a = name;
        this.f526312b = str;
        this.f526313c = i17;
        this.f526314d = itemKey;
        this.f526315e = parentItemKey;
        this.f526316f = matchType;
        this.f526317g = path;
        this.f526318h = z17;
    }

    /* renamed from: equals */
    public boolean m173533xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0.x1)) {
            return false;
        }
        wd0.x1 x1Var = (wd0.x1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526311a, x1Var.f526311a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526312b, x1Var.f526312b) && this.f526313c == x1Var.f526313c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526314d, x1Var.f526314d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526315e, x1Var.f526315e) && this.f526316f == x1Var.f526316f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526317g, x1Var.f526317g) && this.f526318h == x1Var.f526318h;
    }

    /* renamed from: hashCode */
    public int m173534x8cdac1b() {
        int hashCode = this.f526311a.hashCode() * 31;
        java.lang.String str = this.f526312b;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f526313c)) * 31) + this.f526314d.hashCode()) * 31) + this.f526315e.hashCode()) * 31) + this.f526316f.hashCode()) * 31) + this.f526317g.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f526318h);
    }

    /* renamed from: toString */
    public java.lang.String m173535x9616526c() {
        return "SettingResult(name=" + this.f526311a + ", summary=" + this.f526312b + ", type=" + this.f526313c + ", itemKey=" + this.f526314d + ", parentItemKey=" + this.f526315e + ", matchType=" + this.f526316f + ", path=" + this.f526317g + ", visible=" + this.f526318h + ')';
    }
}
