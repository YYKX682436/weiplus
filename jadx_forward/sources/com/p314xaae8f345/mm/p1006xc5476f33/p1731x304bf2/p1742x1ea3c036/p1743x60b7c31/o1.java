package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class o1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "interceptBack";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        r10 = (sd.a) r10.f488129a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r10 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if ((r10 instanceof sd.k) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6);
        g53.j.a(r7, r6, r3, (sd.k) r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(sd.b r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            od.g r0 = r10.f488130b
            org.json.JSONObject r0 = r0.f426039c
            java.lang.String r1 = "interceptBack"
            if (r0 != 0) goto L17
            java.lang.String r0 = "data is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
            r0 = 0
            java.lang.String r1 = "null_data"
            r10.c(r1, r0)
            return
        L17:
            java.lang.String r2 = "type"
            int r2 = r0.optInt(r2)
            java.lang.String r3 = "needIntercept"
            boolean r3 = r0.optBoolean(r3)
            r4 = 1
            if (r2 != r4) goto L93
            java.lang.String r5 = "scene"
            r0.optString(r5)
            java.lang.String r5 = "extInfo"
            java.lang.String r0 = r0.optString(r5)
            r5 = 0
            if (r0 == 0) goto L3d
            int r6 = r0.length()
            if (r6 != 0) goto L3b
            goto L3d
        L3b:
            r6 = r5
            goto L3e
        L3d:
            r6 = r4
        L3e:
            if (r6 != 0) goto Lc0
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L81
            r6.<init>(r0)     // Catch: org.json.JSONException -> L81
            java.lang.String r7 = "appId"
            java.lang.String r7 = r6.optString(r7)     // Catch: org.json.JSONException -> L81
            java.lang.String r8 = "actId"
            java.lang.String r6 = r6.optString(r8)     // Catch: org.json.JSONException -> L81
            if (r7 == 0) goto L5c
            int r8 = r7.length()     // Catch: org.json.JSONException -> L81
            if (r8 != 0) goto L5a
            goto L5c
        L5a:
            r8 = r5
            goto L5d
        L5c:
            r8 = r4
        L5d:
            if (r8 != 0) goto Lc0
            if (r6 == 0) goto L69
            int r8 = r6.length()     // Catch: org.json.JSONException -> L81
            if (r8 != 0) goto L68
            goto L69
        L68:
            r4 = r5
        L69:
            if (r4 != 0) goto Lc0
            sd.d r10 = r10.f488129a     // Catch: org.json.JSONException -> L81
            sd.a r10 = (sd.a) r10     // Catch: org.json.JSONException -> L81
            if (r10 == 0) goto Lc0
            boolean r4 = r10 instanceof sd.k     // Catch: org.json.JSONException -> L81
            if (r4 == 0) goto Lc0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)     // Catch: org.json.JSONException -> L81
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)     // Catch: org.json.JSONException -> L81
            sd.k r10 = (sd.k) r10     // Catch: org.json.JSONException -> L81
            g53.j.a(r7, r6, r3, r10, r2)     // Catch: org.json.JSONException -> L81
            goto Lc0
        L81:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "extInfo can not cast to JSONObject extInfo = "
            r10.<init>(r2)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r10)
            goto Lc0
        L93:
            sd.d r10 = r10.f488129a
            sd.a r10 = (sd.a) r10
            if (r10 == 0) goto Lc0
            boolean r0 = r10 instanceof sd.k
            if (r0 == 0) goto Lc0
            sd.k r10 = (sd.k) r10
            g53.j.f350453d = r2
            g53.j.f350450a = r3
            android.content.Context r0 = r10.f488143d
            boolean r1 = r0 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            if (r1 == 0) goto Lb9
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r0
            com.tencent.mm.ui.widget.SwipeBackLayout r0 = r0.m78735x28280f95()
            r1 = r3 ^ 1
            r0.m81450x8e764904(r1)
        Lb9:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            g53.j.f350454e = r0
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o1.e(sd.b):void");
    }
}
