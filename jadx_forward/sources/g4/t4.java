package g4;

/* loaded from: classes14.dex */
public final class t4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350104d;

    /* renamed from: e, reason: collision with root package name */
    public int f350105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.u4 f350106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f350107g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f350108h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(g4.u4 u4Var, int i17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350106f = u4Var;
        this.f350107g = i17;
        this.f350108h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        g4.t4 t4Var = new g4.t4(this.f350106f, this.f350107g, this.f350108h, completion);
        t4Var.f350104d = obj;
        return t4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.t4) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [g4.r4] */
    /* JADX WARN: Type inference failed for: r9v14, types: [g4.r4] */
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
            int r1 = r8.f350105e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            g4.u4 r6 = r8.f350106f
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L25
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r0 = r8.f350104d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L96
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L97
        L2a:
            java.lang.Object r1 = r8.f350104d
            kotlinx.coroutines.r2 r1 = (p3325xe03a0797.p3326xc267989b.r2) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r9 = move-exception
            goto L88
        L34:
            java.lang.Object r1 = r8.f350104d
            kotlinx.coroutines.r2 r1 = (p3325xe03a0797.p3326xc267989b.r2) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L65
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Object r9 = r8.f350104d
            kotlinx.coroutines.y0 r9 = (p3325xe03a0797.p3326xc267989b.y0) r9
            oz5.l r9 = r9.getF93115e()
            int r1 = p3325xe03a0797.p3326xc267989b.r2.O0
            kotlinx.coroutines.q2 r1 = p3325xe03a0797.p3326xc267989b.q2.f392104d
            oz5.i r9 = r9.get(r1)
            if (r9 == 0) goto L9a
            kotlinx.coroutines.r2 r9 = (p3325xe03a0797.p3326xc267989b.r2) r9
            g4.r4 r1 = r6.f350120a
            r8.f350104d = r9
            r8.f350105e = r5
            int r5 = r8.f350107g
            java.lang.Object r1 = r1.b(r5, r9, r8)
            if (r1 != r0) goto L62
            return r0
        L62:
            r7 = r1
            r1 = r9
            r9 = r7
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L97
            yz5.l r9 = r8.f350108h     // Catch: java.lang.Throwable -> L32
            r8.f350104d = r1     // Catch: java.lang.Throwable -> L32
            r8.f350105e = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r9 = r9.mo146xb9724478(r8)     // Catch: java.lang.Throwable -> L32
            if (r9 != r0) goto L7a
            return r0
        L7a:
            g4.r4 r9 = r6.f350120a
            r2 = 0
            r8.f350104d = r2
            r8.f350105e = r3
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L97
            return r0
        L88:
            g4.r4 r3 = r6.f350120a
            r8.f350104d = r9
            r8.f350105e = r2
            java.lang.Object r1 = r3.a(r1, r8)
            if (r1 != r0) goto L95
            return r0
        L95:
            r0 = r9
        L96:
            throw r0
        L97:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        L9a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.t4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
