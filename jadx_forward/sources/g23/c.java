package g23;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349426c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f349427d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f349428e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f349429f;

    public c() {
        this.f349424a = "";
        this.f349425b = 0;
        this.f349426c = 0;
        this.f349427d = "";
        this.f349428e = "";
        this.f349429f = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("aiSearchWithYBInnerInput");
        java.lang.String optString = d17.optString("hotword");
        this.f349424a = optString;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSAISearchWithYBInnerInputConfig", "get hotword failed");
            return;
        }
        this.f349427d = d17.optString("extParams", "");
        this.f349428e = d17.optString("navBarParams", "");
        this.f349425b = d17.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.f349426c = d17.optInt("businessType", 0);
        d17.optInt("timevalSec", 0);
        this.f349429f = true;
    }
}
