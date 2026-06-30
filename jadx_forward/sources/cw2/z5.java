package cw2;

/* loaded from: classes15.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f305666a;

    /* renamed from: b, reason: collision with root package name */
    public cw2.c6 f305667b;

    /* renamed from: c, reason: collision with root package name */
    public cw2.b6 f305668c;

    /* renamed from: d, reason: collision with root package name */
    public long f305669d;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f305671f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f305672g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f305673h;

    /* renamed from: i, reason: collision with root package name */
    public cw2.q5 f305674i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f305670e = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public final yz5.a f305675j = new cw2.t5(this);

    public static final void a(cw2.z5 z5Var) {
        cw2.q5 q5Var = z5Var.f305674i;
        if (q5Var == null) {
            return;
        }
        z5Var.f305674i = null;
        cw2.d6 d6Var = cw2.d6.f305178g;
        if (d6Var == null) {
            return;
        }
        if (z5Var.f305669d == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderThumbPlayerPostProcessor", "Execute pending swap chain op skipped. swapChain is null. op=" + q5Var + ", holder=" + z5Var);
            return;
        }
        if (q5Var instanceof cw2.p5) {
            cw2.p5 p5Var = (cw2.p5) q5Var;
            android.view.Surface surface = z5Var.f305671f;
            android.view.Surface surface2 = p5Var.f305460a;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(surface2, surface)) {
                cw2.p5 p5Var2 = (cw2.p5) q5Var;
                if (d6Var.f305182c.m47849x458318bf(z5Var.f305669d, p5Var.f305460a, p5Var2.f305461b, p5Var2.f305462c)) {
                    z5Var.f305671f = surface2;
                    java.util.Objects.toString(surface2);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Recreate swap chain failed. holder=" + z5Var);
                    return;
                }
            }
            long j17 = z5Var.f305669d;
            cw2.p5 p5Var3 = (cw2.p5) q5Var;
            com.p314xaae8f345.mm.p937x8ef83553.C11100x5c67d993 c11100x5c67d993 = d6Var.f305182c;
            int i17 = p5Var3.f305461b;
            int i18 = p5Var3.f305462c;
            if (c11100x5c67d993.m47854xecfd669a(j17, i17, i18)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Resize swap chain failed. width=" + i17 + ", height=" + i18 + ", holder=" + z5Var);
        }
    }

    public final void b(int i17, int i18) {
        android.os.Handler handler;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderThumbPlayerPostProcessor", "On input surface size changed. width=" + i17 + ", height=" + i18 + ", " + this);
        synchronized (cw2.d6.f305177f) {
            cw2.d6 d6Var = cw2.d6.f305178g;
            if (d6Var != null && (handler = d6Var.f305181b) != null) {
                handler.post(new cw2.u5(this, i17, i18));
            }
        }
    }

    public final void c(android.view.Surface surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        surface.toString();
        synchronized (cw2.d6.f305177f) {
            cw2.d6 d6Var = cw2.d6.f305178g;
            if (d6Var == null) {
                return;
            }
            d6Var.f305181b.post(new cw2.v5(this, surface, i17, i18));
        }
    }

    public final void d() {
        synchronized (cw2.d6.f305177f) {
            cw2.d6 d6Var = cw2.d6.f305178g;
            if (d6Var == null) {
                return;
            }
            int i17 = cw2.d6.f305179h - 1;
            cw2.d6.f305179h = i17;
            boolean z17 = i17 == 0;
            if (z17) {
                cw2.d6.f305178g = null;
            }
            d6Var.f305181b.post(new cw2.w5(this, d6Var, z17));
        }
    }
}
