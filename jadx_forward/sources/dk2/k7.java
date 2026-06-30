package dk2;

/* loaded from: classes3.dex */
public final class k7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315221d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f315223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(ce2.i iVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315223f = iVar;
        this.f315224g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dk2.k7 k7Var = new dk2.k7(this.f315223f, this.f315224g, interfaceC29045xdcb5ca57);
        k7Var.f315222e = obj;
        return k7Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.k7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f315221d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Laa
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            java.lang.Object r1 = r11.f315222e
            java.util.Iterator r1 = (java.util.Iterator) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L67
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.Object r12 = r11.f315222e
            kotlinx.coroutines.y0 r12 = (p3325xe03a0797.p3326xc267989b.y0) r12
            ce2.i r1 = r11.f315223f
            boolean r4 = r1.Y0()
            r10 = 0
            r5 = 0
            if (r4 == 0) goto L7e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r45.zq4 r1 = r1.f67808xc50d3cee
            if (r1 == 0) goto L63
            java.util.LinkedList r1 = r1.m75941xfb821914(r5)
            if (r1 == 0) goto L63
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r1.next()
            r45.yq4 r4 = (r45.yq4) r4
            r5 = 0
            r6 = 0
            dk2.j7 r7 = new dk2.j7
            r7.<init>(r4, r10)
            r8 = 3
            r9 = 0
            r4 = r12
            kotlinx.coroutines.f1 r4 = p3325xe03a0797.p3326xc267989b.l.b(r4, r5, r6, r7, r8, r9)
            r2.add(r4)
            goto L45
        L63:
            java.util.Iterator r1 = r2.iterator()
        L67:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto Lb0
            java.lang.Object r12 = r1.next()
            kotlinx.coroutines.f1 r12 = (p3325xe03a0797.p3326xc267989b.f1) r12
            r11.f315222e = r1
            r11.f315221d = r3
            java.lang.Object r12 = r12.k(r11)
            if (r12 != r0) goto L67
            return r0
        L7e:
            r45.zq4 r12 = r1.f67808xc50d3cee
            if (r12 == 0) goto L87
            java.util.LinkedList r12 = r12.m75941xfb821914(r5)
            goto L88
        L87:
            r12 = r10
        L88:
            if (r12 == 0) goto Lb0
            boolean r4 = r12.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L93
            r4 = r12
            goto L94
        L93:
            r4 = r10
        L94:
            if (r4 == 0) goto Lb0
            dk2.u7 r3 = dk2.u7.f315714a
            r11.f315221d = r2
            kotlinx.coroutines.p0 r2 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            dk2.s7 r3 = new dk2.s7
            java.lang.String r4 = r11.f315224g
            r3.<init>(r12, r4, r1, r10)
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r2, r3, r11)
            if (r12 != r0) goto Laa
            return r0
        Laa:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r3 = r12.booleanValue()
        Lb0:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.k7.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
