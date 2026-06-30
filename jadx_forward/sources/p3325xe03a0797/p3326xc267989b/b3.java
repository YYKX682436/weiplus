package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class b3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f391673e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f391674f;

    /* renamed from: g, reason: collision with root package name */
    public int f391675g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391676h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.c3 f391677i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(p3325xe03a0797.p3326xc267989b.c3 c3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f391677i = c3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.b3 b3Var = new p3325xe03a0797.p3326xc267989b.b3(this.f391677i, interfaceC29045xdcb5ca57);
        b3Var.f391676h = obj;
        return b3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p3325xe03a0797.p3326xc267989b.b3) mo148xaf65a0fc((q26.p) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0063 -> B:6:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0077 -> B:6:0x007a). Please report as a decompilation issue!!! */
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
            int r1 = r7.f391675g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r7.f391674f
            kotlinx.coroutines.internal.t r1 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) r1
            java.lang.Object r3 = r7.f391673e
            kotlinx.coroutines.internal.m r3 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.m) r3
            java.lang.Object r4 = r7.f391676h
            q26.p r4 = (q26.p) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
            goto L7a
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L7f
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.Object r8 = r7.f391676h
            q26.p r8 = (q26.p) r8
            kotlinx.coroutines.c3 r1 = r7.f391677i
            java.lang.Object r1 = r1.P()
            boolean r4 = r1 instanceof p3325xe03a0797.p3326xc267989b.x
            if (r4 == 0) goto L44
            kotlinx.coroutines.x r1 = (p3325xe03a0797.p3326xc267989b.x) r1
            kotlinx.coroutines.y r1 = r1.f392227h
            r7.f391675g = r3
            r8.b(r1, r7)
            return r0
        L44:
            boolean r3 = r1 instanceof p3325xe03a0797.p3326xc267989b.k2
            if (r3 == 0) goto L7f
            kotlinx.coroutines.k2 r1 = (p3325xe03a0797.p3326xc267989b.k2) r1
            kotlinx.coroutines.h3 r1 = r1.f()
            if (r1 == 0) goto L7f
            java.lang.Object r3 = r1.l()
            kotlinx.coroutines.internal.t r3 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L5b:
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r3)
            if (r5 != 0) goto L7f
            boolean r5 = r1 instanceof p3325xe03a0797.p3326xc267989b.x
            if (r5 == 0) goto L7a
            r5 = r1
            kotlinx.coroutines.x r5 = (p3325xe03a0797.p3326xc267989b.x) r5
            kotlinx.coroutines.y r5 = r5.f392227h
            r8.f391676h = r4
            r8.f391673e = r3
            r8.f391674f = r1
            r8.f391675g = r2
            r4.b(r5, r8)
            pz5.a r5 = pz5.a.f440719d
            if (r5 != r0) goto L7a
            return r0
        L7a:
            kotlinx.coroutines.internal.t r1 = r1.m()
            goto L5b
        L7f:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.b3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
