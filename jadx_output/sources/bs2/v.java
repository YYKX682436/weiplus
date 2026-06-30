package bs2;

/* loaded from: classes2.dex */
public final class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs2.w f23954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f23955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bs2.h0 f23956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.o4 f23957d;

    public v(bs2.w wVar, yz5.l lVar, bs2.h0 h0Var, db2.o4 o4Var) {
        this.f23954a = wVar;
        this.f23955b = lVar;
        this.f23956c = h0Var;
        this.f23957d = o4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        r2.f23967e = r13;
        r2.f23968f = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r4 != bs2.h0.f23852o) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        r13 = new com.tencent.mm.autogen.events.FinderNextTabPreloadEvent();
        r13.f54313g.f7892a = r2.f23964b;
        r13.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        com.tencent.mars.xlog.Log.i("Finder.NativeDramaTabPreloadWorker", "onCgiBack: ok size=" + r1.size());
     */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r13) {
        /*
            r12 = this;
            com.tencent.mm.modelbase.f r13 = (com.tencent.mm.modelbase.f) r13
            java.lang.String r0 = "onCgiBack: ok size="
            java.lang.String r1 = "onCgiBack: fail errType="
            bs2.w r2 = r12.f23954a
            java.util.concurrent.locks.ReentrantLock r3 = r2.f23965c
            bs2.h0 r4 = r12.f23956c
            db2.o4 r5 = r12.f23957d
            r3.lock()
            r6 = 0
            r7 = 0
            boolean r8 = r2.f23970h     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = "Finder.NativeDramaTabPreloadWorker"
            if (r8 == 0) goto L20
            java.lang.String r13 = "onCgiBack: discarded"
            com.tencent.mars.xlog.Log.i(r9, r13)     // Catch: java.lang.Throwable -> La7
            goto L90
        L20:
            int r8 = r13.f70615a     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L75
            int r8 = r13.f70616b     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L75
            com.tencent.mm.protobuf.f r1 = r13.f70618d     // Catch: java.lang.Throwable -> La7
            r45.wj2 r1 = (r45.wj2) r1     // Catch: java.lang.Throwable -> La7
            r8 = 1
            if (r1 == 0) goto L34
            java.util.LinkedList r1 = r1.getList(r8)     // Catch: java.lang.Throwable -> La7
            goto L35
        L34:
            r1 = r6
        L35:
            if (r1 == 0) goto L3f
            boolean r10 = r1.isEmpty()     // Catch: java.lang.Throwable -> La7
            if (r10 == 0) goto L3e
            goto L3f
        L3e:
            r8 = r7
        L3f:
            if (r8 != 0) goto L6f
            r2.f23967e = r13     // Catch: java.lang.Throwable -> La7
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La7
            r2.f23968f = r10     // Catch: java.lang.Throwable -> La7
            bs2.h0 r13 = bs2.h0.f23852o     // Catch: java.lang.Throwable -> La7
            if (r4 != r13) goto L5b
            com.tencent.mm.autogen.events.FinderNextTabPreloadEvent r13 = new com.tencent.mm.autogen.events.FinderNextTabPreloadEvent     // Catch: java.lang.Throwable -> La7
            r13.<init>()     // Catch: java.lang.Throwable -> La7
            am.sc r4 = r13.f54313g     // Catch: java.lang.Throwable -> La7
            int r8 = r2.f23964b     // Catch: java.lang.Throwable -> La7
            r4.f7892a = r8     // Catch: java.lang.Throwable -> La7
            r13.e()     // Catch: java.lang.Throwable -> La7
        L5b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r13.<init>(r0)     // Catch: java.lang.Throwable -> La7
            int r0 = r1.size()     // Catch: java.lang.Throwable -> La7
            r13.append(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> La7
            com.tencent.mars.xlog.Log.i(r9, r13)     // Catch: java.lang.Throwable -> La7
            goto L90
        L6f:
            java.lang.String r13 = "onCgiBack: empty list"
            com.tencent.mars.xlog.Log.e(r9, r13)     // Catch: java.lang.Throwable -> La7
            goto L90
        L75:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La7
            int r1 = r13.f70615a     // Catch: java.lang.Throwable -> La7
            r0.append(r1)     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = " errCode="
            r0.append(r1)     // Catch: java.lang.Throwable -> La7
            int r13 = r13.f70616b     // Catch: java.lang.Throwable -> La7
            r0.append(r13)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> La7
            com.tencent.mars.xlog.Log.e(r9, r13)     // Catch: java.lang.Throwable -> La7
        L90:
            r2.f23970h = r7     // Catch: java.lang.Throwable -> Lb3
            r2.f23969g = r7     // Catch: java.lang.Throwable -> Lb3
            db2.o4 r13 = r2.f23966d     // Catch: java.lang.Throwable -> Lb3
            if (r13 != r5) goto L9a
            r2.f23966d = r6     // Catch: java.lang.Throwable -> Lb3
        L9a:
            r3.unlock()
            yz5.l r13 = r12.f23955b
            bs2.i0 r0 = bs2.i0.f23863g
            r13.invoke(r0)
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        La7:
            r13 = move-exception
            r2.f23970h = r7     // Catch: java.lang.Throwable -> Lb3
            r2.f23969g = r7     // Catch: java.lang.Throwable -> Lb3
            db2.o4 r0 = r2.f23966d     // Catch: java.lang.Throwable -> Lb3
            if (r0 != r5) goto Lb2
            r2.f23966d = r6     // Catch: java.lang.Throwable -> Lb3
        Lb2:
            throw r13     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r13 = move-exception
            r3.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.v.call(java.lang.Object):java.lang.Object");
    }
}
