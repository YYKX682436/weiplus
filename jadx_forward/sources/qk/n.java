package qk;

/* loaded from: classes9.dex */
public class n {
    public java.lang.String A;
    public boolean B;
    public qk.e C;
    public int D;
    public boolean E;
    public java.util.List F;
    public java.lang.String G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f445792d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f445793e;

    /* renamed from: n, reason: collision with root package name */
    public int f445802n;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f445806r;

    /* renamed from: u, reason: collision with root package name */
    public int f445809u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f445810v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f445811w;

    /* renamed from: x, reason: collision with root package name */
    public int f445812x;

    /* renamed from: y, reason: collision with root package name */
    public qk.m f445813y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f445814z;

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f445789a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f445790b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f445791c = false;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f445794f = null;

    /* renamed from: g, reason: collision with root package name */
    public qk.j f445795g = null;

    /* renamed from: h, reason: collision with root package name */
    public qk.i f445796h = null;

    /* renamed from: i, reason: collision with root package name */
    public qk.h f445797i = null;

    /* renamed from: j, reason: collision with root package name */
    public qk.k f445798j = null;

    /* renamed from: k, reason: collision with root package name */
    public qk.g f445799k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f445800l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f445801m = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f445803o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f445804p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f445805q = 0;

    /* renamed from: s, reason: collision with root package name */
    public qk.f f445807s = null;

    /* renamed from: t, reason: collision with root package name */
    public int f445808t = 0;

    public n() {
        l75.e0 e0Var = qk.o.f445831y1;
        this.f445809u = 0;
        this.f445811w = false;
        this.B = false;
    }

    public static qk.n a(java.lang.String str) {
        qk.n nVar = new qk.n();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                java.lang.System.currentTimeMillis();
                nVar.f445789a = new org.json.JSONObject(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        return nVar;
    }

    public qk.e b() {
        org.json.JSONObject jSONObject;
        qk.e eVar;
        if (this.C == null && (jSONObject = this.f445789a) != null) {
            java.lang.String optString = jSONObject.optString("AcctTransferInfo");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                eVar = null;
            } else {
                qk.e eVar2 = new qk.e();
                try {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(optString).optJSONArray("origin_name_list");
                    if (optJSONArray != null) {
                        eVar2.f445620a = new java.util.ArrayList();
                        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                            eVar2.f445620a.add(optJSONArray.optString(i17));
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
                eVar = eVar2;
            }
            this.C = eVar;
        }
        return this.C;
    }

    public qk.h c() {
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && this.f445797i == null) {
            java.lang.String optString = jSONObject.optString("MMBizMenu");
            this.G = optString;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                java.lang.String str = this.G;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "MenuInfo = " + str);
                qk.h hVar = new qk.h();
                if (str != null && str.length() > 0) {
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                        jSONObject2.optInt("update_time");
                        hVar.f445672a = jSONObject2.optInt("type", 0);
                        hVar.f445673b = r01.g0.d(jSONObject2.optJSONArray("button_list"));
                    } catch (org.json.JSONException e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                }
                this.f445797i = hVar;
            }
        }
        return this.f445797i;
    }

    public qk.g d() {
        java.lang.String optString;
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && this.f445799k == null && (optString = jSONObject.optString("EnterpriseBizInfo")) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "EnterpriseBizInfo = ".concat(optString));
            qk.g gVar = new qk.g();
            if (optString.length() > 0) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    gVar.f445649a = jSONObject2.optString("belong");
                    jSONObject2.optString("freeze_wording");
                    gVar.f445650b = jSONObject2.optInt("child_type");
                    gVar.f445651c = jSONObject2.optString("home_url");
                    java.lang.String optString2 = jSONObject2.optString("exattr");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                        gVar.f445652d = null;
                    } else {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString2);
                        gVar.f445652d = jSONObject3.optString("chat_extension_url");
                        gVar.f445653e = jSONObject3.optLong(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
                    }
                } catch (org.json.JSONException e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            this.f445799k = gVar;
        }
        return this.f445799k;
    }

    public qk.f e() {
        java.lang.String optString;
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && this.f445807s == null && (optString = jSONObject.optString("HardwareBizInfo")) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "HardwareBizInfo = ".concat(optString));
            qk.f fVar = new qk.f();
            if (optString.length() > 0) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    fVar.f445632a = jSONObject2.optInt("hardware_flag");
                    fVar.f445633b = jSONObject2.optInt("connect_status_display_mode");
                    fVar.f445634c = jSONObject2.optInt("special_internal_brand_type");
                } catch (org.json.JSONException e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            this.f445807s = fVar;
        }
        return this.f445807s;
    }

    public qk.k f() {
        int length;
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && this.f445798j == null) {
            java.lang.String optString = jSONObject.optString("PayShowInfo");
            qk.k kVar = null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                try {
                    qk.k kVar2 = new qk.k();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    kVar2.f445727a = jSONObject2.optInt("reputation_level", -1);
                    kVar2.f445728b = jSONObject2.optString("scope_of_business");
                    kVar2.f445730d = jSONObject2.optString("guarantee_detail_h5_url");
                    org.json.JSONArray optJSONArray = jSONObject2.optJSONArray("guarantee_info");
                    if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                        kVar2.f445729c = new java.util.ArrayList();
                        for (int i17 = 0; i17 < length; i17++) {
                            java.lang.String string = optJSONArray.getString(i17);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                                ((java.util.ArrayList) kVar2.f445729c).add(string);
                            }
                        }
                    }
                    kVar = kVar2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            this.f445798j = kVar;
        }
        return this.f445798j;
    }

    public qk.i g() {
        qk.i iVar;
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && this.f445796h == null) {
            java.lang.String optString = jSONObject.optString("PersonVerifyInfo");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                iVar = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "biz verify info is [%s]", optString);
                qk.i iVar2 = new qk.i();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    iVar2.f445684a = jSONObject2.optString("VerifyDesc");
                    iVar2.f445685b = jSONObject2.optString("VerifyName");
                    iVar2.f445686c = jSONObject2.optString("VerifyIdentity");
                    iVar2.f445687d = jSONObject2.optString("VerifyDescribe");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "desc[%s] name[%s] identity[%s] describe[%s]", iVar2.f445684a, iVar2.f445685b, iVar2.f445686c, iVar2.f445687d);
                iVar = iVar2;
            }
            this.f445796h = iVar;
        }
        return this.f445796h;
    }

    public java.util.List h() {
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && this.f445794f == null) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("Privilege");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (optJSONArray != null) {
                try {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        qk.l lVar = new qk.l();
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                        lVar.f445744a = optJSONObject.optString("icon");
                        lVar.f445745b = optJSONObject.optString("description");
                        lVar.f445746c = optJSONObject.optString("description_key");
                        linkedList.add(lVar);
                    }
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            this.f445794f = linkedList;
        }
        return this.f445794f;
    }

    public qk.m i() {
        java.lang.String optString;
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && this.f445813y == null && (optString = jSONObject.optString("RegisterSource")) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "RegisterSource = %s", optString);
            qk.m mVar = new qk.m();
            if (optString.length() > 0) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    mVar.f445778a = jSONObject2.optString("RegisterBody");
                    mVar.f445779b = jSONObject2.optString("IntroUrl");
                    boolean z17 = true;
                    if (jSONObject2.optInt("IsClose", 0) != 1) {
                        z17 = false;
                    }
                    mVar.f445780c = z17;
                    mVar.f445781d = jSONObject2.optBoolean("IsOversea", false);
                    mVar.f445782e = jSONObject2.optString("AboutBizUrl");
                } catch (org.json.JSONException e17) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception in RegisterSource:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            this.f445813y = mVar;
        }
        return this.f445813y;
    }

    public int j() {
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null) {
            this.f445805q = jSONObject.optInt("ServiceType", 0);
        }
        return this.f445805q;
    }

    public qk.j k() {
        qk.j jVar;
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && this.f445795g == null) {
            java.lang.String optString = jSONObject.optString("VerifySource");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                jVar = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "biz verify info is [%s]", optString);
                qk.j jVar2 = new qk.j();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    jVar2.f445709a = jSONObject2.optInt("Type");
                    jVar2.f445710b = jSONObject2.optString("Description");
                    jVar2.f445711c = jSONObject2.optString("Name");
                    jVar2.f445712d = jSONObject2.optString("IntroUrl");
                    jVar2.f445713e = jSONObject2.optString("VerifySubTitle");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfo", "type[%d],desc[%s],name[%s],url[%s]", java.lang.Integer.valueOf(jVar2.f445709a), jVar2.f445710b, jVar2.f445711c, jVar2.f445712d);
                jVar = jVar2;
            }
            this.f445795g = jVar;
        }
        return this.f445795g;
    }

    public java.lang.String l() {
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null) {
            this.f445792d = jSONObject.optString("VerifyContactPromptTitle");
        }
        return this.f445792d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List m() {
        /*
            r7 = this;
            java.util.List r0 = r7.F
            if (r0 != 0) goto L80
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.F = r0
            org.json.JSONObject r0 = r7.f445789a
            if (r0 == 0) goto L80
            java.lang.String r1 = "BindWxaInfo"
            java.lang.String r0 = r0.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L22
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22
            r1.<init>(r0)     // Catch: org.json.JSONException -> L22
            goto L23
        L22:
            r1 = r2
        L23:
            if (r1 == 0) goto L2c
            java.lang.String r0 = "wxaEntryInfo"
            org.json.JSONArray r2 = r1.optJSONArray(r0)
        L2c:
            if (r2 == 0) goto L80
            r0 = 0
        L2f:
            int r1 = r2.length()
            if (r0 >= r1) goto L80
            org.json.JSONObject r1 = r2.optJSONObject(r0)
            if (r1 != 0) goto L3c
            goto L7d
        L3c:
            java.lang.String r3 = "username"
            java.lang.String r3 = r1.optString(r3)
            java.lang.String r4 = "title"
            java.lang.String r4 = r1.optString(r4)
            java.lang.String r5 = "title_key"
            java.lang.String r5 = r1.optString(r5)
            java.lang.String r6 = "icon_url"
            java.lang.String r1 = r1.optString(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L5e
            goto L7d
        L5e:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L6b
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L6b
            goto L7d
        L6b:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo r6 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo
            r6.<init>()
            r6.f158962d = r3
            r6.f158963e = r4
            r6.f158964f = r5
            r6.f158965g = r1
            java.util.List r1 = r7.F
            r1.add(r6)
        L7d:
            int r0 = r0 + 1
            goto L2f
        L80:
            java.util.List r0 = r7.F
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.n.m():java.util.List");
    }

    public boolean n() {
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null && jSONObject.optJSONObject("WifiBizInfo") != null && this.f445789a.optJSONObject("WifiBizInfo").optInt("IsWXWiFi") == 1) {
            this.B = true;
        }
        return this.B;
    }

    public boolean o() {
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null) {
            this.f445800l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("ReportLocationType"), 0) > 0;
        }
        return this.f445800l;
    }

    public boolean p() {
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null) {
            this.f445791c = "1".equals(jSONObject.optString("IsShowMember"));
        }
        return this.f445791c;
    }

    public boolean q() {
        org.json.JSONObject jSONObject = this.f445789a;
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("NotifyManage");
            l75.e0 e0Var = qk.o.f445831y1;
            this.f445809u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optString, 0);
        }
        int i17 = this.f445809u;
        l75.e0 e0Var2 = qk.o.f445831y1;
        return i17 == 1;
    }
}
