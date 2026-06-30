package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class d2 implements su4.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f263026a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f263027b = new java.util.ArrayList();

    public d2(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        for (int i17 = 0; i17 < 3; i17++) {
            this.f263027b.add(new java.util.HashMap());
        }
        this.f263026a = n3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            if (r1 == 0) goto Le
            goto L1f
        Le:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1f
            r1.<init>(r6)     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = "action"
            java.lang.String r1 = r1.optString(r3)     // Catch: java.lang.Exception -> L1f
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L1f
            if (r3 == 0) goto L20
        L1f:
            r1 = r2
        L20:
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L2f
            goto L41
        L2f:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L41
            r3.<init>(r6)     // Catch: java.lang.Exception -> L41
            java.lang.String r4 = "req_key"
            java.lang.String r3 = r3.optString(r4)     // Catch: java.lang.Exception -> L41
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L41
            if (r4 == 0) goto L42
        L41:
            r3 = r2
        L42:
            r0.append(r3)
            r0.append(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L4f
            goto L63
        L4f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L63
            r1.<init>(r6)     // Catch: java.lang.Exception -> L63
            java.lang.String r6 = "sessionid64"
            java.lang.String r6 = r1.optString(r6)     // Catch: java.lang.Exception -> L63
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L63
            if (r1 == 0) goto L62
            goto L63
        L62:
            r2 = r6
        L63:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2.a(java.lang.String):java.lang.String");
    }

    public void b(int i17, java.lang.Object obj, java.lang.Object obj2, su4.j1 j1Var) {
        this.f263026a.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.c2(this, i17, obj, obj2, j1Var));
    }

    public void c(int i17, java.lang.Object obj) {
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.PGetController", "step_doCgiReq tag is null");
        } else {
            this.f263026a.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a2(this, i17, obj));
        }
    }

    public void d(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Runnable runnable, su4.j1 j1Var) {
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.PGetController", "step_getJsApi tag is null");
        } else {
            this.f263026a.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.b2(this, i17, obj, obj2, runnable, j1Var));
        }
    }
}
