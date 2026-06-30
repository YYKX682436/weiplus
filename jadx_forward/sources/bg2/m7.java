package bg2;

/* loaded from: classes2.dex */
public final class m7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101846d;

    /* renamed from: e, reason: collision with root package name */
    public int f101847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f101848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f101849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(bg2.l8 l8Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101848f = l8Var;
        this.f101849g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.m7(this.f101848f, this.f101849g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.m7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f101847e
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            bg2.l8 r7 = r8.f101848f
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L82
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L4c
        L24:
            java.lang.Object r1 = r8.f101846d
            bg2.l8 r1 = (bg2.l8) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L3b
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r8.f101846d = r7
            r8.f101847e = r6
            java.lang.Object r9 = bg2.l8.a7(r7, r8)
            if (r9 != r0) goto L3a
            return r0
        L3a:
            r1 = r7
        L3b:
            r45.vw0 r9 = (r45.vw0) r9
            r1.f101810h = r9
            r8.f101846d = r3
            r8.f101847e = r5
            long r5 = r8.f101849g
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.k1.b(r5, r8)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            java.lang.Class<bg2.q6> r9 = bg2.q6.class
            tc2.c r9 = r7.N6(r9)
            bg2.q6 r9 = (bg2.q6) r9
            if (r9 == 0) goto L59
            boolean r9 = r9.f101951m
            goto L5a
        L59:
            r9 = 0
        L5a:
            java.lang.String r1 = r7.f101807e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[checkAndShowSatisfaction] isNotInterestedToastShown:"
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            if (r9 == 0) goto L70
            return r2
        L70:
            kotlinx.coroutines.p0 r9 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r9 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            bg2.l7 r1 = new bg2.l7
            r1.<init>(r7, r3)
            r8.f101847e = r4
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r1, r8)
            if (r9 != r0) goto L82
            return r0
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.m7.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
