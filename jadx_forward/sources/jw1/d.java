package jw1;

/* loaded from: classes7.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f383829d;

    /* renamed from: e, reason: collision with root package name */
    public int f383830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jw1.h f383831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(jw1.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f383831f = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jw1.d(this.f383831f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jw1.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:12:0x0037->B:23:?, LOOP_END, SYNTHETIC] */
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
            int r1 = r9.f383830e
            jz5.f0 r2 = jz5.f0.f384359a
            jw1.h r3 = r9.f383831f
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L88
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r1 = r9.f383829d
            java.util.Iterator r1 = (java.util.Iterator) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L37
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.util.Set r10 = r3.f383835d
            jw1.c r1 = new jw1.c
            r1.<init>()
            java.util.List r10 = kz5.n0.F0(r10, r1)
            java.util.Iterator r1 = r10.iterator()
        L37:
            boolean r10 = r1.hasNext()
            r6 = 0
            if (r10 == 0) goto L73
            java.lang.Object r10 = r1.next()
            jw1.b r10 = (jw1.b) r10
            r9.f383829d = r1
            r9.f383830e = r5
            oz5.l r7 = r10.f383827b
            if (r7 == 0) goto L5a
            jw1.a r8 = new jw1.a
            r8.<init>(r10, r6)
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r7, r8, r9)
            pz5.a r6 = pz5.a.f440719d
            if (r10 != r6) goto L6f
            goto L70
        L5a:
            kotlin.Result$Companion r6 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L65
            java.io.Closeable r10 = r10.f383826a     // Catch: java.lang.Throwable -> L65
            r10.close()     // Catch: java.lang.Throwable -> L65
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r2)     // Catch: java.lang.Throwable -> L65
            goto L6f
        L65:
            r10 = move-exception
            kotlin.Result$Companion r6 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r10 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10)
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
        L6f:
            r10 = r2
        L70:
            if (r10 != r0) goto L37
            return r0
        L73:
            jz5.g r10 = r3.f383841m
            jz5.n r10 = (jz5.n) r10
            java.lang.Object r10 = r10.mo141623x754a37bb()
            kw1.k r10 = (kw1.k) r10
            r9.f383829d = r6
            r9.f383830e = r4
            java.lang.Object r10 = r10.b(r9)
            if (r10 != r0) goto L88
            return r0
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jw1.d.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
