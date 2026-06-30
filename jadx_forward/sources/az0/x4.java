package az0;

/* loaded from: classes5.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97575d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f97577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 f97578g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(p3325xe03a0797.p3326xc267989b.r2 r2Var, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97577f = r2Var;
        this.f97578g = c4073xbc40c54;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        az0.x4 x4Var = new az0.x4(this.f97577f, this.f97578g, interfaceC29045xdcb5ca57);
        x4Var.f97576e = obj;
        return x4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.x4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f97575d
            java.lang.String r2 = "releaseMJMoviePlayer["
            java.lang.String r3 = "MicroMsg.MaasManager"
            r4 = 2
            com.tencent.maas.instamovie.MJMoviePlayer r5 = r13.f97578g
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L23
            if (r1 != r4) goto L1b
            java.lang.Object r0 = r13.f97576e
            yz5.a r0 = (yz5.a) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L8b
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            java.lang.Object r1 = r13.f97576e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L64
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.lang.Object r14 = r13.f97576e
            r1 = r14
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            r14 = 0
            kotlinx.coroutines.r2 r7 = r13.f97577f
            if (r7 == 0) goto L3f
            boolean r8 = r7.a()
            if (r8 != r6) goto L3f
            r14 = r6
        L3f:
            if (r14 == 0) goto L64
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r2)
            int r8 = r5.hashCode()
            r14.append(r8)
            java.lang.String r8 = "]: await preAction"
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r14)
            r13.f97576e = r1
            r13.f97575d = r6
            java.lang.Object r14 = r7.C(r13)
            if (r14 != r0) goto L64
            return r0
        L64:
            r6 = r1
            az0.v4 r14 = new az0.v4
            r1 = 0
            r14.<init>(r5, r1)
            az0.t4 r12 = new az0.t4
            r12.<init>(r5)
            r7 = 0
            r8 = 0
            az0.w4 r9 = new az0.w4
            r9.<init>(r14, r1)
            r10 = 3
            r11 = 0
            kotlinx.coroutines.f1 r14 = p3325xe03a0797.p3326xc267989b.l.b(r6, r7, r8, r9, r10, r11)
            r13.f97576e = r12
            r13.f97575d = r4
            kotlinx.coroutines.g1 r14 = (p3325xe03a0797.p3326xc267989b.g1) r14
            java.lang.Object r14 = r14.k(r13)
            if (r14 != r0) goto L8a
            return r0
        L8a:
            r0 = r12
        L8b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L96
            r0.mo152xb9724478()
        L96:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r2)
            int r0 = r5.hashCode()
            r14.append(r0)
            java.lang.String r0 = "]: done"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r14)
            az0.i5 r14 = az0.i5.f97090a
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.x4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
