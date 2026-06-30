package ff1;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f343139a;

    /* renamed from: b, reason: collision with root package name */
    public oe1.m1 f343140b = oe1.m1.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    public int f343141c;

    /* renamed from: d, reason: collision with root package name */
    public int f343142d;

    /* renamed from: e, reason: collision with root package name */
    public int f343143e;

    /* renamed from: f, reason: collision with root package name */
    public int f343144f;

    /* renamed from: g, reason: collision with root package name */
    public int f343145g;

    /* renamed from: h, reason: collision with root package name */
    public int f343146h;

    public final void a(float f17, float f18) {
        if (!this.f343139a) {
            int i17 = this.f343141c;
            int i18 = this.f343142d;
            if (i17 < i18) {
                this.f343146h = (int) (i17 / f17);
                this.f343145g = i17;
                return;
            } else {
                this.f343145g = (int) (i18 * f17);
                this.f343146h = i18;
                return;
            }
        }
        if (java.lang.Math.abs(f17 - f18) > 0.05d) {
            int i19 = this.f343141c;
            int i27 = this.f343142d;
            if (i19 < i27) {
                this.f343146h = (int) (i19 / f17);
                this.f343145g = i19;
                return;
            } else {
                this.f343145g = (int) (i27 * f17);
                this.f343146h = i27;
                return;
            }
        }
        int i28 = this.f343141c;
        int i29 = this.f343142d;
        if (i28 > i29) {
            this.f343146h = (int) (i28 / f17);
            this.f343145g = i28;
        } else {
            this.f343145g = (int) (i29 * f17);
            this.f343146h = i29;
        }
    }
}
