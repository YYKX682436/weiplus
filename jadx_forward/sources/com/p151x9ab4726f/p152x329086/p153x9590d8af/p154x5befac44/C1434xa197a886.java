package com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44;

/* renamed from: com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult */
/* loaded from: classes12.dex */
public class C1434xa197a886 {

    /* renamed from: DECODE_BITMAP_FAILED */
    public static final int f4416x7d9c9cbc = 2;

    /* renamed from: DECODE_BITMAP_OOM_ERROR */
    public static final int f4417x6ce850b7 = 3;

    /* renamed from: DECODE_COPY_BITMAP_OOM_ERROR */
    public static final int f4418x1a30e7f = 7;

    /* renamed from: DECODE_FILE_NOT_FOUND */
    public static final int f4419xea5aea44 = 1;

    /* renamed from: DECODE_TILE_FAILED */
    public static final int f4420x8029ea1d = 5;

    /* renamed from: DECODE_TILE_INIT_FAILED */
    public static final int f4421x7ce9206c = 4;

    /* renamed from: DECODE_TILE_OOM_ERROR */
    public static final int f4422x6667fbb6 = 6;
    public static final int OK = 0;

    /* renamed from: errCode */
    public int f4423xa7c470f2;

    /* renamed from: errMsg */
    public java.lang.String f4424xb2d4efdc;

    public C1434xa197a886(int i17, java.lang.String str) {
        this.f4423xa7c470f2 = i17;
        this.f4424xb2d4efdc = str;
    }

    /* renamed from: toString */
    public java.lang.String m15468x9616526c() {
        return java.lang.String.format("ImageDecodeResult{errCode: %d, errMsg: %s}", java.lang.Integer.valueOf(this.f4423xa7c470f2), this.f4424xb2d4efdc);
    }
}
