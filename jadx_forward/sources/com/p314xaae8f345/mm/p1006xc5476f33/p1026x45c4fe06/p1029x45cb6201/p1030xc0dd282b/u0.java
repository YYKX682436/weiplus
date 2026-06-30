package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes7.dex */
public final class u0 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6 {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0 wi() {
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class);
        if (c17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0) c17;
        }
        return null;
    }

    public final boolean Ai(java.lang.String str) {
        return !(str == null || str.length() == 0) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.k(str);
    }

    public final void Bi(java.lang.String appId) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17;
        java.lang.String[] b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String concat = "MicroMsg.AppBrand.PreDownloadServiceExportImpl.extendLifespanForPreDownloadedPkgs:".concat(appId);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a18 != null && (b17 = a18.b()) != null) {
            for (java.lang.String str : b17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (r26.i0.y(str, concat, false)) {
                    linkedList.add(str);
                }
            }
        }
        if (linkedList.isEmpty() || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a()) == null) {
            return;
        }
        a17.X((java.lang.String[]) linkedList.toArray(new java.lang.String[0]));
    }

    public final java.lang.String Di(java.lang.String str, int i17) {
        return "MicroMsg.AppBrand.PreDownloadServiceExportImpl.extendLifespanForPreDownloadedPkgs:" + str + ':' + i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void K5(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if ((x6Var == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.r0.f157422a[x6Var.ordinal()]) == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157392a.a(list, k91.h1.SNS_TIMELINE_AD, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.f1.f157376d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWxaAttrs invalid PRELOAD_SCENE:" + x6Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void P4(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o(str, str2, str3, i17, null, 16, null).s(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void Q4() {
        if (Ai("gh_8c10d2f0f25e@app")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1342, 4);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_prefetch_weapp_data_weishi_chat_item, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchChattingItemWeishiVideoFakeNative");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157392a.a(kz5.b0.c("gh_8c10d2f0f25e@app"), k91.h1.CHATTING, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.f1.f157376d);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void Y4(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1342, 1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_prefetch_weapp_data_mall_index_functions, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchMallIndexWeAppV2 list.size:" + list.size());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157392a.a(list, k91.h1.WALLET_MALL_INDEX, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.f1.f157376d);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void a4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q6 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o(request.f170284a, request.f170285b, request.f170287d, request.f170286c, request.f170288e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.p6 p6Var = request.f170289f;
        if (p6Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(request.hashCode());
            sb6.append(':');
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            java.lang.String sb7 = sb6.toString();
            oVar.f157415x = sb7;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0.f157286a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb7);
            if (!(sb7.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0.f157287b.put(sb7, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.c0(sb7, p6Var));
            }
        }
        oVar.s(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void d4(java.lang.String str) {
        if (Ai(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1342, 2);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_prefetch_weapp_data_chat_item, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchChattingItemAppBrandPiece username:" + str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1 k1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157392a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                k1Var.a(kz5.b0.c(str), k91.h1.CHATTING, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.f1.f157376d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[EDGE_INSN: B:24:0x003f->B:25:0x003f BREAK  A[LOOP:0: B:5:0x000d->B:21:0x000d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
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
            kz5.p0 r5 = kz5.p0.f395529d
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
            goto Ld
        L3f:
            int r5 = r0.size()
            if (r5 <= 0) goto L6d
            com.tencent.mm.plugin.report.service.g0 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r1 = 1342(0x53e, float:1.88E-42)
            r5.A(r1, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "triggerPrefetchMallIndexWeAppLinks list.size:"
            r5.<init>(r1)
            int r1 = r0.size()
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.PreDownloadServiceExportImpl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            com.tencent.mm.plugin.appbrand.appcache.predownload.k1 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157392a
            k91.h1 r1 = k91.h1.WALLET_MALL_INDEX
            com.tencent.mm.plugin.appbrand.appcache.predownload.f1 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.f1.f157376d
            r5.a(r0, r1, r2)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0.gd(java.util.List):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void h8(java.lang.String str, int i17) {
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().Q;
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        int length = strArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String str2 = strArr[i18];
            if (!(str2 == null || str2.length() == 0) && str2.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "username[" + str + "] blacklist, just return");
                return;
            }
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o(str, null, null, i17, null, 16, null).s(false);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 != null) {
            a17.G("MicroMsg.AppBrand.PreDownloadServiceExportImpl.CanRetryOnGetCodeSequenceNotChangedForScene:15", true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void x9(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6 j6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x6.f166945a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6(i17, str, str2);
        j6Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.e6 e6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.e6(l6Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d6(l6Var));
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6.f166226b;
        if (map instanceof java.util.concurrent.ConcurrentHashMap) {
            e6Var.mo152xb9724478();
        } else {
            synchronized (map) {
                e6Var.mo152xb9724478();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6
    public void z8(java.lang.String str, java.lang.String str2, int i17) {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o(str, str2, null, i17, null, 16, null).s(false);
    }
}
