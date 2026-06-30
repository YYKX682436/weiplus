package aq5;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94870a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f94871b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f94872c;

    /* renamed from: d, reason: collision with root package name */
    public final aq5.i f94873d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f94874e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f94875f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f94876g;

    /* renamed from: h, reason: collision with root package name */
    public final long f94877h;

    /* renamed from: i, reason: collision with root package name */
    public final int f94878i;

    /* renamed from: j, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3332x361a9b.m f94879j;

    /* renamed from: k, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f94880k;

    /* renamed from: l, reason: collision with root package name */
    public long f94881l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f94882m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94883n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f94884o;

    public y(java.lang.String tag, yz5.a getContext, yz5.l getUserInfo, aq5.i receiveProto, yz5.q failAndDisconnect, yz5.l onDisconnect, yz5.p onConnectStart) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getContext, "getContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getUserInfo, "getUserInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiveProto, "receiveProto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failAndDisconnect, "failAndDisconnect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDisconnect, "onDisconnect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConnectStart, "onConnectStart");
        this.f94870a = tag;
        this.f94871b = getContext;
        this.f94872c = getUserInfo;
        this.f94873d = receiveProto;
        this.f94874e = failAndDisconnect;
        this.f94875f = onDisconnect;
        this.f94876g = onConnectStart;
        this.f94877h = 1L;
        this.f94878i = 50;
        this.f94882m = new java.util.LinkedHashMap();
    }

    public static final boolean a(aq5.y yVar) {
        yVar.getClass();
        r45.v77 v77Var = (r45.v77) ((aq5.d0) yVar.f94873d).a(1, null, new r45.v77(), false, "doSenderNegotiation: connection closed while waiting for Auth response", 10002, true);
        if (v77Var == null) {
            return false;
        }
        boolean z17 = v77Var.f469508d;
        java.lang.String str = yVar.f94870a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doSenderNegotiation: received Auth response, success: " + z17);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doSenderNegotiation: Auth failed");
            yVar.f94875f.mo146xb9724478(10002);
        }
        return z17;
    }

    public static final boolean b(aq5.y yVar, byte[] bArr, long j17) {
        yVar.getClass();
        r45.x77 x77Var = (r45.x77) ((aq5.d0) yVar.f94873d).a(2, bArr, new r45.x77(), true, "doSenderNegotiation: connection closed while waiting for CheckCapability response", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, true);
        if (x77Var == null) {
            return false;
        }
        long j18 = x77Var.f471382d;
        long highestOneBit = java.lang.Long.highestOneBit(j17 & j18);
        java.lang.String str = "doSenderNegotiation: received CheckCapability response, receiverVersionMask:" + j18 + " senderVersionMask:" + j17 + " negotiatedVersion:" + highestOneBit;
        java.lang.String str2 = yVar.f94870a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (highestOneBit == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "doSenderNegotiation: CheckCapability version mismatch");
            yVar.f94875f.mo146xb9724478(10005);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doSenderNegotiation: CheckCapability successful, negotiatedVersion=" + highestOneBit);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(aq5.y r4, java.lang.String r5, bw5.as0 r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            boolean r0 = r7 instanceof aq5.r
            if (r0 == 0) goto L13
            r0 = r7
            aq5.r r0 = (aq5.r) r0
            int r1 = r0.f94823f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94823f = r1
            goto L18
        L13:
            aq5.r r0 = new aq5.r
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f94822e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f94823f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f94821d
            aq5.y r4 = (aq5.y) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L60
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            bw5.ae0 r7 = new bw5.ae0
            r7.<init>()
            r7.f106697d = r5
            r5 = 2
            boolean[] r2 = r7.f106699f
            r2[r5] = r3
            com.tencent.mm.protobuf.g r5 = new com.tencent.mm.protobuf.g
            byte[] r6 = r6.mo14344x5f01b1f6()
            r5.<init>(r6)
            r7.f106698e = r5
            r5 = 3
            r2[r5] = r3
            bq5.b r5 = new bq5.b
            r5.<init>(r7)
            r0.f94821d = r4
            r0.f94823f = r3
            java.lang.Object r7 = rm0.h.b(r5, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            com.tencent.mm.modelbase.f r7 = (com.p314xaae8f345.mm.p944x882e457a.f) r7
            java.lang.String r4 = r4.f94870a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "sendNotifyMsg() called msgSendRsp:"
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            boolean r4 = r7.b()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.y.d(aq5.y, java.lang.String, bw5.as0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(bw5.ud0 r17, java.lang.String r18, aq5.q0 r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.y.c(bw5.ud0, java.lang.String, aq5.q0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0 A[Catch: Exception -> 0x0204, LOOP:0: B:15:0x00ca->B:17:0x00d0, LOOP_END, TryCatch #0 {Exception -> 0x0204, blocks: (B:12:0x00c2, B:14:0x00c6, B:15:0x00ca, B:17:0x00d0, B:19:0x00da, B:21:0x0102, B:24:0x010d, B:26:0x014e, B:29:0x015f, B:31:0x0181, B:33:0x018f, B:36:0x01ae, B:38:0x01c2, B:40:0x01d1, B:41:0x01e0, B:44:0x01ef, B:47:0x0200, B:52:0x010b), top: B:11:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014e A[Catch: Exception -> 0x0204, TryCatch #0 {Exception -> 0x0204, blocks: (B:12:0x00c2, B:14:0x00c6, B:15:0x00ca, B:17:0x00d0, B:19:0x00da, B:21:0x0102, B:24:0x010d, B:26:0x014e, B:29:0x015f, B:31:0x0181, B:33:0x018f, B:36:0x01ae, B:38:0x01c2, B:40:0x01d1, B:41:0x01e0, B:44:0x01ef, B:47:0x0200, B:52:0x010b), top: B:11:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015f A[Catch: Exception -> 0x0204, TryCatch #0 {Exception -> 0x0204, blocks: (B:12:0x00c2, B:14:0x00c6, B:15:0x00ca, B:17:0x00d0, B:19:0x00da, B:21:0x0102, B:24:0x010d, B:26:0x014e, B:29:0x015f, B:31:0x0181, B:33:0x018f, B:36:0x01ae, B:38:0x01c2, B:40:0x01d1, B:41:0x01e0, B:44:0x01ef, B:47:0x0200, B:52:0x010b), top: B:11:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b A[Catch: Exception -> 0x0204, TryCatch #0 {Exception -> 0x0204, blocks: (B:12:0x00c2, B:14:0x00c6, B:15:0x00ca, B:17:0x00d0, B:19:0x00da, B:21:0x0102, B:24:0x010d, B:26:0x014e, B:29:0x015f, B:31:0x0181, B:33:0x018f, B:36:0x01ae, B:38:0x01c2, B:40:0x01d1, B:41:0x01e0, B:44:0x01ef, B:47:0x0200, B:52:0x010b), top: B:11:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(aq5.x0 r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.y.e(aq5.x0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r7, java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof aq5.v
            if (r0 == 0) goto L13
            r0 = r9
            aq5.v r0 = (aq5.v) r0
            int r1 = r0.f94840f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94840f = r1
            goto L18
        L13:
            aq5.v r0 = new aq5.v
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f94838d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f94840f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L5e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "sendFile() called with: fileIndex = "
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r2 = ", filePath = "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = r6.f94870a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            cq5.i r9 = cq5.i.f303076a
            r4 = 0
            r2 = 0
            cq5.i.b(r9, r4, r3, r2)
            r0.f94840f = r3
            java.lang.Object r9 = r6.g(r7, r8, r0)
            if (r9 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 != 0) goto L72
            cq5.i r8 = cq5.i.f303076a
            cq5.h r9 = cq5.h.f303072f
            r8.h(r9)
            cq5.g r9 = cq5.g.f303067f
            r8.g(r9)
        L72:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.y.f(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x045d A[Catch: all -> 0x04e4, TryCatch #0 {all -> 0x04e4, blocks: (B:18:0x0409, B:20:0x045d, B:79:0x049a), top: B:17:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fa A[Catch: all -> 0x030c, TryCatch #3 {all -> 0x030c, blocks: (B:22:0x02f4, B:24:0x02fa, B:26:0x02fe, B:31:0x030f, B:33:0x031a, B:34:0x031d, B:36:0x0324, B:40:0x0341, B:42:0x0363), top: B:21:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0523 A[Catch: Exception -> 0x0574, TRY_LEAVE, TryCatch #2 {Exception -> 0x0574, blocks: (B:28:0x0308, B:38:0x033d, B:57:0x051b, B:67:0x057a, B:68:0x057d, B:75:0x0523, B:81:0x04e0, B:63:0x0577), top: B:7:0x002e, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x049a A[Catch: all -> 0x04e4, TRY_LEAVE, TryCatch #0 {all -> 0x04e4, blocks: (B:18:0x0409, B:20:0x045d, B:79:0x049a), top: B:17:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x03c6 -> B:14:0x03e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r38, java.lang.String r39, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r40) {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq5.y.g(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
