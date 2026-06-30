package as3;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f13489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13490b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f13491c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f13492d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13493e;

    public b(java.lang.Integer num, int i17, java.lang.String str, java.lang.Integer num2, int i18, int i19, kotlin.jvm.internal.i iVar) {
        num2 = (i19 & 8) != 0 ? -1 : num2;
        i18 = (i19 & 16) != 0 ? 1 : i18;
        this.f13489a = num;
        this.f13490b = i17;
        this.f13491c = str;
        this.f13492d = num2;
        this.f13493e = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as3.b)) {
            return false;
        }
        as3.b bVar = (as3.b) obj;
        return kotlin.jvm.internal.o.b(this.f13489a, bVar.f13489a) && this.f13490b == bVar.f13490b && kotlin.jvm.internal.o.b(this.f13491c, bVar.f13491c) && kotlin.jvm.internal.o.b(this.f13492d, bVar.f13492d) && this.f13493e == bVar.f13493e;
    }

    public int hashCode() {
        java.lang.Integer num = this.f13489a;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + java.lang.Integer.hashCode(this.f13490b)) * 31;
        java.lang.String str = this.f13491c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num2 = this.f13492d;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f13493e);
    }

    public java.lang.String toString() {
        return "ReportInfo(bizUin=" + this.f13489a + ", scene=" + this.f13490b + ", sessionId=" + this.f13491c + ", eventType=" + this.f13492d + ", subScene=" + this.f13493e + ')';
    }
}
