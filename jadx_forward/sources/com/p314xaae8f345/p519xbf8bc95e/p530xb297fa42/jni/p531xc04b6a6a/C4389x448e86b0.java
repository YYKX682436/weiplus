package com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a;

/* renamed from: com.tencent.mapsdk.engine.jni.models.TappedElement */
/* loaded from: classes13.dex */
public class C4389x448e86b0 {

    /* renamed from: BUILDING_ID_LENGTH */
    private static final int f17353xc938eabf = 128;

    /* renamed from: BUILDING_NAME_LENGTH */
    private static final int f17354x8225ca0f = 68;

    /* renamed from: FLOOR_NAME_LENGTH */
    private static final int f17355xd877df47 = 32;

    /* renamed from: POI_ID_LENGTH */
    private static final int f17356xba0c2b5 = 64;

    /* renamed from: TYPE_ANNO */
    public static final int f17357xc6c76093 = 1;

    /* renamed from: TYPE_ANNO_INDOOR_MAP */
    public static final int f17358x9ce2ec7c = 1;

    /* renamed from: TYPE_BLOCKROUTE_ANNO */
    public static final int f17359x2c39bc2c = 7;

    /* renamed from: TYPE_COMPASS */
    public static final int f17360x87341ced = 3;

    /* renamed from: TYPE_INDOORMAP_AREA */
    public static final int f17361x5a0210a8 = 8;

    /* renamed from: TYPE_LINE */
    public static final int f17362xc6cc4dd9 = 5;

    /* renamed from: TYPE_LOCATION_MARKER */
    public static final int f17363x3716f8ff = 6;

    /* renamed from: TYPE_NONE */
    public static final int f17364xc6cd4d1d = 0;

    /* renamed from: TYPE_OVERLAY_ITEM */
    public static final int f17365xf852eaa7 = 4;

    /* renamed from: buildingId */
    public java.lang.String f17366xe4803eef;

    /* renamed from: buildingName */
    public java.lang.String f17367xc56e875f;

    /* renamed from: floorName */
    public java.lang.String f17368x99ec2cb7;

    /* renamed from: itemId */
    public long f17369xb9bf0b8e;

    /* renamed from: itemType */
    public int f17370x462fbced;

    /* renamed from: name */
    public java.lang.String f17371x337a8b;

    /* renamed from: nameLen */
    public int f17372x66a29f8a;

    /* renamed from: pixelX */
    public int f17373xc51e7e92;

    /* renamed from: pixelY */
    public int f17374xc51e7e93;

    /* renamed from: poiId */
    public java.lang.String f17375x65e5105;

    /* renamed from: type */
    public int f17376x368f3a;

    private C4389x448e86b0() {
    }

    /* renamed from: fromBytes */
    public static com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 m36379x338f2e1(byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 c4389x448e86b0 = new com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0();
        byte[] bArr2 = new byte[4];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
        c4389x448e86b0.f17376x368f3a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr2);
        java.lang.System.arraycopy(bArr, 4, bArr2, 0, 4);
        c4389x448e86b0.f17373xc51e7e92 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr2);
        java.lang.System.arraycopy(bArr, 8, bArr2, 0, 4);
        c4389x448e86b0.f17374xc51e7e93 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr2);
        java.lang.System.arraycopy(bArr, 12, bArr2, 0, 4);
        c4389x448e86b0.f17370x462fbced = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr2);
        java.lang.System.arraycopy(bArr, 16, bArr2, 0, 4);
        c4389x448e86b0.f17372x66a29f8a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr2);
        int i17 = 20;
        if (c4389x448e86b0.f17376x368f3a != 7) {
            byte[] bArr3 = new byte[64];
            java.lang.System.arraycopy(bArr, 20, bArr3, 0, 64);
            if (c4389x448e86b0.f17376x368f3a != 8) {
                c4389x448e86b0.f17371x337a8b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.b(bArr3);
            } else {
                c4389x448e86b0.f17371x337a8b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            }
            i17 = 84;
        }
        java.lang.System.arraycopy(bArr, i17, bArr2, 0, 4);
        int a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr2);
        int i18 = i17 + 4;
        java.lang.System.arraycopy(bArr, i18, bArr2, 0, 4);
        c4389x448e86b0.f17369xb9bf0b8e = (a17 << 32) + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr2);
        int i19 = i18 + 4;
        byte[] bArr4 = new byte[64];
        java.lang.System.arraycopy(bArr, i19, bArr4, 0, 64);
        c4389x448e86b0.f17375x65e5105 = java.lang.String.valueOf(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        int i27 = i19 + 64;
        if (c4389x448e86b0.f17370x462fbced == 1) {
            byte[] bArr5 = new byte[128];
            java.lang.System.arraycopy(bArr, i27, bArr5, 0, 128);
            int i28 = i27 + 128;
            c4389x448e86b0.f17366xe4803eef = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            byte[] bArr6 = new byte[68];
            java.lang.System.arraycopy(bArr, i28, bArr6, 0, 68);
            c4389x448e86b0.f17367xc56e875f = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.b(bArr6);
            byte[] bArr7 = new byte[32];
            java.lang.System.arraycopy(bArr, i28 + 68, bArr7, 0, 32);
            c4389x448e86b0.f17368x99ec2cb7 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(bArr7, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        }
        return c4389x448e86b0;
    }
}
