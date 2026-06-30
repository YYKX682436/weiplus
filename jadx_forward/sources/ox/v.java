package ox;

/* loaded from: classes11.dex */
public final class v implements rv.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv.e3 f431056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f431057b;

    public v(rv.e3 e3Var, l81.b1 b1Var) {
        this.f431056a = e3Var;
        this.f431057b = b1Var;
    }

    @Override // rv.e3
    public final void a(com.p314xaae8f345.p2845xc516c4b6.biz.C23225x7fed2801 c23225x7fed2801, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "launchNewImageEditorWithOpenBundle done, publish result: " + c23225x7fed2801.m85461xce827bcd());
        rv.e3 e3Var = this.f431056a;
        if (e3Var != null) {
            e3Var.a(c23225x7fed2801, jSONObject);
            return;
        }
        android.webkit.ValueCallback valueCallback = this.f431057b.f398570o;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(jSONObject.toString());
        }
    }
}
