package pz0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440706d;

    /* renamed from: e, reason: collision with root package name */
    public int f440707e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440708f;

    public u(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pz0.u uVar = new pz0.u(interfaceC29045xdcb5ca57);
        uVar.f440708f = obj;
        return uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
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
            int r1 = r13.f440707e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r13.f440706d
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r13.f440708f
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L7a
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L20:
            java.lang.Object r1 = r13.f440708f
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L3d
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.lang.Object r14 = r13.f440708f
            r1 = r14
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            nz0.d r14 = nz0.d.f423029a
            r13.f440708f = r1
            r13.f440707e = r3
            java.lang.Object r14 = r14.b(r13)
            if (r14 != r0) goto L3d
            return r0
        L3d:
            r45.ep3 r14 = (r45.ep3) r14
            r10 = 0
            if (r14 == 0) goto L45
            java.util.LinkedList r14 = r14.f455184d
            goto L46
        L45:
            r14 = r10
        L46:
            if (r14 == 0) goto L95
            java.util.ArrayList r11 = new java.util.ArrayList
            r4 = 10
            int r4 = kz5.d0.q(r14, r4)
            r11.<init>(r4)
            java.util.Iterator r12 = r14.iterator()
        L57:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r12.next()
            r45.bl6 r4 = (r45.bl6) r4
            r5 = 0
            r6 = 0
            pz0.t r7 = new pz0.t
            r7.<init>(r4, r10)
            r8 = 3
            r9 = 0
            r4 = r1
            kotlinx.coroutines.f1 r4 = p3325xe03a0797.p3326xc267989b.l.b(r4, r5, r6, r7, r8, r9)
            r11.add(r4)
            goto L57
        L75:
            java.util.Iterator r1 = r11.iterator()
            r4 = r14
        L7a:
            r14 = r13
        L7b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L94
            java.lang.Object r5 = r1.next()
            kotlinx.coroutines.f1 r5 = (p3325xe03a0797.p3326xc267989b.f1) r5
            r14.f440708f = r4
            r14.f440706d = r1
            r14.f440707e = r2
            java.lang.Object r5 = r5.k(r14)
            if (r5 != r0) goto L7b
            return r0
        L94:
            r14 = r4
        L95:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            if (r14 == 0) goto Lca
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r14.iterator()
        La5:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto Lc7
            java.lang.Object r2 = r14.next()
            r4 = r2
            r45.bl6 r4 = (r45.bl6) r4
            java.lang.String r4 = r4.f452392e
            if (r4 == 0) goto Lbf
            int r4 = r4.length()
            if (r4 != 0) goto Lbd
            goto Lbf
        Lbd:
            r4 = 0
            goto Lc0
        Lbf:
            r4 = r3
        Lc0:
            r4 = r4 ^ r3
            if (r4 == 0) goto La5
            r1.add(r2)
            goto La5
        Lc7:
            r0.addAll(r1)
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pz0.u.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
