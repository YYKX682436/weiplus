package co5;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final co5.b f43810a = new co5.b();

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:14)|15|(1:17)|18|19))|30|6|7|(0)(0)|11|12|(0)|15|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof co5.a
            if (r0 == 0) goto L13
            r0 = r6
            co5.a r0 = (co5.a) r0
            int r1 = r0.f43808f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43808f = r1
            goto L18
        L13:
            co5.a r0 = new co5.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f43806d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f43808f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L77
            goto L6c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L77
            r45.a17 r6 = new r45.a17     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = c01.z1.r()     // Catch: java.lang.Throwable -> L77
            r6.f369647d = r2     // Catch: java.lang.Throwable -> L77
            r6.f369648e = r5     // Catch: java.lang.Throwable -> L77
            com.tencent.mm.modelbase.l r5 = new com.tencent.mm.modelbase.l     // Catch: java.lang.Throwable -> L77
            r5.<init>()     // Catch: java.lang.Throwable -> L77
            r2 = 9120(0x23a0, float:1.278E-41)
            r5.f70667d = r2     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "/cgi-bin/micromsg-bin/voipilinkgetsdkmode"
            r5.f70666c = r2     // Catch: java.lang.Throwable -> L77
            r5.f70664a = r6     // Catch: java.lang.Throwable -> L77
            r45.b17 r6 = new r45.b17     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r5.f70665b = r6     // Catch: java.lang.Throwable -> L77
            com.tencent.mm.modelbase.o r5 = r5.a()     // Catch: java.lang.Throwable -> L77
            com.tencent.mm.modelbase.i r6 = new com.tencent.mm.modelbase.i     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r6.p(r5)     // Catch: java.lang.Throwable -> L77
            r0.f43808f = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = rm0.h.b(r6, r0)     // Catch: java.lang.Throwable -> L77
            if (r6 != r1) goto L6c
            return r1
        L6c:
            com.tencent.mm.modelbase.f r6 = (com.tencent.mm.modelbase.f) r6     // Catch: java.lang.Throwable -> L77
            com.tencent.mm.protobuf.f r5 = r6.f70618d     // Catch: java.lang.Throwable -> L77
            r45.b17 r5 = (r45.b17) r5     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)     // Catch: java.lang.Throwable -> L77
            goto L82
        L77:
            r5 = move-exception
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)
        L82:
            java.lang.Throwable r6 = kotlin.Result.m524exceptionOrNullimpl(r5)
            if (r6 == 0) goto L92
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "MicroMsg.ILinkVoIP.CgiHelper"
            java.lang.String r2 = "get ilink mode error"
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r6, r2, r0)
        L92:
            boolean r6 = kotlin.Result.m527isFailureimpl(r5)
            if (r6 == 0) goto L99
            r5 = 0
        L99:
            r45.b17 r5 = (r45.b17) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co5.b.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
