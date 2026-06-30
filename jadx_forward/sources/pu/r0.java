package pu;

/* loaded from: classes12.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.c f439905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pu.t0 f439906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(qi3.c cVar, pu.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439905e = cVar;
        this.f439906f = t0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pu.r0(this.f439905e, this.f439906f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
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
            int r1 = r6.f439904d
            r2 = 1
            r3 = 0
            qi3.c r4 = r6.f439905e
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L32
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r4.o()
            boolean r7 = r4 instanceof jg0.x
            if (r7 == 0) goto L26
            r7 = r4
            jg0.x r7 = (jg0.x) r7
            goto L27
        L26:
            r7 = r3
        L27:
            if (r7 == 0) goto L35
            r6.f439904d = r2
            java.lang.Object r7 = r7.N(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            qi3.f0 r7 = (qi3.f0) r7
            goto L36
        L35:
            r7 = r3
        L36:
            r4.f1()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.id()
            r0.append(r1)
            java.lang.String r1 = " startAsync retCode:"
            r0.append(r1)
            if (r7 == 0) goto L54
            int r1 = r7.f445233a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            goto L55
        L54:
            r5 = r3
        L55:
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VoiceMsgAsyncSendFSC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r7 == 0) goto L69
            int r7 = r7.f445233a
            if (r7 != 0) goto L69
            r7 = r2
            goto L6a
        L69:
            r7 = 0
        L6a:
            jz5.f0 r0 = jz5.f0.f384359a
            if (r7 != 0) goto L72
            r4.f1()
            return r0
        L72:
            pu.t0 r7 = r6.f439906f
            jz5.g r7 = r7.f439913h
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.mo141623x754a37bb()
            com.tencent.mm.sdk.coroutines.SequenceLifecycleScope r7 = (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) r7
            pu.q0 r1 = new pu.q0
            r1.<init>(r4, r3)
            v65.i.b(r7, r3, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.r0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
