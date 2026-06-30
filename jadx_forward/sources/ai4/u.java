package ai4;

/* loaded from: classes11.dex */
public final class u extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f86733d;

    public u(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ai4.u(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return new ai4.u((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f86733d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Lc3
        Le:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            ai4.b0 r12 = ai4.b0.f86656a
            r11.f86733d = r2
            qi4.p r12 = qi4.p.f445309a
            r1 = 0
            si4.a r12 = r12.d(r1)
            gm0.m r2 = gm0.j1.b()
            java.lang.String r2 = r2.k()
            java.util.List r12 = r12.q(r2)
            r2 = 0
            kotlin.Result$Companion r3 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r3 = r12.iterator()     // Catch: java.lang.Throwable -> L64
            r4 = r1
        L38:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L62
            mj4.h r5 = (mj4.h) r5     // Catch: java.lang.Throwable -> L62
            ai4.f r6 = ai4.f.f86672a     // Catch: java.lang.Throwable -> L62
            bw5.sm0 r5 = r6.h(r5)     // Catch: java.lang.Throwable -> L62
            qi4.v r6 = qi4.v.f445321a     // Catch: java.lang.Throwable -> L62
            bw5.um0 r5 = r6.f(r5, r2)     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L55
            boolean r5 = r5.f115517d     // Catch: java.lang.Throwable -> L62
            goto L56
        L55:
            r5 = r1
        L56:
            if (r5 == 0) goto L38
            int r4 = r4 + 1
            goto L38
        L5b:
            jz5.f0 r1 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r1)     // Catch: java.lang.Throwable -> L62
            goto L71
        L62:
            r1 = move-exception
            goto L67
        L64:
            r3 = move-exception
            r4 = r1
            r1 = r3
        L67:
            kotlin.Result$Companion r3 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r1 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r1)
            java.lang.Object r1 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r1)
        L71:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "transferSelfStatusDataToAffDB: oldCount="
            r3.<init>(r5)
            int r5 = r12.size()
            r3.append(r5)
            java.lang.String r5 = ", successCount="
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = ", result="
            r3.append(r5)
            boolean r5 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)
            r3.append(r5)
            java.lang.String r5 = ", err="
            r3.append(r5)
            java.lang.Throwable r5 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r1)
            if (r5 == 0) goto La3
            java.lang.String r2 = jz5.a.b(r5)
        La3:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.StatusAffDBTransfer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            ai4.j0 r2 = new ai4.j0
            boolean r6 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)
            int r12 = r12.size()
            long r7 = (long) r12
            long r9 = (long) r4
            r5 = r2
            r5.<init>(r6, r7, r9)
            if (r2 != r0) goto Lc2
            return r0
        Lc2:
            r12 = r2
        Lc3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.u.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
