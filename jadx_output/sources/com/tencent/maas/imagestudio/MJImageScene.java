package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class MJImageScene {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f48072a;
    private final com.facebook.jni.HybridData mHybridData;

    public MJImageScene(com.facebook.jni.HybridData hybridData, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager) {
        this.mHybridData = hybridData;
        this.f48072a = nativeCallbackManager;
    }

    private native java.lang.String nativeAddEmoticonLayer(java.lang.String str, int i17, int i18);

    private native java.lang.String nativeAddTextLayer(java.lang.String str);

    private native java.lang.String nativeAddWhenWhereLayer(java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetCreationTime();

    private native java.lang.String nativeGetFilterID();

    private native float nativeGetFilterIntensity();

    private native java.lang.String nativeGetFilterOptions();

    private native com.tencent.maas.imagestudio.MJImageCropDesc nativeGetImageCropDesc();

    private native com.tencent.maas.imagestudio.MJImageLayer nativeGetImageLayer(java.lang.String str);

    private native java.lang.Object[] nativeGetImageLayers();

    private native int nativeGetLivePhotoUsage();

    private native com.tencent.maas.model.MJLocation nativeGetLocation();

    private native com.tencent.maas.model.time.MJTime nativeGetModificationTime();

    private native com.tencent.maas.base.Vec2 nativeGetPointSize();

    private native java.lang.String nativeGetSceneID();

    private native boolean nativeIsFilterAdjusted();

    private native boolean nativeIsFilterEnabled();

    private native boolean nativeIsLivePhoto();

    private native boolean nativeIsModified();

    private native boolean nativeRemoveLayer(java.lang.String str);

    private native void nativeSaveSnapshot(java.lang.String str, int i17, int i18);

    private native void nativeSetFilterEnabled(boolean z17);

    private native void nativeSetFilterID(java.lang.String str);

    private native void nativeSetFilterIntensity(float f17);

    private native void nativeSetFilterOptions(java.lang.String str);

    private native void nativeSetLivePhotoUsage(int i17);

    private native boolean nativeUpdateAspectRatio(com.tencent.maas.moviecomposing.AspectRatio aspectRatio);

    private native boolean nativeUpdateCropRegion(com.tencent.maas.base.Rect2 rect2);

    public java.lang.String a(java.lang.String str, int i17, int i18) {
        return nativeAddEmoticonLayer(str, i17, i18);
    }

    public java.lang.String b(java.lang.String str) {
        return nativeAddTextLayer(str);
    }

    public java.lang.String c(java.lang.String str) {
        return nativeAddWhenWhereLayer(str);
    }

    public com.tencent.maas.imagestudio.MJImageLayer d(java.lang.String str) {
        return nativeGetImageLayer(str);
    }

    public boolean e(java.lang.String str) {
        return nativeRemoveLayer(str);
    }

    public void f(java.lang.String str, com.tencent.maas.imagestudio.c cVar, com.tencent.maas.imagestudio.e eVar) {
        nativeSaveSnapshot(str, cVar.f48091d, this.f48072a.registerCallback(new com.tencent.maas.imagestudio.f(this, eVar)));
    }

    public com.tencent.maas.model.time.MJTime getCreationTime() {
        return nativeGetCreationTime();
    }

    public java.lang.String getFilterID() {
        return nativeGetFilterID();
    }

    public float getFilterIntensity() {
        return nativeGetFilterIntensity();
    }

    public java.lang.String getFilterOptions() {
        return nativeGetFilterOptions();
    }

    public com.tencent.maas.imagestudio.MJImageCropDesc getImageCropDesc() {
        return nativeGetImageCropDesc();
    }

    public com.tencent.maas.imagestudio.MJImageLayer[] getImageLayers() {
        java.lang.Object[] nativeGetImageLayers = nativeGetImageLayers();
        return (com.tencent.maas.imagestudio.MJImageLayer[]) java.util.Arrays.copyOf(nativeGetImageLayers, nativeGetImageLayers.length, com.tencent.maas.imagestudio.MJImageLayer[].class);
    }

    public com.tencent.maas.imagestudio.d getLivePhotoUsage() {
        int nativeGetLivePhotoUsage = nativeGetLivePhotoUsage();
        com.tencent.maas.imagestudio.d dVar = com.tencent.maas.imagestudio.d.None;
        return nativeGetLivePhotoUsage != 0 ? nativeGetLivePhotoUsage != 1 ? nativeGetLivePhotoUsage != 2 ? nativeGetLivePhotoUsage != 3 ? dVar : com.tencent.maas.imagestudio.d.Both : com.tencent.maas.imagestudio.d.Video : com.tencent.maas.imagestudio.d.Photo : dVar;
    }

    public com.tencent.maas.model.MJLocation getLocation() {
        return nativeGetLocation();
    }

    public com.tencent.maas.model.time.MJTime getModificationTime() {
        return nativeGetModificationTime();
    }

    public com.tencent.maas.base.Vec2 getPointSize() {
        return nativeGetPointSize();
    }

    public java.lang.String getSceneID() {
        return nativeGetSceneID();
    }

    public boolean isFilterAdjusted() {
        return nativeIsFilterAdjusted();
    }

    public boolean isFilterEnabled() {
        return nativeIsFilterEnabled();
    }

    public boolean isLivePhoto() {
        return nativeIsLivePhoto();
    }

    public boolean isModified() {
        return nativeIsModified();
    }
}
