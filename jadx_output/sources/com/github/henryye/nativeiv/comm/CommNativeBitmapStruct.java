package com.github.henryye.nativeiv.comm;

/* loaded from: classes6.dex */
class CommNativeBitmapStruct extends com.github.henryye.nativeiv.bitmap.NativeBitmapStruct {
    private int nConfig = -1;
    private boolean premultiplyAlpha;

    public com.github.henryye.nativeiv.comm.CommNativeBitmapStruct convertToCommonStruct() {
        int i17 = this.nConfig;
        int i18 = 0;
        int i19 = com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE;
        if (i17 != 4 && i17 != 3 && i17 != 2) {
            i19 = 0;
        }
        this.glType = i19;
        if (i17 == 4) {
            i18 = com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA;
        } else if (i17 == 3) {
            i18 = com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB;
        } else if (i17 == 2) {
            i18 = com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_ALPHA;
        }
        this.glFormat = i18;
        return this;
    }
}
