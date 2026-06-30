package s74;

/* loaded from: classes4.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f485764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f485765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f485766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(org.json.JSONObject jSONObject, java.util.List list, s74.f3 f3Var) {
        super(1);
        this.f485764d = jSONObject;
        this.f485765e = list;
        this.f485766f = f3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.optString("position"), "absolute")) {
            org.json.JSONObject jSONObject = this.f485764d;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject, it)) {
                this.f485765e.add(it);
                s74.f3 f3Var = this.f485766f;
                f3Var.l(jSONObject);
                f3Var.l(it);
                f3Var.b(it);
                z17 = true;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
                return valueOf;
            }
        }
        z17 = false;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext$genAbsoluteChildren$1");
        return valueOf2;
    }
}
