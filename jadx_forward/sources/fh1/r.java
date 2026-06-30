package fh1;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344124f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fh1.z zVar, java.lang.String str, int i17) {
        super(0);
        this.f344122d = zVar;
        this.f344123e = str;
        this.f344124f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fh1.x0 a17 = this.f344122d.a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, this.f344123e);
        jSONObject.put("frameId", this.f344124f);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        a17.G1("onMessageFromMiniprogram", jSONObject2);
        return jz5.f0.f384359a;
    }
}
