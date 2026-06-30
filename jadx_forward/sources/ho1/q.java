package ho1;

/* loaded from: classes15.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364317e;

    public q(ho1.v vVar, long j17) {
        this.f364316d = vVar;
        this.f364317e = j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r2.f() != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            ho1.v r0 = r8.f364316d
            boolean r0 = r0.f364370i
            if (r0 != 0) goto L1e
            ho1.v r0 = r8.f364316d
            java.lang.String r0 = r0.f364362a
            java.lang.String r1 = "Not initiated, getRoamDiskInfoAsync return null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)
            ho1.v r0 = r8.f364316d
            com.tencent.wechat.aff.affroam.t0 r0 = r0.f364369h
            if (r0 == 0) goto L1d
            long r1 = r8.f364317e
            com.tencent.wechat.aff.affroam.x r3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x.f297539i
            r4 = -1
            r0.V(r1, r4, r3)
        L1d:
            return
        L1e:
            oo1.j r0 = oo1.j.f428678a
            ro1.v r0 = ro1.v.f479547a
            java.util.List r0 = r0.b()
            ho1.v r1 = r8.f364316d
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L33
        L31:
            r0 = r5
            goto L5a
        L33:
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            po1.d r2 = (po1.d) r2
            java.lang.String r2 = r2.f438833f
            po1.d r6 = r1.f364365d
            if (r6 == 0) goto L53
            java.lang.String r6 = r6.f438833f
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r6)
            if (r2 == 0) goto L37
            r0 = r3
            goto L5a
        L53:
            java.lang.String r0 = "unifyDevice"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            throw r4
        L5a:
            java.lang.String r1 = "mUDiskChannel"
            if (r0 == 0) goto L6f
            ho1.v r2 = r8.f364316d
            ro1.g r2 = r2.f364364c
            if (r2 == 0) goto L6b
            boolean r2 = r2.f()
            if (r2 == 0) goto L6f
            goto L70
        L6b:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r4
        L6f:
            r3 = r5
        L70:
            ho1.v r2 = r8.f364316d
            java.lang.String r2 = r2.f364362a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "getAllUsbStorageVolumeFromSystem, isOnline = "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ", isRootExist="
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            if (r3 != 0) goto L9e
            ho1.v r0 = r8.f364316d
            com.tencent.wechat.aff.affroam.t0 r0 = r0.f364369h
            if (r0 == 0) goto L9d
            long r1 = r8.f364317e
            com.tencent.wechat.aff.affroam.x r3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x.f297539i
            r4 = -2
            r0.V(r1, r4, r3)
        L9d:
            return
        L9e:
            ho1.v r0 = r8.f364316d
            ro1.g r0 = r0.f364364c
            if (r0 == 0) goto Ld4
            com.tencent.wechat.aff.affroam.x r0 = r0.j()
            ho1.v r1 = r8.f364316d
            java.lang.String r1 = r1.f364362a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getRoamDiskInfoAsync taskId="
            r2.<init>(r3)
            long r3 = r8.f364317e
            r2.append(r3)
            java.lang.String r3 = " Done, info(%s)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r3)
            ho1.v r1 = r8.f364316d
            com.tencent.wechat.aff.affroam.t0 r1 = r1.f364369h
            if (r1 == 0) goto Ld3
            long r2 = r8.f364317e
            r1.V(r2, r5, r0)
        Ld3:
            return
        Ld4:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ho1.q.run():void");
    }
}
