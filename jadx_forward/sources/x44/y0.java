package x44;

/* loaded from: classes4.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f533464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x44.a1 f533466f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.app.Activity activity, java.lang.String str, x44.a1 a1Var) {
        super(1);
        this.f533464d = activity;
        this.f533465e = str;
        this.f533466f = a1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat$doAction$1");
        java.lang.String it = (java.lang.String) obj;
        x44.a1 a1Var = this.f533466f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat$doAction$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        try {
            x64.u.f533866a.b(this.f533464d, it, this.f533465e, 10, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
            org.json.JSONObject l17 = a1Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
            a1Var.b(l17);
        } catch (java.lang.Throwable th6) {
            a1Var.b(a1Var.g("there is something error: " + th6.getMessage()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat$doAction$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat$doAction$1");
        return f0Var;
    }
}
