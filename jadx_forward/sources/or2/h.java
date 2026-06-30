package or2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f429161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f429162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f429163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f429164d;

    /* renamed from: e, reason: collision with root package name */
    public final int f429165e;

    /* renamed from: f, reason: collision with root package name */
    public final float f429166f;

    /* renamed from: g, reason: collision with root package name */
    public long f429167g;

    /* renamed from: h, reason: collision with root package name */
    public long f429168h;

    /* renamed from: i, reason: collision with root package name */
    public long f429169i;

    /* renamed from: j, reason: collision with root package name */
    public long f429170j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f429171k;

    /* renamed from: l, reason: collision with root package name */
    public int f429172l;

    /* renamed from: m, reason: collision with root package name */
    public long f429173m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f429174n;

    /* renamed from: o, reason: collision with root package name */
    public long f429175o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f429176p;

    public h(java.lang.String scene, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f429161a = scene;
        this.f429162b = i17;
        this.f429163c = 3;
        this.f429164d = 1;
        this.f429165e = 2;
        this.f429166f = 0.041666668f;
        this.f429171k = new java.util.ArrayList();
        this.f429174n = new java.util.concurrent.CopyOnWriteArrayList();
        this.f429176p = "";
    }

    public final int a() {
        long b17 = b();
        int b18 = a06.d.b(b17 > 0 ? (this.f429172l * 1000.0f) / ((float) b17) : 0.0f);
        int i17 = this.f429162b;
        return i17 > b18 ? b18 : i17;
    }

    public final long b() {
        if (this.f429173m == 0) {
            this.f429173m = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.f429169i - this.f429170j);
        }
        return this.f429173m;
    }

    public final int c() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f429174n;
        if ((copyOnWriteArrayList instanceof java.util.Collection) && copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if ((((or2.g) it.next()).f429160b == this.f429165e) && (i17 = i17 + 1) < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        return i17;
    }

    public final long d() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        java.util.Iterator it = this.f429174n.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((or2.g) it.next()).f429159a;
        }
        return timeUnit.toMillis(j17);
    }

    public final int e() {
        if (d() == 0) {
            return 0;
        }
        int size = (int) ((this.f429174n.size() / ((float) d())) * 1000);
        int i17 = this.f429162b;
        return i17 > size ? size : i17;
    }

    public final int f() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f429174n;
        if ((copyOnWriteArrayList instanceof java.util.Collection) && copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if ((((or2.g) it.next()).f429160b == this.f429164d) && (i17 = i17 + 1) < 0) {
                kz5.c0.o();
                throw null;
            }
        }
        return i17;
    }

    public final float g() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f429174n;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            j18 += ((or2.g) it.next()).f429159a;
        }
        if (j18 == 0) {
            return 0.0f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = copyOnWriteArrayList.iterator();
        while (true) {
            boolean z17 = true;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            int i17 = ((or2.g) next).f429160b;
            if (i17 != this.f429164d && i17 != this.f429165e) {
                z17 = false;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            j17 += ((or2.g) it7.next()).f429159a;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) j17) / ((float) j18))}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        java.lang.Float f17 = r26.g0.f(format);
        if (f17 != null) {
            return f17.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: toString */
    public java.lang.String m152145x9616526c() {
        boolean z17;
        int a17 = a();
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17) {
            return "";
        }
        return this.f429176p + " jank:" + f() + " bigJank:" + c() + " stutter:" + g() + " FrameTimeDuration:" + d() + " Duration=" + b() + "ms FrameTimeFPS:" + e() + " FPS=" + a17 + " RefreshRate=" + this.f429162b + " FrameCount=" + this.f429172l + " FrameTimeCount=" + this.f429174n.size() + " DropList=" + this.f429171k;
    }
}
