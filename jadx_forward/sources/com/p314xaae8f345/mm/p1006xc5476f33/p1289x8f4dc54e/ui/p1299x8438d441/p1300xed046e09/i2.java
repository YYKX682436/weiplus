package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class i2 extends xs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.o97 f175847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu4.a f175848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f175850d;

    public i2(r45.o97 o97Var, nu4.a aVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f175847a = o97Var;
        this.f175848b = aVar;
        this.f175849c = str;
        this.f175850d = interfaceC29045xdcb5ca57;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = (com.p314xaae8f345.mm.p971x6de15a2e.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1305x90a29f38.p1306x5b09653.b.c(headers, "fetchManifest");
        return i17 == 200;
    }

    @Override // xs1.c, xs1.b
    public void b(java.lang.Object obj, xs1.e downloadResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadResult, "downloadResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "fetchManifest: " + this.f175848b.f421766a.f460759d + '#' + this.f175849c + ", succ:" + downloadResult.f537834a + ", path:" + this.f175848b.f421767b.f461763d + ", url:" + this.f175848b.f421767b.f461764e);
        if (!downloadResult.f537834a) {
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f175850d;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            return;
        }
        java.lang.String Domain = this.f175848b.f421766a.f460759d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Domain, "Domain");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.f175738a;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.class) {
            java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(Domain), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b.f175720d, null);
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()) {
                java.lang.String PROCESS_TOOLS = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_TOOLS, "PROCESS_TOOLS");
                com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_TOOLS, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(Domain), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c.f175729d, null);
            }
        }
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572 = this.f175850d;
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca572.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().getInt("debugCookie", -1) == 1) goto L14;
     */
    @Override // xs1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object r13) {
        /*
            r12 = this;
            com.tencent.mm.network.j2 r13 = (com.p314xaae8f345.mm.p971x6de15a2e.j2) r13
            java.lang.String r0 = "connection"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a
            r45.o97 r1 = r12.f175847a
            java.lang.String r1 = r1.f463587d
            java.lang.String r2 = "url"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            java.util.List r3 = r0.g(r1)
            if (r3 == 0) goto L28
            java.lang.String r4 = "; "
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            r11 = 0
            java.lang.String r0 = kz5.n0.g0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L3b
            java.lang.String r1 = "fetchManifest request header cookie: "
            java.lang.String r1 = r1.concat(r0)
            java.lang.String r2 = "MicroMsg.WebPrefetcher"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.String r1 = "cookie"
            r13.h(r1, r0)
        L3b:
            com.tencent.mm.plugin.webview.core.q1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r0 = r0.a()
            if (r0 == 0) goto L54
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a()
            java.lang.String r1 = "debugCookie"
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            r1 = 1
            if (r0 != r1) goto L54
            goto L55
        L54:
            r1 = 0
        L55:
            if (r1 == 0) goto L60
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1305x90a29f38.p1306x5b09653.b.b()
            java.lang.String r1 = "Cookie"
            r13.h(r1, r0)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i2.c(java.lang.Object):void");
    }
}
