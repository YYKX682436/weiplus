package co1;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f43748a;

    /* renamed from: b, reason: collision with root package name */
    public int f43749b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f43750c;

    /* renamed from: d, reason: collision with root package name */
    public int f43751d;

    public b(java.lang.String str, int i17, java.lang.String str2, int i18, int i19, kotlin.jvm.internal.i iVar) {
        str = (i19 & 1) != 0 ? null : str;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        str2 = (i19 & 4) != 0 ? null : str2;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        this.f43748a = str;
        this.f43749b = i17;
        this.f43750c = str2;
        this.f43751d = i18;
    }

    public final java.lang.String a() {
        return this.f43750c;
    }

    public final int b() {
        return this.f43751d;
    }

    public final int c() {
        return this.f43749b;
    }

    public final java.lang.String d() {
        return this.f43748a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1.b)) {
            return false;
        }
        co1.b bVar = (co1.b) obj;
        return kotlin.jvm.internal.o.b(this.f43748a, bVar.f43748a) && this.f43749b == bVar.f43749b && kotlin.jvm.internal.o.b(this.f43750c, bVar.f43750c) && this.f43751d == bVar.f43751d;
    }

    public int hashCode() {
        java.lang.String str = this.f43748a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f43749b)) * 31;
        java.lang.String str2 = this.f43750c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f43751d);
    }

    public java.lang.String toString() {
        return "RecoverExtraImageInfo(imgName=" + this.f43748a + ", imgLen=" + this.f43749b + ", hdImgName=" + this.f43750c + ", hdLen=" + this.f43751d + ')';
    }
}
