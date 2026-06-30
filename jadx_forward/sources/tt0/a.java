package tt0;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f503308a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f503309b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f503310c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f503311d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f503312e;

    /* renamed from: f, reason: collision with root package name */
    public int f503313f;

    /* renamed from: g, reason: collision with root package name */
    public int f503314g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f503315h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f503316i;

    public static tt0.a a(java.lang.String str) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
        tt0.a aVar = new tt0.a();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandNotifyMsgContent", "values map is null.");
            return aVar;
        }
        aVar.f503308a = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.title");
        aVar.f503309b = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.wxa_nickname");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.weapp_pushmsg.op"), 0);
        aVar.f503310c = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.busi_msgid");
        aVar.f503311d = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.username");
        aVar.f503312e = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.appid");
        aVar.f503313f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.type"), 0);
        aVar.f503314g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.version"), 0);
        aVar.f503315h = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.weappiconurl");
        aVar.f503316i = (java.lang.String) d17.get(".sysmsg.weapp_pushmsg.weappinfo.pagepath");
        return aVar;
    }
}
