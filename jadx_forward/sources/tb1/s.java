package tb1;

/* loaded from: classes7.dex */
public class s implements tb1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 f498467a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610, tb1.e eVar) {
        this.f498467a = c12042x78b65610;
    }

    public static void e(tb1.s sVar, java.lang.String str) {
        sVar.getClass();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = sVar.f498467a;
        if (K0) {
            sVar.i(-1, "record file not exist", c12042x78b65610.H, str);
            return;
        }
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        sVar.f(ai3.d.p(str), c12042x78b65610.H);
        sVar.i(0, "", c12042x78b65610.H, str);
    }

    @Override // tb1.m
    public void a(byte[] bArr, int i17, int i18) {
        boolean z17 = this.f498467a.f161714s;
    }

    @Override // tb1.m
    public void b() {
        long j17 = this.f498467a.M;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 1500) {
            j();
            return;
        }
        long j18 = 1500 - elapsedRealtime;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "stopRecord in %d ms later", java.lang.Long.valueOf(j18));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new tb1.r(this), j18);
    }

    @Override // tb1.m
    public void c(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "startRecord.");
        tb1.c cVar = tb1.b.f498422a;
        if (!cVar.f498423a || !cVar.f498424b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraMrg", "no all permission");
        }
        boolean z19 = cVar.f498423a && cVar.f498424b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498467a;
        if (!z19) {
            dp.a.m125853x26a183b(c12042x78b65610.f161701d, com.p314xaae8f345.mm.R.C30867xcad56011.gw7, 1).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "no micro phone permission");
            h(-1, "permission");
        } else if (c12042x78b65610.f161700J == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "startRecord is recording!!");
            h(-1, "is recording");
        } else {
            if (!c12042x78b65610.Q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "startRecord err, isn't init done");
                h(-1, "camera has not been initialized");
                return;
            }
            c12042x78b65610.F.g(z17, z18);
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c12042x78b65610.M = android.os.SystemClock.elapsedRealtime();
            c12042x78b65610.f161700J = 2;
            h(0, "");
            c12042x78b65610.l();
        }
    }

    @Override // tb1.m
    public void d(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "takePicture.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498467a;
        if (c12042x78b65610.F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "recordView is null");
            return;
        }
        if (c12042x78b65610.f161700J == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "takePicture is recording!!");
            return;
        }
        if (!c12042x78b65610.K) {
            long j17 = c12042x78b65610.L;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 >= 300) {
                if (!c12042x78b65610.Q) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "takePicture err, isn't init done");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.a(c12042x78b65610, -1, null, null, "camera has not been initialized");
                    return;
                } else {
                    c12042x78b65610.L = android.os.SystemClock.elapsedRealtime();
                    c12042x78b65610.K = true;
                    c12042x78b65610.f161700J = 3;
                    c12042x78b65610.F.j(new tb1.n(this, z17), "on".equals(c12042x78b65610.f161708n), z18);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "not the right time to take picture.");
    }

    public final boolean f(android.graphics.Bitmap bitmap, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498467a;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                c12042x78b65610.f161718w = bitmap.getWidth();
                c12042x78b65610.f161719x = bitmap.getHeight();
                int i17 = "normal".equals(c12042x78b65610.f161709o) ? 44 : "low".equals(c12042x78b65610.f161709o) ? 25 : "original".equals(c12042x78b65610.f161709o) ? 100 : 90;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, i17, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "bitmap filelen %s", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "mQuality:%s, quality:%d", c12042x78b65610.f161709o, java.lang.Integer.valueOf(i17));
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCameraView", "error for saveBitmapToImage %s", e17.getMessage());
            }
        }
        return false;
    }

    public final java.lang.String g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        ik1.b0 b0Var = new ik1.b0();
        if (lVar.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)), "", true, b0Var) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
            return (java.lang.String) b0Var.f373357a;
        }
        return null;
    }

    public final void h(int i17, java.lang.String str) {
        tb1.v vVar = this.f498467a.C;
        if (vVar != null) {
            tb1.q0 q0Var = ((tb1.r0) vVar).f498466a;
            if (i17 == 0) {
                q0Var.f498460e.a(q0Var.f498461f, q0Var.f498462g.o("ok"));
            } else {
                q0Var.f498460e.a(q0Var.f498461f, q0Var.f498462g.o("fail:" + str));
            }
        }
    }

    public final void i(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        long j17;
        int i18;
        int i19;
        gp.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498467a;
        if (c12042x78b65610.C != null) {
            int i27 = 0;
            if (i17 == 0) {
                int[] iArr = new int[3];
                if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                    try {
                        dVar = new gp.d();
                        try {
                            dVar.setDataSource(str3);
                            iArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0);
                            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(24), 0);
                            try {
                                if (P != 90 && P != 270) {
                                    iArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
                                    iArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
                                    dVar.release();
                                }
                                dVar.release();
                            } catch (java.io.IOException unused) {
                            }
                            iArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
                            iArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (dVar != null) {
                                try {
                                    dVar.release();
                                } catch (java.io.IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        dVar = null;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "getInfoFromMetaData file isn't exist, filename: %s", str3);
                }
                i27 = (int) java.lang.Math.round((iArr[0] * 1.0d) / 1000.0d);
                j17 = com.p314xaae8f345.mm.vfs.w6.k(str3);
                i19 = iArr[1];
                i18 = iArr[2];
            } else {
                j17 = 0;
                i18 = 0;
                i19 = 0;
            }
            tb1.v vVar = c12042x78b65610.C;
            java.lang.String g17 = g(c12042x78b65610.f161702e, str2);
            java.lang.String g18 = g(c12042x78b65610.f161702e, str3);
            tb1.q0 q0Var = ((tb1.r0) vVar).f498466a;
            if (i17 == 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempThumbPath", g17);
                hashMap.put("tempVideoPath", g18);
                hashMap.put("duration", java.lang.Integer.valueOf(i27));
                hashMap.put("size", java.lang.Long.valueOf(j17));
                hashMap.put("height", java.lang.Integer.valueOf(i18));
                hashMap.put("width", java.lang.Integer.valueOf(i19));
                q0Var.f498460e.a(q0Var.f498461f, q0Var.f498462g.p("ok", hashMap));
            } else {
                q0Var.f498460e.a(q0Var.f498461f, q0Var.f498462g.o("fail:" + str));
            }
        }
        c12042x78b65610.l();
    }

    @Override // tb1.m
    /* renamed from: init */
    public void mo166109x316510() {
    }

    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498467a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = c12042x78b65610.F;
        if (c16529x1336da53 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "recordView is null");
            i(-1, "camera is null", null, null);
        } else if (c12042x78b65610.f161700J != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "stopRecord is not recording!!");
            i(-1, "is not recording", null, null);
        } else if (c12042x78b65610.f161715t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "recordView is IsStopping");
            i(-1, "is stopping", null, null);
        } else {
            c12042x78b65610.f161715t = true;
            c16529x1336da53.h(new tb1.o(this));
        }
    }

    @Override // tb1.m
    /* renamed from: release */
    public void mo166110x41012807() {
    }
}
