package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcv4/j;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final void A(int i17, java.lang.String str, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetTeachSearchData", "onTeachSearchDataReady");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("requestType", i17);
        jSONObject.put("json", str);
        jSONObject.put("isCacheData", i18);
        jSONObject.put("requestId", str2);
        this.f224976f.c(jSONObject, false);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        jz5.f0 f0Var;
        if (jSONObject != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetTeachSearchData", "[getTeachSearchData] params: %s", hashMap);
            int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(hashMap, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            int e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(hashMap, "type", 0);
            java.lang.String str2 = (java.lang.String) hashMap.get("requestId");
            java.lang.String str3 = (java.lang.String) hashMap.get("guideInfo");
            java.lang.String str4 = (java.lang.String) hashMap.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            java.lang.Object obj = hashMap.get("h5Version");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj).intValue();
            if (intValue == 0) {
                intValue = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(9);
            }
            java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            su4.z1 z1Var = new su4.z1(e17, e18, intValue, hashCode(), f17, su4.o2.d("discoverSearchEntry").optLong("guideParam"), str2, str4, str3, null);
            gm0.j1.d().a(1048, this);
            gm0.j1.d().g(z1Var);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f224976f.a("data is nil");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof su4.z1) {
            su4.z1 z1Var = (su4.z1) m1Var;
            int i19 = z1Var.f494685i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetTeachSearchData", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ", webviewID = " + i19);
            if (i19 == hashCode()) {
                gm0.j1.d().q(1048, this);
                if (i17 == 0 && i18 == 0) {
                    A(0, z1Var.f494682f.f467971d, 0, z1Var.f494686m);
                } else {
                    A(0, "", 0, z1Var.f494686m);
                }
            }
        }
    }
}
