package j00;

/* loaded from: classes9.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f378316d;

    /* renamed from: e, reason: collision with root package name */
    public int f378317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f378318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f378319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f378320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f378321i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f378322m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3325xe03a0797.p3326xc267989b.z zVar, p3325xe03a0797.p3326xc267989b.z zVar2, c00.j3 j3Var, boolean z17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f378318f = zVar;
        this.f378319g = zVar2;
        this.f378320h = j3Var;
        this.f378321i = z17;
        this.f378322m = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j00.i(this.f378318f, this.f378319g, this.f378320h, this.f378321i, this.f378322m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
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
            int r1 = r9.f378317e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r9.f378316d
            bw5.x7 r0 = (bw5.x7) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r4 = r0
            goto L44
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L31
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r9.f378317e = r3
            kotlinx.coroutines.z r10 = r9.f378318f
            kotlinx.coroutines.a0 r10 = (p3325xe03a0797.p3326xc267989b.a0) r10
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L31
            return r0
        L31:
            bw5.x7 r10 = (bw5.x7) r10
            r9.f378316d = r10
            r9.f378317e = r2
            kotlinx.coroutines.z r1 = r9.f378319g
            kotlinx.coroutines.a0 r1 = (p3325xe03a0797.p3326xc267989b.a0) r1
            java.lang.Object r1 = r1.k(r9)
            if (r1 != r0) goto L42
            return r0
        L42:
            r4 = r10
            r10 = r1
        L44:
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L58
            j00.n r0 = j00.n.f378370a
            c00.j3 r1 = r9.f378320h
            boolean r2 = r9.f378321i
            int r3 = r9.f378322m
            r6 = 1
            r7 = 0
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            goto L5f
        L58:
            java.lang.String r10 = "MicroMsg.EcsGiftEntrancePreloadLogicNew"
            java.lang.String r0 = "checkPreloadWhenExposure: jumpInfo is null, skip preload"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)
        L5f:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.i.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
