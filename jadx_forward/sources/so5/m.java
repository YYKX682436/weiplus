package so5;

/* loaded from: classes14.dex */
public final class m implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final so5.a0 f492407d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f492408e;

    /* renamed from: f, reason: collision with root package name */
    public final yo5.h f492409f;

    /* renamed from: g, reason: collision with root package name */
    public final jo5.l f492410g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.q f492411h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 f492412i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f492413m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.SparseArray f492414n;

    /* renamed from: o, reason: collision with root package name */
    public final android.util.SparseArray f492415o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f492416p;

    public m(so5.a0 hwCodecManager, p3325xe03a0797.p3326xc267989b.y0 y0Var, yo5.h handlerDispatcher, jo5.l lVar, yz5.q decodeTextureInfoGetter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hwCodecManager, "hwCodecManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handlerDispatcher, "handlerDispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decodeTextureInfoGetter, "decodeTextureInfoGetter");
        this.f492407d = hwCodecManager;
        this.f492408e = y0Var;
        this.f492409f = handlerDispatcher;
        this.f492410g = lVar;
        this.f492411h = decodeTextureInfoGetter;
        this.f492412i = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        this.f492413m = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(handlerDispatcher));
        this.f492414n = new android.util.SparseArray();
        this.f492415o = new android.util.SparseArray();
        this.f492416p = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(so5.m r12, uo5.q r13, int r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof so5.g
            if (r0 == 0) goto L16
            r0 = r15
            so5.g r0 = (so5.g) r0
            int r1 = r0.f492366i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f492366i = r1
            goto L1b
        L16:
            so5.g r0 = new so5.g
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.f492364g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f492366i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L9c
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            int r14 = r0.f492363f
            java.lang.Object r12 = r0.f492362e
            r13 = r12
            uo5.q r13 = (uo5.q) r13
            java.lang.Object r12 = r0.f492361d
            so5.m r12 = (so5.m) r12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L62
        L44:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r14)
            so5.k r2 = new so5.k
            r2.<init>(r12, r13)
            r0.f492361d = r12
            r0.f492362e = r13
            r0.f492363f = r14
            r0.f492366i = r4
            yz5.q r4 = r12.f492411h
            java.lang.Object r15 = r4.mo147xb9724478(r15, r2, r0)
            if (r15 != r1) goto L62
            goto L9e
        L62:
            android.graphics.SurfaceTexture r15 = (android.graphics.SurfaceTexture) r15
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r15)
            r15 = r13
            uo5.l r15 = (uo5.l) r15
            java.lang.String r4 = r15.f511259c
            boolean r5 = r15.f511257a
            if (r5 != 0) goto L9f
            java.lang.String r5 = "setSurface: set surface"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            r15.f511261e = r2
            kotlinx.coroutines.y0 r6 = r12.f492413m
            r7 = 0
            r8 = 0
            so5.i r9 = new so5.i
            r15 = 0
            r9.<init>(r13, r14, r12, r15)
            r10 = 3
            r11 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r6, r7, r8, r9, r10, r11)
            so5.j r14 = new so5.j
            r14.<init>(r13, r15)
            r0.f492361d = r15
            r0.f492362e = r15
            r0.f492366i = r3
            yo5.h r12 = r12.f492409f
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r12, r14, r0)
            if (r12 != r1) goto L9c
            goto L9e
        L9c:
            jz5.f0 r1 = jz5.f0.f384359a
        L9e:
            return r1
        L9f:
            java.lang.String r12 = "setSurface: encode mode can not set surface"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r12)
            java.lang.Exception r12 = new java.lang.Exception
            java.lang.String r13 = "encode mode can not set surface"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: so5.m.a(so5.m, uo5.q, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(short s17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIP.DecoderManager", "closeCodec() called with: targetCodec = " + ((int) s17) + ", codecFlag = " + i17);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(6);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN).clear();
        allocateDirect.putShort((short) i17).putShort(s17).putShort((short) 0);
        this.f492412i.D(39, allocateDirect, allocateDirect.capacity());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(to5.a r19) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so5.m.c(to5.a):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        android.util.SparseArray sparseArray = this.f492414n;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.keyAt(i17);
            ((so5.d) sparseArray.valueAt(i17)).a();
        }
        sparseArray.clear();
    }
}
