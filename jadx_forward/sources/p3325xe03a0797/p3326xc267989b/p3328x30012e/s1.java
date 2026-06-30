package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f391930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.w2 f391931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f391932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f391933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f391934h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(p3325xe03a0797.p3326xc267989b.p3328x30012e.w2 w2Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f391931e = w2Var;
        this.f391932f = jVar;
        this.f391933g = i2Var;
        this.f391934h = obj;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.s1(this.f391931e, this.f391932f, this.f391933g, this.f391934h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p3325xe03a0797.p3326xc267989b.p3328x30012e.s1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[RETURN] */
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
            int r1 = r8.f391930d
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            kotlinx.coroutines.flow.j r6 = r8.f391932f
            kotlinx.coroutines.flow.i2 r7 = r8.f391933g
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L55
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7d
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            int r9 = p3325xe03a0797.p3326xc267989b.p3328x30012e.w2.f391976a
            kotlinx.coroutines.flow.w2 r9 = p3325xe03a0797.p3326xc267989b.p3328x30012e.v2.f391962a
            kotlinx.coroutines.flow.w2 r1 = r8.f391931e
            if (r1 != r9) goto L3b
            r8.f391930d = r5
            java.lang.Object r9 = r6.a(r7, r8)
            if (r9 != r0) goto L7d
            return r0
        L3b:
            kotlinx.coroutines.flow.w2 r9 = p3325xe03a0797.p3326xc267989b.p3328x30012e.v2.f391963b
            r5 = 0
            if (r1 != r9) goto L5e
            r9 = r7
            v26.b r9 = (v26.b) r9
            kotlinx.coroutines.flow.f3 r9 = r9.i()
            kotlinx.coroutines.flow.q1 r1 = new kotlinx.coroutines.flow.q1
            r1.<init>(r5)
            r8.f391930d = r4
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.l(r9, r1, r8)
            if (r9 != r0) goto L55
            return r0
        L55:
            r8.f391930d = r3
            java.lang.Object r9 = r6.a(r7, r8)
            if (r9 != r0) goto L7d
            return r0
        L5e:
            r9 = r7
            v26.b r9 = (v26.b) r9
            kotlinx.coroutines.flow.f3 r9 = r9.i()
            kotlinx.coroutines.flow.j r9 = r1.a(r9)
            kotlinx.coroutines.flow.j r9 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.i(r9)
            kotlinx.coroutines.flow.r1 r1 = new kotlinx.coroutines.flow.r1
            java.lang.Object r3 = r8.f391934h
            r1.<init>(r6, r7, r3, r5)
            r8.f391930d = r2
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.f(r9, r1, r8)
            if (r9 != r0) goto L7d
            return r0
        L7d:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.s1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
