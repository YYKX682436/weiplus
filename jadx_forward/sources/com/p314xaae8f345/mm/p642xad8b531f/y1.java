package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public abstract class y1 {
    public static java.lang.String a(int i17) {
        java.lang.String str = gm0.b0.i(i17) + "pushSyncResp";
        com.p314xaae8f345.mm.vfs.w6.u(str);
        return str;
    }

    public static void b(int i17, int i18) {
        java.lang.String a17 = a(i18);
        int d17 = d(a17, i18);
        com.p314xaae8f345.mm.vfs.w6.h(a17 + "/syncResp.bin" + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "consumeData delIndex:%d, total index:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17));
        if (i17 == d17) {
            com.p314xaae8f345.mm.vfs.w6.h(a17 + "/syncResp.ini");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "consumeData: has consme all respdata");
        }
    }

    public static void c(long j17, int i17, com.p314xaae8f345.mm.p642xad8b531f.b2 b2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "dealWithSelector, selector = " + j17);
        if ((256 & j17) != 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47 c6099xc95a2e47 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47();
            c6099xc95a2e47.f136376g.f90144a = 4;
            c6099xc95a2e47.e();
        }
        if ((2097152 & j17) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5822x76918f51().e();
        }
        if ((j17 & (-16777217) & (-33) & (-257) & (-2097153) & 2) != 0) {
            new w11.g0().mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.x2.c(), new com.p314xaae8f345.mm.p642xad8b531f.a2(b2Var));
        }
    }

    public static int d(java.lang.String str, int i17) {
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str + "/syncResp.ini", 0, -1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt(new java.lang.String(N));
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public static java.lang.String e(byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            return "buf is nullOrNil";
        }
        if (bArr.length == 1) {
            return "buf.len is 1: " + java.lang.Integer.toHexString(bArr[0]);
        }
        return "buf last two[len:" + bArr.length + "]: %s, %s" + java.lang.Integer.toHexString(bArr[bArr.length - 2] & 255) + ", " + java.lang.Integer.toHexString(bArr[bArr.length - 1] & 255);
    }

    public static byte[] f(com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "readFile");
        java.lang.String a17 = a(i17);
        int d17 = d(a17, i17);
        int i18 = 1;
        while (true) {
            byte[] bArr = null;
            if (i18 > d17) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "readFile: " + i18);
            java.lang.String str = a17 + "/syncResp.bin" + i18;
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotifySyncMgr", "readFile getdata null, read again");
                    N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
                }
                java.lang.String g17 = kk.k.g((wo.w0.g(true) + i17).getBytes());
                byte[] bytes = g17.getBytes();
                if (N != null && bytes != null) {
                    bArr = kk.p.a(N, bytes);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "readFile, index:[%d of %d], dump data:%s -> %s, key:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d17), e(N), e(bArr), e(g17.getBytes()));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                    c19767x257d7f.f38864x6ac9171 = i18;
                    return bArr;
                }
            }
            i18++;
        }
    }

    public static boolean g(byte[] bArr, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "writeFile");
        java.lang.String a17 = a(i17);
        int d17 = d(a17, i17) + 1;
        java.lang.String str = a17 + "/syncResp.bin" + d17;
        java.lang.String g17 = kk.k.g((wo.w0.g(true) + i17).getBytes());
        byte[] b17 = kk.p.b(bArr, g17.getBytes());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "writeFile %d, len:%d, resultLen:%d, file:%s, dump %s -> %s, key:%s", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(b17.length), str, e(bArr), e(b17), e(g17.getBytes()));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifySyncMgr", "encry failed");
            return false;
        }
        int S = com.p314xaae8f345.mm.vfs.w6.S(str, b17, 0, b17.length);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        if (S != 0 || !j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifySyncMgr", "writeFile failed:!!!!!, writeResult:%d, writedFileExit:%b", java.lang.Integer.valueOf(S), java.lang.Boolean.valueOf(j17));
            return false;
        }
        byte[] bytes = (d17 + "").getBytes();
        com.p314xaae8f345.mm.vfs.w6.S(a17 + "/syncResp.ini", bytes, 0, bytes.length);
        return true;
    }
}
