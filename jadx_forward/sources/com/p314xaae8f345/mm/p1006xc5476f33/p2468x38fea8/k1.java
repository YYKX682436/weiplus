package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* loaded from: classes12.dex */
public final class k1 extends pq5.c implements a25.r {
    @Override // a25.r
    public void g(final com.p314xaae8f345.mm.p642xad8b531f.y0 y0Var, final int i17, final byte[] bArr, final byte[] bArr2, final r45.cx4 cx4Var) {
        w(new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.l1(this, y0Var, i17, bArr, bArr2, cx4Var));
        fs.g.b(a25.t.class, new fs.o(y0Var, i17, bArr, bArr2, cx4Var) { // from class: com.tencent.mm.plugin.zero.k1$$a

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f270178a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ byte[] f270179b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ byte[] f270180c;

            {
                this.f270178a = i17;
                this.f270179b = bArr;
                this.f270180c = bArr2;
            }

            @Override // fs.o
            public final boolean a(fs.n nVar) {
                final int i18 = this.f270178a;
                final byte[] bArr3 = this.f270179b;
                final byte[] bArr4 = this.f270180c;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.q2) ((a25.t) nVar);
                q2Var.getClass();
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.messenger.foundation.q2$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte[] bArr5;
                        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
                        byte[] bArr6 = bArr4;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.q2.this.getClass();
                        if (i18 == 321 && (bArr5 = bArr3) != null) {
                            r45.jy5 jy5Var = new r45.jy5();
                            try {
                                jy5Var.mo11468x92b714fd(bArr5);
                                byte[] bArr7 = jy5Var.f459751d.f273689a;
                                if (jy5Var.f459752e != null) {
                                    r45.o1 o1Var = new r45.o1();
                                    o1Var.mo11468x92b714fd(jy5Var.f459752e.f273689a);
                                    if (o1Var.f463341d) {
                                        r45.p1 p1Var = o1Var.f463342e;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecurityNotifyReceiverCallback", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData[%d, %d, %d, %d, %d, %d]", java.lang.Integer.valueOf(p1Var.f464185e), java.lang.Integer.valueOf(p1Var.f464186f), java.lang.Integer.valueOf(p1Var.f464187g), java.lang.Integer.valueOf(p1Var.f464188h), java.lang.Integer.valueOf(p1Var.f464189i), java.lang.Integer.valueOf(p1Var.f464190m));
                                        int i19 = p1Var.f464185e;
                                        if (i19 == 13) {
                                            gm0.j1.i();
                                            byte[] c17 = gm0.j1.n().c(3);
                                            bArr7 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46285x1906568c(c17, bArr7);
                                            java.lang.Object[] objArr = new java.lang.Object[2];
                                            int i27 = -1;
                                            objArr[0] = java.lang.Integer.valueOf(c17 == null ? -1 : c17.length);
                                            if (bArr7 != null) {
                                                i27 = bArr7.length;
                                            }
                                            objArr[1] = java.lang.Integer.valueOf(i27);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecurityNotifyReceiverCallback", "summerbadcr MM_PKT_SILENCE_NOTIFY AES_GCM_ENCRYPT serverSession[%s] data[%s]", objArr);
                                        } else {
                                            bArr7 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75983x2e40f778(bArr6, i19, p1Var.f464186f, p1Var.f464187g, p1Var.f464188h, p1Var.f464189i, p1Var.f464190m, p1Var.f464191n, bArr7);
                                        }
                                    }
                                }
                                r45.yw4 yw4Var = new r45.yw4();
                                yw4Var.mo11468x92b714fd(bArr7);
                                vg3.w3 w3Var = (vg3.w3) i95.n0.c(vg3.w3.class);
                                com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = new com.p314xaae8f345.mm.p944x882e457a.p0(yw4Var.f472983d, null);
                                pq5.d dVar = vg3.b5.f518183b;
                                vg3.z4 z4Var = dVar != null ? (vg3.z4) dVar.get() : null;
                                if (z4Var == null) {
                                    z4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u2();
                                }
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.b2) w3Var).getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a2.b(p0Var, com.p314xaae8f345.mm.p642xad8b531f.x1.e(), z4Var);
                                gm0.j1.d().f152297d.mo48026x708d4848("", jy5Var.f459753f, com.p314xaae8f345.p542x3306d5.mm.C4570x8916ee5.f19472x92a76f9b);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecurityNotifyReceiverCallback", "deal succ, taskid:%d", java.lang.Long.valueOf(jy5Var.f459753f));
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SecurityNotifyReceiverCallback", e17, "taskid:%d", java.lang.Long.valueOf(jy5Var.f459753f));
                                com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                                if (d17 == null || (sVar = d17.f152297d) == null) {
                                    return;
                                }
                                sVar.mo48026x708d4848("", jy5Var.f459753f, com.p314xaae8f345.p542x3306d5.mm.C4570x8916ee5.f19470xfc19f67c);
                            }
                        }
                    }
                };
                ((ku5.t0) ku5.t0.f394148d).h(runnable, w11.h2.f523583f);
                return false;
            }
        });
    }
}
