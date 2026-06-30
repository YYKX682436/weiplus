package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.ADTSUtils */
/* loaded from: classes7.dex */
public class C25751x2b41e7ef {
    /* renamed from: getADTSCodecSpecificData */
    public static java.nio.ByteBuffer m97318xaf56c3da(int i17, int i18, int i19) {
        int m97319xf8d8de84 = m97319xf8d8de84(i18);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(2);
        allocate.put(0, (byte) ((i17 << 3) | (m97319xf8d8de84 >> 1)));
        allocate.put(1, (byte) (((m97319xf8d8de84 << 7) & 128) | (i19 << 3)));
        allocate.flip();
        return allocate;
    }

    /* renamed from: getFreqIndex */
    public static int m97319xf8d8de84(int i17) {
        switch (i17) {
            case 7350:
                return 12;
            case 8000:
                return 11;
            case 11025:
                return 10;
            case 12000:
                return 9;
            case 16000:
            default:
                return 8;
            case 22050:
                return 7;
            case 24000:
                return 6;
            case 32000:
                return 5;
            case 44100:
                return 4;
            case 48000:
                return 3;
            case 64000:
                return 2;
            case 88200:
                return 1;
            case 96000:
                return 0;
        }
    }
}
