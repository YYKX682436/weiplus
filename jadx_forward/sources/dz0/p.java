package dz0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f326497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.v f326498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f326499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326500h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z17, dz0.v vVar, yz5.l lVar, com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326497e = z17;
        this.f326498f = vVar;
        this.f326499g = lVar;
        this.f326500h = c11015x5b190a3b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.p(this.f326497e, this.f326498f, this.f326499g, this.f326500h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
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
            int r1 = r5.f326496d
            r2 = 1
            dz0.v r3 = r5.f326498f
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L30
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            boolean r6 = r5.f326497e
            if (r6 == 0) goto L21
            r3.e()
        L21:
            kotlinx.coroutines.z r6 = r3.f326565d
            if (r6 == 0) goto L33
            r5.f326496d = r2
            kotlinx.coroutines.a0 r6 = (p3325xe03a0797.p3326xc267989b.a0) r6
            java.lang.Object r6 = r6.k(r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            com.tencent.maas.instamovie.base.MJError r6 = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) r6
            goto L34
        L33:
            r6 = 0
        L34:
            jz5.f0 r0 = jz5.f0.f384359a
            yz5.l r1 = r5.f326499g
            java.lang.String r2 = "MicroMsg.MJSegmentClipBehaviorHolder"
            if (r6 == 0) goto L48
            r3.getClass()
            java.lang.String r4 = "endSegmentClipping: failed, begin err"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
            dz0.v.a(r3, r1, r6)
            return r0
        L48:
            r3.getClass()
            java.lang.String r6 = "endSegmentClipping: start"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r6 = r5.f326500h
            az0.n7 r6 = r6.f151316d
            if (r6 == 0) goto L65
            dz0.o r2 = new dz0.o
            r2.<init>(r3, r1)
            az0.u5 r1 = new az0.u5
            r1.<init>(r2)
            com.tencent.maas.instamovie.MJMovieSession r6 = r6.f97275a
            r6.m33385xdb1fdebd(r1)
        L65:
            r6 = 0
            r3.f326566e = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.p.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
