package pe3;

/* loaded from: classes7.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f435218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 f435219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ se3.f f435220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(pe3.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b377, se3.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435218e = g0Var;
        this.f435219f = c16462x4c72b377;
        this.f435220g = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pe3.x(this.f435218e, this.f435219f, this.f435220g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005e A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f435217d
            jz5.f0 r2 = jz5.f0.f384359a
            com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView r3 = r8.f435219f
            r4 = 3
            r5 = 2
            r6 = 1
            pe3.g0 r7 = r8.f435218e
            if (r1 == 0) goto L29
            if (r1 == r6) goto L25
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L5e
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L4f
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L44
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            se3.e r9 = r7.f435191d
            r8.f435217d = r6
            kotlinx.coroutines.flow.i2 r9 = r9.f488447d
            se3.c r1 = new se3.c
            r1.<init>(r3)
            kotlinx.coroutines.flow.q2 r9 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) r9
            java.lang.Object r9 = r9.mo771x2f8fd3(r1, r8)
            if (r9 != r0) goto L40
            goto L41
        L40:
            r9 = r2
        L41:
            if (r9 != r0) goto L44
            return r0
        L44:
            se3.e r9 = r7.f435191d
            r8.f435217d = r5
            java.lang.Object r9 = r9.N6(r3, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            se3.e r9 = r7.f435191d
            se3.f r1 = r8.f435220g
            java.lang.String r1 = r1.f488450b
            r8.f435217d = r4
            java.lang.Object r9 = r9.P6(r1, r8)
            if (r9 != r0) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pe3.x.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
