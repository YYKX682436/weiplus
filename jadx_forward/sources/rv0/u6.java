package rv0;

/* loaded from: classes5.dex */
public final class u6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f481814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(rv0.z6 z6Var, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481813e = z6Var;
        this.f481814f = c3971x241f78;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.u6(this.f481813e, this.f481814f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.u6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f481812d
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            rv0.z6 r6 = r7.f481813e
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L63
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L56
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L49
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L3c
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kotlinx.coroutines.r2 r8 = r6.A
            if (r8 == 0) goto L3c
            r7.f481812d = r5
            java.lang.Object r8 = r8.C(r7)
            if (r8 != r0) goto L3c
            return r0
        L3c:
            gx0.bf r8 = r6.t7()
            r7.f481812d = r4
            java.lang.Object r8 = r8.s7(r7)
            if (r8 != r0) goto L49
            return r0
        L49:
            gx0.bf r8 = r6.t7()
            r7.f481812d = r3
            java.lang.Object r8 = r8.e7(r7)
            if (r8 != r0) goto L56
            return r0
        L56:
            rv0.c7 r8 = rv0.c7.f481494e
            r7.f481812d = r2
            com.tencent.maas.base.MJID r1 = r7.f481814f
            java.lang.Object r8 = rv0.z6.l7(r6, r1, r8, r7)
            if (r8 != r0) goto L63
            return r0
        L63:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineCursor r8 = r6.o7()
            r8.a()
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.u6.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
