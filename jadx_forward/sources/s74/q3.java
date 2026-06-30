package s74;

/* loaded from: classes4.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f486043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.j3 f486044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f486045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(s74.f3 f3Var, s74.j3 j3Var, org.json.JSONObject jSONObject) {
        super(1);
        this.f486043d = f3Var;
        this.f486044e = j3Var;
        this.f486045f = jSONObject;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createViewAndParams$1");
        java.lang.String it = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createViewAndParams$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        s74.f3 f3Var = this.f486043d;
        f3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findAnimById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        org.json.JSONObject jSONObject = null;
        org.json.JSONArray jSONArray = f3Var.f485803d;
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAnimById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    break;
                }
                java.lang.Object obj2 = jSONArray.get(i17);
                org.json.JSONObject jSONObject2 = obj2 instanceof org.json.JSONObject ? (org.json.JSONObject) obj2 : null;
                java.lang.String optString = jSONObject2 != null ? jSONObject2.optString("animationId") : null;
                if (optString == null) {
                    optString = "";
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it, optString)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAnimById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    jSONObject = jSONObject2;
                    break;
                }
                i17++;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAnimById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        }
        if (jSONObject != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            java.util.List list = f3Var.V;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewAnimations", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            ((java.util.ArrayList) list).add(new s74.a1(this.f486044e.c(), jSONObject, this.f486045f, f3Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createViewAndParams$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createViewAndParams$1");
        return f0Var;
    }
}
