package g23;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349430a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f349431b;

    public d() {
        this.f349430a = "";
        this.f349431b = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("searchAdWithYBInnerInput");
        java.lang.String optString = d17.optString("adTitle");
        this.f349430a = optString;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSAskYuanbaoConfig", "get adTitle failed");
        } else {
            d17.optInt("timevalSec", 0);
            this.f349431b = true;
        }
    }
}
