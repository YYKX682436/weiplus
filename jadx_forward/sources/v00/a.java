package v00;

/* loaded from: classes.dex */
public final class a implements c00.x2 {

    /* renamed from: a, reason: collision with root package name */
    public final f10.a f513726a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f513727b;

    public a(f10.a ecsEventAction, org.json.JSONObject eccEventParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ecsEventAction, "ecsEventAction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eccEventParam, "eccEventParam");
        this.f513726a = ecsEventAction;
        this.f513727b = eccEventParam;
    }

    public java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f513726a.getClass();
        jSONObject.put("action", "EcsEventActionShareDialogHandle");
        jSONObject.put("params", this.f513727b);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
