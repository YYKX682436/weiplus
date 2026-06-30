package w21;

/* loaded from: classes12.dex */
public abstract class v0 {
    public static int a(java.lang.String str) {
        int C;
        if (str == null) {
            return 0;
        }
        iz5.a.g(null, str.length() >= 0);
        if (new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)).m() && ((int) r1.C()) - 6 > 0) {
            return C;
        }
        return 0;
    }

    public static int b(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return -1;
        }
        if (g(bm5.y.f104290j, str, 0, z17)) {
            return 0;
        }
        return h(str, 0, z17) ? 2 : 1;
    }

    public static int c(java.lang.String str) {
        int C;
        iz5.a.g(null, str.length() >= 0);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m() && (C = (int) r6Var.C()) > 0) {
            return C;
        }
        return 0;
    }

    public static int d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        java.lang.String yj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(f9Var, str, false);
        int b17 = b(yj6, true);
        return b17 != 0 ? b17 != 1 ? b17 != 2 ? a(yj6) : c(yj6) : f(yj6) : a(yj6);
    }

    public static int e(oi3.g gVar, java.lang.String str) {
        java.lang.String vj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104289i.d(gVar, bm5.f0.f104106u), str, false);
        int b17 = b(vj6, true);
        return b17 != 0 ? b17 != 1 ? b17 != 2 ? a(vj6) : c(vj6) : f(vj6) : a(vj6);
    }

    public static int f(java.lang.String str) {
        int C;
        iz5.a.g(null, str.length() >= 0);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m() && (C = (int) r6Var.C()) > 0) {
            return C;
        }
        return 0;
    }

    public static boolean g(bm5.y yVar, java.lang.String str, int i17, boolean z17) {
        byte[] bArr;
        java.io.RandomAccessFile randomAccessFile = null;
        if (!z17) {
            str = i17 == 0 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(yVar, str, false) : null;
        }
        try {
            try {
                randomAccessFile = com.p314xaae8f345.mm.vfs.w6.B(str, false);
                bArr = new byte[6];
            } catch (java.io.FileNotFoundException unused) {
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoiceFile", e17, "", new java.lang.Object[0]);
            }
            if (randomAccessFile.read(bArr, 0, 6) == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceFile", "read amr file header failed!");
                return false;
            }
            java.lang.String str2 = new java.lang.String(bArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceFile", "isAmrHeader voice file headHex:|%s| headStr:|%s| AmrFileOperator.AMR_NB_HEAD:|%s|", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr), str2, "#!AMR\n");
            if (str2.endsWith("#!AMR\n")) {
                return true;
            }
            return false;
        } finally {
            com.p314xaae8f345.mm.vfs.e8.d(null);
        }
    }

    public static boolean h(java.lang.String str, int i17, boolean z17) {
        byte[] bArr;
        java.io.RandomAccessFile randomAccessFile = null;
        if (!z17) {
            if (i17 == 0) {
                str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, str, false);
            } else {
                if (i17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceFile", "isSilkHeader usertype error, TYPE_RECOGNIZER_BIZ fileName:%s", str);
                    return false;
                }
                str = null;
            }
        }
        try {
            randomAccessFile = com.p314xaae8f345.mm.vfs.w6.B(str, false);
            bArr = new byte[9];
            randomAccessFile.seek(1L);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.vfs.e8.d(randomAccessFile);
            throw th6;
        }
        if (randomAccessFile.read(bArr, 0, 9) == -1) {
            com.p314xaae8f345.mm.vfs.e8.d(randomAccessFile);
            return false;
        }
        java.lang.String str2 = new java.lang.String(bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceFile", "isSilkHeader voice file headHex:|%s| headStr:|%s| AmrFileOperator.AMR_NB_HEAD:|%s|", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr), str2, "#!SILK_V3");
        if (str2.endsWith("#!SILK_V3")) {
            com.p314xaae8f345.mm.vfs.e8.d(randomAccessFile);
            return true;
        }
        com.p314xaae8f345.mm.vfs.e8.d(randomAccessFile);
        return false;
    }
}
