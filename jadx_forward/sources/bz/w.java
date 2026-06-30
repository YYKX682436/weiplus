package bz;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f118248a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f118249b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f118250c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f118251d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f118252e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f118253f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f118254g;

    public w(java.lang.String workspaceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workspaceName, "workspaceName");
        this.f118248a = jz5.h.b(new bz.v(workspaceName));
        this.f118249b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_downloader_file_list_check, 0) == 1;
        this.f118250c = jz5.h.b(new bz.u(this));
        this.f118251d = jz5.h.b(new bz.t(this));
        jz5.h.b(new bz.p(this));
        this.f118253f = new java.util.LinkedHashMap();
        this.f118254g = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(bz.w r17, java.lang.String r18, java.lang.String r19, int r20, int r21, java.lang.String r22, boolean r23, yz5.p r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.w.a(bz.w, java.lang.String, java.lang.String, int, int, java.lang.String, boolean, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #0 {all -> 0x008d, blocks: (B:11:0x0059, B:13:0x005f, B:15:0x0080), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(bz.w r6, bz.i r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6.getClass()
            java.lang.String r0 = "#releaseDownloadJob key="
            boolean r1 = r8 instanceof bz.q
            if (r1 == 0) goto L18
            r1 = r8
            bz.q r1 = (bz.q) r1
            int r2 = r1.f118234i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f118234i = r2
            goto L1d
        L18:
            bz.q r1 = new bz.q
            r1.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r1.f118232g
            pz5.a r2 = pz5.a.f440719d
            int r3 = r1.f118234i
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L43
            if (r3 != r5) goto L3b
            java.lang.Object r6 = r1.f118231f
            kotlinx.coroutines.sync.d r6 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r6
            java.lang.Object r7 = r1.f118230e
            bz.i r7 = (bz.i) r7
            java.lang.Object r1 = r1.f118229d
            bz.w r1 = (bz.w) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r6
            r6 = r1
            goto L59
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kotlinx.coroutines.sync.d r8 = r6.f118254g
            r1.f118229d = r6
            r1.f118230e = r7
            r1.f118231f = r8
            r1.f118234i = r5
            kotlinx.coroutines.sync.k r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r8
            java.lang.Object r1 = r8.b(r4, r1)
            if (r1 != r2) goto L59
            goto L8c
        L59:
            int r1 = r7.f118161c     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r7.f118159a
            int r1 = r1 + (-1)
            r7.f118161c = r1     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "Download.SuperDownloaderWrapCore"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            r3.append(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = " ref="
            r3.append(r0)     // Catch: java.lang.Throwable -> L8d
            int r0 = r7.f118161c     // Catch: java.lang.Throwable -> L8d
            r3.append(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L8d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L8d
            int r7 = r7.f118161c     // Catch: java.lang.Throwable -> L8d
            if (r7 > 0) goto L85
            java.util.Map r6 = r6.f118253f     // Catch: java.lang.Throwable -> L8d
            r6.remove(r2)     // Catch: java.lang.Throwable -> L8d
        L85:
            kotlinx.coroutines.sync.k r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r8
            r8.d(r4)
            jz5.f0 r2 = jz5.f0.f384359a
        L8c:
            return r2
        L8d:
            r6 = move-exception
            kotlinx.coroutines.sync.k r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r8
            r8.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.w.b(bz.w, bz.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r14.b(null, r1) == r2) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:11:0x0059, B:13:0x0065, B:14:0x0075), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v9, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bz.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(bz.w r12, java.lang.String r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            r12.getClass()
            java.lang.String r0 = "#requestUrlDownloadJob key="
            boolean r1 = r14 instanceof bz.r
            if (r1 == 0) goto L18
            r1 = r14
            bz.r r1 = (bz.r) r1
            int r2 = r1.f118240i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f118240i = r2
            goto L1d
        L18:
            bz.r r1 = new bz.r
            r1.<init>(r12, r14)
        L1d:
            java.lang.Object r14 = r1.f118238g
            pz5.a r2 = pz5.a.f440719d
            int r3 = r1.f118240i
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L43
            if (r3 != r5) goto L3b
            java.lang.Object r12 = r1.f118237f
            kotlinx.coroutines.sync.d r12 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r12
            java.lang.Object r13 = r1.f118236e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = r1.f118235d
            bz.w r1 = (bz.w) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r14 = r12
            r12 = r1
            goto L59
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            kotlinx.coroutines.sync.d r14 = r12.f118254g
            r1.f118235d = r12
            r1.f118236e = r13
            r1.f118237f = r14
            r1.f118240i = r5
            kotlinx.coroutines.sync.k r14 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r14
            java.lang.Object r1 = r14.b(r4, r1)
            if (r1 != r2) goto L59
            goto L9b
        L59:
            java.util.Map r1 = r12.f118253f     // Catch: java.lang.Throwable -> L9c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r1 = r1.get(r13)     // Catch: java.lang.Throwable -> L9c
            bz.i r1 = (bz.i) r1     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L75
            bz.i r1 = new bz.i     // Catch: java.lang.Throwable -> L9c
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r1
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9c
            java.util.Map r12 = r12.f118253f     // Catch: java.lang.Throwable -> L9c
            r12.put(r13, r1)     // Catch: java.lang.Throwable -> L9c
        L75:
            r2 = r1
            int r12 = r2.f118161c     // Catch: java.lang.Throwable -> L9c
            int r12 = r12 + r5
            r2.f118161c = r12     // Catch: java.lang.Throwable -> L9c
            java.lang.String r12 = "Download.SuperDownloaderWrapCore"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            r1.append(r13)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r13 = " ref="
            r1.append(r13)     // Catch: java.lang.Throwable -> L9c
            int r13 = r2.f118161c     // Catch: java.lang.Throwable -> L9c
            r1.append(r13)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L9c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r13)     // Catch: java.lang.Throwable -> L9c
            kotlinx.coroutines.sync.k r14 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r14
            r14.d(r4)
        L9b:
            return r2
        L9c:
            r12 = move-exception
            kotlinx.coroutines.sync.k r14 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r14
            r14.d(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.w.c(bz.w, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object d(bz.w wVar, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", "#unzipToFolder url=" + str + " zipFilePath=" + str2 + " unzipFolder=" + str3);
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new bz.s(wVar, str3, str2, str, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    public final java.lang.String e(java.lang.String url, java.lang.String nameAppendix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameAppendix, "nameAppendix");
        boolean z17 = !r26.n0.N(nameAppendix);
        jz5.g gVar = this.f118250c;
        if (z17) {
            return ((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()) + '/' + nameAppendix;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
        sb6.append('/');
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(url.getBytes()));
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v10, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "url_"
            boolean r1 = r9 instanceof bz.o
            if (r1 == 0) goto L16
            r1 = r9
            bz.o r1 = (bz.o) r1
            int r2 = r1.f118227i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f118227i = r2
            goto L1b
        L16:
            bz.o r1 = new bz.o
            r1.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r1.f118225g
            pz5.a r2 = pz5.a.f440719d
            int r3 = r1.f118227i
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L42
            if (r3 != r6) goto L3a
            java.lang.Object r8 = r1.f118224f
            kotlinx.coroutines.sync.d r8 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r8
            java.lang.Object r2 = r1.f118223e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.f118222d
            bz.w r1 = (bz.w) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = r8
            r8 = r2
            goto L6a
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            if (r8 == 0) goto L50
            int r9 = r8.length()
            if (r9 != 0) goto L4e
            goto L50
        L4e:
            r9 = r4
            goto L51
        L50:
            r9 = r6
        L51:
            if (r9 == 0) goto L56
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L56:
            kotlinx.coroutines.sync.d r9 = r7.f118254g
            r1.f118222d = r7
            r1.f118223e = r8
            r1.f118224f = r9
            r1.f118227i = r6
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            java.lang.Object r1 = r9.b(r5, r1)
            if (r1 != r2) goto L69
            return r2
        L69:
            r1 = r7
        L6a:
            java.util.Map r1 = r1.f118253f     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            r2.append(r8)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L8d
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r8 = r1.get(r8)     // Catch: java.lang.Throwable -> L8d
            bz.i r8 = (bz.i) r8     // Catch: java.lang.Throwable -> L8d
            if (r8 == 0) goto L83
            r4 = r6
        L83:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L8d
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            r9.d(r5)
            return r8
        L8d:
            r8 = move-exception
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            r9.d(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.w.f(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
