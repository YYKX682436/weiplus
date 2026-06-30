package uw0;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f513162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f513163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb f513164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(uw0.t0 t0Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb c4187xe514cceb, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513163e = t0Var;
        this.f513164f = c4187xe514cceb;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new uw0.z(this.f513163e, this.f513164f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r4.booleanValue() == true) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
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
            int r1 = r9.f513162d
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            uw0.t0 r6 = r9.f513163e
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto La3
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L62
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L4d
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            xw0.r r10 = r6.u7()
            sw0.b r1 = r6.f430651q
            if (r1 == 0) goto L35
            java.lang.String r7 = r1.f494948b
            goto L36
        L35:
            r7 = r4
        L36:
            if (r1 == 0) goto L3b
            java.lang.String r1 = r1.f494949c
            goto L3c
        L3b:
            r1 = r4
        L3c:
            xw0.r r8 = r6.u7()
            com.tencent.maas.material.MJMaterialInfo r8 = r8.f539176g
            java.lang.String r8 = r8.f129757b
            r9.f513162d = r5
            java.lang.Object r10 = r10.j(r7, r1, r8, r9)
            if (r10 != r0) goto L4d
            return r0
        L4d:
            xw0.r r10 = r6.u7()
            sw0.b r1 = r6.f430651q
            if (r1 == 0) goto L58
            java.lang.String r1 = r1.f494950d
            goto L59
        L58:
            r1 = r4
        L59:
            r9.f513162d = r3
            java.lang.Object r10 = r10.n(r1, r9)
            if (r10 != r0) goto L62
            return r0
        L62:
            xw0.r r10 = r6.u7()
            sw0.b r1 = r6.f430651q
            if (r1 == 0) goto L7a
            java.lang.String r1 = r1.f494951e
            if (r1 == 0) goto L7a
            java.lang.String r3 = "None"
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r3)
            r3 = r3 ^ r5
            if (r3 == 0) goto L78
            r4 = r1
        L78:
            if (r4 != 0) goto L9a
        L7a:
            r1 = 0
            com.tencent.maas.moviecomposing.segments.MovieTitleSegment r3 = r9.f513164f
            if (r3 == 0) goto L92
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            com.tencent.maas.moviecomposing.Timeline r6 = r3.D()
            if (r6 == 0) goto L8b
            java.lang.Boolean r4 = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.a0(r3, r6)
        L8b:
            boolean r3 = r4.booleanValue()
            if (r3 != r5) goto L92
            goto L93
        L92:
            r5 = r1
        L93:
            if (r5 == 0) goto L98
            java.lang.String r4 = "BUILTIN_ANIM_PRESET_ID"
            goto L9a
        L98:
            java.lang.String r4 = "EMPTY_ANIM_PRESET_ID"
        L9a:
            r9.f513162d = r2
            java.lang.Object r10 = r10.k(r4, r9)
            if (r10 != r0) goto La3
            return r0
        La3:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uw0.z.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
