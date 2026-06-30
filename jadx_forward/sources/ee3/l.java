package ee3;

/* loaded from: classes7.dex */
public class l implements ee3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc3.x0 f333167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ee3.m f333168c;

    public l(ee3.m mVar, java.lang.String str, jc3.x0 x0Var) {
        this.f333168c = mVar;
        this.f333166a = str;
        this.f333167b = x0Var;
    }

    @Override // ee3.e
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.util.Map map) {
        this.f333168c.e(this.f333166a);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("mimeType", str2);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17, str);
        hashMap.put("dataLength", java.lang.Long.valueOf(j17));
        this.f333167b.a(0, "ok", null, null, hashMap, map, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "download success! filename %s, url %s", str, str3);
    }

    @Override // ee3.e
    public void c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "download start! filename %s, url %s", str, str2);
    }

    @Override // ee3.e
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushNetworkCDNDownload", "download error! errorMessage:%s, filename %s, url %s", str3, str, str2);
        this.f333168c.e(this.f333166a);
        this.f333167b.c(i17, str3, null, null);
    }

    @Override // ee3.e
    public void e(java.lang.String str) {
        this.f333168c.f333171c.remove(str);
    }

    @Override // ee3.e
    public void f(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
    }

    @Override // ee3.e
    public void g(org.json.JSONObject jSONObject, int i17) {
    }
}
