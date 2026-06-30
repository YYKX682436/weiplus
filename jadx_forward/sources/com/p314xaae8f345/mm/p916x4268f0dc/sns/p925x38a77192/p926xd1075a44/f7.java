package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f151492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 f151493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f151492e = m7Var;
        this.f151493f = m5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.f7(this.f151492e, this.f151493f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.f7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r9 == r0) goto L29;
     */
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
            int r1 = r8.f151491d
            jz5.f0 r2 = jz5.f0.f384359a
            com.tencent.mm.mj_template.sns.compose.widget.m5 r3 = r8.f151493f
            r4 = 1
            com.tencent.mm.mj_template.sns.compose.widget.m7 r5 = r8.f151492e
            if (r1 == 0) goto L1b
            if (r1 != r4) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L72
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            az0.d r9 = r5.f151627l
            if (r9 == 0) goto L29
            java.lang.String r1 = r3.f151610a
            dz0.k0 r9 = (dz0.k0) r9
            r9.d(r1)
        L29:
            az0.d r9 = r5.f151627l
            if (r9 == 0) goto L72
            java.lang.String r1 = r3.f151610a
            r8.f151491d = r4
            dz0.k0 r9 = (dz0.k0) r9
            kotlinx.coroutines.r2 r6 = r9.f326436b
            if (r6 == 0) goto L6e
            r7 = r6
            kotlinx.coroutines.a r7 = (p3325xe03a0797.p3326xc267989b.a) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L49
            java.lang.String r7 = r9.f326439e
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r7)
            if (r1 == 0) goto L49
            goto L4a
        L49:
            r4 = 0
        L4a:
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L6e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "awaitActiveSelectTemplateJob "
            r1.<init>(r4)
            java.lang.String r9 = r9.f326439e
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "MaasMultiTemplate.MaasSdkUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            kotlinx.coroutines.c3 r6 = (p3325xe03a0797.p3326xc267989b.c3) r6
            java.lang.Object r9 = r6.C(r8)
            if (r9 != r0) goto L6e
            goto L6f
        L6e:
            r9 = r2
        L6f:
            if (r9 != r0) goto L72
            return r0
        L72:
            com.tencent.mm.mj_template.sns.compose.widget.b7 r9 = r5.f151634s
            if (r9 == 0) goto L7b
            java.lang.String r0 = r3.f151610a
            r9.d(r0)
        L7b:
            yz5.l r9 = r5.f151625j
            java.lang.String r0 = r5.a()
            r9.mo146xb9724478(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.f7.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
