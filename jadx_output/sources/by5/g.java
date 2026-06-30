package by5;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f36448a;

    /* renamed from: b, reason: collision with root package name */
    public int f36449b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36451d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f36452e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f36455h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f36456i;

    /* renamed from: j, reason: collision with root package name */
    public by5.k[] f36457j;

    /* renamed from: k, reason: collision with root package name */
    public int f36458k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f36459l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f36460m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36461n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f36462o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f36463p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f36464q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f36465r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f36466s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36467t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36468u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f36469v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f36470w;

    /* renamed from: c, reason: collision with root package name */
    public final by5.j f36450c = new by5.j();

    /* renamed from: f, reason: collision with root package name */
    public float f36453f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f36454g = -1.0f;

    public int[] a() {
        if (android.text.TextUtils.isEmpty(this.f36455h)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f36455h.split(":")) {
            if (!android.text.TextUtils.isEmpty(str)) {
                by5.z e17 = by5.a0.e(str);
                if (!e17.f36615a) {
                    by5.c4.c("ConfigDef", " parse schedule failed, schedule str is " + this.f36455h);
                    return null;
                }
                int b17 = e17.b();
                if (b17 < 0 || b17 > 10000) {
                    by5.c4.c("ConfigDef", " get invalid schedule value = " + b17 + ", schedule str is " + this.f36455h);
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
                by5.c4.c("ConfigDef", " get invalid schedule this value smaller than previous one, schedule str is " + this.f36455h);
                return null;
            }
            iArr[i17] = b18;
        }
        return iArr;
    }
}
