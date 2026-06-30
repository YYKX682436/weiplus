package by5;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f117981a;

    /* renamed from: b, reason: collision with root package name */
    public int f117982b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117984d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117985e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117988h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f117989i;

    /* renamed from: j, reason: collision with root package name */
    public by5.k[] f117990j;

    /* renamed from: k, reason: collision with root package name */
    public int f117991k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f117992l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f117993m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f117994n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f117995o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f117996p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f117997q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f117998r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f117999s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f118000t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f118001u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f118002v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f118003w;

    /* renamed from: c, reason: collision with root package name */
    public final by5.j f117983c = new by5.j();

    /* renamed from: f, reason: collision with root package name */
    public float f117986f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f117987g = -1.0f;

    public int[] a() {
        if (android.text.TextUtils.isEmpty(this.f117988h)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f117988h.split(":")) {
            if (!android.text.TextUtils.isEmpty(str)) {
                by5.z e17 = by5.a0.e(str);
                if (!e17.f118148a) {
                    by5.c4.c("ConfigDef", " parse schedule failed, schedule str is " + this.f117988h);
                    return null;
                }
                int b17 = e17.b();
                if (b17 < 0 || b17 > 10000) {
                    by5.c4.c("ConfigDef", " get invalid schedule value = " + b17 + ", schedule str is " + this.f117988h);
                    return null;
                }
                arrayList.add(e17);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            int b18 = ((by5.z) arrayList.get(i17)).b();
            if (i17 > 0 && b18 < iArr[i17 - 1]) {
                by5.c4.c("ConfigDef", " get invalid schedule this value smaller than previous one, schedule str is " + this.f117988h);
                return null;
            }
            iArr[i17] = b18;
        }
        return iArr;
    }
}
