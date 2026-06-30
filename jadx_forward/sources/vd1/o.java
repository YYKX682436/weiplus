package vd1;

/* loaded from: classes7.dex */
public final class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f77290x366c91de = 652;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f77291x24728b = "operateRealtimeData";

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        r5 = vd1.l.f517125f;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r10, org.json.JSONObject r11, int r12) {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.y r10 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) r10
            if (r10 != 0) goto L6
            goto Lb3
        L6:
            if (r11 != 0) goto La
            goto Lb3
        La:
            java.lang.String r0 = "content"
            java.lang.String r4 = r11.getString(r0)     // Catch: org.json.JSONException -> Laa
            int r0 = r4.length()
            long r0 = (long) r0
            r2 = 65536(0x10000, double:3.2379E-319)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L27
            java.lang.String r11 = "fail too large data"
            java.lang.String r11 = r9.o(r11)
            r10.a(r12, r11)
            goto Lb3
        L27:
            java.lang.String r0 = "type"
            int r3 = r11.getInt(r0)     // Catch: org.json.JSONException -> La0
            vd1.k r0 = vd1.l.f517123d     // Catch: org.json.JSONException -> L96
            java.lang.String r1 = "priority"
            java.lang.String r1 = r11.getString(r1)     // Catch: org.json.JSONException -> L96
            java.lang.String r2 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)     // Catch: org.json.JSONException -> L96
            r0.getClass()     // Catch: org.json.JSONException -> L96
            vd1.l[] r0 = vd1.l.m171588xcee59d22()     // Catch: org.json.JSONException -> L96
            int r2 = r0.length     // Catch: org.json.JSONException -> L96
            r5 = 0
        L44:
            if (r5 >= r2) goto L58
            r6 = r0[r5]     // Catch: org.json.JSONException -> L96
            java.lang.String r7 = r6.name()     // Catch: org.json.JSONException -> L96
            r8 = 1
            boolean r7 = r26.i0.p(r7, r1, r8)     // Catch: org.json.JSONException -> L96
            if (r7 == 0) goto L55
            r5 = r6
            goto L5b
        L55:
            int r5 = r5 + 1
            goto L44
        L58:
            vd1.l r0 = vd1.l.f517125f     // Catch: org.json.JSONException -> L96
            r5 = r0
        L5b:
            java.lang.String r0 = "id"
            int r2 = r11.getInt(r0)     // Catch: org.json.JSONException -> L8c
            vd1.f0 r0 = vd1.f0.f517106a     // Catch: java.lang.Exception -> L71
            r1 = r10
            r0.b(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L71
            java.lang.String r11 = "ok"
            java.lang.String r11 = r9.o(r11)     // Catch: java.lang.Exception -> L71
            r10.a(r12, r11)     // Catch: java.lang.Exception -> L71
            goto Lb3
        L71:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fail:internal error "
            r0.<init>(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r11 = r9.o(r11)
            r10.a(r12, r11)
            goto Lb3
        L8c:
            java.lang.String r11 = "fail:invalid data id"
            java.lang.String r11 = r9.o(r11)
            r10.a(r12, r11)
            goto Lb3
        L96:
            java.lang.String r11 = "fail:invalid data priority"
            java.lang.String r11 = r9.o(r11)
            r10.a(r12, r11)
            goto Lb3
        La0:
            java.lang.String r11 = "fail:invalid data type"
            java.lang.String r11 = r9.o(r11)
            r10.a(r12, r11)
            goto Lb3
        Laa:
            java.lang.String r11 = "fail:invalid data content"
            java.lang.String r11 = r9.o(r11)
            r10.a(r12, r11)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vd1.o.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
