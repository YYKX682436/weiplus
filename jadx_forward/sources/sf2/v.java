package sf2;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f488846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f488847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z17, sf2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488847e = z17;
        this.f488848f = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.v(this.f488847e, this.f488848f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0043 A[RETURN] */
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
            int r1 = r5.f488846d
            jz5.f0 r2 = jz5.f0.f384359a
            sf2.x r3 = r5.f488848f
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 != r4) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)     // Catch: java.lang.Exception -> L28
            goto L44
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            boolean r6 = r5.f488847e     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L44
            gn2.a r6 = r3.f488880p     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L2a
            r6.c(r4)     // Catch: java.lang.Exception -> L28
            goto L2a
        L28:
            r6 = move-exception
            goto L55
        L2a:
            r5.f488846d = r4     // Catch: java.lang.Exception -> L28
            gn2.a r6 = r3.f488880p     // Catch: java.lang.Exception -> L28
            boolean r6 = r6 instanceof in2.s     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L39
            java.lang.Object r6 = r3.k7(r5)     // Catch: java.lang.Exception -> L28
            if (r6 != r0) goto L40
            goto L41
        L39:
            java.lang.Object r6 = r3.i7(r5)     // Catch: java.lang.Exception -> L28
            if (r6 != r0) goto L40
            goto L41
        L40:
            r6 = r2
        L41:
            if (r6 != r0) goto L44
            return r0
        L44:
            gn2.a r6 = r3.f488880p     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L4b
            r6.e()     // Catch: java.lang.Exception -> L28
        L4b:
            gn2.a r6 = r3.f488880p     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L71
            r0 = 0
            r1 = 0
            gn2.a.q(r6, r0, r4, r1)     // Catch: java.lang.Exception -> L28
            goto L71
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showSingSongListPanel error: "
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r1 = "FinderLiveAnchorMusicSingSongController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r6)
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.v.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
