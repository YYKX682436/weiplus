package d11;

/* loaded from: classes10.dex */
public class w implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f307234d;

    /* renamed from: e, reason: collision with root package name */
    public final int f307235e;

    /* renamed from: f, reason: collision with root package name */
    public final int f307236f;

    /* renamed from: g, reason: collision with root package name */
    public final int f307237g;

    /* renamed from: h, reason: collision with root package name */
    public final int f307238h;

    /* renamed from: i, reason: collision with root package name */
    public int f307239i;

    /* renamed from: m, reason: collision with root package name */
    public final int f307240m;

    public w(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f307234d = i17;
        this.f307235e = i18;
        this.f307236f = i19;
        this.f307237g = i27;
        this.f307238h = i28;
        this.f307239i = i29;
        this.f307240m = i37;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj != null && (obj instanceof d11.w)) {
            return this.f307234d - ((d11.w) obj).f307234d;
        }
        return 0;
    }
}
