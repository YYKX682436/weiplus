package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes7.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f146929d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f146930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f1 f146931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f1 f1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f146931f = f1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.e1 e1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.e1(this.f146931f, interfaceC29045xdcb5ca57);
        e1Var.f146930e = obj;
        return e1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0043 -> B:12:0x0046). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f146929d
            r2 = 2
            r3 = 1
            java.lang.String r4 = "MicroMsg.ConditionWatchdog"
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L89
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            java.lang.Object r1 = r9.f146930e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r9
            goto L46
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f146930e
            kotlinx.coroutines.y0 r10 = (p3325xe03a0797.p3326xc267989b.y0) r10
            r1 = r10
            r10 = r9
        L2d:
            boolean r5 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r5 == 0) goto L89
            com.tencent.mm.feature.chatrecordstts.f1 r5 = r10.f146931f
            boolean r6 = r5.f146954e
            if (r6 == 0) goto L89
            long r5 = r5.f146950a
            r10.f146930e = r1
            r10.f146929d = r3
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.k1.b(r5, r10)
            if (r5 != r0) goto L46
            return r0
        L46:
            boolean r5 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r5 == 0) goto L83
            com.tencent.mm.feature.chatrecordstts.f1 r5 = r10.f146931f
            boolean r6 = r5.f146954e
            if (r6 != 0) goto L53
            goto L83
        L53:
            r6 = 0
            yz5.a r7 = r5.f146951b     // Catch: java.lang.Exception -> L61
            java.lang.Object r7 = r7.mo152xb9724478()     // Catch: java.lang.Exception -> L61
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L61
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L61
            goto L6c
        L61:
            r7 = move-exception
            java.lang.String r8 = "conditionCheck error"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r8, r7)
            r7 = r6
        L6c:
            if (r7 != 0) goto L2d
            java.lang.String r1 = "condition failed, triggering action"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r1)
            r5.f146954e = r6
            yz5.l r1 = r5.f146952c
            r3 = 0
            r10.f146930e = r3
            r10.f146929d = r2
            java.lang.Object r10 = r1.mo146xb9724478(r10)
            if (r10 != r0) goto L89
            return r0
        L83:
            java.lang.String r10 = "watchdog stopped during delay"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r10)
        L89:
            java.lang.String r10 = "watchdog loop ended"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r10)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.e1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
