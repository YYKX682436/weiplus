package xt2;

/* loaded from: classes3.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f538272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(long j17, xt2.e3 e3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538272d = j17;
        this.f538273e = e3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.f2(this.f538272d, this.f538273e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.f2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            xt2.e3 r7 = r6.f538273e
            android.view.ViewGroup r0 = r7.f538242n
            r1 = 0
            long r2 = r6.f538272d
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.getTag()
            boolean r4 = r0 instanceof java.lang.Long
            if (r4 != 0) goto L17
            goto L23
        L17:
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = r1
        L24:
            jz5.f0 r4 = jz5.f0.f384359a
            if (r0 == 0) goto L41
            java.lang.String r7 = r7.f538239h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "bubbleAttachToParent id:"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " view have attach!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r0)
            return r4
        L41:
            android.view.ViewGroup r0 = r7.f538235d
            r5 = 2131320251(0x7f095dbb, float:1.8259091E38)
            android.view.View r0 = r0.findViewById(r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.f538242n = r0
            android.view.ViewGroup r0 = r7.f538242n
            if (r0 == 0) goto L5c
            int r0 = r0.indexOfChild(r7)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r0)
            goto L5d
        L5c:
            r5 = 0
        L5d:
            if (r5 != 0) goto L60
            goto L74
        L60:
            int r0 = r5.intValue()
            r5 = -1
            if (r0 != r5) goto L74
            zl2.r4 r0 = zl2.r4.f555483a
            r0.Q2(r7)
            android.view.ViewGroup r0 = r7.f538242n
            if (r0 == 0) goto L7b
            r0.addView(r7)
            goto L7b
        L74:
            java.lang.String r0 = r7.f538239h
            java.lang.String r5 = "bubbleAttachToParent, have contain child!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5)
        L7b:
            android.view.ViewGroup r0 = r7.f538242n
            if (r0 != 0) goto L80
            goto L83
        L80:
            r0.setVisibility(r1)
        L83:
            android.view.ViewGroup r0 = r7.f538242n
            if (r0 != 0) goto L88
            goto L90
        L88:
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            r0.setTag(r1)
        L90:
            r45.y23 r0 = r7.m175931x80e66803()
            if (r0 == 0) goto L9b
            r1 = 31
            r7.g(r1, r0)
        L9b:
            dk2.f r7 = r7.M
            r7.a(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.f2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
