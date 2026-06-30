package cf5;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f40973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40974b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40975c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40976d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40977e;

    public g(int i17, int i18, int i19, int i27, int i28) {
        this.f40973a = i17;
        this.f40974b = i18;
        this.f40975c = i19;
        this.f40976d = i27;
        this.f40977e = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5.g)) {
            return false;
        }
        cf5.g gVar = (cf5.g) obj;
        return this.f40973a == gVar.f40973a && this.f40974b == gVar.f40974b && this.f40975c == gVar.f40975c && this.f40976d == gVar.f40976d && this.f40977e == gVar.f40977e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f40973a) * 31) + java.lang.Integer.hashCode(this.f40974b)) * 31) + java.lang.Integer.hashCode(this.f40975c)) * 31) + java.lang.Integer.hashCode(this.f40976d)) * 31) + java.lang.Integer.hashCode(this.f40977e);
    }

    public java.lang.String toString() {
        return "SelectionContentTypes(plainTextCount=" + this.f40973a + ", codeBlockCount=" + this.f40974b + ", tableCount=" + this.f40975c + ", hrCount=" + this.f40976d + ", formulaCount=" + this.f40977e + ')';
    }
}
