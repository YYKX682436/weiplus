package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class f2 extends xs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f175766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ts1.o f175767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ts1.o f175770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f175772g;

    public f2(java.util.Map map, ts1.o oVar, java.lang.String str, java.lang.String str2, ts1.o oVar2, java.lang.String str3, yz5.l lVar) {
        this.f175766a = map;
        this.f175767b = oVar;
        this.f175768c = str;
        this.f175769d = str2;
        this.f175770e = oVar2;
        this.f175771f = str3;
        this.f175772g = lVar;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        java.lang.String str;
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = (com.p314xaae8f345.mm.p971x6de15a2e.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1305x90a29f38.p1306x5b09653.b.c(headers, "fetchBizPkg");
        if (i17 != 200) {
            return false;
        }
        java.util.List list = (java.util.List) headers.get("content-type");
        if (list == null || (str = (java.lang.String) kz5.n0.X(list)) == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2 e2Var = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, "application/wxprefetcher") ? com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175757i : com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175756h;
        zw4.e eVar = zw4.e.f558445g;
        zw4.f fVar = e2Var == com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175757i ? zw4.f.f558452i : zw4.f.f558451h;
        java.lang.String str2 = this.f175768c;
        ts1.o oVar = this.f175767b;
        int j17 = oVar.j();
        int e17 = oVar.e();
        int s17 = oVar.s();
        java.lang.String str3 = this.f175769d;
        ts1.o oVar2 = this.f175770e;
        zw4.g.a(eVar, fVar, str2, j17, e17, s17, str3, oVar2.f503121a);
        oVar2.l().putAll(headers);
        oVar2.l().put("status", kz5.b0.c(java.lang.String.valueOf(i17)));
        oVar2.z(e2Var, this.f175768c);
        return true;
    }

    @Override // xs1.c, xs1.b
    public void b(java.lang.Object obj, xs1.e downloadResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadResult, "downloadResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "fetchBizPkg download success: " + downloadResult.f537834a + ", fileName: " + this.f175771f + ", webId: " + this.f175770e.f503122b);
        this.f175772g.mo146xb9724478(java.lang.Boolean.valueOf(zs1.g.c(false, downloadResult.f537834a, downloadResult.f537836c, this.f175770e, this.f175767b, this.f175769d, downloadResult.f537835b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().getInt("debugCookie", -1) == 1) goto L20;
     */
    @Override // xs1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object r12) {
        /*
            r11 = this;
            com.tencent.mm.network.j2 r12 = (com.p314xaae8f345.mm.p971x6de15a2e.j2) r12
            java.lang.String r0 = "connection"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.util.Map r0 = r11.f175766a
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
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a
            ts1.o r1 = r11.f175767b
            java.lang.String r1 = r1.f503121a
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.String r1 = "cookie"
            r12.h(r1, r0)
        L69:
            com.tencent.mm.plugin.webview.core.q1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r0 = r0.a()
            if (r0 == 0) goto L82
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a()
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
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1305x90a29f38.p1306x5b09653.b.b()
            java.lang.String r1 = "Cookie"
            r12.h(r1, r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.f2.c(java.lang.Object):void");
    }
}
