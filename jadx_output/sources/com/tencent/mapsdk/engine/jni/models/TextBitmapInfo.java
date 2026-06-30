package com.tencent.mapsdk.engine.jni.models;

/* loaded from: classes13.dex */
public class TextBitmapInfo {
    public float density;
    public int height;
    byte[] mData = new byte[4];
    public int pitch;
    public int weight;
    public int width;

    public void fill(byte[] bArr) {
        java.util.Arrays.fill(this.mData, (byte) 0);
        java.lang.System.arraycopy(bArr, 0, this.mData, 0, 4);
        this.density = java.lang.Float.intBitsToFloat(com.tencent.mapsdk.internal.mt.a(this.mData));
        java.lang.System.arraycopy(bArr, 4, this.mData, 0, 4);
        this.width = com.tencent.mapsdk.internal.mt.a(this.mData);
        java.lang.System.arraycopy(bArr, 8, this.mData, 0, 4);
        this.height = com.tencent.mapsdk.internal.mt.a(this.mData);
        java.lang.System.arraycopy(bArr, 12, this.mData, 0, 4);
        this.pitch = com.tencent.mapsdk.internal.mt.a(this.mData);
        java.lang.System.arraycopy(bArr, 16, this.mData, 0, 4);
        this.weight = com.tencent.mapsdk.internal.mt.a(this.mData);
    }
}
