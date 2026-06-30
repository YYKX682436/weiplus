package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public abstract class y1 {
    public static java.lang.String a(int i17) {
        java.lang.String str = gm0.b0.i(i17) + "pushSyncResp";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }

    public static void b(int i17, int i18) {
        java.lang.String a17 = a(i18);
        int d17 = d(a17, i18);
        com.tencent.mm.vfs.w6.h(a17 + "/syncResp.bin" + i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "consumeData delIndex:%d, total index:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17));
        if (i17 == d17) {
            com.tencent.mm.vfs.w6.h(a17 + "/syncResp.ini");
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "consumeData: has consme all respdata");
        }
    }

    public static void c(long j17, int i17, com.tencent.mm.booter.b2 b2Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "dealWithSelector, selector = " + j17);
        if ((256 & j17) != 0) {
            com.tencent.mm.autogen.events.SnsSyncEvent snsSyncEvent = new com.tencent.mm.autogen.events.SnsSyncEvent();
            snsSyncEvent.f54843g.f8611a = 4;
            snsSyncEvent.e();
        }
        if ((2097152 & j17) != 0) {
            new com.tencent.mm.autogen.events.OpenIMSyncEvent().e();
        }
        if ((j17 & (-16777217) & (-33) & (-257) & (-2097153) & 2) != 0) {
            new w11.g0().doScene(com.tencent.mm.network.x2.c(), new com.tencent.mm.booter.a2(b2Var));
        }
    }

    public static int d(java.lang.String str, int i17) {
        byte[] N = com.tencent.mm.vfs.w6.N(str + "/syncResp.ini", 0, -1);
        if (com.tencent.mm.sdk.platformtools.t8.M0(N)) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt(new java.lang.String(N));
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public static java.lang.String e(byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            return "buf is nullOrNil";
        }
        if (bArr.length == 1) {
            return "buf.len is 1: " + java.lang.Integer.toHexString(bArr[0]);
        }
        return "buf last two[len:" + bArr.length + "]: %s, %s" + java.lang.Integer.toHexString(bArr[bArr.length - 2] & 255) + ", " + java.lang.Integer.toHexString(bArr[bArr.length - 1] & 255);
    }

    public static byte[] f(com.tencent.mm.pointers.PInt pInt, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "readFile");
        java.lang.String a17 = a(i17);
        int d17 = d(a17, i17);
        int i18 = 1;
        while (true) {
            byte[] bArr = null;
            if (i18 > d17) {
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "readFile: " + i18);
            java.lang.String str = a17 + "/syncResp.bin" + i18;
            if (com.tencent.mm.vfs.w6.j(str)) {
                byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
                if (com.tencent.mm.sdk.platformtools.t8.M0(N)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NotifySyncMgr", "readFile getdata null, read again");
                    N = com.tencent.mm.vfs.w6.N(str, 0, -1);
                }
                java.lang.String g17 = kk.k.g((wo.w0.g(true) + i17).getBytes());
                byte[] bytes = g17.getBytes();
                if (N != null && bytes != null) {
                    bArr = kk.p.a(N, bytes);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "readFile, index:[%d of %d], dump data:%s -> %s, key:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d17), e(N), e(bArr), e(g17.getBytes()));
                if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                    pInt.value = i18;
                    return bArr;
                }
            }
            i18++;
        }
    }

    public static boolean g(byte[] bArr, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "writeFile");
        java.lang.String a17 = a(i17);
        int d17 = d(a17, i17) + 1;
        java.lang.String str = a17 + "/syncResp.bin" + d17;
        java.lang.String g17 = kk.k.g((wo.w0.g(true) + i17).getBytes());
        byte[] b17 = kk.p.b(bArr, g17.getBytes());
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "writeFile %d, len:%d, resultLen:%d, file:%s, dump %s -> %s, key:%s", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(b17.length), str, e(bArr), e(b17), e(g17.getBytes()));
        if (com.tencent.mm.sdk.platformtools.t8.M0(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotifySyncMgr", "encry failed");
            return false;
        }
        int S = com.tencent.mm.vfs.w6.S(str, b17, 0, b17.length);
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        if (S != 0 || !j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotifySyncMgr", "writeFile failed:!!!!!, writeResult:%d, writedFileExit:%b", java.lang.Integer.valueOf(S), java.lang.Boolean.valueOf(j17));
            return false;
        }
        byte[] bytes = (d17 + "").getBytes();
        com.tencent.mm.vfs.w6.S(a17 + "/syncResp.ini", bytes, 0, bytes.length);
        return true;
    }
}
