package ys4;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f546755d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f546756e;

    /* renamed from: f, reason: collision with root package name */
    public final long f546757f = 10;

    /* renamed from: g, reason: collision with root package name */
    public boolean f546758g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 f546759h;

    /* renamed from: i, reason: collision with root package name */
    public r45.lm3 f546760i;

    public e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetRealnameWording", "NetSceneGetRealnameWording call: %s", str);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.km3 km3Var = new r45.km3();
        km3Var.f460351d = at4.g0.c();
        km3Var.f460353f = str;
        if (!h45.y.c()) {
            km3Var.f460352e = h45.y.f360501a;
        }
        lVar.f152197a = km3Var;
        lVar.f152198b = new r45.lm3();
        lVar.f152199c = "/cgi-bin/mmpay-bin/getrealnamewording";
        lVar.f152200d = 1666;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f546756e = a17;
        a17.m47986x306cfea3(true);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f546755d = u0Var;
        rp3.c.a().getClass();
        return mo9409x10f9447a(sVar, this.f546756e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1666;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetRealnameWording", "onGYNetEnd,errType=" + i18 + "errCode=" + i19);
        if (i18 == 0 && i19 == 0) {
            r45.lm3 lm3Var = (r45.lm3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            this.f546760i = lm3Var;
            long j17 = lm3Var.f461142p;
            if (j17 <= 0) {
                j17 = this.f546757f;
            }
            boolean z17 = lm3Var.f461152z;
            this.f546758g = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetRealnameWording", "need_agree_duty %s", java.lang.Boolean.valueOf(z17));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("bindcardTitle", lm3Var.f461135f);
                jSONObject.put("bindcardSubTitle", lm3Var.f461136g);
                jSONObject.put("bindIdTitle", lm3Var.f461137h);
                jSONObject.put("bindIdSubTitle", lm3Var.f461138i);
                jSONObject.put("extral_wording", lm3Var.f461139m);
                jSONObject.put("question_answer_switch", lm3Var.f461140n);
                jSONObject.put("question_answer_url", lm3Var.f461141o);
                jSONObject.put("cache_time", j17);
                jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                jSONObject.put("isShowBindCard", lm3Var.f461143q);
                jSONObject.put("isShowBindCardVerify", lm3Var.f461145s);
                jSONObject.put("isShowBindId", lm3Var.f461144r);
                jSONObject.put("bindCardVerifyTitle", lm3Var.f461146t);
                jSONObject.put("bindCardVerifySubtitle", lm3Var.f461147u);
                jSONObject.put("bindCardVerifyAlertViewRightBtnTxt", lm3Var.f461148v);
                jSONObject.put("bindCardVerifyAlertViewContent", lm3Var.f461149w);
                jSONObject.put("isShowBindCardVerifyAlertView", lm3Var.f461150x);
                java.util.LinkedList linkedList = lm3Var.f461151y;
                if (linkedList != null && linkedList.size() > 0) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    java.util.Iterator it = linkedList.iterator();
                    boolean z18 = false;
                    while (it.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it.next();
                        if (z18) {
                            stringBuffer.append("\n");
                        }
                        stringBuffer.append(str2);
                        z18 = true;
                    }
                    jSONObject.put("cache_header_titles", stringBuffer.toString());
                }
                jSONObject.put("isShowCapitalSecurity", lm3Var.B);
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_SWITCH_WORDING_STRING_SYNC, jSONObject.toString());
                this.f546759h = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0.d(lm3Var.A);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetRealnameWording", e17, "", new java.lang.Object[0]);
            }
        }
        this.f546755d.mo815x76e0bfae(i18, i19, str, this);
    }
}
