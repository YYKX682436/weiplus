package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* renamed from: com.tencent.mm.plugin.gif.MMGIFException */
/* loaded from: classes12.dex */
public class C16078xe0714eab extends java.io.IOException {

    /* renamed from: D_GIF_ERR_CLOSE_FAILED */
    public static final int f36995x3378e994 = 110;

    /* renamed from: D_GIF_ERR_DATA_TOO_BIG */
    public static final int f36996x851b0cd0 = 108;

    /* renamed from: D_GIF_ERR_EOF_TOO_SOON */
    public static final int f36997x36ff6a79 = 113;

    /* renamed from: D_GIF_ERR_IMAGE_DEFECT */
    public static final int f36998xa41b4e05 = 112;

    /* renamed from: D_GIF_ERR_NOT_ENOUGH_MEM */
    public static final int f36999xc6ebf082 = 109;

    /* renamed from: D_GIF_ERR_NOT_GIF_FILE */
    public static final int f37000x450c2253 = 103;

    /* renamed from: D_GIF_ERR_NOT_READABLE */
    public static final int f37001xde190d0c = 111;

    /* renamed from: D_GIF_ERR_NO_COLOR_MAP */
    public static final int f37002x7923ca52 = 106;

    /* renamed from: D_GIF_ERR_NO_IMAG_DSCR */
    public static final int f37003xd01bbc25 = 105;

    /* renamed from: D_GIF_ERR_NO_SCRN_DSCR */
    public static final int f37004x1b382d23 = 104;

    /* renamed from: D_GIF_ERR_OPEN_FAILED */
    public static final int f37005xfe5eb0c2 = 101;

    /* renamed from: D_GIF_ERR_READ_FAILED */
    public static final int f37006xde076ff6 = 102;

    /* renamed from: D_GIF_ERR_WRONG_RECORD */
    public static final int f37007x49d20c53 = 107;
    private static final java.lang.String TAG = "MicroMsg.GIF.MMGIFException";

    /* renamed from: serialVersionUID */
    private static final long f37008x3a3ed56c = 1;

    /* renamed from: errorCode */
    private final int f37009x139cb015;

    public C16078xe0714eab(int i17) {
        super(TAG + i17);
        this.f37009x139cb015 = i17;
    }

    /* renamed from: getErrorCode */
    public int m64939x130a215f() {
        return this.f37009x139cb015;
    }
}
