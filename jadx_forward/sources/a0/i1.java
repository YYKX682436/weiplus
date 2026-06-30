package a0;

/* loaded from: classes14.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f81705d;

    /* renamed from: e, reason: collision with root package name */
    public int f81706e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f81707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f81708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81709h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(c0.o oVar, n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81708g = oVar;
        this.f81709h = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        a0.i1 i1Var = new a0.i1(this.f81708g, this.f81709h, interfaceC29045xdcb5ca57);
        i1Var.f81707f = obj;
        return i1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.i1) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:11:0x003e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f81706e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L25
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            java.lang.Object r1 = r12.f81705d
            oz5.l r1 = (oz5.l) r1
            java.lang.Object r5 = r12.f81707f
            p1.a0 r5 = (p1.a0) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = r5
            goto L3d
        L25:
            java.lang.Object r1 = r12.f81705d
            oz5.l r1 = (oz5.l) r1
            java.lang.Object r5 = r12.f81707f
            p1.a0 r5 = (p1.a0) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r6 = r12
            goto L5d
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.Object r13 = r12.f81707f
            p1.a0 r13 = (p1.a0) r13
            oz5.l r1 = r12.mo48699x76847179()
        L3d:
            r5 = r12
        L3e:
            boolean r6 = p3325xe03a0797.p3326xc267989b.v2.h(r1)
            if (r6 == 0) goto L91
            a0.h1 r6 = new a0.h1
            r7 = 0
            r6.<init>(r7)
            r5.f81707f = r13
            r5.f81705d = r1
            r5.f81706e = r4
            p1.q0 r13 = (p1.q0) r13
            java.lang.Object r6 = r13.v(r6, r5)
            if (r6 != r0) goto L59
            return r0
        L59:
            r11 = r5
            r5 = r13
            r13 = r6
            r6 = r11
        L5d:
            p1.l r13 = (p1.l) r13
            int r13 = r13.f432377c
            r7 = 0
            r8 = 4
            if (r13 != r8) goto L67
            r8 = r4
            goto L68
        L67:
            r8 = r7
        L68:
            n0.v2 r9 = r6.f81709h
            c0.o r10 = r6.f81708g
            if (r8 == 0) goto L7b
            r6.f81707f = r5
            r6.f81705d = r1
            r6.f81706e = r3
            java.lang.Object r13 = a0.l1.a(r10, r9, r6)
            if (r13 != r0) goto L8e
            return r0
        L7b:
            r8 = 5
            if (r13 != r8) goto L7f
            r7 = r4
        L7f:
            if (r7 == 0) goto L8e
            r6.f81707f = r5
            r6.f81705d = r1
            r6.f81706e = r2
            java.lang.Object r13 = a0.l1.d(r9, r10, r6)
            if (r13 != r0) goto L8e
            return r0
        L8e:
            r13 = r5
            r5 = r6
            goto L3e
        L91:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.i1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
