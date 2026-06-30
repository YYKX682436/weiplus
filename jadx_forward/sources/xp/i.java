package xp;

/* loaded from: classes10.dex */
public class i {

    /* renamed from: v, reason: collision with root package name */
    public static boolean f537375v = true;

    /* renamed from: w, reason: collision with root package name */
    public static float f537376w = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    public int f537377a;

    /* renamed from: b, reason: collision with root package name */
    public int f537378b;

    /* renamed from: c, reason: collision with root package name */
    public int f537379c;

    /* renamed from: d, reason: collision with root package name */
    public int f537380d;

    /* renamed from: e, reason: collision with root package name */
    public int f537381e;

    /* renamed from: f, reason: collision with root package name */
    public float f537382f;

    /* renamed from: g, reason: collision with root package name */
    public float f537383g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f537384h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f537385i;

    /* renamed from: j, reason: collision with root package name */
    public int f537386j;

    /* renamed from: k, reason: collision with root package name */
    public int f537387k;

    /* renamed from: l, reason: collision with root package name */
    public float f537388l;

    /* renamed from: m, reason: collision with root package name */
    public float f537389m;

    /* renamed from: n, reason: collision with root package name */
    public float f537390n;

    /* renamed from: o, reason: collision with root package name */
    public float f537391o;

    /* renamed from: q, reason: collision with root package name */
    public float f537393q;

    /* renamed from: r, reason: collision with root package name */
    public int f537394r;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f537396t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f537397u;

    /* renamed from: p, reason: collision with root package name */
    public boolean f537392p = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f537395s = false;

    public i() {
        this.f537384h = true;
        android.content.Context context = vp.c.f520269a;
        if (context == null) {
            throw new java.lang.RuntimeException("Danmaku not init, please call DanmakuConfig.init()");
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        if (this.f537392p) {
            this.f537387k = java.lang.Math.max(i17, i18);
            this.f537386j = java.lang.Math.min(i17, i18);
        } else {
            this.f537387k = java.lang.Math.min(i17, i18);
            this.f537386j = java.lang.Math.max(i17, i18);
        }
        this.f537377a = 8000;
        this.f537378b = a(12);
        this.f537379c = 3;
        this.f537394r = 3;
        this.f537380d = a(1.5f);
        this.f537381e = a(1);
        this.f537382f = a(5.0f);
        this.f537383g = a(5.0f);
        this.f537384h = true;
        this.f537385i = true;
        this.f537388l = a(16.0f);
        this.f537389m = 0.0f;
        this.f537390n = a(5.0f);
        this.f537391o = a(4.0f);
        this.f537393q = 1.0f;
    }

    public static int a(float f17) {
        if (f537376w < 0.0f) {
            f537376w = xp.d.b().getResources().getDisplayMetrics().density;
        }
        return (int) ((f17 * f537376w) + 0.5f);
    }

    public void b(boolean z17) {
        if (this.f537392p != z17) {
            int i17 = this.f537386j;
            this.f537386j = this.f537387k;
            this.f537387k = i17;
        }
        this.f537392p = z17;
    }
}
