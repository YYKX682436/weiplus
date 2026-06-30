package pr0;

/* loaded from: classes14.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f439448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(pr0.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f439447d = g0Var;
        this.f439448e = interfaceC29045xdcb5ca57;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pr0.t(this.f439447d, this.f439448e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((sr0.f) r0).f492970n.f537697f == true) goto L8;
     */
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
            pr0.g0 r7 = r6.f439447d
            sr0.i r0 = r7.f439367e
            r1 = 0
            if (r0 == 0) goto L16
            sr0.f r0 = (sr0.f) r0
            xr0.d r0 = r0.f492970n
            boolean r0 = r0.f537697f
            r2 = 1
            if (r0 != r2) goto L16
            goto L17
        L16:
            r2 = r1
        L17:
            jz5.f0 r0 = jz5.f0.f384359a
            r3 = 0
            kotlin.coroutines.Continuation r4 = r6.f439448e
            java.lang.String r5 = "MicroMsg.Camera.CameraKit"
            if (r2 != 0) goto L39
            java.lang.String r7 = "camera is not previewing, ignore getExpoData"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7)
            kotlin.Result$Companion r7 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            jz5.l r7 = new jz5.l
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r7.<init>(r3, r2)
            java.lang.Object r7 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r7)
            r4.mo48700xdecd0e93(r7)
            return r0
        L39:
            java.lang.String r2 = "getExpoData"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r2)
            sr0.i r7 = r7.f439367e
            if (r7 == 0) goto L48
            jz5.l r7 = r7.k()
            if (r7 != 0) goto L52
        L48:
            jz5.l r7 = new jz5.l
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r7.<init>(r3, r2)
        L52:
            java.lang.Object r7 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r7)
            r4.mo48700xdecd0e93(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.t.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
