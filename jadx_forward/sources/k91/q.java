package k91;

/* loaded from: classes7.dex */
public abstract class q {

    /* renamed from: r, reason: collision with root package name */
    public static final k91.q f387243r = new k91.p();

    /* renamed from: s, reason: collision with root package name */
    public static final org.json.JSONObject f387244s = new org.json.JSONObject();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f387245a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f387246b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f387247c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f387248d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f387249e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f387250f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f387251g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f387252h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f387253i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f387254j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f387255k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f387256l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f387257m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f387258n;

    /* renamed from: o, reason: collision with root package name */
    public final k91.k f387259o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f387260p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f387261q;

    public q(k91.b bVar) {
        this.f387245a = null;
        this.f387246b = null;
        this.f387247c = "default";
        this.f387248d = "#000000";
        this.f387249e = null;
        this.f387250f = false;
        this.f387251g = null;
        this.f387252h = null;
        this.f387253i = false;
        this.f387254j = false;
        this.f387255k = false;
        this.f387256l = null;
        this.f387257m = null;
        this.f387259o = new k91.k();
        this.f387260p = null;
        this.f387261q = false;
        this.f387258n = "";
    }

    public boolean a() {
        return "custom".equalsIgnoreCase(this.f387247c) || u46.l.c("skyline", this.f387258n);
    }

    public q(org.json.JSONObject jSONObject, k91.q qVar, boolean z17) {
        qVar = qVar == null ? f387243r : qVar;
        org.json.JSONObject jSONObject2 = f387244s;
        jSONObject = jSONObject == null ? jSONObject2 : jSONObject;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("window");
        optJSONObject = optJSONObject == null ? jSONObject2 : optJSONObject;
        this.f387245a = optJSONObject.optString("navigationBarTitleText", qVar.f387245a);
        this.f387246b = optJSONObject.optString("navigationBarTextStyle", qVar.f387246b);
        this.f387247c = z17 ? "custom" : optJSONObject.optString("navigationStyle", qVar.f387247c);
        this.f387248d = optJSONObject.optString("navigationBarBackgroundColor", qVar.f387248d);
        this.f387251g = optJSONObject.optString("backgroundColor", qVar.f387251g);
        this.f387252h = optJSONObject.optString("backgroundColorContent", qVar.f387252h);
        this.f387254j = optJSONObject.optBoolean("enablePullDownRefresh", qVar.f387254j);
        this.f387256l = optJSONObject.optString("backgroundTextStyle", qVar.f387256l);
        this.f387253i = optJSONObject.optBoolean("enableFullScreen", qVar.f387253i);
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("navigationBarRightButton");
        jSONObject2 = optJSONObject2 != null ? optJSONObject2 : jSONObject2;
        this.f387255k = optJSONObject.optBoolean("disableSwipeBack", qVar.f387255k);
        this.f387250f = jSONObject2.optBoolean("hide", qVar.f387250f);
        this.f387249e = jSONObject2.optString("customButtonIconData", qVar.f387249e);
        this.f387257m = optJSONObject.optString("pageOrientation", qVar.f387257m);
        org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("singlePage");
        optJSONObject3 = optJSONObject3 == null ? jSONObject.optJSONObject("singlePage") : optJSONObject3;
        k91.k kVar = new k91.k();
        if (optJSONObject3 != null) {
            kVar.f387185a = optJSONObject3.optString("navigationBarFit", null);
            kVar.f387186b = optJSONObject3.optString("navigationBarBackgroundColor", "");
            kVar.f387187c = optJSONObject3.optDouble("navigationBarBackgroundAlpha", -1.0d);
            kVar.f387188d = optJSONObject3.optString("navigationBarTextStyle", "");
            kVar.f387189e = optJSONObject3.optString("navigationBarTitleText", "");
        }
        this.f387259o = kVar;
        optJSONObject.optBoolean("resizable", false);
        this.f387260p = optJSONObject.optString("visualEffectInBackground", qVar.f387260p);
        this.f387258n = optJSONObject.optString("renderer", "");
        this.f387261q = optJSONObject.optBoolean("homeButton", qVar.f387261q);
    }
}
