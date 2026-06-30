package ah3;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86437e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ah3.l(this.f86437e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0 A[RETURN] */
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
            int r1 = r7.f86436d
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "MicroMsg.BatchGetContactHelper"
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto La1
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L86
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L3d
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            ah3.m.f86439b = r4
            java.lang.String r8 = "tryRequest begin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r8)
            ah3.m r8 = ah3.m.f86438a
            r7.f86436d = r4
            r1 = 0
            java.lang.Object r8 = r8.d(r1, r1, r7)
            if (r8 != r0) goto L3d
            return r0
        L3d:
            java.util.List r8 = (java.util.List) r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "tryRequest getAllInitContactUsernames:"
            r1.<init>(r4)
            int r4 = r8.size()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            ah3.m r1 = ah3.m.f86438a
            jz5.l r8 = r1.c(r8)
            java.lang.Object r8 = r8.f384366d
            java.util.List r8 = (java.util.List) r8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "tryRequest filterNewContact:"
            r4.<init>(r6)
            int r6 = r8.size()
            r4.append(r6)
            java.lang.String r6 = " contactUserNames:"
            r4.append(r6)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
            r7.f86436d = r3
            java.lang.Object r8 = ah3.m.a(r1, r8, r7)
            if (r8 != r0) goto L86
            return r0
        L86:
            java.lang.String r8 = "tryRequest processBatch end"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r8)
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r8 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            ah3.k r1 = new ah3.k
            yz5.l r3 = r7.f86437e
            r4 = 0
            r1.<init>(r3, r4)
            r7.f86436d = r2
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r1, r7)
            if (r8 != r0) goto La1
            return r0
        La1:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.l.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
