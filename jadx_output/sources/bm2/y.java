package bm2;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public int f22438a;

    /* renamed from: b, reason: collision with root package name */
    public int f22439b;

    public y(int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? -1 : i17;
        i18 = (i19 & 2) != 0 ? -1 : i18;
        this.f22438a = i17;
        this.f22439b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.y)) {
            return false;
        }
        bm2.y yVar = (bm2.y) obj;
        return this.f22438a == yVar.f22438a && this.f22439b == yVar.f22439b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f22438a) * 31) + java.lang.Integer.hashCode(this.f22439b);
    }

    public java.lang.String toString() {
        return "SpanIndex(start=" + this.f22438a + ", end=" + this.f22439b + ')';
    }
}
