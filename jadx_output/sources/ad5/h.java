package ad5;

/* loaded from: classes10.dex */
public final class h extends ad5.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3260a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f3261b;

    public h(int i17, java.lang.String str) {
        super(null);
        this.f3260a = i17;
        this.f3261b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.h)) {
            return false;
        }
        ad5.h hVar = (ad5.h) obj;
        return this.f3260a == hVar.f3260a && kotlin.jvm.internal.o.b(this.f3261b, hVar.f3261b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f3260a) * 31;
        java.lang.String str = this.f3261b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "Failed(errorCode=" + this.f3260a + ", errorMessage=" + this.f3261b + ')';
    }

    public /* synthetic */ h(int i17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? null : str);
    }
}
