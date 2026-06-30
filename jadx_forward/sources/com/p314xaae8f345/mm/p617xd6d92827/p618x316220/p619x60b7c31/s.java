package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

/* loaded from: classes.dex */
public final class s implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.t f134711d;

    public s(com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.t tVar) {
        this.f134711d = tVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b c4981x4734804b = (com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b) obj;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        boolean z17 = c4981x4734804b.f134698e;
        com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.t tVar = this.f134711d;
        if (!z17) {
            tVar.s().mo146xb9724478(tVar.i(lc3.x.f399469c));
            return;
        }
        for (com.p314xaae8f345.mm.p617xd6d92827.p620x36f002.C4983x817cf557 c4983x817cf557 : c4981x4734804b.f134697d) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("opcode", c4983x817cf557.f134716d);
            jSONObject.put("aid", c4983x817cf557.f134717e);
            jSONObject.put("slotid", c4983x817cf557.f134718f);
            jSONObject.put("op_time", c4983x817cf557.f134719g);
            jSONObject.put("traceid", c4983x817cf557.f134720h);
            jSONArray.put(jSONObject);
        }
        yz5.l s17 = tVar.s();
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("msgData", jSONArray);
        tVar.m(a0Var);
        s17.mo146xb9724478(a0Var);
    }
}
