package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes.dex */
public class e implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f163070b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.f fVar, int i17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f163069a = i17;
        this.f163070b = rVar;
    }

    @Override // q80.a0
    /* renamed from: onStoreSendResult */
    public void mo51023x884ffda7(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f163070b;
        if (this.f163069a == i17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(this);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", str2);
                jSONObject.put("result", obj);
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject.toString()));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDispatchLiteAppAction", "onStoreSendResult JSONException: %s", e17.toString());
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("{\"type\": \"error\"}"));
            }
        }
    }

    @Override // q80.a0
    /* renamed from: onStoreSetData */
    public void mo51024x295aba8a(java.lang.String str, java.util.Map map) {
    }
}
