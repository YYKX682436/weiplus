package x44;

/* loaded from: classes4.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.p0 f533389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f533390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(x44.p0 p0Var, android.app.Activity activity) {
        super(2);
        this.f533389d = p0Var;
        this.f533390e = activity;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String phone = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phone, "phone");
        if (intValue == 0) {
            if (phone.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
                x44.p0 p0Var = this.f533389d;
                org.json.JSONObject l17 = p0Var.l();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
                p0Var.b(l17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69787x3c09f1a8(this.f533390e, phone);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
                return f0Var;
            }
        }
        x44.p0 p0Var2 = this.f533389d;
        p0Var2.b(w44.d.k(p0Var2, 600008, "fail:obtain smart phone number failed!", null, 4, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
        return f0Var2;
    }
}
