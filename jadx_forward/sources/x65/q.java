package x65;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f533924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w65.m f533925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w65.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f533925e = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x65.q(this.f533925e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((x65.q) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b A[RETURN] */
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
            int r1 = r8.f533924d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            w65.m r7 = r8.f533925e
            if (r1 == 0) goto L28
            if (r1 == r6) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L83
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L60
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L3e
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = r7
            w65.g r9 = (w65.g) r9
            r9.j()
            r8.f533924d = r6
            r9.getClass()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            if (r9 != r0) goto L3e
            return r0
        L3e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 >= 0) goto L47
            return r2
        L47:
            r7.f1()
            r9 = r7
            w65.g r9 = (w65.g) r9
            w65.q r1 = r9.f524889e
            w65.q r6 = w65.q.f524904i
            if (r1 != r6) goto L54
            return r2
        L54:
            r9.m()
            r8.f533924d = r5
            java.lang.Object r9 = r7.c(r8)
            if (r9 != r0) goto L60
            return r0
        L60:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 >= 0) goto L69
            return r2
        L69:
            r7.f1()
            r9 = r7
            w65.g r9 = (w65.g) r9
            w65.q r1 = r9.f524889e
            w65.q r5 = w65.q.f524904i
            if (r1 != r5) goto L76
            return r2
        L76:
            r9.i()
            r8.f533924d = r4
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            if (r9 != r0) goto L83
            return r0
        L83:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 >= 0) goto L8c
            return r2
        L8c:
            r7.f1()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x65.q.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
