package ey;

/* loaded from: classes11.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey.j f338807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f338808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ey.j jVar, long j17) {
        super(1);
        this.f338807d = jVar;
        this.f338808e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String jSONObject;
        org.json.JSONObject ret = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        try {
            jSONObject = ret.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FunctionCallBaseImpl", "stringify json error " + e17);
            java.lang.String errorMessage = "stringify json error: " + e17.getMessage();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMessage, "errorMessage");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(ya.b.f77504xbb80cbe3, false);
            jSONObject2.put("error_message", errorMessage);
            jSONObject = jSONObject2.toString();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.l lVar = this.f338807d.f338809a;
        if (lVar != null) {
            lVar.k1(this.f338808e, jSONObject);
        }
        return jz5.f0.f384359a;
    }
}
