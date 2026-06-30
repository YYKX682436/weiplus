package o01;

/* loaded from: classes.dex */
public final class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f423425d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f423426e;

    public e(com.p314xaae8f345.mm.p944x882e457a.o reqResp, u26.k0 channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqResp, "reqResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f423425d = reqResp;
        this.f423426e = channel;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        if (sVar == null) {
            return -1;
        }
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f423425d, this);
        u26.k0 k0Var = this.f423426e;
        if (!k0Var.j()) {
            k0Var.e(new o01.a(q01.f.f440808d, mo9409x10f9447a, -1, -1, "", this, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.FlowNetScene", "doScene, netId:" + mo9409x10f9447a);
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f423425d.f152246d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: needCheckCallback */
    public boolean mo48009xb05ac77() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r10, int r11, int r12, java.lang.String r13, com.p314xaae8f345.mm.p971x6de15a2e.v0 r14, byte[] r15) {
        /*
            r9 = this;
            r15 = 0
            if (r14 == 0) goto L1b
            boolean r0 = r14 instanceof com.p314xaae8f345.mm.p944x882e457a.o
            if (r0 == 0) goto L8
            goto L9
        L8:
            r14 = r15
        L9:
            if (r14 == 0) goto L1b
            com.tencent.mm.modelbase.o r14 = (com.p314xaae8f345.mm.p944x882e457a.o) r14
            com.tencent.mm.modelbase.n r14 = r14.f152244b
            com.tencent.mm.protobuf.f r14 = r14.f152233a
            boolean r0 = r14 instanceof r45.ny3
            if (r0 == 0) goto L18
            r45.ny3 r14 = (r45.ny3) r14
            goto L19
        L18:
            r14 = r15
        L19:
            r7 = r14
            goto L1c
        L1b:
            r7 = r15
        L1c:
            u26.k0 r14 = r9.f423426e
            boolean r0 = r14.j()
            if (r0 != 0) goto L3a
            o01.a r8 = new o01.a
            q01.f r1 = q01.f.f440809e
            if (r13 != 0) goto L2e
            java.lang.String r0 = ""
            r5 = r0
            goto L2f
        L2e:
            r5 = r13
        L2f:
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.e(r8)
        L3a:
            r0 = 1
            u26.x0.a(r14, r15, r0, r15)
            com.tencent.mm.modelbase.r1 r2 = gm0.j1.d()
            com.tencent.mm.sdk.platformtools.n3 r14 = r2.f152303m
            com.tencent.mm.modelbase.v1 r15 = new com.tencent.mm.modelbase.v1
            r1 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r14.mo50293x3498a0(r15)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "onGYNetEnd, netId:"
            r14.<init>(r15)
            r14.append(r10)
            java.lang.String r10 = " errType:"
            r14.append(r10)
            r14.append(r11)
            java.lang.String r10 = " errCode:"
            r14.append(r10)
            r14.append(r12)
            java.lang.String r10 = " errMsg:"
            r14.append(r10)
            r14.append(r13)
            java.lang.String r10 = r14.toString()
            java.lang.String r11 = "MicroMsg.Mvvm.FlowNetScene"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o01.e.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
