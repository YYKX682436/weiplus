package ss4;

/* loaded from: classes9.dex */
public class k0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493608d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f493609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f493610f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f493611g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f493612h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f493613i;

    /* renamed from: m, reason: collision with root package name */
    public int f493614m;

    /* renamed from: n, reason: collision with root package name */
    public int f493615n;

    /* renamed from: o, reason: collision with root package name */
    public long f493616o;

    /* renamed from: p, reason: collision with root package name */
    public ss4.j0 f493617p = null;

    public k0() {
        m83032xb4c13117(null);
    }

    public static boolean H(boolean z17, np5.b0 b0Var, ss4.j0 j0Var) {
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_EXPIRE_TIME_LONG, 0L)).longValue();
        if (!z17 && longValue >= java.lang.System.currentTimeMillis()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTransferWording", "do scene: %d, force: %B", java.lang.Long.valueOf(longValue), java.lang.Boolean.valueOf(z17));
        ss4.k0 k0Var = new ss4.k0();
        k0Var.f493617p = j0Var;
        if (b0Var != null) {
            b0Var.d(k0Var, false);
            return true;
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.g(k0Var);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1992;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/gettransferwording";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: isBlock */
    public boolean mo8970x7a807183() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTransferWording", "errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        this.f493608d = jSONObject.optString("delay_confirm_wording");
        this.f493609e = jSONObject.optString("delay_confirm_switch_wording");
        this.f493610f = jSONObject.optString("delay_confirm_switch_remind_wording");
        this.f493611g = jSONObject.optString("delay_confirm_switch_remind_half_page_wording");
        this.f493612h = jSONObject.optString("delay_confirm_desc_url");
        this.f493614m = jSONObject.optInt("delay_confirm_desc_url_flag", 0);
        this.f493616o = jSONObject.optLong("expire_time", 0L) * 1000;
        this.f493615n = jSONObject.optInt("delay_confirm_switch_flag", 0);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f493608d)) {
            c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_CONFIRM_WORDING_STRING, this.f493608d);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f493609e)) {
            c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_SWITCH_WORDING_STRING, this.f493609e);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f493610f)) {
            c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_REMIND_WORDING_STRING, this.f493610f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f493611g)) {
            c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_HALF_PAGE_WORDING_STRING, this.f493611g);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f493612h)) {
            try {
                java.lang.String decode = java.net.URLDecoder.decode(this.f493612h, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                this.f493613i = decode;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(decode)) {
                    c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, this.f493613i);
                }
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTransferWording", e17, "", new java.lang.Object[0]);
            }
        }
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, java.lang.Integer.valueOf(this.f493614m));
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_EXPIRE_TIME_LONG, java.lang.Long.valueOf(this.f493616o));
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_SHOW_SWITCH_FLAG_INT, java.lang.Integer.valueOf(this.f493615n));
        ss4.j0 j0Var = this.f493617p;
        if (j0Var != null) {
            j0Var.a();
        }
    }
}
