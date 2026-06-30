package ez4;

/* loaded from: classes12.dex */
public final class u implements ih0.p {

    /* renamed from: a, reason: collision with root package name */
    public final dz4.i f339475a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f339476b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f339477c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f339478d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f339479e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f339480f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f339481g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f339482h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f339483i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f339484j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f339485k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f339486l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f339487m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f339488n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f339489o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f339490p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f339491q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f339492r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f339493s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f339494t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f339495u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f339496v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f339497w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f339498x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f339499y;

    public u(dz4.i data, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.f339475a = data;
        this.f339476b = sessionId;
        this.f339480f = jz5.h.b(new ez4.t(this));
        this.f339481g = jz5.h.b(new ez4.a(this));
        this.f339482h = jz5.h.b(new ez4.s(this));
        this.f339483i = jz5.h.b(new ez4.k(this));
        this.f339484j = jz5.h.b(new ez4.m(this));
        this.f339485k = jz5.h.b(new ez4.l(this));
        this.f339486l = jz5.h.b(new ez4.h(this));
        this.f339487m = jz5.h.b(new ez4.p(this));
        this.f339488n = jz5.h.b(new ez4.f(this));
        this.f339489o = jz5.h.b(new ez4.n(this));
        this.f339490p = jz5.h.b(new ez4.o(this));
        this.f339491q = jz5.h.b(new ez4.j(this));
        this.f339492r = jz5.h.b(new ez4.r(this));
        this.f339493s = jz5.h.b(new ez4.e(this));
        this.f339494t = jz5.h.b(new ez4.c(this));
        this.f339495u = jz5.h.b(new ez4.i(this));
        this.f339496v = jz5.h.b(new ez4.d(this));
        this.f339497w = jz5.h.b(new ez4.b(this));
        this.f339498x = jz5.h.b(new ez4.g(this));
        this.f339499y = jz5.h.b(new ez4.q(this));
    }

    public final dz4.y1 a() {
        return (dz4.y1) ((jz5.n) this.f339495u).mo141623x754a37bb();
    }

    public final dz4.u3 b() {
        return (dz4.u3) ((jz5.n) this.f339487m).mo141623x754a37bb();
    }

    public dz4.i3 c() {
        return (dz4.i3) ((jz5.n) this.f339484j).mo141623x754a37bb();
    }

    public void d(android.app.Activity activity) {
        java.lang.ref.WeakReference weakReference = this.f339477c;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (activity != null) {
            this.f339477c = new java.lang.ref.WeakReference(activity);
            if (this.f339475a.f326824b) {
                hz4.b0.a();
                return;
            }
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f339477c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f339477c = null;
        dz4.u3 b17 = b();
        java.util.Set callbackSet = b17.f326964b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackSet, "callbackSet");
        synchronized (callbackSet) {
            b17.f326964b.clear();
        }
    }
}
