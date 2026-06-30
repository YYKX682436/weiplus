package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.flac.BytesUtil */
/* loaded from: classes15.dex */
public class C25411xfe3c16ed {
    /* renamed from: from */
    public static int m94160x3017aa(byte[] bArr) {
        if (bArr.length > 4) {
            throw new java.lang.RuntimeException("bytes can't be greater than 32 bit!");
        }
        if (bArr.length == 3) {
            return (bArr[2] & 255) | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
        }
        if (bArr.length == 2) {
            return (bArr[1] & 15) | ((bArr[0] & 255) << 8);
        }
        if (bArr.length == 1) {
            return bArr[0] & 255;
        }
        throw new java.lang.RuntimeException("bytes must be greater than 8 bit!");
    }
}
