package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class})
/* renamed from: com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation */
/* loaded from: classes11.dex */
public class C16508x1e702dd3 extends i95.w implements vg3.f4 {

    /* renamed from: d, reason: collision with root package name */
    public a95.b f230150d;

    /* renamed from: e, reason: collision with root package name */
    public b95.j f230151e;

    /* renamed from: f, reason: collision with root package name */
    public final qv1.a f230152f = new qv1.a();

    /* renamed from: g, reason: collision with root package name */
    public int f230153g = 0;

    public b95.j Ai() {
        gm0.j1.b().c();
        if (this.f230151e == null) {
            this.f230151e = new b95.j();
        }
        return this.f230151e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if ((r0 == 2) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if ((r0 == 1) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.f230153g
            r1 = 0
            if (r0 != 0) goto L6
            goto L2f
        L6:
            boolean r0 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Q4(r6)
            r2 = 1
            if (r0 == 0) goto L1b
            int r0 = r5.f230153g
            r0 = r0 & r2
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r0 != r2) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L2f
        L19:
            r1 = r2
            goto L2f
        L1b:
            boolean r0 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r6)
            if (r0 == 0) goto L2f
            int r0 = r5.f230153g
            r3 = 2
            r0 = r0 & r3
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r0 != r3) goto L2b
            r0 = r2
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L2f
            goto L19
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = "MicroMsg.TAG"
            java.lang.String r2 = "ifAddTicketByActionFlag %s %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.Bi(java.lang.String):boolean");
    }

    public void Di(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAG", "setEnSendMsgActionFlag %s", java.lang.Integer.valueOf(i17));
        this.f230153g = i17;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1.f270152b = new pq5.d() { // from class: com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.1
            @Override // pq5.d
            public a25.u get() {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2();
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.v();
        vg3.v4.a(2, vVar);
        vg3.v4.a(17, vVar);
        vg3.v4.a(4, vVar);
        vg3.v4.a(78, new eh3.d());
        vg3.v4.a(7, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a2();
        vg3.v4.a(5, a2Var);
        vg3.v4.a(8, a2Var);
        vg3.v4.a(9, a2Var);
        vg3.v4.a(1, new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a3());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gm0.j1.q(rv1.f.class, this.f230152f);
            com.p314xaae8f345.mm.p642xad8b531f.l lVar = com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.f144767v;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("msg_receive_number");
            long j17 = M.getLong("recv_num", 0L);
            long j18 = M.getLong("send_num", 0L);
            long j19 = j17 - j18;
            if (j19 > 0) {
                M.putLong("send_num", 1 + j17);
                jx3.f.INSTANCE.d(19779, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "checkSyncNum() why?????? diffValue:%s recvNum:%s sendNum:%s", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "checkSyncNum() no problem");
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            ((ku5.t0) ku5.t0.f394148d).h(new bh3.a(context), "MicroMsg.CheckContactService");
        }
    }

    public a95.b wi() {
        gm0.j1.b().c();
        if (this.f230150d == null) {
            gm0.j1.i();
            this.f230150d = new a95.b(gm0.j1.u().f354686f);
        }
        return this.f230150d;
    }
}
