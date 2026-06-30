package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public abstract class p4 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f231275d = new byte[1];

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s4 f231276e;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s4 s4Var) {
        this.f231276e = s4Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        boolean z17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s4 s4Var = this.f231276e;
        while (true) {
            try {
                synchronized (s4Var) {
                    z17 = s4Var.f231321f;
                }
                if (!z17) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
                byte[] bArr = this.f231275d;
                i4Var.getClass();
                com.p314xaae8f345.p3206x37e841.C27805xcbec6898 c27805xcbec6898 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c;
                int m119988x6c3b2a61 = c27805xcbec6898.m119988x6c3b2a61(bArr, 128);
                int i18 = c27805xcbec6898.f60773x1108aed2;
                int i19 = c27805xcbec6898.f60772xa330513;
                int i27 = c27805xcbec6898.f60775x19ef8c5a;
                int i28 = c27805xcbec6898.f60774x12bcfe86;
                if (m119988x6c3b2a61 != -100) {
                    int i29 = c27805xcbec6898.f60771x75a6be3;
                    if ((i29 & 256) == 0) {
                        int i37 = (i29 & 512) != 0 ? 2 : 1;
                        if ((i29 & 1024) != 0) {
                            i37 += 2;
                        }
                        i17 = i37;
                    } else {
                        i17 = 1;
                    }
                    int i38 = s4Var.f231318c + 1;
                    s4Var.f231318c = i38;
                    if (i38 % 100 == 0) {
                        int length = this.f231275d.length;
                    }
                    if (m119988x6c3b2a61 > 0 && i18 > 0) {
                        if (i28 >= 0) {
                            java.lang.String d17 = s4Var.f231316a.d(i28);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkVideoMgr", "yuemwang: nGetVideoData mid : " + i28 + " user: " + d17 + "  size:" + i27 + "x" + i19);
                            boolean z18 = m119988x6c3b2a61 == 1 && i27 == 0 && i19 < 3;
                            if (d17 != null) {
                                if (z18) {
                                    zj3.i.f554861a.b(2);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().q().b(d17, this.f231275d, i27, i19, 0, i17);
                                } else if (i27 > 480) {
                                    zj3.i.f554861a.b(1);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().q().a(d17, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t4.E(this.f231275d, i18), i27, i19, 0, i17);
                                } else {
                                    int[] E = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t4.E(this.f231275d, i18);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p3 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().q();
                                    int i39 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                                    q17.c(d17, E, i27, i19, 0, 4);
                                }
                            }
                        }
                    }
                    return;
                }
                int i47 = i27 * i19 * 4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkVideoMgr", "realloc buffer, new size: " + i47);
                this.f231275d = new byte[i47];
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkVideoMgr", e17, "timer task crash", new java.lang.Object[0]);
                return;
            }
        }
    }
}
