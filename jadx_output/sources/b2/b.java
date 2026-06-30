package b2;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f17271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17272b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17273c;

    public b(int i17, int i18, boolean z17) {
        this.f17271a = i17;
        this.f17272b = i18;
        this.f17273c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2.b)) {
            return false;
        }
        b2.b bVar = (b2.b) obj;
        return this.f17271a == bVar.f17271a && this.f17272b == bVar.f17272b && this.f17273c == bVar.f17273c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f17271a) * 31) + java.lang.Integer.hashCode(this.f17272b)) * 31;
        boolean z17 = this.f17273c;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    public java.lang.String toString() {
        return "BidiRun(start=" + this.f17271a + ", end=" + this.f17272b + ", isRtl=" + this.f17273c + ')';
    }
}
