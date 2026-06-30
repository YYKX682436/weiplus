package com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6;

/* renamed from: com.tencent.tav.core.audio.EncoderUtils */
/* loaded from: classes13.dex */
class C25695x970c115 {

    /* renamed from: FREQ_IDX */
    private static final int f47601xd3b15c56 = 4;

    /* renamed from: INDEX_START */
    public static final int f47602x1b6f9275 = 1;

    /* renamed from: PROFILE */
    private static final int f47603x185a1589 = 2;

    /* renamed from: addADTStoPacket */
    public static void m96883xbcfd61e6(byte[] bArr, int i17) {
        byte[] m96886x9f0c7a44 = m96886x9f0c7a44(bArr.length, i17);
        java.lang.System.arraycopy(m96886x9f0c7a44, 0, bArr, 0, m96886x9f0c7a44.length);
    }

    /* renamed from: close */
    public static void m96884x5a5ddf8(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: deleteAllTmpFiles */
    public static void m96885x6b6e45b6(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("EncoderUtils", "deleteAllTmpFiles " + i17 + " sessionId = " + str2);
        for (int i18 = 1; i18 <= i17; i18++) {
            java.io.File file = new java.io.File(m96887x71788c(str, i18, str2));
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("EncoderUtils", "delete file " + file.getAbsolutePath() + " deleteResult = " + file.delete());
        }
    }

    /* renamed from: generateADTSHeader */
    public static byte[] m96886x9f0c7a44(int i17, int i18) {
        return new byte[]{-1, -7, (byte) ((i18 >> 2) + 80), (byte) (((i18 & 3) << 6) + (i17 >> 11)), (byte) ((i17 & 2047) >> 3), (byte) (((i17 & 7) << 5) + 31), -4};
    }

    /* renamed from: getAudioOutSaveFilePath */
    public static java.lang.String m96887x71788c(java.lang.String str, int i17, java.lang.String str2) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf <= 0) {
            return str + "_" + str2 + "_" + i17;
        }
        return str.substring(0, lastIndexOf) + "_" + str2 + "_" + i17 + str.substring(lastIndexOf);
    }

    /* renamed from: isValidFile */
    private static boolean m96888x40add8e(java.io.File file) {
        return file.createNewFile() || (file.exists() && file.isFile());
    }

    /* renamed from: mergeAllFiles */
    public static boolean m96889x1ae87dae(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d("EncoderUtils", "mergeAllFiles " + i17 + " sessionId = " + str2);
        try {
            java.io.File file = new java.io.File(str);
            file.delete();
            if (!m96888x40add8e(file)) {
                return false;
            }
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            for (int i18 = 1; i18 <= i17; i18++) {
                randomAccessFile.write(m96890x5f8963fc(m96887x71788c(str, i18, str2)));
            }
            m96884x5a5ddf8(randomAccessFile);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: readFromFile */
    private static byte[] m96890x5f8963fc(java.lang.String str) {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            return bArr;
        } finally {
            m96884x5a5ddf8(fileInputStream);
        }
    }
}
