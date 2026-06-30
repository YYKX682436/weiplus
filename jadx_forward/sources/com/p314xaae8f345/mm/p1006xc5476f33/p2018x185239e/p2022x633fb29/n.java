package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238434d;

    /* renamed from: e, reason: collision with root package name */
    public r45.yo f238435e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238436f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e f238437g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.f f238438h;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f238440m;

    /* renamed from: o, reason: collision with root package name */
    public final int f238442o;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238439i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238441n = false;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.f fVar) {
        this.f238440m = "";
        this.f238442o = 0;
        this.f238440m = java.lang.System.currentTimeMillis() + "" + mVar.f238416b;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        this.f238442o = mVar.f238416b;
        lVar.f152197a = new r45.xo();
        lVar.f152198b = new r45.yo();
        lVar.f152200d = 2677;
        lVar.f152199c = "/cgi-bin/mmpay-bin/busif2fgetfavor";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238434d = a17;
        r45.xo xoVar = (r45.xo) a17.f152243a.f152217a;
        xoVar.f471809d = mVar.f238416b;
        xoVar.f471810e = mVar.f238417c;
        xoVar.f471811f = mVar.f238418d;
        xoVar.f471812g = mVar.f238419e;
        xoVar.f471813h = mVar.f238420f;
        xoVar.f471814i = mVar.f238421g;
        xoVar.f471815m = mVar.f238422h;
        xoVar.f471816n = mVar.f238423i;
        xoVar.f471817o = mVar.f238424j;
        xoVar.f471818p = mVar.f238425k;
        xoVar.f471819q = mVar.f238415a;
        xoVar.f471820r = mVar.f238426l;
        this.f238437g = eVar;
        this.f238438h = fVar;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(java.lang.String.format("request.amount %s", java.lang.Integer.valueOf(xoVar.f471809d)));
        stringBuffer.append(java.lang.String.format("request.channel %s", java.lang.Integer.valueOf(xoVar.f471810e)));
        stringBuffer.append(java.lang.String.format("request.scan_scene %s", java.lang.Integer.valueOf(xoVar.f471811f)));
        stringBuffer.append(java.lang.String.format("request.receiver_desc %s", xoVar.f471812g));
        stringBuffer.append(java.lang.String.format("request.mch_name %s", xoVar.f471813h));
        stringBuffer.append(java.lang.String.format("request.favor_req_sign %s", xoVar.f471814i));
        stringBuffer.append(java.lang.String.format("request.receiver_openid %s", xoVar.f471815m));
        stringBuffer.append(java.lang.String.format("request.receiver_username %s", xoVar.f471816n));
        stringBuffer.append(java.lang.String.format("request.favor_req_extend %s", xoVar.f471817o));
        stringBuffer.append(java.lang.String.format("request.fail_click_cell %s", java.lang.Integer.valueOf(xoVar.f471818p)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fGetFavor", "NetSceneBusiF2fGetFavor req %s", stringBuffer.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238436f = u0Var;
        return mo9409x10f9447a(sVar, this.f238434d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2677;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fGetFavor", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.yo yoVar = (r45.yo) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238435e = yoVar;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(yoVar.f472780d);
        r45.yo yoVar2 = this.f238435e;
        objArr[1] = yoVar2.f472781e;
        r45.wo woVar = yoVar2.f472782f;
        if (woVar == null) {
            jSONObject = new org.json.JSONObject();
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("favor_info_list", com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a.a(woVar.f470859d, new r45.vq0()));
                java.util.LinkedList linkedList = woVar.f470860e;
                new r45.uq0();
                if (linkedList == null) {
                    jSONArray = new org.json.JSONArray();
                } else {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    try {
                        java.util.Iterator it = linkedList.iterator();
                        int i27 = 0;
                        while (it.hasNext()) {
                            jSONArray2.put(i27, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a.c((r45.uq0) it.next()));
                            i27++;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
                    }
                    jSONArray = jSONArray2;
                }
                jSONObject2.put("favor_compose_result_list", jSONArray);
                jSONObject2.put("default_fav_compose_id", woVar.f470861f);
                jSONObject2.put("favor_resp_sign", woVar.f470862g);
                jSONObject2.put("no_compose_wording", woVar.f470863h);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiF2FFavorHelper", e18, "", new java.lang.Object[0]);
            }
            jSONObject = jSONObject2;
        }
        objArr[2] = jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fGetFavor", "ret_code: %s, ret_msg: %s favor_comm_resp : %s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238436f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
