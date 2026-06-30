package uj3;

/* loaded from: classes14.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f509874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f509875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f509876f;

    public r0(yj3.g gVar, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        this.f509874d = byteBuffer;
        this.f509875e = i17;
        this.f509876f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.nio.ByteBuffer byteBuffer = this.f509874d;
        int i17 = this.f509875e;
        int i18 = this.f509876f;
        boolean z17 = false;
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.capacity()];
        byteBuffer.get(bArr);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r3) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().r()).a(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r3 r3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r3) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().r();
        synchronized (r3Var) {
            if (r3Var.f231642b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video soft");
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.D(bArr, i17, i18, 132);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.g0 g0Var = r3Var.f231641a;
                if (g0Var != null) {
                    g0Var.c();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anlingao[multi_hw] cRsvd1: ");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.f0 f0Var = g0Var.f231515w;
                    sb6.append((int) f0Var.f231481c);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiAvcEncoder[HWEnc]", sb6.toString());
                    if (!((f0Var.f231481c & 1) == 1)) {
                        g0Var = null;
                    }
                    if (g0Var != null) {
                        boolean z18 = g0Var.b(bArr, i17, i18, 4) >= 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video hw, success: " + z18);
                        if (!z18) {
                            g0Var.a(8, true, false, true);
                            r3Var.f231641a = null;
                        }
                        if (z18) {
                            z17 = true;
                        }
                    }
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video soft");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.D(bArr, i17, i18, 132);
                }
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().B() && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(3, true);
            }
        }
    }
}
