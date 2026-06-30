package w8;

/* loaded from: classes15.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f525174a;

    /* renamed from: b, reason: collision with root package name */
    public final int f525175b;

    /* renamed from: c, reason: collision with root package name */
    public final int f525176c;

    /* renamed from: d, reason: collision with root package name */
    public int f525177d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f525178e;

    public g0(int i17, int i18) {
        this(Integer.MIN_VALUE, i17, i18);
    }

    public void a() {
        int i17 = this.f525177d;
        this.f525177d = i17 == Integer.MIN_VALUE ? this.f525175b : i17 + this.f525176c;
        this.f525178e = this.f525174a + this.f525177d;
    }

    public final void b() {
        if (this.f525177d == Integer.MIN_VALUE) {
            throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public g0(int i17, int i18, int i19) {
        java.lang.String str;
        if (i17 != Integer.MIN_VALUE) {
            str = i17 + "/";
        } else {
            str = "";
        }
        this.f525174a = str;
        this.f525175b = i18;
        this.f525176c = i19;
        this.f525177d = Integer.MIN_VALUE;
    }
}
