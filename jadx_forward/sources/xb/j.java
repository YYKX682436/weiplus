package xb;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public int f534413b;

    /* renamed from: c, reason: collision with root package name */
    public float f534414c;

    /* renamed from: d, reason: collision with root package name */
    public float f534415d;

    /* renamed from: e, reason: collision with root package name */
    public float f534416e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f534417f;

    /* renamed from: h, reason: collision with root package name */
    public float f534419h;

    /* renamed from: i, reason: collision with root package name */
    public int f534420i;

    /* renamed from: g, reason: collision with root package name */
    public int f534418g = -16777216;

    /* renamed from: a, reason: collision with root package name */
    public int f534412a = 8388611;

    public j(com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef c2885xf34260ef, android.content.res.Resources resources) {
        this.f534419h = android.util.TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
    }

    public void a(android.content.res.TypedArray typedArray) {
        this.f534412a = typedArray.getInt(4, this.f534412a);
        this.f534413b = typedArray.getColor(6, this.f534413b);
        this.f534414c = typedArray.getFloat(7, this.f534414c);
        this.f534415d = typedArray.getFloat(8, this.f534415d);
        this.f534416e = typedArray.getFloat(9, this.f534416e);
        this.f534417f = typedArray.getString(5);
        this.f534418g = typedArray.getColor(3, this.f534418g);
        this.f534419h = typedArray.getDimension(1, this.f534419h);
        this.f534420i = typedArray.getInt(2, this.f534420i);
    }
}
