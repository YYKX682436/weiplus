package g23;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f349423a;

    public b() {
        this.f349423a = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("aiSearchInnerInput");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17.optString("hotword"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSAISearchInnerInputConfig", "get hotword failed");
            return;
        }
        d17.optString("extParams", "");
        d17.optString("navBarParams", "");
        d17.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        d17.optInt("businessType", 0);
        this.f349423a = true;
    }
}
