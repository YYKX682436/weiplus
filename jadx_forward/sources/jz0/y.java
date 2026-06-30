package jz0;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f384163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b f384164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f384164e = c11022x6fd7187b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jz0.y(this.f384164e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jz0.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r13 == r0) goto L24;
     */
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
            int r1 = r12.f384163d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC r4 = r12.f384164e
            if (r1 == 0) goto L19
            if (r1 != r3) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L63
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            az0.a0 r13 = r4.f151352e
            if (r13 == 0) goto L63
            r12.f384163d = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "awaitStopPlay: active:"
            r1.<init>(r5)
            kotlinx.coroutines.r2 r5 = r13.f96847f
            r6 = 0
            if (r5 == 0) goto L39
            kotlinx.coroutines.a r5 = (p3325xe03a0797.p3326xc267989b.a) r5
            boolean r5 = r5.a()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L3a
        L39:
            r5 = r6
        L3a:
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r13.f96844c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            kotlinx.coroutines.r2 r13 = r13.f96847f
            if (r13 == 0) goto L5f
            r1 = r13
            kotlinx.coroutines.a r1 = (p3325xe03a0797.p3326xc267989b.a) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L54
            r6 = r13
        L54:
            if (r6 == 0) goto L5f
            kotlinx.coroutines.c3 r6 = (p3325xe03a0797.p3326xc267989b.c3) r6
            java.lang.Object r13 = r6.C(r12)
            if (r13 != r0) goto L5f
            goto L60
        L5f:
            r13 = r2
        L60:
            if (r13 != r0) goto L63
            return r0
        L63:
            com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC r5 = r12.f384164e
            com.tencent.maas.model.time.MJTime r6 = r5.f151361q
            java.lang.String r13 = "access$getCurPlayTime$p(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r13)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b.Q6(r5, r6, r7, r8, r9, r10, r11)
            boolean r13 = r4.f151359o
            if (r13 != 0) goto L7e
            boolean r13 = r4.U6()
            goto L7f
        L7e:
            r13 = 0
        L7f:
            java.lang.String r0 = r4.f151351d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "fake video preview gainFocus:"
            r1.<init>(r5)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r13 = r13 ^ r3
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b.P6(r4, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jz0.y.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
