package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr;

/* renamed from: com.tencent.wevision2.modules.ocr.Certificate */
/* loaded from: classes14.dex */
public class C27758xd7c8e977 {

    /* renamed from: DEFECT_BLUR */
    public static final int f60674x5be4e275 = 8;

    /* renamed from: DEFECT_IMCOMPLETED */
    public static final int f60675x574c7fb9 = 1;

    /* renamed from: DEFECT_OCCLUDED */
    public static final int f60676x8c87b539 = 2;

    /* renamed from: DEFECT_REFLECTION */
    public static final int f60677xab234fb9 = 4;

    /* renamed from: FACE_BACK */
    public static final int f60678x3e3c5989 = 2;

    /* renamed from: FACE_FRONT */
    public static final int f60679x898f1da7 = 1;

    /* renamed from: FACE_UNKNOWN */
    public static final int f60680x74b00048 = 0;

    /* renamed from: PITCH_STATE_BACK */
    public static final int f60681x22205e74 = 4;

    /* renamed from: PITCH_STATE_BAD */
    public static final int f60682x74b6b8b8 = 0;

    /* renamed from: PITCH_STATE_FRONT */
    public static final int f60683x222bb61c = 3;

    /* renamed from: PITCH_STATE_HORIZONTAL */
    public static final int f60684xac22bbf1 = 2;

    /* renamed from: PITCH_STATE_NOT_HORIZONTAL */
    public static final int f60685xa13d167d = 1;

    /* renamed from: TYPE_IDCARD */
    public static final int f60686x3f863750 = 0;

    /* renamed from: TYPE_PASSPORT */
    public static final int f60687xcb95a777 = 1;
    public android.graphics.PointF[] box;

    /* renamed from: contours */
    public android.graphics.PointF[] f60688xde3400d9;

    /* renamed from: defects */
    public int f60689x5c156522;

    /* renamed from: face */
    public int f60690x2fd65d;

    /* renamed from: occludedPixels */
    public int f60691xba99a0b8;

    /* renamed from: reflectionPixels */
    public int f60692xf71e4ab8;

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27758xd7c8e977(int i17, int i18, int i19, int i27, android.graphics.PointF[] pointFArr, android.graphics.PointF[] pointFArr2) {
        this.f60689x5c156522 = i17;
        this.f60691xba99a0b8 = i18;
        this.f60692xf71e4ab8 = i19;
        this.f60690x2fd65d = i27;
        this.box = pointFArr;
        this.f60688xde3400d9 = pointFArr2;
    }

    /* renamed from: getPitchState */
    public native int m119889xdbc4d127(double d17, double d18, double d19);
}
