package x44;

/* loaded from: classes4.dex */
public final class s2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.t2 f533420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f533421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533422f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(x44.t2 t2Var, ca4.b0 b0Var, java.lang.String str) {
        super(2);
        this.f533420d = t2Var;
        this.f533421e = b0Var;
        this.f533422f = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$work$2");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String path = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$work$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (intValue != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ScanQRCode", "download qr file failed!!!");
            x44.t2 t2Var = this.f533420d;
            t2Var.b(w44.d.k(t2Var, -1, "scan qr failed!", null, 4, null));
        } else {
            this.f533421e.k(path, this.f533422f, x44.r2.f533417a);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
            x44.t2 t2Var2 = this.f533420d;
            org.json.JSONObject l17 = t2Var2.l();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
            t2Var2.b(l17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$work$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$work$2");
        return f0Var;
    }
}
