package nl5;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f419805a;

    /* renamed from: b, reason: collision with root package name */
    public final nl5.d f419806b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f419807c;

    /* renamed from: d, reason: collision with root package name */
    public final long f419808d;

    /* renamed from: e, reason: collision with root package name */
    public final int f419809e;

    /* renamed from: f, reason: collision with root package name */
    public long f419810f;

    /* renamed from: g, reason: collision with root package name */
    public float f419811g;

    /* renamed from: h, reason: collision with root package name */
    public float f419812h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f419813i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f419814j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f419815k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f419816l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f419817m;

    /* renamed from: n, reason: collision with root package name */
    public int f419818n;

    /* renamed from: o, reason: collision with root package name */
    public long f419819o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f419820p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f419821q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f419822r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f419823s;

    public h(android.widget.TextView textView, nl5.d selectionController, java.util.Locale locale, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 4) != 0) {
            locale = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        }
        z17 = (i17 & 8) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectionController, "selectionController");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locale, "locale");
        this.f419805a = textView;
        this.f419806b = selectionController;
        this.f419807c = z17;
        this.f419808d = android.view.ViewConfiguration.getDoubleTapTimeout();
        this.f419809e = android.view.ViewConfiguration.get(textView.getContext()).getScaledDoubleTapSlop();
        this.f419816l = true;
        this.f419817m = true;
        this.f419820p = new int[2];
        this.f419821q = jz5.h.b(new nl5.g(locale));
        this.f419822r = new nl5.f(this);
        this.f419823s = new nl5.e(this);
    }

    public final void a() {
        this.f419815k = false;
        this.f419805a.removeCallbacks(this.f419823s);
        this.f419818n = 0;
        this.f419819o = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.h.b(android.view.MotionEvent):boolean");
    }

    public final void c() {
        if (this.f419815k) {
            com.p314xaae8f345.mm.ui.yk.a("DoubleTapWordSelect", "onKeyboardFullyShown: keyboard stable, refreshing UI", new java.lang.Object[0]);
            this.f419815k = false;
            this.f419805a.removeCallbacks(this.f419823s);
            nl5.s0 s0Var = ((nl5.c0) this.f419806b).f419797a;
            if (s0Var.f419906x) {
                return;
            }
            s0Var.n(s0Var.f419883b);
            s0Var.n(s0Var.f419885c);
            s0Var.p(s0Var.g());
        }
    }
}
