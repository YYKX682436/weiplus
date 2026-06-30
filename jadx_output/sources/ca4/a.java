package ca4;

/* loaded from: classes4.dex */
public final class a implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f39812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39814c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f39815d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f39816e;

    public a(java.lang.String uxInfo, int i17, int i18, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        this.f39812a = uxInfo;
        this.f39813b = i17;
        this.f39814c = i18;
        this.f39815d = num;
        this.f39816e = num2;
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.data.AdActTypeData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.data.AdActTypeData");
        return "sns_ad_common_report";
    }

    @Override // a84.r0
    public java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.data.AdActTypeData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("uxinfo", this.f39812a);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f39813b);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("act_type", this.f39814c);
        java.lang.Integer num = this.f39816e;
        jSONObject2.put("act_cnt", num != null ? num.intValue() : 1);
        jSONObject2.put("tag", "clk");
        java.lang.Integer num2 = this.f39815d;
        if (num2 != null) {
            num2.intValue();
            jSONObject2.put("act_val", num2.intValue());
        }
        jSONArray.put(jSONObject2);
        jSONObject.put("ad_trace_msg", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.data.AdActTypeData");
        return jSONObject3;
    }

    public /* synthetic */ a(java.lang.String str, int i17, int i18, java.lang.Integer num, java.lang.Integer num2, int i19, kotlin.jvm.internal.i iVar) {
        this(str, i17, i18, (i19 & 8) != 0 ? null : num, (i19 & 16) != 0 ? null : num2);
    }
}
