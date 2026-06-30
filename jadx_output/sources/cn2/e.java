package cn2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f43496a;

    public e(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f43496a = (i18 & 1) != 0 ? -1 : i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn2.e) && this.f43496a == ((cn2.e) obj).f43496a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f43496a);
    }

    public java.lang.String toString() {
        return "Extra(level=" + this.f43496a + ')';
    }
}
