package z51;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f551727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.p f551728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z51.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551728e = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z51.m(this.f551728e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[RETURN] */
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
            int r1 = r8.f551727d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            z51.p r6 = r8.f551728e
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto Lab
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L99
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L62
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Class<z51.c> r9 = z51.c.class
            z51.x r9 = r6.a(r9)
            z51.c r9 = (z51.c) r9
            kotlinx.coroutines.r2 r9 = r9.f551708g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "first play to check parse job: "
            r1.<init>(r7)
            if (r9 == 0) goto L4a
            r7 = r9
            kotlinx.coroutines.a r7 = (p3325xe03a0797.p3326xc267989b.a) r7
            boolean r7 = r7.a()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L4b
        L4a:
            r7 = r5
        L4b:
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r6.f(r1)
            if (r9 == 0) goto L62
            r8.f551727d = r4
            kotlinx.coroutines.c3 r9 = (p3325xe03a0797.p3326xc267989b.c3) r9
            java.lang.Object r9 = r9.C(r8)
            if (r9 != r0) goto L62
            return r0
        L62:
            java.lang.Class<z51.w> r9 = z51.w.class
            z51.x r9 = r6.a(r9)
            z51.w r9 = (z51.w) r9
            kotlinx.coroutines.r2 r9 = r9.f551762g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "first play to check loadBitmapJob: "
            r1.<init>(r4)
            if (r9 == 0) goto L81
            r4 = r9
            kotlinx.coroutines.a r4 = (p3325xe03a0797.p3326xc267989b.a) r4
            boolean r4 = r4.a()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L82
        L81:
            r4 = r5
        L82:
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r6.f(r1)
            if (r9 == 0) goto L99
            r8.f551727d = r3
            kotlinx.coroutines.c3 r9 = (p3325xe03a0797.p3326xc267989b.c3) r9
            java.lang.Object r9 = r9.C(r8)
            if (r9 != r0) goto L99
            return r0
        L99:
            kotlinx.coroutines.p0 r9 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r9 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            z51.l r1 = new z51.l
            r1.<init>(r6, r5)
            r8.f551727d = r2
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r1, r8)
            if (r9 != r0) goto Lab
            return r0
        Lab:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z51.m.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
