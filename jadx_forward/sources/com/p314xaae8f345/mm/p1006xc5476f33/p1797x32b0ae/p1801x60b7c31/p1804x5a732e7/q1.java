package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/q1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class q1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [jz5.f0] */
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("productId");
            java.lang.String optString2 = jSONObject.optString("priceNumber");
            java.lang.String optString3 = jSONObject.optString("priceType");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (!(optString.length() == 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                if (!(optString2.length() == 0)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                    if (!(optString3.length() == 0)) {
                        int optInt = jSONObject.optInt("rewardScene", 1);
                        int optInt2 = jSONObject.optInt("entranceScene", 0);
                        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class)) != null) {
                            android.content.Context c17 = c();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p1(optString, this);
                            d22.a aVar = new d22.a(optString, optString2, optString3, optInt, optInt2);
                            aVar.f307355f = c17;
                            aVar.f307356g = p1Var;
                            d22.a0 a0Var = new d22.a0(aVar);
                            r45.uj0 uj0Var = new r45.uj0();
                            d22.a aVar2 = a0Var.f307357d;
                            uj0Var.f468945f = aVar2.f307352c;
                            uj0Var.f468944e = aVar2.f307351b;
                            java.lang.String str2 = aVar2.f307350a;
                            uj0Var.f468946g = str2;
                            uj0Var.f468943d = "元";
                            gm0.j1.n().f354821b.a(830, a0Var);
                            android.content.Context context = aVar2.f307355f;
                            a0Var.f307359f = db5.e1.Q(context, context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv) : null, context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq) : null, true, true, new d22.z(a0Var));
                            a0Var.f307360g = new z12.f(str2, uj0Var, aVar2.f307353d, aVar2.f307354e);
                            gm0.j1.n().f354821b.g(a0Var.f307360g);
                            r0 = jz5.f0.f384359a;
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiEmoticonReward", "missing arguments. no param provided");
            this.f224976f.a("missing arguments.");
            return;
        }
        if (r0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiEmoticonReward", "missing arguments. no json object provided");
            this.f224976f.a("missing arguments.");
        }
    }
}
