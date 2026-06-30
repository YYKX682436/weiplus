package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.Tile */
/* loaded from: classes13.dex */
public final class C26087x27c6ce {

    /* renamed from: EMPTY_TILE */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce f49783xdf8baa80 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce(-1, -1, m99990xb5c7884f());

    /* renamed from: mData */
    public final byte[] f49784x62065b7;

    /* renamed from: mHeight */
    public final int f49785x6a4b7f4;

    /* renamed from: mWidth */
    public final int f49786xbefb7959;

    public C26087x27c6ce(int i17, int i18, byte[] bArr) {
        this.f49786xbefb7959 = i17;
        this.f49785x6a4b7f4 = i18;
        this.f49784x62065b7 = bArr;
    }

    /* renamed from: getNoTileData */
    private static byte[] m99990xb5c7884f() {
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(256, 256, android.graphics.Bitmap.Config.ARGB_8888);
        new android.graphics.Canvas(createBitmap).drawARGB(0, 255, 255, 255);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        createBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: getData */
    public final byte[] m99991xfb7e5820() {
        return this.f49784x62065b7;
    }
}
