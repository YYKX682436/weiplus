package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f162505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f162508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f162509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d f162510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f162511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h f162512h;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, java.lang.String str, org.json.JSONObject jSONObject, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d dVar, org.json.JSONObject jSONObject2) {
        this.f162512h = hVar;
        this.f162505a = yVar;
        this.f162506b = i17;
        this.f162507c = str;
        this.f162508d = jSONObject;
        this.f162509e = i18;
        this.f162510f = dVar;
        this.f162511g = jSONObject2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0
    public void a(int i17, java.lang.String str, boolean z17, r45.bl blVar, r45.j14 j14Var) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h hVar = this.f162512h;
        hVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.m(hVar));
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(j14Var != null ? j14Var.f459026f : 0);
        objArr[3] = j14Var != null ? j14Var.f459025e : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram fail, CGI errCode:%d, errMsg:%s, backendErrno:%d, backendErrmsg:%s", objArr);
        int i18 = this.f162506b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f162505a;
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:cgi failed for network issues" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            try {
                jSONObject.put("errno", 108);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i18, hVar.u(str2, jSONObject));
            return;
        }
        if (j14Var == null || android.text.TextUtils.isEmpty(j14Var.f459025e)) {
            hVar.D(yVar, i18, -2, "fail CGI error");
            return;
        }
        int i19 = j14Var.f459026f;
        java.lang.String str5 = j14Var.f459025e;
        java.util.Map singletonMap = java.util.Collections.singletonMap("errCode", java.lang.Integer.valueOf(j14Var.f459024d));
        str2 = str5 != null ? str5 : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!(singletonMap instanceof java.util.HashMap)) {
            singletonMap = singletonMap == null ? new java.util.HashMap() : new java.util.HashMap(singletonMap);
        }
        singletonMap.put("errno", java.lang.Integer.valueOf(i19));
        yVar.a(i18, hVar.t(str2, singletonMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0
    public void b(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, r45.bl blVar) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h hVar = this.f162512h;
        hVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.m(hVar));
        if (hVar.f162487g) {
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f162505a;
        final int i17 = this.f162506b;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram, invalid businessType");
            hVar.D(yVar, i17, -4, "fail invalid businessType");
            return;
        }
        if (!z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.y.f162534c.c(yVar, str, this.f162509e, str2, this.f162510f, this.f162511g, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.j(this, str, str2, z17));
            return;
        }
        java.lang.String str3 = str2.split(java.util.regex.Pattern.quote("?"))[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12098x43491e41 c12098x43491e41 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12098x43491e41();
        c12098x43491e41.f162434d = blVar.f452362d;
        c12098x43491e41.f162435e = blVar.f452363e;
        c12098x43491e41.f162436f = blVar.f452364f;
        c12098x43491e41.f162437g = blVar.f452365g;
        c12098x43491e41.f162438h = blVar.f452366h;
        c12098x43491e41.f162439i = blVar.f452367i;
        c12098x43491e41.f162440m = blVar.f452368m;
        c12098x43491e41.f162441n = blVar.f452369n;
        c12098x43491e41.f162442o = blVar.f452370o;
        c12098x43491e41.f162443p = blVar.f452371p;
        c12098x43491e41.f162444q = blVar.f452372q;
        c12098x43491e41.f162445r = blVar.f452373r;
        c12098x43491e41.f162446s = this.f162507c;
        c12098x43491e41.f162447t = str;
        c12098x43491e41.f162448u = str3;
        c12098x43491e41.f162449v = yVar.mo48798x74292566();
        c12098x43491e41.f162450w = this.f162508d.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.h$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
            /* renamed from: onReceiveResult */
            public final void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
                java.lang.String str4;
                java.lang.String str5;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b c12099xe9665e2b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b) abstractC11888x1a859600;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h hVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h.this;
                hVar2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = yVar;
                int i18 = i17;
                if (c12099xe9665e2b == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBusinessView", "onReceiveResult get NULL result");
                    str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str5 = str4 != null ? str4 : "";
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("errno", 4);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    yVar2.a(i18, hVar2.u(str5, jSONObject));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBusinessView", "onReceiveResult result:" + c12099xe9665e2b.f162452e + " data:" + c12099xe9665e2b.f162451d);
                jc1.d dVar = new jc1.d(c12099xe9665e2b.f162451d, c12099xe9665e2b.f162452e);
                if (c12099xe9665e2b.f162453f == null) {
                    yVar2.a(i18, hVar2.r(null, dVar, null));
                    return;
                }
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, c12099xe9665e2b.f162453f);
                    yVar2.a(i18, hVar2.r(null, dVar, jSONObject2));
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBusinessView", "onReceiveResult json exception: ", e18);
                    str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str5 = str4 != null ? str4 : "";
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 4);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    yVar2.a(i18, hVar2.u(str5, jSONObject3));
                }
            }
        };
        android.content.Context f229340d = yVar.getF229340d();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12098x43491e41, uVar, null);
    }
}
