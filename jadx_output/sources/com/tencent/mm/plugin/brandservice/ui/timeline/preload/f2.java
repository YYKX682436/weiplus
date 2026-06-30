package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class f2 extends xs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f94233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ts1.o f94234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94235c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ts1.o f94237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f94239g;

    public f2(java.util.Map map, ts1.o oVar, java.lang.String str, java.lang.String str2, ts1.o oVar2, java.lang.String str3, yz5.l lVar) {
        this.f94233a = map;
        this.f94234b = oVar;
        this.f94235c = str;
        this.f94236d = str2;
        this.f94237e = oVar2;
        this.f94238f = str3;
        this.f94239g = lVar;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        java.lang.String str;
        com.tencent.mm.network.j2 connection = (com.tencent.mm.network.j2) obj;
        kotlin.jvm.internal.o.g(connection, "connection");
        kotlin.jvm.internal.o.g(headers, "headers");
        com.tencent.mm.plugin.brandservice.webprefetcher.debug.b.c(headers, "fetchBizPkg");
        if (i17 != 200) {
            return false;
        }
        java.util.List list = (java.util.List) headers.get("content-type");
        if (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 e2Var = kotlin.jvm.internal.o.b(lowerCase, "application/wxprefetcher") ? com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94224i : com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94223h;
        zw4.e eVar = zw4.e.f476912g;
        zw4.f fVar = e2Var == com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94224i ? zw4.f.f476919i : zw4.f.f476918h;
        java.lang.String str2 = this.f94235c;
        ts1.o oVar = this.f94234b;
        int j17 = oVar.j();
        int e17 = oVar.e();
        int s17 = oVar.s();
        java.lang.String str3 = this.f94236d;
        ts1.o oVar2 = this.f94237e;
        zw4.g.a(eVar, fVar, str2, j17, e17, s17, str3, oVar2.f421588a);
        oVar2.l().putAll(headers);
        oVar2.l().put("status", kz5.b0.c(java.lang.String.valueOf(i17)));
        oVar2.z(e2Var, this.f94235c);
        return true;
    }

    @Override // xs1.c, xs1.b
    public void b(java.lang.Object obj, xs1.e downloadResult) {
        kotlin.jvm.internal.o.g(downloadResult, "downloadResult");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcher", "fetchBizPkg download success: " + downloadResult.f456301a + ", fileName: " + this.f94238f + ", webId: " + this.f94237e.f421589b);
        this.f94239g.invoke(java.lang.Boolean.valueOf(zs1.g.c(false, downloadResult.f456301a, downloadResult.f456303c, this.f94237e, this.f94234b, this.f94236d, downloadResult.f456302b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (com.tencent.mm.plugin.webview.core.t1.a().getInt("debugCookie", -1) == 1) goto L20;
     */
    @Override // xs1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object r12) {
        /*
            r11 = this;
            com.tencent.mm.network.j2 r12 = (com.tencent.mm.network.j2) r12
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.o.g(r12, r0)
            java.util.Map r0 = r11.f94233a
            if (r0 == 0) goto L3b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r12.h(r2, r1)
            goto L13
        L3b:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 r0 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a
            ts1.o r1 = r11.f94234b
            java.lang.String r1 = r1.f421588a
            java.util.List r2 = r0.g(r1)
            if (r2 == 0) goto L56
            java.lang.String r3 = "; "
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            java.lang.String r0 = kz5.n0.g0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L57
        L56:
            r0 = 0
        L57:
            if (r0 == 0) goto L69
            java.lang.String r1 = "fetchBizPkg request header cookie: "
            java.lang.String r1 = r1.concat(r0)
            java.lang.String r2 = "MicroMsg.WebPrefetcher"
            com.tencent.mars.xlog.Log.i(r2, r1)
            java.lang.String r1 = "cookie"
            r12.h(r1, r0)
        L69:
            com.tencent.mm.plugin.webview.core.q1 r0 = com.tencent.mm.plugin.webview.core.s1.f181972a
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = r0.a()
            if (r0 == 0) goto L82
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.plugin.webview.core.t1.a()
            java.lang.String r1 = "debugCookie"
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            r1 = 1
            if (r0 != r1) goto L82
            goto L83
        L82:
            r1 = 0
        L83:
            if (r1 == 0) goto L8e
            java.lang.String r0 = com.tencent.mm.plugin.brandservice.webprefetcher.debug.b.b()
            java.lang.String r1 = "Cookie"
            r12.h(r1, r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.f2.c(java.lang.Object):void");
    }
}
