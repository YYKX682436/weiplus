package cs0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f303577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 f303578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f303579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f303580g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862, float f17, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f303578e = c10899x89fee862;
        this.f303579f = f17;
        this.f303580g = f18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cs0.f(this.f303578e, this.f303579f, this.f303580g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cs0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
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
            int r1 = r9.f303577d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L4f
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L30
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView r10 = r9.f303578e
            cs0.a r10 = r10.f150428u
            if (r10 == 0) goto L33
            r9.f303577d = r3
            com.tencent.mm.media.camera.view.CameraKitView r10 = (com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) r10
            java.lang.Object r10 = r10.j(r9)
            if (r10 != r0) goto L30
            return r0
        L30:
            jz5.l r10 = (jz5.l) r10
            goto L34
        L33:
            r10 = 0
        L34:
            r4 = r10
            kotlinx.coroutines.p0 r10 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r10 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            cs0.e r1 = new cs0.e
            com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView r5 = r9.f303578e
            float r6 = r9.f303579f
            float r7 = r9.f303580g
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f303577d = r2
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r1, r9)
            if (r10 != r0) goto L4f
            return r0
        L4f:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cs0.f.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
