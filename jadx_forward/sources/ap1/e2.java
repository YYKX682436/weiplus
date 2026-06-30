package ap1;

/* loaded from: classes5.dex */
public final class e2 implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f94181a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f94182b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f94183c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f94184d;

    public e2(java.lang.CharSequence title, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f94181a = title;
        this.f94182b = charSequence;
        this.f94183c = charSequence2;
        this.f94184d = aVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
    }

    /* renamed from: equals */
    public boolean m8762xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.e2)) {
            return false;
        }
        ap1.e2 e2Var = (ap1.e2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94181a, e2Var.f94181a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94182b, e2Var.f94182b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94183c, e2Var.f94183c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94184d, e2Var.f94184d);
    }

    /* renamed from: hashCode */
    public int m8763x8cdac1b() {
        int hashCode = this.f94181a.hashCode() * 31;
        java.lang.CharSequence charSequence = this.f94182b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.f94183c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        yz5.a aVar = this.f94184d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m8764x9616526c() {
        return "ShowCommonErrorAction(title=" + ((java.lang.Object) this.f94181a) + ", hint=" + ((java.lang.Object) this.f94182b) + ", btnText=" + ((java.lang.Object) this.f94183c) + ", btnCallBack=" + this.f94184d + ')';
    }

    public /* synthetic */ e2(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(charSequence, (i17 & 2) != 0 ? null : charSequence2, (i17 & 4) != 0 ? null : charSequence3, (i17 & 8) != 0 ? null : aVar);
    }
}
