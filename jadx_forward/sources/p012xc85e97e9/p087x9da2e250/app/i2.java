package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class i2 {

    /* renamed from: b, reason: collision with root package name */
    public int f92878b;

    /* renamed from: c, reason: collision with root package name */
    public int f92879c;

    /* renamed from: d, reason: collision with root package name */
    public int f92880d;

    /* renamed from: e, reason: collision with root package name */
    public int f92881e;

    /* renamed from: f, reason: collision with root package name */
    public int f92882f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92883g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f92885i;

    /* renamed from: j, reason: collision with root package name */
    public int f92886j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f92887k;

    /* renamed from: l, reason: collision with root package name */
    public int f92888l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f92889m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f92890n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f92891o;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f92893q;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f92877a = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f92884h = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f92892p = false;

    public i2(p012xc85e97e9.p087x9da2e250.app.u0 u0Var, java.lang.ClassLoader classLoader) {
    }

    public void b(p012xc85e97e9.p087x9da2e250.app.h2 h2Var) {
        this.f92877a.add(h2Var);
        h2Var.f92863c = this.f92878b;
        h2Var.f92864d = this.f92879c;
        h2Var.f92865e = this.f92880d;
        h2Var.f92866f = this.f92881e;
    }

    public p012xc85e97e9.p087x9da2e250.app.i2 c(java.lang.String str) {
        if (!this.f92884h) {
            throw new java.lang.IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f92883g = true;
        this.f92885i = str;
        return this;
    }

    public abstract int d();

    public abstract int e();

    public abstract void f();

    public abstract void g();

    public abstract void h(int i17, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.String str, int i18);

    public abstract p012xc85e97e9.p087x9da2e250.app.i2 i(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670);

    public abstract p012xc85e97e9.p087x9da2e250.app.i2 j(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670);

    public p012xc85e97e9.p087x9da2e250.app.i2 k(int i17, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.String str) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Must use non-zero containerViewId");
        }
        h(i17, componentCallbacksC1101xa17d4670, str, 2);
        return this;
    }

    public p012xc85e97e9.p087x9da2e250.app.i2 l(int i17, int i18, int i19, int i27) {
        this.f92878b = i17;
        this.f92879c = i18;
        this.f92880d = i19;
        this.f92881e = i27;
        return this;
    }

    public abstract p012xc85e97e9.p087x9da2e250.app.i2 m(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.n nVar);

    public abstract p012xc85e97e9.p087x9da2e250.app.i2 n(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670);
}
