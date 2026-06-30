package z;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f550222d;

    /* renamed from: e, reason: collision with root package name */
    public int f550223e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f550224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u26.w f550225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.e f550226h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f550227i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f550228m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u26.w wVar, z.e eVar, n0.e5 e5Var, n0.e5 e5Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f550225g = wVar;
        this.f550226h = eVar;
        this.f550227i = e5Var;
        this.f550228m = e5Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z.i iVar = new z.i(this.f550225g, this.f550226h, this.f550227i, this.f550228m, interfaceC29045xdcb5ca57);
        iVar.f550224f = obj;
        return iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003f -> B:5:0x0044). Please report as a decompilation issue!!! */
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
            int r2 = r0.f550223e
            r3 = 1
            if (r2 == 0) goto L22
            if (r2 != r3) goto L1a
            java.lang.Object r2 = r0.f550222d
            u26.y r2 = (u26.y) r2
            java.lang.Object r4 = r0.f550224f
            kotlinx.coroutines.y0 r4 = (p3325xe03a0797.p3326xc267989b.y0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            r6 = r18
            r5 = r0
            goto L44
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            java.lang.Object r2 = r0.f550224f
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            u26.w r4 = r0.f550225g
            u26.y r4 = r4.mo167478x467c086e()
            r5 = r0
        L30:
            r5.f550224f = r2
            r5.f550222d = r4
            r5.f550223e = r3
            u26.a r4 = (u26.a) r4
            java.lang.Object r6 = r4.a(r5)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            r16 = r4
            r4 = r2
            r2 = r16
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L7f
            u26.a r2 = (u26.a) r2
            java.lang.Object r6 = r2.b()
            u26.w r7 = r5.f550225g
            java.lang.Object r7 = r7.h()
            java.lang.Object r7 = u26.c0.b(r7)
            if (r7 != 0) goto L60
            r9 = r6
            goto L61
        L60:
            r9 = r7
        L61:
            r6 = 0
            r14 = 0
            z.h r15 = new z.h
            z.e r10 = r5.f550226h
            n0.e5 r11 = r5.f550227i
            n0.e5 r12 = r5.f550228m
            r13 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r7 = r4
            r8 = r6
            r9 = r14
            r10 = r15
            p3325xe03a0797.p3326xc267989b.l.d(r7, r8, r9, r10, r11, r12)
            r16 = r4
            r4 = r2
            r2 = r16
            goto L30
        L7f:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.i.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
