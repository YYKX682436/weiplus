package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class a6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f193345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 f193346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var) {
        super(0);
        this.f193345d = jSONObject;
        this.f193346e = c6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject optJSONObject = this.f193345d.optJSONObject("params");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("beforeLiveToast", "") : null;
        if (!(optString == null || optString.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var = this.f193346e;
            db5.t7.m(c6Var.f446856d.getContext(), optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c6Var.f193650q, "toastMsg: " + optString);
        }
        return jz5.f0.f384359a;
    }
}
