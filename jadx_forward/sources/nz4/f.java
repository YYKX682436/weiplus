package nz4;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f423135a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f423136b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f423137c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f423138d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f423139e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f423140f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f423141g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f423142h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f423143i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f423144j = -1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f423145k = -1;

    public int a() {
        boolean z17 = false;
        if (!(this.f423136b >= 0.0f && this.f423137c >= 0.0f && this.f423138d >= 0.0f && this.f423139e >= 0.0f && this.f423140f >= 0)) {
            return 0;
        }
        if (this.f423141g >= 0.0f && this.f423142h >= 0.0f && this.f423143i >= 0.0f && this.f423144j >= 0.0f && this.f423145k >= 0) {
            z17 = true;
        }
        if (z17) {
            return (java.lang.Math.abs((int) (this.f423138d - this.f423143i)) > 30 || java.lang.Math.abs((int) (this.f423139e - this.f423144j)) > 30 || this.f423140f != this.f423145k) ? 3 : 2;
        }
        return 1;
    }
}
