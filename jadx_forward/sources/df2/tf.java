package df2;

/* loaded from: classes3.dex */
public final class tf {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f312969a;

    /* renamed from: b, reason: collision with root package name */
    public int f312970b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f312971c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f312972d;

    public tf(java.lang.String id6, int i17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f312969a = id6;
        this.f312970b = i17;
        this.f312971c = z17;
        this.f312972d = z18;
    }

    public final void a(java.lang.String id6, dk2.cg cgVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f312969a = id6;
        this.f312970b = cgVar != null ? cgVar.s() : 0;
        this.f312971c = cgVar != null ? cgVar.o() : false;
        this.f312972d = cgVar != null ? cgVar.g() : false;
    }

    /* renamed from: equals */
    public boolean m124260xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.tf)) {
            return false;
        }
        df2.tf tfVar = (df2.tf) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f312969a, tfVar.f312969a) && this.f312970b == tfVar.f312970b && this.f312971c == tfVar.f312971c && this.f312972d == tfVar.f312972d;
    }

    /* renamed from: hashCode */
    public int m124261x8cdac1b() {
        return (((((this.f312969a.hashCode() * 31) + java.lang.Integer.hashCode(this.f312970b)) * 31) + java.lang.Boolean.hashCode(this.f312971c)) * 31) + java.lang.Boolean.hashCode(this.f312972d);
    }

    /* renamed from: toString */
    public java.lang.String m124262x9616526c() {
        return "SubLikeMsg(id=" + this.f312969a + ", likeCount=" + this.f312970b + ", selfLike=" + this.f312971c + ", selfOp=" + this.f312972d + ')';
    }
}
