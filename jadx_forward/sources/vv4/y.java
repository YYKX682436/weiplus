package vv4;

/* loaded from: classes.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75) {
        super(0);
        this.f522053d = activityC19216xc2476b75;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject;
        java.lang.String stringExtra = this.f522053d.getIntent().getStringExtra("reuse_image_info");
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            jSONObject = new org.json.JSONObject(stringExtra);
        } catch (org.json.JSONException unused) {
            jSONObject = new org.json.JSONObject();
        }
        return d75.b.e(jSONObject, vv4.x.f522051d);
    }
}
