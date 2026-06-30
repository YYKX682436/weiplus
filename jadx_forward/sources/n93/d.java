package n93;

/* loaded from: classes.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public static java.util.List A(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            linkedList.add(jSONArray.optString(i17));
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r2, org.json.JSONObject r3, boolean r4) {
        /*
            r1 = this;
            if (r3 != 0) goto La
            com.tencent.mm.plugin.lite.api.o r2 = r1.f224976f
            java.lang.String r3 = "data is null"
            r2.a(r3)
            return
        La:
            java.lang.String r2 = "userNames"
            boolean r4 = r3.has(r2)
            java.lang.String r0 = "fail: params error"
            if (r4 == 0) goto L39
            java.lang.Object r2 = r3.opt(r2)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L2e
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L28
            r3.<init>(r2)     // Catch: java.lang.Exception -> L28
            java.util.List r2 = A(r3)     // Catch: java.lang.Exception -> L28
            goto L3a
        L28:
            com.tencent.mm.plugin.lite.api.o r2 = r1.f224976f
            r2.a(r0)
            return
        L2e:
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto L39
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            java.util.List r2 = A(r2)
            goto L3a
        L39:
            r2 = 0
        L3a:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r2)
            if (r3 != 0) goto L52
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.r5> r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5.class
            i95.m r3 = i95.n0.c(r3)
            com.tencent.mm.plugin.appbrand.service.r5 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5) r3
            r3.p7(r2)
            com.tencent.mm.plugin.lite.api.o r2 = r1.f224976f
            r3 = 0
            r2.d(r3)
            goto L57
        L52:
            com.tencent.mm.plugin.lite.api.o r2 = r1.f224976f
            r2.a(r0)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n93.d.a(java.lang.String, org.json.JSONObject, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
