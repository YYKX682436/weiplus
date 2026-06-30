package k91;

/* loaded from: classes7.dex */
public abstract class x5 {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: JSONException -> 0x007a, TRY_LEAVE, TryCatch #0 {JSONException -> 0x007a, blocks: (B:17:0x0005, B:7:0x0012), top: B:16:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 a(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            if (r4 == 0) goto Le
            int r3 = r4.length()     // Catch: org.json.JSONException -> L7a
            if (r3 != 0) goto Lc
            goto Le
        Lc:
            r3 = r0
            goto Lf
        Le:
            r3 = r1
        Lf:
            if (r3 == 0) goto L12
            return r2
        L12:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7a
            r3.<init>(r4)     // Catch: org.json.JSONException -> L7a
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r4 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo
            r4.<init>()
            r4.f158977d = r0
            java.lang.String r0 = "module_list"
            java.lang.String r0 = r3.optString(r0)
            java.util.List r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f.a(r0)
            r4.f158985o = r0
            java.lang.String r0 = "widget_list"
            java.lang.String r0 = r3.optString(r0)
            java.util.List r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5.a(r0)
            r4.f158990t = r0
            java.util.List r0 = r4.f158985o
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r0)
            r0 = r0 ^ r1
            r4.f158986p = r0
            if (r0 == 0) goto L49
            java.lang.String r0 = "entrance_module"
            java.lang.String r0 = r3.optString(r0)
            goto L4b
        L49:
            java.lang.String r0 = ""
        L4b:
            r4.f158987q = r0
            java.util.List r0 = r4.f158990t
            java.lang.String r1 = "separated_plugin_list"
            java.lang.String r1 = r3.optString(r1)
            r2 = 22
            java.util.List r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1.b(r0, r1, r2)
            r4.f158983m = r0
            java.lang.String r0 = "client_js_ext_info"
            java.lang.String r0 = r3.optString(r0)
            r4.f158988r = r0
            java.lang.String r0 = "device_orientation"
            java.lang.String r0 = r3.optString(r0)
            r4.f158981h = r0
            java.lang.String r0 = "chat_tools"
            org.json.JSONArray r0 = r3.optJSONArray(r0)
            java.util.List r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11824x9e479fd1.a(r0)
            r4.F = r0
            return r4
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.x5.a(java.lang.String):com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo");
    }
}
