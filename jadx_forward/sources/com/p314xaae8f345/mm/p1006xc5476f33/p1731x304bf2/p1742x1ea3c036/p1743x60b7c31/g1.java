package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class g1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c f221178e;

    @Override // sd.c
    public java.lang.String b() {
        return "getWepkgFileList";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWepkgFileList", "invokeInMM");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("wepkgId");
        int optInt = e17.optInt("loadType", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWepkgFileList", "wepkgId:[%s] loadType:[%d]", optString, java.lang.Integer.valueOf(optInt));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            q5Var.a("null_data", null);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.d1(this, optString, optInt, q5Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject f(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "size"
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r10 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.e(r10)
            r1 = 0
            java.lang.String r2 = "MicroMsg.JsApiGetWepkgFileList"
            if (r10 == 0) goto L8c
            java.lang.String r3 = r10.f269910g
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r3 == 0) goto L16
            goto L8c
        L16:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "version"
            java.lang.String r5 = r10.f269909f     // Catch: java.lang.Exception -> L7d
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L7d
            int r4 = r10.f269918r     // Catch: java.lang.Exception -> L7d
            r3.put(r0, r4)     // Catch: java.lang.Exception -> L7d
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L7d
            java.lang.String r10 = r10.f269910g     // Catch: java.lang.Exception -> L7d
            r4.<init>(r10)     // Catch: java.lang.Exception -> L7d
            boolean r10 = r4.m()     // Catch: java.lang.Exception -> L7d
            if (r10 != 0) goto L36
        L35:
            goto L92
        L36:
            com.tencent.mm.plugin.wepkg.model.o r10 = new com.tencent.mm.plugin.wepkg.model.o     // Catch: java.lang.Exception -> L7d
            r10.<init>(r4)     // Catch: java.lang.Exception -> L7d
            r45.l87 r10 = r10.f269983e     // Catch: java.lang.Exception -> L7d
            if (r10 != 0) goto L40
            goto L35
        L40:
            java.util.LinkedList r4 = r10.f460771d     // Catch: java.lang.Exception -> L7d
            if (r4 == 0) goto L93
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L7d
            r4.<init>()     // Catch: java.lang.Exception -> L7d
            java.util.LinkedList r10 = r10.f460771d     // Catch: java.lang.Exception -> L7d
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L7d
        L4f:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r5 == 0) goto L77
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Exception -> L7d
            r45.ps0 r5 = (r45.ps0) r5     // Catch: java.lang.Exception -> L7d
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            r6.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.String r7 = "rid"
            java.lang.String r8 = r5.f464900d     // Catch: java.lang.Exception -> L7d
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L7d
            int r7 = r5.f464902f     // Catch: java.lang.Exception -> L7d
            r6.put(r0, r7)     // Catch: java.lang.Exception -> L7d
            java.lang.String r7 = "mimeType"
            java.lang.String r5 = r5.f464903g     // Catch: java.lang.Exception -> L7d
            r6.put(r7, r5)     // Catch: java.lang.Exception -> L7d
            r4.put(r6)     // Catch: java.lang.Exception -> L7d
            goto L4f
        L77:
            java.lang.String r10 = "fileList"
            r3.put(r10, r4)     // Catch: java.lang.Exception -> L7d
            goto L93
        L7d:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "errMsg:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0, r10)
            goto L92
        L8c:
            java.lang.String r10 = "wepkgVersion not exists or pkgPath is empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)
        L92:
            r3 = r1
        L93:
            if (r3 != 0) goto L96
            return r1
        L96:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r0 = "data"
            r10.put(r0, r3)     // Catch: org.json.JSONException -> La0
        La0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g1.f(java.lang.String):org.json.JSONObject");
    }
}
