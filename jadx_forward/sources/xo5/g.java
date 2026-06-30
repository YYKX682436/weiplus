package xo5;

/* loaded from: classes7.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f537315d;

    /* renamed from: e, reason: collision with root package name */
    public int f537316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xo5.n f537317f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xo5.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f537317f = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xo5.g(this.f537317f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xo5.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
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
            int r1 = r12.f537316e
            r2 = 0
            xo5.n r3 = r12.f537317f
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            java.lang.Object r1 = r12.f537315d
            java.util.Iterator r1 = (java.util.Iterator) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L50
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L40
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            kotlinx.coroutines.y0 r6 = r3.f537328f
            r7 = 0
            r8 = 0
            xo5.e r9 = new xo5.e
            r9.<init>(r3, r2)
            r10 = 3
            r11 = 0
            kotlinx.coroutines.r2 r13 = p3325xe03a0797.p3326xc267989b.l.d(r6, r7, r8, r9, r10, r11)
            r12.f537316e = r5
            kotlinx.coroutines.c3 r13 = (p3325xe03a0797.p3326xc267989b.c3) r13
            java.lang.Object r13 = r13.C(r12)
            if (r13 != r0) goto L40
            return r0
        L40:
            java.util.Set r13 = r3.f537326d
            xo5.f r1 = new xo5.f
            r1.<init>()
            java.util.List r13 = kz5.n0.F0(r13, r1)
            java.util.Iterator r13 = r13.iterator()
            r1 = r13
        L50:
            r13 = r12
        L51:
            boolean r3 = r1.hasNext()
            jz5.f0 r5 = jz5.f0.f384359a
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r1.next()
            xo5.b r3 = (xo5.b) r3
            r13.f537315d = r1
            r13.f537316e = r4
            oz5.l r6 = r3.f537308b
            if (r6 == 0) goto L76
            xo5.a r7 = new xo5.a
            r7.<init>(r3, r2)
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.l.g(r6, r7, r13)
            pz5.a r6 = pz5.a.f440719d
            if (r3 != r6) goto L8b
            r5 = r3
            goto L8b
        L76:
            kotlin.Result$Companion r6 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L81
            java.io.Closeable r3 = r3.f537307a     // Catch: java.lang.Throwable -> L81
            r3.close()     // Catch: java.lang.Throwable -> L81
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)     // Catch: java.lang.Throwable -> L81
            goto L8b
        L81:
            r3 = move-exception
            kotlin.Result$Companion r6 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r3 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r3)
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r3)
        L8b:
            if (r5 != r0) goto L51
            return r0
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xo5.g.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
