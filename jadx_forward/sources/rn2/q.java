package rn2;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f479354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479355f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479354e = abstractActivityC21394xb3d2c0cf;
        this.f479355f = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.q(this.f479354e, this.f479355f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
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
            int r1 = r9.f479353d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L52
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L35
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Class<zy2.b6> r10 = zy2.b6.class
            i95.m r10 = i95.n0.c(r10)
            zy2.b6 r10 = (zy2.b6) r10
            r9.f479353d = r3
            c61.l7 r10 = (c61.l7) r10
            com.tencent.mm.ui.MMActivity r1 = r9.f479354e
            r3 = 0
            java.lang.Object r10 = r10.sl(r1, r3, r9)
            if (r10 != r0) goto L35
            return r0
        L35:
            jz5.l r10 = (jz5.l) r10
            java.lang.Object r10 = r10.f384366d
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L70
            dk2.q4 r3 = dk2.q4.f315471a
            com.tencent.mm.ui.MMActivity r4 = r9.f479354e
            r5 = 0
            r7 = 2
            r8 = 0
            r9.f479353d = r2
            r6 = r9
            java.lang.Object r10 = dk2.q4.i(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L52
            return r0
        L52:
            java.lang.Number r10 = (java.lang.Number) r10
            long r0 = r10.longValue()
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L70
            android.view.View r10 = r9.f479355f
            r2 = 2131325244(0x7f09713c, float:1.8269218E38)
            android.view.View r10 = r10.findViewById(r2)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.setText(r0)
        L70:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.q.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
