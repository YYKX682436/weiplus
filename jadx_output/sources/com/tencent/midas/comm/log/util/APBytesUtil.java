package com.tencent.midas.comm.log.util;

/* loaded from: classes13.dex */
public class APBytesUtil {
    public static byte[] int2bytes(int i17) {
        return new byte[]{(byte) (i17 >> 24), (byte) (i17 >> 16), (byte) (i17 >> 8), (byte) i17};
    }
}
