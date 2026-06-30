package tx2;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f504078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15419x30b69859 f504079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15419x30b69859 c15419x30b69859, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504079e = c15419x30b69859;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tx2.e(this.f504079e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tx2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
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
            int r1 = r8.f504078d
            r2 = 3
            r3 = 1
            com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView r4 = r8.f504079e
            r5 = 2
            r6 = 300(0x12c, double:1.48E-321)
            if (r1 == 0) goto L27
            if (r1 == r3) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r2) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L83
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L5b
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L52
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            float[] r9 = new float[r5]
            r9 = {x0086: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            tx2.a r1 = new tx2.a
            r1.<init>(r4)
            r9.addListener(r1)
            tx2.b r1 = new tx2.b
            r1.<init>(r4)
            r9.addUpdateListener(r1)
            r9.setDuration(r6)
            r9.start()
            r8.f504078d = r3
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r8)
            if (r9 != r0) goto L52
            return r0
        L52:
            r8.f504078d = r5
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r8)
            if (r9 != r0) goto L5b
            return r0
        L5b:
            float[] r9 = new float[r5]
            r9 = {x008e: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            tx2.c r1 = new tx2.c
            r1.<init>(r4)
            r9.addListener(r1)
            tx2.d r1 = new tx2.d
            r1.<init>(r4)
            r9.addUpdateListener(r1)
            r9.setDuration(r6)
            r9.start()
            r8.f504078d = r2
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r8)
            if (r9 != r0) goto L83
            return r0
        L83:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.e.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
