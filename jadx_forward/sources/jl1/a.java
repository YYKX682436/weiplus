package jl1;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f381727a;

    /* renamed from: b, reason: collision with root package name */
    public final int f381728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f381729c;

    /* renamed from: d, reason: collision with root package name */
    public final int f381730d;

    /* renamed from: e, reason: collision with root package name */
    public final int f381731e;

    /* renamed from: f, reason: collision with root package name */
    public final int f381732f;

    /* renamed from: g, reason: collision with root package name */
    public final int f381733g;

    /* renamed from: h, reason: collision with root package name */
    public final int f381734h;

    public a(int i17, int i18) {
        this.f381727a = android.graphics.Color.red(i17);
        this.f381728b = android.graphics.Color.green(i17);
        this.f381729c = android.graphics.Color.blue(i17);
        this.f381730d = android.graphics.Color.alpha(i17);
        this.f381731e = android.graphics.Color.red(i18);
        this.f381732f = android.graphics.Color.green(i18);
        this.f381733g = android.graphics.Color.blue(i18);
        this.f381734h = android.graphics.Color.alpha(i18);
    }

    public int a(float f17) {
        return android.graphics.Color.argb((int) (this.f381730d + ((this.f381734h - r3) * f17) + 0.5d), (int) (this.f381727a + ((this.f381731e - r0) * f17) + 0.5d), (int) (this.f381728b + ((this.f381732f - r1) * f17) + 0.5d), (int) (this.f381729c + ((this.f381733g - r2) * f17) + 0.5d));
    }
}
