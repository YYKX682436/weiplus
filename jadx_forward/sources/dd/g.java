package dd;

/* loaded from: classes9.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd.e f310410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bd.e eVar) {
        super(2);
        this.f310410d = eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeixinPayService.JumpRemindImpl", "jumpRemind continueCallback, isAgree: " + booleanValue + ", path: " + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", "continue");
        jSONObject.put("isAgree", booleanValue);
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str);
        this.f310410d.a(dd.d.f310404a.i(jSONObject, "ok"), false, false);
        return jz5.f0.f384359a;
    }
}
