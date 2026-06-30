package vt3;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f521521d;

    /* renamed from: e, reason: collision with root package name */
    public int f521522e;

    public c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vt3.c(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new vt3.c((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:7:0x0032). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f521522e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r6.f521521d
            u26.y r1 = (u26.y) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = r1
            goto L31
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.f521521d
            u26.y r1 = (u26.y) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r4 = r6
            goto L43
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            u26.w r7 = vt3.l.f521540c
            if (r7 == 0) goto L61
            u26.y r7 = r7.mo167478x467c086e()
        L31:
            r1 = r6
        L32:
            r1.f521521d = r7
            r1.f521522e = r3
            u26.a r7 = (u26.a) r7
            java.lang.Object r4 = r7.a(r1)
            if (r4 != r0) goto L3f
            return r0
        L3f:
            r5 = r1
            r1 = r7
            r7 = r4
            r4 = r5
        L43:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L61
            u26.a r1 = (u26.a) r1
            java.lang.Object r7 = r1.b()
            yz5.l r7 = (yz5.l) r7
            r4.f521521d = r1
            r4.f521522e = r2
            java.lang.Object r7 = r7.mo146xb9724478(r4)
            if (r7 != r0) goto L5e
            return r0
        L5e:
            r7 = r1
            r1 = r4
            goto L32
        L61:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vt3.c.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
