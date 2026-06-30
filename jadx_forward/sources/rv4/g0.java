package rv4;

/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f481998a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f481999b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482000c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482001d;

    /* renamed from: e, reason: collision with root package name */
    public final int f482002e;

    /* renamed from: f, reason: collision with root package name */
    public final int f482003f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f482004g = jz5.h.b(rv4.f0.f481997d);

    public g0() {
        this.f481999b = "";
        this.f482000c = "{\"chatbot\":1}";
        this.f482001d = "";
        this.f482002e = 197;
        this.f482003f = 53;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("educationTab");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachWebConfig", "get educationTabConfig: " + d17);
        this.f481998a = d17;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d18 = su4.o2.d("aiSearch");
        jz5.f0 f0Var = null;
        d18 = d18.has("hotword") ? d18 : null;
        if (d18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachWebConfig", "get aiSearchConfig: " + d18);
            java.lang.String optString = d18.optString("hotword", string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            this.f481999b = optString;
            java.lang.String optString2 = d18.optString("extParams", "{\"chatbot\":1}");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            this.f482000c = optString2;
            java.lang.String optString3 = d18.optString("navBarParams");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            this.f482001d = optString3;
            this.f482002e = d18.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 197);
            this.f482003f = d18.optInt("businessType", 0);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            this.f481999b = string;
        }
    }
}
