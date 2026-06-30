package jz3;

/* loaded from: classes13.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5293xffeacd85 c5293xffeacd85 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5293xffeacd85) abstractC20979x809547d1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5293xffeacd85.f135613g.f89401a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DECODE_QRCODE_IN_IMAGE_HANDLER", "[-] img path is null or empty.");
            c5293xffeacd85.f135614h.f89510a = null;
        } else {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            java.lang.String[][] strArr = {null};
            jz3.c cVar = new jz3.c(this, strArr, countDownLatch);
            kd0.b3 b3Var = new kd0.b3();
            b3Var.f388137a = java.lang.System.currentTimeMillis();
            b3Var.f388138b = c5293xffeacd85.f135613g.f89401a;
            b3Var.f388140d = new int[]{0};
            zs5.u0.f557018h.b(b3Var, cVar);
            try {
                countDownLatch.await(5L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DECODE_QRCODE_IN_IMAGE_HANDLER", th6, "[-] Timeout when wait for decoding.", new java.lang.Object[0]);
                am.t3 t3Var = c5293xffeacd85.f135614h;
                t3Var.f89510a = new java.lang.String[]{"<timeout>"};
                t3Var.f89511b = true;
            }
            synchronized (strArr) {
                java.lang.String[] strArr2 = strArr[0];
                if (strArr2 == null || strArr2.length <= 0) {
                    c5293xffeacd85.f135614h.f89510a = null;
                } else {
                    c5293xffeacd85.f135614h.f89510a = strArr2;
                }
            }
        }
        return false;
    }
}
