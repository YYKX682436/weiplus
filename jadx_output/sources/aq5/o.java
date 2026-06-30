package aq5;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f13262a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f13263b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f13264c;

    /* renamed from: d, reason: collision with root package name */
    public final aq5.i f13265d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f13266e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f13267f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f13268g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13269h;

    public o(java.lang.String tag, yz5.a getContext, yz5.l getUserInfo, aq5.i receiveProto, yz5.q failAndDisconnect, yz5.l onDisconnect, yz5.a unInit) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(getContext, "getContext");
        kotlin.jvm.internal.o.g(getUserInfo, "getUserInfo");
        kotlin.jvm.internal.o.g(receiveProto, "receiveProto");
        kotlin.jvm.internal.o.g(failAndDisconnect, "failAndDisconnect");
        kotlin.jvm.internal.o.g(onDisconnect, "onDisconnect");
        kotlin.jvm.internal.o.g(unInit, "unInit");
        this.f13262a = tag;
        this.f13263b = getContext;
        this.f13264c = getUserInfo;
        this.f13265d = receiveProto;
        this.f13266e = failAndDisconnect;
        this.f13267f = onDisconnect;
        this.f13268g = unInit;
        this.f13269h = 1L;
    }

    public static final boolean a(aq5.o oVar, byte[] key) {
        byte[] bArr;
        bw5.zd0 zd0Var;
        oVar.getClass();
        r45.u77 u77Var = (r45.u77) ((aq5.d0) oVar.f13265d).a(1, null, new r45.u77(), false, "doReceiverNegotiation: connection closed", 10002, false);
        if (u77Var == null) {
            return false;
        }
        byte[] bArr2 = u77Var.f387131d.f192156a;
        kotlin.jvm.internal.o.f(bArr2, "getBytes(...)");
        kotlin.jvm.internal.o.g(key, "key");
        byte[] a17 = kk.a.f308464a.a(bArr2, key);
        if (a17 == null) {
            a17 = new byte[0];
        }
        aq5.f fVar = (aq5.f) oVar.f13263b.invoke();
        if (fVar != null && (zd0Var = fVar.f13232b) != null) {
            com.tencent.mm.protobuf.g gVar = zd0Var.f35949h[3] ? zd0Var.f35947f : com.tencent.mm.protobuf.g.f192155b;
            if (gVar != null) {
                bArr = gVar.f192156a;
                boolean equals = java.util.Arrays.equals(a17, bArr);
                java.lang.String str = oVar.f13262a;
                com.tencent.mars.xlog.Log.i(str, "doReceiverNegotiation receive auth request, isAuthOk: " + equals);
                r45.v77 v77Var = new r45.v77();
                v77Var.f387975d = equals;
                byte[] byteArray = v77Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                r45.j87 j87Var = new r45.j87();
                j87Var.f377653d = 1;
                j87Var.f377654e = new com.tencent.mm.protobuf.g(byteArray, 0, byteArray.length);
                i95.m c17 = i95.n0.c(gz.l.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                byte[] byteArray2 = j87Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
                com.tencent.mars.xlog.Log.i(str, "doReceiverNegotiation send auth response, result: " + com.tencent.wechat.aff.local_connection.d.f217358c.h(byteArray2));
                return equals;
            }
        }
        bArr = null;
        boolean equals2 = java.util.Arrays.equals(a17, bArr);
        java.lang.String str2 = oVar.f13262a;
        com.tencent.mars.xlog.Log.i(str2, "doReceiverNegotiation receive auth request, isAuthOk: " + equals2);
        r45.v77 v77Var2 = new r45.v77();
        v77Var2.f387975d = equals2;
        byte[] byteArray3 = v77Var2.toByteArray();
        kotlin.jvm.internal.o.f(byteArray3, "toByteArray(...)");
        r45.j87 j87Var2 = new r45.j87();
        j87Var2.f377653d = 1;
        j87Var2.f377654e = new com.tencent.mm.protobuf.g(byteArray3, 0, byteArray3.length);
        i95.m c172 = i95.n0.c(gz.l.class);
        kotlin.jvm.internal.o.f(c172, "getService(...)");
        byte[] byteArray22 = j87Var2.toByteArray();
        kotlin.jvm.internal.o.f(byteArray22, "toByteArray(...)");
        com.tencent.mars.xlog.Log.i(str2, "doReceiverNegotiation send auth response, result: " + com.tencent.wechat.aff.local_connection.d.f217358c.h(byteArray22));
        return equals2;
    }

    public static final boolean b(aq5.o oVar, byte[] bArr) {
        oVar.getClass();
        r45.w77 w77Var = (r45.w77) ((aq5.d0) oVar.f13265d).a(2, bArr, new r45.w77(), true, "doReceiverNegotiation: connection closed", 10002, false);
        if (w77Var == null) {
            return false;
        }
        long j17 = w77Var.f388955d;
        long j18 = oVar.f13269h;
        long highestOneBit = java.lang.Long.highestOneBit(j17 & j18);
        java.lang.String str = oVar.f13262a;
        com.tencent.mars.xlog.Log.i(str, "doReceiverNegotiation receive check capability, senderVersionMask:" + j17 + " receiverVersionMask:" + j18 + " negotiatedVersion:" + highestOneBit);
        r45.x77 x77Var = new r45.x77();
        x77Var.f389849d = j18;
        dq5.a aVar = dq5.a.f242371a;
        byte[] byteArray = x77Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        com.tencent.mars.xlog.Log.i(str, "doReceiverNegotiation send check capability response, result: " + aVar.a(2, byteArray, bArr));
        if (highestOneBit != 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.e(str, "doReceiverNegotiation check capability failed, no intersection");
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:15|16))(5:17|(1:47)(1:23)|24|(3:26|(1:28)(1:45)|(2:30|(1:32)(6:33|(1:35)(1:44)|36|(1:40)|41|(1:43))))|46)|12|13))|50|6|7|(0)(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0033, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        r14.f13266e.invoke("initFileTransferReceive: error", new java.lang.Integer(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL), r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(aq5.o r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.o.c(aq5.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d(r45.b87 b87Var) {
        java.lang.Long l17;
        long j17;
        java.lang.String str = this.f13262a;
        long j18 = b87Var.f370636f;
        if (j18 <= 0) {
            return 0;
        }
        java.util.LinkedList content_infos = b87Var.f370635e;
        kotlin.jvm.internal.o.f(content_infos, "content_infos");
        java.util.Iterator it = content_infos.iterator();
        if (it.hasNext()) {
            java.lang.Long valueOf = java.lang.Long.valueOf(((r45.y77) it.next()).f390844e);
            while (it.hasNext()) {
                java.lang.Long valueOf2 = java.lang.Long.valueOf(((r45.y77) it.next()).f390844e);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l17 = valueOf;
        } else {
            l17 = null;
        }
        java.lang.Long l18 = l17;
        long longValue = l18 != null ? l18.longValue() : 0L;
        long j19 = (j18 / 10) + j18 + longValue;
        try {
            j17 = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getAvailableBytes();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "checkCanPrepare StatFs error", new java.lang.Object[0]);
            j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        boolean z17 = j17 > j19 ? 1 : 0;
        com.tencent.mars.xlog.Log.i(str, "checkCanPrepare() called isAvailable:" + z17 + " totalFileSize = " + j18 + ", maxFileSize = " + longValue + ", requiredSize = " + j19 + ", availableSize = " + j17);
        return !z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof aq5.l
            if (r0 == 0) goto L13
            r0 = r8
            aq5.l r0 = (aq5.l) r0
            int r1 = r0.f13253g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13253g = r1
            goto L18
        L13:
            aq5.l r0 = new aq5.l
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f13251e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f13253g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f13250d
            aq5.o r0 = (aq5.o) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L44
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f13250d = r7
            r0.f13253g = r3
            yz5.l r8 = r7.f13264c
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            r0 = r7
        L44:
            bw5.ge0 r8 = (bw5.ge0) r8
            bw5.zf0 r1 = new bw5.zf0
            r1.<init>()
            java.lang.String r2 = cq5.i.f221550h
            r1.f35977d = r2
            boolean[] r2 = r1.f35979f
            r2[r3] = r3
            java.lang.String r4 = cq5.i.f221551i
            r1.f35978e = r4
            r4 = 2
            r2[r4] = r3
            java.lang.Class<gz.l> r2 = gz.l.class
            i95.m r3 = i95.n0.c(r2)
            java.lang.String r4 = "getService(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            gz.l r3 = (gz.l) r3
            kp.s r3 = (kp.s) r3
            java.lang.String r5 = "F2F-Transfer"
            r6 = 0
            bw5.yf0 r8 = r3.wi(r5, r8, r1, r6)
            int r1 = r8.f35471g
            r0.getClass()
            i95.m r2 = i95.n0.c(r2)
            kotlin.jvm.internal.o.f(r2, r4)
            gz.l r2 = (gz.l) r2
            aq5.m r3 = new aq5.m
            r3.<init>(r0)
            kp.s r2 = (kp.s) r2
            r2.f310831d = r3
            java.lang.String r2 = aq5.h.c(r8)
            java.lang.String r3 = "initForReceiver() called initResult:"
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = r0.f13262a
            com.tencent.mars.xlog.Log.i(r3, r2)
            aq5.r0 r2 = new aq5.r0
            boolean[] r3 = r8.f35473i
            r4 = 3
            boolean r3 = r3[r4]
            if (r3 == 0) goto La2
            bw5.wd0 r8 = r8.f35470f
            goto La7
        La2:
            bw5.wd0 r8 = new bw5.wd0
            r8.<init>()
        La7:
            r2.<init>(r1, r8)
            yz5.a r8 = r0.f13263b
            java.lang.Object r8 = r8.invoke()
            aq5.f r8 = (aq5.f) r8
            if (r8 != 0) goto Lb5
            goto Lb7
        Lb5:
            r8.f13236f = r2
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.o.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 12 */
    public final java.lang.Object f(int r56, kotlin.coroutines.Continuation r57) {
        /*
            Method dump skipped, instructions count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.o.f(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object g(byte[] bArr, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = this.f13262a;
        com.tencent.mars.xlog.Log.i(str, "receiveFilesAfterPrepare: all files received, waiting SayGoodbye");
        r45.f87 f87Var = (r45.f87) ((aq5.d0) this.f13265d).a(6, bArr, new r45.f87(), true, "receiveFilesAfterPrepare: connection closed while waiting SayGoodbye", com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, true);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.a aVar = this.f13268g;
        if (f87Var == null) {
            com.tencent.mars.xlog.Log.w(str, "receiveFilesAfterPrepare: SayGoodbye not received, calling unInit() anyway");
            aVar.invoke();
            return f0Var;
        }
        r45.g87 g87Var = new r45.g87();
        g87Var.f374996d = true;
        dq5.a aVar2 = dq5.a.f242371a;
        byte[] byteArray = g87Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        com.tencent.mars.xlog.Log.i(str, "receiveFilesAfterPrepare: SayGoodbye received, response sent=" + aVar2.a(6, byteArray, bArr) + ", calling unInit()");
        aVar.invoke();
        return f0Var;
    }
}
