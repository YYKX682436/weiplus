package a75;

/* loaded from: classes11.dex */
public final class d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20985x9d84be29 f83473d;

    public d(com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20985x9d84be29 c20985x9d84be29) {
        this.f83473d = c20985x9d84be29;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (((a75.a) r5.put(r7, r6)) == null) goto L17;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            java.lang.String r0 = "msg"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            int r0 = r10.what
            java.lang.String r1 = "MicroMsg.Mvvm.PendingEventNotifier"
            r2 = 1
            if (r0 == 0) goto L8a
            if (r0 == r2) goto L1c
            r10 = 2
            if (r0 == r10) goto L13
            goto Ld0
        L13:
            com.tencent.mm.sdk.event.pending.PendingEventNotifier r10 = r9.f83473d
            java.util.HashMap r10 = r10.f273920h
            r10.clear()
            goto Ld0
        L1c:
            int r0 = r10.arg1
            r3 = 0
            if (r0 != r2) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r3
        L24:
            java.lang.Object r10 = r10.obj
            java.lang.String r4 = "null cannot be cast to non-null type T of com.tencent.mm.sdk.event.pending.PendingEventNotifier"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r10, r4)
            a75.a r10 = (a75.a) r10
            com.tencent.mm.sdk.event.pending.PendingEventNotifier r4 = r9.f83473d
            java.util.HashMap r5 = r4.f273920h
            java.lang.String r6 = r10.get_key()
            java.lang.Object r6 = r5.get(r6)
            a75.a r6 = (a75.a) r6
            if (r6 == 0) goto L52
            java.lang.String r7 = r6.get_key()
            a75.a r6 = r6.mo787xbd89c142(r10)
            java.lang.String r8 = "null cannot be cast to non-null type T of com.tencent.mm.sdk.event.pending.PendingEventNotifier.mergeNotifyData$lambda$1"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r6, r8)
            java.lang.Object r6 = r5.put(r7, r6)
            a75.a r6 = (a75.a) r6
            if (r6 != 0) goto L5c
        L52:
            java.lang.String r6 = r10.get_key()
            java.lang.Object r10 = r5.put(r6, r10)
            a75.a r10 = (a75.a) r10
        L5c:
            if (r0 == 0) goto L7d
            com.tencent.mm.sdk.platformtools.n3 r10 = r4.a()
            boolean r10 = r10.mo50285x8fc9be06(r3)
            if (r10 != 0) goto L77
            java.lang.String r10 = "send pending message 0"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10)
            com.tencent.mm.sdk.platformtools.n3 r10 = r4.a()
            long r0 = r4.f273916d
            r10.mo50307xb9e94560(r3, r0)
            goto Ld0
        L77:
            java.lang.String r10 = "ignore pending message 0"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10)
            goto Ld0
        L7d:
            java.lang.String r10 = "send message 0"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10)
            com.tencent.mm.sdk.platformtools.n3 r10 = r4.a()
            r10.mo50305x3d8a09a2(r3)
            goto Ld0
        L8a:
            com.tencent.mm.sdk.event.pending.PendingEventNotifier r10 = r9.f83473d
            boolean r0 = r10.f273922m
            if (r0 != 0) goto L96
            java.lang.String r10 = "not running"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10)
            goto Ld0
        L96:
            java.util.HashMap r0 = r10.f273920h
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r0.size()
            r1.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbf
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            a75.a r3 = (a75.a) r3
            r1.add(r3)
            goto La9
        Lbf:
            java.util.HashMap r0 = r10.f273920h
            r0.clear()
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto Ld0
            a75.b r10 = r10.f273918f
            r10.mo788x5797ad52(r1)
        Ld0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a75.d.handleMessage(android.os.Message):boolean");
    }
}
