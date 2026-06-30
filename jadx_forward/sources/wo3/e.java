package wo3;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f529681d;

    /* renamed from: e, reason: collision with root package name */
    public int f529682e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f529683f;

    public e() {
        java.util.HashMap hashMap = new java.util.HashMap();
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, null);
        if (m17 != null) {
            hashMap.put("ack_key", (java.lang.String) m17);
        }
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.System.currentTimeMillis() + "");
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReturnTimeout */
    public long mo48003xd8232e5b() {
        return to3.q.f502507d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1981;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinegetmsg";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(135L, 57L, 1L, true);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(135L, 56L, 1L, true);
        this.f529681d = jSONObject.optString("appmsg");
        this.f529682e = jSONObject.optInt("poll_time") * 1000;
        this.f529683f = jSONObject.optString("ack_key");
        if (this.f529682e > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_INTERVAL_INT, java.lang.Integer.valueOf(this.f529682e));
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, this.f529683f);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: resend */
    public boolean mo8969xc84d8c3b() {
        return false;
    }
}
