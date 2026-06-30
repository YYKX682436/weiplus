package com.davemorrissey.labs.subscaleview.decoder;

/* loaded from: classes12.dex */
public class ImageDecodeResult {
    public static final int DECODE_BITMAP_FAILED = 2;
    public static final int DECODE_BITMAP_OOM_ERROR = 3;
    public static final int DECODE_COPY_BITMAP_OOM_ERROR = 7;
    public static final int DECODE_FILE_NOT_FOUND = 1;
    public static final int DECODE_TILE_FAILED = 5;
    public static final int DECODE_TILE_INIT_FAILED = 4;
    public static final int DECODE_TILE_OOM_ERROR = 6;
    public static final int OK = 0;
    public int errCode;
    public java.lang.String errMsg;

    public ImageDecodeResult(int i17, java.lang.String str) {
        this.errCode = i17;
        this.errMsg = str;
    }

    public java.lang.String toString() {
        return java.lang.String.format("ImageDecodeResult{errCode: %d, errMsg: %s}", java.lang.Integer.valueOf(this.errCode), this.errMsg);
    }
}
