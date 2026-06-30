package com.tencent.mm.plugin.appbrand.appcache.predownload;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public final class u0 extends i95.w implements com.tencent.mm.plugin.appbrand.service.s6 {
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.u0 wi() {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class);
        if (c17 instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.u0) {
            return (com.tencent.mm.plugin.appbrand.appcache.predownload.u0) c17;
        }
        return null;
    }

    public final boolean Ai(java.lang.String str) {
        return !(str == null || str.length() == 0) && com.tencent.mm.storage.z3.z3(str) && com.tencent.mm.plugin.appbrand.config.q.k(str);
    }

    public final void Bi(java.lang.String appId) {
        com.tencent.mm.sdk.platformtools.o4 a17;
        java.lang.String[] b17;
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String concat = "MicroMsg.AppBrand.PreDownloadServiceExportImpl.extendLifespanForPreDownloadedPkgs:".concat(appId);
        com.tencent.mm.sdk.platformtools.o4 a18 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a18 != null && (b17 = a18.b()) != null) {
            for (java.lang.String str : b17) {
                kotlin.jvm.internal.o.d(str);
                if (r26.i0.y(str, concat, false)) {
                    linkedList.add(str);
                }
            }
        }
        if (linkedList.isEmpty() || (a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a()) == null) {
            return;
        }
        a17.X((java.lang.String[]) linkedList.toArray(new java.lang.String[0]));
    }

    public final java.lang.String Di(java.lang.String str, int i17) {
        return "MicroMsg.AppBrand.PreDownloadServiceExportImpl.extendLifespanForPreDownloadedPkgs:" + str + ':' + i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void K5(java.util.List list, com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if ((x6Var == null ? -1 : com.tencent.mm.plugin.appbrand.appcache.predownload.r0.f75889a[x6Var.ordinal()]) == 1) {
            com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75859a.a(list, k91.h1.SNS_TIMELINE_AD, com.tencent.mm.plugin.appbrand.appcache.predownload.f1.f75843d);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWxaAttrs invalid PRELOAD_SCENE:" + x6Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void P4(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        new com.tencent.mm.plugin.appbrand.appcache.predownload.o(str, str2, str3, i17, null, 16, null).s(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void Q4() {
        if (Ai("gh_8c10d2f0f25e@app")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1342, 4);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_prefetch_weapp_data_weishi_chat_item, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchChattingItemWeishiVideoFakeNative");
                com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75859a.a(kz5.b0.c("gh_8c10d2f0f25e@app"), k91.h1.CHATTING, com.tencent.mm.plugin.appbrand.appcache.predownload.f1.f75843d);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void Y4(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1342, 1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_prefetch_weapp_data_mall_index_functions, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchMallIndexWeAppV2 list.size:" + list.size());
            com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75859a.a(list, k91.h1.WALLET_MALL_INDEX, com.tencent.mm.plugin.appbrand.appcache.predownload.f1.f75843d);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void a4(com.tencent.mm.plugin.appbrand.service.q6 request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar = new com.tencent.mm.plugin.appbrand.appcache.predownload.o(request.f88751a, request.f88752b, request.f88754d, request.f88753c, request.f88755e);
        com.tencent.mm.plugin.appbrand.service.p6 p6Var = request.f88756f;
        if (p6Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(request.hashCode());
            sb6.append(':');
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            java.lang.String sb7 = sb6.toString();
            oVar.f75882x = sb7;
            com.tencent.mm.plugin.appbrand.appcache.predownload.d0 d0Var = com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75753a;
            kotlin.jvm.internal.o.d(sb7);
            if (!(sb7.length() == 0)) {
                com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75754b.put(sb7, new com.tencent.mm.plugin.appbrand.appcache.predownload.c0(sb7, p6Var));
            }
        }
        oVar.s(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void d4(java.lang.String str) {
        if (Ai(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1342, 2);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_prefetch_weapp_data_chat_item, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchChattingItemAppBrandPiece username:" + str);
                com.tencent.mm.plugin.appbrand.appcache.predownload.k1 k1Var = com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75859a;
                kotlin.jvm.internal.o.d(str);
                k1Var.a(kz5.b0.c(str), k91.h1.CHATTING, com.tencent.mm.plugin.appbrand.appcache.predownload.f1.f75843d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[EDGE_INSN: B:24:0x003f->B:25:0x003f BREAK  A[LOOP:0: B:5:0x000d->B:21:0x000d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.tencent.mm.plugin.appbrand.service.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gd(java.util.List r5) {
        /*
            r4 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            if (r5 != 0) goto L9
            kz5.p0 r5 = kz5.p0.f313996d
        L9:
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            r2 = 1
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L24
            int r3 = r1.length()
            if (r3 != 0) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            if (r2 == 0) goto L27
            goto Ld
        L27:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "username"
            java.lang.String r1 = r1.getQueryParameter(r2)     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r4.Ai(r1)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Ld
            kotlin.jvm.internal.o.d(r1)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
            goto Ld
        L3f:
            int r5 = r0.size()
            if (r5 <= 0) goto L6d
            com.tencent.mm.plugin.report.service.g0 r5 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r1 = 1342(0x53e, float:1.88E-42)
            r5.A(r1, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "triggerPrefetchMallIndexWeAppLinks list.size:"
            r5.<init>(r1)
            int r1 = r0.size()
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.PreDownloadServiceExportImpl"
            com.tencent.mars.xlog.Log.i(r1, r5)
            com.tencent.mm.plugin.appbrand.appcache.predownload.k1 r5 = com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75859a
            k91.h1 r1 = k91.h1.WALLET_MALL_INDEX
            com.tencent.mm.plugin.appbrand.appcache.predownload.f1 r2 = com.tencent.mm.plugin.appbrand.appcache.predownload.f1.f75843d
            r5.a(r0, r1, r2)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.predownload.u0.gd(java.util.List):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void h8(java.lang.String str, int i17) {
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().Q;
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        int length = strArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String str2 = strArr[i18];
            if (!(str2 == null || str2.length() == 0) && str2.equals(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "username[" + str + "] blacklist, just return");
                return;
            }
        }
        new com.tencent.mm.plugin.appbrand.appcache.predownload.o(str, null, null, i17, null, 16, null).s(false);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null) {
            a17.G("MicroMsg.AppBrand.PreDownloadServiceExportImpl.CanRetryOnGetCodeSequenceNotChangedForScene:15", true);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void x9(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.appbrand.launching.j6 j6Var = com.tencent.mm.plugin.appbrand.launching.x6.f85412a;
        com.tencent.mm.plugin.appbrand.launching.l6 l6Var = new com.tencent.mm.plugin.appbrand.launching.l6(i17, str, str2);
        j6Var.getClass();
        com.tencent.mm.plugin.appbrand.launching.e6 e6Var = new com.tencent.mm.plugin.appbrand.launching.e6(l6Var, new com.tencent.mm.plugin.appbrand.launching.d6(l6Var));
        java.util.Map map = com.tencent.mm.plugin.appbrand.launching.j6.f84693b;
        if (map instanceof java.util.concurrent.ConcurrentHashMap) {
            e6Var.invoke();
        } else {
            synchronized (map) {
                e6Var.invoke();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.service.s6
    public void z8(java.lang.String str, java.lang.String str2, int i17) {
        new com.tencent.mm.plugin.appbrand.appcache.predownload.o(str, str2, null, i17, null, 16, null).s(false);
    }
}
