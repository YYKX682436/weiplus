package bg2;

/* loaded from: classes2.dex */
public final class b6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101477d;

    /* renamed from: e, reason: collision with root package name */
    public int f101478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f101479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(bg2.q6 q6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101479f = q6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.b6(this.f101479f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.b6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if ((r6 != null ? r6.i() : false) == true) goto L23;
     */
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
            int r1 = r5.f101478e
            r2 = 2
            bg2.q6 r3 = r5.f101479f
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L5f
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f101477d
            bg2.q6 r1 = (bg2.q6) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L31
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r5.f101477d = r3
            r5.f101478e = r4
            java.lang.Object r6 = bg2.q6.a7(r3, r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            r1 = r3
        L31:
            r45.vw0 r6 = (r45.vw0) r6
            r1.f101947f = r6
            dg2.m r6 = r3.f101948g
            r1 = 0
            if (r6 == 0) goto L47
            com.tencent.mm.ui.widget.dialog.k0 r6 = r6.f313846h
            if (r6 == 0) goto L43
            boolean r6 = r6.i()
            goto L44
        L43:
            r6 = r1
        L44:
            if (r6 != r4) goto L47
            goto L48
        L47:
            r4 = r1
        L48:
            if (r4 == 0) goto L5f
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            bg2.a6 r1 = new bg2.a6
            r4 = 0
            r1.<init>(r3, r4)
            r5.f101477d = r4
            r5.f101478e = r2
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.l.g(r6, r1, r5)
            if (r6 != r0) goto L5f
            return r0
        L5f:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.b6.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
