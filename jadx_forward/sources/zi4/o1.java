package zi4;

/* loaded from: classes4.dex */
public abstract class o1 extends zi4.a {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f554778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host, yz5.a requestFactory) {
        super(cmdId, weakReference, host);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestFactory, "requestFactory");
        this.f554778g = requestFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003e A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:26:0x000f, B:4:0x0032, B:6:0x003e, B:8:0x0045, B:10:0x004b, B:12:0x0050, B:14:0x0054, B:15:0x0058, B:3:0x0022), top: B:25:0x000f }] */
    @Override // zi4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(byte[] r11, yz5.l r12) {
        /*
            r10 = this;
            java.lang.String r0 = "handleRequest: request is null cmdId="
            java.lang.String r1 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r1)
            r1 = 0
            java.lang.String r2 = r10.f554713d
            java.lang.String r3 = "MicroMsg.FLTStatusSyncActionHandler"
            if (r11 == 0) goto L22
            yz5.a r4 = r10.f554778g     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.mo152xb9724478()     // Catch: java.lang.Throwable -> L20
            r5 = r4
            com.tencent.mm.protobuf.f r5 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r5     // Catch: java.lang.Throwable -> L20
            r5.mo11468x92b714fd(r11)     // Catch: java.lang.Throwable -> L20
            com.tencent.mm.protobuf.f r4 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L32
            goto L22
        L20:
            r11 = move-exception
            goto L6b
        L22:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L20
            r11.append(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L20
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r11)     // Catch: java.lang.Throwable -> L20
            r4 = r1
        L32:
            zi4.s1 r11 = r10.b(r4)     // Catch: java.lang.Throwable -> L20
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L20
            com.tencent.pigeon.status.FLTStatusActionResponse r0 = new com.tencent.pigeon.status.FLTStatusActionResponse     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r10.f554713d     // Catch: java.lang.Throwable -> L20
            if (r11 == 0) goto L41
            long r6 = r11.f554793b     // Catch: java.lang.Throwable -> L20
            goto L43
        L41:
            r6 = 0
        L43:
            if (r11 == 0) goto L49
            java.lang.String r4 = r11.f554794c     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4b
        L49:
            java.lang.String r4 = ""
        L4b:
            r8 = r4
            com.tencent.pigeon.status.FLTStatusPlatformProto r9 = new com.tencent.pigeon.status.FLTStatusPlatformProto     // Catch: java.lang.Throwable -> L20
            if (r11 == 0) goto L58
            com.tencent.mm.protobuf.f r11 = r11.f554792a     // Catch: java.lang.Throwable -> L20
            if (r11 == 0) goto L58
            byte[] r1 = r11.mo14344x5f01b1f6()     // Catch: java.lang.Throwable -> L20
        L58:
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4 = r0
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r11 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)     // Catch: java.lang.Throwable -> L20
            kotlin.Result r11 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r11)     // Catch: java.lang.Throwable -> L20
            r12.mo146xb9724478(r11)     // Catch: java.lang.Throwable -> L20
            goto L9a
        L6b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleRequest: cmdId="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", err="
            r0.append(r1)
            java.lang.String r1 = r11.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r11 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r11)
            java.lang.Object r11 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)
            kotlin.Result r11 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r11)
            r12.mo146xb9724478(r11)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zi4.o1.a(byte[], yz5.l):void");
    }

    public abstract zi4.s1 b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar);
}
