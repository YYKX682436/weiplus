package f5;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f341101a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f341102b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f341103c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f341104d;

    public b(boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f341101a = z17;
        this.f341102b = z18;
        this.f341103c = z19;
        this.f341104d = z27;
    }

    /* renamed from: equals */
    public boolean m129037xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5.b)) {
            return false;
        }
        f5.b bVar = (f5.b) obj;
        return this.f341101a == bVar.f341101a && this.f341102b == bVar.f341102b && this.f341103c == bVar.f341103c && this.f341104d == bVar.f341104d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    /* renamed from: hashCode */
    public int m129038x8cdac1b() {
        boolean z17 = this.f341102b;
        ?? r17 = this.f341101a;
        int i17 = r17;
        if (z17) {
            i17 = r17 + 16;
        }
        int i18 = i17;
        if (this.f341103c) {
            i18 = i17 + 256;
        }
        return this.f341104d ? i18 + 4096 : i18;
    }

    /* renamed from: toString */
    public java.lang.String m129039x9616526c() {
        return java.lang.String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", java.lang.Boolean.valueOf(this.f341101a), java.lang.Boolean.valueOf(this.f341102b), java.lang.Boolean.valueOf(this.f341103c), java.lang.Boolean.valueOf(this.f341104d));
    }
}
