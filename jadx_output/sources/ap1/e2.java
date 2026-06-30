package ap1;

/* loaded from: classes5.dex */
public final class e2 implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f12648a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f12649b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f12650c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f12651d;

    public e2(java.lang.CharSequence title, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, yz5.a aVar) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f12648a = title;
        this.f12649b = charSequence;
        this.f12650c = charSequence2;
        this.f12651d = aVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.e2)) {
            return false;
        }
        ap1.e2 e2Var = (ap1.e2) obj;
        return kotlin.jvm.internal.o.b(this.f12648a, e2Var.f12648a) && kotlin.jvm.internal.o.b(this.f12649b, e2Var.f12649b) && kotlin.jvm.internal.o.b(this.f12650c, e2Var.f12650c) && kotlin.jvm.internal.o.b(this.f12651d, e2Var.f12651d);
    }

    public int hashCode() {
        int hashCode = this.f12648a.hashCode() * 31;
        java.lang.CharSequence charSequence = this.f12649b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.f12650c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        yz5.a aVar = this.f12651d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ShowCommonErrorAction(title=" + ((java.lang.Object) this.f12648a) + ", hint=" + ((java.lang.Object) this.f12649b) + ", btnText=" + ((java.lang.Object) this.f12650c) + ", btnCallBack=" + this.f12651d + ')';
    }

    public /* synthetic */ e2(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this(charSequence, (i17 & 2) != 0 ? null : charSequence2, (i17 & 4) != 0 ? null : charSequence3, (i17 & 8) != 0 ? null : aVar);
    }
}
