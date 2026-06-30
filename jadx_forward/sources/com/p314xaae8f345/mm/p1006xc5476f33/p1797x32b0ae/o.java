package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "copyLibs file " + r7);
        r2 = com.p314xaae8f345.mm.vfs.w6.N("assets:///LiteappBaseLib/" + r7, 0, -1);
        com.p314xaae8f345.mm.vfs.w6.u(r5.o());
        r8 = new com.p314xaae8f345.mm.vfs.r6(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (r8.m() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        r8.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        com.p314xaae8f345.mm.vfs.w6.R(r8.o(), r2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "copyBundlePackage path: %s", r8.o());
        com.p314xaae8f345.mm.p930xc01b152a.C11080x4adeb616.m47708xb232dc81(com.p314xaae8f345.mm.vfs.w6.i(r8.o(), false), com.p314xaae8f345.mm.vfs.w6.i(r1, true));
        r8.l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.LiteAppProcessProfileInit"
            java.lang.String r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.a()
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.AssetManager r2 = r2.getAssets()
            java.lang.String r3 = "LiteappBaseLib"
            java.lang.String[] r2 = r2.list(r3)
            r3 = 0
            if (r2 == 0) goto Ld0
            r4 = -1
            com.tencent.mm.plugin.lite.o r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = "LiteappBaseLib files count: %d"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lc5
            int r8 = r2.length     // Catch: java.lang.Exception -> Lc5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lc5
            r7[r3] = r8     // Catch: java.lang.Exception -> Lc5
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5, r7)     // Catch: java.lang.Exception -> Lc5
            boolean r5 = com.p314xaae8f345.mm.vfs.w6.j(r1)     // Catch: java.lang.Exception -> Lc5
            if (r5 == 0) goto L30
            com.p314xaae8f345.mm.vfs.w6.g(r1, r6)     // Catch: java.lang.Exception -> Lc5
        L30:
            com.p314xaae8f345.mm.vfs.w6.u(r1)     // Catch: java.lang.Exception -> Lc5
            com.tencent.mm.vfs.r6 r5 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> Lc5
            android.content.Context r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Exception -> Lc5
            java.io.File r7 = r7.getCacheDir()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = "liteapp"
            r5.<init>(r7, r8)     // Catch: java.lang.Exception -> Lc5
            java.util.Iterator r2 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(r2)     // Catch: java.lang.Exception -> Lc5
        L44:
            r7 = r2
            kotlin.jvm.internal.b r7 = (p3321xbce91901.jvm.p3324x21ffc6bd.b) r7     // Catch: java.lang.Exception -> Lc5
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> Lc5
            if (r8 == 0) goto Ld0
            java.lang.Object r7 = r7.next()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> Lc5
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = ".7z"
            boolean r8 = r26.i0.n(r7, r8, r3)     // Catch: java.lang.Exception -> Lc5
            if (r8 == 0) goto L44
            com.tencent.mm.plugin.lite.o r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a     // Catch: java.lang.Exception -> Lc5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc5
            r2.<init>()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = "copyLibs file "
            r2.append(r8)     // Catch: java.lang.Exception -> Lc5
            r2.append(r7)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Exception -> Lc5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc5
            r2.<init>()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = "assets:///LiteappBaseLib/"
            r2.append(r8)     // Catch: java.lang.Exception -> Lc5
            r2.append(r7)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            byte[] r2 = com.p314xaae8f345.mm.vfs.w6.N(r2, r3, r4)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = r5.o()     // Catch: java.lang.Exception -> Lc5
            com.p314xaae8f345.mm.vfs.w6.u(r8)     // Catch: java.lang.Exception -> Lc5
            com.tencent.mm.vfs.r6 r8 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> Lc5
            r8.<init>(r5, r7)     // Catch: java.lang.Exception -> Lc5
            boolean r5 = r8.m()     // Catch: java.lang.Exception -> Lc5
            if (r5 == 0) goto L9e
            r8.l()     // Catch: java.lang.Exception -> Lc5
        L9e:
            java.lang.String r5 = r8.o()     // Catch: java.lang.Exception -> Lc5
            com.p314xaae8f345.mm.vfs.w6.R(r5, r2)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = "copyBundlePackage path: %s"
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lc5
            java.lang.String r7 = r8.o()     // Catch: java.lang.Exception -> Lc5
            r5[r3] = r7     // Catch: java.lang.Exception -> Lc5
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2, r5)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = r8.o()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = com.p314xaae8f345.mm.vfs.w6.i(r2, r3)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = com.p314xaae8f345.mm.vfs.w6.i(r1, r6)     // Catch: java.lang.Exception -> Lc5
            com.p314xaae8f345.mm.p930xc01b152a.C11080x4adeb616.m47708xb232dc81(r2, r1)     // Catch: java.lang.Exception -> Lc5
            r8.l()     // Catch: java.lang.Exception -> Lc5
            goto Ld0
        Lc5:
            r1 = move-exception
            com.tencent.mm.plugin.lite.o r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a
            java.lang.String r2 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r2, r3)
            return r4
        Ld0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o.a():int");
    }

    public final com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 b(int i17, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 reportLiteApp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportLiteApp, "reportLiteApp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "doInit");
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225683b;
            if (atomicBoolean.get()) {
                com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = reportLiteApp.I;
                if (abstractC3700xe41a2874 != null) {
                    abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.BASE_ENVIRONMENT_PRELOADED);
                    reportLiteApp.I.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_BASE_ENVIRONMENT_SUCCESS);
                }
                reportLiteApp.f127546w = true;
                reportLiteApp.f127543t = true;
                if (i17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1404, 1);
                } else if (i17 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1404, 3);
                }
                reportLiteApp.f127534h = true;
                return reportLiteApp;
            }
            atomicBoolean.set(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225688g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(com.p314xaae8f345.mm.p642xad8b531f.s.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).a(".com.tencent.mm.debug.liteapp.not.use.bundle.package"), false);
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28742 = reportLiteApp.I;
            if (abstractC3700xe41a28742 != null) {
                abstractC3700xe41a28742.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_BASE_ENVIRONMENT);
            }
            reportLiteApp.f127533g = true;
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28743 = reportLiteApp.I;
            if (abstractC3700xe41a28743 != null) {
                abstractC3700xe41a28743.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.BASE_ENVIRONMENT_NOT_PRELOADED);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "real doInit");
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stackTrace);
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", stackTraceElement.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225684c) {
                oVar4.e(reportLiteApp);
            }
            oVar4.c(reportLiteApp);
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28744 = reportLiteApp.I;
            if (abstractC3700xe41a28744 != null) {
                abstractC3700xe41a28744.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_BASE_ENVIRONMENT_SUCCESS);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1404, i17);
            reportLiteApp.f127546w = false;
            reportLiteApp.f127543t = false;
            reportLiteApp.f127534h = false;
            return reportLiteApp;
        }
    }

    public final void c(com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
        q93.g gVar;
        p93.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "start init lvcpp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(com.p314xaae8f345.mm.ui.bk.C());
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65442xd8c9faef("wxalitec8a16f9bf80f65dffb97cdf7760c1142", "debugPannel", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1805xc04ba66c.C16216x4ebdc024.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65441xd8c9faef("gyroscope", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16196x79048106.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65441xd8c9faef("motion", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16197x801c1355.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65441xd8c9faef("nfc", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.nfc.hce.C16230x33263ac4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65441xd8c9faef("secure", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1811xc9fb5b77.C16231x584d7ad6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65441xd8c9faef("wx", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c.C16198xd98a0a00.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("login", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("session", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("startWebView", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openUserProfile", (java.lang.Class<? extends jd.b>) y93.c.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("doGoToRecVideoList", (java.lang.Class<? extends jd.b>) y93.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l.f34522x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("sendAppMessage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("sendTextMessage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openWeClawChatPage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("webSendAppMessage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1.f34800x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("webShareTimeline", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFinderView", (java.lang.Class<? extends jd.b>) t93.u.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openChannelsFinderSetting", (java.lang.Class<? extends jd.b>) t93.i.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("preloadFinderFeed", (java.lang.Class<? extends jd.b>) t93.v.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("handleFinderJump", (java.lang.Class<? extends jd.b>) t93.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("addContact", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("preloadMiniProgramContacts", (java.lang.Class<? extends jd.b>) n93.d.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("preloadMiniProgramEnv", (java.lang.Class<? extends jd.b>) n93.e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cf.f33974x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("batchAddCard", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("calRqt", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("jumpToBizProfile", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFinderTopicView", (java.lang.Class<? extends jd.b>) t93.t.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFinderPostView", (java.lang.Class<? extends jd.b>) t93.p.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getFinderLivePreviewUrl", (java.lang.Class<? extends jd.b>) t93.e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFinderCreateAcctView", (java.lang.Class<? extends jd.b>) t93.l.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFinderCreateContactHalfVC", (java.lang.Class<? extends jd.b>) t93.n.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc.f.f34010x24728b, (java.lang.Class<? extends jd.b>) t93.h.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b, (java.lang.Class<? extends jd.b>) t93.q.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.g0.f34295x24728b, (java.lang.Class<? extends jd.b>) t93.j.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFinderSearchView", (java.lang.Class<? extends jd.b>) t93.r.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFinderTimeLineView", (java.lang.Class<? extends jd.b>) t93.s.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getFinderAliasInfos", (java.lang.Class<? extends jd.b>) t93.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("prerenderMiniProgram", (java.lang.Class<? extends jd.b>) n93.c.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("verifiyWXPassword", (java.lang.Class<? extends jd.b>) t93.w.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("webTransfer", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("downloadGameVideo", (java.lang.Class<? extends jd.b>) u93.b.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getFinderLivePreviewMicCover", (java.lang.Class<? extends jd.b>) t93.c.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("uploadGameMediaFile", (java.lang.Class<? extends jd.b>) u93.n.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65250xb52dd7f0("wxalite5d5719b5b15738e645a321789ebccb5d", "getUin", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("startGameLifeConversation", (java.lang.Class<? extends jd.b>) u93.l.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openGameLifeChatroom", (java.lang.Class<? extends jd.b>) u93.i.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("quitGameLifeChatroom", (java.lang.Class<? extends jd.b>) u93.k.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("chatRoomAtMember", (java.lang.Class<? extends jd.b>) u93.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getAccountInfo", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("setBackgroundAudioStateMV", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16204xdf32d8d6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33786x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16201xcbb38761.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("extTransfer", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c0.f34048x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.z0.f34323x24728b, (java.lang.Class<? extends jd.b>) t93.y.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getLiveInfo", (java.lang.Class<? extends jd.b>) t93.a0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("liveCustomBusiness", (java.lang.Class<? extends jd.b>) t93.g.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.v.f34317x24728b, (java.lang.Class<? extends jd.b>) t93.b0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openYuanbaoGenImage", (java.lang.Class<? extends jd.b>) v93.d.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getAdInfoWithPosId", (java.lang.Class<? extends jd.b>) v93.b.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("reportAdWithPosId", (java.lang.Class<? extends jd.b>) v93.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("postDataToMiniProgram", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("closeWindow", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f0.f34289x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getMsgProofItems", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(dc1.e.f65820x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("doExposePreparation", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("chooseChatRoomMember", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("privateGetContext", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("selectBank", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p6.class);
        if (i95.n0.c(s43.k.class) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.e0) ((s43.k) i95.n0.c(s43.k.class))).getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33753x24728b, z43.f.class);
            hashMap.put("bookDownloadGame", z43.h.class);
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.x.f33757x24728b, z43.i.class);
            hashMap.put("getDownloadWidgetTaskInfos", z43.k.class);
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.f33725x24728b, z43.m.class);
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33741x24728b, z43.q.class);
            hashMap.put("jumpDownloaderWidget", z43.s.class);
            hashMap.put("launchApplication", z43.x.class);
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33727x24728b, z43.d0.class);
            hashMap.put("openGameUrlWithExtraWebView", z43.a0.class);
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l1.f33739x24728b, z43.f0.class);
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pc.f34669x24728b, z43.i0.class);
            hashMap.put("startGameWebview", z43.q0.class);
            hashMap.put("startGameWebView", z43.q0.class);
            hashMap.put("openGameCenter", z43.y.class);
            hashMap.put("openGameTabHome", z43.z.class);
            ((ee0.x3) ((fe0.x3) i95.n0.c(fe0.x3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNameOfLiteAppJsApiOpenAdCanvas", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNameOfLiteAppJsApiOpenAdCanvas", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            ((ee0.x3) ((fe0.x3) i95.n0.c(fe0.x3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClassOfLiteAppJsApiOpenAdCanvas", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClassOfLiteAppJsApiOpenAdCanvas", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            hashMap.put("openAdCanvas", b64.u.class);
            hashMap.put("sendGameShareCard", z43.k0.class);
            hashMap.put("sendGameNameCard", z43.j0.class);
            hashMap.put("gameShareTimeline", z43.j.class);
            hashMap.put("showInputToolView", z43.p0.class);
            hashMap.put("initGameLiteApp", z43.o.class);
            hashMap.put("setGameTab", z43.l0.class);
            hashMap.put("handleGameTabNavigationEvent", z43.n.class);
            hashMap.put("showCloudGameUI", z43.n0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65254xb52dd7f0((java.util.Map<java.lang.String, java.lang.Class>) hashMap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonReward", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonSingleStatus", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenDetailVC", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenBrowseVC", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonSingleOperation", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonBoardUpdateSearchText", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonStoreStatus", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonStoreOperation", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonDetailPageShare", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonUsePackInChat", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("setSearchTagResult", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenRewardCharts", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenSelfie", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenStoreBegReward", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenHalfScreenSendView", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonStartSelect", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonStopSelect", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("enterEmojiStore", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonGetDesc", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonGetSingleEmotionPath", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonIPPageShare", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonDesignerProfileShare", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenManageVC", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenFullScreenSearch", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonOpenChartsVC", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonIsRewardClose", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonGetEmoticonDetail", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonGetEmoticonDesigner", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonDoMoreAction", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonPackButtonDesc", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("preDownloadLiteApp", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("preloadVideo", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5.f34506x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("editImage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("saveToPhotosAlbum", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("sendFileMessage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65253xb52dd7f0((java.util.HashMap<java.lang.String, jd.b>) o93.i.b().f425265c.f425261a);
        synchronized (q93.g.class) {
            if (q93.g.f442451d == null) {
                q93.g.f442451d = new q93.g();
            }
            gVar = q93.g.f442451d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65254xb52dd7f0((java.util.Map<java.lang.String, java.lang.Class>) gVar.f442452a.f442449a);
        synchronized (p93.d.class) {
            if (p93.d.f434424d == null) {
                p93.d.f434424d = new p93.d();
            }
            dVar = p93.d.f434424d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65254xb52dd7f0((java.util.Map<java.lang.String, java.lang.Class>) dVar.f434425a.f434422a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("showTingWecoinPayPanel", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("platformViewTapEvent", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getUserInfo", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("sdkCgiReport", (java.lang.Class<? extends jd.b>) w93.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getImageInfo", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("changeViewStatus", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("preloadPag", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("sendSms", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("limitedModeStatus", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("compressImage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getLiteAppPackageInfo", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("releaseKeepAlive", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getThemeColorForImage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonStartSelectV2", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonStopSelectV2", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonEnableSendButtonV2", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getServerTime", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openWeRun", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getWeRunStatus", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.f.f34400x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openGameDetail", (java.lang.Class<? extends jd.b>) u93.h.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k2.f34492x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("shareMediaToTimeline", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFinderMovieEditor", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a8.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getGameCenterEntranceState", (java.lang.Class<? extends jd.b>) u93.c.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openGameCenterEntrance", (java.lang.Class<? extends jd.b>) u93.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getBindPhoneState", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("startBindPhone", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("nativeShareToGameLive", (java.lang.Class<? extends jd.b>) u93.e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("recognizeQRCode", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16203x735a887e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("handleQRCode", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("fetchQRCodeInfo", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("sendMessageToSource", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("reportCustomEvent", (java.lang.Class<? extends jd.b>) r93.b.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("reportCustomCgiEvent", (java.lang.Class<? extends jd.b>) r93.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openGamePluginSettingPage", (java.lang.Class<? extends jd.b>) u93.j.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("loadMoreGamePluginMessages", (java.lang.Class<? extends jd.b>) u93.d.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("requestPreviewFileInfo", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("requestPreviewFileImage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("startDownloadChatFile", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("pauseDownloadChatFile", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("queryChatFileStatus", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("fetchW1wPersonalMsgReddot", (java.lang.Class<? extends jd.b>) z93.b.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("joinChatBotRoom", (java.lang.Class<? extends jd.b>) n93.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openW1wPersonalMsgChatListPage", (java.lang.Class<? extends jd.b>) z93.c.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openW1wPersonalMsgChatPage", (java.lang.Class<? extends jd.b>) z93.d.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openBizTimelinePublish", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("changeW1wPersonalMsgSwitch", (java.lang.Class<? extends jd.b>) z93.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openCTID", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openFilePicker", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ue.f34911x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("processImage", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonStorePersonalCenterPageRoute", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("getEmoticonPersonalCenterPageConfig", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(me1.c.f72883x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34134x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonPostedFinish", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("bindPhone", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.s.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("emoticonPatchGetEmotionList", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("checkVideoIsHDR", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openMessageFileToThirdApp", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("locateToChatPosition", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openMessageFileSource", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openMessageFileToPc", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.c2.f34186x24728b, (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.y5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("operateSaveFile", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("querySaveFileStatus", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("queryAddFileFavStatus", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("operateAddFileFav", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p4.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("addFileToFavorites", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("addScreenshotShareItem", (java.lang.Class<? extends jd.b>) x93.a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0("openShortLink", (java.lang.Class<? extends jd.b>) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g4.class);
        if (i95.n0.c(q80.q.class) != null) {
            ((ku5.t0) ku5.t0.f394148d).g(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.i.f225007d);
        }
        if (i95.n0.c(fe0.x3.class) != null) {
            ((ee0.x3) ((fe0.x3) i95.n0.c(fe0.x3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerAdLiteAppJsApis", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            d64.a aVar = d64.a.f308312a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("register", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
            try {
                if (d64.a.f308313b.compareAndSet(0, 1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.Register", "the ad lite app registered");
                    d64.a aVar2 = d64.a.f308312a;
                    aVar2.a();
                    aVar2.b();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Register", "the register has error, " + th6.getMessage());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerAdLiteAppJsApis", "com.tencent.mm.feature.sns.LiteAppJsApiService");
        }
        if (i95.n0.c(z30.x.class) != null) {
            ((el.e) ((z30.x) i95.n0.c(z30.x.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65254xb52dd7f0((java.util.Map<java.lang.String, java.lang.Class>) kz5.b1.e(new jz5.l("favoriteAction", el.k.class)));
        }
        if (i95.n0.c(su4.f1.class) != null) {
            ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65254xb52dd7f0((java.util.Map<java.lang.String, java.lang.Class>) kz5.c1.k(new jz5.l("removeMinimizeTask", cv4.r.class), new jz5.l("isTaskMinimized", cv4.l.class), new jz5.l("isMinimizeTaskEnabled", cv4.k.class), new jz5.l("addMinimizeTask", cv4.b.class), new jz5.l("getSearchData", cv4.h.class), new jz5.l("getSearchSuggestionData", cv4.i.class), new jz5.l("querySearchWeb", cv4.o.class), new jz5.l("getPermanentData", cv4.g.class), new jz5.l("removePermanentData", cv4.s.class), new jz5.l("savePermanentData", cv4.y.class), new jz5.l("getTeachSearchData", cv4.j.class), new jz5.l("reportSearchRealTimeStatistics", cv4.t.class), new jz5.l("reportSearchStatistics", cv4.u.class), new jz5.l("fetchUniformReddot", cv4.d.class), new jz5.l("fetchUniformReddotList", cv4.e.class), new jz5.l("disposeUniformReddot", cv4.c.class), new jz5.l("observeUniformReddot", cv4.n.class), new jz5.l("getExpConfig", cv4.f.class), new jz5.l("systemCapabilityAuthorizationStatus", cv4.a0.class), new jz5.l("requestSystemCapabilityAuthorization", cv4.x.class), new jz5.l("registerNativeEventMonitor", cv4.q.class), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.le.f34433x24728b, cv4.z.class)));
        }
        if (i95.n0.c(tg0.j1.class) != null) {
            ((ux4.j) ((tg0.j1) i95.n0.c(tg0.j1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65254xb52dd7f0((java.util.Map<java.lang.String, java.lang.Class>) kz5.c1.k(new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9.f34361x24728b, ux4.e.class), new jz5.l("updateSearchReddotTimeStamps", ux4.i.class), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.me.f34458x24728b, ux4.h.class), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gb.f34339x24728b, ux4.f.class), new jz5.l("removePreloadWebSearchPage", ux4.g.class)));
        }
        if (i95.n0.c(pm4.t.class) != null) {
            ((lf0.d0) ((pm4.t) i95.n0.c(pm4.t.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65254xb52dd7f0((java.util.Map<java.lang.String, java.lang.Class>) kz5.c1.k(new jz5.l("queryWebCommCgi", um4.a.class), new jz5.l("getTopStoryTabConfig", um4.f.class), new jz5.l("searchDataHasResult", um4.m.class), new jz5.l("getSearchDisplayNameList", um4.e.class), new jz5.l("getK1KData", um4.c.class), new jz5.l("openK1KWebview", um4.l.class), new jz5.l("startSearchItemDetailPage", um4.p.class), new jz5.l(be1.z.f4243x24728b, um4.d.class), new jz5.l("showNavBarShadow", um4.o.class), new jz5.l("hideNavBarShadow", um4.h.class), new jz5.l("k1kContainerCommand", um4.k.class), new jz5.l("batchGetUserIcon", um4.b.class)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65249xb52dd7f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.m.f34130x24728b, (java.lang.Class<? extends jd.b>) s93.b.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int j17 = com.p314xaae8f345.mm.ui.bl.j(context);
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        int i17 = displayMetrics.densityDpi;
        float f17 = displayMetrics.density;
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(context);
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation;
        if (i18 == 2) {
            h17 = new android.graphics.Point(h17.y, h17.x);
        }
        int i19 = h17.x;
        int i27 = h17.y;
        float f18 = 48 * f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37161xa0784b6e = displayMetrics;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "SetDisplayParams w=%d h=%d screen=%d,%d, density=%f dpi=%d, statusBar=%d actionBarHeight:%f, navigationBarHeight:%d, orientation:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(h17.x), java.lang.Integer.valueOf(h17.y), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(j17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65466xde3207a6(0L, i19 / f17, i27 / f17, h17.x / f17, h17.y / f17, i17, f17, f18 / f17, j17 / f17, c17 / f17);
        c3707xe60c5943.f127547x = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        java.lang.Object liteAppBaseLibLock = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225481b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liteAppBaseLibLock, "liteAppBaseLibLock");
        synchronized (liteAppBaseLibLock) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTable");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.a();
            if (oVar3.a() != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTable copyLibs error.");
            } else {
                com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().u(abstractC3700xe41a2874);
                java.lang.String m65306xf20fbaf6 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65306xf20fbaf6(a17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTable local: " + u17 + ", assetsVersion: " + m65306xf20fbaf6);
                if (u17 == null) {
                    oVar3.g(abstractC3700xe41a2874);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225685d = true;
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65520x18714402(m65306xf20fbaf6, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65306xf20fbaf6(com.p314xaae8f345.mm.vfs.w6.i(u17.f14330x346425, false)))) {
                    oVar3.g(abstractC3700xe41a2874);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225685d = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225685d = true;
                }
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225688g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateLiteAppTable ignore.");
        } else {
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225687f;
            map.put("wxalite71e155e932f19de48da8333a8f225708", "0.0.33");
            map.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.WX_PAY_CASHIER_LITE_APP_ID, com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.KINDA_LITE_INNER_VERSION);
        }
        c3707xe60c5943.f127548y = java.lang.System.currentTimeMillis() - c3707xe60c5943.f127547x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "end init lvcpp");
    }

    public final void d() {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef t17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().t(null);
        if (t17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppProcessProfileInit", "latestLiteAppBaselibInfo is null!");
            return;
        }
        if (t17.m28992x7a994349()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "preload base lib using rdm version");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65480x764e93a7(com.p314xaae8f345.mm.vfs.w6.i(t17.f14330x346425, false), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395);
            return;
        }
        java.lang.String str = t17.f14330x346425;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65480x764e93a7(com.p314xaae8f345.mm.vfs.w6.i(str, false), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppProcessProfileInit", "baselibFile not exists!");
        }
    }

    public final void e(com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 reportLiteApp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportLiteApp, "reportLiteApp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "setupLiteApp");
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226044n;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37148xf582434a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65494x4587863a(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w());
            com.p314xaae8f345.mm.app.q5.b().a(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.q0());
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37148xf582434a = true;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        zc.b bVar = new zc.b(context, "liteApp");
        bVar.f552859e = false;
        kd.c.f388127a = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.j();
        reportLiteApp.f127544u = java.lang.System.currentTimeMillis();
        i95.m c17 = i95.n0.c(k12.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        h12.g gVar = (h12.g) ((k12.t) c17);
        jSONObject.put("SystemEmojiResPath", gVar.Di());
        jSONObject.put("QQSmileyDirPath", gVar.Bi());
        jSONObject.put("NewSmileyDirPath", gVar.Ai());
        jSONObject.put("EmojiPanelConfigPath", gVar.wi());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("initParams", jSONObject);
        java.lang.String jSONObject3 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        bVar.f552860f = kz5.b0.c(jSONObject3);
        kx5.n.h().f394855l = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.k();
        if (j62.e.g().l("clicfg_liteapp_engine_group_enable", true, true, true)) {
            kx5.n.h().f394854k = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.m();
        }
        zc.c.f552871a = bVar;
        android.content.Context context2 = bVar.f552855a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "<set-?>");
        zc.c.f552872b = context2;
        zc.b bVar2 = zc.c.f552871a;
        if (bVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        java.lang.String packageName = bVar2.f552855a.getPackageName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName, "getPackageName(...)");
        zc.c.f552873c = packageName;
        zc.b bVar3 = zc.c.f552871a;
        if (bVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        kx5.h hVar = new kx5.h(bVar3.f552855a);
        ad.a aVar = new ad.a();
        java.util.HashSet hashSet = hVar.f394837b;
        if (!hashSet.contains(aVar)) {
            hashSet.add(aVar);
        }
        hVar.f394836a = bVar3.f552856b;
        hVar.f394839d.addAll(bVar3.f552858d);
        hVar.f394838c = new zc.a();
        zc.b bVar4 = zc.c.f552871a;
        if (bVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bVar4.f552859e);
        if (zc.c.f552871a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        hVar.f394841f = bVar3.f552860f;
        kx5.n nVar = bVar3.f552857c;
        nVar.f394844a = hVar;
        nx5.b bVar5 = hVar.f394838c;
        if (bVar5 != null) {
            nx5.c.f422899a = bVar5;
        }
        if (valueOf.booleanValue()) {
            nVar.m();
        }
        reportLiteApp.f127545v = java.lang.System.currentTimeMillis() - reportLiteApp.f127544u;
        es.k.f337801a = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.n();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225684c = true;
    }

    public final com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef f(com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        java.lang.Object liteAppBaseLibLock = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225481b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liteAppBaseLibLock, "liteAppBaseLibLock");
        synchronized (liteAppBaseLibLock) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTableUseAsset");
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225685d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "hasUpdateBaseLibTable is false, ignore.");
                return null;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
            if (oVar.a() != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTable copyLibs error.");
                return null;
            }
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef g17 = oVar.g(abstractC3700xe41a2874);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTableUseAsset Execution time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            return g17;
        }
    }

    public final com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef g(com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.COPY_BUILTIN_BASE_LIBRARY);
        }
        try {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.a();
            java.lang.String m65306xf20fbaf6 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65306xf20fbaf6(a17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m65306xf20fbaf6);
            java.lang.String substring = m65306xf20fbaf6.substring(0, r26.n0.K(m65306xf20fbaf6, '.', 0, false, 6, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef();
            c3710x879b31ef.f14328xdbd3ccdf = substring;
            c3710x879b31ef.f14330x346425 = a17;
            c3710x879b31ef.f14334x14f51cd8 = m65306xf20fbaf6;
            c3710x879b31ef.f14332x368f3a = "bundle";
            c3710x879b31ef.f14333xee5c7336 = java.lang.System.currentTimeMillis() / 1000;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibUseAsset assetsVersion: " + m65306xf20fbaf6 + ", bundlePath: " + a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().U(c3710x879b31ef);
            d();
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.COPY_BUILTIN_BASE_LIBRARY_SUCCESS);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "Preload base lib use asset, path:" + a17);
            return c3710x879b31ef;
        } catch (java.lang.Exception e17) {
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.COPY_BUILTIN_BASE_LIBRARY_FAILED);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppProcessProfileInit", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
