package t21;

/* loaded from: classes4.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f496300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f496303h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496304i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496305m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f496306n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f496307o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f496308p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f496309q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496310r;

    public g2(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, long j17, long j18, int i18, int i19, java.lang.String str6) {
        this.f496299d = str;
        this.f496300e = strArr;
        this.f496301f = str2;
        this.f496302g = str3;
        this.f496303h = i17;
        this.f496304i = str4;
        this.f496305m = str5;
        this.f496306n = j17;
        this.f496307o = j18;
        this.f496308p = i18;
        this.f496309q = i19;
        this.f496310r = str6;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = this.f496299d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str2, true);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreMediaRpt", "get media info is null. %s", str2);
            return;
        }
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str2);
        java.lang.String[] strArr = this.f496300e;
        if (strArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (java.lang.String str3 : strArr) {
                stringBuffer.append(str3);
                stringBuffer.append("|");
            }
            str = stringBuffer.toString();
        } else {
            str = null;
        }
        int m40064x8b9dd687 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40064x8b9dd687(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String Di = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(str2);
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        stringBuffer2.append(this.f496301f);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f496302g);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f496303h);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f496304i);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f496305m);
        stringBuffer2.append(",");
        stringBuffer2.append(m40064x8b9dd687);
        stringBuffer2.append(",");
        stringBuffer2.append(Di);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f496306n);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f496307o);
        stringBuffer2.append(",");
        stringBuffer2.append(k17);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f243915a);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f243916b / 1000);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f243921g / 1000);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f243919e);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f243917c);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f243918d);
        stringBuffer2.append(",");
        stringBuffer2.append(str);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f243920f);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f496308p);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f496309q);
        stringBuffer2.append(",");
        stringBuffer2.append(fo4.c.a(this.f496310r));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMediaRpt", "download video rpt %s ", stringBuffer2.toString());
        new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6398xf5819b36(stringBuffer2.toString()).k();
    }
}
