package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/l;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null || !jSONObject.has("bizName") || !jSONObject.has("bizKey")) {
            this.f224976f.a("Require bizName and bizKey");
            return;
        }
        java.lang.String optString = jSONObject.optString("bizName");
        int i17 = (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "k1kVideo") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, ya.a.f77450x918d59a8)) ? 30 : 27;
        java.lang.String optString2 = jSONObject.optString("bizKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.f66791xc8a07680 = optString2;
        c16601x7ed0e40c.f66793x2262335f = i17;
        this.f224976f.b(kz5.c1.l(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Ri(c16601x7ed0e40c) ? 1 : 0))));
    }
}
