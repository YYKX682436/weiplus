package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes10.dex */
public final class c3 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f391754d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391755e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f391756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.e3 f391757g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(p3325xe03a0797.p3326xc267989b.p3328x30012e.e3 e3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f391757g = e3Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.c3 c3Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.c3(this.f391757g, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        c3Var.f391755e = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        c3Var.f391756f = intValue;
        return c3Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f391754d
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            kotlinx.coroutines.flow.e3 r7 = r10.f391757g
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L38
            if (r1 == r5) goto L30
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L38
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            java.lang.Object r1 = r10.f391755e
            kotlinx.coroutines.flow.k r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L82
        L28:
            java.lang.Object r1 = r10.f391755e
            kotlinx.coroutines.flow.k r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L75
        L30:
            java.lang.Object r1 = r10.f391755e
            kotlinx.coroutines.flow.k r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L60
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L90
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.Object r11 = r10.f391755e
            r1 = r11
            kotlinx.coroutines.flow.k r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r1
            int r11 = r10.f391756f
            if (r11 <= 0) goto L53
            kotlinx.coroutines.flow.t2 r11 = p3325xe03a0797.p3326xc267989b.p3328x30012e.t2.START
            r10.f391754d = r6
            java.lang.Object r11 = r1.mo771x2f8fd3(r11, r10)
            if (r11 != r0) goto L90
            return r0
        L53:
            long r8 = r7.f391776b
            r10.f391755e = r1
            r10.f391754d = r5
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r8, r10)
            if (r11 != r0) goto L60
            return r0
        L60:
            long r5 = r7.f391777c
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L82
            kotlinx.coroutines.flow.t2 r11 = p3325xe03a0797.p3326xc267989b.p3328x30012e.t2.STOP
            r10.f391755e = r1
            r10.f391754d = r4
            java.lang.Object r11 = r1.mo771x2f8fd3(r11, r10)
            if (r11 != r0) goto L75
            return r0
        L75:
            long r4 = r7.f391777c
            r10.f391755e = r1
            r10.f391754d = r3
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r10)
            if (r11 != r0) goto L82
            return r0
        L82:
            kotlinx.coroutines.flow.t2 r11 = p3325xe03a0797.p3326xc267989b.p3328x30012e.t2.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r10.f391755e = r3
            r10.f391754d = r2
            java.lang.Object r11 = r1.mo771x2f8fd3(r11, r10)
            if (r11 != r0) goto L90
            return r0
        L90:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.c3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
