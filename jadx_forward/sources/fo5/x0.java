package fo5;

/* loaded from: classes11.dex */
public final class x0 implements fo5.t0 {

    /* renamed from: b, reason: collision with root package name */
    public volatile pi0.l1 f346678b;

    /* renamed from: c, reason: collision with root package name */
    public fo5.s0 f346679c;

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f346680d;

    /* renamed from: e, reason: collision with root package name */
    public fo5.u0 f346681e;

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f346677a = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f346682f = new java.util.LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0138 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003b, B:13:0x0110, B:15:0x011b, B:17:0x011f, B:18:0x012a, B:20:0x0138), top: B:11:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[Catch: all -> 0x015b, TryCatch #1 {all -> 0x015b, blocks: (B:35:0x0080, B:37:0x0084, B:39:0x008f, B:40:0x0096, B:44:0x014e), top: B:34:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e A[Catch: all -> 0x015b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x015b, blocks: (B:35:0x0080, B:37:0x0084, B:39:0x008f, B:40:0x0096, B:44:0x014e), top: B:34:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r23, fo5.u0 r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.x0.a(java.lang.Object, fo5.u0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7, yz5.a r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof fo5.w0
            if (r0 == 0) goto L13
            r0 = r9
            fo5.w0 r0 = (fo5.w0) r0
            int r1 = r0.f346674m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f346674m = r1
            goto L18
        L13:
            fo5.w0 r0 = new fo5.w0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f346672h
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f346674m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.f346668d
            yz5.a r7 = (yz5.a) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L85
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f346671g
            kotlinx.coroutines.sync.d r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r7
            java.lang.Object r8 = r0.f346670f
            yz5.a r8 = (yz5.a) r8
            java.lang.Object r2 = r0.f346669e
            java.lang.Object r4 = r0.f346668d
            fo5.x0 r4 = (fo5.x0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L64
        L49:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            kotlinx.coroutines.sync.d r9 = r6.f346677a
            r0.f346668d = r6
            r0.f346669e = r7
            r0.f346670f = r8
            r0.f346671g = r9
            r0.f346674m = r4
            kotlinx.coroutines.sync.k r9 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r9
            java.lang.Object r2 = r9.b(r5, r0)
            if (r2 != r1) goto L61
            return r1
        L61:
            r4 = r6
            r2 = r7
            r7 = r9
        L64:
            pi0.l1 r9 = r4.f346678b     // Catch: java.lang.Throwable -> L94
            r4.f346678b = r5     // Catch: java.lang.Throwable -> L94
            r4.f346679c = r5     // Catch: java.lang.Throwable -> L94
            r4.f346681e = r5     // Catch: java.lang.Throwable -> L94
            kotlinx.coroutines.sync.k r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r7
            r7.d(r5)
            if (r9 == 0) goto L91
            r0.f346668d = r8
            r0.f346669e = r5
            r0.f346670f = r5
            r0.f346671g = r5
            r0.f346674m = r3
            java.lang.Object r7 = r9.h(r2, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            r7 = r8
        L85:
            java.lang.String r8 = "MicroMsg.VoIPMPFlutterSessionManager"
            java.lang.String r9 = "Flutter instance destroyed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r9)
            if (r7 == 0) goto L91
            r7.mo152xb9724478()
        L91:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        L94:
            r8 = move-exception
            kotlinx.coroutines.sync.k r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r7
            r7.d(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.x0.b(java.lang.Object, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
