package az0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97484d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f97487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f97488h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f97489i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f97490m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f97491n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(yz5.l lVar, az0.a0 a0Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, boolean z17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97486f = lVar;
        this.f97487g = a0Var;
        this.f97488h = c4128x879fba0a;
        this.f97489i = c4129xdee64553;
        this.f97490m = z17;
        this.f97491n = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        az0.v vVar = new az0.v(this.f97486f, this.f97487g, this.f97488h, this.f97489i, this.f97490m, this.f97491n, interfaceC29045xdcb5ca57);
        vVar.f97485e = obj;
        return vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0087  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97484d
            r3 = 0
            az0.a0 r4 = r0.f97487g
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L29
            if (r2 == r6) goto L1f
            if (r2 != r5) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            r2 = r18
            goto L7b
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.Object r2 = r0.f97485e
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            r6 = r18
            goto L4b
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            java.lang.Object r2 = r0.f97485e
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            r8 = 0
            r9 = 0
            az0.u r10 = new az0.u
            r10.<init>(r4, r3)
            r11 = 3
            r12 = 0
            r7 = r2
            kotlinx.coroutines.f1 r7 = p3325xe03a0797.p3326xc267989b.l.b(r7, r8, r9, r10, r11, r12)
            r0.f97485e = r2
            r0.f97484d = r6
            kotlinx.coroutines.g1 r7 = (p3325xe03a0797.p3326xc267989b.g1) r7
            java.lang.Object r6 = r7.k(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r7 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r2 = r6.booleanValue()
            if (r2 == 0) goto L82
            r8 = 0
            r9 = 0
            az0.t r2 = new az0.t
            az0.a0 r11 = r0.f97487g
            com.tencent.maas.model.time.MJTime r12 = r0.f97488h
            com.tencent.maas.model.time.MJTimeRange r13 = r0.f97489i
            boolean r14 = r0.f97490m
            int r15 = r0.f97491n
            r16 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.f1 r2 = p3325xe03a0797.p3326xc267989b.l.b(r7, r8, r9, r10, r11, r12)
            r0.f97485e = r3
            r0.f97484d = r5
            kotlinx.coroutines.g1 r2 = (p3325xe03a0797.p3326xc267989b.g1) r2
            java.lang.Object r2 = r2.k(r0)
            if (r2 != r1) goto L7b
            return r1
        L7b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            goto L83
        L82:
            r1 = 0
        L83:
            yz5.l r2 = r0.f97486f
            if (r2 == 0) goto L8e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.mo146xb9724478(r1)
        L8e:
            java.lang.String r1 = r4.f96844c
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.v.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
