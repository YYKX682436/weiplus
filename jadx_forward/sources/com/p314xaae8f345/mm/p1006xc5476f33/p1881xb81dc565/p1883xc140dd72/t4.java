package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public abstract class t4 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements android.view.TextureView.SurfaceTextureListener {
    public static int[] E(byte[] bArr, int i17) {
        if (i17 == 0) {
            return null;
        }
        int i18 = i17 / 4;
        int[] iArr = new int[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            int i27 = i19 * 4;
            byte b17 = bArr[i27];
            int i28 = (((b17 >> 4) & 15) * 16) + (b17 & 15);
            byte b18 = bArr[i27 + 1];
            int i29 = (((b18 >> 4) & 15) * 16) + (b18 & 15);
            byte b19 = bArr[i27 + 2];
            int i37 = (((b19 >> 4) & 15) * 16) + (b19 & 15);
            byte b27 = bArr[i27 + 3];
            iArr[i19] = (((((b27 >> 4) & 15) * 16) + (b27 & 15)) << 24) | (i37 << 16) | (i29 << 8) | i28;
        }
        return iArr;
    }
}
