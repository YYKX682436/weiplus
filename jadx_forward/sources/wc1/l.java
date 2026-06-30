package wc1;

/* loaded from: classes7.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 implements wc1.s {

    /* renamed from: CTRL_INDEX */
    public static final int f77341x366c91de = 467;

    /* renamed from: NAME */
    public static final java.lang.String f77342x24728b = "batchCreateLoadSubPackageTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("moduleNameList");
        if (optJSONArray != null) {
            linkedList = new java.util.LinkedList();
            cf.f.b(optJSONArray, new wc1.k(linkedList));
        } else {
            linkedList = null;
        }
        if (linkedList == null || linkedList.isEmpty()) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str2, jSONObject);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = env.mo32091x9a3f0ba2();
        ph1.h hVar = mo32091x9a3f0ba2 != null ? mo32091x9a3f0ba2.R : null;
        if (hVar == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str2, jSONObject2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        if (!hVar.e()) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8)) {
                    break;
                }
            }
            if (obj != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str2 = str != null ? str : "";
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                java.lang.String u19 = u(str2, jSONObject3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u19, "makeReturnJson(...)");
                return u19;
            }
        }
        ph1.b b17 = hVar.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "createBatchLoadModuleTransaction(...)");
        int[] iArr = new int[linkedList.size()];
        boolean[] zArr = new boolean[1];
        wc1.b bVar = new wc1.b();
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str6 = (java.lang.String) obj2;
            int g17 = wc1.s.g();
            iArr[i17] = g17;
            b17.a(str6, new wc1.g(bVar, zArr, env, g17, str6), new wc1.h(env, g17, str6), false);
            i17 = i18;
        }
        b17.mo158531xaf3f2937();
        if (zArr[0]) {
            java.lang.String o17 = o("fail");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o17);
            return o17;
        }
        java.util.Map e27 = kz5.b1.e(new jz5.l("loadTaskIdList", iArr));
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!(e27 instanceof java.util.HashMap)) {
            e27 = new java.util.HashMap(e27);
        }
        e27.put("errno", 0);
        java.lang.String t17 = t("ok", e27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = env.getF229341e();
        if (f229341e == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) f229341e.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
            env.mo50350x12b4fba4().mo50293x3498a0(new wc1.j(bVar));
        } else {
            f0Var.mo51545x3498a0(new wc1.i(bVar));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t17);
        return t17;
    }
}
