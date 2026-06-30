package cz0;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f306504c;

    /* renamed from: a, reason: collision with root package name */
    public static final cz0.y f306502a = new cz0.y();

    /* renamed from: b, reason: collision with root package name */
    public static final int f306503b = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274654q;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f306505d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f306506e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f306507f = "#MaasSdkVersion:not_load";

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f306508g = jz5.h.b(cz0.p.f306494d);

    static {
        com.p314xaae8f345.mm.app.C5000x71a2fa35.U.f(cz0.n.f306492d);
        com.p314xaae8f345.mm.app.C4999x403c3a42.f134763k.f135258o.f(cz0.o.f306493d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(cz0.y yVar) {
        int i17;
        yVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: clean start");
        java.lang.String str = lp0.b.h() + "maas-template";
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: legacyWarmUpResDir:" + str + " exist, delete it.");
            com.p314xaae8f345.mm.vfs.w6.f(str);
        }
        cz0.l e17 = yVar.e();
        int i18 = 0;
        boolean z17 = 1;
        boolean z18 = e17 != null && e17.b() && e17.f306487a.size() > 0;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(cz0.m.f306489b, false);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(x1Var.f294765b, -1);
                if (P >= 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(cz0.m.f306489b);
                    sb6.append('/');
                    java.lang.String str2 = x1Var.f294765b;
                    sb6.append(str2);
                    sb6.append("/config.json");
                    java.lang.String jsonFile = sb6.toString();
                    cz0.k kVar = new cz0.k();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonFile, "jsonFile");
                    try {
                        kVar.a(new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(jsonFile)));
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseJsonObject", e18, "", new java.lang.Object[i18]);
                    }
                    if (kVar.d()) {
                        int i19 = kVar.f306482b;
                        int i27 = f306503b;
                        if (i19 > i27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "keepPreRes: resCompatVersion: " + kVar.f306482b + ", resVersion: " + kVar.f306483c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                        } else if (i19 == i27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "keepCompatRes: resCompatVersion: " + kVar.f306482b + ", resVersion: " + kVar.f306483c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                        } else if (z18) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
                            java.util.LinkedList linkedList = e17.f306487a;
                            if (!(linkedList instanceof java.util.Collection) || !linkedList.isEmpty()) {
                                java.util.Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    if ((((cz0.k) it.next()).f306481a == P ? z17 : i18) != 0) {
                                        i17 = z17;
                                        break;
                                    }
                                }
                            }
                            i17 = i18;
                            if (i17 != 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "keepChainRes: resCompatVersion: " + kVar.f306482b + ", resVersion: " + kVar.f306483c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                            } else {
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181 c6712x32f26181 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181();
                                c6712x32f26181.f140536d = i27;
                                c6712x32f26181.f140539g = 5;
                                c6712x32f26181.f140540h = P;
                                c6712x32f26181.f140537e = kVar.f306482b;
                                c6712x32f26181.f140542j = kVar.f306483c;
                                c6712x32f26181.f140543k = c6712x32f26181.b("Sha1", kVar.f306485e, z17);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: resCompatVersion: " + kVar.f306482b + ", resVersion: " + kVar.f306483c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append(cz0.m.f306489b);
                                sb7.append('/');
                                sb7.append(str2);
                                bz0.k.a(c6712x32f26181, com.p314xaae8f345.mm.vfs.w6.g(sb7.toString(), z17));
                                ((yy.a) ((zy.r) ((jz5.n) f306508g).mo141623x754a37bb())).getClass();
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().getClass();
                                java.lang.String c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(103, P);
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e19 = l0Var.e(c17);
                                if (e19 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, %d.%d, get null info, return", 103, java.lang.Integer.valueOf(P));
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, %d.%d, queried primeInfo { deleted = %b, filepath = %s, md5 = %s, compress = %b, encrypt = %b, originalMd5 = %s }", 103, java.lang.Integer.valueOf(P), java.lang.Boolean.valueOf(e19.f68771xd0fcddd4), e19.f68777xf1e9b966, e19.f68785x4b6e68b9, java.lang.Boolean.valueOf(e19.f68775x9cdeb823), java.lang.Boolean.valueOf(e19.f68776x7d1f4984), e19.f68788xd2f45e28);
                                    java.lang.String str3 = e19.f68777xf1e9b966;
                                    if (com.p314xaae8f345.mm.vfs.w6.h(str3)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, delete filepath = %s", str3);
                                    }
                                    java.lang.String str4 = e19.f68777xf1e9b966 + ".decompressed";
                                    if (com.p314xaae8f345.mm.vfs.w6.h(str4)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, delete decompressed filepath = %s", str4);
                                    }
                                    java.lang.String str5 = e19.f68777xf1e9b966 + ".decrypted";
                                    if (com.p314xaae8f345.mm.vfs.w6.h(str5)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, delete decrypted filepath = %s", str5);
                                    }
                                    if (l0Var.f271219e) {
                                        l0Var.f271215a.d(c17);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, delete res db record %d.%d", 103, java.lang.Integer.valueOf(P));
                                }
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: no valid chain, skip clean res: resCompatVersion: " + kVar.f306482b + ", resVersion: " + kVar.f306483c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                        }
                    }
                }
                i18 = 0;
                z17 = 1;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: clean end");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0228 A[EDGE_INSN: B:44:0x0228->B:39:0x0228 BREAK  A[LOOP:0: B:17:0x00ce->B:37:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cz0.y.b():void");
    }

    public final void c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "doCheck: from:" + str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_sdk");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        M.putLong("KEY_LAST_ENTRANCE_CHECK", java.lang.System.currentTimeMillis());
        ((yy.a) ((zy.r) ((jz5.n) f306508g).mo141623x754a37bb())).wi(103);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cz0.l d(java.util.List r20, int r21) {
        /*
            r19 = this;
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "findCompatibleChain: from "
            r1.<init>(r2)
            r2 = r21
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.MaasSdkResMgr"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            cz0.l r1 = new cz0.l
            r1.<init>()
            int r4 = r20.size()
            r5 = 0
            r6 = -1
            r7 = r5
        L23:
            if (r2 >= r4) goto La9
            java.lang.Object r8 = r0.get(r2)
            cz0.k r8 = (cz0.k) r8
            java.lang.String r9 = ", "
            if (r7 != 0) goto L37
            boolean r10 = r8.c()
            if (r10 == 0) goto L3e
            r6 = r2
            goto L3d
        L37:
            int r10 = r8.f306483c
            int r11 = r7.f306484d
            if (r10 != r11) goto L85
        L3d:
            r7 = r8
        L3e:
            if (r7 == 0) goto L82
            java.util.LinkedList r10 = r1.f306487a
            r10.add(r7)
            int r8 = r7.f306484d
            int r11 = r7.f306483c
            if (r8 != r11) goto L82
            java.util.Collections.reverse(r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "findCompatibleChain: find index:["
            r0.<init>(r4)
            r0.append(r6)
            r0.append(r9)
            r0.append(r2)
            java.lang.String r2 = "], subtype:["
            r0.append(r2)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            cz0.s r16 = cz0.s.f306497d
            r17 = 31
            r18 = 0
            java.lang.String r2 = kz5.n0.g0(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            return r1
        L82:
            int r2 = r2 + 1
            goto L23
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "findCompatibleChain: version error "
            r1.<init>(r2)
            int r2 = r8.f306483c
            r1.append(r2)
            r1.append(r9)
            int r2 = r7.f306484d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r1)
            int r6 = r6 + 1
            r1 = r19
            cz0.l r0 = r1.d(r0, r6)
            return r0
        La9:
            r1 = r19
            java.lang.String r0 = "findCompatibleChain: can not find any compatible chain"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cz0.y.d(java.util.List, int):cz0.l");
    }

    public final cz0.l e() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181 c6712x32f26181 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181();
        c6712x32f26181.f140536d = f306503b;
        c6712x32f26181.f140539g = 2;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = cz0.m.f306488a;
        boolean z17 = false;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(cz0.m.f306489b, false);
        if (s17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(x1Var.f294765b, -1);
                if (P >= 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.String str2 = cz0.m.f306488a;
                    sb6.append(cz0.m.f306489b);
                    sb6.append('/');
                    sb6.append(x1Var.f294765b);
                    sb6.append("/config.json");
                    java.lang.String jsonFile = sb6.toString();
                    cz0.k kVar = new cz0.k();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonFile, "jsonFile");
                    try {
                        kVar.a(new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(jsonFile)));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseJsonObject", e17, "", new java.lang.Object[0]);
                    }
                    if (kVar.d()) {
                        kVar.f306481a = P;
                        arrayList.add(kVar);
                        sparseArray.put(P, kVar);
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new cz0.t());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "mergeBin: list ".concat(kz5.n0.g0(arrayList, null, null, null, 0, null, cz0.u.f306498d, 31, null)));
        cz0.l d17 = d(arrayList, 0);
        if (d17 != null && d17.b() && d17.f306487a.size() > 0) {
            z17 = true;
        }
        bz0.k.a(c6712x32f26181, z17);
        return d17;
    }

    public final java.lang.String f(java.lang.String str) {
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                byte[] bArr = new byte[4096];
                java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str);
                try {
                    for (int read = E.read(bArr); read > 0; read = E.read(bArr)) {
                        messageDigest.update(bArr, 0, read);
                    }
                    vz5.b.a(E, null);
                    byte[] digest = messageDigest.digest();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "getSha1: cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(digest);
                } finally {
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MaasSdkResMgr", th6, "getSha1 error", new java.lang.Object[0]);
        }
        return null;
    }

    public final java.lang.String g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = cz0.m.f306488a;
        sb6.append(cz0.m.f306491d);
        sb6.append("/libMaasSDK.so");
        return sb6.toString();
    }

    public final boolean h() {
        cz0.l e17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSdkResMgr", "isValid: work on arm64");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            if (fp.q.b("maas")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "isValid: gp_version, has plugin installed");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "isValid: gp_version, plugin not installed");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "isValid: isLoaded:" + f306504c);
        if (f306504c) {
            return true;
        }
        cz0.z zVar = cz0.z.f306509a;
        boolean c17 = zVar.c();
        int i17 = zVar.a().getInt("KEY_SDK_COMPAT_VERSION", 0);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(g());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeBin: need update ");
        sb6.append(c17);
        sb6.append(", ");
        sb6.append(i17);
        sb6.append(", target version ");
        int i18 = f306503b;
        sb6.append(i18);
        sb6.append(", currentSha1:");
        sb6.append(zVar.b());
        sb6.append(", file:");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", sb6.toString());
        boolean z17 = (!c17 && i17 == i18 && j17) || ((e17 = e()) != null && e17.b() && e17.f306487a.size() > 0);
        if (!z17) {
            long j18 = zVar.a().getLong("KEY_LAST_ENTRANCE_CHECK", 0L);
            int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.C20381xac9be645());
            long j19 = h17 > 0 ? h17 * 60000 : 43200000L;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasSdkResRecord", "needEntranceCheck: milliSecondsToNow:" + currentTimeMillis + " last:" + j18 + ", interval:" + j19);
            if (currentTimeMillis >= j19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "isValid invalid, do check");
                c("invalid");
            }
        }
        return z17;
    }

    public final boolean i() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k;
        int i17 = f306503b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSdkResMgr", "load sdk only arm64");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181 c6712x32f26181 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181();
            c6712x32f26181.f140536d = i17;
            c6712x32f26181.f140539g = 8;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "unsupported device: not arm64");
            c6712x32f26181.k();
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "loadSdk: isLoaded:" + f306504c);
        if (f306504c) {
            return true;
        }
        i95.m c17 = i95.n0.c(pp0.m0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pp0.m0.n3((pp0.m0) c17, "mjtc_load_so", null, 2, null);
        java.util.concurrent.locks.ReentrantLock reentrantLock = f306505d;
        reentrantLock.lock();
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = f306506e;
        reentrantLock2.lock();
        try {
            if (!f306504c) {
                b();
            }
            reentrantLock.unlock();
            reentrantLock2.unlock();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181 c6712x32f261812 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181();
            c6712x32f261812.f140536d = i17;
            c6712x32f261812.f140539g = 1;
            cz0.z zVar = cz0.z.f306509a;
            int i18 = zVar.a().getInt("KEY_SDK_LOAD_START", 0) - zVar.a().getInt("KEY_SDK_LOAD_END", 0);
            c6712x32f261812.f140537e = zVar.a().getInt("KEY_SDK_COMPAT_VERSION", 0);
            c6712x32f261812.f140541i = i18;
            c6712x32f261812.f140542j = zVar.a().getInt("KEY_SDK_RES_VERSION", 0);
            c6712x32f261812.f140543k = c6712x32f261812.b("Sha1", zVar.b(), true);
            int i19 = zVar.a().getInt("KEY_SDK_COMPAT_VERSION", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "loadSdk: load fail count:" + i18 + "; compat version " + i19);
            if (i18 > 1) {
                bz0.k.a(c6712x32f261812, false);
                return false;
            }
            if (i19 != i17) {
                bz0.k.a(c6712x32f261812, false);
                return false;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(g())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSdkResMgr", "loadSdk: so file not exist");
                bz0.k.a(c6712x32f261812, false);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "loadSdk: start soFilePath:" + g());
            f306504c = true;
            zVar.a().putInt("KEY_SDK_LOAD_START", zVar.a().getInt("KEY_SDK_LOAD_START", 0) + 1);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Maas_LoadSoFromSdCard_Int, 0), 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSdkResMgr", "loadSdkNoLock: load from sd card");
                pm0.v.X(cz0.x.f306501d);
                fp.d0.c(cz0.m.f306488a);
            } else {
                fp.d0.c(cz0.m.f306491d);
            }
            fp.d0.n("MaasSDK");
            zVar.a().putInt("KEY_SDK_LOAD_END", zVar.a().getInt("KEY_SDK_LOAD_END", 0) + 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "loadSdk: end");
            bz0.k.a(c6712x32f261812, true);
            f306507f = "#MaasSdkVersion:" + com.p314xaae8f345.p457x3304c6.C3963xf8180d7e.a();
            i95.m c18 = i95.n0.c(pp0.m0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            pp0.m0.ee((pp0.m0) c18, "mjtc_load_so", null, null, null, 14, null);
            return true;
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            reentrantLock2.unlock();
            throw th6;
        }
    }

    public final jz5.l j(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes: subtype: " + i17 + ", path: " + str + ", source: " + i18);
        java.util.concurrent.locks.ReentrantLock reentrantLock = f306505d;
        reentrantLock.lock();
        try {
            jz5.l k17 = k(i17, str, i18);
            java.lang.String str2 = cz0.m.f306488a;
            com.p314xaae8f345.mm.vfs.w6.f(cz0.m.f306490c);
            return k17;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final jz5.l k(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181 c6712x32f26181 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181();
        c6712x32f26181.f140536d = f306503b;
        c6712x32f26181.f140539g = 4;
        c6712x32f26181.f140540h = i17;
        c6712x32f26181.f140544l = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes: subtype: " + i17 + ", path: " + str);
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSdkResMgr", "unzipRes: path is null");
            bz0.k.a(c6712x32f26181, false);
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        java.lang.String str2 = cz0.m.f306490c;
        com.p314xaae8f345.mm.vfs.w6.f(str2);
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        int Q = com.p314xaae8f345.mm.vfs.w6.Q(str, str2);
        if (Q != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSdkResMgr", "unzipRes: unzip failed " + Q);
            bz0.k.a(c6712x32f26181, false);
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        java.lang.String jsonFile = str2 + "/config.json";
        cz0.k kVar = new cz0.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonFile, "jsonFile");
        try {
            kVar.a(new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(jsonFile)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseJsonObject", e17, "", new java.lang.Object[0]);
        }
        if (!kVar.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSdkResMgr", "unzipRes: config is invalid " + kVar);
            bz0.k.a(c6712x32f26181, false);
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        c6712x32f26181.f140537e = kVar.f306482b;
        c6712x32f26181.f140542j = kVar.f306483c;
        c6712x32f26181.f140543k = c6712x32f26181.b("Sha1", kVar.f306485e, true);
        java.lang.String f17 = f(str2 + "/bin");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes fileSha1:" + f17 + " config.sha1:" + kVar.f306485e);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(f17, kVar.f306485e)) {
            bz0.k.a(c6712x32f26181, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes failed");
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str3 = cz0.m.f306489b;
        sb6.append(str3);
        sb6.append('/');
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.w6.f(sb7);
        com.p314xaae8f345.mm.vfs.w6.u(str3);
        com.p314xaae8f345.mm.vfs.w6.b(str2, sb7);
        if (kVar.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes onResUpdate");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("maas_sdk");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
            M.putLong("KEY_RES_UPDATE_TIME", java.lang.System.currentTimeMillis());
        }
        bz0.k.a(c6712x32f26181, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes success");
        return new jz5.l(java.lang.Boolean.TRUE, kVar);
    }
}
