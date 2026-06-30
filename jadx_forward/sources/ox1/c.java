package ox1;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f431114a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f431115b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f431116c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f431117d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f431118e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f431119f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f431120g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f431121h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f431122i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f431123j = -1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f431124k = -1;

    public int a() {
        boolean z17 = false;
        if (!(this.f431115b >= 0.0f && this.f431116c >= 0.0f && this.f431117d >= 0.0f && this.f431118e >= 0.0f && this.f431119f >= 0)) {
            return 0;
        }
        if (this.f431120g >= 0.0f && this.f431121h >= 0.0f && this.f431122i >= 0.0f && this.f431123j >= 0.0f && this.f431124k >= 0) {
            z17 = true;
        }
        if (z17) {
            return (java.lang.Math.abs((int) (this.f431117d - this.f431122i)) > 30 || java.lang.Math.abs((int) (this.f431118e - this.f431123j)) > 30 || this.f431119f != this.f431124k) ? 3 : 2;
        }
        return 1;
    }
}
