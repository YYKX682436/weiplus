package a24;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f881a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f882b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f883c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f884d;

    public h(boolean z17, java.lang.Integer num, java.lang.String str, boolean z18) {
        this.f881a = z17;
        this.f882b = num;
        this.f883c = str;
        this.f884d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24.h)) {
            return false;
        }
        a24.h hVar = (a24.h) obj;
        return this.f881a == hVar.f881a && kotlin.jvm.internal.o.b(this.f882b, hVar.f882b) && kotlin.jvm.internal.o.b(this.f883c, hVar.f883c) && this.f884d == hVar.f884d;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f881a) * 31;
        java.lang.Integer num = this.f882b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f883c;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f884d);
    }

    public java.lang.String toString() {
        return "ContentSnapshot(visible=" + this.f881a + ", header=" + this.f882b + ", summary=" + this.f883c + ", checked=" + this.f884d + ')';
    }
}
