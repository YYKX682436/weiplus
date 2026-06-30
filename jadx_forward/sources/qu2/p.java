package qu2;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448340d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu2.r f448342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qu2.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f448342f = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qu2.p pVar = new qu2.p(this.f448342f, interfaceC29045xdcb5ca57);
        pVar.f448341e = obj;
        return pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qu2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[LOOP:0: B:6:0x0022->B:19:?, LOOP_END, SYNTHETIC] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f448340d
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r7.f448341e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L21
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.Object r8 = r7.f448341e
            kotlinx.coroutines.y0 r8 = (p3325xe03a0797.p3326xc267989b.y0) r8
            r1 = r8
        L21:
            r8 = r7
        L22:
            boolean r3 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r3 == 0) goto L83
            qu2.r r3 = r8.f448342f
            r3.getClass()
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L4c
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            android.content.Intent r4 = r4.registerReceiver(r6, r5)     // Catch: java.lang.Throwable -> L4c
            if (r4 != 0) goto L40
            r3.f448348d = r2     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L40:
            java.lang.String r5 = "temperature"
            r6 = 0
            int r4 = r4.getIntExtra(r5, r6)     // Catch: java.lang.Throwable -> L4c
            float r4 = (float) r4
            r5 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 / r5
            goto L4d
        L4c:
            r4 = 0
        L4d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "collect temperature hasBadCase="
            r5.<init>(r6)
            boolean r6 = r3.f448348d
            r5.append(r6)
            java.lang.String r6 = " temperature="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "TemperatureCollector"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r5)
            java.util.List r3 = r3.f448347c
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r5)
            r8.f448341e = r1
            r8.f448340d = r2
            r3 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r8)
            if (r3 != r0) goto L22
            return r0
        L83:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qu2.p.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
