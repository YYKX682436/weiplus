package ai4;

/* loaded from: classes11.dex */
public final class y extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f86737d;

    public y(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ai4.y(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return new ai4.y((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
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
            int r1 = r12.f86737d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Lc4
        Le:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            ai4.b0 r13 = ai4.b0.f86656a
            r12.f86737d = r2
            qi4.p r13 = qi4.p.f445309a
            jz5.g r13 = qi4.p.f445313e
            jz5.n r13 = (jz5.n) r13
            java.lang.Object r13 = r13.mo141623x754a37bb()
            ti4.d r13 = (ti4.d) r13
            java.util.List r13 = r13.y()
            r1 = 0
            kotlin.Result$Companion r3 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L63
            com.tencent.wechat.aff.status.StatusLogicCommentManager r3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r4 = r13.iterator()     // Catch: java.lang.Throwable -> L63
            r5 = r1
        L39:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L61
            mj4.l r6 = (mj4.l) r6     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r6.f76611x5493d43f     // Catch: java.lang.Throwable -> L61
            if (r6 != 0) goto L4b
            java.lang.String r6 = ""
        L4b:
            bw5.sl0 r6 = r3.m117402x9c10c36f(r6, r2)     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L54
            boolean r6 = r6.f114573d     // Catch: java.lang.Throwable -> L61
            goto L55
        L54:
            r6 = r1
        L55:
            if (r6 == 0) goto L39
            int r5 = r5 + 1
            goto L39
        L5a:
            jz5.f0 r1 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r1)     // Catch: java.lang.Throwable -> L61
            goto L70
        L61:
            r1 = move-exception
            goto L66
        L63:
            r2 = move-exception
            r5 = r1
            r1 = r2
        L66:
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r1 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r1)
            java.lang.Object r1 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r1)
        L70:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "transferSelfLikeDataToAffDB: oldCount="
            r2.<init>(r3)
            int r3 = r13.size()
            r2.append(r3)
            java.lang.String r3 = ", successCount="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", result="
            r2.append(r3)
            boolean r3 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)
            r2.append(r3)
            java.lang.String r3 = ", err="
            r2.append(r3)
            java.lang.Throwable r3 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r1)
            if (r3 == 0) goto La3
            java.lang.String r3 = jz5.a.b(r3)
            goto La4
        La3:
            r3 = 0
        La4:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.StatusAffDBTransfer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            ai4.j0 r2 = new ai4.j0
            boolean r7 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)
            int r13 = r13.size()
            long r8 = (long) r13
            long r10 = (long) r5
            r6 = r2
            r6.<init>(r7, r8, r10)
            if (r2 != r0) goto Lc3
            return r0
        Lc3:
            r13 = r2
        Lc4:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ai4.y.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
