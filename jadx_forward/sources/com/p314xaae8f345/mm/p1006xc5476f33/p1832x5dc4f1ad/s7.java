package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes7.dex */
public final class s7 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f229654d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r7.f229647d);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16417x995ff49f f229655e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q7 f229656f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f229657g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f229658h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16418xd1d2da5f f229659i;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$entryConfigChangeListener$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$preCleanFileEvent$1] */
    public s7() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f229655e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21>(a0Var) { // from class: com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$entryConfigChangeListener$1
            {
                this.f39173x3fe91575 = 320120113;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 c5281xaccc9f21) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 event = c5281xaccc9f21;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event.f135605g.f88659a, "clicfg_magic_high_level_pkg")) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPkgFeatureService", "ConfigUpdatedEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7.this.Ui().getClass();
                return false;
            }
        };
        this.f229656f = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q7(this);
        this.f229657g = new java.util.HashMap();
        this.f229658h = new java.util.concurrent.ConcurrentHashMap();
        this.f229659i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de>(a0Var) { // from class: com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$preCleanFileEvent$1
            {
                this.f39173x3fe91575 = 1489935310;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de) {
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de event = c5189xf98047de;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.p0 p0Var = event.f135532g;
                boolean z17 = (p0Var.f89122a & 1) != 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPkgFeatureService", "hy: received clean event, flag is " + p0Var.f89122a + ", is system " + z17);
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPkgFeatureService", "hy: try clean up pkg managements.");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.AbstractC16413x682208b1.CleanUpPkgImplsEvent cleanUpPkgImplsEvent = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.AbstractC16413x682208b1.CleanUpPkgImplsEvent();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var).getClass();
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229371c && (str = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229376h) != null) {
                        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, cleanUpPkgImplsEvent, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.l5.class, null);
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).getClass();
                    java.util.Iterator it = ((java.util.ArrayList) jc3.u0.f380533e).iterator();
                    while (it.hasNext()) {
                        jc3.t a17 = ue3.c.f508425a.a((java.lang.String) it.next(), null);
                        if (a17 != null) {
                            ((ue3.f) a17).a();
                        }
                    }
                }
                return false;
            }
        };
    }

    public void Ai() {
        fe3.d.f343073a.a();
    }

    public void Bi(java.lang.String pkgId) {
        char c17;
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgId, "pkgId");
        fe3.d dVar = fe3.d.f343073a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "doCleanMagicPkg start");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd> e17 = fe3.j.b().e();
        if (e17 != null) {
            char c18 = 1;
            if (!e17.isEmpty()) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd : e17) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229391d)) {
                        c17 = c18;
                    } else {
                        java.lang.String pkgId2 = c16421xe4d4fcd.f229391d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkgId2, "pkgId");
                        synchronized (dVar) {
                            java.lang.String str = null;
                            jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicPkgSyncSTORAGE", null);
                            if (wi6 != null) {
                                java.lang.Object[] b17 = ((ue3.f) wi6).b("MagicPkgClean" + pkgId2);
                                java.lang.Object obj = b17[0];
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
                                lc3.z zVar = (lc3.z) obj;
                                if (zVar == lc3.x.f399467a) {
                                    java.lang.Object obj2 = b17[c18];
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                                    str = (java.lang.String) obj2;
                                }
                                long parseLong = str != null ? java.lang.Long.parseLong(str) : 0L;
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                long j17 = currentTimeMillis - parseLong;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "bizStillValid:%s,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s", pkgId2, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(parseLong), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(zVar.f399477a), zVar.f399478b);
                                if (j17 < 1209600000) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "bizStillValid %s It's not time to clean,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s", pkgId2, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(parseLong), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(zVar.f399477a), zVar.f399478b);
                                    i18 = 1;
                                    i17 = 0;
                                } else {
                                    i17 = 0;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "bizStillValid %s could clean,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s", pkgId2, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(parseLong), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(zVar.f399477a), zVar.f399478b);
                                }
                            } else {
                                i17 = 0;
                            }
                            i18 = i17;
                        }
                        if (i18 == 0) {
                            java.lang.String d17 = fe3.l.d(c16421xe4d4fcd.f229391d);
                            if (d17 != null) {
                                java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(d17, true);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i19);
                                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(i19));
                                if (r6Var.m()) {
                                    com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
                                    if (G != null) {
                                        int length = G.length;
                                        for (int i27 = i17; i27 < length; i27++) {
                                            com.p314xaae8f345.mm.vfs.r6 r6Var2 = G[i27];
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "local path:%s,pkg patchId:%s", r6Var2.u(), c16421xe4d4fcd.f229398n);
                                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.u(), com.p314xaae8f345.mm.vfs.w6.i(c16421xe4d4fcd.f229394g, true)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.u(), com.p314xaae8f345.mm.vfs.w6.i(c16421xe4d4fcd.f229395h, true))) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "delete old version folder.");
                                                com.p314xaae8f345.mm.vfs.w6.f(r6Var2.u());
                                                com.p314xaae8f345.mm.vfs.w6.h(r6Var2.u());
                                            }
                                        }
                                    } else {
                                        c17 = 1;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "files is empty");
                                    }
                                } else {
                                    c17 = 1;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "pkgId %s dir not exist", c16421xe4d4fcd.f229391d);
                                }
                                c18 = c17;
                            }
                            c17 = 1;
                            c18 = c17;
                        } else {
                            c17 = 1;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "pkgId %s is busy now", c16421xe4d4fcd.f229391d);
                    c18 = c17;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "doCleanMagicPkg end");
    }

    public java.lang.String Di() {
        java.lang.String b17 = fe3.l.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMagicDebugPkgRoot(...)");
        return b17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd Ni(java.lang.String pkgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgId, "pkgId");
        java.lang.String lowerCase = pkgId.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? fe3.j.b().c(lowerCase) : fe3.j.b().d(lowerCase);
        if (c17 != null) {
            synchronized (fe3.d.f343073a) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicPkgSyncSTORAGE", null);
                if (wi6 != null) {
                    lc3.z g17 = ((ue3.f) wi6).g("MagicPkgClean".concat(lowerCase), java.lang.String.valueOf(currentTimeMillis), "String");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "registBiz:%s,currentTime:%d,errNo:%d,errMsg:%s", lowerCase, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(g17.f399477a), g17.f399478b);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgCleaner", "registBiz:%s,fail mmkv is nil", lowerCase);
                }
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, "magicemo")) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? fe3.j.b().c(lowerCase) : (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(lowerCase), com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o7.class);
        }
        return c17;
    }

    public java.lang.String Ri() {
        fe3.j.b().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgVersion:%s", fe3.j.f343088b);
        java.lang.String str = fe3.j.f343088b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMagicPkgVersion(...)");
        return str;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.pkg.C16448x1cb9348a Ui() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.pkg.C16448x1cb9348a) ((jz5.n) this.f229654d).mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:8:0x0027, B:10:0x0050, B:12:0x005d, B:15:0x00cc, B:19:0x00d8, B:20:0x00e1, B:21:0x0066, B:22:0x006c, B:24:0x0076, B:27:0x0086, B:29:0x008c, B:31:0x0090, B:33:0x0097, B:34:0x0099, B:36:0x00c0), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8 A[Catch: all -> 0x00e4, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:8:0x0027, B:10:0x0050, B:12:0x005d, B:15:0x00cc, B:19:0x00d8, B:20:0x00e1, B:21:0x0066, B:22:0x006c, B:24:0x0076, B:27:0x0086, B:29:0x008c, B:31:0x0090, B:33:0x0097, B:34:0x0099, B:36:0x00c0), top: B:3:0x000d }] */
    /* JADX WARN: Type inference failed for: r12v3, types: [fe3.a] */
    /* JADX WARN: Type inference failed for: r12v6, types: [fe3.a] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [jc3.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized jc3.x Vi(java.lang.String r11, android.os.Parcelable r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7.Vi(java.lang.String, android.os.Parcelable):jc3.x");
    }

    public void Zi(java.lang.String pkgId, java.lang.String url, java.lang.String signature, java.lang.String op6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgId, "pkgId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            fe3.j.b().g(pkgId, url, signature, op6);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("pkgId", pkgId);
        bundle.putString("url", url);
        bundle.putString("signature", signature);
        bundle.putString("op", op6);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p7.class);
    }

    public void aj(java.lang.String pkgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgId, "pkgId");
        java.lang.String lowerCase = pkgId.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        Ui().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCheckerListener", "registerMagicPkg pkgId:%s", lowerCase);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        if (L == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicPkgCheckerListener", "getMultiDefault failed, sp is null.");
            return;
        }
        java.util.Set stringSet = L.getStringSet("MagicPkgPreLoadPkgId", new java.util.HashSet());
        if (!stringSet.contains(lowerCase)) {
            stringSet.add(lowerCase);
            L.putStringSet("MagicPkgPreLoadPkgId", stringSet);
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.pkg.C16448x1cb9348a.f229635d;
        if (copyOnWriteArraySet.contains(lowerCase)) {
            return;
        }
        copyOnWriteArraySet.add(lowerCase);
    }

    public void bj(java.lang.String bizName, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u7 impl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(impl, "impl");
        this.f229658h.put(bizName, impl);
    }

    public void cj(java.lang.String pkgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgId, "pkgId");
        java.lang.String lowerCase = pkgId.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        Ui().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCheckerListener", "unregisterMagicPkg pkgId:%s", lowerCase);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        if (L == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicPkgCheckerListener", "getMultiDefault failed, sp is null.");
            return;
        }
        java.util.Set stringSet = L.getStringSet("MagicPkgPreLoadPkgId", new java.util.HashSet());
        if (stringSet.contains(lowerCase)) {
            stringSet.remove(lowerCase);
            L.putStringSet("MagicPkgPreLoadPkgId", stringSet);
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.pkg.C16448x1cb9348a.f229635d;
        if (copyOnWriteArraySet.contains(lowerCase)) {
            copyOnWriteArraySet.remove(lowerCase);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPkgFeatureService", "onAccountInitialized call alive");
            Ui().mo48813x58998cd();
            mo48813x58998cd();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f229656f);
            mo48813x58998cd();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPkgFeatureService", "onAccountReleased call dead");
            Ui().mo48814x2efc64();
            mo48814x2efc64();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.f229656f);
            mo48814x2efc64();
        }
    }

    public boolean wi(java.lang.String pkgId, java.lang.String baseId, boolean z17, jc3.m0 m0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgId, "pkgId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseId, "baseId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return fe3.j.b().a(pkgId, baseId, z17, m0Var);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("pkgId", pkgId);
        bundle.putString("baseId", baseId);
        bundle.putBoolean("isAutoCheck", z17);
        return ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m7.class)).f149933d;
    }
}
