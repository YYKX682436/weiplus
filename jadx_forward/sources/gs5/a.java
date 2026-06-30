package gs5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356683h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f356684i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356685m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f356686n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f356687o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356688p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356689q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f356690r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f356691s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f356692t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f356693u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f356694v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356695w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356696x;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, java.lang.String str6, long j18, long j19, java.lang.String str7, java.lang.String str8, long j27, long j28, int i17, boolean z17, int i18, java.lang.String str9, java.lang.String str10) {
        this.f356679d = str;
        this.f356680e = str2;
        this.f356681f = str3;
        this.f356682g = str4;
        this.f356683h = str5;
        this.f356684i = j17;
        this.f356685m = str6;
        this.f356686n = j18;
        this.f356687o = j19;
        this.f356688p = str7;
        this.f356689q = str8;
        this.f356690r = j27;
        this.f356691s = j28;
        this.f356692t = i17;
        this.f356693u = z17;
        this.f356694v = i18;
        this.f356695w = str9;
        this.f356696x = str10;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.net.HttpURLConnection httpURLConnection;
        java.net.HttpURLConnection httpURLConnection2 = null;
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) kr5.p.f393103a.getSystemService("phone");
            try {
                if (telephonyManager != null && 5 == telephonyManager.getSimState()) {
                    str = telephonyManager.getSimOperator();
                    java.net.URL url = new java.net.URL(("https://h.trace.qq.com/kv?attaid=0f500064192&token=4725229671&carrier=" + str + "&networkType=" + this.f356679d + "&dnsId=" + this.f356680e + "&appId=" + this.f356681f + "&encryptType=" + this.f356682g + "&eventName=" + this.f356683h + "&eventTime=" + this.f356684i + "&dnsIp=" + this.f356685m + "&sdkVersion=4.11.0a&deviceName=" + gs5.b.f356697a + "&systemName=Android&systemVersion=" + gs5.b.f356698b + "&spend=" + this.f356686n + "&ldns_spend=" + this.f356687o + "&req_dn=" + this.f356688p + "&req_type=" + this.f356689q + "&req_timeout=" + this.f356690r + "&req_query=&req_ttl=0&errorCode=" + this.f356691s + "&statusCode=" + this.f356692t + "&sessionId=" + gs5.b.f356699c + "&isCache=" + (this.f356693u ? 1 : 0) + "&count=" + this.f356694v + "&ldns=" + this.f356695w + "&hdns=" + this.f356696x + "&_dc=" + java.lang.Math.random()).replace(" ", "_"));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("开始Atta上报：");
                    sb6.append(url);
                    or5.b.a(sb6.toString(), new java.lang.Object[0]);
                    httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(2000);
                    httpURLConnection.setReadTimeout(2000);
                    httpURLConnection.connect();
                    or5.b.a("Atta respCode：" + httpURLConnection.getResponseCode(), new java.lang.Object[0]);
                    httpURLConnection.disconnect();
                    or5.b.a("Atta上报关闭", new java.lang.Object[0]);
                    return;
                }
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(2000);
                httpURLConnection.setReadTimeout(2000);
                httpURLConnection.connect();
                or5.b.a("Atta respCode：" + httpURLConnection.getResponseCode(), new java.lang.Object[0]);
                httpURLConnection.disconnect();
                or5.b.a("Atta上报关闭", new java.lang.Object[0]);
                return;
            } catch (java.io.IOException unused) {
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    or5.b.a("Atta上报关闭", new java.lang.Object[0]);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                th = th6;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    or5.b.a("Atta上报关闭", new java.lang.Object[0]);
                }
                throw th;
            }
            str = "-1";
            java.net.URL url2 = new java.net.URL(("https://h.trace.qq.com/kv?attaid=0f500064192&token=4725229671&carrier=" + str + "&networkType=" + this.f356679d + "&dnsId=" + this.f356680e + "&appId=" + this.f356681f + "&encryptType=" + this.f356682g + "&eventName=" + this.f356683h + "&eventTime=" + this.f356684i + "&dnsIp=" + this.f356685m + "&sdkVersion=4.11.0a&deviceName=" + gs5.b.f356697a + "&systemName=Android&systemVersion=" + gs5.b.f356698b + "&spend=" + this.f356686n + "&ldns_spend=" + this.f356687o + "&req_dn=" + this.f356688p + "&req_type=" + this.f356689q + "&req_timeout=" + this.f356690r + "&req_query=&req_ttl=0&errorCode=" + this.f356691s + "&statusCode=" + this.f356692t + "&sessionId=" + gs5.b.f356699c + "&isCache=" + (this.f356693u ? 1 : 0) + "&count=" + this.f356694v + "&ldns=" + this.f356695w + "&hdns=" + this.f356696x + "&_dc=" + java.lang.Math.random()).replace(" ", "_"));
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("开始Atta上报：");
            sb62.append(url2);
            or5.b.a(sb62.toString(), new java.lang.Object[0]);
            httpURLConnection = (java.net.HttpURLConnection) url2.openConnection();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
