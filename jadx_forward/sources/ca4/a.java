package ca4;

/* loaded from: classes4.dex */
public final class a implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f121345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121347c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f121348d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f121349e;

    public a(java.lang.String uxInfo, int i17, int i18, java.lang.Integer num, java.lang.Integer num2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        this.f121345a = uxInfo;
        this.f121346b = i17;
        this.f121347c = i18;
        this.f121348d = num;
        this.f121349e = num2;
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.data.AdActTypeData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.data.AdActTypeData");
        return "sns_ad_common_report";
    }

    @Override // a84.r0
    public java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.data.AdActTypeData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("uxinfo", this.f121345a);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f121346b);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("act_type", this.f121347c);
        java.lang.Integer num = this.f121349e;
        jSONObject2.put("act_cnt", num != null ? num.intValue() : 1);
        jSONObject2.put("tag", "clk");
        java.lang.Integer num2 = this.f121348d;
        if (num2 != null) {
            num2.intValue();
            jSONObject2.put("act_val", num2.intValue());
        }
        jSONArray.put(jSONObject2);
        jSONObject.put("ad_trace_msg", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.data.AdActTypeData");
        return jSONObject3;
    }

    public /* synthetic */ a(java.lang.String str, int i17, int i18, java.lang.Integer num, java.lang.Integer num2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, i18, (i19 & 8) != 0 ? null : num, (i19 & 16) != 0 ? null : num2);
    }
}
