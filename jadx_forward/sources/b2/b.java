package b2;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f98804a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98805b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98806c;

    public b(int i17, int i18, boolean z17) {
        this.f98804a = i17;
        this.f98805b = i18;
        this.f98806c = z17;
    }

    /* renamed from: equals */
    public boolean m9627xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2.b)) {
            return false;
        }
        b2.b bVar = (b2.b) obj;
        return this.f98804a == bVar.f98804a && this.f98805b == bVar.f98805b && this.f98806c == bVar.f98806c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m9628x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f98804a) * 31) + java.lang.Integer.hashCode(this.f98805b)) * 31;
        boolean z17 = this.f98806c;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    /* renamed from: toString */
    public java.lang.String m9629x9616526c() {
        return "BidiRun(start=" + this.f98804a + ", end=" + this.f98805b + ", isRtl=" + this.f98806c + ')';
    }
}
