package d61;

/* loaded from: classes14.dex */
public abstract class c {
    public static boolean a(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
                byte[] bArr = new byte[8];
                if (inputStream.read(bArr, 0, 8) < 8) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomUtil", e17, "", new java.lang.Object[0]);
                    }
                    return false;
                }
                int e18 = e(bArr, 0);
                if (e(bArr, 4) != d61.a.f308222e || e18 <= 0) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomUtil", e19, "", new java.lang.Object[0]);
                    }
                    return false;
                }
                try {
                    inputStream.close();
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomUtil", e27, "", new java.lang.Object[0]);
                }
                return true;
            } catch (java.lang.Throwable th6) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e28) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomUtil", e28, "", new java.lang.Object[0]);
                    }
                }
                throw th6;
            }
        } catch (java.lang.Exception e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomUtil", e29, "", new java.lang.Object[0]);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e37) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomUtil", e37, "", new java.lang.Object[0]);
                }
            }
            return false;
        }
    }

    public static d61.a b(java.io.RandomAccessFile randomAccessFile, byte[] bArr, int i17) {
        d61.a aVar = null;
        try {
            int read = randomAccessFile.read(bArr);
            while (read >= 8) {
                int e17 = e(bArr, 0);
                int e18 = e(bArr, 4);
                if (e18 == i17) {
                    aVar = d61.h.a(e17, e18, randomAccessFile.getFilePointer() - read, 0L);
                    return aVar;
                }
                if (e18 != d61.a.f308223f && e18 != d61.a.f308227j) {
                    if (!h(randomAccessFile, e17 - 8)) {
                        return null;
                    }
                    read = randomAccessFile.read(bArr);
                }
                read = randomAccessFile.read(bArr);
            }
            return null;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomUtil", e19, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AtomUtil", "find Atom error: " + e19.toString());
            return aVar;
        }
    }

    public static d61.a c(java.io.RandomAccessFile randomAccessFile, byte[] bArr, int i17, long j17) {
        d61.a aVar = null;
        try {
            int read = randomAccessFile.read(bArr);
            int i18 = read;
            while (read >= 8) {
                if (j17 > 0 && j17 <= i18) {
                    return null;
                }
                int e17 = e(bArr, 0);
                int e18 = e(bArr, 4);
                if (e18 == i17) {
                    aVar = d61.h.a(e17, e18, randomAccessFile.getFilePointer() - read, 0L);
                    return aVar;
                }
                if (e18 != d61.a.f308223f && e18 != d61.a.f308227j) {
                    int i19 = e17 - 8;
                    if (!h(randomAccessFile, i19)) {
                        return null;
                    }
                    i18 += i19;
                    read = randomAccessFile.read(bArr);
                    i18 += read;
                }
                read = randomAccessFile.read(bArr);
                i18 += read;
            }
            return null;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomUtil", e19, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AtomUtil", "find Atom error: " + e19.toString());
            return aVar;
        }
    }

    public static int d(java.lang.String str) {
        int length = str.length();
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            i17 = (i17 << 8) | str.charAt(i18);
        }
        return i17;
    }

    public static int e(byte[] bArr, int i17) {
        int i18 = i17 + 1;
        int i19 = i18 + 1;
        int i27 = ((bArr[i17] & 255) << 24) | ((bArr[i18] & 255) << 16);
        int i28 = i19 + 1;
        return (bArr[i28] & 255) | i27 | ((bArr[i19] & 255) << 8);
    }

    public static long f(byte[] bArr, int i17) {
        long j17 = (bArr[i17] & 255) << 56;
        int i18 = i17 + 1 + 1 + 1;
        long j18 = j17 | ((bArr[r0] & 255) << 48) | ((bArr[r8] & 255) << 40);
        long j19 = j18 | ((bArr[i18] & 255) << 32);
        long j27 = j19 | ((bArr[r8] & 255) << 24);
        long j28 = j27 | ((bArr[r2] & 255) << 16);
        int i19 = i18 + 1 + 1 + 1 + 1;
        return (bArr[i19] & 255) | j28 | ((bArr[r8] & 255) << 8);
    }

    public static long g(byte[] bArr, int i17) {
        byte[] bArr2 = new byte[8];
        java.util.Arrays.fill(bArr2, (byte) 0);
        java.lang.System.arraycopy(bArr, i17, bArr2, 4, 4);
        return f(bArr2, 0);
    }

    public static boolean h(java.io.RandomAccessFile randomAccessFile, long j17) {
        long j18 = 0;
        while (j17 > 2147483647L) {
            j18 += randomAccessFile.skipBytes(Integer.MAX_VALUE);
            j17 -= 2147483647L;
        }
        return j18 + ((long) randomAccessFile.skipBytes((int) j17)) == j17;
    }
}
