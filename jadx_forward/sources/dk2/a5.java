package dk2;

/* loaded from: classes14.dex */
public final class a5 extends dk2.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f314708a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f314709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(java.lang.String resultCode, java.lang.String resultDesc) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultCode, "resultCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultDesc, "resultDesc");
        this.f314708a = resultCode;
        this.f314709b = resultDesc;
    }

    /* renamed from: equals */
    public boolean m124529xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.a5)) {
            return false;
        }
        dk2.a5 a5Var = (dk2.a5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314708a, a5Var.f314708a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314709b, a5Var.f314709b);
    }

    /* renamed from: hashCode */
    public int m124530x8cdac1b() {
        return (this.f314708a.hashCode() * 31) + this.f314709b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124531x9616526c() {
        return "Failed(resultCode=" + this.f314708a + ", resultDesc=" + this.f314709b + ')';
    }
}
