package x44;

/* loaded from: classes4.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w44.b f533425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f533429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533430i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533432n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533433o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x44.v0 f533434p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w44.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, x44.v0 v0Var) {
        super(2);
        this.f533425d = bVar;
        this.f533426e = str;
        this.f533427f = str2;
        this.f533428g = str3;
        this.f533429h = i17;
        this.f533430i = str4;
        this.f533431m = str5;
        this.f533432n = str6;
        this.f533433o = str7;
        this.f533434p = v0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat$doAction$2");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String subBizName = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat$doAction$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subBizName, "subBizName");
        if (intValue == 0) {
            x44.y2 y2Var = x44.y2.f533469a;
            android.app.Activity a17 = this.f533425d.a();
            java.lang.String username = this.f533426e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "$username");
            java.lang.String appId = this.f533427f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "$appId");
            java.lang.String sessionFrom = this.f533428g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sessionFrom, "$sessionFrom");
            int i17 = this.f533429h;
            java.lang.String sendMessageTitle = this.f533430i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sendMessageTitle, "$sendMessageTitle");
            java.lang.String sendMessagePath = this.f533431m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sendMessagePath, "$sendMessagePath");
            java.lang.String sendMessageImg = this.f533432n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sendMessageImg, "$sendMessageImg");
            y2Var.a(a17, username, appId, sessionFrom, i17, sendMessageTitle, sendMessagePath, sendMessageImg, this.f533433o, subBizName);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
            x44.v0 v0Var = this.f533434p;
            org.json.JSONObject l17 = v0Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
            v0Var.b(l17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ServiceChat", "the service chat code is " + intValue);
            x44.v0 v0Var2 = this.f533434p;
            v0Var2.b(w44.d.k(v0Var2, 300001, ": the service chat error code is " + intValue, null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat$doAction$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat$doAction$2");
        return f0Var;
    }
}
