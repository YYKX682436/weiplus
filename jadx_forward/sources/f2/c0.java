package f2;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2.h f340325a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.r f340326b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340327c;

    /* renamed from: d, reason: collision with root package name */
    public final int f340328d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f340329e;

    public c0(f2.h hVar, f2.r rVar, int i17, int i18, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f340325a = hVar;
        this.f340326b = rVar;
        this.f340327c = i17;
        this.f340328d = i18;
        this.f340329e = obj;
    }

    /* renamed from: equals */
    public boolean m128741xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2.c0)) {
            return false;
        }
        f2.c0 c0Var = (f2.c0) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340325a, c0Var.f340325a) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340326b, c0Var.f340326b)) {
            return false;
        }
        if (this.f340327c == c0Var.f340327c) {
            return (this.f340328d == c0Var.f340328d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340329e, c0Var.f340329e);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m128742x8cdac1b() {
        f2.h hVar = this.f340325a;
        int hashCode = (((((((hVar == null ? 0 : hVar.hashCode()) * 31) + this.f340326b.f340358d) * 31) + java.lang.Integer.hashCode(this.f340327c)) * 31) + java.lang.Integer.hashCode(this.f340328d)) * 31;
        java.lang.Object obj = this.f340329e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m128743x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TypefaceRequest(fontFamily=");
        sb6.append(this.f340325a);
        sb6.append(", fontWeight=");
        sb6.append(this.f340326b);
        sb6.append(", fontStyle=");
        int i17 = this.f340327c;
        if (i17 == 0) {
            str = "Normal";
        } else {
            str = i17 == 1 ? "Italic" : "Invalid";
        }
        sb6.append((java.lang.Object) str);
        sb6.append(", fontSynthesis=");
        sb6.append((java.lang.Object) f2.q.a(this.f340328d));
        sb6.append(", resourceLoaderCacheKey=");
        sb6.append(this.f340329e);
        sb6.append(')');
        return sb6.toString();
    }
}
