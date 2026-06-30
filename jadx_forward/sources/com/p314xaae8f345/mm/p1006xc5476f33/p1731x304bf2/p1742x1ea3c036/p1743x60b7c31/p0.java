package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    public static final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        java.util.ArrayList arrayList;
        java.util.ArrayList<m33.g1> arrayList2;
        p0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class));
        p0Var2.getClass();
        java.util.List J0 = ((p43.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).J0(gm0.j1.b().j());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(J0)) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) J0).iterator();
            while (it.hasNext()) {
                arrayList.add(p0Var2.oj((p43.a) it.next()));
            }
        }
        if (arrayList != null) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (com.p314xaae8f345.mm.vfs.w6.j(((m33.g1) obj).f404823d)) {
                    arrayList2.add(obj);
                }
            }
        } else {
            arrayList2 = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gamelog.jsapi, JsApiGetLocalMiniGameVideo , allVideoList.size = ");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        sb6.append("  fileExistVideoList.size = ");
        sb6.append(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("getLocalMiniGameVideo", sb6.toString());
        if (arrayList2 == null || arrayList2.isEmpty()) {
            q5Var.a(null, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (m33.g1 g1Var : arrayList2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g1Var);
            jSONArray.put(p0Var.g(g1Var));
        }
        jSONObject.put("result", jSONArray);
        q5Var.a(null, jSONObject);
    }

    @Override // sd.c
    public java.lang.String b() {
        return "getLocalMiniGameVideo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o0(e17, this, q5Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    public final org.json.JSONObject g(m33.g1 g1Var) {
        java.lang.String path = g1Var.f404823d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(path);
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(path, true);
        if (d17 != null) {
            b17.f264287w = d17.a();
            int i17 = d17.f243928n;
            if (i17 == 90 || i17 == 270) {
                b17.f264277p = d17.f243918d;
                b17.f264278q = d17.f243917c;
            } else {
                b17.f264277p = d17.f243917c;
                b17.f264278q = d17.f243918d;
            }
            b17.f264276o = (int) com.p314xaae8f345.mm.vfs.w6.k(path);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(g1Var.f404826g);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d18);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", g1Var.f404821b);
        jSONObject.put("appName", g1Var.f404822c);
        java.lang.String str = g1Var.f404827h;
        if (str == null) {
            str = "";
        }
        jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str);
        java.lang.String str2 = g1Var.f404828i;
        jSONObject.put("desc", str2 != null ? str2 : "");
        jSONObject.put("creatTime", g1Var.f404824e);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(dm.i4.f66867x2a5c95c7, b17.f264269e);
        jSONObject2.put("videoId", g1Var.f404820a);
        jSONObject2.put("duration", g1Var.f404825f);
        jSONObject2.put("width", b17.f264277p);
        jSONObject2.put("height", b17.f264278q);
        jSONObject2.put("thumbLocalId", d18.f264269e);
        jSONObject2.put("configJson", g1Var.f404829j);
        jSONObject.put("videoInfo", jSONObject2);
        return jSONObject;
    }
}
