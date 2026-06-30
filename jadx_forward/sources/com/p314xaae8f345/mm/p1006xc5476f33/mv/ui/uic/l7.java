package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class l7 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm3.u f232813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 f232814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f232816g;

    public l7(fm3.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var, java.lang.String str, r45.hf2 hf2Var) {
        this.f232813d = uVar;
        this.f232814e = q7Var;
        this.f232815f = str;
        this.f232816g = hf2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003a, code lost:
    
        if ((r2.m76784x5db1b11() != 0) != false) goto L23;
     */
    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo9729x757c998b(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            r2 = r17
            if (r2 != r1) goto Le1
            r2 = -1
            r3 = r18
            if (r3 != r2) goto Le1
            java.lang.String r2 = "musicMv"
            fm3.u r3 = r0.f232813d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r2)
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r3.f345670q
            r4 = 0
            r5 = 0
            r7 = 0
            if (r2 == 0) goto L2c
            long r8 = r2.m76784x5db1b11()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L25
            r8 = r1
            goto L26
        L25:
            r8 = r4
        L26:
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r2 = r7
        L2a:
            if (r2 != 0) goto L3c
        L2c:
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r3.f345673t
            if (r2 == 0) goto L3d
            long r8 = r2.m76784x5db1b11()
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 == 0) goto L39
            goto L3a
        L39:
            r1 = r4
        L3a:
            if (r1 == 0) goto L3d
        L3c:
            r7 = r2
        L3d:
            if (r7 == 0) goto Le1
            r45.hf2 r10 = r0.f232816g
            fm3.u r11 = r0.f232813d
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.util.Pair r2 = new android.util.Pair
            long r5 = r7.m76784x5db1b11()
            java.lang.String r3 = pm0.v.u(r5)
            java.lang.String r5 = r7.m76803x6c285d75()
            java.lang.String r6 = ""
            if (r5 != 0) goto L5b
            r5 = r6
        L5b:
            r2.<init>(r3, r5)
            r1.add(r2)
            java.lang.Class<zy2.pa> r2 = zy2.pa.class
            i95.m r2 = i95.n0.c(r2)
            zy2.pa r2 = (zy2.pa) r2
            c61.w8 r2 = (c61.w8) r2
            r2.nj(r1, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "share mv success "
            r1.<init>(r2)
            long r2 = r7.m76784x5db1b11()
            java.lang.String r2 = pm0.v.u(r2)
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r2 = r7.m76803x6c285d75()
            if (r2 != 0) goto L8d
            goto L8e
        L8d:
            r6 = r2
        L8e:
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Mv.MusicMvShareUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            com.tencent.mm.plugin.mv.ui.uic.q7 r1 = r0.f232814e
            com.tencent.mm.plugin.mv.ui.uic.g8 r2 = r1.f232921d
            java.lang.String r9 = r0.f232815f
            if (r2 == 0) goto Lb5
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "toUser"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r5)
            r5 = 3
            java.lang.String r6 = "2"
            r7 = 10
            r8 = r9
            r2.a(r3, r5, r6, r7, r8)
        Lb5:
            java.lang.String r2 = "SendMsgUsernames"
            r3 = r19
            java.util.ArrayList r2 = r3.getStringArrayListExtra(r2)
            java.lang.String r3 = ";"
            java.lang.String r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(r2, r3)
            java.lang.Class<com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class
            i95.m r2 = i95.n0.c(r2)
            com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) r2
            b95.j r2 = r2.Ai()
            r2.g(r9)
            fm3.j0 r8 = fm3.j0.f345611a
            android.app.Activity r9 = r1.m80379x76847179()
            r12 = 2
            r13 = 2
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r14)
            r15 = 2
            r8.m(r9, r10, r11, r12, r13, r14, r15)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l7.mo9729x757c998b(int, int, android.content.Intent):void");
    }
}
