package yb1;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f542197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f542198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f542197d = i17;
        this.f542198e = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject optJSONObject;
        java.lang.String params = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPageContentService", "getDocument callbackId:" + this.f542197d + ", params:" + params);
        int i17 = -1;
        try {
            org.json.JSONObject optJSONObject2 = new org.json.JSONObject(params).optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("root")) != null) {
                i17 = optJSONObject.optInt("nodeId", -1);
            }
        } catch (java.lang.Exception unused) {
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) this.f542198e).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(i17)));
        return jz5.f0.f384359a;
    }
}
