package aq5;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94795a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f94796b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f94797c;

    /* renamed from: d, reason: collision with root package name */
    public final aq5.i f94798d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f94799e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f94800f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f94801g;

    /* renamed from: h, reason: collision with root package name */
    public final long f94802h;

    public o(java.lang.String tag, yz5.a getContext, yz5.l getUserInfo, aq5.i receiveProto, yz5.q failAndDisconnect, yz5.l onDisconnect, yz5.a unInit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getContext, "getContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getUserInfo, "getUserInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiveProto, "receiveProto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failAndDisconnect, "failAndDisconnect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDisconnect, "onDisconnect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unInit, "unInit");
        this.f94795a = tag;
        this.f94796b = getContext;
        this.f94797c = getUserInfo;
        this.f94798d = receiveProto;
        this.f94799e = failAndDisconnect;
        this.f94800f = onDisconnect;
        this.f94801g = unInit;
        this.f94802h = 1L;
    }

    public static final boolean a(aq5.o oVar, byte[] key) {
        byte[] bArr;
        bw5.zd0 zd0Var;
        oVar.getClass();
        r45.u77 u77Var = (r45.u77) ((aq5.d0) oVar.f94798d).a(1, null, new r45.u77(), false, "doReceiverNegotiation: connection closed", 10002, false);
        if (u77Var == null) {
            return false;
        }
        byte[] bArr2 = u77Var.f468664d.f273689a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr2, "getBytes(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        byte[] a17 = kk.a.f389997a.a(bArr2, key);
        if (a17 == null) {
            a17 = new byte[0];
        }
        aq5.f fVar = (aq5.f) oVar.f94796b.mo152xb9724478();
        if (fVar != null && (zd0Var = fVar.f94765b) != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = zd0Var.f117482h[3] ? zd0Var.f117480f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
            if (gVar != null) {
                bArr = gVar.f273689a;
                boolean equals = java.util.Arrays.equals(a17, bArr);
                java.lang.String str = oVar.f94795a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doReceiverNegotiation receive auth request, isAuthOk: " + equals);
                r45.v77 v77Var = new r45.v77();
                v77Var.f469508d = equals;
                byte[] mo14344x5f01b1f6 = v77Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                r45.j87 j87Var = new r45.j87();
                j87Var.f459186d = 1;
                j87Var.f459187e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
                i95.m c17 = i95.n0.c(gz.l.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                byte[] mo14344x5f01b1f62 = j87Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doReceiverNegotiation send auth response, result: " + com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.h(mo14344x5f01b1f62));
                return equals;
            }
        }
        bArr = null;
        boolean equals2 = java.util.Arrays.equals(a17, bArr);
        java.lang.String str2 = oVar.f94795a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doReceiverNegotiation receive auth request, isAuthOk: " + equals2);
        r45.v77 v77Var2 = new r45.v77();
        v77Var2.f469508d = equals2;
        byte[] mo14344x5f01b1f63 = v77Var2.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f63, "toByteArray(...)");
        r45.j87 j87Var2 = new r45.j87();
        j87Var2.f459186d = 1;
        j87Var2.f459187e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(mo14344x5f01b1f63, 0, mo14344x5f01b1f63.length);
        i95.m c172 = i95.n0.c(gz.l.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c172, "getService(...)");
        byte[] mo14344x5f01b1f622 = j87Var2.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f622, "toByteArray(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doReceiverNegotiation send auth response, result: " + com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.h(mo14344x5f01b1f622));
        return equals2;
    }

    public static final boolean b(aq5.o oVar, byte[] bArr) {
        oVar.getClass();
        r45.w77 w77Var = (r45.w77) ((aq5.d0) oVar.f94798d).a(2, bArr, new r45.w77(), true, "doReceiverNegotiation: connection closed", 10002, false);
        if (w77Var == null) {
            return false;
        }
        long j17 = w77Var.f470488d;
        long j18 = oVar.f94802h;
        long highestOneBit = java.lang.Long.highestOneBit(j17 & j18);
        java.lang.String str = oVar.f94795a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doReceiverNegotiation receive check capability, senderVersionMask:" + j17 + " receiverVersionMask:" + j18 + " negotiatedVersion:" + highestOneBit);
        r45.x77 x77Var = new r45.x77();
        x77Var.f471382d = j18;
        dq5.a aVar = dq5.a.f323904a;
        byte[] mo14344x5f01b1f6 = x77Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doReceiverNegotiation send check capability response, result: " + aVar.a(2, mo14344x5f01b1f6, bArr));
        if (highestOneBit != 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doReceiverNegotiation check capability failed, no intersection");
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:15|16))(5:17|(1:47)(1:23)|24|(3:26|(1:28)(1:45)|(2:30|(1:32)(6:33|(1:35)(1:44)|36|(1:40)|41|(1:43))))|46)|12|13))|50|6|7|(0)(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0033, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        r14.f94799e.mo147xb9724478("initFileTransferReceive: error", new java.lang.Integer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6), r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(aq5.o r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
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
        java.lang.String str = this.f94795a;
        long j18 = b87Var.f452169f;
        if (j18 <= 0) {
            return 0;
        }
        java.util.LinkedList content_infos = b87Var.f452168e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content_infos, "content_infos");
        java.util.Iterator it = content_infos.iterator();
        if (it.hasNext()) {
            java.lang.Long valueOf = java.lang.Long.valueOf(((r45.y77) it.next()).f472377e);
            while (it.hasNext()) {
                java.lang.Long valueOf2 = java.lang.Long.valueOf(((r45.y77) it.next()).f472377e);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "checkCanPrepare StatFs error", new java.lang.Object[0]);
            j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        boolean z17 = j17 > j19 ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkCanPrepare() called isAvailable:" + z17 + " totalFileSize = " + j18 + ", maxFileSize = " + longValue + ", requiredSize = " + j19 + ", availableSize = " + j17);
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
    public final java.lang.Object e(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof aq5.l
            if (r0 == 0) goto L13
            r0 = r8
            aq5.l r0 = (aq5.l) r0
            int r1 = r0.f94786g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94786g = r1
            goto L18
        L13:
            aq5.l r0 = new aq5.l
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f94784e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f94786g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f94783d
            aq5.o r0 = (aq5.o) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L44
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r0.f94783d = r7
            r0.f94786g = r3
            yz5.l r8 = r7.f94797c
            java.lang.Object r8 = r8.mo146xb9724478(r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            r0 = r7
        L44:
            bw5.ge0 r8 = (bw5.ge0) r8
            bw5.zf0 r1 = new bw5.zf0
            r1.<init>()
            java.lang.String r2 = cq5.i.f303083h
            r1.f117510d = r2
            boolean[] r2 = r1.f117512f
            r2[r3] = r3
            java.lang.String r4 = cq5.i.f303084i
            r1.f117511e = r4
            r4 = 2
            r2[r4] = r3
            java.lang.Class<gz.l> r2 = gz.l.class
            i95.m r3 = i95.n0.c(r2)
            java.lang.String r4 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            gz.l r3 = (gz.l) r3
            kp.s r3 = (kp.s) r3
            java.lang.String r5 = "F2F-Transfer"
            r6 = 0
            bw5.yf0 r8 = r3.wi(r5, r8, r1, r6)
            int r1 = r8.f117004g
            r0.getClass()
            i95.m r2 = i95.n0.c(r2)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            gz.l r2 = (gz.l) r2
            aq5.m r3 = new aq5.m
            r3.<init>(r0)
            kp.s r2 = (kp.s) r2
            r2.f392364d = r3
            java.lang.String r2 = aq5.h.c(r8)
            java.lang.String r3 = "initForReceiver() called initResult:"
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = r0.f94795a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            aq5.r0 r2 = new aq5.r0
            boolean[] r3 = r8.f117006i
            r4 = 3
            boolean r3 = r3[r4]
            if (r3 == 0) goto La2
            bw5.wd0 r8 = r8.f117003f
            goto La7
        La2:
            bw5.wd0 r8 = new bw5.wd0
            r8.<init>()
        La7:
            r2.<init>(r1, r8)
            yz5.a r8 = r0.f94796b
            java.lang.Object r8 = r8.mo152xb9724478()
            aq5.f r8 = (aq5.f) r8
            if (r8 != 0) goto Lb5
            goto Lb7
        Lb5:
            r8.f94769f = r2
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
    public final java.lang.Object f(int r56, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r57) {
        /*
            Method dump skipped, instructions count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.o.f(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object g(byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str = this.f94795a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "receiveFilesAfterPrepare: all files received, waiting SayGoodbye");
        r45.f87 f87Var = (r45.f87) ((aq5.d0) this.f94798d).a(6, bArr, new r45.f87(), true, "receiveFilesAfterPrepare: connection closed while waiting SayGoodbye", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, true);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.a aVar = this.f94801g;
        if (f87Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "receiveFilesAfterPrepare: SayGoodbye not received, calling unInit() anyway");
            aVar.mo152xb9724478();
            return f0Var;
        }
        r45.g87 g87Var = new r45.g87();
        g87Var.f456529d = true;
        dq5.a aVar2 = dq5.a.f323904a;
        byte[] mo14344x5f01b1f6 = g87Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "receiveFilesAfterPrepare: SayGoodbye received, response sent=" + aVar2.a(6, mo14344x5f01b1f6, bArr) + ", calling unInit()");
        aVar.mo152xb9724478();
        return f0Var;
    }
}
