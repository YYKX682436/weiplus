package pu;

/* loaded from: classes12.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.c f439852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(qi3.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439852e = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pu.j0(this.f439852e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f439851d
            r2 = 0
            r3 = 1
            qi3.c r4 = r5.f439852e
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L32
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r4.o()
            boolean r6 = r4 instanceof jg0.x
            if (r6 == 0) goto L26
            r6 = r4
            jg0.x r6 = (jg0.x) r6
            goto L27
        L26:
            r6 = r2
        L27:
            if (r6 == 0) goto L35
            r5.f439851d = r3
            java.lang.Object r6 = r6.M(r5)
            if (r6 != r0) goto L32
            return r0
        L32:
            qi3.f0 r6 = (qi3.f0) r6
            goto L36
        L35:
            r6 = r2
        L36:
            r4.f1()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.id()
            r0.append(r1)
            java.lang.String r1 = " initAsync retCode:"
            r0.append(r1)
            if (r6 == 0) goto L53
            int r1 = r6.f445233a
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
        L53:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VoiceMsgAsyncSendFSC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 0
            if (r6 == 0) goto L67
            int r6 = r6.f445233a
            if (r6 != 0) goto L67
            goto L68
        L67:
            r3 = r0
        L68:
            jz5.f0 r6 = jz5.f0.f384359a
            if (r3 != 0) goto L6f
            r4.f1()
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.j0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
