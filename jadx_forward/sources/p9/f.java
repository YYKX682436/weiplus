package p9;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f434359a;

    /* renamed from: b, reason: collision with root package name */
    public long f434360b;

    /* renamed from: c, reason: collision with root package name */
    public android.text.SpannableStringBuilder f434361c;

    /* renamed from: d, reason: collision with root package name */
    public android.text.Layout.Alignment f434362d;

    /* renamed from: e, reason: collision with root package name */
    public float f434363e;

    /* renamed from: f, reason: collision with root package name */
    public int f434364f;

    /* renamed from: g, reason: collision with root package name */
    public int f434365g;

    /* renamed from: h, reason: collision with root package name */
    public float f434366h;

    /* renamed from: i, reason: collision with root package name */
    public int f434367i;

    /* renamed from: j, reason: collision with root package name */
    public float f434368j;

    public f() {
        b();
    }

    public p9.g a() {
        if (this.f434366h != Float.MIN_VALUE && this.f434367i == Integer.MIN_VALUE) {
            android.text.Layout.Alignment alignment = this.f434362d;
            if (alignment == null) {
                this.f434367i = Integer.MIN_VALUE;
            } else {
                int i17 = p9.e.f434358a[alignment.ordinal()];
                if (i17 == 1) {
                    this.f434367i = 0;
                } else if (i17 == 2) {
                    this.f434367i = 1;
                } else if (i17 != 3) {
                    java.util.Objects.toString(this.f434362d);
                    this.f434367i = 0;
                } else {
                    this.f434367i = 2;
                }
            }
        }
        return new p9.g(this.f434359a, this.f434360b, this.f434361c, this.f434362d, this.f434363e, this.f434364f, this.f434365g, this.f434366h, this.f434367i, this.f434368j);
    }

    public void b() {
        this.f434359a = 0L;
        this.f434360b = 0L;
        this.f434361c = null;
        this.f434362d = null;
        this.f434363e = Float.MIN_VALUE;
        this.f434364f = Integer.MIN_VALUE;
        this.f434365g = Integer.MIN_VALUE;
        this.f434366h = Float.MIN_VALUE;
        this.f434367i = Integer.MIN_VALUE;
        this.f434368j = Float.MIN_VALUE;
    }
}
