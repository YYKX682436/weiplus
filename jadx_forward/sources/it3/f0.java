package it3;

/* loaded from: classes10.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f376092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16987xd1ab3de1 f376093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16987xd1ab3de1 activityC16987xd1ab3de1, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376093e = activityC16987xd1ab3de1;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new it3.f0(this.f376093e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((it3.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007f A[RETURN] */
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
            int r1 = r9.f376092d
            jz5.f0 r2 = jz5.f0.f384359a
            com.tencent.mm.plugin.recordvideo.activity.TestActivity r3 = r9.f376093e
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L2f
            if (r1 == r8) goto L2b
            if (r1 == r7) goto L27
            if (r1 == r6) goto L23
            if (r1 != r5) goto L1b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L7f
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L70
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L60
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L42
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlinx.coroutines.p0 r10 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            it3.d0 r1 = new it3.d0
            r1.<init>(r4)
            r9.f376092d = r8
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r1, r9)
            if (r10 != r0) goto L42
            return r0
        L42:
            int r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16987xd1ab3de1.f237172e
            com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout r10 = r3.U6()
            r9.f376092d = r7
            java.lang.String r1 = "MicroMsg.CameraKitRecordViewLayout"
            java.lang.String r7 = "startRecord"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r7)
            lu3.m r10 = r10.f237339e
            r1 = 0
            java.lang.Object r10 = r10.i(r1, r1, r9)
            if (r10 != r0) goto L5c
            goto L5d
        L5c:
            r10 = r2
        L5d:
            if (r10 != r0) goto L60
            return r0
        L60:
            kotlinx.coroutines.p0 r10 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            it3.e0 r1 = new it3.e0
            r1.<init>(r4)
            r9.f376092d = r6
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r1, r9)
            if (r10 != r0) goto L70
            return r0
        L70:
            int r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16987xd1ab3de1.f237172e
            com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout r10 = r3.U6()
            r9.f376092d = r5
            java.lang.Object r10 = r10.j(r9)
            if (r10 != r0) goto L7f
            return r0
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: it3.f0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
