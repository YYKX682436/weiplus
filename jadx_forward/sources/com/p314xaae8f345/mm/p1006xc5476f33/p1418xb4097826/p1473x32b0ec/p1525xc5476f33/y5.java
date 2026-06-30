package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class y5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 f196688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f196689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var, org.json.JSONObject jSONObject) {
        super(0);
        this.f196688d = c6Var;
        this.f196689e = jSONObject;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var = this.f196688d;
        qo0.c.a(c6Var.f193649p, qo0.b.A2, null, 2, null);
        org.json.JSONObject optJSONObject = this.f196689e.optJSONObject("params");
        if (!(optJSONObject != null ? optJSONObject.optBoolean("isCancelPromoting", false) : false)) {
            java.lang.String optString = optJSONObject != null ? optJSONObject.optString("toastWording", "") : null;
            if (!(optString == null || optString.length() == 0)) {
                db5.t7.h(c6Var.f446856d.getContext(), optString);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c6Var.f193650q, "toastMsg: " + optString);
            }
        }
        return jz5.f0.f384359a;
    }
}
