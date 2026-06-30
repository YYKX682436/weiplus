package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes.dex */
public final class o extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f53177f = jz5.h.b(com.tencent.mm.advertise.impl.jsapi.m.f53174d);

    @Override // lc3.c0
    public java.lang.String f() {
        return "getAdIdInfo";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (((java.util.List) ((jz5.n) r9.f53177f).getValue()).contains(r3) != false) goto L7;
     */
    @Override // lc3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(lc3.a0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.MBJsApiGetAdIdInfo"
            java.lang.String r1 = "getAdIdInfo but not valid host "
            java.lang.String r2 = "data"
            kotlin.jvm.internal.o.g(r10, r2)
            java.lang.String r2 = "url"
            java.lang.String r2 = r10.optString(r2)     // Catch: java.lang.Exception -> L87
            android.net.Uri r3 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L87
            java.lang.String r3 = r3.getHost()     // Catch: java.lang.Exception -> L87
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r3)     // Catch: java.lang.Exception -> L87
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L31
            jz5.g r2 = r9.f53177f     // Catch: java.lang.Exception -> L87
            jz5.n r2 = (jz5.n) r2     // Catch: java.lang.Exception -> L87
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L87
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L87
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> L87
            if (r2 == 0) goto L5e
        L2f:
            r5 = r6
            goto L5e
        L31:
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L87
            java.lang.String r7 = lp0.b.h()     // Catch: java.lang.Exception -> L87
            java.lang.String r8 = "websearch/template"
            r4.<init>(r7, r8)     // Catch: java.lang.Exception -> L87
            java.lang.String r4 = r4.o()     // Catch: java.lang.Exception -> L87
            java.lang.String r7 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.f(r4, r7)     // Catch: java.lang.Exception -> L87
            java.lang.String r7 = "file://"
            java.lang.String r4 = r7.concat(r4)     // Catch: java.lang.Exception -> L87
            if (r2 == 0) goto L55
            boolean r2 = r26.i0.y(r2, r4, r5)     // Catch: java.lang.Exception -> L87
            if (r2 != r6) goto L55
            r2 = r6
            goto L56
        L55:
            r2 = r5
        L56:
            if (r2 == 0) goto L5e
            java.lang.String r2 = "getAdIdInfo, isWebSearchUrl=true"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Exception -> L87
            goto L2f
        L5e:
            if (r5 != 0) goto L7d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            r10.<init>(r1)     // Catch: java.lang.Exception -> L87
            r10.append(r3)     // Catch: java.lang.Exception -> L87
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L87
            com.tencent.mars.xlog.Log.w(r0, r10)     // Catch: java.lang.Exception -> L87
            yz5.l r10 = r9.s()     // Catch: java.lang.Exception -> L87
            java.lang.String r1 = "invalid host"
            lc3.a0 r1 = r9.h(r6, r1)     // Catch: java.lang.Exception -> L87
            r10.invoke(r1)     // Catch: java.lang.Exception -> L87
            return
        L7d:
            com.tencent.mm.advertise.impl.jsapi.n r0 = new com.tencent.mm.advertise.impl.jsapi.n
            r0.<init>(r10, r9)
            r10 = 0
            pm0.v.K(r10, r0)
            return
        L87:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getAdIdInfo ex "
            r1.<init>(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.tencent.mars.xlog.Log.w(r0, r10)
            yz5.l r10 = r9.s()
            r0 = 2
            java.lang.String r1 = "url parse error"
            lc3.a0 r0 = r9.h(r0, r1)
            r10.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.advertise.impl.jsapi.o.t(lc3.a0):void");
    }
}
