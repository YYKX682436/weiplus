package g23;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349418b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349419c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f349420d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f349421e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f349422f;

    public a() {
        this.f349417a = "";
        this.f349418b = 0;
        this.f349419c = 0;
        this.f349420d = "";
        this.f349421e = "";
        this.f349422f = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("aiSearch");
        java.lang.String optString = d17.optString("hotword");
        this.f349417a = optString;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSAISearchConfig", "get hotword failed");
            return;
        }
        this.f349420d = d17.optString("extParams", "");
        this.f349421e = d17.optString("navBarParams", "");
        this.f349418b = d17.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.f349419c = d17.optInt("businessType", 0);
        this.f349422f = true;
    }
}
