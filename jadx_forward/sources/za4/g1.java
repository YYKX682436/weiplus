package za4;

/* loaded from: classes4.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f552623a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f552624b;

    /* renamed from: c, reason: collision with root package name */
    public int f552625c;

    /* renamed from: d, reason: collision with root package name */
    public int f552626d;

    /* renamed from: e, reason: collision with root package name */
    public int f552627e;

    /* renamed from: f, reason: collision with root package name */
    public int f552628f;

    /* renamed from: g, reason: collision with root package name */
    public int f552629g;

    /* renamed from: h, reason: collision with root package name */
    public int f552630h;

    /* renamed from: i, reason: collision with root package name */
    public int f552631i;

    /* renamed from: j, reason: collision with root package name */
    public int f552632j;

    /* renamed from: k, reason: collision with root package name */
    public int f552633k;

    /* renamed from: l, reason: collision with root package name */
    public int f552634l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f552635m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f552636n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f552637o;

    /* renamed from: r, reason: collision with root package name */
    public int f552640r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f552641s;

    /* renamed from: t, reason: collision with root package name */
    public long f552642t;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f552638p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f552639q = "";

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONArray f552643u = new org.json.JSONArray();

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendExtra", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesReportInfo");
        if (!android.text.TextUtils.isEmpty(str)) {
            if (this.f552638p.length() > 0) {
                this.f552638p += "&";
            }
            this.f552638p += java.net.URLEncoder.encode(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendExtra", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesReportInfo");
    }
}
