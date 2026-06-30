package md3;

/* loaded from: classes.dex */
public final class a0 extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "preloadMiniProgramContacts";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    @Override // lc3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(lc3.a0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "userNames"
            boolean r1 = r4.has(r0)
            lc3.z r2 = lc3.x.f399470d
            if (r1 == 0) goto L46
            java.lang.Object r4 = r4.opt(r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L3b
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L23
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L23
            r0.<init>(r4)     // Catch: java.lang.Exception -> L23
            java.util.LinkedList r4 = r3.u(r0)     // Catch: java.lang.Exception -> L23
            goto L52
        L23:
            r4 = move-exception
            yz5.l r0 = r3.s()
            lc3.z r1 = lc3.x.f399469c
            lc3.a0 r1 = r3.i(r1)
            r0.mo146xb9724478(r1)
            java.lang.String r0 = "MicroMsg.MBJsApiPreloadMiniProgramContacts"
            java.lang.String r4 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r4)
            return
        L3b:
            boolean r0 = r4 instanceof org.json.JSONArray
            if (r0 == 0) goto L51
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.util.LinkedList r4 = r3.u(r4)
            goto L52
        L46:
            yz5.l r4 = r3.s()
            lc3.a0 r0 = r3.i(r2)
            r4.mo146xb9724478(r0)
        L51:
            r4 = 0
        L52:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r4)
            if (r0 != 0) goto L6f
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.r5> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.r5 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5) r0
            r0.p7(r4)
            yz5.l r4 = r3.s()
            lc3.a0 r0 = r3.k()
            r4.mo146xb9724478(r0)
            goto L7a
        L6f:
            yz5.l r4 = r3.s()
            lc3.a0 r0 = r3.i(r2)
            r4.mo146xb9724478(r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md3.a0.t(lc3.a0):void");
    }

    public final java.util.LinkedList u(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            linkedList.add(jSONArray.optString(i17));
        }
        return linkedList;
    }
}
