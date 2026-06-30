package kk4;

/* loaded from: classes15.dex */
public final class q extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.v f390099d;

    public q(kk4.v vVar) {
        this.f390099d = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (((r1 == null || (r1 = r1.f390079e) == null) ? false : com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.vfs.w6.i(r1, false))) == false) goto L28;
     */
    @Override // java.util.TimerTask, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            kk4.v r0 = r8.f390099d
            dn.o r1 = r0.f390114f
            boolean r1 = r1 instanceof ck4.b
            if (r1 != 0) goto La
            goto Lb5
        La:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.U
            long r1 = r1 - r3
            kk4.c r3 = r0.f390110b
            if (r3 == 0) goto Lb5
            kk4.f0 r3 = (kk4.f0) r3
            long r4 = r3.mo100920x21a0b6d0()
            long r6 = r3.mo100915xddd35a52()
            long r4 = r4 - r6
            int r3 = r0.W
            long r6 = (long) r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto Lb5
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lb5
            long r1 = r0.V
            int r3 = r0.X
            long r6 = (long) r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lb5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkDownloadOrFileState bufferMs:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r0.f390109a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            kk4.h r1 = r0.f390113e
            if (r1 == 0) goto Laf
            java.lang.String r1 = r1.f390078d
            if (r1 == 0) goto Laf
            java.lang.Class<cf0.z> r3 = cf0.z.class
            i95.m r3 = i95.n0.c(r3)
            cf0.z r3 = (cf0.z) r3
            ek4.s r3 = r3.Di()
            r3.getClass()
            java.util.HashMap r3 = r3.f335218a
            boolean r1 = r3.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L6b
            boolean r1 = r0.f390115g
            if (r1 != 0) goto L7f
        L6b:
            kk4.h r1 = r0.f390113e
            if (r1 == 0) goto L7c
            java.lang.String r1 = r1.f390079e
            if (r1 == 0) goto L7c
            java.lang.String r1 = com.p314xaae8f345.mm.vfs.w6.i(r1, r3)
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            goto L7d
        L7c:
            r1 = r3
        L7d:
            if (r1 != 0) goto Laf
        L7f:
            kk4.h r1 = r0.f390113e
            if (r1 == 0) goto L8f
            java.lang.String r1 = r1.f390079e
            if (r1 == 0) goto L8f
            java.lang.String r1 = com.p314xaae8f345.mm.vfs.w6.i(r1, r3)
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r1)
        L8f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "checkIfDownloaderCanceled isFileExists:"
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            r1 = 1
            r2 = 0
            kk4.b.e(r0, r2, r1, r2)
            r0.L()
            long r1 = r0.V
            r3 = 1
            long r1 = r1 + r3
            r0.V = r1
        Laf:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.U = r1
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kk4.q.run():void");
    }
}
