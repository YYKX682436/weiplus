package pi2;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436299d;

    /* renamed from: e, reason: collision with root package name */
    public int f436300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi2.n f436301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f436302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pi2.n nVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f436301f = nVar;
        this.f436302g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi2.c(this.f436301f, this.f436302g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
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
            int r1 = r13.f436300e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r13.f436299d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto Lac
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f436299d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L90
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L6f
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r45.my1 r14 = new r45.my1
            r14.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r6 = 8334(0x208e, float:1.1678E-41)
            r45.kv0 r1 = r1.a(r6)
            r14.set(r5, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.set(r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r14.set(r3, r1)
            com.tencent.mm.modelbase.i r14 = r14.d()
            az2.j r14 = (az2.j) r14
            pi2.n r1 = r13.f436301f
            android.content.Context r7 = r1.f199716e
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r6 = r14
            az2.j.u(r6, r7, r8, r9, r11, r12)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r13.f436300e = r5
            java.lang.Object r14 = xg2.g.b(r14, r1, r13)
            if (r14 != r0) goto L6f
            return r0
        L6f:
            r1 = r14
            xg2.h r1 = (xg2.h) r1
            boolean r14 = r1 instanceof xg2.i
            if (r14 == 0) goto L90
            oz5.l r14 = r1.f535925a
            if (r14 != 0) goto L7e
            oz5.l r14 = r13.mo48699x76847179()
        L7e:
            pi2.b r5 = new pi2.b
            yz5.a r6 = r13.f436302g
            r5.<init>(r1, r2, r6)
            r13.f436299d = r1
            r13.f436300e = r4
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r5, r13)
            if (r14 != r0) goto L90
            return r0
        L90:
            boolean r14 = r1 instanceof xg2.b
            if (r14 == 0) goto Lac
            oz5.l r14 = r1.f535925a
            if (r14 != 0) goto L9c
            oz5.l r14 = r13.mo48699x76847179()
        L9c:
            pi2.a r4 = new pi2.a
            r4.<init>(r1, r2)
            r13.f436299d = r1
            r13.f436300e = r3
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r4, r13)
            if (r14 != r0) goto Lac
            return r0
        Lac:
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: pi2.c.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
