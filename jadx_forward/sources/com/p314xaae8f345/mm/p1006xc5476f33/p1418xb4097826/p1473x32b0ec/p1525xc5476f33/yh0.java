package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yh0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f196732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 f196733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh0(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var) {
        super(0);
        this.f196732d = jSONObject;
        this.f196733e = ai0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject optJSONObject = this.f196732d.optJSONObject("params");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("beforeLiveToast", "") : null;
        if (!(optString == null || optString.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var = this.f196733e;
            db5.t7.m(ai0Var.f446856d.getContext(), optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ai0Var.f193422q, "toastMsg: " + optString);
        }
        return jz5.f0.f384359a;
    }
}
