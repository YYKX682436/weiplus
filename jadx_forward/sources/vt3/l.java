package vt3;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3970x2c87daa4 f521539b;

    /* renamed from: c, reason: collision with root package name */
    public static u26.w f521540c;

    /* renamed from: d, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.r2 f521541d;

    /* renamed from: e, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.r2 f521542e;

    /* renamed from: a, reason: collision with root package name */
    public static final vt3.l f521538a = new vt3.l();

    /* renamed from: f, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.y0 f521543f = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vt3.l r4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof vt3.k
            if (r0 == 0) goto L16
            r0 = r5
            vt3.k r0 = (vt3.k) r0
            int r1 = r0.f521537f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f521537f = r1
            goto L1b
        L16:
            vt3.k r0 = new vt3.k
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r4 = r0.f521535d
            pz5.a r5 = pz5.a.f440719d
            int r1 = r0.f521537f
            java.lang.String r2 = "AssetInfoStatistics"
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            goto L60
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            kotlinx.coroutines.r2 r4 = vt3.l.f521542e
            if (r4 != 0) goto L43
            java.lang.String r4 = "waitReady, initJob is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r4)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L73
        L43:
            boolean r4 = r4.a()
            if (r4 != r3) goto L4b
            r4 = r3
            goto L4c
        L4b:
            r4 = 0
        L4c:
            if (r4 == 0) goto L60
            java.lang.String r4 = "waitReady to join the init job"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
            kotlinx.coroutines.r2 r4 = vt3.l.f521542e
            if (r4 == 0) goto L60
            r0.f521537f = r3
            java.lang.Object r4 = r4.C(r0)
            if (r4 != r5) goto L60
            goto L73
        L60:
            kotlinx.coroutines.r2 r4 = vt3.l.f521541d
            if (r4 == 0) goto L6c
            com.tencent.maas.analytics.MJAssetInfoStatistics r4 = vt3.l.f521539b
            if (r4 != 0) goto L69
            goto L6c
        L69:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L73
        L6c:
            java.lang.String r4 = "waitReady but isReleased"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r4)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L73:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vt3.l.a(vt3.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(java.util.List mediaFilePaths, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFilePaths, "mediaFilePaths");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", "addMedia, mediaFilePaths: " + mediaFilePaths + ", scene: " + i17 + ", isFinal: " + z17);
        if (mediaFilePaths.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AssetInfoStatistics", "mediaFilePaths is empty");
        } else {
            c(new vt3.a(mediaFilePaths, i17, z17));
        }
    }

    public final void c(yz5.a aVar) {
        synchronized (this) {
            if (f521541d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", "already initialized");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
                if (!p3325xe03a0797.p3326xc267989b.z0.h(f521543f)) {
                    f521543f = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
                }
                if (f521540c == null) {
                    f521540c = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
                }
                f521541d = p3325xe03a0797.p3326xc267989b.l.d(f521543f, null, null, new vt3.c(null), 3, null);
                f521542e = p3325xe03a0797.p3326xc267989b.l.d(f521543f, null, null, new vt3.d(null), 3, null);
            }
        }
        u26.w wVar = f521540c;
        if (wVar != null) {
            wVar.e(new vt3.b(aVar, null));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AssetInfoStatistics", "taskChannel is null, cannot send task");
        }
    }

    public final synchronized void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", "release");
        if (f521541d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", "isReleased to return");
            return;
        }
        u26.w wVar = f521540c;
        if (wVar != null) {
            wVar.e(new vt3.f(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof vt3.i
            if (r0 == 0) goto L13
            r0 = r8
            vt3.i r0 = (vt3.i) r0
            int r1 = r0.f521532h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f521532h = r1
            goto L18
        L13:
            vt3.i r0 = new vt3.i
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f521530f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f521532h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L79
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            java.lang.Object r2 = r0.f521529e
            u26.w r2 = (u26.w) r2
            java.lang.Object r4 = r0.f521528d
            vt3.l r4 = (vt3.l) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L65
        L3f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.String r8 = "AssetInfoStatistics"
            java.lang.String r2 = "toBinaryBuffer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r2)
            r8 = 0
            r2 = 6
            u26.w r2 = u26.z.a(r8, r5, r5, r2, r5)
            u26.w r8 = vt3.l.f521540c
            if (r8 == 0) goto L68
            vt3.j r6 = new vt3.j
            r6.<init>(r2, r5)
            r0.f521528d = r7
            r0.f521529e = r2
            r0.f521532h = r4
            java.lang.Object r8 = r8.t(r6, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            jz5.f0 r8 = jz5.f0.f384359a
            goto L69
        L68:
            r8 = r5
        L69:
            if (r8 != 0) goto L6c
            return r5
        L6c:
            r0.f521528d = r5
            r0.f521529e = r5
            r0.f521532h = r3
            java.lang.Object r8 = r2.r(r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vt3.l.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
