package x44;

/* loaded from: classes4.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.m2 f533375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(x44.m2 m2Var, java.lang.String str) {
        super(2);
        this.f533375d = m2Var;
        this.f533376e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.util.Map) obj2, "<anonymous parameter 1>");
        if (booleanValue) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("phoneNumber", this.f533376e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
            x44.m2 m2Var = this.f533375d;
            m2Var.m(jSONObject);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
            m2Var.b(jSONObject);
        } else {
            x44.m2 m2Var2 = this.f533375d;
            m2Var2.b(w44.d.k(m2Var2, -1, "user does not allow requiring phone number", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1$1");
        return f0Var;
    }
}
