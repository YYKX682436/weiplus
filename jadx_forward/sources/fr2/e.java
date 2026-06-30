package fr2;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f347247d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f347248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fr2.p f347249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fr2.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f347249f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fr2.e eVar = new fr2.e(this.f347249f, interfaceC29045xdcb5ca57);
        eVar.f347248e = obj;
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fr2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0091 -> B:6:0x0094). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f347247d
            java.lang.String r3 = "FinderLivePlayTogetherBottomBarUIC"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 == r5) goto L25
            if (r2 != r4) goto L1d
            java.lang.Object r2 = r0.f347248e
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            r6 = r0
            r15 = r5
            r5 = r4
            r4 = r15
            goto L94
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f347248e
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            r6 = r0
            r4 = r5
            goto L86
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            java.lang.Object r2 = r0.f347248e
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            r6 = r0
        L37:
            boolean r7 = p3325xe03a0797.p3326xc267989b.z0.h(r2)
            fr2.p r8 = r6.f347249f
            if (r7 == 0) goto Lad
            boolean r7 = r8.f347277o
            if (r7 == 0) goto Lad
            long r9 = r8.f347278p
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 <= 0) goto Lad
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r4 = r8.f347279q
            long r13 = r13 - r4
            long r9 = r9 - r13
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 <= 0) goto L59
            r4 = r9
            goto L5a
        L59:
            r4 = r11
        L5a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "checkPreload: delay preload, delay="
            r13.<init>(r14)
            r13.append(r4)
            java.lang.String r14 = ", preloadIntervalMs="
            r13.append(r14)
            long r7 = r8.f347278p
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r7)
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L85
            r6.f347248e = r2
            r4 = 1
            r6.f347247d = r4
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.k1.b(r9, r6)
            if (r5 != r1) goto L86
            return r1
        L85:
            r4 = 1
        L86:
            r6.f347248e = r2
            r5 = 2
            r6.f347247d = r5
            fr2.p r7 = r6.f347249f
            java.lang.Object r7 = fr2.p.Q6(r7, r4, r6)
            if (r7 != r1) goto L94
            return r1
        L94:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "heckPreload: after preload, preloadIntervalMs="
            r7.<init>(r8)
            fr2.p r8 = r6.f347249f
            long r8 = r8.f347278p
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r7)
            r15 = r5
            r5 = r4
            r4 = r15
            goto L37
        Lad:
            r1 = 0
            r8.f347281s = r1
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fr2.e.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
