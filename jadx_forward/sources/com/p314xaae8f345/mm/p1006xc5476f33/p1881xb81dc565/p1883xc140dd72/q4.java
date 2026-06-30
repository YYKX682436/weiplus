package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public abstract class q4 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f231285d = new byte[1];

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s4 f231286e;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s4 s4Var) {
        this.f231286e = s4Var;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "iLinkVideoMgr.DecodeTimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s4 s4Var = this.f231286e;
        while (true) {
            try {
                synchronized (s4Var) {
                    z17 = s4Var.f231321f;
                }
                if (!z17) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
                byte[] bArr = this.f231285d;
                i4Var.getClass();
                com.p314xaae8f345.p3206x37e841.C27805xcbec6898 c27805xcbec6898 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c;
                int m119988x6c3b2a61 = c27805xcbec6898.m119988x6c3b2a61(bArr, 0);
                int i17 = c27805xcbec6898.f60768x7eac799e;
                int i18 = c27805xcbec6898.f60767x77d6cfdf;
                int i19 = c27805xcbec6898.f60770x3e81380e;
                int i27 = c27805xcbec6898.f60769x8060c952;
                if (m119988x6c3b2a61 != -100) {
                    int i28 = s4Var.f231317b + 1;
                    s4Var.f231317b = i28;
                    if (i28 % 100 == 0) {
                        int length = this.f231285d.length;
                    }
                    if (m119988x6c3b2a61 > 0 && i17 > 0 && i18 > 0 && i19 > 0) {
                        if (i27 >= 0) {
                            java.lang.String d17 = s4Var.f231316a.d(i27);
                            int[] E = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t4.E(this.f231285d, i17);
                            if (d17 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().q().c(d17, E, i19, i18, 0, 90);
                            }
                        }
                    }
                    return;
                }
                int i29 = i19 * i18 * 4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkVideoMgr", "realloc buffer, new size: " + i29);
                this.f231285d = new byte[i29];
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkVideoMgr", e17, "timer task crash", new java.lang.Object[0]);
                return;
            }
        }
    }
}
