package com.tencent.mapsdk.engine.jni.models;

/* loaded from: classes13.dex */
public class TappedElement {
    private static final int BUILDING_ID_LENGTH = 128;
    private static final int BUILDING_NAME_LENGTH = 68;
    private static final int FLOOR_NAME_LENGTH = 32;
    private static final int POI_ID_LENGTH = 64;
    public static final int TYPE_ANNO = 1;
    public static final int TYPE_ANNO_INDOOR_MAP = 1;
    public static final int TYPE_BLOCKROUTE_ANNO = 7;
    public static final int TYPE_COMPASS = 3;
    public static final int TYPE_INDOORMAP_AREA = 8;
    public static final int TYPE_LINE = 5;
    public static final int TYPE_LOCATION_MARKER = 6;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_OVERLAY_ITEM = 4;
    public java.lang.String buildingId;
    public java.lang.String buildingName;
    public java.lang.String floorName;
    public long itemId;
    public int itemType;
    public java.lang.String name;
    public int nameLen;
    public int pixelX;
    public int pixelY;
    public java.lang.String poiId;
    public int type;

    private TappedElement() {
    }

    public static com.tencent.mapsdk.engine.jni.models.TappedElement fromBytes(byte[] bArr) {
        com.tencent.mapsdk.engine.jni.models.TappedElement tappedElement = new com.tencent.mapsdk.engine.jni.models.TappedElement();
        byte[] bArr2 = new byte[4];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
        tappedElement.type = com.tencent.mapsdk.internal.mt.a(bArr2);
        java.lang.System.arraycopy(bArr, 4, bArr2, 0, 4);
        tappedElement.pixelX = com.tencent.mapsdk.internal.mt.a(bArr2);
        java.lang.System.arraycopy(bArr, 8, bArr2, 0, 4);
        tappedElement.pixelY = com.tencent.mapsdk.internal.mt.a(bArr2);
        java.lang.System.arraycopy(bArr, 12, bArr2, 0, 4);
        tappedElement.itemType = com.tencent.mapsdk.internal.mt.a(bArr2);
        java.lang.System.arraycopy(bArr, 16, bArr2, 0, 4);
        tappedElement.nameLen = com.tencent.mapsdk.internal.mt.a(bArr2);
        int i17 = 20;
        if (tappedElement.type != 7) {
            byte[] bArr3 = new byte[64];
            java.lang.System.arraycopy(bArr, 20, bArr3, 0, 64);
            if (tappedElement.type != 8) {
                tappedElement.name = com.tencent.mapsdk.internal.mt.b(bArr3);
            } else {
                tappedElement.name = com.tencent.mapsdk.internal.mt.a(bArr3, com.tencent.mapsdk.internal.rv.f51270c);
            }
            i17 = 84;
        }
        java.lang.System.arraycopy(bArr, i17, bArr2, 0, 4);
        int a17 = com.tencent.mapsdk.internal.mt.a(bArr2);
        int i18 = i17 + 4;
        java.lang.System.arraycopy(bArr, i18, bArr2, 0, 4);
        tappedElement.itemId = (a17 << 32) + com.tencent.mapsdk.internal.mt.a(bArr2);
        int i19 = i18 + 4;
        byte[] bArr4 = new byte[64];
        java.lang.System.arraycopy(bArr, i19, bArr4, 0, 64);
        tappedElement.poiId = java.lang.String.valueOf(com.tencent.mapsdk.internal.mt.a(bArr4, com.tencent.mapsdk.internal.rv.f51270c));
        int i27 = i19 + 64;
        if (tappedElement.itemType == 1) {
            byte[] bArr5 = new byte[128];
            java.lang.System.arraycopy(bArr, i27, bArr5, 0, 128);
            int i28 = i27 + 128;
            tappedElement.buildingId = com.tencent.mapsdk.internal.mt.a(bArr5, com.tencent.mapsdk.internal.rv.f51270c);
            byte[] bArr6 = new byte[68];
            java.lang.System.arraycopy(bArr, i28, bArr6, 0, 68);
            tappedElement.buildingName = com.tencent.mapsdk.internal.mt.b(bArr6);
            byte[] bArr7 = new byte[32];
            java.lang.System.arraycopy(bArr, i28 + 68, bArr7, 0, 32);
            tappedElement.floorName = com.tencent.mapsdk.internal.mt.a(bArr7, com.tencent.mapsdk.internal.rv.f51270c);
        }
        return tappedElement;
    }
}
