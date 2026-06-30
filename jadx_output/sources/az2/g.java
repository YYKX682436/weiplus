package az2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f16129a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f16130b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.xw f16131c;

    public g(java.lang.Integer num, java.lang.Integer num2, r45.xw xwVar) {
        this.f16129a = num;
        this.f16130b = num2;
        this.f16131c = xwVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az2.g)) {
            return false;
        }
        az2.g gVar = (az2.g) obj;
        return kotlin.jvm.internal.o.b(this.f16129a, gVar.f16129a) && kotlin.jvm.internal.o.b(this.f16130b, gVar.f16130b) && kotlin.jvm.internal.o.b(this.f16131c, gVar.f16131c);
    }

    public int hashCode() {
        java.lang.Integer num = this.f16129a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f16130b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        r45.xw xwVar = this.f16131c;
        return hashCode2 + (xwVar != null ? xwVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CgiProfileData(reqSize=" + this.f16129a + ", respSize=" + this.f16130b + ", profile=" + this.f16131c + ')';
    }
}
