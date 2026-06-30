package aw1;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final aw1.m f14589a = new aw1.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f14590b = kz5.p1.e("/image2/", "/video/", "/voice2/", "/attachment/", "/record/");

    /* renamed from: c, reason: collision with root package name */
    public static final int f14591c = 31328;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14592d = 10000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14593e = 10001;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14594f = 10002;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14595g = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14596h = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14597i = 10005;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14598j = 20001;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14599k = 20002;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14600l = 20003;

    /* renamed from: m, reason: collision with root package name */
    public static final int f14601m = 20004;

    /* renamed from: n, reason: collision with root package name */
    public static final int f14602n = 20005;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f14603o = {com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "bizchatmessage", "appbrandmessage", "gamelifemessage", "bizfansmessage", "picfansmsg", "findermessage006", "w1wmessage"};

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f14604p = "C2CWildFileStack";

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f14605q = "C2CWildFileTime";

    public static final boolean a(aw1.m mVar, long j17) {
        boolean z17;
        mVar.getClass();
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        return z17 || java.lang.System.currentTimeMillis() - j17 > 604800000;
    }

    public static java.util.List i(aw1.m mVar, java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        mVar.getClass();
        com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b(str);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "attachmentFs == null");
            return null;
        }
        java.lang.Iterable p17 = com.tencent.mm.vfs.e8.p(b17, "", false, null);
        if (p17 != null) {
            return com.tencent.mm.vfs.e8.k(p17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "fileEntries == null");
        return null;
    }

    public final synchronized void b(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        int i17;
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mm.sdk.platformtools.o4 o4Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "checkNewWildFileFromMMKV");
        if (!l()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "checkNewWildFileFromMMKV, expt false return");
            return;
        }
        if (cancellationSignal == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "checkNewWildFileFromMMKV cs is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J(f14604p, gm0.j1.b().h(), 1);
        com.tencent.mm.sdk.platformtools.o4 J3 = com.tencent.mm.sdk.platformtools.o4.J(f14605q, gm0.j1.b().h(), 1);
        java.lang.String[] b17 = J2.b();
        kotlin.jvm.internal.o.f(b17, "allKeys(...)");
        int length = b17.length;
        int i18 = 0;
        while (i18 < length) {
            int i19 = length;
            java.lang.String str = b17[i18];
            kotlin.jvm.internal.o.d(str);
            java.lang.String[] strArr = b17;
            com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(r26.n0.Z(str, "⌖"));
            if (m17 == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                i17 = i18;
                sb6.append("onFileOpen, isC2CPath, path = ");
                sb6.append(str);
                sb6.append(", fe is null");
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", sb6.toString());
                J2.remove(str);
                J3.remove(str);
                o4Var2 = J2;
                o4Var = J3;
            } else {
                i17 = i18;
                if (m17 instanceof com.tencent.mm.vfs.k5) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "onFileOpen, isC2CPath fe.isLink = " + (m17 instanceof com.tencent.mm.vfs.k5));
                    J2.remove(str);
                    J3.remove(str);
                    o4Var2 = J2;
                    o4Var = J3;
                    arrayList10 = arrayList10;
                } else {
                    java.util.ArrayList arrayList11 = arrayList10;
                    java.lang.String string = J2.getString(str, "");
                    long j17 = J3.getLong(str, 0L);
                    o4Var = J3;
                    o4Var2 = J2;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.util.ArrayList arrayList12 = arrayList5;
                    sb7.append("path = ");
                    sb7.append(str);
                    sb7.append(", time = ");
                    sb7.append(j17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", sb7.toString());
                    if (r26.n0.B(str, "/image2/", false)) {
                        arrayList.add(m17);
                        arrayList6.add(new jz5.o(str, string, java.lang.Long.valueOf(j17)));
                    } else if (r26.n0.B(str, "/video/", false)) {
                        arrayList2.add(m17);
                        arrayList7.add(new jz5.o(str, string, java.lang.Long.valueOf(j17)));
                    } else if (r26.n0.B(str, "/voice2/", false)) {
                        arrayList3.add(m17);
                        arrayList8.add(new jz5.o(str, string, java.lang.Long.valueOf(j17)));
                    } else if (r26.n0.B(str, "/attachment/", false)) {
                        arrayList4.add(m17);
                        arrayList9.add(new jz5.o(str, string, java.lang.Long.valueOf(j17)));
                    } else if (r26.n0.B(str, "/record/", false)) {
                        arrayList5 = arrayList12;
                        arrayList5.add(m17);
                        jz5.o oVar = new jz5.o(str, string, java.lang.Long.valueOf(j17));
                        arrayList10 = arrayList11;
                        arrayList10.add(oVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "record path = " + str + ", trace = " + string);
                    }
                    arrayList10 = arrayList11;
                    arrayList5 = arrayList12;
                }
            }
            i18 = i17 + 1;
            length = i19;
            b17 = strArr;
            J3 = o4Var;
            J2 = o4Var2;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var3 = J2;
        com.tencent.mm.sdk.platformtools.o4 o4Var4 = J3;
        java.util.Iterator it = kz5.c0.n(kz5.c0.i(new aw1.b(arrayList, cancellationSignal, arrayList6), new aw1.c(arrayList2, cancellationSignal, arrayList7), new aw1.d(arrayList4, cancellationSignal, arrayList9), new aw1.e(arrayList5, cancellationSignal, arrayList10), new aw1.f(arrayList3, cancellationSignal, arrayList8)), c06.e.f37716d).iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
        o4Var3.d();
        o4Var4.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.tencent.wcdb.support.CancellationSignal r34, java.util.List r35, java.util.List r36) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.m.c(com.tencent.wcdb.support.CancellationSignal, java.util.List, java.util.List):void");
    }

    public final void d(com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.List list, java.util.List list2) {
        int i17;
        int i18;
        long j17;
        long j18;
        int i19;
        long j19;
        android.database.Cursor S0;
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "imageClean starting...");
        if (list == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J(f14604p, gm0.j1.b().h(), 1);
        com.tencent.mm.sdk.platformtools.o4 J3 = com.tencent.mm.sdk.platformtools.o4.J(f14605q, gm0.j1.b().h(), 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "imageClean, fileEntryList.size = " + list.size());
        m11.l0 Di = m11.b1.Di();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.lang.String[] strArr = f14603o;
        int length = strArr.length;
        int i27 = 0;
        boolean z17 = false;
        while (i27 < length) {
            final java.lang.String str = strArr[i27];
            final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            java.lang.String[] strArr2 = strArr;
            int i28 = length;
            boolean z18 = z17;
            final java.lang.String[] strArr3 = {"msgId", "msgSvrId", "talker", "imgPath"};
            final java.lang.String str2 = "THUMBNAIL_DIRPATH://";
            if (cj6.Da(str)) {
                final int i29 = 3;
                j19 = currentTimeMillis;
                S0 = ot0.c3.l().c("getMsgByTypeAndImgPathForSomeCols", new yz5.a() { // from class: com.tencent.mm.storage.g9$$l0
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return ot0.z2.f348822a.S0(com.tencent.mm.storage.g9.this.f193989r, str, strArr3, i29, str2);
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$m0
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.String str3 = str;
                        java.lang.String[] strArr4 = strArr3;
                        return com.tencent.mm.storage.g9.this.f193989r.E(str3, strArr4, "type=" + i29 + " OR imgPath LIKE '" + str2 + "%'", null, null, null, null);
                    }
                });
            } else {
                j19 = currentTimeMillis;
                S0 = cj6.Pb(str) ? ot0.z2.f348822a.S0(cj6.f193989r, str, strArr3, 3, "THUMBNAIL_DIRPATH://") : cj6.f193989r.E(str, strArr3, "type=3 OR imgPath LIKE 'THUMBNAIL_DIRPATH://%'", null, null, null, null);
            }
            while (true) {
                if (!S0.moveToNext()) {
                    z17 = z18;
                    break;
                }
                if (cancellationSignal.isCanceled()) {
                    z17 = true;
                    break;
                }
                long j27 = S0.getLong(0);
                long j28 = S0.getLong(1);
                java.lang.String string = S0.getString(2);
                linkedHashSet.add(j(S0.getString(3)));
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.setMsgId(j27);
                f9Var.o1(j28);
                f9Var.u1(string);
                m11.b0 S1 = Di.S1(f9Var);
                if (S1 != null) {
                    linkedHashSet.add(j(S1.f322639g));
                    java.lang.String str3 = S1.f322638f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashSet.add(str3);
                    java.lang.String str4 = S1.f322637e;
                    if (str4 == null) {
                        str4 = "";
                    }
                    linkedHashSet.add(str4);
                    m11.b0 C1 = Di.C1(java.lang.Long.valueOf(S1.f322649q));
                    linkedHashSet.add(j(C1.f322639g));
                    java.lang.String str5 = C1.f322638f;
                    if (str5 == null) {
                        str5 = "";
                    }
                    linkedHashSet.add(str5);
                    java.lang.String str6 = C1.f322637e;
                    linkedHashSet.add(str6 != null ? str6 : "");
                }
            }
            S0.close();
            i27++;
            strArr = strArr2;
            length = i28;
            currentTimeMillis = j19;
        }
        long j29 = currentTimeMillis;
        boolean z19 = z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("image pathStackList == null = ");
        sb6.append(list2 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", sb6.toString());
        java.util.Iterator it = list.iterator();
        long j37 = 0;
        long j38 = 0;
        int i37 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = f14592d;
            i18 = f14591c;
            if (!hasNext) {
                j17 = j38;
                break;
            }
            int i38 = i37 + 1;
            com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it.next();
            if (cancellationSignal.isCanceled()) {
                j17 = j38;
                z19 = true;
                break;
            }
            java.util.Iterator it6 = it;
            if (x1Var.f213236f) {
                j18 = j38;
                i19 = i38;
            } else {
                java.lang.String name = x1Var.f213232b;
                i19 = i38;
                kotlin.jvm.internal.o.f(name, "name");
                kotlin.jvm.internal.o.f(name, "name");
                j18 = j38;
                if (r26.i0.y(name, "th_", false)) {
                    kotlin.jvm.internal.o.f(name, "name");
                    if (r26.i0.n(name, "hd", false)) {
                        kotlin.jvm.internal.o.f(name, "name");
                        name = r26.n0.Z(name, "hd");
                    }
                }
                if (!linkedHashSet.contains(name)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanImage, report new wild, fe.relPath = " + x1Var.f213231a);
                    if (list2 != null) {
                        jz5.o oVar = (jz5.o) list2.get(i37);
                        jx3.f.INSTANCE.d(i18, java.lang.Integer.valueOf(f14593e), java.lang.Integer.valueOf(i17), 0, oVar.f302843f, java.lang.Long.valueOf(x1Var.f213233c), 0, 0, 0, 0, oVar.f302841d, oVar.f302842e);
                        java.lang.Object obj = oVar.f302841d;
                        J2.remove((java.lang.String) obj);
                        J3.remove((java.lang.String) obj);
                    } else {
                        long j39 = x1Var.f213234d;
                        j37 += j39;
                        if (h(x1Var)) {
                            j38 = j18 + j39;
                            it = it6;
                            i37 = i19;
                        }
                    }
                }
            }
            it = it6;
            i37 = i19;
            j38 = j18;
        }
        if (!z19) {
            com.tencent.mm.sdk.platformtools.o4.L().B("imageWildTotalSize", j37);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j29;
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(f14598j);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(z19 ? -1 : 1);
        objArr[3] = java.lang.Long.valueOf(currentTimeMillis2);
        objArr[4] = java.lang.Long.valueOf(j37);
        objArr[5] = java.lang.Long.valueOf(j17);
        fVar.d(i18, objArr);
    }

    public final void e(com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.List list, java.util.List list2) {
        int i17;
        int i18;
        long j17;
        long j18;
        boolean z17;
        long j19;
        com.tencent.mm.storage.g9 g9Var;
        long j27;
        java.util.Iterator it;
        long j28;
        long j29;
        boolean z18;
        long j37;
        boolean z19;
        com.tencent.mm.storage.g9 g9Var2;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "recordClean starting...");
        if (list == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordClean, fileEntryList.size = ");
        sb6.append(list.size());
        sb6.append(", pathStackList == null is ");
        sb6.append(list2 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", sb6.toString());
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        java.util.Iterator it6 = list.iterator();
        long j38 = 0;
        long j39 = 0;
        while (true) {
            boolean hasNext = it6.hasNext();
            i17 = f14592d;
            i18 = f14591c;
            if (!hasNext) {
                j17 = currentTimeMillis;
                j18 = j38;
                z17 = false;
                break;
            }
            com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it6.next();
            if (cancellationSignal.isCanceled()) {
                j17 = currentTimeMillis;
                j18 = j38;
                z17 = true;
                break;
            }
            if (x1Var.f213236f) {
                java.lang.String str2 = x1Var.f213232b;
                if (!kotlin.jvm.internal.o.b(str2, "record2") && !kotlin.jvm.internal.o.b(str2, "web")) {
                    java.lang.String relPath = x1Var.f213231a;
                    kotlin.jvm.internal.o.f(relPath, "relPath");
                    java.util.List f07 = r26.n0.f0(relPath, new java.lang.String[]{"/"}, false, 0, 6, null);
                    it = it6;
                    if (f07.size() <= 3) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "finalMsgLocalId relPath = " + relPath + ", relPathParts.size = " + f07.size());
                        if (f07.size() == 2) {
                            j28 = currentTimeMillis;
                            j29 = j38;
                            z19 = !r26.i0.A((java.lang.String) f07.get(1), "sub", false, 2, null);
                            j37 = 0;
                        } else {
                            j28 = currentTimeMillis;
                            java.lang.Long j47 = f07.size() == 1 ? r26.h0.j((java.lang.String) f07.get(0)) : f07.size() == 3 ? r26.h0.j((java.lang.String) f07.get(2)) : null;
                            if (j47 == null) {
                                j29 = j38;
                                j37 = 0;
                            } else {
                                final java.lang.String str3 = com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
                                final long longValue = j47.longValue();
                                if (cj6.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                                    j29 = j38;
                                    z18 = ot0.c3.l().a("isMsgLocalIdExist", new yz5.a() { // from class: com.tencent.mm.storage.g9$$f6
                                        @Override // yz5.a
                                        public final java.lang.Object invoke() {
                                            return java.lang.Boolean.valueOf(ot0.z2.f348822a.q1(com.tencent.mm.storage.g9.this.f193989r, str3, longValue));
                                        }
                                    }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$g6
                                        @Override // yz5.a
                                        public final java.lang.Object invoke() {
                                            android.database.Cursor E = com.tencent.mm.storage.g9.this.f193989r.E(str3, new java.lang.String[]{"msgId"}, "msgId=" + longValue, null, null, null, null);
                                            boolean z27 = E.getCount() > 0;
                                            E.close();
                                            return java.lang.Boolean.valueOf(z27);
                                        }
                                    });
                                } else {
                                    j29 = j38;
                                    if (cj6.Pb(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                                        z18 = ot0.z2.f348822a.q1(cj6.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, longValue);
                                    } else {
                                        android.database.Cursor E = cj6.f193989r.E(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, new java.lang.String[]{"msgId"}, "msgId=" + longValue, null, null, null, null);
                                        boolean z27 = E.getCount() > 0;
                                        E.close();
                                        z18 = z27;
                                    }
                                }
                                if (z18) {
                                    j37 = 0;
                                    z19 = false;
                                } else {
                                    j37 = j47.longValue();
                                }
                            }
                            z19 = true;
                        }
                        if (z19) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanRecord, report new wild, fe.relPath = " + relPath);
                            java.util.Iterator it7 = ((java.util.ArrayList) k(x1Var)).iterator();
                            j38 = j29;
                            long j48 = 0;
                            while (it7.hasNext()) {
                                com.tencent.mm.vfs.x1 x1Var2 = (com.tencent.mm.vfs.x1) it7.next();
                                com.tencent.mm.storage.g9 g9Var3 = cj6;
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("cleanRecord, wild, finalMsgLocalId = ");
                                sb7.append(j37);
                                sb7.append(", file.path = ");
                                sb7.append(x1Var2.f213231a);
                                sb7.append(", fe.path = ");
                                sb7.append(relPath);
                                sb7.append(", size = ");
                                java.util.Iterator it8 = it7;
                                java.lang.String str4 = relPath;
                                sb7.append(x1Var.f213234d);
                                com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", sb7.toString());
                                if (list2 != null) {
                                    jx3.f.INSTANCE.d(i18, java.lang.Integer.valueOf(f14596h), java.lang.Integer.valueOf(i17), 0, 0, java.lang.Long.valueOf(x1Var.f213233c), java.lang.Long.valueOf(j37), 0, 0, 0, x1Var.f213231a, x1Var2.f213231a);
                                } else {
                                    long j49 = x1Var2.f213234d;
                                    j38 += j49;
                                    j48 += j49;
                                }
                                it7 = it8;
                                relPath = str4;
                                cj6 = g9Var3;
                            }
                            g9Var2 = cj6;
                            str = relPath;
                            if (h(x1Var)) {
                                j39 += j48;
                            }
                        } else {
                            g9Var2 = cj6;
                            str = relPath;
                            j38 = j29;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanRecord done relPath = ".concat(str));
                        it6 = it;
                        currentTimeMillis = j28;
                        cj6 = g9Var2;
                    } else {
                        g9Var = cj6;
                        j27 = currentTimeMillis;
                        it6 = it;
                        currentTimeMillis = j27;
                        cj6 = g9Var;
                        j38 = j38;
                    }
                }
            }
            g9Var = cj6;
            j27 = currentTimeMillis;
            it = it6;
            it6 = it;
            currentTimeMillis = j27;
            cj6 = g9Var;
            j38 = j38;
        }
        if (z17) {
            j19 = j18;
        } else {
            j19 = j18;
            com.tencent.mm.sdk.platformtools.o4.L().B("recordWildTotalSize", j19);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(f14601m);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(z17 ? -1 : 1);
        objArr[3] = java.lang.Long.valueOf(currentTimeMillis2);
        objArr[4] = java.lang.Long.valueOf(j19);
        objArr[5] = java.lang.Long.valueOf(j39);
        fVar.d(i18, objArr);
    }

    public final void f(com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.List list, java.util.List list2) {
        int i17;
        boolean z17;
        int i18;
        long j17;
        long j18;
        long j19;
        long j27;
        aw1.m mVar = this;
        java.lang.String str = "MicroMsg.C2CWildFileCleaner";
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanVideo");
        if (list == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanVideo, fileEntryList.size = " + list.size());
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J(f14604p, gm0.j1.b().h(), 1);
        com.tencent.mm.sdk.platformtools.o4 J3 = com.tencent.mm.sdk.platformtools.o4.J(f14605q, gm0.j1.b().h(), 1);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        boolean z18 = false;
        for (java.lang.String str2 : f14603o) {
            android.database.Cursor b76 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b7(str2, new java.lang.String[]{"imgPath"}, 43);
            while (true) {
                if (!b76.moveToNext()) {
                    break;
                }
                if (cancellationSignal.isCanceled()) {
                    z18 = true;
                    break;
                } else {
                    java.lang.String string = b76.getString(0);
                    kotlin.jvm.internal.o.d(string);
                    linkedHashSet.add(string);
                }
            }
            b76.close();
        }
        android.database.Cursor E = if3.k0.Ai().f291232d.E("massendinfo", new java.lang.String[]{com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME}, "msgtype=43", null, null, null, null);
        if (E == null) {
            E = null;
        }
        if (E != null) {
            while (true) {
                if (!E.moveToNext()) {
                    break;
                }
                if (cancellationSignal.isCanceled()) {
                    z18 = true;
                    break;
                } else {
                    java.lang.String string2 = E.getString(0);
                    kotlin.jvm.internal.o.d(string2);
                    linkedHashSet.add(string2);
                }
            }
            E.close();
        }
        java.util.Iterator it = list.iterator();
        long j28 = 0;
        long j29 = 0;
        int i19 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = f14592d;
            z17 = z18;
            i18 = f14591c;
            if (!hasNext) {
                j17 = currentTimeMillis;
                j18 = j29;
                break;
            }
            int i27 = i19 + 1;
            java.util.Iterator it6 = it;
            com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it.next();
            if (cancellationSignal.isCanceled()) {
                j17 = currentTimeMillis;
                j18 = j29;
                z17 = true;
                break;
            }
            if (x1Var.f213236f) {
                j19 = currentTimeMillis;
            } else {
                j19 = currentTimeMillis;
                java.lang.String name = x1Var.f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                if (!r26.i0.y(name, "tmp_", false)) {
                    boolean B = r26.n0.B(name, ".", false);
                    int i28 = f14594f;
                    j27 = j29;
                    long j37 = x1Var.f213233c;
                    java.lang.String str3 = str;
                    long j38 = x1Var.f213234d;
                    if (B) {
                        java.lang.String substring = name.substring(0, r26.n0.P(name, ".", 0, false, 6, null));
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        if (r26.i0.n(substring, ya.b.ORIGIN, false)) {
                            substring = r26.n0.Z(substring, ya.b.ORIGIN);
                        }
                        if (linkedHashSet.contains(substring)) {
                            mVar = this;
                            str = str3;
                        } else {
                            str = str3;
                            com.tencent.mars.xlog.Log.i(str, "cleanVideo, report new wild, fe.relPath = " + x1Var.f213231a);
                            if (list2 != null) {
                                jz5.o oVar = (jz5.o) list2.get(i19);
                                jx3.f.INSTANCE.d(i18, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i17), 0, oVar.f302843f, java.lang.Long.valueOf(j37), 0, 0, 0, 0, oVar.f302841d, oVar.f302842e);
                                java.lang.Object obj = oVar.f302841d;
                                J2.remove((java.lang.String) obj);
                                J3.remove((java.lang.String) obj);
                                mVar = this;
                            } else {
                                j28 += j38;
                                mVar = this;
                                if (mVar.h(x1Var)) {
                                    j29 = j27 + j38;
                                    it = it6;
                                    z18 = z17;
                                    i19 = i27;
                                    currentTimeMillis = j19;
                                }
                            }
                        }
                        it = it6;
                        z18 = z17;
                        i19 = i27;
                        currentTimeMillis = j19;
                        j29 = j27;
                    } else {
                        if (list2 != null) {
                            jz5.o oVar2 = (jz5.o) list2.get(i19);
                            jx3.f.INSTANCE.d(i18, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i17), 0, oVar2.f302843f, java.lang.Long.valueOf(j37), 0, 0, 0, 0, oVar2.f302841d, oVar2.f302842e);
                            java.lang.Object obj2 = oVar2.f302841d;
                            J2.remove((java.lang.String) obj2);
                            J3.remove((java.lang.String) obj2);
                        } else {
                            j28 += j38;
                            mVar.h(x1Var);
                        }
                        it = it6;
                        z18 = z17;
                        i19 = i27;
                        currentTimeMillis = j19;
                        j29 = j27;
                        str = str3;
                    }
                }
            }
            j27 = j29;
            it = it6;
            z18 = z17;
            i19 = i27;
            currentTimeMillis = j19;
            j29 = j27;
        }
        if (!z17) {
            com.tencent.mm.sdk.platformtools.o4.L().B("videoWildTotalSize", j28);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(f14599k);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(z17 ? -1 : 1);
        objArr[3] = java.lang.Long.valueOf(currentTimeMillis2);
        objArr[4] = java.lang.Long.valueOf(j28);
        objArr[5] = java.lang.Long.valueOf(j18);
        fVar.d(i18, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.tencent.wcdb.support.CancellationSignal r34, java.util.List r35, java.util.List r36) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.m.g(com.tencent.wcdb.support.CancellationSignal, java.util.List, java.util.List):void");
    }

    public final boolean h(com.tencent.mm.vfs.x1 x1Var) {
        boolean b17;
        boolean z17;
        if (x1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "deleteFile fe null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("will deleteFile, fe = ");
        java.lang.String str = x1Var.f213231a;
        sb6.append(str);
        sb6.append(", modifiedTime = ");
        long j17 = x1Var.f213235e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", sb6.toString());
        if (gm0.j1.u().c().q(89, 0) == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "scanAndCleanAll, once corrupt. skip cleanup");
            b17 = false;
        } else {
            b17 = kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_clean_wild_file_exist_c2c_file_clean", "0", false, true));
        }
        if (!b17) {
            return false;
        }
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && java.lang.System.currentTimeMillis() - j17 <= 604800000) {
            return false;
        }
        boolean b18 = x1Var.b(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "deleteFile done, fe = " + str + ", ret = " + b18 + ", modifiedTime = " + j17);
        return b18;
    }

    public final java.lang.String j(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (!r26.n0.B(str, "://", false)) {
            return str;
        }
        java.lang.String substring = str.substring(r26.n0.L(str, "://", 0, false, 6, null) + 3);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final java.util.List k(com.tencent.mm.vfs.x1 x1Var) {
        java.lang.Iterable<com.tencent.mm.vfs.x1> d17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (x1Var.f213236f && (d17 = x1Var.d()) != null) {
            for (com.tencent.mm.vfs.x1 x1Var2 : d17) {
                if (x1Var2.f213236f) {
                    arrayList.addAll(f14589a.k(x1Var2));
                } else {
                    arrayList.add(x1Var2);
                }
            }
        }
        return arrayList;
    }

    public final boolean l() {
        boolean z17;
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        return z17 || kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_clean_wild_file_new_c2c_file", "0", false, true));
    }

    public final synchronized void m(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanAll");
        if (!kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_clean_wild_file_exist_c2c_file_scan", "0", false, true))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "cleanAll, expt false return");
            return;
        }
        if (gm0.j1.u().k()) {
            jx3.f.INSTANCE.kvStat(22046, "image2-hasCorruptedDB");
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "scanAndCleanAll, hasCorruptedDB, skip cleanup.");
        } else if (gm0.j1.u().a()) {
            jx3.f.INSTANCE.kvStat(22046, "image2-C2CToBeRescued");
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "scanAndCleanAll, c2cErrorToBeRescued, skip cleanup.");
        } else {
            if (cancellationSignal == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "scanAndCleanAll cs is null, skip cleanup");
                return;
            }
            java.util.Iterator it = kz5.c0.n(kz5.c0.i(new aw1.h(cancellationSignal), new aw1.i(cancellationSignal), new aw1.j(cancellationSignal), new aw1.k(cancellationSignal), new aw1.l(cancellationSignal)), c06.e.f37716d).iterator();
            while (it.hasNext()) {
                ((yz5.a) it.next()).invoke();
            }
        }
    }
}
