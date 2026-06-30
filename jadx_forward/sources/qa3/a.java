package qa3;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f442568a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442569b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f442570c;

    /* renamed from: d, reason: collision with root package name */
    public final long f442571d;

    public a(java.lang.String cmd, org.json.JSONObject jsonObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        this.f442568a = jsonObject;
        this.f442569b = "LiteAppTestCMD";
        this.f442570c = "appId";
        this.f442571d = jsonObject.has("timer") ? jsonObject.getLong("timer") : 0L;
    }

    public abstract void a(java.util.concurrent.CountDownLatch countDownLatch);

    /* renamed from: toString */
    public java.lang.String m159670x9616526c() {
        java.lang.String jSONObject = this.f442568a.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
