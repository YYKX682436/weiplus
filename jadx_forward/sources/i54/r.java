package i54;

/* loaded from: classes.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h54.d f370350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h54.d dVar) {
        super(2);
        this.f370350d = dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber$doAction$1");
        ((java.lang.Boolean) obj).booleanValue();
        java.util.Map v17 = (java.util.Map) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber$doAction$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object obj3 = v17.get("err_msg");
        if (obj3 == null || (str = obj3.toString()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toMapWithoutNullValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (v17.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toMapWithoutNullValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        } else {
            for (java.util.Map.Entry entry : v17.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if ((str2.length() > 0) && value != null) {
                    linkedHashMap.put(str2, value);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toMapWithoutNullValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        }
        this.f370350d.a(str, linkedHashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber$doAction$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber$doAction$1");
        return f0Var;
    }
}
