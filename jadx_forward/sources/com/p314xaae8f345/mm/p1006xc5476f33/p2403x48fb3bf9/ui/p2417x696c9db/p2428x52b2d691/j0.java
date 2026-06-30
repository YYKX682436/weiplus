package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class j0 implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267799b;

    public j0(int i17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f267798a = i17;
        this.f267799b = rVar;
    }

    @Override // q80.a0
    /* renamed from: onStoreSendResult */
    public void mo51023x884ffda7(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        if (i17 == this.f267798a) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(this);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("err_msg", "dispatchLiteAppAction:ok");
            if (str2 == null) {
                str2 = "type";
            }
            jSONObject.put("type", str2);
            jSONObject.put("result", obj);
            com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267799b;
            if (rVar != null) {
                rVar.a(jSONObject.toString());
            }
        }
    }

    @Override // q80.a0
    /* renamed from: onStoreSetData */
    public void mo51024x295aba8a(java.lang.String str, java.util.Map map) {
    }
}
