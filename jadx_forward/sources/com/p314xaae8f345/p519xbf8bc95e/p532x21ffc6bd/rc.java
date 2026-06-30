package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rc implements com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f132675a = 128;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f132676b;

    public rc(java.lang.String str) {
        this.f132676b = str;
    }

    private static byte[] a(int i17) {
        return new byte[]{(byte) (i17 & 255), (byte) ((65280 & i17) >> 8), (byte) ((16711680 & i17) >> 16), (byte) ((i17 & (-16777216)) >> 24)};
    }

    private static int b(byte[] bArr) {
        return ((bArr[3] << 24) & (-16777216)) | (bArr[0] & 255) | ((bArr[1] << 8) & 65280) | ((bArr[2] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) & 16711680);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a
    public final java.io.File a(java.lang.String str, java.lang.String str2, byte[] bArr) {
        if (android.text.TextUtils.isEmpty(this.f132676b)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(java.io.File.separatorChar);
        if (lastIndexOf >= 0) {
            java.lang.String substring = str.substring(0, lastIndexOf);
            if (!android.text.TextUtils.isEmpty(substring)) {
                str2 = str2 + java.io.File.separator + substring;
            }
            str = str.substring(lastIndexOf + 1);
        }
        int[] a17 = a(str);
        if (a17 == null) {
            return new java.io.File(str2, str);
        }
        java.lang.String str3 = str2 + a(a17[0], a17[1], a17[2]);
        if (!a(str3, a17[0], a17[1], bArr)) {
            return new java.io.File(str2, str);
        }
        return new java.io.File(str3 + ".dat");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a
    public final byte[] a(java.lang.String str, java.io.File file) {
        java.lang.String str2 = this.f132676b;
        int lastIndexOf = str.lastIndexOf(java.io.File.separatorChar);
        if (lastIndexOf >= 0) {
            java.lang.String substring = str.substring(0, lastIndexOf);
            if (!android.text.TextUtils.isEmpty(substring)) {
                str2 = str2 + java.io.File.separator + substring;
            }
            str = str.substring(lastIndexOf + 1);
        }
        int[] a17 = a(str);
        if (a17 == null) {
            return null;
        }
        return a(str2 + a(a17[0], a17[1], a17[2]), a17[0], a17[1]);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a
    public final boolean a(java.io.File file) {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(new java.io.File(this.f132676b));
    }

    private static int[] a(java.lang.String str) {
        java.lang.String[] split = str.split("-");
        if (split.length < 3) {
            return null;
        }
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < 3; i17++) {
            try {
                iArr[i17] = java.lang.Integer.parseInt(split[i17]);
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(android.util.Log.getStackTraceString(e17));
                return null;
            }
        }
        return iArr;
    }

    private static boolean a(java.lang.String str, int i17, int i18, byte[] bArr) {
        int length;
        java.io.RandomAccessFile randomAccessFile;
        long j17;
        long j18;
        if (bArr == null || (length = bArr.length) <= 0) {
            return false;
        }
        java.lang.String[] strArr = {str + ".idx", str + ".dat"};
        java.io.File file = new java.io.File(strArr[1]);
        if (!file.exists() && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file)) {
            return false;
        }
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(file, "rws");
        } catch (java.lang.Exception unused) {
            randomAccessFile = null;
        }
        if (randomAccessFile == null) {
            return false;
        }
        byte[] a17 = a(length);
        a(a17);
        try {
            try {
                j17 = randomAccessFile.length();
                try {
                    randomAccessFile.seek(j17);
                    randomAccessFile.write(a17);
                    randomAccessFile.write(bArr);
                } catch (java.lang.Exception unused2) {
                }
            } catch (java.lang.Exception unused3) {
                j17 = 0;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(randomAccessFile);
            java.io.File file2 = new java.io.File(strArr[0]);
            if (!file2.exists() && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file2)) {
                return false;
            }
            try {
                randomAccessFile2 = new java.io.RandomAccessFile(file2, "rws");
            } catch (java.lang.Exception unused4) {
            }
            if (randomAccessFile == null) {
                return false;
            }
            try {
                j18 = randomAccessFile.length();
            } catch (java.lang.Exception unused5) {
                j18 = 0;
            }
            if (j18 == 0) {
                byte[] bArr2 = new byte[65536];
                java.util.Arrays.fill(bArr2, (byte) -1);
                try {
                    randomAccessFile.write(bArr2);
                } catch (java.lang.Exception unused6) {
                }
            }
            long a18 = a(i17, i18);
            if (a18 < 0) {
                return false;
            }
            try {
                randomAccessFile.seek(a18 * 4);
            } catch (java.lang.Exception unused7) {
            }
            byte[] a19 = a((int) j17);
            a(a19);
            try {
                randomAccessFile.write(a19);
            } catch (java.lang.Exception unused8) {
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
            return true;
        } finally {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(randomAccessFile);
        }
    }

    private static byte[] a(java.lang.String str, int i17, int i18) {
        java.io.RandomAccessFile randomAccessFile;
        java.io.RandomAccessFile randomAccessFile2;
        java.lang.String[] strArr = {str + ".idx", str + ".dat"};
        java.io.File file = new java.io.File(strArr[0]);
        java.io.RandomAccessFile randomAccessFile3 = null;
        if (file.exists() && file.length() != 0) {
            long a17 = a(i17, i18);
            if (a17 < 0) {
                return null;
            }
            byte[] bArr = new byte[4];
            try {
                randomAccessFile = new java.io.RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(a17 * 4);
                    randomAccessFile.read(bArr, 0, 4);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(randomAccessFile);
                    a(bArr);
                    int b17 = b(bArr);
                    if (b17 < 0) {
                        return null;
                    }
                    java.io.File file2 = new java.io.File(strArr[1]);
                    if (!file2.exists()) {
                        return null;
                    }
                    try {
                        randomAccessFile2 = new java.io.RandomAccessFile(file2, "r");
                        try {
                            randomAccessFile2.seek(b17);
                            randomAccessFile2.read(bArr, 0, 4);
                            a(bArr);
                            int b18 = b(bArr);
                            if (b18 <= 0) {
                                return null;
                            }
                            try {
                                byte[] bArr2 = new byte[b18];
                                randomAccessFile2.read(bArr2, 0, b18);
                                return bArr2;
                            } catch (java.lang.Throwable th6) {
                                try {
                                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c("读取瓦片缓存的大小异常", th6);
                                    return null;
                                } finally {
                                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(randomAccessFile2);
                                }
                            }
                        } catch (java.lang.Exception unused) {
                            return null;
                        }
                    } catch (java.lang.Exception unused2) {
                        randomAccessFile2 = null;
                    }
                } catch (java.lang.Exception unused3) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(randomAccessFile);
                    return null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    randomAccessFile3 = randomAccessFile;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(randomAccessFile3);
                    throw th;
                }
            } catch (java.lang.Exception unused4) {
                randomAccessFile = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        }
        return null;
    }

    private static java.lang.String a(int i17, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i27 = i17 / 128;
        int i28 = i18 / 128;
        sb6.append(java.io.File.separatorChar);
        sb6.append("glGrid");
        sb6.append(java.io.File.separatorChar);
        sb6.append(i19);
        sb6.append(java.io.File.separatorChar);
        sb6.append(i27 / 10);
        sb6.append(java.io.File.separatorChar);
        sb6.append(i28 / 10);
        sb6.append(java.io.File.separatorChar);
        sb6.append(i19);
        sb6.append("_");
        sb6.append(i27);
        sb6.append("_");
        sb6.append(i28);
        return sb6.toString();
    }

    private static void a(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            return;
        }
        byte b17 = bArr[0];
        bArr[0] = bArr[3];
        bArr[3] = b17;
        byte b18 = bArr[1];
        bArr[1] = bArr[2];
        bArr[2] = b18;
    }

    private static long a(int i17, int i18) {
        return ((i17 % 128) * 128) + (i18 % 128);
    }
}
