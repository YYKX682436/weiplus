package g55;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f350509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f350510b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f350511c;

    /* renamed from: d, reason: collision with root package name */
    public final int f350512d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f350513e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f350514f;

    /* renamed from: g, reason: collision with root package name */
    public long f350515g;

    /* renamed from: h, reason: collision with root package name */
    public long f350516h;

    /* renamed from: i, reason: collision with root package name */
    public long f350517i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f350518j;

    /* renamed from: k, reason: collision with root package name */
    public long f350519k;

    /* renamed from: l, reason: collision with root package name */
    public long f350520l;

    /* renamed from: m, reason: collision with root package name */
    public long f350521m;

    /* renamed from: n, reason: collision with root package name */
    public long f350522n;

    /* renamed from: o, reason: collision with root package name */
    public int f350523o;

    /* renamed from: p, reason: collision with root package name */
    public long f350524p;

    /* renamed from: q, reason: collision with root package name */
    public long f350525q;

    /* renamed from: r, reason: collision with root package name */
    public long f350526r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f350527s;

    public g(long j17, int i17, java.lang.String pageName, int i18, java.lang.String clickEntryKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickEntryKey, "clickEntryKey");
        this.f350509a = j17;
        this.f350510b = i17;
        this.f350511c = pageName;
        this.f350512d = i18;
        this.f350513e = clickEntryKey;
        this.f350514f = new java.util.LinkedHashMap();
    }

    public final void a(long j17, int i17) {
        if (this.f350515g == 0) {
            this.f350515g = j17;
        }
        this.f350519k = 0L;
        long j18 = this.f350526r;
        if (j18 == 0 || j17 <= j18 || i17 != 1) {
            return;
        }
        long j19 = j17 - j18;
        this.f350524p = j19;
        this.f350525q += j19;
        this.f350526r = 0L;
    }

    public final void b(long j17, int i17) {
        long j18 = this.f350515g;
        if (j17 <= j18 || j18 == 0) {
            return;
        }
        if (!this.f350518j) {
            this.f350516h += j17 - j18;
            this.f350518j = true;
        }
        if (i17 == 1) {
            this.f350526r = j17;
        }
        this.f350519k = j17 - j18;
        this.f350521m += j17 - j18;
        this.f350515g = 0L;
        this.f350517i = j17;
        this.f350523o++;
    }

    public final java.util.Map c() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(this.f350514f);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("in_time", java.lang.Long.valueOf(this.f350509a));
        linkedHashMap2.put("out_time", java.lang.Long.valueOf(this.f350517i));
        if (this.f350527s) {
            linkedHashMap2.put("red_dot_consumption_time", java.lang.Long.valueOf(this.f350516h));
        }
        linkedHashMap2.put("first_page_stay_time", java.lang.Long.valueOf(this.f350520l));
        linkedHashMap2.put("all_stay_time", java.lang.Long.valueOf(this.f350521m));
        linkedHashMap2.put("page_id", java.lang.Integer.valueOf(this.f350510b));
        linkedHashMap2.put("page_name", this.f350511c);
        linkedHashMap2.put("click_entry_key", this.f350513e);
        linkedHashMap2.put("out_num", java.lang.Integer.valueOf(this.f350523o));
        linkedHashMap2.put("cur_stay_time", java.lang.Long.valueOf(this.f350519k));
        linkedHashMap2.put("cur_app_out_stay_time", java.lang.Long.valueOf(this.f350524p));
        linkedHashMap2.put("all_app_out_stay_time", java.lang.Long.valueOf(this.f350525q));
        linkedHashMap2.put("is_red_dot", java.lang.Integer.valueOf(this.f350527s ? 1 : 0));
        linkedHashMap.putAll(linkedHashMap2);
        return linkedHashMap;
    }

    /* renamed from: equals */
    public boolean m130928xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g55.g)) {
            return false;
        }
        g55.g gVar = (g55.g) obj;
        return this.f350509a == gVar.f350509a && this.f350510b == gVar.f350510b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350511c, gVar.f350511c) && this.f350512d == gVar.f350512d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350513e, gVar.f350513e);
    }

    /* renamed from: hashCode */
    public int m130929x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f350509a) * 31) + java.lang.Integer.hashCode(this.f350510b)) * 31) + this.f350511c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f350512d)) * 31) + this.f350513e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130930x9616526c() {
        return "pageId = " + this.f350510b + "\npageName = " + this.f350511c + "\nleaveTime = " + this.f350509a + "\noutTime = " + this.f350517i + "\nstayTime = " + this.f350516h + "\nfirstPageStayTime = " + this.f350520l + "\ncurPageStayTime = " + this.f350519k + "\nallStayTime = " + this.f350521m + "\nentryKey = " + this.f350513e + "\nparams: " + kz5.n0.g0(((java.util.LinkedHashMap) this.f350514f).entrySet(), ",", "{", "}", 0, null, g55.f.f350508d, 24, null);
    }
}
