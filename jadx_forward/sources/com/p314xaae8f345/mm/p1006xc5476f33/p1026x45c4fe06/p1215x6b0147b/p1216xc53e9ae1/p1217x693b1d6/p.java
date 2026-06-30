package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes15.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p f172433a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f172434b = new java.util.concurrent.atomic.AtomicBoolean(false);

    static {
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.o.f172432d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001f A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:12:0x0008, B:14:0x0013, B:19:0x001f, B:22:0x0029, B:25:0x0032, B:27:0x0038, B:30:0x003f, B:4:0x0065), top: B:11:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
            java.lang.String r1 = ""
            java.lang.String r2 = "getFileIdFromVideoUrl: newUrl: "
            if (r9 == 0) goto L64
            android.net.Uri r3 = android.net.Uri.parse(r9)     // Catch: java.lang.Exception -> L97
            java.lang.String r4 = r3.getQuery()     // Catch: java.lang.Exception -> L97
            r5 = 0
            if (r4 == 0) goto L1c
            boolean r4 = r26.n0.N(r4)     // Catch: java.lang.Exception -> L97
            if (r4 == 0) goto L1a
            goto L1c
        L1a:
            r4 = r5
            goto L1d
        L1c:
            r4 = 1
        L1d:
            if (r4 != 0) goto L62
            java.lang.String r4 = "vid"
            java.lang.String r4 = r3.getQueryParameter(r4)     // Catch: java.lang.Exception -> L97
            if (r4 != 0) goto L29
            r4 = r1
        L29:
            java.lang.String r6 = "format_id"
            java.lang.String r6 = r3.getQueryParameter(r6)     // Catch: java.lang.Exception -> L97
            if (r6 != 0) goto L32
            r6 = r1
        L32:
            boolean r7 = r26.n0.N(r4)     // Catch: java.lang.Exception -> L97
            if (r7 == 0) goto L3f
            boolean r7 = r26.n0.N(r6)     // Catch: java.lang.Exception -> L97
            if (r7 == 0) goto L3f
            goto L62
        L3f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L97
            r7.<init>()     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = r3.getQuery()     // Catch: java.lang.Exception -> L97
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = r26.i0.t(r9, r3, r1, r5)     // Catch: java.lang.Exception -> L97
            r7.append(r3)     // Catch: java.lang.Exception -> L97
            r7.append(r4)     // Catch: java.lang.Exception -> L97
            r3 = 95
            r7.append(r3)     // Catch: java.lang.Exception -> L97
            r7.append(r6)     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Exception -> L97
            goto L65
        L62:
            r3 = r9
            goto L65
        L64:
            r3 = r1
        L65:
            java.nio.charset.Charset r4 = r26.c.f450398a     // Catch: java.lang.Exception -> L97
            byte[] r4 = r3.getBytes(r4)     // Catch: java.lang.Exception -> L97
            java.lang.String r5 = "getBytes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)     // Catch: java.lang.Exception -> L97
            java.lang.String r4 = kk.k.g(r4)     // Catch: java.lang.Exception -> L97
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L97
            r5.<init>(r2)     // Catch: java.lang.Exception -> L97
            r5.append(r3)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "   url:"
            r5.append(r2)     // Catch: java.lang.Exception -> L97
            r5.append(r9)     // Catch: java.lang.Exception -> L97
            java.lang.String r9 = "  fileId:"
            r5.append(r9)     // Catch: java.lang.Exception -> L97
            r5.append(r4)     // Catch: java.lang.Exception -> L97
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Exception -> L97
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r9)     // Catch: java.lang.Exception -> L97
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)     // Catch: java.lang.Exception -> L97
            return r4
        L97:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getFileIdFromVideoUrl  error: "
            r2.<init>(r3)
            java.lang.String r9 = r9.getMessage()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0013 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[Catch: Exception -> 0x000e, TRY_LEAVE, TryCatch #0 {Exception -> 0x000e, blocks: (B:15:0x0005, B:7:0x0014), top: B:14:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L10
            boolean r3 = r26.n0.N(r6)     // Catch: java.lang.Exception -> Le
            if (r3 == 0) goto Lc
            goto L10
        Lc:
            r3 = r0
            goto L11
        Le:
            r6 = move-exception
            goto L1d
        L10:
            r3 = 1
        L11:
            if (r3 == 0) goto L14
            return r1
        L14:
            com.tencent.mm.sdk.platformtools.v3 r3 = r5.c()     // Catch: java.lang.Exception -> Le
            long r0 = r3.q(r6, r1)     // Catch: java.lang.Exception -> Le
            return r0
        L1d:
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r6, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.b(java.lang.String):long");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 c() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ttplayer_preload_file");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(M, 1800L);
    }

    public final void d(android.content.Context context, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f172434b.compareAndSet(false, true)) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101122x24b7f377(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.n());
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101112x7421050a(context.getApplicationContext(), "60303", 1);
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101129xd5038bcf(true);
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101132x4f6110c3(100);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102359x3206a930(false);
            android.content.Context applicationContext = context.getApplicationContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "getApplicationContext(...)");
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.m.a();
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 m102340x61ce4f94 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102340x61ce4f94(100);
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D(), "ThumbVideoCache/TPDownload");
            com.p314xaae8f345.mm.vfs.w6.u(r6Var.o());
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, a17);
            com.p314xaae8f345.mm.vfs.w6.u(r6Var2.o());
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var2, "cache").o();
            com.p314xaae8f345.mm.vfs.w6.u(o17);
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(o17, true);
            java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(r6Var2, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306).o();
            com.p314xaae8f345.mm.vfs.w6.u(o18);
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(o18, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (z17) {
                try {
                    jSONObject.put("VodCacheEnable", true);
                    jSONObject.put("MemoryAjustInterval", Integer.MAX_VALUE);
                } catch (java.lang.Exception unused) {
                }
            }
            jSONObject.put("EnableOnlyHttpsUseCurl", false);
            if (z18) {
                jSONObject.put("key_localserver_buffer_size", 524288L);
                jSONObject.put("key_localserver_send_socket_buffer_size", 131072L);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            m102340x61ce4f94.mo102239x316510(applicationContext, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26368x17a977b3(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9(), com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101632xc725eb98(applicationContext), com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101634xfb7ffeff(), i17, i18, jSONObject2));
            if (z17) {
                m102340x61ce4f94.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52915xc530858c, 5);
            }
            m102340x61ce4f94.mo102246xd7e17d2f(512L);
        }
    }

    public final void e(java.lang.String str, long j17) {
        try {
            java.lang.String a17 = a(str);
            if (r26.n0.N(a17)) {
                return;
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) c().i()).B(a17, j17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ThumbPlayerInitLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
