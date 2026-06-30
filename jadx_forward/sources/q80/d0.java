package q80;

/* loaded from: classes8.dex */
public class d0 {
    public int A;
    public boolean B;
    public int C;
    public org.json.JSONObject D;
    public java.lang.String E;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f442182a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f442183b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f442184c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f442185d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f442186e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f442187f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Bundle f442188g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f442189h;

    /* renamed from: i, reason: collision with root package name */
    public int f442190i;

    /* renamed from: j, reason: collision with root package name */
    public double f442191j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f442192k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f442193l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 f442194m;

    /* renamed from: n, reason: collision with root package name */
    public int f442195n;

    /* renamed from: o, reason: collision with root package name */
    public long f442196o;

    /* renamed from: p, reason: collision with root package name */
    public int f442197p;

    /* renamed from: q, reason: collision with root package name */
    public int f442198q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f442199r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f442200s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f442201t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String[] f442202u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String[] f442203v;

    /* renamed from: w, reason: collision with root package name */
    public long f442204w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f442205x;

    /* renamed from: y, reason: collision with root package name */
    public org.json.JSONObject f442206y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 f442207z;

    public d0() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f442185d = bool;
        this.f442186e = false;
        this.f442188g = null;
        this.f442189h = bool;
        this.f442190i = 0;
        this.f442191j = 0.0d;
        this.f442192k = false;
        this.f442193l = false;
        this.f442194m = null;
        this.f442195n = 0;
        this.f442196o = 0L;
        this.f442197p = 0;
        this.f442198q = 0;
        this.f442199r = true;
        this.f442200s = false;
        this.f442204w = 0L;
        this.f442205x = null;
        this.f442206y = null;
        this.f442207z = null;
        this.A = 0;
        this.B = false;
        this.C = 0;
        this.D = null;
        this.E = "";
        this.f442182a = "";
        this.f442183b = "";
    }

    public d0(java.lang.String str) {
        java.lang.String str2;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f442185d = bool;
        this.f442186e = false;
        this.f442188g = null;
        this.f442189h = bool;
        this.f442190i = 0;
        this.f442191j = 0.0d;
        this.f442192k = false;
        this.f442193l = false;
        this.f442194m = null;
        this.f442195n = 0;
        this.f442196o = 0L;
        this.f442197p = 0;
        this.f442198q = 0;
        this.f442199r = true;
        this.f442200s = false;
        this.f442204w = 0L;
        this.f442205x = null;
        this.f442206y = null;
        this.f442207z = null;
        this.A = 0;
        this.B = false;
        this.C = 0;
        this.D = null;
        java.lang.String str3 = "";
        this.E = "";
        int i17 = str.startsWith("liteapp://") ? 10 : 0;
        int i18 = i17;
        while (true) {
            if (i18 >= str.length()) {
                i18 = -1;
                break;
            } else if ("/?".indexOf(str.charAt(i18)) != -1) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 == -1) {
            str2 = str.substring(i17);
        } else {
            java.lang.String substring = str.substring(i17, i18);
            str3 = str.substring(i18 + 1);
            str2 = substring;
        }
        this.f442182a = str2;
        this.f442183b = str3;
    }
}
