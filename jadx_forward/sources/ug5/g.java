package ug5;

/* loaded from: classes3.dex */
public final class g {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public final ug5.b f509120a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.Window f509121b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.Window f509122c;

    /* renamed from: d, reason: collision with root package name */
    public ug5.i f509123d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f509124e;

    /* renamed from: f, reason: collision with root package name */
    public ug5.h f509125f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f509126g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f509127h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f509128i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f509129j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Rect f509130k;

    /* renamed from: l, reason: collision with root package name */
    public final float f509131l;

    /* renamed from: m, reason: collision with root package name */
    public final float f509132m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f509133n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f509134o;

    /* renamed from: p, reason: collision with root package name */
    public long f509135p;

    /* renamed from: q, reason: collision with root package name */
    public long f509136q;

    /* renamed from: r, reason: collision with root package name */
    public long f509137r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.TimeInterpolator f509138s;

    /* renamed from: t, reason: collision with root package name */
    public int f509139t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Class f509140u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f509141v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f509142w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f509143x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f509144y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f509145z;

    public g(ug5.b action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f509120a = action;
        this.f509128i = new java.util.HashMap();
        this.f509129j = new android.graphics.Rect();
        this.f509130k = new android.graphics.Rect();
        this.f509131l = 1.0f;
        this.f509132m = 1.0f;
        int i17 = s26.a.f483901f;
        s26.d dVar = s26.d.f483904f;
        this.f509135p = s26.a.g(s26.c.e(200, dVar), dVar);
        this.f509138s = new android.view.animation.DecelerateInterpolator(2.0f);
        this.f509139t = -16777216;
        this.f509142w = action == ug5.b.f509115e;
        this.f509144y = true;
        this.f509145z = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* renamed from: equals */
    public boolean m168012xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug5.g) && this.f509120a == ((ug5.g) obj).f509120a;
    }

    /* renamed from: hashCode */
    public int m168013x8cdac1b() {
        return this.f509120a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m168014x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fromRect=");
        sb6.append(this.f509129j);
        sb6.append(", toRect=");
        sb6.append(this.f509130k);
        sb6.append(", supportClipCanvas=");
        sb6.append(this.f509144y);
        sb6.append(" useTransparentActivity=");
        java.lang.Class cls = this.f509140u;
        sb6.append(cls != null ? cls.getSimpleName() : null);
        sb6.append(" durationMs=");
        sb6.append(this.f509135p);
        sb6.append(" delayStartMs=");
        sb6.append(this.f509136q);
        sb6.append(" delayCompletedMs=0, isAutoCompleteAfterAnim=");
        sb6.append(this.f509143x);
        sb6.append(", isFinishActivityAfterCompleted=");
        sb6.append(this.f509142w);
        sb6.append(" timeoutCompleted: ");
        sb6.append(this.f509137r);
        sb6.append(" isFinishTransparentActivityAfterCompleted=");
        sb6.append(this.f509141v);
        sb6.append(" extras: ");
        sb6.append(this.f509128i);
        return sb6.toString();
    }
}
