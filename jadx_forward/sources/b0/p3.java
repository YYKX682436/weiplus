package b0;

/* loaded from: classes14.dex */
public final class p3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public long f98005e;

    /* renamed from: f, reason: collision with root package name */
    public int f98006f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1.s f98008h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(p1.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98008h = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.p3 p3Var = new b0.p3(this.f98008h, interfaceC29045xdcb5ca57);
        p3Var.f98007g = obj;
        return p3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.p3) mo148xaf65a0fc((p1.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:5:0x004d). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f98006f
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            long r3 = r9.f98005e
            java.lang.Object r1 = r9.f98007g
            p1.c r1 = (p1.c) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L4d
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f98007g
            p1.c r10 = (p1.c) r10
            p1.s r1 = r9.f98008h
            long r3 = r1.f432413b
            r1 = r10
            p1.o0 r1 = (p1.o0) r1
            p1.q0 r1 = r1.f432397i
            androidx.compose.ui.platform.k4 r1 = r1.f432399f
            long r5 = r1.a()
            long r3 = r3 + r5
            r1 = r10
            r10 = r9
        L38:
            r10.f98007g = r1
            r10.f98005e = r3
            r10.f98006f = r2
            r5 = 0
            r6 = 0
            java.lang.Object r5 = b0.d4.b(r1, r5, r10, r2, r6)
            if (r5 != r0) goto L47
            return r0
        L47:
            r8 = r0
            r0 = r10
            r10 = r5
            r4 = r3
            r3 = r1
            r1 = r8
        L4d:
            p1.s r10 = (p1.s) r10
            long r6 = r10.f432413b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L56
            return r10
        L56:
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.p3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
