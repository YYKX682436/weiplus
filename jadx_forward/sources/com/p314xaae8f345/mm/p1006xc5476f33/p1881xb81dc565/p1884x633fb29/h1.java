package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.i1 f231524d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.i1 i1Var) {
        this.f231524d = i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.StringBuilder] */
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.i1 i1Var = this.f231524d;
        if (i1Var.f231533d.f231709s == sj3.e4.Talking) {
            sj3.d4 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = i1Var.f231533d;
            int i17 = v0Var.f231714x;
            sj3.q3 q3Var = Zi.f490008d;
            if (q3Var != null) {
                java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60)}, 2));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                q3Var.l(format);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            i4Var.getClass();
            byte[] bArr = new byte[4];
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120006x7ba2c63b(54, bArr, 1);
            int i18 = 0;
            if (bArr[0] > 0) {
                i4Var.f231181t++;
                if (v0Var.C != null) {
                    if (!v0Var.f231704p && gq4.v.Ni()) {
                        v0Var.f231704p = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "onNetWorkChangeToMobileNet");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z zVar = v0Var.C;
                        if (zVar != null) {
                            zVar.p();
                        }
                    }
                    v0Var.getClass();
                    if (gq4.v.Ni()) {
                        v0Var.f231704p = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "onNetWorkCostMax");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z zVar2 = v0Var.C;
                        if (zVar2 != null) {
                            zVar2.k();
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z zVar3 = v0Var.C;
            if (zVar3 != null) {
                zVar3.Z3();
            }
            int l17 = wh.m.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
            byte[] array = allocate.order(byteOrder).putInt(l17).array();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(85, array, array.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "batTemp = " + l17);
            int i19 = wh.m.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            byte[] array2 = java.nio.ByteBuffer.allocate(4).order(byteOrder).putInt(i19).array();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(86, array2, array2.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "batQuan = " + i19);
            android.os.PowerManager powerManager = (android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
            ?? isPowerSaveMode = powerManager != null ? powerManager.isPowerSaveMode() : 0;
            byte[] array3 = java.nio.ByteBuffer.allocate(4).order(byteOrder).putInt(isPowerSaveMode).array();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(87, array3, array3.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "lowBat = " + isPowerSaveMode);
            byte[] array4 = java.nio.ByteBuffer.allocate(4).order(byteOrder).putInt(ph.t.k().c().d() ? 1 : 0).array();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(96, array4, array4.length);
            int[] p17 = wh.m.p();
            int[] c17 = wo.r.c();
            float d17 = 1.0f / wo.t.d();
            if (p17.length > 0 && c17.length > 0) {
                float f17 = 0.0f;
                while (i18 < p17.length) {
                    try {
                        f17 += ((100.0f * d17) * p17[i18]) / c17[i18];
                    } catch (java.lang.Exception unused) {
                    }
                    i18++;
                }
                i18 = (int) f17;
            }
            byte[] array5 = java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(i18).array();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            int length = array5.length;
            i4Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(91, array5, length);
        }
    }
}
