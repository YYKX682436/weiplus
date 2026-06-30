package xu2;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f538772a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.i33 f538773b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f538774c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f538775d;

    /* renamed from: e, reason: collision with root package name */
    public long f538776e;

    /* renamed from: f, reason: collision with root package name */
    public long f538777f;

    /* renamed from: g, reason: collision with root package name */
    public long f538778g;

    /* renamed from: h, reason: collision with root package name */
    public long f538779h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f538780i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f538781j;

    /* renamed from: k, reason: collision with root package name */
    public final org.json.JSONArray f538782k;

    public v(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, r45.i33 wxaAdInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaAdInfo, "wxaAdInfo");
        this.f538772a = context;
        this.f538773b = wxaAdInfo;
        this.f538774c = "Finder.FinderLiveAdReporter";
        this.f538780i = kz5.c0.i("dismatch", "duplicate", "quality");
        this.f538781j = "good";
        this.f538782k = new org.json.JSONArray();
    }

    public final void a() {
        this.f538775d = true;
        this.f538776e = c01.id.c();
    }

    public final void b() {
        a();
        c(2020);
    }

    public final void c(int i17) {
        java.lang.String str = this.f538774c;
        r45.i33 i33Var = this.f538773b;
        try {
            java.lang.String m75945x2fec8307 = i33Var.m75945x2fec8307(5);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(m75945x2fec8307);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            jSONObject.put("report_type", 2);
            jSONObject.put("report_link", i33Var.m75945x2fec8307(4));
            jSONObject.put("press_interval", 0);
            jSONObject.put("click_pos", i17);
            jSONObject.put("pos_x", 0);
            jSONObject.put("pos_y", 0);
            optJSONObject.put("exp_time", this.f538777f);
            optJSONObject.put("clk_time", c01.id.c());
            jSONObject.put("weapp_extra_data", optJSONObject.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reportNormalAction " + i17);
            long j17 = this.f538779h;
            long j18 = this.f538778g;
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            new ek2.h0(j17, j18, 1, jSONObject2).l().f(this.f538772a);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "reportNormalAction " + i17, new java.lang.Object[0]);
        }
    }
}
