package ki;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f389617a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f389618b;

    public b(boolean z17, java.util.ArrayList delayMillis) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delayMillis, "delayMillis");
        this.f389617a = z17;
        this.f389618b = delayMillis;
    }

    /* renamed from: equals */
    public boolean m143478xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki.b)) {
            return false;
        }
        ki.b bVar = (ki.b) obj;
        return this.f389617a == bVar.f389617a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389618b, bVar.f389618b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* renamed from: hashCode */
    public int m143479x8cdac1b() {
        boolean z17 = this.f389617a;
        ?? r07 = z17;
        if (z17) {
            r07 = 1;
        }
        int i17 = r07 * 31;
        java.util.ArrayList arrayList = this.f389618b;
        return i17 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m143480x9616526c() {
        return "TrimMemoryConfig(enable=" + this.f389617a + ", delayMillis=" + this.f389618b + ")";
    }
}
