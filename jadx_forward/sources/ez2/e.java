package ez2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f339411t;

    /* renamed from: a, reason: collision with root package name */
    public final long f339412a;

    /* renamed from: b, reason: collision with root package name */
    public final ez2.f f339413b;

    /* renamed from: c, reason: collision with root package name */
    public final ez2.d f339414c;

    /* renamed from: d, reason: collision with root package name */
    public final int f339415d;

    /* renamed from: e, reason: collision with root package name */
    public final long f339416e;

    /* renamed from: f, reason: collision with root package name */
    public long f339417f;

    /* renamed from: g, reason: collision with root package name */
    public long f339418g;

    /* renamed from: h, reason: collision with root package name */
    public long f339419h;

    /* renamed from: i, reason: collision with root package name */
    public long f339420i;

    /* renamed from: j, reason: collision with root package name */
    public long f339421j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f339422k;

    /* renamed from: l, reason: collision with root package name */
    public float f339423l;

    /* renamed from: m, reason: collision with root package name */
    public int f339424m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f339425n;

    /* renamed from: o, reason: collision with root package name */
    public long f339426o;

    /* renamed from: p, reason: collision with root package name */
    public long f339427p;

    /* renamed from: q, reason: collision with root package name */
    public long f339428q;

    /* renamed from: r, reason: collision with root package name */
    public long f339429r;

    /* renamed from: s, reason: collision with root package name */
    public long f339430s;

    public e(long j17, ez2.f type, ez2.d animType, int i17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animType, "animType");
        this.f339412a = j17;
        this.f339413b = type;
        this.f339414c = animType;
        this.f339415d = i17;
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        valueOf = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1)) > 0 ? valueOf : null;
        this.f339416e = valueOf != null ? valueOf.longValue() : android.os.SystemClock.elapsedRealtime();
        this.f339422k = !f339411t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "init click time, type: " + type + " animType: " + animType + " scene: " + i17 + " feedId: " + j17);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickClickPageFrameCost: clickPageFrameCost: " + this.f339427p + ' ');
        long j17 = this.f339427p;
        long j18 = this.f339416e;
        if (j17 == 0) {
            this.f339427p = android.os.SystemClock.elapsedRealtime() - j18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickClickPageFrameCost - cost: " + (android.os.SystemClock.elapsedRealtime() - j18));
        f339411t = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6612x3a5f684f c6612x3a5f684f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6612x3a5f684f();
        c6612x3a5f684f.f139652d = this.f339413b.f339434d;
        c6612x3a5f684f.f139653e = this.f339414c.f339410d;
        c6612x3a5f684f.f139654f = this.f339422k ? 1 : 2;
        c6612x3a5f684f.f139655g = this.f339415d;
        c6612x3a5f684f.f139656h = (int) (android.os.SystemClock.elapsedRealtime() - j18);
        long j19 = this.f339418g;
        c6612x3a5f684f.f139657i = (int) (j19 - this.f339417f);
        c6612x3a5f684f.f139658j = (int) (j19 - j18);
        c6612x3a5f684f.f139659k = (int) (this.f339421j - this.f339420i);
        c6612x3a5f684f.f139660l = (int) this.f339428q;
        c6612x3a5f684f.f139661m = (int) this.f339429r;
        c6612x3a5f684f.f139662n = this.f339425n ? 2 : 1;
        c6612x3a5f684f.f139663o = (int) this.f339423l;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("exptId", c19767x257d7f.f38864x6ac9171);
        jSONObject.put("groupId", c19767x257d7f2.f38864x6ac9171);
        jSONObject.putOpt("clickFirstFrame", java.lang.Long.valueOf(this.f339426o));
        jSONObject.putOpt("clickPageFrame", java.lang.Long.valueOf(this.f339427p));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6612x3a5f684f.f139665q = c6612x3a5f684f.b("extInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        c6612x3a5f684f.f139664p = this.f339424m;
        c6612x3a5f684f.f139666r = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
        c6612x3a5f684f.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "realReport: " + c6612x3a5f684f.n());
        ez2.g.f339435a = null;
    }

    public final void b() {
        this.f339421j = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickActivityOnCreate cost: " + (this.f339421j - this.f339420i));
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickActivityStart");
        this.f339420i = android.os.SystemClock.elapsedRealtime();
    }

    public final void d() {
        this.f339417f = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickAnimBefore");
    }

    public final void e() {
        this.f339419h = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickAnimEnd cost: " + (this.f339419h - this.f339418g));
    }

    public final void f(long j17) {
        this.f339418g = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickAnimStart cost: " + (this.f339418g - this.f339417f) + " duration: " + j17);
    }

    public final void g(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickClickFirstFrameCost: clickFirstFrameCost: " + this.f339426o + " cost: " + j17);
        long j18 = this.f339426o;
        long j19 = this.f339416e;
        if (j18 == 0) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            if (!(valueOf.longValue() > 0)) {
                valueOf = null;
            }
            this.f339426o = valueOf != null ? valueOf.longValue() : android.os.SystemClock.elapsedRealtime() - j19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickFirstFrameEnd - cost: " + (android.os.SystemClock.elapsedRealtime() - j19));
    }

    public final void h(boolean z17, float f17, int i17) {
        this.f339425n = z17;
        this.f339423l = f17;
        this.f339424m = i17;
        if (this.f339414c == ez2.d.f339406i) {
            return;
        }
        a();
    }

    public final void i(long j17) {
        this.f339428q = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickFirstFrameChangeEnd cost: " + this.f339428q);
    }

    public final void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickImageComplete showCost: " + (android.os.SystemClock.elapsedRealtime() - this.f339430s));
        a();
    }
}
