package zu2;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final r45.i33 f557264a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f557265b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f557266c;

    /* renamed from: d, reason: collision with root package name */
    public long f557267d;

    /* renamed from: e, reason: collision with root package name */
    public long f557268e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f557269f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f557270g;

    /* renamed from: h, reason: collision with root package name */
    public final org.json.JSONArray f557271h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f557272i;

    public q(android.app.Activity context, r45.i33 wxaAdInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaAdInfo, "wxaAdInfo");
        this.f557264a = wxaAdInfo;
        this.f557265b = "Finder.WxaAdUIC";
        this.f557269f = kz5.c0.i("dismatch", "duplicate", "quality");
        this.f557270g = "good";
        this.f557271h = new org.json.JSONArray();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("follow", 2008);
        hashMap.put("like", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654));
        hashMap.put("double_like", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46360xe1e64414));
        hashMap.put("big_btn_click", 2025);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f, java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46355x206ed2ef));
        hashMap.put("headimage", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26));
        hashMap.put("nickname", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46353xae58057));
        hashMap.put("forward", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d));
        this.f557272i = hashMap;
    }

    public final void a() {
        this.f557266c = true;
        this.f557267d = c01.id.c();
    }

    public final void b(int i17) {
        java.lang.String str = this.f557265b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reportFeedback");
        if (i17 >= 0) {
            java.util.List list = this.f557269f;
            if (i17 < list.size()) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", list.get(i17));
                    jSONObject.put("expTime", this.f557268e);
                    jSONObject.put("isClickAd", this.f557266c ? 1 : 0);
                    jSONObject.put("clickAdTimeMs", this.f557267d);
                    jSONObject.put("feedbackTimeMs", c01.id.c());
                    this.f557271h.put(jSONObject);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "reportFeedback", new java.lang.Object[0]);
                }
            }
        }
    }

    public final void c() {
        java.lang.String str = this.f557265b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reportFeedback");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", this.f557270g);
            jSONObject.put("expTime", this.f557268e);
            jSONObject.put("isClickAd", this.f557266c ? 1 : 0);
            jSONObject.put("clickAdTimeMs", this.f557267d);
            jSONObject.put("feedbackTimeMs", c01.id.c());
            this.f557271h.put(jSONObject);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "reportFeedbackGood", new java.lang.Object[0]);
        }
    }

    public final void d(java.lang.String str) {
        r45.i33 i33Var = this.f557264a;
        java.lang.String str2 = this.f557265b;
        try {
            java.lang.Object obj = this.f557272i.get(str);
            if (obj == null) {
                obj = -1;
            }
            int intValue = ((java.lang.Number) obj).intValue();
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
            jSONObject.put("click_pos", intValue);
            jSONObject.put("pos_x", 0);
            jSONObject.put("pos_y", 0);
            optJSONObject.put("exp_time", this.f557268e);
            optJSONObject.put("clk_time", c01.id.c());
            jSONObject.put("weapp_extra_data", optJSONObject.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "reportNormalAction source=" + str + " clickPos=" + intValue);
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K().r()).booleanValue()) {
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                new db2.m2(1, jSONObject2, null).l();
            } else {
                java.lang.String jSONObject3 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                gm0.j1.d().g(new db2.w5(1, jSONObject3));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, th6, "reportNormalAction " + str, new java.lang.Object[0]);
        }
    }
}
