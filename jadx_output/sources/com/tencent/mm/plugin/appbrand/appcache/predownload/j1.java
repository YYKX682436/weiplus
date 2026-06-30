package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes7.dex */
public final class j1 extends k91.i1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75854o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f75855p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.String str, long j17) {
        super(str);
        this.f75854o = str;
        this.f75855p = j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.appbrand.networking.d
    /* renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(int r9, int r10, java.lang.String r11, r45.gh r12, com.tencent.mm.modelbase.m1 r13) {
        /*
            r8 = this;
            java.lang.Class<k91.j4> r0 = k91.j4.class
            java.lang.String r1 = r8.f75854o
            java.lang.String r2 = "MicroMsg.WxaAttributesBatchPreLoader"
            java.lang.String r3 = "preloadByQBarRawString::onCgiBack, qbarString:"
            super.x(r9, r10, r11, r12, r13)
            boolean r13 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r8.f75855p
            long r4 = r4 - r6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb2
            r13.<init>(r3)     // Catch: java.lang.Exception -> Lb2
            r13.append(r1)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = ", errType:"
            r13.append(r3)     // Catch: java.lang.Exception -> Lb2
            r13.append(r9)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r9 = ", errCode:"
            r13.append(r9)     // Catch: java.lang.Exception -> Lb2
            r13.append(r10)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r9 = ", errMsg:"
            r13.append(r9)     // Catch: java.lang.Exception -> Lb2
            if (r11 != 0) goto L35
            java.lang.String r11 = ""
        L35:
            r13.append(r11)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r9 = " cost:"
            r13.append(r9)     // Catch: java.lang.Exception -> Lb2
            r13.append(r4)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r9 = r13.toString()     // Catch: java.lang.Exception -> Lb2
            com.tencent.mars.xlog.Log.i(r2, r9)     // Catch: java.lang.Exception -> Lb2
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch: java.lang.Exception -> Lb2
            r9.<init>()     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r10 = com.tencent.mm.plugin.appbrand.app.r9.fj(r0)     // Catch: java.lang.Exception -> Lb2
            k91.j4 r10 = (k91.j4) r10     // Catch: java.lang.Exception -> Lb2
            kotlin.jvm.internal.o.d(r12)     // Catch: java.lang.Exception -> Lb2
            r11 = 113(0x71, float:1.58E-43)
            r10.z0(r11, r12, r9)     // Catch: java.lang.Exception -> Lb2
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> Lb2
        L5e:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Exception -> Lb2
            if (r10 == 0) goto Lcc
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> Lb2
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L77
            int r13 = r10.length()     // Catch: java.lang.Exception -> Lb2
            if (r13 != 0) goto L75
            goto L77
        L75:
            r13 = r11
            goto L78
        L77:
            r13 = r12
        L78:
            if (r13 != 0) goto L5e
            java.lang.Object r13 = com.tencent.mm.plugin.appbrand.app.r9.fj(r0)     // Catch: java.lang.Exception -> Lb2
            k91.j4 r13 = (k91.j4) r13     // Catch: java.lang.Exception -> Lb2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = "appInfo"
            r12[r11] = r3     // Catch: java.lang.Exception -> Lb2
            k91.v5 r10 = r13.n1(r10, r12)     // Catch: java.lang.Exception -> Lb2
            if (r10 == 0) goto L5e
            k91.j5 r10 = r10.u0()     // Catch: java.lang.Exception -> L5e
            boolean r10 = r10.b()     // Catch: java.lang.Exception -> L5e
            if (r10 == 0) goto La4
            com.tencent.mm.plugin.appbrand.task.h0 r10 = com.tencent.mm.plugin.appbrand.task.u0.f89199h     // Catch: java.lang.Exception -> L5e
            com.tencent.mm.plugin.appbrand.task.u0 r10 = r10.a()     // Catch: java.lang.Exception -> L5e
            com.tencent.luggage.sdk.processes.LuggageServiceType r11 = com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f     // Catch: java.lang.Exception -> L5e
            com.tencent.mm.plugin.appbrand.service.x6 r12 = com.tencent.mm.plugin.appbrand.service.x6.f88817J     // Catch: java.lang.Exception -> L5e
            r10.P(r11, r12)     // Catch: java.lang.Exception -> L5e
            goto L5e
        La4:
            com.tencent.mm.plugin.appbrand.task.h0 r10 = com.tencent.mm.plugin.appbrand.task.u0.f89199h     // Catch: java.lang.Exception -> L5e
            com.tencent.mm.plugin.appbrand.task.u0 r10 = r10.a()     // Catch: java.lang.Exception -> L5e
            com.tencent.luggage.sdk.processes.LuggageServiceType r11 = com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e     // Catch: java.lang.Exception -> L5e
            com.tencent.mm.plugin.appbrand.service.x6 r12 = com.tencent.mm.plugin.appbrand.service.x6.f88817J     // Catch: java.lang.Exception -> L5e
            r10.P(r11, r12)     // Catch: java.lang.Exception -> L5e
            goto L5e
        Lb2:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "preloadByQBarRawString::batchUpdateWithProto with qbarString:"
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r11 = ", failed exception="
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.mars.xlog.Log.e(r2, r9)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.predownload.j1.k(int, int, java.lang.String, r45.gh, com.tencent.mm.modelbase.m1):void");
    }
}
