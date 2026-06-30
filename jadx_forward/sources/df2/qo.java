package df2;

/* loaded from: classes3.dex */
public final class qo extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312708d;

    /* renamed from: e, reason: collision with root package name */
    public int f312709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.to f312710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(df2.to toVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312710f = toVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.qo(this.f312710f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.qo) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f312709e
            r3 = 3
            r4 = 2
            r5 = 0
            df2.to r6 = r0.f312710f
            r7 = 1
            if (r2 == 0) goto L34
            if (r2 == r7) goto L2e
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.f312708d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r23)
            goto Lc9
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f312708d
            xg2.h r2 = (xg2.h) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r23)
            goto Lac
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r23)
            r2 = r23
            goto L8e
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r23)
            r45.j32 r2 = r6.f312995o
            r8 = 0
            if (r2 == 0) goto L44
            int r2 = r2.m75939xb282bd08(r4)
            if (r2 != r7) goto L44
            r2 = r7
            goto L45
        L44:
            r2 = r8
        L45:
            if (r2 == 0) goto L4e
            r45.j32 r1 = r6.f312995o
            df2.to.b7(r6, r1)
            goto Lc9
        L4e:
            r9 = 0
            r10 = 0
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r2 = r6.m56788xbba4bfc0(r2)
            mm2.c1 r2 = (mm2.c1) r2
            java.lang.String r11 = r2.f410385o
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r8)
            r2.add(r3)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r7)
            r2.add(r3)
            r20 = 1019(0x3fb, float:1.428E-42)
            r21 = 0
            db2.b1 r3 = new db2.b1
            r8 = r3
            r19 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.f312709e = r7
            java.lang.Object r2 = xg2.g.d(r3, r5, r0, r7, r5)
            if (r2 != r1) goto L8e
            return r1
        L8e:
            xg2.h r2 = (xg2.h) r2
            boolean r3 = r2 instanceof xg2.i
            if (r3 == 0) goto Lac
            oz5.l r3 = r2.f535925a
            if (r3 != 0) goto L9c
            oz5.l r3 = r22.mo48699x76847179()
        L9c:
            df2.po r7 = new df2.po
            r7.<init>(r2, r5, r6)
            r0.f312708d = r2
            r0.f312709e = r4
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.l.g(r3, r7, r0)
            if (r3 != r1) goto Lac
            return r1
        Lac:
            boolean r3 = r2 instanceof xg2.b
            if (r3 == 0) goto Lc9
            oz5.l r3 = r2.f535925a
            if (r3 != 0) goto Lb8
            oz5.l r3 = r22.mo48699x76847179()
        Lb8:
            df2.oo r4 = new df2.oo
            r4.<init>(r2, r5, r6)
            r0.f312708d = r2
            r2 = 3
            r0.f312709e = r2
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r3, r4, r0)
            if (r2 != r1) goto Lc9
            return r1
        Lc9:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qo.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
