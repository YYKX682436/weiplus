package nz0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: h, reason: collision with root package name */
    public static nz0.e f423070h;

    /* renamed from: i, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.r2 f423071i;

    /* renamed from: a, reason: collision with root package name */
    public static final nz0.o f423063a = new nz0.o();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f423064b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f423065c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashSet f423066d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f423067e = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: f, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f423068f = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public static final android.util.ArrayMap f423069g = new android.util.ArrayMap();

    /* renamed from: j, reason: collision with root package name */
    public static final android.util.ArrayMap f423072j = new android.util.ArrayMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nz0.o r4, int r5, java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nz0.o.a(nz0.o, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, int r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof nz0.f
            if (r0 == 0) goto L13
            r0 = r11
            nz0.f r0 = (nz0.f) r0
            int r1 = r0.f423037i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f423037i = r1
            goto L18
        L13:
            nz0.f r0 = new nz0.f
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f423035g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f423037i
            r3 = 2
            r4 = 1
            java.lang.String r5 = "MicroMsg.Maas.CreationSameInfoHolder"
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f423033e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f423032d
            nz0.o r10 = (nz0.o) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lb9
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            int r9 = r0.f423034f
            java.lang.Object r10 = r0.f423033e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f423032d
            nz0.o r2 = (nz0.o) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L94
        L4e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "await info "
            r11.<init>(r2)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)
            java.util.concurrent.ConcurrentHashMap r11 = nz0.o.f423064b
            boolean r11 = r11.contains(r9)
            if (r11 != 0) goto Lb3
            java.lang.String r11 = "awaitInfo no cache, need await"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)
            android.util.ArrayMap r11 = nz0.o.f423069g
            java.lang.Object r11 = r11.get(r9)
            kotlinx.coroutines.r2 r11 = (p3325xe03a0797.p3326xc267989b.r2) r11
            r2 = 0
            if (r11 == 0) goto L9b
            boolean r6 = r11.a()
            if (r6 == 0) goto L81
            goto L82
        L81:
            r11 = r2
        L82:
            if (r11 == 0) goto L9b
            r0.f423032d = r8
            r0.f423033e = r9
            r0.f423034f = r10
            r0.f423037i = r4
            java.lang.Object r11 = r11.C(r0)
            if (r11 != r1) goto L93
            return r1
        L93:
            r2 = r8
        L94:
            jz5.f0 r11 = jz5.f0.f384359a
            r7 = r11
            r11 = r10
            r10 = r2
            r2 = r7
            goto L9d
        L9b:
            r11 = r10
            r10 = r8
        L9d:
            if (r2 != 0) goto Lb9
            java.lang.String r2 = "awaitInfo template not been preloaded"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r2)
            nz0.o r2 = nz0.o.f423063a
            r0.f423032d = r10
            r0.f423033e = r9
            r0.f423037i = r3
            java.lang.Object r11 = r2.g(r9, r11, r0)
            if (r11 != r1) goto Lb9
            return r1
        Lb3:
            java.lang.String r10 = "awaitInfo load template from cache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r10)
            r10 = r8
        Lb9:
            r45.rz6 r9 = r10.d(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nz0.o.b(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r6, java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nz0.o.c(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r45.rz6 d(java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        r45.rz6 rz6Var = (r45.rz6) f423064b.get(templateId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get ");
        sb6.append(templateId);
        sb6.append(" info ");
        sb6.append(rz6Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.CreationSameInfoHolder", sb6.toString());
        return rz6Var;
    }

    public final void e(java.lang.String templateId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        if (templateId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Maas.CreationSameInfoHolder", "template id is empty");
        } else {
            f423069g.put(templateId, p3325xe03a0797.p3326xc267989b.l.d(f423068f, null, null, new nz0.k(templateId, i17, null), 3, null));
        }
    }

    public final void f(int i17, java.lang.String cacheKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
        nz0.e eVar = (nz0.e) f423065c.get(cacheKey);
        if (java.lang.System.currentTimeMillis() > (eVar != null ? eVar.f423030a : 0L)) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = f423071i;
            boolean z17 = false;
            if (r2Var != null && r2Var.a()) {
                z17 = true;
            }
            if (!z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadTemplateList cached list expire ");
                sb6.append(eVar != null ? java.lang.Long.valueOf(eVar.f423030a) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.CreationSameInfoHolder", sb6.toString());
                f423070h = null;
                f423071i = p3325xe03a0797.p3326xc267989b.l.d(f423067e, null, null, new nz0.l(i17, cacheKey, null), 3, null);
                return;
            }
        }
        f423070h = eVar;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preloadTemplateList not expired ");
        sb7.append(eVar != null ? java.lang.Long.valueOf(eVar.f423030a) : null);
        sb7.append(", loading: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = f423071i;
        sb7.append(r2Var2 != null ? java.lang.Boolean.valueOf(r2Var2.a()) : null);
        sb7.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.CreationSameInfoHolder", sb7.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r6, int r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof nz0.m
            if (r0 == 0) goto L13
            r0 = r8
            nz0.m r0 = (nz0.m) r0
            int r1 = r0.f423059g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f423059g = r1
            goto L18
        L13:
            nz0.m r0 = new nz0.m
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f423057e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f423059g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f423056d
            java.lang.String r6 = (java.lang.String) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L64
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "reqImpl templateId: "
            r8.<init>(r2)
            r8.append(r6)
            java.lang.String r2 = ", scene: "
            r8.append(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.Maas.CreationSameInfoHolder"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            nz0.n r2 = new nz0.n
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f423056d = r6
            r0.f423059g = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r2, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            r45.rz6 r8 = (r45.rz6) r8
            if (r8 == 0) goto L6e
            java.util.concurrent.ConcurrentHashMap r7 = nz0.o.f423064b
            r7.put(r6, r8)
            goto L73
        L6e:
            java.util.HashSet r7 = nz0.o.f423066d
            r7.remove(r6)
        L73:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nz0.o.g(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
