package mt1;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot1.j f412770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ArrayBlockingQueue f412771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ArrayBlockingQueue f412772f;

    public l0(ot1.j jVar, java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue, java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue2) {
        this.f412770d = jVar;
        this.f412771e = arrayBlockingQueue;
        this.f412772f = arrayBlockingQueue2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = " written"
            java.lang.String r2 = "MicroMsg.CalcWxUpgraders"
            ot1.j r3 = r1.f412770d
            d95.b0 r4 = r3.f430382d
            java.lang.String r5 = "UPDATE WxFileIndex3 SET flags = flags | 0x01 WHERE msgId = ? AND username = ?"
            r7 = 0
            r9 = 0
            r10 = 0
        L10:
            r11 = 7
            java.util.concurrent.ArrayBlockingQueue r12 = r1.f412771e     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La2
            java.lang.Object r12 = r12.take()     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La2
            mt1.k0 r12 = (mt1.k0) r12     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La2
            java.lang.String r13 = r12.f412766a     // Catch: java.lang.InterruptedException -> L9b java.lang.Throwable -> La0
            int r13 = r13.length()     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La2
            if (r13 != 0) goto L23
            r13 = 1
            goto L24
        L23:
            r13 = 0
        L24:
            if (r13 == 0) goto L61
            long r14 = r12.f412768c     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            r3.f3(r11, r14)     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            long r14 = r12.f412767b     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            r16 = 1
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L61
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            r5.<init>()     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            java.lang.String r6 = "Done write thread, "
            r5.append(r6)     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            r5.append(r9)     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            r5.append(r0)     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r5)     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            if (r10 == 0) goto L56
            r4.getClass()     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            r4.t()     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
        L56:
            boolean r0 = r4.G()
            if (r0 == 0) goto Lc9
        L5c:
            r4.t()
            goto Lc9
        L61:
            int r9 = r9 + 1
            if (r10 != 0) goto L69
            r4.b()     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La4
            r10 = 1
        L69:
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> La0 java.lang.InterruptedException -> La2
            r16 = r7
            long r6 = r12.f412767b     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La0
            r7 = 0
            r14[r7] = r6     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La0
            java.lang.String r6 = r12.f412766a     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La0
            r8 = 1
            r14[r8] = r6     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La0
            r6 = 0
            r4.H(r6, r5, r14)     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La0
            long r13 = r12.f412768c     // Catch: java.lang.InterruptedException -> L9d java.lang.Throwable -> La0
            java.util.concurrent.ArrayBlockingQueue r6 = r1.f412772f     // Catch: java.lang.InterruptedException -> L99 java.lang.Throwable -> La0
            r6.put(r12)     // Catch: java.lang.InterruptedException -> L99 java.lang.Throwable -> La0
            r6 = r9 & 31
            if (r6 != 0) goto L96
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch: java.lang.InterruptedException -> L99 java.lang.Throwable -> La0
            r3.f3(r11, r6)     // Catch: java.lang.InterruptedException -> L99 java.lang.Throwable -> La0
            r4.t()     // Catch: java.lang.InterruptedException -> L99 java.lang.Throwable -> La0
            r10 = r7
        L96:
            r7 = r13
            goto L10
        L99:
            r7 = r13
            goto La4
        L9b:
            r16 = r7
        L9d:
            r7 = r16
            goto La4
        La0:
            r0 = move-exception
            goto Lca
        La2:
            r16 = r7
        La4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = "Thread interrupted, "
            r5.append(r6)     // Catch: java.lang.Throwable -> La0
            r5.append(r9)     // Catch: java.lang.Throwable -> La0
            r5.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> La0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> La0
            r3.f3(r11, r0)     // Catch: java.lang.Throwable -> La0
            boolean r0 = r4.G()
            if (r0 == 0) goto Lc9
            goto L5c
        Lc9:
            return
        Lca:
            boolean r2 = r4.G()
            if (r2 == 0) goto Ld3
            r4.t()
        Ld3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.l0.run():void");
    }
}
