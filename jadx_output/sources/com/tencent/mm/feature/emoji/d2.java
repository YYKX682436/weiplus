package com.tencent.mm.feature.emoji;

/* loaded from: classes11.dex */
public final class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f66220f;

    public d2(java.lang.String str, java.lang.String str2, kotlinx.coroutines.q qVar) {
        this.f66218d = str;
        this.f66219e = str2;
        this.f66220f = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f66219e
            java.lang.String r1 = r8.f66218d
            java.lang.String r2 = "MicroMsg.EmojiUploadAndPrepareTask"
            java.lang.String r3 = "downloadEmojiFromUrl empty data, url="
            r4 = 0
            r12.b r5 = new r12.b     // Catch: java.lang.Exception -> L4b
            r5.<init>()     // Catch: java.lang.Exception -> L4b
            q11.b r5 = r5.b(r1)     // Catch: java.lang.Exception -> L4b
            if (r5 == 0) goto L17
            byte[] r5 = r5.f359533c     // Catch: java.lang.Exception -> L4b
            goto L18
        L17:
            r5 = 0
        L18:
            if (r5 == 0) goto L3b
            int r6 = r5.length     // Catch: java.lang.Exception -> L4b
            r7 = 1
            if (r6 != 0) goto L20
            r6 = r7
            goto L21
        L20:
            r6 = r4
        L21:
            if (r6 == 0) goto L24
            goto L3b
        L24:
            com.tencent.mm.vfs.r6 r3 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L4b
            r3.<init>(r0)     // Catch: java.lang.Exception -> L4b
            com.tencent.mm.vfs.r6 r3 = r3.s()     // Catch: java.lang.Exception -> L4b
            if (r3 == 0) goto L32
            r3.J()     // Catch: java.lang.Exception -> L4b
        L32:
            int r3 = r5.length     // Catch: java.lang.Exception -> L4b
            int r3 = com.tencent.mm.vfs.w6.S(r0, r5, r4, r3)     // Catch: java.lang.Exception -> L4b
            if (r3 < 0) goto L61
            r4 = r7
            goto L61
        L3b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            r5.<init>(r3)     // Catch: java.lang.Exception -> L4b
            r5.append(r1)     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L4b
            com.tencent.mars.xlog.Log.e(r2, r3)     // Catch: java.lang.Exception -> L4b
            goto L61
        L4b:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "downloadEmojiFromUrl error: "
            r5.<init>(r6)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.mars.xlog.Log.e(r2, r3)
        L61:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "downloadEmojiFromUrl url="
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = " targetPath="
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " success="
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            kotlinx.coroutines.q r0 = r8.f66220f
            r1 = r0
            kotlinx.coroutines.r r1 = (kotlinx.coroutines.r) r1
            boolean r1 = r1.n()
            if (r1 == 0) goto L98
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)
            r0.resumeWith(r1)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.d2.run():void");
    }
}
