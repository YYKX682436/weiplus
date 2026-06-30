package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageLayer {
    private final com.facebook.jni.HybridData mHybridData;

    private MJImageLayer(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native int nativeGetAnimatedImageEncoderType();

    private native java.lang.String nativeGetAnimatedImageFilePath();

    private native int nativeGetDateTimeDisplayOptions();

    private native com.tencent.maas.moviecomposing.segments.GeographicInfo nativeGetGeoInfo();

    private native java.lang.String nativeGetLayerID();

    private native com.tencent.maas.base.Vec2 nativeGetLayerPosition();

    private native float nativeGetLayerRotation();

    private native float nativeGetLayerScale();

    private native int nativeGetLayerType();

    private native java.lang.String nativeGetMaterialID();

    private native java.lang.String nativeGetPlaceholder();

    private native java.lang.String nativeGetSubtitle();

    private native long nativeGetTimestamp();

    private native int nativeGetTimingFillMode();

    private native java.lang.String nativeGetTitle();

    private native boolean nativeIsDisplayingDateTime();

    private native boolean nativeIsDisplayingLocation();

    private native boolean nativeReplaceEmoticonWithFilePath(java.lang.String str, int i17, int i18);

    private native boolean nativeUpdateLayerPosition(com.tencent.maas.base.Vec2 vec2);

    private native boolean nativeUpdateLayerRotation(float f17);

    private native boolean nativeUpdateLayerScale(float f17);

    private native boolean nativeUpdateLocationWithGeoInfo(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo);

    private native boolean nativeUpdateStyleWithMaterialID(java.lang.String str);

    private native boolean nativeUpdateSubtitle(java.lang.String str);

    private native boolean nativeUpdateTimestampWithDate(long j17);

    private native boolean nativeUpdateTitle(java.lang.String str);

    public boolean a(com.tencent.maas.base.Vec2 vec2) {
        return nativeUpdateLayerPosition(vec2);
    }

    public boolean b(float f17) {
        return nativeUpdateLayerRotation(f17);
    }

    public boolean c(float f17) {
        return nativeUpdateLayerScale(f17);
    }

    public boolean d(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo) {
        return nativeUpdateLocationWithGeoInfo(geographicInfo);
    }

    public boolean e(java.lang.String str) {
        return nativeUpdateStyleWithMaterialID(str);
    }

    public boolean f(long j17) {
        return nativeUpdateTimestampWithDate(j17);
    }

    public boolean g(java.lang.String str) {
        return nativeUpdateTitle(str);
    }

    public com.tencent.maas.moviecomposing.b getAnimatedImageEncoderType() {
        int nativeGetAnimatedImageEncoderType = nativeGetAnimatedImageEncoderType();
        for (com.tencent.maas.moviecomposing.b bVar : com.tencent.maas.moviecomposing.b.values()) {
            if (bVar.f48463d == nativeGetAnimatedImageEncoderType) {
                return bVar;
            }
        }
        return com.tencent.maas.moviecomposing.b.Platform;
    }

    public java.lang.String getAnimatedImageFilePath() {
        return nativeGetAnimatedImageFilePath();
    }

    public com.tencent.maas.moviecomposing.e getDateTimeDisplayOptions() {
        int nativeGetDateTimeDisplayOptions = nativeGetDateTimeDisplayOptions();
        return new com.tencent.maas.moviecomposing.e((nativeGetDateTimeDisplayOptions & 1) != 0, (nativeGetDateTimeDisplayOptions & 2) != 0, (nativeGetDateTimeDisplayOptions & 4) != 0, (nativeGetDateTimeDisplayOptions & 8) != 0, (nativeGetDateTimeDisplayOptions & 16) != 0, (nativeGetDateTimeDisplayOptions & 32) != 0);
    }

    public com.tencent.maas.moviecomposing.segments.GeographicInfo getGeoInfo() {
        return nativeGetGeoInfo();
    }

    public java.lang.String getLayerID() {
        return nativeGetLayerID();
    }

    public com.tencent.maas.base.Vec2 getLayerPosition() {
        return nativeGetLayerPosition();
    }

    public float getLayerRotation() {
        return nativeGetLayerRotation();
    }

    public float getLayerScale() {
        return nativeGetLayerScale();
    }

    public com.tencent.maas.imagestudio.b getLayerType() {
        int nativeGetLayerType = nativeGetLayerType();
        com.tencent.maas.imagestudio.b bVar = com.tencent.maas.imagestudio.b.None;
        return nativeGetLayerType != 0 ? nativeGetLayerType != 1 ? nativeGetLayerType != 2 ? nativeGetLayerType != 3 ? nativeGetLayerType != 4 ? bVar : com.tencent.maas.imagestudio.b.WhenWhere : com.tencent.maas.imagestudio.b.Sticker : com.tencent.maas.imagestudio.b.Emoticon : com.tencent.maas.imagestudio.b.Text : bVar;
    }

    public java.lang.String getMaterialID() {
        return nativeGetMaterialID();
    }

    public java.lang.String getPlaceholder() {
        return nativeGetPlaceholder();
    }

    public java.lang.String getSubtitle() {
        return nativeGetSubtitle();
    }

    public long getTimestamp() {
        return nativeGetTimestamp();
    }

    public sg.c getTimingFillMode() {
        int nativeGetTimingFillMode = nativeGetTimingFillMode();
        for (sg.c cVar : sg.c.values()) {
            if (cVar.f407662d == nativeGetTimingFillMode) {
                return cVar;
            }
        }
        return sg.c.None;
    }

    public java.lang.String getTitle() {
        return nativeGetTitle();
    }

    public boolean isDisplayingDateTime() {
        return nativeIsDisplayingDateTime();
    }

    public boolean isDisplayingLocation() {
        return nativeIsDisplayingLocation();
    }
}
