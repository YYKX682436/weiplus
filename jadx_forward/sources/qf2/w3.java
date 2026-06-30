package qf2;

/* loaded from: classes.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444164d;

    /* renamed from: e, reason: collision with root package name */
    public int f444165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.z3 f444166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444167g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(qf2.z3 z3Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444166f = z3Var;
        this.f444167g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.w3(this.f444166f, this.f444167g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.w3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
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
            int r2 = r0.f444165e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L32
            if (r2 == r6) goto L2c
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1b
            java.lang.Object r1 = r0.f444164d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            goto Ld1
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.Object r2 = r0.f444164d
            xg2.h r2 = (xg2.h) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            goto Laf
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            r2 = r18
            goto L8b
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            r45.di2 r2 = new r45.di2
            r2.<init>()
            r45.vy1 r7 = new r45.vy1
            r7.<init>()
            r8 = 0
            java.lang.String r9 = r0.f444167g
            r7.set(r8, r9)
            r2.set(r8, r7)
            r45.hx0 r7 = new r45.hx0
            r7.<init>()
            r9 = 21
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.set(r8, r9)
            byte[] r2 = r2.mo14344x5f01b1f6()
            com.tencent.mm.protobuf.g r2 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r2)
            r7.set(r6, r2)
            ek2.r1 r2 = new ek2.r1
            qf2.z3 r9 = r0.f444166f
            java.lang.Class<mm2.e1> r10 = mm2.e1.class
            androidx.lifecycle.c1 r11 = r9.m56788xbba4bfc0(r10)
            mm2.e1 r11 = (mm2.e1) r11
            r45.nw1 r11 = r11.f410521r
            long r11 = r11.m75942xfb822ef2(r8)
            androidx.lifecycle.c1 r8 = r9.m56788xbba4bfc0(r10)
            mm2.e1 r8 = (mm2.e1) r8
            long r13 = r8.f410516m
            r15 = 1
            r10 = r2
            r16 = r7
            r10.<init>(r11, r13, r15, r16)
            r0.f444165e = r6
            java.lang.Object r2 = xg2.g.d(r2, r5, r0, r6, r5)
            if (r2 != r1) goto L8b
            return r1
        L8b:
            xg2.h r2 = (xg2.h) r2
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            boolean r7 = r2 instanceof xg2.i
            if (r7 == 0) goto Laf
            if (r6 != 0) goto L9f
            oz5.l r6 = r2.f535925a
            if (r6 != 0) goto L9f
            oz5.l r6 = r17.mo48699x76847179()
        L9f:
            qf2.v3 r7 = new qf2.v3
            r7.<init>(r2, r5)
            r0.f444164d = r2
            r0.f444165e = r4
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.l.g(r6, r7, r0)
            if (r4 != r1) goto Laf
            return r1
        Laf:
            kotlinx.coroutines.p0 r4 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r4 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            boolean r6 = r2 instanceof xg2.b
            if (r6 == 0) goto Ld1
            if (r4 != 0) goto Lc1
            oz5.l r4 = r2.f535925a
            if (r4 != 0) goto Lc1
            oz5.l r4 = r17.mo48699x76847179()
        Lc1:
            qf2.u3 r6 = new qf2.u3
            r6.<init>(r2, r5)
            r0.f444164d = r2
            r0.f444165e = r3
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r4, r6, r0)
            if (r2 != r1) goto Ld1
            return r1
        Ld1:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.w3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
