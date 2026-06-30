package pk4;

/* loaded from: classes4.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 f438032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f438032e = c18696xc5bcd349;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pk4.j1(this.f438032e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk4.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0022 -> B:5:0x0025). Please report as a decompilation issue!!! */
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
            int r1 = r6.f438031d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = r6
            goto L25
        Le:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = r6
        L1a:
            r7.f438031d = r2
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r7)
            if (r1 != r0) goto L25
            return r0
        L25:
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView r1 = r7.f438032e
            kk4.c r3 = r1.f256130i
            if (r3 == 0) goto L43
            kk4.f0 r3 = (kk4.f0) r3
            long r3 = r3.mo100915xddd35a52()
            pk4.u0 r5 = r1.getProgressListener()
            if (r5 == 0) goto L3a
            r5.a(r3)
        L3a:
            pk4.i1 r5 = new pk4.i1
            r5.<init>(r3)
            r1.n(r5)
            goto L1a
        L43:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pk4.j1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
