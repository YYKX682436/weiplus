package ai4;

/* loaded from: classes11.dex */
public final class w extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f86735d;

    public w(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ai4.w(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return new ai4.w((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
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
            int r1 = r11.f86735d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Lc6
        Le:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            ai4.b0 r12 = ai4.b0.f86656a
            r11.f86735d = r2
            qi4.p r12 = qi4.p.f445309a
            jz5.g r12 = qi4.p.f445314f
            jz5.n r12 = (jz5.n) r12
            java.lang.Object r12 = r12.mo141623x754a37bb()
            ri4.d r12 = (ri4.d) r12
            java.util.List r12 = r12.x()
            r1 = 0
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r2 = r12.iterator()     // Catch: java.lang.Throwable -> L63
            r3 = r1
        L35:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L61
            mj4.e r4 = (mj4.e) r4     // Catch: java.lang.Throwable -> L61
            ai4.f r5 = ai4.f.f86672a     // Catch: java.lang.Throwable -> L61
            bw5.pl0 r4 = r5.f(r4)     // Catch: java.lang.Throwable -> L61
            com.tencent.wechat.aff.status.StatusLogicCommentManager r5 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b()     // Catch: java.lang.Throwable -> L61
            bw5.sl0 r4 = r5.m117398x6b618099(r4)     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto L54
            boolean r4 = r4.f114573d     // Catch: java.lang.Throwable -> L61
            goto L55
        L54:
            r4 = r1
        L55:
            if (r4 == 0) goto L35
            int r3 = r3 + 1
            goto L35
        L5a:
            jz5.f0 r1 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r1)     // Catch: java.lang.Throwable -> L61
            goto L70
        L61:
            r1 = move-exception
            goto L66
        L63:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L66:
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r1 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r1)
            java.lang.Object r1 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r1)
        L70:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "transferCommentDataToAffDB: oldCount="
            r2.<init>(r4)
            java.util.LinkedList r12 = (java.util.LinkedList) r12
            int r4 = r12.size()
            r2.append(r4)
            java.lang.String r4 = ", successCount="
            r2.append(r4)
            r2.append(r3)
            java.lang.String r4 = ", result="
            r2.append(r4)
            boolean r4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)
            r2.append(r4)
            java.lang.String r4 = ", err="
            r2.append(r4)
            java.lang.Throwable r4 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r1)
            if (r4 == 0) goto La5
            java.lang.String r4 = jz5.a.b(r4)
            goto La6
        La5:
            r4 = 0
        La6:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.StatusAffDBTransfer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            ai4.j0 r2 = new ai4.j0
            boolean r6 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)
            int r12 = r12.size()
            long r7 = (long) r12
            long r9 = (long) r3
            r5 = r2
            r5.<init>(r6, r7, r9)
            if (r2 != r0) goto Lc5
            return r0
        Lc5:
            r12 = r2
        Lc6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.w.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
