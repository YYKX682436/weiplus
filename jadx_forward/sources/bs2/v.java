package bs2;

/* loaded from: classes2.dex */
public final class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs2.w f105487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f105488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bs2.h0 f105489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.o4 f105490d;

    public v(bs2.w wVar, yz5.l lVar, bs2.h0 h0Var, db2.o4 o4Var) {
        this.f105487a = wVar;
        this.f105488b = lVar;
        this.f105489c = h0Var;
        this.f105490d = o4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        r2.f105500e = r13;
        r2.f105501f = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r4 != bs2.h0.f105385o) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        r13 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad();
        r13.f135846g.f89425a = r2.f105497b;
        r13.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NativeDramaTabPreloadWorker", "onCgiBack: ok size=" + r1.size());
     */
    @Override // gm5.a
    /* renamed from: call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object r13) {
        /*
            r12 = this;
            com.tencent.mm.modelbase.f r13 = (com.p314xaae8f345.mm.p944x882e457a.f) r13
            java.lang.String r0 = "onCgiBack: ok size="
            java.lang.String r1 = "onCgiBack: fail errType="
            bs2.w r2 = r12.f105487a
            java.util.concurrent.locks.ReentrantLock r3 = r2.f105498c
            bs2.h0 r4 = r12.f105489c
            db2.o4 r5 = r12.f105490d
            r3.lock()
            r6 = 0
            r7 = 0
            boolean r8 = r2.f105503h     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = "Finder.NativeDramaTabPreloadWorker"
            if (r8 == 0) goto L20
            java.lang.String r13 = "onCgiBack: discarded"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r13)     // Catch: java.lang.Throwable -> La7
            goto L90
        L20:
            int r8 = r13.f152148a     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L75
            int r8 = r13.f152149b     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L75
            com.tencent.mm.protobuf.f r1 = r13.f152151d     // Catch: java.lang.Throwable -> La7
            r45.wj2 r1 = (r45.wj2) r1     // Catch: java.lang.Throwable -> La7
            r8 = 1
            if (r1 == 0) goto L34
            java.util.LinkedList r1 = r1.m75941xfb821914(r8)     // Catch: java.lang.Throwable -> La7
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
            r2.f105500e = r13     // Catch: java.lang.Throwable -> La7
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La7
            r2.f105501f = r10     // Catch: java.lang.Throwable -> La7
            bs2.h0 r13 = bs2.h0.f105385o     // Catch: java.lang.Throwable -> La7
            if (r4 != r13) goto L5b
            com.tencent.mm.autogen.events.FinderNextTabPreloadEvent r13 = new com.tencent.mm.autogen.events.FinderNextTabPreloadEvent     // Catch: java.lang.Throwable -> La7
            r13.<init>()     // Catch: java.lang.Throwable -> La7
            am.sc r4 = r13.f135846g     // Catch: java.lang.Throwable -> La7
            int r8 = r2.f105497b     // Catch: java.lang.Throwable -> La7
            r4.f89425a = r8     // Catch: java.lang.Throwable -> La7
            r13.e()     // Catch: java.lang.Throwable -> La7
        L5b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r13.<init>(r0)     // Catch: java.lang.Throwable -> La7
            int r0 = r1.size()     // Catch: java.lang.Throwable -> La7
            r13.append(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> La7
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r13)     // Catch: java.lang.Throwable -> La7
            goto L90
        L6f:
            java.lang.String r13 = "onCgiBack: empty list"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r9, r13)     // Catch: java.lang.Throwable -> La7
            goto L90
        L75:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La7
            int r1 = r13.f152148a     // Catch: java.lang.Throwable -> La7
            r0.append(r1)     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = " errCode="
            r0.append(r1)     // Catch: java.lang.Throwable -> La7
            int r13 = r13.f152149b     // Catch: java.lang.Throwable -> La7
            r0.append(r13)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> La7
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r9, r13)     // Catch: java.lang.Throwable -> La7
        L90:
            r2.f105503h = r7     // Catch: java.lang.Throwable -> Lb3
            r2.f105502g = r7     // Catch: java.lang.Throwable -> Lb3
            db2.o4 r13 = r2.f105499d     // Catch: java.lang.Throwable -> Lb3
            if (r13 != r5) goto L9a
            r2.f105499d = r6     // Catch: java.lang.Throwable -> Lb3
        L9a:
            r3.unlock()
            yz5.l r13 = r12.f105488b
            bs2.i0 r0 = bs2.i0.f105396g
            r13.mo146xb9724478(r0)
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        La7:
            r13 = move-exception
            r2.f105503h = r7     // Catch: java.lang.Throwable -> Lb3
            r2.f105502g = r7     // Catch: java.lang.Throwable -> Lb3
            db2.o4 r0 = r2.f105499d     // Catch: java.lang.Throwable -> Lb3
            if (r0 != r5) goto Lb2
            r2.f105499d = r6     // Catch: java.lang.Throwable -> Lb3
        Lb2:
            throw r13     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r13 = move-exception
            r3.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.v.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
    }
}
