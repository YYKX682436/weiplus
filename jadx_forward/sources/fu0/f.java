package fu0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f348303d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f348304e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f348305f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f348306g;

    /* renamed from: h, reason: collision with root package name */
    public int f348307h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f348308i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348309m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ im5.c f348310n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, java.lang.String str, im5.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348308i = list;
        this.f348309m = str;
        this.f348310n = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fu0.f(this.f348308i, this.f348309m, this.f348310n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fu0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f348307h
            java.util.List r3 = r0.f348308i
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L26
            if (r2 == r6) goto L20
            if (r2 != r4) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            r2 = r22
            goto Lb8
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            r2 = r22
            goto L4b
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            wt3.k0 r2 = new wt3.k0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            st3.v r8 = st3.v.f494138d
            wt3.a0 r8 = new wt3.a0
            r8.<init>()
            r9 = 10
            r2.<init>(r7, r9, r8)
            r2.c()
            r2.a()
            r0.f348307h = r6
            java.lang.Object r2 = r2.b(r5, r0)
            if (r2 != r1) goto L4b
            return r1
        L4b:
            r15 = r2
            com.tencent.mm.protobuf.g r15 = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) r15
            java.lang.String r2 = r0.f348309m
            if (r2 == 0) goto L62
            boolean r7 = r26.n0.N(r2)
            r7 = r7 ^ r6
            if (r7 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r5
        L5b:
            if (r2 == 0) goto L62
            com.tencent.mm.protobuf.g r2 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(r2)
            goto L63
        L62:
            r2 = r5
        L63:
            im5.c r14 = r0.f348310n
            r0.f348303d = r15
            r0.f348304e = r2
            r0.f348305f = r14
            r0.f348306g = r3
            r0.f348307h = r4
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r7 = pz5.f.b(r21)
            r4.<init>(r7, r6)
            r4.k()
            nv3.f r13 = new nv3.f
            r10 = 0
            r12 = 15
            r16 = 0
            int r3 = r3.size()
            fu0.e r9 = new fu0.e
            r9.<init>(r4)
            r18 = 16
            r19 = 0
            r17 = 1
            r7 = r13
            r8 = r14
            r20 = r9
            r9 = r17
            r5 = r13
            r13 = r16
            r6 = r14
            r14 = r3
            r16 = r2
            r17 = r20
            r7.<init>(r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            fu0.d r2 = new fu0.d
            r2.<init>(r6, r5)
            r4.m(r2)
            r2 = 0
            r3 = 1
            r5.a(r3, r2, r2)
            java.lang.Object r2 = r4.j()
            if (r2 != r1) goto Lb8
            return r1
        Lb8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fu0.f.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
