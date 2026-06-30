package az0;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f15338a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f15339b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f15340c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f15341d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f15342e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f15343f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f15344g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f15345h;

    public b0(java.lang.String outputVideoPath, java.lang.String coverImagePath, java.lang.String templateId, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, int i17, kotlin.jvm.internal.i iVar) {
        coverImagePath = (i17 & 2) != 0 ? "" : coverImagePath;
        str = (i17 & 8) != 0 ? null : str;
        str2 = (i17 & 16) != 0 ? null : str2;
        bool = (i17 & 32) != 0 ? java.lang.Boolean.FALSE : bool;
        str3 = (i17 & 64) != 0 ? null : str3;
        str4 = (i17 & 128) != 0 ? null : str4;
        kotlin.jvm.internal.o.g(outputVideoPath, "outputVideoPath");
        kotlin.jvm.internal.o.g(coverImagePath, "coverImagePath");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        this.f15338a = outputVideoPath;
        this.f15339b = coverImagePath;
        this.f15340c = templateId;
        this.f15341d = str;
        this.f15342e = str2;
        this.f15343f = bool;
        this.f15344g = str3;
        this.f15345h = str4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az0.b0)) {
            return false;
        }
        az0.b0 b0Var = (az0.b0) obj;
        return kotlin.jvm.internal.o.b(this.f15338a, b0Var.f15338a) && kotlin.jvm.internal.o.b(this.f15339b, b0Var.f15339b) && kotlin.jvm.internal.o.b(this.f15340c, b0Var.f15340c) && kotlin.jvm.internal.o.b(this.f15341d, b0Var.f15341d) && kotlin.jvm.internal.o.b(this.f15342e, b0Var.f15342e) && kotlin.jvm.internal.o.b(this.f15343f, b0Var.f15343f) && kotlin.jvm.internal.o.b(this.f15344g, b0Var.f15344g) && kotlin.jvm.internal.o.b(this.f15345h, b0Var.f15345h);
    }

    public int hashCode() {
        int hashCode = ((((this.f15338a.hashCode() * 31) + this.f15339b.hashCode()) * 31) + this.f15340c.hashCode()) * 31;
        java.lang.String str = this.f15341d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f15342e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Boolean bool = this.f15343f;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str3 = this.f15344g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f15345h;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MaasExportInfoHolder(outputVideoPath=" + this.f15338a + ", coverImagePath=" + this.f15339b + ", templateId=" + this.f15340c + ", musicId=" + this.f15341d + ", listenId=" + this.f15342e + ", musicIsMajorOwned=" + this.f15343f + ", aiTaskId=" + this.f15344g + ", aiModelType=" + this.f15345h + ')';
    }
}
