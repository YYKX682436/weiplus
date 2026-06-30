package qy1;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f449276a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final int f449277b;

    /* renamed from: c, reason: collision with root package name */
    public final u26.w f449278c;

    public m() {
        oy1.m mVar = oy1.m.f431418a;
        java.lang.Integer num = oy1.m.f431420c;
        int intValue = num != null ? num.intValue() : 5;
        this.f449277b = intValue;
        this.f449278c = u26.z.a(intValue, null, null, 6, null);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a), null, null, new qy1.h(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qy1.i r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof qy1.j
            if (r0 == 0) goto L13
            r0 = r6
            qy1.j r0 = (qy1.j) r0
            int r1 = r0.f449269g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f449269g = r1
            goto L18
        L13:
            qy1.j r0 = new qy1.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f449267e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f449269g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f449266d
            qy1.m r5 = (qy1.m) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            u26.w r6 = r4.f449278c
            r0.f449266d = r4
            r0.f449269g = r3
            u26.o r6 = (u26.o) r6
            java.lang.Object r5 = r6.t(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.util.concurrent.atomic.AtomicInteger r6 = r5.f449276a
            r6.incrementAndGet()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "addReceiveCoroutineScope cur free sendingSize = "
            r6.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r5 = r5.f449276a
            int r5 = r5.get()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "MicroMsg.ReceiverManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r5)
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.m.a(qy1.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qy1.k
            if (r0 == 0) goto L13
            r0 = r5
            qy1.k r0 = (qy1.k) r0
            int r1 = r0.f449273g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f449273g = r1
            goto L18
        L13:
            qy1.k r0 = new qy1.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f449271e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f449273g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f449270d
            qy1.m r0 = (qy1.m) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            qy1.l r5 = new qy1.l
            r2 = 0
            r5.<init>(r4, r2)
            r0.f449270d = r4
            r0.f449273g = r3
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.a4.c(r2, r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            qy1.i r5 = (qy1.i) r5
            if (r5 == 0) goto L54
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f449276a
            r1.decrementAndGet()
        L54:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " getFreeCoroutineScope cur free sendingSize = "
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f449276a
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.ReceiverManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.m.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
